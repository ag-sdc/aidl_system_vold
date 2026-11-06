/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /tmp/test_vold -Iprebuilts/target/framework/system/vold/binder -Iframeworks/base/core/java prebuilts/target/framework/system/vold/binder/android/os/IVold.aidl prebuilts/target/framework/system/vold/binder/android/os/IVoldTaskListener.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/** {@hide} */
public interface IVoldTaskListener extends android.os.IInterface
{
  /** Default implementation for IVoldTaskListener. */
  public static class Default implements android.os.IVoldTaskListener
  {
    @Override public void onStatus(int status, android.os.PersistableBundle extras) throws android.os.RemoteException
    {
    }
    @Override public void onFinished(int status, android.os.PersistableBundle extras) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IVoldTaskListener
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IVoldTaskListener interface,
     * generating a proxy if needed.
     */
    public static android.os.IVoldTaskListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IVoldTaskListener))) {
        return ((android.os.IVoldTaskListener)iin);
      }
      return new android.os.IVoldTaskListener.Stub.Proxy(obj);
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
        case TRANSACTION_onStatus:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.PersistableBundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.PersistableBundle.CREATOR);
          this.onStatus(_arg0, _arg1);
          break;
        }
        case TRANSACTION_onFinished:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.PersistableBundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.PersistableBundle.CREATOR);
          this.onFinished(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IVoldTaskListener
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
      @Override public void onStatus(int status, android.os.PersistableBundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          _Parcel.writeTypedObject(_data, extras, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onFinished(int status, android.os.PersistableBundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          _Parcel.writeTypedObject(_data, extras, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    /** @hide */
    public static final java.lang.String DESCRIPTOR = "android.os.IVoldTaskListener";
    static final int TRANSACTION_onStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public void onStatus(int status, android.os.PersistableBundle extras) throws android.os.RemoteException;
  public void onFinished(int status, android.os.PersistableBundle extras) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
