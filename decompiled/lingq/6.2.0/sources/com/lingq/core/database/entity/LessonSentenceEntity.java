package com.lingq.core.database.entity;

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
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonSentenceEntity {
    public static final C1362u Companion = new C1362u();

    /* JADX INFO: renamed from: j */
    public static final cs4[] f17334j;

    /* JADX INFO: renamed from: a */
    public final int f17335a;

    /* JADX INFO: renamed from: b */
    public final List f17336b;

    /* JADX INFO: renamed from: c */
    public final String f17337c;

    /* JADX INFO: renamed from: d */
    public final String f17338d;

    /* JADX INFO: renamed from: e */
    public final int f17339e;

    /* JADX INFO: renamed from: f */
    public final List f17340f;

    /* JADX INFO: renamed from: g */
    public final boolean f17341g;

    /* JADX INFO: renamed from: h */
    public final String f17342h;

    /* JADX INFO: renamed from: i */
    public final String f17343i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f17334j = new cs4[]{null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(6)), null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(7)), null, null, null};
    }

    public /* synthetic */ LessonSentenceEntity(int i, int i2, int i3, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        if (29 != (i & 29)) {
            n3c.m17204b(i, 29, LessonSentenceEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17335a = i2;
        int i4 = i & 2;
        EmptyList emptyList = EmptyList.f47638a;
        if (i4 == 0) {
            this.f17336b = emptyList;
        } else {
            this.f17336b = list;
        }
        this.f17337c = str;
        this.f17338d = str2;
        this.f17339e = i3;
        if ((i & 32) == 0) {
            this.f17340f = emptyList;
        } else {
            this.f17340f = list2;
        }
        if ((i & 64) == 0) {
            this.f17341g = false;
        } else {
            this.f17341g = z;
        }
        if ((i & 128) == 0) {
            this.f17342h = null;
        } else {
            this.f17342h = str3;
        }
        if ((i & 256) == 0) {
            this.f17343i = null;
        } else {
            this.f17343i = str4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static LessonSentenceEntity m7737a(LessonSentenceEntity lessonSentenceEntity, ArrayList arrayList) {
        return new LessonSentenceEntity(lessonSentenceEntity.f17335a, arrayList, lessonSentenceEntity.f17337c, lessonSentenceEntity.f17338d, lessonSentenceEntity.f17339e, lessonSentenceEntity.f17340f, lessonSentenceEntity.f17341g, lessonSentenceEntity.f17342h, lessonSentenceEntity.f17343i);
    }

    /* JADX INFO: renamed from: b */
    public final int m7738b() {
        return this.f17339e;
    }

    /* JADX INFO: renamed from: c */
    public final int m7739c() {
        return this.f17335a;
    }

    /* JADX INFO: renamed from: d */
    public final String m7740d() {
        return this.f17338d;
    }

    /* JADX INFO: renamed from: e */
    public final String m7741e() {
        return this.f17343i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonSentenceEntity)) {
            return false;
        }
        LessonSentenceEntity lessonSentenceEntity = (LessonSentenceEntity) obj;
        return this.f17335a == lessonSentenceEntity.f17335a && fa4.m11650l(this.f17336b, lessonSentenceEntity.f17336b) && fa4.m11650l(this.f17337c, lessonSentenceEntity.f17337c) && fa4.m11650l(this.f17338d, lessonSentenceEntity.f17338d) && this.f17339e == lessonSentenceEntity.f17339e && fa4.m11650l(this.f17340f, lessonSentenceEntity.f17340f) && this.f17341g == lessonSentenceEntity.f17341g && fa4.m11650l(this.f17342h, lessonSentenceEntity.f17342h) && fa4.m11650l(this.f17343i, lessonSentenceEntity.f17343i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7742f() {
        return this.f17341g;
    }

    /* JADX INFO: renamed from: g */
    public final String m7743g() {
        return this.f17337c;
    }

    /* JADX INFO: renamed from: h */
    public final List m7744h() {
        return this.f17340f;
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(Integer.hashCode(this.f17335a) * 31, 31, this.f17336b);
        String str = this.f17337c;
        int iHashCode = (iM22979b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17338d;
        int iM24106b = wq1.m24106b(this.f17339e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        List list = this.f17340f;
        int iM12428e = g9a.m12428e((iM24106b + (list == null ? 0 : list.hashCode())) * 31, 31, this.f17341g);
        String str3 = this.f17342h;
        int iHashCode2 = (iM12428e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17343i;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List m7745i() {
        return this.f17336b;
    }

    /* JADX INFO: renamed from: j */
    public final String m7746j() {
        return this.f17342h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonSentenceEntity(lessonId=");
        sb.append(this.f17335a);
        sb.append(", tokens=");
        sb.append(this.f17336b);
        sb.append(", text=");
        AbstractC3393o1.m17725C(sb, this.f17337c, ", normalizedText=", this.f17338d, ", index=");
        sb.append(this.f17339e);
        sb.append(", timestamp=");
        sb.append(this.f17340f);
        sb.append(", startParagraph=");
        hn1.m13367q(", url=", this.f17342h, ", opentag=", sb, this.f17341g);
        return AbstractC3393o1.m17738m(sb, this.f17343i, ")");
    }

    public LessonSentenceEntity(int i, List list, String str, String str2, int i2, List list2, boolean z, String str3, String str4) {
        list.getClass();
        this.f17335a = i;
        this.f17336b = list;
        this.f17337c = str;
        this.f17338d = str2;
        this.f17339e = i2;
        this.f17340f = list2;
        this.f17341g = z;
        this.f17342h = str3;
        this.f17343i = str4;
    }
}
