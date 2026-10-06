package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnk extends cbq implements IInterface {
    public jnk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* JADX INFO: renamed from: e */
    public final void m13388e(jnx jnxVar) {
        Parcel parcelM3398a = m3398a();
        cbs.m3404c(parcelM3398a, jnxVar);
        m3400z(59, parcelM3398a);
    }
}
