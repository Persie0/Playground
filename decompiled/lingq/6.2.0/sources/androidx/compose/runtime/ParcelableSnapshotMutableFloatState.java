package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import p000.jc9;
import p000.nc9;
import p000.pc9;
import p000.qc9;
import p000.yn3;

/* JADX INFO: loaded from: classes.dex */
final class ParcelableSnapshotMutableFloatState extends qc9 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new C0274c(0);

    public ParcelableSnapshotMutableFloatState(float f) {
        jc9 jc9VarM17358j = nc9.m17358j();
        pc9 pc9Var = new pc9(f, jc9VarM17358j.mo3582g());
        if (!(jc9VarM17358j instanceof yn3)) {
            pc9Var.f59323b = new pc9(f, 1L);
        }
        this.f57585b = pc9Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(m19861h());
    }
}
