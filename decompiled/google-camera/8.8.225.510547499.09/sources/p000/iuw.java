package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class iuw extends cbq implements IInterface {
    public iuw(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }

    /* JADX INFO: renamed from: e */
    public final void m11800e(byte[] bArr) {
        Parcel parcelM3398a = m3398a();
        parcelM3398a.writeByteArray(bArr);
        m3397A(1, parcelM3398a);
    }
}
