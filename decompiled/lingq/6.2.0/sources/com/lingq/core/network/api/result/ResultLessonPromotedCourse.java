package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonPromotedCourse {
    public static final C1624b2 Companion = new C1624b2();

    /* JADX INFO: renamed from: a */
    public final String f21096a;

    /* JADX INFO: renamed from: b */
    public final String f21097b;

    /* JADX INFO: renamed from: c */
    public final String f21098c;

    public /* synthetic */ ResultLessonPromotedCourse(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f21096a = null;
        } else {
            this.f21096a = str;
        }
        if ((i & 2) == 0) {
            this.f21097b = null;
        } else {
            this.f21097b = str2;
        }
        if ((i & 4) == 0) {
            this.f21098c = null;
        } else {
            this.f21098c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonPromotedCourse)) {
            return false;
        }
        ResultLessonPromotedCourse resultLessonPromotedCourse = (ResultLessonPromotedCourse) obj;
        return fa4.m11650l(this.f21096a, resultLessonPromotedCourse.f21096a) && fa4.m11650l(this.f21097b, resultLessonPromotedCourse.f21097b) && fa4.m11650l(this.f21098c, resultLessonPromotedCourse.f21098c);
    }

    public final int hashCode() {
        String str = this.f21096a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21097b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21098c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultLessonPromotedCourse(ctaText=", this.f21096a, ", description=", this.f21097b, ", ctaUrl="), this.f21098c, ")");
    }
}
