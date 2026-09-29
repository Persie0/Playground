package com.lingq.core.database.entity;

import com.lingq.core.domain.model.language.LanguageStatValue;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LanguageStatsEntity {
    public static final C1352o Companion = new C1352o();

    /* JADX INFO: renamed from: A */
    public final LanguageStatValue f17200A;

    /* JADX INFO: renamed from: B */
    public final LanguageStatValue f17201B;

    /* JADX INFO: renamed from: a */
    public final String f17202a;

    /* JADX INFO: renamed from: b */
    public final String f17203b;

    /* JADX INFO: renamed from: c */
    public final String f17204c;

    /* JADX INFO: renamed from: d */
    public final LanguageStatValue f17205d;

    /* JADX INFO: renamed from: e */
    public final LanguageStatValue f17206e;

    /* JADX INFO: renamed from: f */
    public final LanguageStatValue f17207f;

    /* JADX INFO: renamed from: g */
    public final LanguageStatValue f17208g;

    /* JADX INFO: renamed from: h */
    public final LanguageStatValue f17209h;

    /* JADX INFO: renamed from: i */
    public final LanguageStatValue f17210i;

    /* JADX INFO: renamed from: j */
    public final LanguageStatValue f17211j;

    /* JADX INFO: renamed from: k */
    public final LanguageStatValue f17212k;

    /* JADX INFO: renamed from: l */
    public final LanguageStatValue f17213l;

    /* JADX INFO: renamed from: m */
    public final LanguageStatValue f17214m;

    /* JADX INFO: renamed from: n */
    public final LanguageStatValue f17215n;

    /* JADX INFO: renamed from: o */
    public final LanguageStatValue f17216o;

    /* JADX INFO: renamed from: p */
    public final LanguageStatValue f17217p;

    /* JADX INFO: renamed from: q */
    public final LanguageStatValue f17218q;

    /* JADX INFO: renamed from: r */
    public final LanguageStatValue f17219r;

    /* JADX INFO: renamed from: s */
    public final LanguageStatValue f17220s;

    /* JADX INFO: renamed from: t */
    public final LanguageStatValue f17221t;

    /* JADX INFO: renamed from: u */
    public final LanguageStatValue f17222u;

    /* JADX INFO: renamed from: v */
    public final LanguageStatValue f17223v;

    /* JADX INFO: renamed from: w */
    public final LanguageStatValue f17224w;

    /* JADX INFO: renamed from: x */
    public final LanguageStatValue f17225x;

    /* JADX INFO: renamed from: y */
    public final LanguageStatValue f17226y;

    /* JADX INFO: renamed from: z */
    public final LanguageStatValue f17227z;

    public /* synthetic */ LanguageStatsEntity(int i, String str, String str2, String str3, LanguageStatValue languageStatValue, LanguageStatValue languageStatValue2, LanguageStatValue languageStatValue3, LanguageStatValue languageStatValue4, LanguageStatValue languageStatValue5, LanguageStatValue languageStatValue6, LanguageStatValue languageStatValue7, LanguageStatValue languageStatValue8, LanguageStatValue languageStatValue9, LanguageStatValue languageStatValue10, LanguageStatValue languageStatValue11, LanguageStatValue languageStatValue12, LanguageStatValue languageStatValue13, LanguageStatValue languageStatValue14, LanguageStatValue languageStatValue15, LanguageStatValue languageStatValue16, LanguageStatValue languageStatValue17, LanguageStatValue languageStatValue18, LanguageStatValue languageStatValue19, LanguageStatValue languageStatValue20, LanguageStatValue languageStatValue21, LanguageStatValue languageStatValue22, LanguageStatValue languageStatValue23, LanguageStatValue languageStatValue24, LanguageStatValue languageStatValue25) {
        if (268435455 != (i & 268435455)) {
            n3c.m17204b(i, 268435455, LanguageStatsEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17202a = str;
        this.f17203b = str2;
        this.f17204c = str3;
        this.f17205d = languageStatValue;
        this.f17206e = languageStatValue2;
        this.f17207f = languageStatValue3;
        this.f17208g = languageStatValue4;
        this.f17209h = languageStatValue5;
        this.f17210i = languageStatValue6;
        this.f17211j = languageStatValue7;
        this.f17212k = languageStatValue8;
        this.f17213l = languageStatValue9;
        this.f17214m = languageStatValue10;
        this.f17215n = languageStatValue11;
        this.f17216o = languageStatValue12;
        this.f17217p = languageStatValue13;
        this.f17218q = languageStatValue14;
        this.f17219r = languageStatValue15;
        this.f17220s = languageStatValue16;
        this.f17221t = languageStatValue17;
        this.f17222u = languageStatValue18;
        this.f17223v = languageStatValue19;
        this.f17224w = languageStatValue20;
        this.f17225x = languageStatValue21;
        this.f17226y = languageStatValue22;
        this.f17227z = languageStatValue23;
        this.f17200A = languageStatValue24;
        this.f17201B = languageStatValue25;
    }

    /* JADX INFO: renamed from: A */
    public final LanguageStatValue m7603A() {
        return this.f17212k;
    }

    /* JADX INFO: renamed from: B */
    public final LanguageStatValue m7604B() {
        return this.f17222u;
    }

    /* JADX INFO: renamed from: a */
    public final LanguageStatValue m7605a() {
        return this.f17200A;
    }

    /* JADX INFO: renamed from: b */
    public final LanguageStatValue m7606b() {
        return this.f17219r;
    }

    /* JADX INFO: renamed from: c */
    public final LanguageStatValue m7607c() {
        return this.f17207f;
    }

    /* JADX INFO: renamed from: d */
    public final LanguageStatValue m7608d() {
        return this.f17223v;
    }

    /* JADX INFO: renamed from: e */
    public final LanguageStatValue m7609e() {
        return this.f17218q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageStatsEntity)) {
            return false;
        }
        LanguageStatsEntity languageStatsEntity = (LanguageStatsEntity) obj;
        return fa4.m11650l(this.f17202a, languageStatsEntity.f17202a) && fa4.m11650l(this.f17203b, languageStatsEntity.f17203b) && fa4.m11650l(this.f17204c, languageStatsEntity.f17204c) && fa4.m11650l(this.f17205d, languageStatsEntity.f17205d) && fa4.m11650l(this.f17206e, languageStatsEntity.f17206e) && fa4.m11650l(this.f17207f, languageStatsEntity.f17207f) && fa4.m11650l(this.f17208g, languageStatsEntity.f17208g) && fa4.m11650l(this.f17209h, languageStatsEntity.f17209h) && fa4.m11650l(this.f17210i, languageStatsEntity.f17210i) && fa4.m11650l(this.f17211j, languageStatsEntity.f17211j) && fa4.m11650l(this.f17212k, languageStatsEntity.f17212k) && fa4.m11650l(this.f17213l, languageStatsEntity.f17213l) && fa4.m11650l(this.f17214m, languageStatsEntity.f17214m) && fa4.m11650l(this.f17215n, languageStatsEntity.f17215n) && fa4.m11650l(this.f17216o, languageStatsEntity.f17216o) && fa4.m11650l(this.f17217p, languageStatsEntity.f17217p) && fa4.m11650l(this.f17218q, languageStatsEntity.f17218q) && fa4.m11650l(this.f17219r, languageStatsEntity.f17219r) && fa4.m11650l(this.f17220s, languageStatsEntity.f17220s) && fa4.m11650l(this.f17221t, languageStatsEntity.f17221t) && fa4.m11650l(this.f17222u, languageStatsEntity.f17222u) && fa4.m11650l(this.f17223v, languageStatsEntity.f17223v) && fa4.m11650l(this.f17224w, languageStatsEntity.f17224w) && fa4.m11650l(this.f17225x, languageStatsEntity.f17225x) && fa4.m11650l(this.f17226y, languageStatsEntity.f17226y) && fa4.m11650l(this.f17227z, languageStatsEntity.f17227z) && fa4.m11650l(this.f17200A, languageStatsEntity.f17200A) && fa4.m11650l(this.f17201B, languageStatsEntity.f17201B);
    }

    /* JADX INFO: renamed from: f */
    public final LanguageStatValue m7610f() {
        return this.f17224w;
    }

    /* JADX INFO: renamed from: g */
    public final String m7611g() {
        return this.f17203b;
    }

    /* JADX INFO: renamed from: h */
    public final String m7612h() {
        return this.f17202a;
    }

    public final int hashCode() {
        return this.f17201B.hashCode() + hn1.m13353b(this.f17200A, hn1.m13353b(this.f17227z, hn1.m13353b(this.f17226y, hn1.m13353b(this.f17225x, hn1.m13353b(this.f17224w, hn1.m13353b(this.f17223v, hn1.m13353b(this.f17222u, hn1.m13353b(this.f17221t, hn1.m13353b(this.f17220s, hn1.m13353b(this.f17219r, hn1.m13353b(this.f17218q, hn1.m13353b(this.f17217p, hn1.m13353b(this.f17216o, hn1.m13353b(this.f17215n, hn1.m13353b(this.f17214m, hn1.m13353b(this.f17213l, hn1.m13353b(this.f17212k, hn1.m13353b(this.f17211j, hn1.m13353b(this.f17210i, hn1.m13353b(this.f17209h, hn1.m13353b(this.f17208g, hn1.m13353b(this.f17207f, hn1.m13353b(this.f17206e, hn1.m13353b(this.f17205d, ux5.m22980c(ux5.m22980c(this.f17202a.hashCode() * 31, this.f17203b, 31), this.f17204c, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final LanguageStatValue m7613i() {
        return this.f17215n;
    }

    /* JADX INFO: renamed from: j */
    public final LanguageStatValue m7614j() {
        return this.f17205d;
    }

    /* JADX INFO: renamed from: k */
    public final LanguageStatValue m7615k() {
        return this.f17225x;
    }

    /* JADX INFO: renamed from: l */
    public final LanguageStatValue m7616l() {
        return this.f17210i;
    }

    /* JADX INFO: renamed from: m */
    public final LanguageStatValue m7617m() {
        return this.f17208g;
    }

    /* JADX INFO: renamed from: n */
    public final LanguageStatValue m7618n() {
        return this.f17213l;
    }

    /* JADX INFO: renamed from: o */
    public final LanguageStatValue m7619o() {
        return this.f17217p;
    }

    /* JADX INFO: renamed from: p */
    public final LanguageStatValue m7620p() {
        return this.f17221t;
    }

    /* JADX INFO: renamed from: q */
    public final String m7621q() {
        return this.f17204c;
    }

    /* JADX INFO: renamed from: r */
    public final LanguageStatValue m7622r() {
        return this.f17227z;
    }

    /* JADX INFO: renamed from: s */
    public final LanguageStatValue m7623s() {
        return this.f17216o;
    }

    /* JADX INFO: renamed from: t */
    public final LanguageStatValue m7624t() {
        return this.f17220s;
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LanguageStatsEntity(languageAndPeriod=", this.f17202a, ", language=", this.f17203b, ", period=");
        sbM23000w.append(this.f17204c);
        sbM23000w.append(", lessonCompleted=");
        sbM23000w.append(this.f17205d);
        sbM23000w.append(", speakingUsage=");
        hn1.m13369s(sbM23000w, this.f17206e, ", coinsWords=", this.f17207f, ", lessonShared=");
        hn1.m13369s(sbM23000w, this.f17208g, ", translationsShared=", this.f17209h, ", lessonPublished=");
        hn1.m13369s(sbM23000w, this.f17210i, ", studyTime=", this.f17211j, ", wpm=");
        hn1.m13369s(sbM23000w, this.f17212k, ", lessonTaken=", this.f17213l, ", translationsCreated=");
        hn1.m13369s(sbM23000w, this.f17214m, ", learnedWords=", this.f17215n, ", readingUsage=");
        hn1.m13369s(sbM23000w, this.f17216o, ", listening=", this.f17217p, ", earnedCoins=");
        hn1.m13369s(sbM23000w, this.f17218q, ", coinsRead=", this.f17219r, ", reviewUsage=");
        hn1.m13369s(sbM23000w, this.f17220s, ", listeningUsage=", this.f17221t, ", writing=");
        hn1.m13369s(sbM23000w, this.f17222u, ", createdLingQs=", this.f17223v, ", knownWords=");
        hn1.m13369s(sbM23000w, this.f17224w, ", lessonImported=", this.f17225x, ", translationsUsed=");
        hn1.m13369s(sbM23000w, this.f17226y, ", reading=", this.f17227z, ", coinsListen=");
        sbM23000w.append(this.f17200A);
        sbM23000w.append(", speaking=");
        sbM23000w.append(this.f17201B);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    /* JADX INFO: renamed from: u */
    public final LanguageStatValue m7625u() {
        return this.f17201B;
    }

    /* JADX INFO: renamed from: v */
    public final LanguageStatValue m7626v() {
        return this.f17206e;
    }

    /* JADX INFO: renamed from: w */
    public final LanguageStatValue m7627w() {
        return this.f17211j;
    }

    /* JADX INFO: renamed from: x */
    public final LanguageStatValue m7628x() {
        return this.f17214m;
    }

    /* JADX INFO: renamed from: y */
    public final LanguageStatValue m7629y() {
        return this.f17209h;
    }

    /* JADX INFO: renamed from: z */
    public final LanguageStatValue m7630z() {
        return this.f17226y;
    }

    public LanguageStatsEntity(String str, String str2, String str3, LanguageStatValue languageStatValue, LanguageStatValue languageStatValue2, LanguageStatValue languageStatValue3, LanguageStatValue languageStatValue4, LanguageStatValue languageStatValue5, LanguageStatValue languageStatValue6, LanguageStatValue languageStatValue7, LanguageStatValue languageStatValue8, LanguageStatValue languageStatValue9, LanguageStatValue languageStatValue10, LanguageStatValue languageStatValue11, LanguageStatValue languageStatValue12, LanguageStatValue languageStatValue13, LanguageStatValue languageStatValue14, LanguageStatValue languageStatValue15, LanguageStatValue languageStatValue16, LanguageStatValue languageStatValue17, LanguageStatValue languageStatValue18, LanguageStatValue languageStatValue19, LanguageStatValue languageStatValue20, LanguageStatValue languageStatValue21, LanguageStatValue languageStatValue22, LanguageStatValue languageStatValue23, LanguageStatValue languageStatValue24, LanguageStatValue languageStatValue25) {
        ux5.m22974A(str, str2, str3);
        this.f17202a = str;
        this.f17203b = str2;
        this.f17204c = str3;
        this.f17205d = languageStatValue;
        this.f17206e = languageStatValue2;
        this.f17207f = languageStatValue3;
        this.f17208g = languageStatValue4;
        this.f17209h = languageStatValue5;
        this.f17210i = languageStatValue6;
        this.f17211j = languageStatValue7;
        this.f17212k = languageStatValue8;
        this.f17213l = languageStatValue9;
        this.f17214m = languageStatValue10;
        this.f17215n = languageStatValue11;
        this.f17216o = languageStatValue12;
        this.f17217p = languageStatValue13;
        this.f17218q = languageStatValue14;
        this.f17219r = languageStatValue15;
        this.f17220s = languageStatValue16;
        this.f17221t = languageStatValue17;
        this.f17222u = languageStatValue18;
        this.f17223v = languageStatValue19;
        this.f17224w = languageStatValue20;
        this.f17225x = languageStatValue21;
        this.f17226y = languageStatValue22;
        this.f17227z = languageStatValue23;
        this.f17200A = languageStatValue24;
        this.f17201B = languageStatValue25;
    }
}
