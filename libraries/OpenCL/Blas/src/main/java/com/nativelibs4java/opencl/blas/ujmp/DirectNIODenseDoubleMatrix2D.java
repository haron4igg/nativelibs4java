/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nativelibs4java.opencl.blas.ujmp;

import com.nativelibs4java.util.NIOUtils;
import java.nio.DoubleBuffer;
import org.ujmp.core.doublematrix.stub.AbstractDenseDoubleMatrix2D;
import org.ujmp.core.interfaces.Wrapper;

/**
 *
 * @author ochafik
 */
public class DirectNIODenseDoubleMatrix2D extends AbstractNIODenseDoubleMatrix2D implements Wrapper<DoubleBuffer> {

    DoubleBuffer data;

    public DirectNIODenseDoubleMatrix2D(DoubleBuffer data, long rows, long columns) {
        super(rows, columns);
        this.data = data;
    }

    public DirectNIODenseDoubleMatrix2D(long rows, long columns) {
        this(NIOUtils.directDoubles((int)(rows * columns)), rows, columns);
    }

    public DirectNIODenseDoubleMatrix2D(long[] size) {
        this(size[0], size[1]);
        if (size.length != 2)
            throw new IllegalArgumentException("Size is not 2D !");
    }

    public DoubleBuffer getData() {
        return data;
    }

    public DoubleBuffer getReadableData() {
        return getData();
    }


    public DoubleBuffer getWritableData() {
        return getData();
    }

    @Override
    public DoubleBuffer getWrappedObject() {
        return data;
    }

    @Override
    public void setWrappedObject(DoubleBuffer object) {
        this.data = object;
    }

}