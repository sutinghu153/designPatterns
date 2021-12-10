package designPattern.VisitorMode;

import javax.security.auth.login.FailedLoginException;
import java.io.FileNotFoundException;

/**
 *  入口类
 * @data2021/9/23,12:48
 * @authorsutinghu
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
