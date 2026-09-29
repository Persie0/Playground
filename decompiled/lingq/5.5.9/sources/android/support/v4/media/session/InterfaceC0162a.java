package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: renamed from: android.support.v4.media.session.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0162a extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.a$a */
    public static abstract class a extends Binder implements InterfaceC0162a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f424a = 0;

        /* JADX INFO: renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        public static class C10581a implements InterfaceC0162a {

            /* JADX INFO: renamed from: a */
            public final IBinder f425a;

            public C10581a(IBinder iBinder) {
                this.f425a = iBinder;
            }

            @Override // android.support.v4.media.session.InterfaceC0162a
            /* JADX INFO: renamed from: a1 */
            public final void mo632a1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        parcelObtain.writeInt(1);
                        playbackStateCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f425a.transact(3, parcelObtain, null, 1)) {
                        int i10 = a.f424a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f425a;
            }

            @Override // android.support.v4.media.session.InterfaceC0162a
            /* JADX INFO: renamed from: q0 */
            public final void mo630q0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.f425a.transact(2, parcelObtain, null, 1)) {
                        int i10 = a.f424a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0162a
            /* JADX INFO: renamed from: s0 */
            public final void mo631s0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        parcelObtain.writeInt(1);
                        parcelObtain.writeBundle(mediaMetadataCompat.f351a);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f425a.transact(4, parcelObtain, null, 1)) {
                        int i10 = a.f424a;
                    }
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    ((MediaControllerCompat.AbstractC0143a.b) this).f366b.get();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo630q0();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.AbstractC0143a.b) this).mo632a1(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo631s0(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                    mo627G0();
                    return true;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                    }
                    mo626G();
                    return true;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                    }
                    mo628b0();
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo629c1(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((MediaControllerCompat.AbstractC0143a.b) this).f366b.get();
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((MediaControllerCompat.AbstractC0143a.b) this).f366b.get();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((MediaControllerCompat.AbstractC0143a.b) this).f366b.get();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.AbstractC0143a.b) this).f366b.get();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    void mo626G() throws RemoteException;

    /* JADX INFO: renamed from: G0 */
    void mo627G0() throws RemoteException;

    /* JADX INFO: renamed from: a1 */
    void mo632a1(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* JADX INFO: renamed from: b0 */
    void mo628b0() throws RemoteException;

    /* JADX INFO: renamed from: c1 */
    void mo629c1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* JADX INFO: renamed from: q0 */
    void mo630q0() throws RemoteException;

    /* JADX INFO: renamed from: s0 */
    void mo631s0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;
}
