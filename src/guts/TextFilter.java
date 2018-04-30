/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guts;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author mezo
 */
public class TextFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if(f.getAbsolutePath().endsWith(".txt")
        || f.getAbsolutePath().endsWith(".doc")
        || f.getAbsolutePath().endsWith(".docx")
        || f.getAbsolutePath().endsWith(".java")
        || f.getAbsolutePath().endsWith(".rtf")
        || f.isDirectory()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getDescription() {
      return "Text files";
    }
    
}
