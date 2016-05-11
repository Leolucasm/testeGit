/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali;

import java.io.FileInputStream;
import java.util.Properties;
import br.univali.VideoRecorder;
/**
 *
 * @author 5498465
 */
public class VideoRecorderFactory {
    

    public static VideoRecorder newVideoRecorderFactory() throws Exception {
        Properties prop = new Properties();   
        prop.load(new FileInputStream("config.properties"));
        String className = prop.getProperty("className");
        return (VideoRecorder)(Class.forName(className).newInstance());         
    }
    
}
