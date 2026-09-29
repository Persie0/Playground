package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class dvb extends mcb implements nvb {
    public dvb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 6);
    }

    @Override // p000.nvb
    /* JADX INFO: renamed from: d */
    public final int mo10689d() {
        Parcel parcelM16772I = m16772I(m16773J(), 2);
        int i = parcelM16772I.readInt();
        parcelM16772I.recycle();
        return i;
    }

    @Override // p000.nvb
    /* JADX INFO: renamed from: h */
    public final void mo10690h(long j, Bundle bundle, String str, String str2) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeString(str2);
        bqb.m4106c(parcelM16773J, bundle);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 1);
    }
}
