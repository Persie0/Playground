package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C3386nv;
import p000.fa4;
import p000.s46;
import p000.tr3;
import p000.xc9;
import p000.yc9;

/* JADX INFO: loaded from: classes.dex */
final class ParcelableSnapshotMutableState<T> extends xc9 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new C0276d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        s46 s46Var = s46.f60289d;
        yc9 yc9Var = this.f68067b;
        if (fa4.m11650l(yc9Var, s46Var)) {
            i2 = 0;
        } else if (fa4.m11650l(yc9Var, tr3.f62761g)) {
            i2 = 1;
        } else {
            if (!fa4.m11650l(yc9Var, s46.f60290e)) {
                C3386nv.m17633t("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
