/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite59cntt3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Folder extends AbstractFile{
    List<AbstractFile> file = new ArrayList<>();
    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile f) {
        file.add(f);
        f.path = this.path +"\\" +f.path;
        f.prefix=this.prefix +"..";
    }

    @Override
    public void remove(AbstractFile f) {
        if(file.contains(f))
        {
            file.remove(f);
            return;
        }
        for(AbstractFile abstractFile : file)
            abstractFile.remove(f);
    }

    @Override
    public String getTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for(AbstractFile f :file)
        {
            builder.append("\n").append(f.prefix).append(f.getTreeFolder());
        }
        return builder.toString();
    }
    
}
