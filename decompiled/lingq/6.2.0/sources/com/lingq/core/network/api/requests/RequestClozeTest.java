package com.lingq.core.network.api.requests;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.tx5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestClozeTest {
    public static final C1586m Companion = new C1586m();

    /* JADX INFO: renamed from: e */
    public static final cs4[] f20337e;

    /* JADX INFO: renamed from: a */
    public final String f20338a;

    /* JADX INFO: renamed from: b */
    public final List f20339b;

    /* JADX INFO: renamed from: c */
    public final List f20340c;

    /* JADX INFO: renamed from: d */
    public final boolean f20341d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20337e = new cs4[]{null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new tx5(18)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new tx5(19)), null};
    }

    public /* synthetic */ RequestClozeTest(int i, String str, List list, List list2, boolean z) {
        if ((i & 1) == 0) {
            this.f20338a = null;
        } else {
            this.f20338a = str;
        }
        if ((i & 2) == 0) {
            this.f20339b = null;
        } else {
            this.f20339b = list;
        }
        if ((i & 4) == 0) {
            this.f20340c = null;
        } else {
            this.f20340c = list2;
        }
        if ((i & 8) == 0) {
            this.f20341d = false;
        } else {
            this.f20341d = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestClozeTest)) {
            return false;
        }
        RequestClozeTest requestClozeTest = (RequestClozeTest) obj;
        return fa4.m11650l(this.f20338a, requestClozeTest.f20338a) && fa4.m11650l(this.f20339b, requestClozeTest.f20339b) && fa4.m11650l(this.f20340c, requestClozeTest.f20340c) && this.f20341d == requestClozeTest.f20341d;
    }

    public final int hashCode() {
        String str = this.f20338a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f20339b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f20340c;
        return Boolean.hashCode(this.f20341d) + ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RequestClozeTest(text=" + this.f20338a + ", fragments=" + this.f20339b + ", incorrectAnswers=" + this.f20340c + ", isFound=" + this.f20341d + ")";
    }
}
