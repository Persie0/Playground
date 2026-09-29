package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultErrorLesson {
    public static final C1656g1 Companion = new C1656g1();

    /* JADX INFO: renamed from: a */
    public final String f20840a;

    /* JADX INFO: renamed from: b */
    public final String f20841b;

    public /* synthetic */ ResultErrorLesson(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f20840a = "";
        } else {
            this.f20840a = str;
        }
        if ((i & 2) == 0) {
            this.f20841b = "";
        } else {
            this.f20841b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8355a() {
        return this.f20840a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultErrorLesson)) {
            return false;
        }
        ResultErrorLesson resultErrorLesson = (ResultErrorLesson) obj;
        return fa4.m11650l(this.f20840a, resultErrorLesson.f20840a) && fa4.m11650l(this.f20841b, resultErrorLesson.f20841b);
    }

    public final int hashCode() {
        return this.f20841b.hashCode() + (this.f20840a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ResultErrorLesson(detail=", this.f20840a, ", isLocked=", this.f20841b, ")");
    }
}
