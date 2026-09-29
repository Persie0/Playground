package com.lingq.core.database.entity;

import p000.ey8;
import p000.g9a;
import p000.hn1;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonStatsEntity {
    public static final C1363v Companion = new C1363v();

    /* JADX INFO: renamed from: a */
    public final int f17344a;

    /* JADX INFO: renamed from: b */
    public final double f17345b;

    /* JADX INFO: renamed from: c */
    public final double f17346c;

    /* JADX INFO: renamed from: d */
    public final double f17347d;

    /* JADX INFO: renamed from: e */
    public final double f17348e;

    /* JADX INFO: renamed from: f */
    public final double f17349f;

    /* JADX INFO: renamed from: g */
    public final double f17350g;

    /* JADX INFO: renamed from: h */
    public final double f17351h;

    /* JADX INFO: renamed from: i */
    public final double f17352i;

    public /* synthetic */ LessonStatsEntity(int i, int i2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if (127 != (i & 127)) {
            n3c.m17204b(i, 127, LessonStatsEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17344a = i2;
        this.f17345b = d;
        this.f17346c = d2;
        this.f17347d = d3;
        this.f17348e = d4;
        this.f17349f = d5;
        this.f17350g = d6;
        if ((i & 128) == 0) {
            this.f17351h = 0.0d;
        } else {
            this.f17351h = d7;
        }
        if ((i & 256) == 0) {
            this.f17352i = 0.0d;
        } else {
            this.f17352i = d8;
        }
    }

    /* JADX INFO: renamed from: a */
    public final double m7747a() {
        return this.f17349f;
    }

    /* JADX INFO: renamed from: b */
    public final int m7748b() {
        return this.f17344a;
    }

    /* JADX INFO: renamed from: c */
    public final double m7749c() {
        return this.f17350g;
    }

    /* JADX INFO: renamed from: d */
    public final double m7750d() {
        return this.f17347d;
    }

    /* JADX INFO: renamed from: e */
    public final double m7751e() {
        return this.f17346c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonStatsEntity)) {
            return false;
        }
        LessonStatsEntity lessonStatsEntity = (LessonStatsEntity) obj;
        return this.f17344a == lessonStatsEntity.f17344a && Double.compare(this.f17345b, lessonStatsEntity.f17345b) == 0 && Double.compare(this.f17346c, lessonStatsEntity.f17346c) == 0 && Double.compare(this.f17347d, lessonStatsEntity.f17347d) == 0 && Double.compare(this.f17348e, lessonStatsEntity.f17348e) == 0 && Double.compare(this.f17349f, lessonStatsEntity.f17349f) == 0 && Double.compare(this.f17350g, lessonStatsEntity.f17350g) == 0 && Double.compare(this.f17351h, lessonStatsEntity.f17351h) == 0 && Double.compare(this.f17352i, lessonStatsEntity.f17352i) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final double m7752f() {
        return this.f17348e;
    }

    /* JADX INFO: renamed from: g */
    public final double m7753g() {
        return this.f17345b;
    }

    /* JADX INFO: renamed from: h */
    public final double m7754h() {
        return this.f17351h;
    }

    public final int hashCode() {
        return Double.hashCode(this.f17352i) + g9a.m12424a(this.f17351h, g9a.m12424a(this.f17350g, g9a.m12424a(this.f17349f, g9a.m12424a(this.f17348e, g9a.m12424a(this.f17347d, g9a.m12424a(this.f17346c, g9a.m12424a(this.f17345b, Integer.hashCode(this.f17344a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final double m7755i() {
        return this.f17352i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonStatsEntity(contentId=");
        sb.append(this.f17344a);
        sb.append(", readWords=");
        sb.append(this.f17345b);
        hn1.m13370t(sb, ", lingqsCreated=", this.f17346c, ", knownWords=");
        sb.append(this.f17347d);
        hn1.m13370t(sb, ", listeningTime=", this.f17348e, ", coinsNew=");
        sb.append(this.f17349f);
        hn1.m13370t(sb, ", earnedCoins=", this.f17350g, ", studyTime=");
        sb.append(this.f17351h);
        sb.append(", wpm=");
        sb.append(this.f17352i);
        sb.append(")");
        return sb.toString();
    }

    public LessonStatsEntity(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.f17344a = i;
        this.f17345b = d;
        this.f17346c = d2;
        this.f17347d = d3;
        this.f17348e = d4;
        this.f17349f = d5;
        this.f17350g = d6;
        this.f17351h = d7;
        this.f17352i = d8;
    }
}
