package com.lingq.core.analytics.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.lingq.core.analytics.data.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1242b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new LqAnalyticsValues$LessonPath.Feed(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LqAnalyticsValues$LessonPath.Feed[i];
    }
}
