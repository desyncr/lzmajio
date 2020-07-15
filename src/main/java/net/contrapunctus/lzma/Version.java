// -*- java -*-
package net.contrapunctus.lzma;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Encapsulates version information about the library.
 */
public class Version
{
    /**
     * The major version number, incremented rarely to indicate large
     * changes.
     */
    public static final int major = 0;

    /**
     * The minor version number, incremented to indicate bug fixes or
     * other small changes.
     */
    public static final int minor = 95;

    /**
     * A unique string, representing this version in the code
     * repository.  Usually a combination of git tag and tree ID, as
     * produced by <tt>git describe</tt>.
     */
    public static final String context = "0.95-25-gbfea68b";

    /**
     * Small main program that prints the library version or, with any
     * argument, the context string.
     */
    public static void main( String[] args )
    {
        if( args.length > 0 ) System.out.println(context);
        else System.out.printf("lzmajio-%d.%d%n", major, minor);
    }
}
