package com.epam.task03.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TxtFileReader {
	private BufferedReader reader = null;
    private String line = " ";

    public TxtFileReader(){
        this(new File("src\\main\\resources", "Virgin_Atlantics_planes_db.txt"));
    }
    
    public TxtFileReader(File file){
        try{
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file)));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readNextLine(){
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getLine() {
    	return this.line;
    }
    
    public void changeFile(File file) {
    	try{
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file)));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public void close() {
    	try {
    		if(reader != null)
    			reader.close();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }
}
