package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.media3.common.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0712a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new DrmInitData.SchemeData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DrmInitData.SchemeData[i];
    }
}
