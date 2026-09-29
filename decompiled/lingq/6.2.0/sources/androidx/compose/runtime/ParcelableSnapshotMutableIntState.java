package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import p000.jc9;
import p000.nc9;
import p000.rc9;
import p000.sc9;
import p000.yn3;

/* JADX INFO: loaded from: classes.dex */
final class ParcelableSnapshotMutableIntState extends sc9 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new C0274c(1);

    public ParcelableSnapshotMutableIntState(int i) {
        jc9 jc9VarM17358j = nc9.m17358j();
        rc9 rc9Var = new rc9(i, jc9VarM17358j.mo3582g());
        if (!(jc9VarM17358j instanceof yn3)) {
            rc9Var.f59323b = new rc9(i, 1L);
        }
        this.f60687b = rc9Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(m21222h());
    }
}
