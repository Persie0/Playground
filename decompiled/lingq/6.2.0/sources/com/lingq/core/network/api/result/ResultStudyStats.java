package com.lingq.core.network.api.result;

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
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultStudyStats {
    public static final C1619a4 Companion = new C1619a4();

    /* JADX INFO: renamed from: j */
    public static final cs4[] f21529j = {null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new b98(2)), null};

    /* JADX INFO: renamed from: a */
    public final String f21530a;

    /* JADX INFO: renamed from: b */
    public final int f21531b;

    /* JADX INFO: renamed from: c */
    public final int f21532c;

    /* JADX INFO: renamed from: d */
    public final int f21533d;

    /* JADX INFO: renamed from: e */
    public final int f21534e;

    /* JADX INFO: renamed from: f */
    public final int f21535f;

    /* JADX INFO: renamed from: g */
    public final boolean f21536g;

    /* JADX INFO: renamed from: h */
    public final List f21537h;

    /* JADX INFO: renamed from: i */
    public final ResultActivityLevel f21538i;

    public /* synthetic */ ResultStudyStats(int i, String str, int i2, int i3, int i4, int i5, int i6, boolean z, List list, ResultActivityLevel resultActivityLevel) {
        if ((i & 1) == 0) {
            this.f21530a = null;
        } else {
            this.f21530a = str;
        }
        if ((i & 2) == 0) {
            this.f21531b = 0;
        } else {
            this.f21531b = i2;
        }
        if ((i & 4) == 0) {
            this.f21532c = 0;
        } else {
            this.f21532c = i3;
        }
        if ((i & 8) == 0) {
            this.f21533d = 0;
        } else {
            this.f21533d = i4;
        }
        if ((i & 16) == 0) {
            this.f21534e = 0;
        } else {
            this.f21534e = i5;
        }
        if ((i & 32) == 0) {
            this.f21535f = 0;
        } else {
            this.f21535f = i6;
        }
        if ((i & 64) == 0) {
            this.f21536g = false;
        } else {
            this.f21536g = z;
        }
        if ((i & 128) == 0) {
            this.f21537h = null;
        } else {
            this.f21537h = list;
        }
        if ((i & 256) == 0) {
            this.f21538i = null;
        } else {
            this.f21538i = resultActivityLevel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultStudyStats)) {
            return false;
        }
        ResultStudyStats resultStudyStats = (ResultStudyStats) obj;
        return fa4.m11650l(this.f21530a, resultStudyStats.f21530a) && this.f21531b == resultStudyStats.f21531b && this.f21532c == resultStudyStats.f21532c && this.f21533d == resultStudyStats.f21533d && this.f21534e == resultStudyStats.f21534e && this.f21535f == resultStudyStats.f21535f && this.f21536g == resultStudyStats.f21536g && fa4.m11650l(this.f21537h, resultStudyStats.f21537h) && fa4.m11650l(this.f21538i, resultStudyStats.f21538i);
    }

    public final int hashCode() {
        String str = this.f21530a;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f21535f, wq1.m24106b(this.f21534e, wq1.m24106b(this.f21533d, wq1.m24106b(this.f21532c, wq1.m24106b(this.f21531b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31), 31), 31), 31, this.f21536g);
        List list = this.f21537h;
        int iHashCode = (iM12428e + (list == null ? 0 : list.hashCode())) * 31;
        ResultActivityLevel resultActivityLevel = this.f21538i;
        return iHashCode + (resultActivityLevel != null ? resultActivityLevel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f21531b, "ResultStudyStats(activityApple=", this.f21530a, ", notificationsCount=", ", dailyGoal=");
        hn1.m13360j(this.f21532c, this.f21533d, ", streakDays=", ", coins=", sbM17741p);
        hn1.m13360j(this.f21534e, this.f21535f, ", knownWords=", ", isAvatarUpgraded=", sbM17741p);
        sbM17741p.append(this.f21536g);
        sbM17741p.append(", dailyScores=");
        sbM17741p.append(this.f21537h);
        sbM17741p.append(", activityLevel=");
        sbM17741p.append(this.f21538i);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }
}
