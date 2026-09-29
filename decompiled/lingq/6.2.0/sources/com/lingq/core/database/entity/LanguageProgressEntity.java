package com.lingq.core.database.entity;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.uf4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LanguageProgressEntity {
    public static final C1350n Companion = new C1350n();

    /* JADX INFO: renamed from: y */
    public static final cs4[] f17175y = {null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new uf4(11)), null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f17176a;

    /* JADX INFO: renamed from: b */
    public final String f17177b;

    /* JADX INFO: renamed from: c */
    public final int f17178c;

    /* JADX INFO: renamed from: d */
    public final double f17179d;

    /* JADX INFO: renamed from: e */
    public final int f17180e;

    /* JADX INFO: renamed from: f */
    public final double f17181f;

    /* JADX INFO: renamed from: g */
    public final int f17182g;

    /* JADX INFO: renamed from: h */
    public final int f17183h;

    /* JADX INFO: renamed from: i */
    public final int f17184i;

    /* JADX INFO: renamed from: j */
    public final double f17185j;

    /* JADX INFO: renamed from: k */
    public final double f17186k;

    /* JADX INFO: renamed from: l */
    public final int f17187l;

    /* JADX INFO: renamed from: m */
    public final int f17188m;

    /* JADX INFO: renamed from: n */
    public final List f17189n;

    /* JADX INFO: renamed from: o */
    public final int f17190o;

    /* JADX INFO: renamed from: p */
    public final int f17191p;

    /* JADX INFO: renamed from: q */
    public final double f17192q;

    /* JADX INFO: renamed from: r */
    public final int f17193r;

    /* JADX INFO: renamed from: s */
    public final int f17194s;

    /* JADX INFO: renamed from: t */
    public final int f17195t;

    /* JADX INFO: renamed from: u */
    public final int f17196u;

    /* JADX INFO: renamed from: v */
    public final int f17197v;

    /* JADX INFO: renamed from: w */
    public final int f17198w;

    /* JADX INFO: renamed from: x */
    public final int f17199x;

    public /* synthetic */ LanguageProgressEntity(int i, String str, String str2, int i2, double d, int i3, double d2, int i4, int i5, int i6, double d3, double d4, int i7, int i8, List list, int i9, int i10, double d5, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (8195 != (i & 8195)) {
            n3c.m17204b(i, 8195, LanguageProgressEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17176a = str;
        this.f17177b = str2;
        if ((i & 4) == 0) {
            this.f17178c = 0;
        } else {
            this.f17178c = i2;
        }
        if ((i & 8) == 0) {
            this.f17179d = 0.0d;
        } else {
            this.f17179d = d;
        }
        if ((i & 16) == 0) {
            this.f17180e = 0;
        } else {
            this.f17180e = i3;
        }
        if ((i & 32) == 0) {
            this.f17181f = 0.0d;
        } else {
            this.f17181f = d2;
        }
        if ((i & 64) == 0) {
            this.f17182g = 0;
        } else {
            this.f17182g = i4;
        }
        if ((i & 128) == 0) {
            this.f17183h = 0;
        } else {
            this.f17183h = i5;
        }
        if ((i & 256) == 0) {
            this.f17184i = 0;
        } else {
            this.f17184i = i6;
        }
        if ((i & 512) == 0) {
            this.f17185j = 0.0d;
        } else {
            this.f17185j = d3;
        }
        if ((i & 1024) == 0) {
            this.f17186k = 0.0d;
        } else {
            this.f17186k = d4;
        }
        if ((i & 2048) == 0) {
            this.f17187l = 0;
        } else {
            this.f17187l = i7;
        }
        if ((i & 4096) == 0) {
            this.f17188m = 0;
        } else {
            this.f17188m = i8;
        }
        this.f17189n = list;
        if ((i & 16384) == 0) {
            this.f17190o = 0;
        } else {
            this.f17190o = i9;
        }
        if ((32768 & i) == 0) {
            this.f17191p = 0;
        } else {
            this.f17191p = i10;
        }
        if ((65536 & i) == 0) {
            this.f17192q = 0.0d;
        } else {
            this.f17192q = d5;
        }
        if ((131072 & i) == 0) {
            this.f17193r = 0;
        } else {
            this.f17193r = i11;
        }
        if ((262144 & i) == 0) {
            this.f17194s = 0;
        } else {
            this.f17194s = i12;
        }
        if ((524288 & i) == 0) {
            this.f17195t = 0;
        } else {
            this.f17195t = i13;
        }
        if ((1048576 & i) == 0) {
            this.f17196u = 0;
        } else {
            this.f17196u = i14;
        }
        if ((2097152 & i) == 0) {
            this.f17197v = 0;
        } else {
            this.f17197v = i15;
        }
        if ((4194304 & i) == 0) {
            this.f17198w = 0;
        } else {
            this.f17198w = i16;
        }
        if ((i & 8388608) == 0) {
            this.f17199x = 0;
        } else {
            this.f17199x = i17;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageProgressEntity)) {
            return false;
        }
        LanguageProgressEntity languageProgressEntity = (LanguageProgressEntity) obj;
        return fa4.m11650l(this.f17176a, languageProgressEntity.f17176a) && fa4.m11650l(this.f17177b, languageProgressEntity.f17177b) && this.f17178c == languageProgressEntity.f17178c && Double.compare(this.f17179d, languageProgressEntity.f17179d) == 0 && this.f17180e == languageProgressEntity.f17180e && Double.compare(this.f17181f, languageProgressEntity.f17181f) == 0 && this.f17182g == languageProgressEntity.f17182g && this.f17183h == languageProgressEntity.f17183h && this.f17184i == languageProgressEntity.f17184i && Double.compare(this.f17185j, languageProgressEntity.f17185j) == 0 && Double.compare(this.f17186k, languageProgressEntity.f17186k) == 0 && this.f17187l == languageProgressEntity.f17187l && this.f17188m == languageProgressEntity.f17188m && fa4.m11650l(this.f17189n, languageProgressEntity.f17189n) && this.f17190o == languageProgressEntity.f17190o && this.f17191p == languageProgressEntity.f17191p && Double.compare(this.f17192q, languageProgressEntity.f17192q) == 0 && this.f17193r == languageProgressEntity.f17193r && this.f17194s == languageProgressEntity.f17194s && this.f17195t == languageProgressEntity.f17195t && this.f17196u == languageProgressEntity.f17196u && this.f17197v == languageProgressEntity.f17197v && this.f17198w == languageProgressEntity.f17198w && this.f17199x == languageProgressEntity.f17199x;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f17188m, wq1.m24106b(this.f17187l, g9a.m12424a(this.f17186k, g9a.m12424a(this.f17185j, wq1.m24106b(this.f17184i, wq1.m24106b(this.f17183h, wq1.m24106b(this.f17182g, g9a.m12424a(this.f17181f, wq1.m24106b(this.f17180e, g9a.m12424a(this.f17179d, wq1.m24106b(this.f17178c, ux5.m22980c(this.f17176a.hashCode() * 31, this.f17177b, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        List list = this.f17189n;
        return Integer.hashCode(this.f17199x) + wq1.m24106b(this.f17198w, wq1.m24106b(this.f17197v, wq1.m24106b(this.f17196u, wq1.m24106b(this.f17195t, wq1.m24106b(this.f17194s, wq1.m24106b(this.f17193r, g9a.m12424a(this.f17192q, wq1.m24106b(this.f17191p, wq1.m24106b(this.f17190o, (iM24106b + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LanguageProgressEntity(interval=", this.f17176a, ", languageCode=", this.f17177b, ", writtenWordsGoal=");
        sbM23000w.append(this.f17178c);
        sbM23000w.append(", speakingTimeGoal=");
        sbM23000w.append(this.f17179d);
        sbM23000w.append(", totalWordsKnown=");
        sbM23000w.append(this.f17180e);
        sbM23000w.append(", readWords=");
        sbM23000w.append(this.f17181f);
        sbM23000w.append(", totalCards=");
        sbM23000w.append(this.f17182g);
        wq1.m24127w(this.f17183h, this.f17184i, ", activityIndex=", ", knownWordsGoal=", sbM23000w);
        hn1.m13370t(sbM23000w, ", listeningTimeGoal=", this.f17185j, ", speakingTime=");
        sbM23000w.append(this.f17186k);
        sbM23000w.append(", cardsCreatedGoal=");
        sbM23000w.append(this.f17187l);
        sbM23000w.append(", knownWords=");
        sbM23000w.append(this.f17188m);
        sbM23000w.append(", intervals=");
        sbM23000w.append(this.f17189n);
        wq1.m24127w(this.f17190o, this.f17191p, ", cardsCreated=", ", readWordsGoal=", sbM23000w);
        hn1.m13370t(sbM23000w, ", listeningTime=", this.f17192q, ", cardsLearned=");
        hn1.m13360j(this.f17193r, this.f17194s, ", writtenWords=", ", cardsLearnedGoal=", sbM23000w);
        hn1.m13360j(this.f17195t, this.f17196u, ", earnedCoins=", ", earnedCoinsGoal=", sbM23000w);
        hn1.m13360j(this.f17197v, this.f17198w, ", wpm=", ", studyTime=", sbM23000w);
        return wq1.m24123s(sbM23000w, this.f17199x, ")");
    }

    public LanguageProgressEntity(String str, String str2, int i, double d, int i2, double d2, int i3, int i4, int i5, double d3, double d4, int i6, int i7, List list, int i8, int i9, double d5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f17176a = str;
        this.f17177b = str2;
        this.f17178c = i;
        this.f17179d = d;
        this.f17180e = i2;
        this.f17181f = d2;
        this.f17182g = i3;
        this.f17183h = i4;
        this.f17184i = i5;
        this.f17185j = d3;
        this.f17186k = d4;
        this.f17187l = i6;
        this.f17188m = i7;
        this.f17189n = list;
        this.f17190o = i8;
        this.f17191p = i9;
        this.f17192q = d5;
        this.f17193r = i10;
        this.f17194s = i11;
        this.f17195t = i12;
        this.f17196u = i13;
        this.f17197v = i14;
        this.f17198w = i15;
        this.f17199x = i16;
    }
}
