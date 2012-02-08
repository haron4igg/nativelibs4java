package com.nativelibs4java.directx.d3d10;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.cpp.com.IID;
/**
 * <i>native declaration : d3d10.h:704</i><br>
 * Error: Conversion Error : uuid("9B7E4C00-342C-4106-A19F-4F2704F689F0") novtable struct ID3D10DeviceChild {<br>
 * 	/// Original signature : <code>void GetDevice(ID3D10Device**)</code><br>
 * 	virtual void GetDevice(ID3D10Device** ppDevice);<br>
 * 	/// Original signature : <code>int GetPrivateData(const GUID&, UINT*, void*)</code><br>
 * 	virtual int GetPrivateData(const GUID& guid, UINT* pDataSize, void* pData);<br>
 * 	/// Original signature : <code>int SetPrivateData(const GUID&, UINT, const void*)</code><br>
 * 	virtual int SetPrivateData(const GUID& guid, UINT DataSize, const void* pData);<br>
 * 	/// Original signature : <code>int SetPrivateDataInterface(const GUID&, const IUnknown*)</code><br>
 * 	virtual int SetPrivateDataInterface(const GUID& guid, const IUnknown* pData);<br>
 * } (Cannot find parent IUnknown of struct uuid("9B7E4C00-342C-4106-A19F-4F2704F689F0") novtable struct ID3D10DeviceChild {<br>
 * 	/// Original signature : <code>void GetDevice(ID3D10Device**)</code><br>
 * 	virtual void GetDevice(ID3D10Device** ppDevice);<br>
 * 	/// Original signature : <code>int GetPrivateData(const GUID&, UINT*, void*)</code><br>
 * 	virtual int GetPrivateData(const GUID& guid, UINT* pDataSize, void* pData);<br>
 * 	/// Original signature : <code>int SetPrivateData(const GUID&, UINT, const void*)</code><br>
 * 	virtual int SetPrivateData(const GUID& guid, UINT DataSize, const void* pData);<br>
 * 	/// Original signature : <code>int SetPrivateDataInterface(const GUID&, const IUnknown*)</code><br>
 * 	virtual int SetPrivateDataInterface(const GUID& guid, const IUnknown* pData);<br>
 * })<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@IID("6316BE88-54CD-4040-AB44-20461BC81F68") 
@Library("d3d10") 
public class ID3D10GeometryShader extends ID3D10DeviceChild {
}
