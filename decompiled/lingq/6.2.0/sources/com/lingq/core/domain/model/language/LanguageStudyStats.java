package com.lingq.core.domain.model.language;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.uf4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LanguageStudyStats {
    public static final C1431k Companion = new C1431k();

    /* JADX INFO: renamed from: h */
    public static final cs4[] f19105h = {null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new uf4(12)), null};

    /* JADX INFO: renamed from: a */
    public final String f19106a;

    /* JADX INFO: renamed from: b */
    public final int f19107b;

    /* JADX INFO: renamed from: c */
    public final int f19108c;

    /* JADX INFO: renamed from: d */
    public final int f19109d;

    /* JADX INFO: renamed from: e */
    public final int f19110e;

    /* JADX INFO: renamed from: f */
    public final List f19111f;

    /* JADX INFO: renamed from: g */
    public final int f19112g;

    public /* synthetic */ LanguageStudyStats(int i, String str, int i2, int i3, int i4, int i5, List list, int i6) {
        this.f19106a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f19107b = 0;
        } else {
            this.f19107b = i2;
        }
        if ((i & 4) == 0) {
            this.f19108c = 0;
        } else {
            this.f19108c = i3;
        }
        if ((i & 8) == 0) {
            this.f19109d = 0;
        } else {
            this.f19109d = i4;
        }
        if ((i & 16) == 0) {
            this.f19110e = 0;
        } else {
            this.f19110e = i5;
        }
        if ((i & 32) == 0) {
            this.f19111f = EmptyList.f47638a;
        } else {
            this.f19111f = list;
        }
        if ((i & 64) == 0) {
            this.f19112g = 0;
        } else {
            this.f19112g = i6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageStudyStats)) {
            return false;
        }
        LanguageStudyStats languageStudyStats = (LanguageStudyStats) obj;
        return fa4.m11650l(this.f19106a, languageStudyStats.f19106a) && this.f19107b == languageStudyStats.f19107b && this.f19108c == languageStudyStats.f19108c && this.f19109d == languageStudyStats.f19109d && this.f19110e == languageStudyStats.f19110e && fa4.m11650l(this.f19111f, languageStudyStats.f19111f) && this.f19112g == languageStudyStats.f19112g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19112g) + ux5.m22979b(wq1.m24106b(this.f19110e, wq1.m24106b(this.f19109d, wq1.m24106b(this.f19108c, wq1.m24106b(this.f19107b, this.f19106a.hashCode() * 31, 31), 31), 31), 31), 31, this.f19111f);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f19107b, "LanguageStudyStats(language=", this.f19106a, ", dailyGoal=", ", streakDays=");
        hn1.m13360j(this.f19108c, this.f19109d, ", coins=", ", knownWords=", sbM17741p);
        sbM17741p.append(this.f19110e);
        sbM17741p.append(", dailyScores=");
        sbM17741p.append(this.f19111f);
        sbM17741p.append(", activityLevel=");
        return wq1.m24123s(sbM17741p, this.f19112g, ")");
    }

    public LanguageStudyStats(String str, int i, int i2, int i3, int i4, List list, int i5) {
        str.getClass();
        list.getClass();
        this.f19106a = str;
        this.f19107b = i;
        this.f19108c = i2;
        this.f19109d = i3;
        this.f19110e = i4;
        this.f19111f = list;
        this.f19112g = i5;
    }
}
