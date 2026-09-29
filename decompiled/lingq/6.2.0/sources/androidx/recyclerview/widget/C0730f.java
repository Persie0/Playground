package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C0730f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f6708a = parcel.readInt();
        savedState.f6709b = parcel.readInt();
        int i = parcel.readInt();
        savedState.f6710c = i;
        if (i > 0) {
            int[] iArr = new int[i];
            savedState.f6711d = iArr;
            parcel.readIntArray(iArr);
        }
        int i2 = parcel.readInt();
        savedState.f6712e = i2;
        if (i2 > 0) {
            int[] iArr2 = new int[i2];
            savedState.f6713f = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.f6715h = parcel.readInt() == 1;
        savedState.f6716i = parcel.readInt() == 1;
        savedState.f6717j = parcel.readInt() == 1;
        savedState.f6714g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new StaggeredGridLayoutManager.SavedState[i];
    }
}
