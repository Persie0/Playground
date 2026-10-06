package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqk extends cbq implements IInterface {
    public jqk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    /* JADX INFO: renamed from: e */
    public final void m13470e(joo jooVar, jqj jqjVar) {
        Parcel parcelM3398a = m3398a();
        cbs.m3405d(parcelM3398a, jooVar);
        cbs.m3405d(parcelM3398a, jqjVar);
        m3400z(4, parcelM3398a);
    }
}
