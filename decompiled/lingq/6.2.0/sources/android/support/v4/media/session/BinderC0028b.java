package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p000.C3386nv;
import p000.eda;
import p000.fv5;
import p000.hv5;
import p000.iv5;
import p000.uk9;
import p000.ux3;
import p000.vx3;
import p000.xx3;

/* JADX INFO: renamed from: android.support.v4.media.session.b */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC0028b extends Binder implements xx3 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f988g = 0;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f989f;

    public BinderC0028b(fv5 fv5Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f989f = new AtomicReference(fv5Var);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        vx3 vx3Var = null;
        PlaybackStateCompat playbackStateCompat = null;
        vx3 vx3Var2 = null;
        switch (i) {
            case 1:
                parcel.readString();
                uk9.m22780o();
                return false;
            case 2:
                uk9.m22780o();
                return false;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof vx3)) {
                        ux3 ux3Var = new ux3();
                        ux3Var.f64485f = strongBinder;
                        vx3Var = ux3Var;
                    } else {
                        vx3Var = (vx3) iInterfaceQueryLocalInterface;
                    }
                }
                fv5 fv5Var = (fv5) this.f989f.get();
                if (fv5Var != null) {
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    hv5 hv5Var = new hv5();
                    if (TextUtils.isEmpty("android.media.session.MediaController")) {
                        C3386nv.m17626m("packageName should be nonempty");
                        return false;
                    }
                    iv5 iv5Var = new iv5();
                    iv5Var.f44674a = callingPid;
                    iv5Var.f44675b = callingUid;
                    new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", callingPid, callingUid);
                    hv5Var.f42992a = iv5Var;
                    fv5Var.f39752d.register(vx3Var, hv5Var);
                    synchronized (fv5Var.f39751c) {
                    }
                    break;
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof vx3)) {
                        ux3 ux3Var2 = new ux3();
                        ux3Var2.f64485f = strongBinder2;
                        vx3Var2 = ux3Var2;
                    } else {
                        vx3Var2 = (vx3) iInterfaceQueryLocalInterface2;
                    }
                }
                fv5 fv5Var2 = (fv5) this.f989f.get();
                if (fv5Var2 != null) {
                    fv5Var2.f39752d.unregister(vx3Var2);
                    Binder.getCallingPid();
                    Binder.getCallingUid();
                    synchronized (fv5Var2.f39751c) {
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 5:
                uk9.m22780o();
                return false;
            case 6:
                uk9.m22780o();
                return false;
            case 7:
                uk9.m22780o();
                return false;
            case 8:
                uk9.m22780o();
                return false;
            case 9:
                uk9.m22780o();
                return false;
            case 10:
                uk9.m22780o();
                return false;
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                uk9.m22780o();
                return false;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                uk9.m22780o();
                return false;
            case 13:
                uk9.m22780o();
                return false;
            case 14:
                parcel.readString();
                uk9.m22780o();
                return false;
            case 15:
                parcel.readString();
                uk9.m22780o();
                return false;
            case 16:
                uk9.m22780o();
                return false;
            case 17:
                parcel.readLong();
                uk9.m22780o();
                return false;
            case 18:
                uk9.m22780o();
                return false;
            case 19:
                uk9.m22780o();
                return false;
            case 20:
                uk9.m22780o();
                return false;
            case 21:
                uk9.m22780o();
                return false;
            case 22:
                uk9.m22780o();
                return false;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                uk9.m22780o();
                return false;
            case 24:
                parcel.readLong();
                uk9.m22780o();
                return false;
            case 25:
                uk9.m22780o();
                return false;
            case 26:
                parcel.readString();
                uk9.m22780o();
                return false;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                uk9.m22780o();
                return false;
            case 28:
                fv5 fv5Var3 = (fv5) this.f989f.get();
                if (fv5Var3 != null) {
                    playbackStateCompat = fv5Var3.f39753e;
                    MediaMetadataCompat mediaMetadataCompat = fv5Var3.f39754f;
                    if (playbackStateCompat != null) {
                        float f = playbackStateCompat.f970d;
                        long j = playbackStateCompat.f974h;
                        int i4 = playbackStateCompat.f967a;
                        long j2 = playbackStateCompat.f968b;
                        long j3 = -1;
                        if (j2 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j > 0)) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j4 = ((long) (f * (jElapsedRealtime - j))) + j2;
                            if (mediaMetadataCompat != null) {
                                Bundle bundle = mediaMetadataCompat.f950a;
                                if (bundle.containsKey("android.media.metadata.DURATION")) {
                                    j3 = bundle.getLong("android.media.metadata.DURATION", 0L);
                                }
                            }
                            long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                            ArrayList arrayList = new ArrayList();
                            long j6 = playbackStateCompat.f969c;
                            long j7 = playbackStateCompat.f971e;
                            int i5 = playbackStateCompat.f972f;
                            CharSequence charSequence = playbackStateCompat.f973g;
                            ArrayList arrayList2 = playbackStateCompat.f975i;
                            if (arrayList2 != null) {
                                arrayList.addAll(arrayList2);
                            }
                            playbackStateCompat = new PlaybackStateCompat(playbackStateCompat.f967a, j5, j6, playbackStateCompat.f970d, j7, i5, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.f976j, playbackStateCompat.f977k);
                        }
                    }
                }
                parcel2.writeNoException();
                if (playbackStateCompat == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                playbackStateCompat.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                uk9.m22780o();
                return false;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                uk9.m22780o();
                return false;
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                uk9.m22780o();
                return false;
            case 34:
                parcel.readString();
                uk9.m22780o();
                return false;
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                parcel.readString();
                uk9.m22780o();
                return false;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                uk9.m22780o();
                return false;
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                i3 = ((fv5) this.f989f.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                parcel.readInt();
                uk9.m22780o();
                return false;
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                uk9.m22780o();
                return false;
            case 42:
                parcel.readInt();
                uk9.m22780o();
                return false;
            case 43:
                uk9.m22780o();
                return false;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                parcel.readInt();
                uk9.m22780o();
                return false;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                parcel.readInt();
                uk9.m22780o();
                return false;
            case 47:
                i3 = ((fv5) this.f989f.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case eda.f37086g /* 48 */:
                parcel.readInt();
                uk9.m22780o();
                return false;
            case 49:
                parcel.readFloat();
                uk9.m22780o();
                return false;
            case 50:
                ((fv5) this.f989f.get()).getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 51:
                uk9.m22780o();
                return false;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
