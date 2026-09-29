package com.lingq.core.domain.model.lesson;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.b25;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonSentence {
    public static final C1446k Companion = new C1446k();

    /* JADX INFO: renamed from: i */
    public static final cs4[] f19252i;

    /* JADX INFO: renamed from: a */
    public final List f19253a;

    /* JADX INFO: renamed from: b */
    public final String f19254b;

    /* JADX INFO: renamed from: c */
    public final String f19255c;

    /* JADX INFO: renamed from: d */
    public final int f19256d;

    /* JADX INFO: renamed from: e */
    public final List f19257e;

    /* JADX INFO: renamed from: f */
    public final boolean f19258f;

    /* JADX INFO: renamed from: g */
    public final String f19259g;

    /* JADX INFO: renamed from: h */
    public final String f19260h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19252i = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(4)), null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(5)), null, null, null};
    }

    public /* synthetic */ LessonSentence(int i, List list, String str, String str2, int i2, List list2, boolean z, String str3, String str4) {
        if (14 != (i & 14)) {
            n3c.m17204b(i, 14, LessonSentence$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        int i3 = i & 1;
        EmptyList emptyList = EmptyList.f47638a;
        if (i3 == 0) {
            this.f19253a = emptyList;
        } else {
            this.f19253a = list;
        }
        this.f19254b = str;
        this.f19255c = str2;
        this.f19256d = i2;
        if ((i & 16) == 0) {
            this.f19257e = emptyList;
        } else {
            this.f19257e = list2;
        }
        if ((i & 32) == 0) {
            this.f19258f = false;
        } else {
            this.f19258f = z;
        }
        if ((i & 64) == 0) {
            this.f19259g = null;
        } else {
            this.f19259g = str3;
        }
        if ((i & 128) == 0) {
            this.f19260h = null;
        } else {
            this.f19260h = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonSentence)) {
            return false;
        }
        LessonSentence lessonSentence = (LessonSentence) obj;
        return fa4.m11650l(this.f19253a, lessonSentence.f19253a) && fa4.m11650l(this.f19254b, lessonSentence.f19254b) && fa4.m11650l(this.f19255c, lessonSentence.f19255c) && this.f19256d == lessonSentence.f19256d && fa4.m11650l(this.f19257e, lessonSentence.f19257e) && this.f19258f == lessonSentence.f19258f && fa4.m11650l(this.f19259g, lessonSentence.f19259g) && fa4.m11650l(this.f19260h, lessonSentence.f19260h);
    }

    public final int hashCode() {
        int iHashCode = this.f19253a.hashCode() * 31;
        String str = this.f19254b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19255c;
        int iM24106b = wq1.m24106b(this.f19256d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        List list = this.f19257e;
        int iM12428e = g9a.m12428e((iM24106b + (list == null ? 0 : list.hashCode())) * 31, 31, this.f19258f);
        String str3 = this.f19259g;
        int iHashCode3 = (iM12428e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19260h;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonSentence(tokens=");
        sb.append(this.f19253a);
        sb.append(", text=");
        sb.append(this.f19254b);
        sb.append(", normalizedText=");
        AbstractC3393o1.m17748w(this.f19256d, this.f19255c, ", index=", ", timestamp=", sb);
        sb.append(this.f19257e);
        sb.append(", startParagraph=");
        sb.append(this.f19258f);
        sb.append(", url=");
        return wq1.m24125u(sb, this.f19259g, ", opentag=", this.f19260h, ")");
    }

    public LessonSentence(List list, String str, String str2, int i, ArrayList arrayList, boolean z, String str3, String str4) {
        list.getClass();
        this.f19253a = list;
        this.f19254b = str;
        this.f19255c = str2;
        this.f19256d = i;
        this.f19257e = arrayList;
        this.f19258f = z;
        this.f19259g = str3;
        this.f19260h = str4;
    }
}
