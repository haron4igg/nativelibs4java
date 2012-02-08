package com.nativelibs4java.mono.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class MonoDebugVarInfo extends com.ochafik.lang.jnaerator.runtime.Structure<MonoDebugVarInfo, MonoDebugVarInfo.ByValue, MonoDebugVarInfo.ByReference> {
	public int index;
	public int offset;
	public int size;
	public int begin_scope;
	public int end_scope;
	/// C type : MonoType*
	public com.nativelibs4java.mono.library.MonoType.ByReference type;
	public MonoDebugVarInfo() {
		super();
	}
	/// @param type C type : MonoType*
	public MonoDebugVarInfo(int index, int offset, int size, int begin_scope, int end_scope, com.nativelibs4java.mono.library.MonoType.ByReference type) {
		super();
		this.index = index;
		this.offset = offset;
		this.size = size;
		this.begin_scope = begin_scope;
		this.end_scope = end_scope;
		this.type = type;
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected MonoDebugVarInfo newInstance() { return new MonoDebugVarInfo(); }
	public static MonoDebugVarInfo[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Structure.newArray(MonoDebugVarInfo.class, arrayLength);
	}
	public static class ByReference extends MonoDebugVarInfo implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends MonoDebugVarInfo implements com.sun.jna.Structure.ByValue {}
}
