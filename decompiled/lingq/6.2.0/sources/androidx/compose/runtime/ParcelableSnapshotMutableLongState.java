package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import p000.jc9;
import p000.nc9;
import p000.tc9;
import p000.uc9;
import p000.yn3;

/* JADX INFO: loaded from: classes.dex */
final class ParcelableSnapshotMutableLongState extends uc9 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new C0274c(2);

    public ParcelableSnapshotMutableLongState(long j) {
        jc9 jc9VarM17358j = nc9.m17358j();
        tc9 tc9Var = new tc9(jc9VarM17358j.mo3582g(), j);
        if (!(jc9VarM17358j instanceof yn3)) {
            tc9Var.f59323b = new tc9(1L, j);
        }
        this.f63721b = tc9Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(m22673h());
    }
}
