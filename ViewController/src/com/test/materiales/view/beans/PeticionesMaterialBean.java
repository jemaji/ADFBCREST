package com.test.materiales.view.beans;

import com.test.materiales.view.utils.ADFUtils;

import com.test.materiales.view.utils.JSFUtils;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.domain.BlobDomain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.io.Reader;

import java.io.Writer;

import java.sql.SQLException;

import java.util.Base64;

import javax.faces.event.ActionEvent;

import oracle.jbo.domain.ClobDomain;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class PeticionesMaterialBean {
    private UploadedFile _file;

    private RichPopup popUpConfirmation;

    public PeticionesMaterialBean() {
        super();
    }

    public void setPopUpConfirmation(RichPopup popUpConfirmation) {
        this.popUpConfirmation = popUpConfirmation;
    }

    public RichPopup getPopUpConfirmation() {
        return popUpConfirmation;
    }

    public String hidePopUpConfirmaton() {

        ADFUtils.findOperation("Delete").execute();

        ADFUtils.findOperation("Commit").execute();
        getPopUpConfirmation().hide();

        return null;
    }

    public String actionCommit() {
        ADFUtils.findIterator("Peticiones1Iterator").executeQuery();
        return null;
    }

    public void setFile(UploadedFile _file) {
        this._file = _file;
    }

    public UploadedFile getFile() {
        return _file;
    }

    /// UPLOAD FILE

    public String uploadAttach() {
        UploadedFile myfile = this.getFile();

        DCIteratorBinding iter = ADFUtils.findIterator("Peticiones1Iterator");

        Row row = iter.getCurrentRow();
        // Upload File into Blob Column
        row.setAttribute("AdjuntoBlob", createBlobDomain(myfile));
        row.setAttribute("AdjuntoClob", createClobDomain(myfile));

        // File Name
        String fileName = (String) myfile.getFilename();
        row.setAttribute("AdjuntoNombre", fileName);

        // File Content/MIME Type
        String fileContentType = (String) myfile.getContentType();
        row.setAttribute("AdjuntoExtension", fileContentType);

        //        //Commit Transaction
        //        OperationBinding method = bindings.getOperationBinding("Commit");
        //        method.execute();

        return null;
    }

    private BlobDomain createBlobDomain(UploadedFile file) {
        InputStream in = null;
        BlobDomain blobDomain = null;
        OutputStream out = null;
        try {
            in = file.getInputStream();
            blobDomain = new BlobDomain();
            out = blobDomain.getBinaryOutputStream();
            byte[] buffer = new byte[8192];
            int bytesRead = 0;
            while ((bytesRead = in.read(buffer, 0, 8192)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.fillInStackTrace();
        }
        return blobDomain;
    }

    private ClobDomain createClobDomain(UploadedFile file) {
        InputStream in = null;
        ClobDomain clobDomain = null;
        Writer out = null;
        try {
            in = file.getInputStream();
            clobDomain = new ClobDomain();
            out = clobDomain.getCharacterOutputStream();
            byte[] buffer = new byte[8192];
            int bytesRead = 0;
            while ((bytesRead = in.read(buffer, 0, 8192)) != -1) {
                out.write(new String(buffer), 0, bytesRead);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clobDomain;
    }

    public String getImageArray() {
        String imageArray = null;
        BlobDomain attribute = (BlobDomain) JSFUtils.resolveExpression("#{row.bindings.AdjuntoBlob.inputValue}");

        try {
            byte[] bytesEncoded = Base64.getEncoder().encode(attribute.getBytes(1L, (int) attribute.getLength()));
            imageArray = new String(bytesEncoded);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (attribute == null) {
                imageArray =
                    "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";
            }
        }
        return imageArray;
    }
}
