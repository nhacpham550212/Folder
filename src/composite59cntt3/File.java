/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite59cntt3;

/**
 *
 * @author Admin
 */
public class File  extends AbstractFile{

    public File(String name) {
        super(name);
    }
    
    @Override
    public void add(AbstractFile f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void remove(AbstractFile f) {
       throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getTreeFolder() {
        return this.name;
    }

  
}
