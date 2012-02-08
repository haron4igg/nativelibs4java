package com.nativelibs4java.mono.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class MonoRemoteClass extends com.ochafik.lang.jnaerator.runtime.Structure<MonoRemoteClass, MonoRemoteClass.ByValue, MonoRemoteClass.ByReference> {
	/// C type : MonoVTable*
	public com.nativelibs4java.mono.library.MonoLibrary.MonoVTable default_vtable;
	/// C type : MonoVTable*
	public com.nativelibs4java.mono.library.MonoLibrary.MonoVTable xdomain_vtable;
	/// C type : MonoClass*
	public com.nativelibs4java.mono.library.MonoLibrary.MonoClass proxy_class;
	/// C type : char*
	public com.sun.jna.Pointer proxy_class_name;
	/// C type : guint
	public int interface_count;
	/// C type : MonoClass*[1]
	public com.nativelibs4java.mono.library.MonoLibrary.MonoClass[] interfaces = new com.nativelibs4java.mono.library.MonoLibrary.MonoClass[(1)];
	public MonoRemoteClass() {
		super();
	}
	/**
	 * @param default_vtable C type : MonoVTable*<br>
	 * @param xdomain_vtable C type : MonoVTable*<br>
	 * @param proxy_class C type : MonoClass*<br>
	 * @param proxy_class_name C type : char*<br>
	 * @param interface_count C type : guint<br>
	 * @param interfaces C type : MonoClass*[1]
	 */
	public MonoRemoteClass(com.nativelibs4java.mono.library.MonoLibrary.MonoVTable default_vtable, com.nativelibs4java.mono.library.MonoLibrary.MonoVTable xdomain_vtable, com.nativelibs4java.mono.library.MonoLibrary.MonoClass proxy_class, com.sun.jna.Pointer proxy_class_name, int interface_count, com.nativelibs4java.mono.library.MonoLibrary.MonoClass interfaces[]) {
		super();
		this.default_vtable = default_vtable;
		this.xdomain_vtable = xdomain_vtable;
		this.proxy_class = proxy_class;
		this.proxy_class_name = proxy_class_name;
		this.interface_count = interface_count;
		if (interfaces.length != this.interfaces.length) 
			throw new java.lang.IllegalArgumentException("Wrong array size !");
		this.interfaces = interfaces;
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected MonoRemoteClass newInstance() { return new MonoRemoteClass(); }
	public static MonoRemoteClass[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Structure.newArray(MonoRemoteClass.class, arrayLength);
	}
	public static class ByReference extends MonoRemoteClass implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends MonoRemoteClass implements com.sun.jna.Structure.ByValue {}
}
