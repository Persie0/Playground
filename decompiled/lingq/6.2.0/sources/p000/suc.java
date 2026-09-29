package p000;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class suc extends mcb {
    public suc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 6);
    }

    /* JADX INFO: renamed from: Q */
    public final void m21745Q(lrc lrcVar, String str, String[] strArr) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, lrcVar);
        parcelM16773J.writeString(str);
        parcelM16773J.writeInt(0);
        parcelM16773J.writeStringArray(strArr);
        parcelM16773J.writeByteArray(null);
        m16776M(parcelM16773J, 1);
    }

    /* JADX INFO: renamed from: R */
    public final void m21746R(lrc lrcVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, lrcVar);
        m16776M(parcelM16773J, 27);
    }
}
