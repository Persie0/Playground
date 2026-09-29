package com.lingq.core.token;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.lingq.core.token.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1911g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return TokenViewState.Expanded.f23709a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TokenViewState.Expanded[i];
    }
}
