package p000;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u9c extends mcb implements cac {
    public u9c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 6);
    }

    @Override // p000.cac
    /* JADX INFO: renamed from: y */
    public final void mo4481y(List list) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeTypedList(list);
        m16777N(parcelM16773J);
    }
}
