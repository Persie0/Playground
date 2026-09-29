package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0132a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new DefaultLazyKey(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DefaultLazyKey[i];
    }
}
