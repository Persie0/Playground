package com.lingq.core.domain.model.lesson;

import p000.ey8;
import p000.g9a;
import p000.hn1;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonStats {
    public static final C1449n Companion = new C1449n();

    /* JADX INFO: renamed from: a */
    public final int f19267a;

    /* JADX INFO: renamed from: b */
    public final double f19268b;

    /* JADX INFO: renamed from: c */
    public final double f19269c;

    /* JADX INFO: renamed from: d */
    public final double f19270d;

    /* JADX INFO: renamed from: e */
    public final double f19271e;

    /* JADX INFO: renamed from: f */
    public final double f19272f;

    /* JADX INFO: renamed from: g */
    public final double f19273g;

    /* JADX INFO: renamed from: h */
    public final double f19274h;

    /* JADX INFO: renamed from: i */
    public final double f19275i;

    public /* synthetic */ LessonStats(int i, int i2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if (127 != (i & 127)) {
            n3c.m17204b(i, 127, LessonStats$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19267a = i2;
        this.f19268b = d;
        this.f19269c = d2;
        this.f19270d = d3;
        this.f19271e = d4;
        this.f19272f = d5;
        this.f19273g = d6;
        if ((i & 128) == 0) {
            this.f19274h = 0.0d;
        } else {
            this.f19274h = d7;
        }
        if ((i & 256) == 0) {
            this.f19275i = 0.0d;
        } else {
            this.f19275i = d8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonStats)) {
            return false;
        }
        LessonStats lessonStats = (LessonStats) obj;
        return this.f19267a == lessonStats.f19267a && Double.compare(this.f19268b, lessonStats.f19268b) == 0 && Double.compare(this.f19269c, lessonStats.f19269c) == 0 && Double.compare(this.f19270d, lessonStats.f19270d) == 0 && Double.compare(this.f19271e, lessonStats.f19271e) == 0 && Double.compare(this.f19272f, lessonStats.f19272f) == 0 && Double.compare(this.f19273g, lessonStats.f19273g) == 0 && Double.compare(this.f19274h, lessonStats.f19274h) == 0 && Double.compare(this.f19275i, lessonStats.f19275i) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f19275i) + g9a.m12424a(this.f19274h, g9a.m12424a(this.f19273g, g9a.m12424a(this.f19272f, g9a.m12424a(this.f19271e, g9a.m12424a(this.f19270d, g9a.m12424a(this.f19269c, g9a.m12424a(this.f19268b, Integer.hashCode(this.f19267a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonStats(contentId=");
        sb.append(this.f19267a);
        sb.append(", readWords=");
        sb.append(this.f19268b);
        hn1.m13370t(sb, ", lingqsCreated=", this.f19269c, ", knownWords=");
        sb.append(this.f19270d);
        hn1.m13370t(sb, ", listeningTime=", this.f19271e, ", coinsNew=");
        sb.append(this.f19272f);
        hn1.m13370t(sb, ", earnedCoins=", this.f19273g, ", studyTime=");
        sb.append(this.f19274h);
        sb.append(", wpm=");
        sb.append(this.f19275i);
        sb.append(")");
        return sb.toString();
    }

    public LessonStats(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.f19267a = i;
        this.f19268b = d;
        this.f19269c = d2;
        this.f19270d = d3;
        this.f19271e = d4;
        this.f19272f = d5;
        this.f19273g = d6;
        this.f19274h = d7;
        this.f19275i = d8;
    }
}
