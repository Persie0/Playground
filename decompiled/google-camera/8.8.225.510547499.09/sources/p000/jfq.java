package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jfq extends cbr implements jfr {
    public jfq() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) cbs.m3402a(parcel, Status.CREATOR);
        cbs.m3403b(parcel);
        mo13055b(status);
        return true;
    }
}
