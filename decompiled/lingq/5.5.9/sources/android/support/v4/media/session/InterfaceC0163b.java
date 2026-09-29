package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: renamed from: android.support.v4.media.session.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0163b extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.b$a */
    public static abstract class a extends Binder implements InterfaceC0163b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f426a = 0;

        /* JADX INFO: renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        public static class C10582a implements InterfaceC0163b {

            /* JADX INFO: renamed from: a */
            public final IBinder f427a;

            public C10582a(IBinder iBinder) {
                this.f427a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f427a;
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: m0 */
            public final boolean mo686m0(KeyEvent keyEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (keyEvent != null) {
                        parcelObtain.writeInt(1);
                        keyEvent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f427a.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i10 = a.f426a;
                    }
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: p */
            public final void mo688p(InterfaceC0162a interfaceC0162a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC0162a != null ? interfaceC0162a.asBinder() : null);
                    if (!this.f427a.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i10 = a.f426a;
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            InterfaceC0162a c10581a = null;
            InterfaceC0162a c10581a2 = null;
            switch (i10) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo664D0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zMo686m0 = mo686m0(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo686m0 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        c10581a2 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0162a)) ? new InterfaceC0162a.a.C10581a(strongBinder) : (InterfaceC0162a) iInterfaceQueryLocalInterface;
                    }
                    mo688p(c10581a2);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        c10581a = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC0162a)) ? new InterfaceC0162a.a.C10581a(strongBinder2) : (InterfaceC0162a) iInterfaceQueryLocalInterface2;
                    }
                    mo677T(c10581a);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zMo660B = mo660B();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo660B ? 1 : 0);
                    return true;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strMo679X0 = mo679X0();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo679X0);
                    return true;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strMo684g = mo684g();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo684g);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent pendingIntentMo666F = mo666F();
                    parcel2.writeNoException();
                    if (pendingIntentMo666F != null) {
                        parcel2.writeInt(1);
                        pendingIntentMo666F.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long jMo685i = mo685i();
                    parcel2.writeNoException();
                    parcel2.writeLong(jMo685i);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo parcelableVolumeInfoMo674Q0 = mo674Q0();
                    parcel2.writeNoException();
                    if (parcelableVolumeInfoMo674Q0 != null) {
                        parcel2.writeInt(1);
                        parcelableVolumeInfoMo674Q0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int i12 = parcel.readInt();
                    int i13 = parcel.readInt();
                    parcel.readString();
                    mo670N(i12, i13);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int i14 = parcel.readInt();
                    int i15 = parcel.readInt();
                    parcel.readString();
                    mo680Y(i14, i15);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo673Q(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo669I0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo683a0(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo671N0(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo681Z();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo668H0();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    seekTo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo692s(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo693t(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat mediaMetadataCompatMo675R = mo675R();
                    parcel2.writeNoException();
                    if (mediaMetadataCompatMo675R != null) {
                        parcel2.writeInt(1);
                        parcel2.writeBundle(mediaMetadataCompatMo675R.f351a);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat playbackState = getPlaybackState();
                    parcel2.writeNoException();
                    if (playbackState != null) {
                        parcel2.writeInt(1);
                        playbackState.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo665E0();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(null);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence charSequenceMo672P = mo672P();
                    parcel2.writeNoException();
                    if (charSequenceMo672P != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(charSequenceMo672P, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle bundleMo687o = mo687o();
                    parcel2.writeNoException();
                    if (bundleMo687o != null) {
                        parcel2.writeInt(1);
                        bundleMo687o.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo667H();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo661B0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo682Z0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo695w(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    getRepeatMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo690r();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setRepeatMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    mo662C();
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo663D(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo691r0(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo659A(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo697y0(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo698z0();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo694v0(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo696w0();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo678U0(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setPlaybackSpeed(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle bundleMo676S = mo676S();
                    parcel2.writeNoException();
                    if (bundleMo676S != null) {
                        parcel2.writeInt(1);
                        bundleMo676S.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo689p0(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    void mo659A(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* JADX INFO: renamed from: B */
    boolean mo660B() throws RemoteException;

    /* JADX INFO: renamed from: B0 */
    void mo661B0(Bundle bundle, String str) throws RemoteException;

    /* JADX INFO: renamed from: C */
    void mo662C() throws RemoteException;

    /* JADX INFO: renamed from: D */
    void mo663D(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* JADX INFO: renamed from: D0 */
    void mo664D0(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    /* JADX INFO: renamed from: E0 */
    void mo665E0() throws RemoteException;

    /* JADX INFO: renamed from: F */
    PendingIntent mo666F() throws RemoteException;

    /* JADX INFO: renamed from: H */
    void mo667H() throws RemoteException;

    /* JADX INFO: renamed from: H0 */
    void mo668H0() throws RemoteException;

    /* JADX INFO: renamed from: I0 */
    void mo669I0(Bundle bundle, String str) throws RemoteException;

    /* JADX INFO: renamed from: N */
    void mo670N(int i10, int i11) throws RemoteException;

    /* JADX INFO: renamed from: N0 */
    void mo671N0(long j10) throws RemoteException;

    /* JADX INFO: renamed from: P */
    CharSequence mo672P() throws RemoteException;

    /* JADX INFO: renamed from: Q */
    void mo673Q(Bundle bundle, String str) throws RemoteException;

    /* JADX INFO: renamed from: Q0 */
    ParcelableVolumeInfo mo674Q0() throws RemoteException;

    /* JADX INFO: renamed from: R */
    MediaMetadataCompat mo675R() throws RemoteException;

    /* JADX INFO: renamed from: S */
    Bundle mo676S() throws RemoteException;

    /* JADX INFO: renamed from: T */
    void mo677T(InterfaceC0162a interfaceC0162a) throws RemoteException;

    /* JADX INFO: renamed from: U0 */
    void mo678U0(int i10) throws RemoteException;

    /* JADX INFO: renamed from: X0 */
    String mo679X0() throws RemoteException;

    /* JADX INFO: renamed from: Y */
    void mo680Y(int i10, int i11) throws RemoteException;

    /* JADX INFO: renamed from: Z */
    void mo681Z() throws RemoteException;

    /* JADX INFO: renamed from: Z0 */
    void mo682Z0(Bundle bundle, String str) throws RemoteException;

    /* JADX INFO: renamed from: a0 */
    void mo683a0(Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: g */
    String mo684g() throws RemoteException;

    PlaybackStateCompat getPlaybackState() throws RemoteException;

    void getRepeatMode() throws RemoteException;

    /* JADX INFO: renamed from: i */
    long mo685i() throws RemoteException;

    /* JADX INFO: renamed from: m0 */
    boolean mo686m0(KeyEvent keyEvent) throws RemoteException;

    void next() throws RemoteException;

    /* JADX INFO: renamed from: o */
    Bundle mo687o() throws RemoteException;

    /* JADX INFO: renamed from: p */
    void mo688p(InterfaceC0162a interfaceC0162a) throws RemoteException;

    /* JADX INFO: renamed from: p0 */
    void mo689p0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void prepare() throws RemoteException;

    void previous() throws RemoteException;

    /* JADX INFO: renamed from: r */
    void mo690r() throws RemoteException;

    /* JADX INFO: renamed from: r0 */
    void mo691r0(MediaDescriptionCompat mediaDescriptionCompat, int i10) throws RemoteException;

    /* JADX INFO: renamed from: s */
    void mo692s(RatingCompat ratingCompat) throws RemoteException;

    void seekTo(long j10) throws RemoteException;

    void setPlaybackSpeed(float f3) throws RemoteException;

    void setRepeatMode(int i10) throws RemoteException;

    void stop() throws RemoteException;

    /* JADX INFO: renamed from: t */
    void mo693t(Bundle bundle, String str) throws RemoteException;

    /* JADX INFO: renamed from: v0 */
    void mo694v0(boolean z10) throws RemoteException;

    /* JADX INFO: renamed from: w */
    void mo695w(Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: w0 */
    void mo696w0() throws RemoteException;

    /* JADX INFO: renamed from: y0 */
    void mo697y0(int i10) throws RemoteException;

    /* JADX INFO: renamed from: z0 */
    void mo698z0() throws RemoteException;
}
