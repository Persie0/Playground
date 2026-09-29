package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonSentencesTranslation {
    public static final C1638d2 Companion = new C1638d2();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f21108c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(16))};

    /* JADX INFO: renamed from: a */
    public final String f21109a;

    /* JADX INFO: renamed from: b */
    public final List f21110b;

    public /* synthetic */ ResultLessonSentencesTranslation(int i, String str, List list) {
        if ((i & 1) == 0) {
            this.f21109a = null;
        } else {
            this.f21109a = str;
        }
        if ((i & 2) == 0) {
            this.f21110b = null;
        } else {
            this.f21110b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonSentencesTranslation)) {
            return false;
        }
        ResultLessonSentencesTranslation resultLessonSentencesTranslation = (ResultLessonSentencesTranslation) obj;
        return fa4.m11650l(this.f21109a, resultLessonSentencesTranslation.f21109a) && fa4.m11650l(this.f21110b, resultLessonSentencesTranslation.f21110b);
    }

    public final int hashCode() {
        String str = this.f21109a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f21110b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ResultLessonSentencesTranslation(language=" + this.f21109a + ", sentences=" + this.f21110b + ")";
    }
}
