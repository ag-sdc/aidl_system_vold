/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/vold/aidl-gen/vold -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/vold/binder /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/vold/binder/android/os/IVoldListener.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/** {@hide} */
public interface IVoldListener extends android.os.IInterface
{
  /** Default implementation for IVoldListener. */
  public static class Default implements android.os.IVoldListener
  {
    @Override public void onDiskCreated(java.lang.String diskId, int flags) throws android.os.RemoteException
    {
    }
    @Override public void onDiskScanned(java.lang.String diskId) throws android.os.RemoteException
    {
    }
    @Override public void onDiskMetadataChanged(java.lang.String diskId, long sizeBytes, java.lang.String label, java.lang.String sysPath) throws android.os.RemoteException
    {
    }
    @Override public void onDiskDestroyed(java.lang.String diskId) throws android.os.RemoteException
    {
    }
    @Override public void onVolumeCreated(java.lang.String volId, int type, java.lang.String diskId, java.lang.String partGuid, int userId) throws android.os.RemoteException
    {
    }
    @Override public void onVolumeStateChanged(java.lang.String volId, int state, int userId) throws android.os.RemoteException
    {
    }
    @Override public void onVolumeMetadataChanged(java.lang.String volId, java.lang.String fsType, java.lang.String fsUuid, java.lang.String fsLabel) throws android.os.RemoteException
    {
    }
    @Override public void onVolumePathChanged(java.lang.String volId, java.lang.String path) throws android.os.RemoteException
    {
    }
    @Override public void onVolumeInternalPathChanged(java.lang.String volId, java.lang.String internalPath) throws android.os.RemoteException
    {
    }
    @Override public void onVolumeDestroyed(java.lang.String volId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IVoldListener
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IVoldListener interface,
     * generating a proxy if needed.
     */
    public static android.os.IVoldListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IVoldListener))) {
        return ((android.os.IVoldListener)iin);
      }
      return new android.os.IVoldListener.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_onDiskCreated:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.onDiskCreated(_arg0, _arg1);
          break;
        }
        case TRANSACTION_onDiskScanned:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onDiskScanned(_arg0);
          break;
        }
        case TRANSACTION_onDiskMetadataChanged:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          long _arg1;
          _arg1 = data.readLong();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          this.onDiskMetadataChanged(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_onDiskDestroyed:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onDiskDestroyed(_arg0);
          break;
        }
        case TRANSACTION_onVolumeCreated:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _arg4;
          _arg4 = data.readInt();
          this.onVolumeCreated(_arg0, _arg1, _arg2, _arg3, _arg4);
          break;
        }
        case TRANSACTION_onVolumeStateChanged:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.onVolumeStateChanged(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_onVolumeMetadataChanged:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          this.onVolumeMetadataChanged(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_onVolumePathChanged:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onVolumePathChanged(_arg0, _arg1);
          break;
        }
        case TRANSACTION_onVolumeInternalPathChanged:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onVolumeInternalPathChanged(_arg0, _arg1);
          break;
        }
        case TRANSACTION_onVolumeDestroyed:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onVolumeDestroyed(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IVoldListener
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void onDiskCreated(java.lang.String diskId, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(diskId);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onDiskCreated, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onDiskScanned(java.lang.String diskId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(diskId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onDiskScanned, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onDiskMetadataChanged(java.lang.String diskId, long sizeBytes, java.lang.String label, java.lang.String sysPath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(diskId);
          _data.writeLong(sizeBytes);
          _data.writeString(label);
          _data.writeString(sysPath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onDiskMetadataChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onDiskDestroyed(java.lang.String diskId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(diskId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onDiskDestroyed, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onVolumeCreated(java.lang.String volId, int type, java.lang.String diskId, java.lang.String partGuid, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          _data.writeInt(type);
          _data.writeString(diskId);
          _data.writeString(partGuid);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onVolumeCreated, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onVolumeStateChanged(java.lang.String volId, int state, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          _data.writeInt(state);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onVolumeStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onVolumeMetadataChanged(java.lang.String volId, java.lang.String fsType, java.lang.String fsUuid, java.lang.String fsLabel) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          _data.writeString(fsType);
          _data.writeString(fsUuid);
          _data.writeString(fsLabel);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onVolumeMetadataChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onVolumePathChanged(java.lang.String volId, java.lang.String path) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          _data.writeString(path);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onVolumePathChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onVolumeInternalPathChanged(java.lang.String volId, java.lang.String internalPath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          _data.writeString(internalPath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onVolumeInternalPathChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onVolumeDestroyed(java.lang.String volId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onVolumeDestroyed, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    /** @hide */
    public static final java.lang.String DESCRIPTOR = "android.os.IVoldListener";
    static final int TRANSACTION_onDiskCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onDiskScanned = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onDiskMetadataChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onDiskDestroyed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onVolumeCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_onVolumeStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_onVolumeMetadataChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_onVolumePathChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_onVolumeInternalPathChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_onVolumeDestroyed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
  }
  public void onDiskCreated(java.lang.String diskId, int flags) throws android.os.RemoteException;
  public void onDiskScanned(java.lang.String diskId) throws android.os.RemoteException;
  public void onDiskMetadataChanged(java.lang.String diskId, long sizeBytes, java.lang.String label, java.lang.String sysPath) throws android.os.RemoteException;
  public void onDiskDestroyed(java.lang.String diskId) throws android.os.RemoteException;
  public void onVolumeCreated(java.lang.String volId, int type, java.lang.String diskId, java.lang.String partGuid, int userId) throws android.os.RemoteException;
  public void onVolumeStateChanged(java.lang.String volId, int state, int userId) throws android.os.RemoteException;
  public void onVolumeMetadataChanged(java.lang.String volId, java.lang.String fsType, java.lang.String fsUuid, java.lang.String fsLabel) throws android.os.RemoteException;
  public void onVolumePathChanged(java.lang.String volId, java.lang.String path) throws android.os.RemoteException;
  public void onVolumeInternalPathChanged(java.lang.String volId, java.lang.String internalPath) throws android.os.RemoteException;
  public void onVolumeDestroyed(java.lang.String volId) throws android.os.RemoteException;
}
