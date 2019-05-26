package br.com.ifood.cursoandroid.ifood.helper;

import android.net.Uri;

import java.io.Serializable;

public class FileInfo implements Serializable{

    String filename, downloadURL;

    public FileInfo(){
    }

    public FileInfo(String downloadURL, String filename) {
        this.downloadURL = downloadURL;
        this.filename = filename;
    }

    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}