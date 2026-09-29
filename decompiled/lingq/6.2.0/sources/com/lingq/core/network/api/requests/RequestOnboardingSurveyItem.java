package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestOnboardingSurveyItem {
    public static final C1587m0 Companion = new C1587m0();

    /* JADX INFO: renamed from: a */
    public final String f20413a;

    /* JADX INFO: renamed from: b */
    public final String f20414b;

    public /* synthetic */ RequestOnboardingSurveyItem(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, RequestOnboardingSurveyItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20413a = str;
        this.f20414b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestOnboardingSurveyItem)) {
            return false;
        }
        RequestOnboardingSurveyItem requestOnboardingSurveyItem = (RequestOnboardingSurveyItem) obj;
        return fa4.m11650l(this.f20413a, requestOnboardingSurveyItem.f20413a) && fa4.m11650l(this.f20414b, requestOnboardingSurveyItem.f20414b);
    }

    public final int hashCode() {
        return this.f20414b.hashCode() + (this.f20413a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("RequestOnboardingSurveyItem(question=", this.f20413a, ", response=", this.f20414b, ")");
    }

    public RequestOnboardingSurveyItem(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20413a = str;
        this.f20414b = str2;
    }
}
