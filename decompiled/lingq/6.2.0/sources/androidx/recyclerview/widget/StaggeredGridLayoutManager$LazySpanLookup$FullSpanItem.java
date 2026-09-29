package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new C0728d();

    /* JADX INFO: renamed from: a */
    public int f6704a;

    /* JADX INFO: renamed from: b */
    public int f6705b;

    /* JADX INFO: renamed from: c */
    public int[] f6706c;

    /* JADX INFO: renamed from: d */
    public boolean f6707d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f6704a + ", mGapDir=" + this.f6705b + ", mHasUnwantedGapAfter=" + this.f6707d + ", mGapPerSpan=" + Arrays.toString(this.f6706c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6704a);
        parcel.writeInt(this.f6705b);
        parcel.writeInt(this.f6707d ? 1 : 0);
        int[] iArr = this.f6706c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f6706c);
        }
    }
}
