package androidx.swiperefreshlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0766a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SwipeRefreshLayout.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SwipeRefreshLayout.SavedState[i];
    }
}
