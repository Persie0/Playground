package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonNextSuggestionEntity {
    public static final C1361t Companion = new C1361t();

    /* JADX INFO: renamed from: a */
    public final int f17326a;

    /* JADX INFO: renamed from: b */
    public final int f17327b;

    /* JADX INFO: renamed from: c */
    public final String f17328c;

    /* JADX INFO: renamed from: d */
    public final String f17329d;

    /* JADX INFO: renamed from: e */
    public final String f17330e;

    /* JADX INFO: renamed from: f */
    public final String f17331f;

    /* JADX INFO: renamed from: g */
    public final String f17332g;

    /* JADX INFO: renamed from: h */
    public final String f17333h;

    public /* synthetic */ LessonNextSuggestionEntity(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, LessonNextSuggestionEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17326a = i2;
        this.f17327b = i3;
        this.f17328c = str;
        if ((i & 8) == 0) {
            this.f17329d = null;
        } else {
            this.f17329d = str2;
        }
        if ((i & 16) == 0) {
            this.f17330e = null;
        } else {
            this.f17330e = str3;
        }
        if ((i & 32) == 0) {
            this.f17331f = null;
        } else {
            this.f17331f = str4;
        }
        if ((i & 64) == 0) {
            this.f17332g = null;
        } else {
            this.f17332g = str5;
        }
        if ((i & 128) == 0) {
            this.f17333h = null;
        } else {
            this.f17333h = str6;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m7729a() {
        return this.f17326a;
    }

    /* JADX INFO: renamed from: b */
    public final String m7730b() {
        return this.f17329d;
    }

    /* JADX INFO: renamed from: c */
    public final int m7731c() {
        return this.f17327b;
    }

    /* JADX INFO: renamed from: d */
    public final String m7732d() {
        return this.f17331f;
    }

    /* JADX INFO: renamed from: e */
    public final String m7733e() {
        return this.f17330e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonNextSuggestionEntity)) {
            return false;
        }
        LessonNextSuggestionEntity lessonNextSuggestionEntity = (LessonNextSuggestionEntity) obj;
        return this.f17326a == lessonNextSuggestionEntity.f17326a && this.f17327b == lessonNextSuggestionEntity.f17327b && fa4.m11650l(this.f17328c, lessonNextSuggestionEntity.f17328c) && fa4.m11650l(this.f17329d, lessonNextSuggestionEntity.f17329d) && fa4.m11650l(this.f17330e, lessonNextSuggestionEntity.f17330e) && fa4.m11650l(this.f17331f, lessonNextSuggestionEntity.f17331f) && fa4.m11650l(this.f17332g, lessonNextSuggestionEntity.f17332g) && fa4.m11650l(this.f17333h, lessonNextSuggestionEntity.f17333h);
    }

    /* JADX INFO: renamed from: f */
    public final String m7734f() {
        return this.f17332g;
    }

    /* JADX INFO: renamed from: g */
    public final String m7735g() {
        return this.f17333h;
    }

    /* JADX INFO: renamed from: h */
    public final String m7736h() {
        return this.f17328c;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f17327b, Integer.hashCode(this.f17326a) * 31, 31), this.f17328c, 31);
        String str = this.f17329d;
        int iHashCode = (iM22980c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17330e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17331f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17332g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17333h;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f17326a, this.f17327b, "LessonNextSuggestionEntity(id=", ", lessonId=", ", title=");
        AbstractC3393o1.m17725C(sbM22994q, this.f17328c, ", image=", this.f17329d, ", sourceType=");
        AbstractC3393o1.m17725C(sbM22994q, this.f17330e, ", sourceName=", this.f17331f, ", sourceUrl=");
        return wq1.m24125u(sbM22994q, this.f17332g, ", status=", this.f17333h, ")");
    }

    public LessonNextSuggestionEntity(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f17326a = i;
        this.f17327b = i2;
        this.f17328c = str;
        this.f17329d = str2;
        this.f17330e = str3;
        this.f17331f = str4;
        this.f17332g = str5;
        this.f17333h = str6;
    }
}
