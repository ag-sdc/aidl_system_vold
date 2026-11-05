/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/vold/aidl-gen/vold -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/vold/binder /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/vold/binder/android/os/IVoldMountCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/** {@hide} */
public interface IVoldMountCallback extends android.os.IInterface
{
  /** Default implementation for IVoldMountCallback. */
  public static class Default implements android.os.IVoldMountCallback
  {
    @Override public boolean onVolumeChecking(java.io.FileDescriptor fuseFd, java.lang.String path, java.lang.String internalPath) throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IVoldMountCallback
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IVoldMountCallback interface,
     * generating a proxy if needed.
     */
    public static android.os.IVoldMountCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IVoldMountCallback))) {
        return ((android.os.IVoldMountCallback)iin);
      }
      return new android.os.IVoldMountCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onVolumeChecking:
        {
          java.io.FileDescriptor _arg0;
          _arg0 = data.readRawFileDescriptor();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          boolean _result = this.onVolumeChecking(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IVoldMountCallback
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
      @Override public boolean onVolumeChecking(java.io.FileDescriptor fuseFd, java.lang.String path, java.lang.String internalPath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeRawFileDescriptor(fuseFd);
          _data.writeString(path);
          _data.writeString(internalPath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onVolumeChecking, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_onVolumeChecking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.os.IVoldMountCallback";
  public boolean onVolumeChecking(java.io.FileDescriptor fuseFd, java.lang.String path, java.lang.String internalPath) throws android.os.RemoteException;
}
