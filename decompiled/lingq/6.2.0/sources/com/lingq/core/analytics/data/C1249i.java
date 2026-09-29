package com.lingq.core.analytics.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.lingq.core.analytics.data.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C1249i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return LqAnalyticsValues$LessonPath.Unknown.f14315a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LqAnalyticsValues$LessonPath.Unknown[i];
    }
}
