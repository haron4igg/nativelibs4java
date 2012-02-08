package com.nativelibs4java.directx.d3d10;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : d3d10.h:435</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d10") 
public class D3D10_MAPPED_TEXTURE2D extends StructObject {
	/// C type : void*
	@Field(0) 
	public Pointer<? > pData() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : void*
	@Field(0) 
	public D3D10_MAPPED_TEXTURE2D pData(Pointer<? > pData) {
		this.io.setPointerField(this, 0, pData);
		return this;
	}
	@Field(1) 
	public int RowPitch() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public D3D10_MAPPED_TEXTURE2D RowPitch(int RowPitch) {
		this.io.setIntField(this, 1, RowPitch);
		return this;
	}
}
