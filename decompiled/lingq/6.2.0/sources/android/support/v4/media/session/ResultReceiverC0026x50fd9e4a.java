package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import p000.c47;
import p000.npa;
import p000.wx3;
import p000.xx3;

/* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
/* JADX INFO: loaded from: classes2.dex */
class ResultReceiverC0026x50fd9e4a extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    public WeakReference f954a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        xx3 xx3Var;
        C0027a c0027a = (C0027a) this.f954a.get();
        if (c0027a == null || bundle == null) {
            return;
        }
        synchronized (c0027a.f984b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = c0027a.f987e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = BinderC0028b.f988g;
            npa npaVar = null;
            if (binder == null) {
                xx3Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof xx3)) {
                    wx3 wx3Var = new wx3();
                    wx3Var.f67470f = binder;
                    xx3Var = wx3Var;
                } else {
                    xx3Var = (xx3) iInterfaceQueryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.f958a) {
                mediaSessionCompat$Token.f960c = xx3Var;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token2 = c0027a.f987e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(c47.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    npaVar = ((ParcelImpl) parcelable).f7109a;
                }
            } catch (RuntimeException unused) {
            }
            synchronized (mediaSessionCompat$Token2.f958a) {
                mediaSessionCompat$Token2.f961d = npaVar;
            }
            c0027a.m629a();
        }
    }
}
