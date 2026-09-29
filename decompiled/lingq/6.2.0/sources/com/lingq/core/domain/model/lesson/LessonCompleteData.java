package com.lingq.core.domain.model.lesson;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonCompleteData {
    public static final C1439d Companion = new C1439d();

    /* JADX INFO: renamed from: a */
    public final int f19204a;

    /* JADX INFO: renamed from: b */
    public final Integer f19205b;

    /* JADX INFO: renamed from: c */
    public final int f19206c;

    /* JADX INFO: renamed from: d */
    public final String f19207d;

    /* JADX INFO: renamed from: e */
    public final double f19208e;

    /* JADX INFO: renamed from: f */
    public final double f19209f;

    /* JADX INFO: renamed from: g */
    public final int f19210g;

    /* JADX INFO: renamed from: h */
    public final int f19211h;

    /* JADX INFO: renamed from: i */
    public final boolean f19212i;

    /* JADX INFO: renamed from: j */
    public final boolean f19213j;

    /* JADX INFO: renamed from: k */
    public final String f19214k;

    /* JADX INFO: renamed from: l */
    public final String f19215l;

    /* JADX INFO: renamed from: m */
    public final String f19216m;

    /* JADX INFO: renamed from: n */
    public final boolean f19217n;

    /* JADX INFO: renamed from: o */
    public final String f19218o;

    /* JADX INFO: renamed from: p */
    public final int f19219p;

    /* JADX INFO: renamed from: q */
    public final LessonReference f19220q;

    /* JADX INFO: renamed from: r */
    public final LessonReference f19221r;

    public /* synthetic */ LessonCompleteData(int i, int i2, Integer num, int i3, String str, double d, double d2, int i4, int i5, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, String str5, int i6, LessonReference lessonReference, LessonReference lessonReference2) {
        if (6144 != (i & 6144)) {
            n3c.m17204b(i, 6144, LessonCompleteData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f19204a = 0;
        } else {
            this.f19204a = i2;
        }
        if ((i & 2) == 0) {
            this.f19205b = 0;
        } else {
            this.f19205b = num;
        }
        if ((i & 4) == 0) {
            this.f19206c = 0;
        } else {
            this.f19206c = i3;
        }
        if ((i & 8) == 0) {
            this.f19207d = "";
        } else {
            this.f19207d = str;
        }
        if ((i & 16) == 0) {
            this.f19208e = 0.0d;
        } else {
            this.f19208e = d;
        }
        if ((i & 32) == 0) {
            this.f19209f = 0.0d;
        } else {
            this.f19209f = d2;
        }
        if ((i & 64) == 0) {
            this.f19210g = 0;
        } else {
            this.f19210g = i4;
        }
        if ((i & 128) == 0) {
            this.f19211h = 0;
        } else {
            this.f19211h = i5;
        }
        if ((i & 256) == 0) {
            this.f19212i = false;
        } else {
            this.f19212i = z;
        }
        if ((i & 512) == 0) {
            this.f19213j = false;
        } else {
            this.f19213j = z2;
        }
        if ((i & 1024) == 0) {
            this.f19214k = "";
        } else {
            this.f19214k = str2;
        }
        this.f19215l = str3;
        this.f19216m = str4;
        if ((i & 8192) == 0) {
            this.f19217n = false;
        } else {
            this.f19217n = z3;
        }
        if ((i & 16384) == 0) {
            this.f19218o = null;
        } else {
            this.f19218o = str5;
        }
        if ((32768 & i) == 0) {
            this.f19219p = 0;
        } else {
            this.f19219p = i6;
        }
        if ((65536 & i) == 0) {
            this.f19220q = null;
        } else {
            this.f19220q = lessonReference;
        }
        if ((i & 131072) == 0) {
            this.f19221r = null;
        } else {
            this.f19221r = lessonReference2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonCompleteData)) {
            return false;
        }
        LessonCompleteData lessonCompleteData = (LessonCompleteData) obj;
        return this.f19204a == lessonCompleteData.f19204a && fa4.m11650l(this.f19205b, lessonCompleteData.f19205b) && this.f19206c == lessonCompleteData.f19206c && fa4.m11650l(this.f19207d, lessonCompleteData.f19207d) && Double.compare(this.f19208e, lessonCompleteData.f19208e) == 0 && Double.compare(this.f19209f, lessonCompleteData.f19209f) == 0 && this.f19210g == lessonCompleteData.f19210g && this.f19211h == lessonCompleteData.f19211h && this.f19212i == lessonCompleteData.f19212i && this.f19213j == lessonCompleteData.f19213j && fa4.m11650l(this.f19214k, lessonCompleteData.f19214k) && fa4.m11650l(this.f19215l, lessonCompleteData.f19215l) && fa4.m11650l(this.f19216m, lessonCompleteData.f19216m) && this.f19217n == lessonCompleteData.f19217n && fa4.m11650l(this.f19218o, lessonCompleteData.f19218o) && this.f19219p == lessonCompleteData.f19219p && fa4.m11650l(this.f19220q, lessonCompleteData.f19220q) && fa4.m11650l(this.f19221r, lessonCompleteData.f19221r);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f19204a) * 31;
        Integer num = this.f19205b;
        int iM24106b = wq1.m24106b(this.f19206c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.f19207d;
        int iM12428e = g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f19211h, wq1.m24106b(this.f19210g, g9a.m12424a(this.f19209f, g9a.m12424a(this.f19208e, (iM24106b + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31, this.f19212i), 31, this.f19213j);
        String str2 = this.f19214k;
        int iHashCode2 = (iM12428e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19215l;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19216m;
        int iM12428e2 = g9a.m12428e((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f19217n);
        String str5 = this.f19218o;
        int iM24106b2 = wq1.m24106b(this.f19219p, (iM12428e2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        LessonReference lessonReference = this.f19220q;
        int iHashCode4 = (iM24106b2 + (lessonReference == null ? 0 : lessonReference.hashCode())) * 31;
        LessonReference lessonReference2 = this.f19221r;
        return iHashCode4 + (lessonReference2 != null ? lessonReference2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonCompleteData(id=");
        sb.append(this.f19204a);
        sb.append(", nextLessonId=");
        sb.append(this.f19205b);
        sb.append(", collectionId=");
        hn1.m13361k(this.f19206c, ", collectionTitle=", this.f19207d, ", readTimes=", sb);
        sb.append(this.f19208e);
        hn1.m13370t(sb, ", listenTimes=", this.f19209f, ", duration=");
        hn1.m13360j(this.f19210g, this.f19211h, ", wordCount=", ", isFavorite=", sb);
        wq1.m24101A(sb, this.f19212i, ", isRoseGiven=", this.f19213j, ", url=");
        AbstractC3393o1.m17725C(sb, this.f19214k, ", audioUrl=", this.f19215l, ", originalImageUrl=");
        ux5.m22976C(this.f19216m, ", isCompleted=", ", status=", sb, this.f19217n);
        AbstractC3393o1.m17748w(this.f19219p, this.f19218o, ", price=", ", nextLesson=", sb);
        sb.append(this.f19220q);
        sb.append(", previousLesson=");
        sb.append(this.f19221r);
        sb.append(")");
        return sb.toString();
    }

    public LessonCompleteData(int i, Integer num, int i2, String str, double d, double d2, int i3, int i4, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, String str5, int i5, LessonReference lessonReference, LessonReference lessonReference2) {
        this.f19204a = i;
        this.f19205b = num;
        this.f19206c = i2;
        this.f19207d = str;
        this.f19208e = d;
        this.f19209f = d2;
        this.f19210g = i3;
        this.f19211h = i4;
        this.f19212i = z;
        this.f19213j = z2;
        this.f19214k = str2;
        this.f19215l = str3;
        this.f19216m = str4;
        this.f19217n = z3;
        this.f19218o = str5;
        this.f19219p = i5;
        this.f19220q = lessonReference;
        this.f19221r = lessonReference2;
    }
}
