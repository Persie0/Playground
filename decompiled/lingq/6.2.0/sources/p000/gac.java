package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoq;

/* JADX INFO: loaded from: classes2.dex */
public final class gac extends mcb implements oac {
    public gac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 6);
    }

    @Override // p000.oac
    /* JADX INFO: renamed from: w */
    public final void mo3174w(zzoq zzoqVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzoqVar);
        m16777N(parcelM16773J);
    }
}
