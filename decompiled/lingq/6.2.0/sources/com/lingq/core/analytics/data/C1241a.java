package com.lingq.core.analytics.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.lingq.core.analytics.data.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1241a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return LqAnalyticsValues$LessonPath.Deeplink.f14306a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LqAnalyticsValues$LessonPath.Deeplink[i];
    }
}
