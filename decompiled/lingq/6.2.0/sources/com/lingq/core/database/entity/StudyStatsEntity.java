package com.lingq.core.database.entity;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.b98;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class StudyStatsEntity {
    public static final C1351n0 Companion = new C1351n0();

    /* JADX INFO: renamed from: l */
    public static final cs4[] f17461l = {null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new b98(19)), null};

    /* JADX INFO: renamed from: a */
    public final String f17462a;

    /* JADX INFO: renamed from: b */
    public final String f17463b;

    /* JADX INFO: renamed from: c */
    public final String f17464c;

    /* JADX INFO: renamed from: d */
    public final int f17465d;

    /* JADX INFO: renamed from: e */
    public final int f17466e;

    /* JADX INFO: renamed from: f */
    public final int f17467f;

    /* JADX INFO: renamed from: g */
    public final int f17468g;

    /* JADX INFO: renamed from: h */
    public final int f17469h;

    /* JADX INFO: renamed from: i */
    public final boolean f17470i;

    /* JADX INFO: renamed from: j */
    public final List f17471j;

    /* JADX INFO: renamed from: k */
    public final int f17472k;

    public /* synthetic */ StudyStatsEntity(int i, String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, boolean z, List list, int i7) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, StudyStatsEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17462a = str;
        if ((i & 2) == 0) {
            this.f17463b = null;
        } else {
            this.f17463b = str2;
        }
        if ((i & 4) == 0) {
            this.f17464c = null;
        } else {
            this.f17464c = str3;
        }
        if ((i & 8) == 0) {
            this.f17465d = 0;
        } else {
            this.f17465d = i2;
        }
        if ((i & 16) == 0) {
            this.f17466e = 0;
        } else {
            this.f17466e = i3;
        }
        if ((i & 32) == 0) {
            this.f17467f = 0;
        } else {
            this.f17467f = i4;
        }
        if ((i & 64) == 0) {
            this.f17468g = 0;
        } else {
            this.f17468g = i5;
        }
        if ((i & 128) == 0) {
            this.f17469h = 0;
        } else {
            this.f17469h = i6;
        }
        if ((i & 256) == 0) {
            this.f17470i = false;
        } else {
            this.f17470i = z;
        }
        if ((i & 512) == 0) {
            this.f17471j = null;
        } else {
            this.f17471j = list;
        }
        if ((i & 1024) == 0) {
            this.f17472k = 0;
        } else {
            this.f17472k = i7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudyStatsEntity)) {
            return false;
        }
        StudyStatsEntity studyStatsEntity = (StudyStatsEntity) obj;
        return fa4.m11650l(this.f17462a, studyStatsEntity.f17462a) && fa4.m11650l(this.f17463b, studyStatsEntity.f17463b) && fa4.m11650l(this.f17464c, studyStatsEntity.f17464c) && this.f17465d == studyStatsEntity.f17465d && this.f17466e == studyStatsEntity.f17466e && this.f17467f == studyStatsEntity.f17467f && this.f17468g == studyStatsEntity.f17468g && this.f17469h == studyStatsEntity.f17469h && this.f17470i == studyStatsEntity.f17470i && fa4.m11650l(this.f17471j, studyStatsEntity.f17471j) && this.f17472k == studyStatsEntity.f17472k;
    }

    public final int hashCode() {
        int iHashCode = this.f17462a.hashCode() * 31;
        String str = this.f17463b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17464c;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f17469h, wq1.m24106b(this.f17468g, wq1.m24106b(this.f17467f, wq1.m24106b(this.f17466e, wq1.m24106b(this.f17465d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31), 31, this.f17470i);
        List list = this.f17471j;
        return Integer.hashCode(this.f17472k) + ((iM12428e + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("StudyStatsEntity(code=", this.f17462a, ", language=", this.f17463b, ", activityApple=");
        AbstractC3393o1.m17748w(this.f17465d, this.f17464c, ", notificationsCount=", ", dailyGoal=", sbM23000w);
        hn1.m13360j(this.f17466e, this.f17467f, ", streakDays=", ", coins=", sbM23000w);
        hn1.m13360j(this.f17468g, this.f17469h, ", knownWords=", ", isAvatarUpgraded=", sbM23000w);
        sbM23000w.append(this.f17470i);
        sbM23000w.append(", dailyScores=");
        sbM23000w.append(this.f17471j);
        sbM23000w.append(", activityLevel=");
        return wq1.m24123s(sbM23000w, this.f17472k, ")");
    }

    public StudyStatsEntity(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, boolean z, ArrayList arrayList, int i6) {
        this.f17462a = str;
        this.f17463b = str2;
        this.f17464c = str3;
        this.f17465d = i;
        this.f17466e = i2;
        this.f17467f = i3;
        this.f17468g = i4;
        this.f17469h = i5;
        this.f17470i = z;
        this.f17471j = arrayList;
        this.f17472k = i6;
    }
}
