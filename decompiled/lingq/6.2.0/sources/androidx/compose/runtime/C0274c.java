package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.compose.runtime.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0274c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3727a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3727a) {
            case 0:
                return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
            case 1:
                return new ParcelableSnapshotMutableIntState(parcel.readInt());
            default:
                return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f3727a) {
            case 0:
                return new ParcelableSnapshotMutableFloatState[i];
            case 1:
                return new ParcelableSnapshotMutableIntState[i];
            default:
                return new ParcelableSnapshotMutableLongState[i];
        }
    }
}
