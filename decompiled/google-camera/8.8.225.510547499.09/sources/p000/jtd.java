package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtd extends cbq implements IInterface {
    public jtd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    /* JADX INFO: renamed from: e */
    public final void m13501e(jsz jszVar, jre jreVar) {
        Parcel parcelM3398a = m3398a();
        cbs.m3405d(parcelM3398a, jszVar);
        cbs.m3404c(parcelM3398a, jreVar);
        m3400z(16, parcelM3398a);
    }
}
