package p000;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class iux extends cbr implements iuy {
    public iux() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        iva ivaVar = (iva) cbs.m3402a(parcel, iva.CREATOR);
        cbs.m3403b(parcel);
        mo11801b(bArrCreateByteArray, ivaVar);
        return true;
    }
}
