package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class gu5 extends Binder implements vx3 {

    /* JADX INFO: renamed from: f */
    public final WeakReference f41342f;

    public gu5() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f41342f = new WeakReference(null);
    }

    @Override // p000.vx3
    /* JADX INFO: renamed from: E */
    public final void mo12866E(PlaybackStateCompat playbackStateCompat) {
        if (this.f41342f.get() == null) {
            return;
        }
        ho2.m13383c();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                if (this.f41342f.get() != null) {
                    ho2.m13383c();
                    return false;
                }
                return true;
            case 2:
                uk9.m22780o();
                return false;
            case 3:
                mo12866E((PlaybackStateCompat) gfd.m12570a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                uk9.m22780o();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
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
                parcel.readInt();
                if (this.f41342f.get() != null) {
                    ho2.m13383c();
                    return false;
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                if (this.f41342f.get() != null) {
                    ho2.m13383c();
                    return false;
                }
                return true;
            case 12:
                parcel.readInt();
                if (this.f41342f.get() != null) {
                    ho2.m13383c();
                    return false;
                }
                return true;
            case 13:
                if (this.f41342f.get() != null) {
                    ho2.m13383c();
                    return false;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
