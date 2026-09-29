package com.lingq.core.domain.model.lesson;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.b25;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonTranslationSentence {
    public static final C1451p Companion = new C1451p();

    /* JADX INFO: renamed from: h */
    public static final cs4[] f19291h;

    /* JADX INFO: renamed from: a */
    public final int f19292a;

    /* JADX INFO: renamed from: b */
    public final int f19293b;

    /* JADX INFO: renamed from: c */
    public final Double f19294c;

    /* JADX INFO: renamed from: d */
    public final Double f19295d;

    /* JADX INFO: renamed from: e */
    public final String f19296e;

    /* JADX INFO: renamed from: f */
    public final List f19297f;

    /* JADX INFO: renamed from: g */
    public final List f19298g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19291h = new cs4[]{null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(10)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(11))};
    }

    public /* synthetic */ LessonTranslationSentence(int i, int i2, int i3, Double d, Double d2, String str, List list, List list2) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, LessonTranslationSentence$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19292a = i2;
        this.f19293b = i3;
        this.f19294c = d;
        this.f19295d = d2;
        if ((i & 16) == 0) {
            this.f19296e = "";
        } else {
            this.f19296e = str;
        }
        int i4 = i & 32;
        EmptyList emptyList = EmptyList.f47638a;
        if (i4 == 0) {
            this.f19297f = emptyList;
        } else {
            this.f19297f = list;
        }
        if ((i & 64) == 0) {
            this.f19298g = emptyList;
        } else {
            this.f19298g = list2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8068a() {
        return this.f19292a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonTranslationSentence)) {
            return false;
        }
        LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) obj;
        return this.f19292a == lessonTranslationSentence.f19292a && this.f19293b == lessonTranslationSentence.f19293b && fa4.m11650l(this.f19294c, lessonTranslationSentence.f19294c) && fa4.m11650l(this.f19295d, lessonTranslationSentence.f19295d) && fa4.m11650l(this.f19296e, lessonTranslationSentence.f19296e) && fa4.m11650l(this.f19297f, lessonTranslationSentence.f19297f) && fa4.m11650l(this.f19298g, lessonTranslationSentence.f19298g);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f19293b, Integer.hashCode(this.f19292a) * 31, 31);
        Double d = this.f19294c;
        int iHashCode = (iM24106b + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f19295d;
        return this.f19298g.hashCode() + ux5.m22979b(ux5.m22980c((iHashCode + (d2 != null ? d2.hashCode() : 0)) * 31, this.f19296e, 31), 31, this.f19297f);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f19292a, this.f19293b, "LessonTranslationSentence(index=", ", lessonId=", ", audio=");
        sbM22994q.append(this.f19294c);
        sbM22994q.append(", audioEnd=");
        sbM22994q.append(this.f19295d);
        sbM22994q.append(", text=");
        hn1.m13366p(this.f19296e, ", translations=", ", notes=", sbM22994q, this.f19297f);
        return hn1.m13356f(sbM22994q, this.f19298g, ")");
    }

    public LessonTranslationSentence(int i, int i2, Double d, Double d2, String str, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f19292a = i;
        this.f19293b = i2;
        this.f19294c = d;
        this.f19295d = d2;
        this.f19296e = str;
        this.f19297f = list;
        this.f19298g = list2;
    }
}
