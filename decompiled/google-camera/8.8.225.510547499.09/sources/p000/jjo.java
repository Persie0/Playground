package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjo extends cbq implements IInterface {
    public jjo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* JADX INFO: renamed from: e */
    public final int m13320e() {
        Parcel parcelM3399y = m3399y(6, m3398a());
        int i = parcelM3399y.readInt();
        parcelM3399y.recycle();
        return i;
    }
}
