package com.nativelibs4java.directx.d3d10;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : d3d10.h:611</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d10") 
public class D3D10_TEX2DMS_RTV extends StructObject {
	@Field(0) 
	public int UnusedField_NothingToDefine() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public D3D10_TEX2DMS_RTV UnusedField_NothingToDefine(int UnusedField_NothingToDefine) {
		this.io.setIntField(this, 0, UnusedField_NothingToDefine);
		return this;
	}
}
