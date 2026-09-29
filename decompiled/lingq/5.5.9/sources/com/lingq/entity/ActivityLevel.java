package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/ActivityLevel;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ActivityLevel {

    /* JADX INFO: renamed from: a */
    public final int f16849a;

    /* JADX INFO: renamed from: b */
    public final int f16850b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityLevel() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public ActivityLevel(int i10, int i11) {
        this.f16849a = i10;
        this.f16850b = i11;
    }

    public /* synthetic */ ActivityLevel(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityLevel)) {
            return false;
        }
        ActivityLevel activityLevel = (ActivityLevel) obj;
        return this.f16849a == activityLevel.f16849a && this.f16850b == activityLevel.f16850b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16850b) + (Integer.hashCode(this.f16849a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityLevel(id=");
        sb2.append(this.f16849a);
        sb2.append(", score=");
        return C0166e.m768o(sb2, this.f16850b, ")");
    }
}
