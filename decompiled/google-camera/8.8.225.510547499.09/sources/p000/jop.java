package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jop extends cbq implements IInterface {
    public jop(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    /* JADX INFO: renamed from: e */
    public final void m13412e(joo jooVar, String str) {
        Parcel parcelM3398a = m3398a();
        cbs.m3405d(parcelM3398a, jooVar);
        parcelM3398a.writeString(str);
        m3400z(5, parcelM3398a);
    }
}
