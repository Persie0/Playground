package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;

/* JADX INFO: loaded from: classes2.dex */
public final class tdb extends mcb {
    public tdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m21965Q(TelemetryData telemetryData) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f51090h);
        zcb.m25555b(parcelObtain, telemetryData);
        try {
            this.f51089g.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
