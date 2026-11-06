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
public interface IVold extends android.os.IInterface
{
  /** Default implementation for IVold. */
  public static class Default implements android.os.IVold
  {
    @Override public void setListener(android.os.IVoldListener listener) throws android.os.RemoteException
    {
    }
    @Override public void abortFuse() throws android.os.RemoteException
    {
    }
    @Override public void monitor() throws android.os.RemoteException
    {
    }
    @Override public void reset() throws android.os.RemoteException
    {
    }
    @Override public void shutdown() throws android.os.RemoteException
    {
    }
    @Override public void onUserAdded(int userId, int userSerial, int sharesStorageWithUserId) throws android.os.RemoteException
    {
    }
    @Override public void onUserRemoved(int userId) throws android.os.RemoteException
    {
    }
    @Override public void onUserStarted(int userId) throws android.os.RemoteException
    {
    }
    @Override public void onUserStopped(int userId) throws android.os.RemoteException
    {
    }
    @Override public void addAppIds(java.lang.String[] packageNames, int[] appIds) throws android.os.RemoteException
    {
    }
    @Override public void addSandboxIds(int[] appIds, java.lang.String[] sandboxIds) throws android.os.RemoteException
    {
    }
    @Override public void onSecureKeyguardStateChanged(boolean isShowing) throws android.os.RemoteException
    {
    }
    @Override public void partition(java.lang.String diskId, int partitionType, int ratio) throws android.os.RemoteException
    {
    }
    @Override public void forgetPartition(java.lang.String partGuid, java.lang.String fsUuid) throws android.os.RemoteException
    {
    }
    @Override public void mount(java.lang.String volId, int mountFlags, int mountUserId, android.os.IVoldMountCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void unmount(java.lang.String volId) throws android.os.RemoteException
    {
    }
    @Override public void format(java.lang.String volId, java.lang.String fsType) throws android.os.RemoteException
    {
    }
    @Override public void benchmark(java.lang.String volId, android.os.IVoldTaskListener listener) throws android.os.RemoteException
    {
    }
    @Override public void moveStorage(java.lang.String fromVolId, java.lang.String toVolId, android.os.IVoldTaskListener listener) throws android.os.RemoteException
    {
    }
    @Override public void remountUid(int uid, int remountMode) throws android.os.RemoteException
    {
    }
    @Override public void remountAppStorageDirs(int uid, int pid, java.lang.String[] packageNames) throws android.os.RemoteException
    {
    }
    @Override public void unmountAppStorageDirs(int uid, int pid, java.lang.String[] packageNames) throws android.os.RemoteException
    {
    }
    @Override public void setupAppDir(java.lang.String path, int appUid) throws android.os.RemoteException
    {
    }
    @Override public void fixupAppDir(java.lang.String path, int appUid) throws android.os.RemoteException
    {
    }
    @Override public void ensureAppDirsCreated(java.lang.String[] paths, int appUid) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String createObb(java.lang.String sourcePath, int ownerGid) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void destroyObb(java.lang.String volId) throws android.os.RemoteException
    {
    }
    @Override public void fstrim(int fstrimFlags, android.os.IVoldTaskListener listener) throws android.os.RemoteException
    {
    }
    @Override public void runIdleMaint(boolean needGC, android.os.IVoldTaskListener listener) throws android.os.RemoteException
    {
    }
    @Override public void abortIdleMaint(android.os.IVoldTaskListener listener) throws android.os.RemoteException
    {
    }
    // Returns the amount of storage lifetime used, as a percentage.
    // (eg, 10 indicates 10% of lifetime used), or -1 on failure.
    @Override public int getStorageLifeTime() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void setGCUrgentPace(int neededSegments, int minSegmentThreshold, float dirtyReclaimRate, float reclaimWeight, int gcPeriod, int minGCSleepTime, int targetDirtyRatio) throws android.os.RemoteException
    {
    }
    @Override public void refreshLatestWrite() throws android.os.RemoteException
    {
    }
    @Override public int getWriteAmount() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public java.io.FileDescriptor mountAppFuse(int uid, int mountId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void unmountAppFuse(int uid, int mountId) throws android.os.RemoteException
    {
    }
    @Override public void fbeEnable() throws android.os.RemoteException
    {
    }
    @Override public void initUser0() throws android.os.RemoteException
    {
    }
    @Override public void mountFstab(java.lang.String blkDevice, java.lang.String mountPoint, java.lang.String zonedDevice) throws android.os.RemoteException
    {
    }
    @Override public void encryptFstab(java.lang.String blkDevice, java.lang.String mountPoint, boolean shouldFormat, java.lang.String fsType, java.lang.String zonedDevice) throws android.os.RemoteException
    {
    }
    @Override public void setStorageBindingSeed(byte[] seed) throws android.os.RemoteException
    {
    }
    @Override public void createUserStorageKeys(int userId, boolean ephemeral) throws android.os.RemoteException
    {
    }
    @Override public void destroyUserStorageKeys(int userId) throws android.os.RemoteException
    {
    }
    @Override public void setCeStorageProtection(int userId, java.lang.String secret) throws android.os.RemoteException
    {
    }
    @Override public int[] getUnlockedUsers() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void unlockCeStorage(int userId, java.lang.String secret) throws android.os.RemoteException
    {
    }
    @Override public void lockCeStorage(int userId) throws android.os.RemoteException
    {
    }
    @Override public void prepareUserStorage(java.lang.String uuid, int userId, int storageFlags) throws android.os.RemoteException
    {
    }
    @Override public void destroyUserStorage(java.lang.String uuid, int userId, int storageFlags) throws android.os.RemoteException
    {
    }
    @Override public void prepareSandboxForApp(java.lang.String packageName, int appId, java.lang.String sandboxId, int userId) throws android.os.RemoteException
    {
    }
    @Override public void destroySandboxForApp(java.lang.String packageName, java.lang.String sandboxId, int userId) throws android.os.RemoteException
    {
    }
    @Override public void startCheckpoint(int retry) throws android.os.RemoteException
    {
    }
    @Override public boolean needsCheckpoint() throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean needsRollback() throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean isCheckpointing() throws android.os.RemoteException
    {
      return false;
    }
    @Override public void abortChanges(java.lang.String device, boolean retry) throws android.os.RemoteException
    {
    }
    @Override public void commitChanges() throws android.os.RemoteException
    {
    }
    @Override public void prepareCheckpoint() throws android.os.RemoteException
    {
    }
    @Override public void restoreCheckpoint(java.lang.String device) throws android.os.RemoteException
    {
    }
    @Override public void restoreCheckpointPart(java.lang.String device, int count) throws android.os.RemoteException
    {
    }
    @Override public void markBootAttempt() throws android.os.RemoteException
    {
    }
    @Override public boolean supportsCheckpoint() throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean supportsBlockCheckpoint() throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean supportsFileCheckpoint() throws android.os.RemoteException
    {
      return false;
    }
    @Override public void resetCheckpoint() throws android.os.RemoteException
    {
    }
    @Override public void earlyBootEnded() throws android.os.RemoteException
    {
    }
    @Override public java.lang.String createStubVolume(java.lang.String sourcePath, java.lang.String mountPath, java.lang.String fsType, java.lang.String fsUuid, java.lang.String fsLabel, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void destroyStubVolume(java.lang.String volId) throws android.os.RemoteException
    {
    }
    @Override public java.io.FileDescriptor openAppFuseFile(int uid, int mountId, int fileId, int flags) throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean incFsEnabled() throws android.os.RemoteException
    {
      return false;
    }
    @Override public android.os.incremental.IncrementalFileSystemControlParcel mountIncFs(java.lang.String backingPath, java.lang.String targetDir, int flags, java.lang.String sysfsName) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void unmountIncFs(java.lang.String dir) throws android.os.RemoteException
    {
    }
    @Override public void setIncFsMountOptions(android.os.incremental.IncrementalFileSystemControlParcel control, boolean enableReadLogs, boolean enableReadTimeouts, java.lang.String sysfsName) throws android.os.RemoteException
    {
    }
    @Override public void bindMount(java.lang.String sourceDir, java.lang.String targetDir) throws android.os.RemoteException
    {
    }
    @Override public void destroyDsuMetadataKey(java.lang.String dsuSlot) throws android.os.RemoteException
    {
    }
    @Override public long getStorageSize() throws android.os.RemoteException
    {
      return 0L;
    }
    // Returns the remaining storage lifetime as a percentage, rounded up as
    // needed when the underlying hardware reports low precision. Returns -1
    // on failure.
    @Override public int getStorageRemainingLifetime() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IVold
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IVold interface,
     * generating a proxy if needed.
     */
    public static android.os.IVold asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IVold))) {
        return ((android.os.IVold)iin);
      }
      return new android.os.IVold.Stub.Proxy(obj);
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
        case TRANSACTION_setListener:
        {
          android.os.IVoldListener _arg0;
          _arg0 = android.os.IVoldListener.Stub.asInterface(data.readStrongBinder());
          this.setListener(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_abortFuse:
        {
          this.abortFuse();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_monitor:
        {
          this.monitor();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_reset:
        {
          this.reset();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_shutdown:
        {
          this.shutdown();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onUserAdded:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.onUserAdded(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onUserRemoved:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onUserRemoved(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onUserStarted:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onUserStarted(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onUserStopped:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onUserStopped(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addAppIds:
        {
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          int[] _arg1;
          _arg1 = data.createIntArray();
          this.addAppIds(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addSandboxIds:
        {
          int[] _arg0;
          _arg0 = data.createIntArray();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          this.addSandboxIds(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onSecureKeyguardStateChanged:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.onSecureKeyguardStateChanged(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_partition:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.partition(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_forgetPartition:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.forgetPartition(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_mount:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          android.os.IVoldMountCallback _arg3;
          _arg3 = android.os.IVoldMountCallback.Stub.asInterface(data.readStrongBinder());
          this.mount(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_unmount:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.unmount(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_format:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.format(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_benchmark:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.os.IVoldTaskListener _arg1;
          _arg1 = android.os.IVoldTaskListener.Stub.asInterface(data.readStrongBinder());
          this.benchmark(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_moveStorage:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.IVoldTaskListener _arg2;
          _arg2 = android.os.IVoldTaskListener.Stub.asInterface(data.readStrongBinder());
          this.moveStorage(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_remountUid:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.remountUid(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_remountAppStorageDirs:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String[] _arg2;
          _arg2 = data.createStringArray();
          this.remountAppStorageDirs(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_unmountAppStorageDirs:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String[] _arg2;
          _arg2 = data.createStringArray();
          this.unmountAppStorageDirs(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setupAppDir:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.setupAppDir(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_fixupAppDir:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.fixupAppDir(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_ensureAppDirsCreated:
        {
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          int _arg1;
          _arg1 = data.readInt();
          this.ensureAppDirsCreated(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_createObb:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _result = this.createObb(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_destroyObb:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.destroyObb(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_fstrim:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.IVoldTaskListener _arg1;
          _arg1 = android.os.IVoldTaskListener.Stub.asInterface(data.readStrongBinder());
          this.fstrim(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_runIdleMaint:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          android.os.IVoldTaskListener _arg1;
          _arg1 = android.os.IVoldTaskListener.Stub.asInterface(data.readStrongBinder());
          this.runIdleMaint(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_abortIdleMaint:
        {
          android.os.IVoldTaskListener _arg0;
          _arg0 = android.os.IVoldTaskListener.Stub.asInterface(data.readStrongBinder());
          this.abortIdleMaint(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getStorageLifeTime:
        {
          int _result = this.getStorageLifeTime();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_setGCUrgentPace:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          float _arg2;
          _arg2 = data.readFloat();
          float _arg3;
          _arg3 = data.readFloat();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          int _arg6;
          _arg6 = data.readInt();
          this.setGCUrgentPace(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_refreshLatestWrite:
        {
          this.refreshLatestWrite();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getWriteAmount:
        {
          int _result = this.getWriteAmount();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_mountAppFuse:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.io.FileDescriptor _result = this.mountAppFuse(_arg0, _arg1);
          reply.writeNoException();
          reply.writeRawFileDescriptor(_result);
          break;
        }
        case TRANSACTION_unmountAppFuse:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.unmountAppFuse(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_fbeEnable:
        {
          this.fbeEnable();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_initUser0:
        {
          this.initUser0();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_mountFstab:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.mountFstab(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_encryptFstab:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          java.lang.String _arg3;
          _arg3 = data.readString();
          java.lang.String _arg4;
          _arg4 = data.readString();
          this.encryptFstab(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setStorageBindingSeed:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.setStorageBindingSeed(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_createUserStorageKeys:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.createUserStorageKeys(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_destroyUserStorageKeys:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.destroyUserStorageKeys(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setCeStorageProtection:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.setCeStorageProtection(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getUnlockedUsers:
        {
          int[] _result = this.getUnlockedUsers();
          reply.writeNoException();
          reply.writeIntArray(_result);
          break;
        }
        case TRANSACTION_unlockCeStorage:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.unlockCeStorage(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_lockCeStorage:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.lockCeStorage(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_prepareUserStorage:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.prepareUserStorage(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_destroyUserStorage:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.destroyUserStorage(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_prepareSandboxForApp:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _arg3;
          _arg3 = data.readInt();
          this.prepareSandboxForApp(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_destroySandboxForApp:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          this.destroySandboxForApp(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_startCheckpoint:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.startCheckpoint(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_needsCheckpoint:
        {
          boolean _result = this.needsCheckpoint();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_needsRollback:
        {
          boolean _result = this.needsRollback();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_isCheckpointing:
        {
          boolean _result = this.isCheckpointing();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_abortChanges:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.abortChanges(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_commitChanges:
        {
          this.commitChanges();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_prepareCheckpoint:
        {
          this.prepareCheckpoint();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_restoreCheckpoint:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.restoreCheckpoint(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_restoreCheckpointPart:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.restoreCheckpointPart(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_markBootAttempt:
        {
          this.markBootAttempt();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_supportsCheckpoint:
        {
          boolean _result = this.supportsCheckpoint();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_supportsBlockCheckpoint:
        {
          boolean _result = this.supportsBlockCheckpoint();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_supportsFileCheckpoint:
        {
          boolean _result = this.supportsFileCheckpoint();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_resetCheckpoint:
        {
          this.resetCheckpoint();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_earlyBootEnded:
        {
          this.earlyBootEnded();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_createStubVolume:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          java.lang.String _arg4;
          _arg4 = data.readString();
          int _arg5;
          _arg5 = data.readInt();
          java.lang.String _result = this.createStubVolume(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_destroyStubVolume:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.destroyStubVolume(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_openAppFuseFile:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          java.io.FileDescriptor _result = this.openAppFuseFile(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeRawFileDescriptor(_result);
          break;
        }
        case TRANSACTION_incFsEnabled:
        {
          boolean _result = this.incFsEnabled();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_mountIncFs:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String _arg3;
          _arg3 = data.readString();
          android.os.incremental.IncrementalFileSystemControlParcel _result = this.mountIncFs(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_unmountIncFs:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.unmountIncFs(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setIncFsMountOptions:
        {
          android.os.incremental.IncrementalFileSystemControlParcel _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.incremental.IncrementalFileSystemControlParcel.CREATOR);
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          java.lang.String _arg3;
          _arg3 = data.readString();
          this.setIncFsMountOptions(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_bindMount:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.bindMount(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_destroyDsuMetadataKey:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.destroyDsuMetadataKey(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getStorageSize:
        {
          long _result = this.getStorageSize();
          reply.writeNoException();
          reply.writeLong(_result);
          break;
        }
        case TRANSACTION_getStorageRemainingLifetime:
        {
          int _result = this.getStorageRemainingLifetime();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IVold
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
      @Override public void setListener(android.os.IVoldListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setListener, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void abortFuse() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_abortFuse, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void monitor() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_monitor, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void reset() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reset, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void shutdown() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onUserAdded(int userId, int userSerial, int sharesStorageWithUserId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeInt(userSerial);
          _data.writeInt(sharesStorageWithUserId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUserAdded, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onUserRemoved(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUserRemoved, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onUserStarted(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUserStarted, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onUserStopped(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUserStopped, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void addAppIds(java.lang.String[] packageNames, int[] appIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(packageNames);
          _data.writeIntArray(appIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addAppIds, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void addSandboxIds(int[] appIds, java.lang.String[] sandboxIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeIntArray(appIds);
          _data.writeStringArray(sandboxIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addSandboxIds, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onSecureKeyguardStateChanged(boolean isShowing) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((isShowing)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSecureKeyguardStateChanged, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void partition(java.lang.String diskId, int partitionType, int ratio) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(diskId);
          _data.writeInt(partitionType);
          _data.writeInt(ratio);
          boolean _status = mRemote.transact(Stub.TRANSACTION_partition, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void forgetPartition(java.lang.String partGuid, java.lang.String fsUuid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(partGuid);
          _data.writeString(fsUuid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_forgetPartition, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void mount(java.lang.String volId, int mountFlags, int mountUserId, android.os.IVoldMountCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          _data.writeInt(mountFlags);
          _data.writeInt(mountUserId);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mount, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void unmount(java.lang.String volId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unmount, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void format(java.lang.String volId, java.lang.String fsType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          _data.writeString(fsType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_format, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void benchmark(java.lang.String volId, android.os.IVoldTaskListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_benchmark, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void moveStorage(java.lang.String fromVolId, java.lang.String toVolId, android.os.IVoldTaskListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(fromVolId);
          _data.writeString(toVolId);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_moveStorage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void remountUid(int uid, int remountMode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(uid);
          _data.writeInt(remountMode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_remountUid, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void remountAppStorageDirs(int uid, int pid, java.lang.String[] packageNames) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(uid);
          _data.writeInt(pid);
          _data.writeStringArray(packageNames);
          boolean _status = mRemote.transact(Stub.TRANSACTION_remountAppStorageDirs, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void unmountAppStorageDirs(int uid, int pid, java.lang.String[] packageNames) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(uid);
          _data.writeInt(pid);
          _data.writeStringArray(packageNames);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unmountAppStorageDirs, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setupAppDir(java.lang.String path, int appUid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(path);
          _data.writeInt(appUid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setupAppDir, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void fixupAppDir(java.lang.String path, int appUid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(path);
          _data.writeInt(appUid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fixupAppDir, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void ensureAppDirsCreated(java.lang.String[] paths, int appUid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(paths);
          _data.writeInt(appUid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ensureAppDirsCreated, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String createObb(java.lang.String sourcePath, int ownerGid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(sourcePath);
          _data.writeInt(ownerGid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createObb, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void destroyObb(java.lang.String volId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyObb, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void fstrim(int fstrimFlags, android.os.IVoldTaskListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(fstrimFlags);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fstrim, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void runIdleMaint(boolean needGC, android.os.IVoldTaskListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((needGC)?(1):(0)));
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_runIdleMaint, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void abortIdleMaint(android.os.IVoldTaskListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_abortIdleMaint, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Returns the amount of storage lifetime used, as a percentage.
      // (eg, 10 indicates 10% of lifetime used), or -1 on failure.
      @Override public int getStorageLifeTime() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getStorageLifeTime, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setGCUrgentPace(int neededSegments, int minSegmentThreshold, float dirtyReclaimRate, float reclaimWeight, int gcPeriod, int minGCSleepTime, int targetDirtyRatio) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(neededSegments);
          _data.writeInt(minSegmentThreshold);
          _data.writeFloat(dirtyReclaimRate);
          _data.writeFloat(reclaimWeight);
          _data.writeInt(gcPeriod);
          _data.writeInt(minGCSleepTime);
          _data.writeInt(targetDirtyRatio);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGCUrgentPace, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void refreshLatestWrite() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_refreshLatestWrite, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getWriteAmount() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getWriteAmount, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.io.FileDescriptor mountAppFuse(int uid, int mountId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.io.FileDescriptor _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(uid);
          _data.writeInt(mountId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mountAppFuse, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readRawFileDescriptor();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void unmountAppFuse(int uid, int mountId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(uid);
          _data.writeInt(mountId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unmountAppFuse, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void fbeEnable() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fbeEnable, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void initUser0() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_initUser0, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void mountFstab(java.lang.String blkDevice, java.lang.String mountPoint, java.lang.String zonedDevice) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(blkDevice);
          _data.writeString(mountPoint);
          _data.writeString(zonedDevice);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mountFstab, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void encryptFstab(java.lang.String blkDevice, java.lang.String mountPoint, boolean shouldFormat, java.lang.String fsType, java.lang.String zonedDevice) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(blkDevice);
          _data.writeString(mountPoint);
          _data.writeInt(((shouldFormat)?(1):(0)));
          _data.writeString(fsType);
          _data.writeString(zonedDevice);
          boolean _status = mRemote.transact(Stub.TRANSACTION_encryptFstab, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setStorageBindingSeed(byte[] seed) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(seed);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setStorageBindingSeed, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void createUserStorageKeys(int userId, boolean ephemeral) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeInt(((ephemeral)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createUserStorageKeys, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroyUserStorageKeys(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyUserStorageKeys, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setCeStorageProtection(int userId, java.lang.String secret) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(secret);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCeStorageProtection, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int[] getUnlockedUsers() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUnlockedUsers, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createIntArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void unlockCeStorage(int userId, java.lang.String secret) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeString(secret);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unlockCeStorage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void lockCeStorage(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_lockCeStorage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void prepareUserStorage(java.lang.String uuid, int userId, int storageFlags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(userId);
          _data.writeInt(storageFlags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_prepareUserStorage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroyUserStorage(java.lang.String uuid, int userId, int storageFlags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(userId);
          _data.writeInt(storageFlags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyUserStorage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void prepareSandboxForApp(java.lang.String packageName, int appId, java.lang.String sandboxId, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeInt(appId);
          _data.writeString(sandboxId);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_prepareSandboxForApp, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroySandboxForApp(java.lang.String packageName, java.lang.String sandboxId, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(sandboxId);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroySandboxForApp, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void startCheckpoint(int retry) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(retry);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startCheckpoint, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean needsCheckpoint() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_needsCheckpoint, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean needsRollback() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_needsRollback, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean isCheckpointing() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isCheckpointing, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void abortChanges(java.lang.String device, boolean retry) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(device);
          _data.writeInt(((retry)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_abortChanges, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void commitChanges() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_commitChanges, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void prepareCheckpoint() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_prepareCheckpoint, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void restoreCheckpoint(java.lang.String device) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(device);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restoreCheckpoint, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void restoreCheckpointPart(java.lang.String device, int count) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(device);
          _data.writeInt(count);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restoreCheckpointPart, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void markBootAttempt() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_markBootAttempt, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean supportsCheckpoint() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supportsCheckpoint, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean supportsBlockCheckpoint() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supportsBlockCheckpoint, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean supportsFileCheckpoint() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supportsFileCheckpoint, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void resetCheckpoint() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_resetCheckpoint, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void earlyBootEnded() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_earlyBootEnded, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String createStubVolume(java.lang.String sourcePath, java.lang.String mountPath, java.lang.String fsType, java.lang.String fsUuid, java.lang.String fsLabel, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(sourcePath);
          _data.writeString(mountPath);
          _data.writeString(fsType);
          _data.writeString(fsUuid);
          _data.writeString(fsLabel);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createStubVolume, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void destroyStubVolume(java.lang.String volId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyStubVolume, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.io.FileDescriptor openAppFuseFile(int uid, int mountId, int fileId, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.io.FileDescriptor _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(uid);
          _data.writeInt(mountId);
          _data.writeInt(fileId);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openAppFuseFile, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readRawFileDescriptor();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean incFsEnabled() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_incFsEnabled, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.os.incremental.IncrementalFileSystemControlParcel mountIncFs(java.lang.String backingPath, java.lang.String targetDir, int flags, java.lang.String sysfsName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.incremental.IncrementalFileSystemControlParcel _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(backingPath);
          _data.writeString(targetDir);
          _data.writeInt(flags);
          _data.writeString(sysfsName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mountIncFs, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.os.incremental.IncrementalFileSystemControlParcel.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void unmountIncFs(java.lang.String dir) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(dir);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unmountIncFs, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setIncFsMountOptions(android.os.incremental.IncrementalFileSystemControlParcel control, boolean enableReadLogs, boolean enableReadTimeouts, java.lang.String sysfsName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, control, 0);
          _data.writeInt(((enableReadLogs)?(1):(0)));
          _data.writeInt(((enableReadTimeouts)?(1):(0)));
          _data.writeString(sysfsName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setIncFsMountOptions, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void bindMount(java.lang.String sourceDir, java.lang.String targetDir) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(sourceDir);
          _data.writeString(targetDir);
          boolean _status = mRemote.transact(Stub.TRANSACTION_bindMount, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroyDsuMetadataKey(java.lang.String dsuSlot) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(dsuSlot);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyDsuMetadataKey, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public long getStorageSize() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getStorageSize, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Returns the remaining storage lifetime as a percentage, rounded up as
      // needed when the underlying hardware reports low precision. Returns -1
      // on failure.
      @Override public int getStorageRemainingLifetime() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getStorageRemainingLifetime, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    /** @hide */
    public static final java.lang.String DESCRIPTOR = "android.os.IVold";
    static final int TRANSACTION_setListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_abortFuse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_monitor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_reset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_onUserAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_onUserRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_onUserStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_onUserStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_addAppIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_addSandboxIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_onSecureKeyguardStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_partition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_forgetPartition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_mount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_unmount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_format = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_benchmark = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_moveStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_remountUid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_remountAppStorageDirs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_unmountAppStorageDirs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_setupAppDir = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_fixupAppDir = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_ensureAppDirsCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_createObb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_destroyObb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_fstrim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_runIdleMaint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_abortIdleMaint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_getStorageLifeTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_setGCUrgentPace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_refreshLatestWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_getWriteAmount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_mountAppFuse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_unmountAppFuse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_fbeEnable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_initUser0 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_mountFstab = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_encryptFstab = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_setStorageBindingSeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_createUserStorageKeys = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_destroyUserStorageKeys = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_setCeStorageProtection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_getUnlockedUsers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_unlockCeStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    static final int TRANSACTION_lockCeStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
    static final int TRANSACTION_prepareUserStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
    static final int TRANSACTION_destroyUserStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
    static final int TRANSACTION_prepareSandboxForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
    static final int TRANSACTION_destroySandboxForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
    static final int TRANSACTION_startCheckpoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
    static final int TRANSACTION_needsCheckpoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
    static final int TRANSACTION_needsRollback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
    static final int TRANSACTION_isCheckpointing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
    static final int TRANSACTION_abortChanges = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
    static final int TRANSACTION_commitChanges = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
    static final int TRANSACTION_prepareCheckpoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
    static final int TRANSACTION_restoreCheckpoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
    static final int TRANSACTION_restoreCheckpointPart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
    static final int TRANSACTION_markBootAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
    static final int TRANSACTION_supportsCheckpoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
    static final int TRANSACTION_supportsBlockCheckpoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
    static final int TRANSACTION_supportsFileCheckpoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
    static final int TRANSACTION_resetCheckpoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
    static final int TRANSACTION_earlyBootEnded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
    static final int TRANSACTION_createStubVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
    static final int TRANSACTION_destroyStubVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
    static final int TRANSACTION_openAppFuseFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
    static final int TRANSACTION_incFsEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 69);
    static final int TRANSACTION_mountIncFs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
    static final int TRANSACTION_unmountIncFs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
    static final int TRANSACTION_setIncFsMountOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
    static final int TRANSACTION_bindMount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
    static final int TRANSACTION_destroyDsuMetadataKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 74);
    static final int TRANSACTION_getStorageSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 75);
    static final int TRANSACTION_getStorageRemainingLifetime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 76);
  }
  public static final int FSTRIM_FLAG_DEEP_TRIM = 1;
  public static final int MOUNT_FLAG_PRIMARY = 1;
  public static final int MOUNT_FLAG_VISIBLE_FOR_READ = 2;
  public static final int MOUNT_FLAG_VISIBLE_FOR_WRITE = 4;
  public static final int PARTITION_TYPE_PUBLIC = 0;
  public static final int PARTITION_TYPE_PRIVATE = 1;
  public static final int PARTITION_TYPE_MIXED = 2;
  public static final int STORAGE_FLAG_DE = 1;
  public static final int STORAGE_FLAG_CE = 2;
  public static final int REMOUNT_MODE_NONE = 0;
  public static final int REMOUNT_MODE_DEFAULT = 1;
  public static final int REMOUNT_MODE_INSTALLER = 2;
  public static final int REMOUNT_MODE_PASS_THROUGH = 3;
  public static final int REMOUNT_MODE_ANDROID_WRITABLE = 4;
  public static final int VOLUME_STATE_UNMOUNTED = 0;
  public static final int VOLUME_STATE_CHECKING = 1;
  public static final int VOLUME_STATE_MOUNTED = 2;
  public static final int VOLUME_STATE_MOUNTED_READ_ONLY = 3;
  public static final int VOLUME_STATE_FORMATTING = 4;
  public static final int VOLUME_STATE_EJECTING = 5;
  public static final int VOLUME_STATE_UNMOUNTABLE = 6;
  public static final int VOLUME_STATE_REMOVED = 7;
  public static final int VOLUME_STATE_BAD_REMOVAL = 8;
  public static final int VOLUME_TYPE_PUBLIC = 0;
  public static final int VOLUME_TYPE_PRIVATE = 1;
  public static final int VOLUME_TYPE_EMULATED = 2;
  public static final int VOLUME_TYPE_ASEC = 3;
  public static final int VOLUME_TYPE_OBB = 4;
  public static final int VOLUME_TYPE_STUB = 5;
  public void setListener(android.os.IVoldListener listener) throws android.os.RemoteException;
  public void abortFuse() throws android.os.RemoteException;
  public void monitor() throws android.os.RemoteException;
  public void reset() throws android.os.RemoteException;
  public void shutdown() throws android.os.RemoteException;
  public void onUserAdded(int userId, int userSerial, int sharesStorageWithUserId) throws android.os.RemoteException;
  public void onUserRemoved(int userId) throws android.os.RemoteException;
  public void onUserStarted(int userId) throws android.os.RemoteException;
  public void onUserStopped(int userId) throws android.os.RemoteException;
  public void addAppIds(java.lang.String[] packageNames, int[] appIds) throws android.os.RemoteException;
  public void addSandboxIds(int[] appIds, java.lang.String[] sandboxIds) throws android.os.RemoteException;
  public void onSecureKeyguardStateChanged(boolean isShowing) throws android.os.RemoteException;
  public void partition(java.lang.String diskId, int partitionType, int ratio) throws android.os.RemoteException;
  public void forgetPartition(java.lang.String partGuid, java.lang.String fsUuid) throws android.os.RemoteException;
  public void mount(java.lang.String volId, int mountFlags, int mountUserId, android.os.IVoldMountCallback callback) throws android.os.RemoteException;
  public void unmount(java.lang.String volId) throws android.os.RemoteException;
  public void format(java.lang.String volId, java.lang.String fsType) throws android.os.RemoteException;
  public void benchmark(java.lang.String volId, android.os.IVoldTaskListener listener) throws android.os.RemoteException;
  public void moveStorage(java.lang.String fromVolId, java.lang.String toVolId, android.os.IVoldTaskListener listener) throws android.os.RemoteException;
  public void remountUid(int uid, int remountMode) throws android.os.RemoteException;
  public void remountAppStorageDirs(int uid, int pid, java.lang.String[] packageNames) throws android.os.RemoteException;
  public void unmountAppStorageDirs(int uid, int pid, java.lang.String[] packageNames) throws android.os.RemoteException;
  public void setupAppDir(java.lang.String path, int appUid) throws android.os.RemoteException;
  public void fixupAppDir(java.lang.String path, int appUid) throws android.os.RemoteException;
  public void ensureAppDirsCreated(java.lang.String[] paths, int appUid) throws android.os.RemoteException;
  public java.lang.String createObb(java.lang.String sourcePath, int ownerGid) throws android.os.RemoteException;
  public void destroyObb(java.lang.String volId) throws android.os.RemoteException;
  public void fstrim(int fstrimFlags, android.os.IVoldTaskListener listener) throws android.os.RemoteException;
  public void runIdleMaint(boolean needGC, android.os.IVoldTaskListener listener) throws android.os.RemoteException;
  public void abortIdleMaint(android.os.IVoldTaskListener listener) throws android.os.RemoteException;
  // Returns the amount of storage lifetime used, as a percentage.
  // (eg, 10 indicates 10% of lifetime used), or -1 on failure.
  public int getStorageLifeTime() throws android.os.RemoteException;
  public void setGCUrgentPace(int neededSegments, int minSegmentThreshold, float dirtyReclaimRate, float reclaimWeight, int gcPeriod, int minGCSleepTime, int targetDirtyRatio) throws android.os.RemoteException;
  public void refreshLatestWrite() throws android.os.RemoteException;
  public int getWriteAmount() throws android.os.RemoteException;
  public java.io.FileDescriptor mountAppFuse(int uid, int mountId) throws android.os.RemoteException;
  public void unmountAppFuse(int uid, int mountId) throws android.os.RemoteException;
  public void fbeEnable() throws android.os.RemoteException;
  public void initUser0() throws android.os.RemoteException;
  public void mountFstab(java.lang.String blkDevice, java.lang.String mountPoint, java.lang.String zonedDevice) throws android.os.RemoteException;
  public void encryptFstab(java.lang.String blkDevice, java.lang.String mountPoint, boolean shouldFormat, java.lang.String fsType, java.lang.String zonedDevice) throws android.os.RemoteException;
  public void setStorageBindingSeed(byte[] seed) throws android.os.RemoteException;
  public void createUserStorageKeys(int userId, boolean ephemeral) throws android.os.RemoteException;
  public void destroyUserStorageKeys(int userId) throws android.os.RemoteException;
  public void setCeStorageProtection(int userId, java.lang.String secret) throws android.os.RemoteException;
  public int[] getUnlockedUsers() throws android.os.RemoteException;
  public void unlockCeStorage(int userId, java.lang.String secret) throws android.os.RemoteException;
  public void lockCeStorage(int userId) throws android.os.RemoteException;
  public void prepareUserStorage(java.lang.String uuid, int userId, int storageFlags) throws android.os.RemoteException;
  public void destroyUserStorage(java.lang.String uuid, int userId, int storageFlags) throws android.os.RemoteException;
  public void prepareSandboxForApp(java.lang.String packageName, int appId, java.lang.String sandboxId, int userId) throws android.os.RemoteException;
  public void destroySandboxForApp(java.lang.String packageName, java.lang.String sandboxId, int userId) throws android.os.RemoteException;
  public void startCheckpoint(int retry) throws android.os.RemoteException;
  public boolean needsCheckpoint() throws android.os.RemoteException;
  public boolean needsRollback() throws android.os.RemoteException;
  public boolean isCheckpointing() throws android.os.RemoteException;
  public void abortChanges(java.lang.String device, boolean retry) throws android.os.RemoteException;
  public void commitChanges() throws android.os.RemoteException;
  public void prepareCheckpoint() throws android.os.RemoteException;
  public void restoreCheckpoint(java.lang.String device) throws android.os.RemoteException;
  public void restoreCheckpointPart(java.lang.String device, int count) throws android.os.RemoteException;
  public void markBootAttempt() throws android.os.RemoteException;
  public boolean supportsCheckpoint() throws android.os.RemoteException;
  public boolean supportsBlockCheckpoint() throws android.os.RemoteException;
  public boolean supportsFileCheckpoint() throws android.os.RemoteException;
  public void resetCheckpoint() throws android.os.RemoteException;
  public void earlyBootEnded() throws android.os.RemoteException;
  public java.lang.String createStubVolume(java.lang.String sourcePath, java.lang.String mountPath, java.lang.String fsType, java.lang.String fsUuid, java.lang.String fsLabel, int flags) throws android.os.RemoteException;
  public void destroyStubVolume(java.lang.String volId) throws android.os.RemoteException;
  public java.io.FileDescriptor openAppFuseFile(int uid, int mountId, int fileId, int flags) throws android.os.RemoteException;
  public boolean incFsEnabled() throws android.os.RemoteException;
  public android.os.incremental.IncrementalFileSystemControlParcel mountIncFs(java.lang.String backingPath, java.lang.String targetDir, int flags, java.lang.String sysfsName) throws android.os.RemoteException;
  public void unmountIncFs(java.lang.String dir) throws android.os.RemoteException;
  public void setIncFsMountOptions(android.os.incremental.IncrementalFileSystemControlParcel control, boolean enableReadLogs, boolean enableReadTimeouts, java.lang.String sysfsName) throws android.os.RemoteException;
  public void bindMount(java.lang.String sourceDir, java.lang.String targetDir) throws android.os.RemoteException;
  public void destroyDsuMetadataKey(java.lang.String dsuSlot) throws android.os.RemoteException;
  public long getStorageSize() throws android.os.RemoteException;
  // Returns the remaining storage lifetime as a percentage, rounded up as
  // needed when the underlying hardware reports low precision. Returns -1
  // on failure.
  public int getStorageRemainingLifetime() throws android.os.RemoteException;
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
