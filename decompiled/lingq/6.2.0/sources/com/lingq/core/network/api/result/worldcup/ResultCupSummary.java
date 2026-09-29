package com.lingq.core.network.api.result.worldcup;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ri5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultCupSummary {
    public static final C1770o Companion = new C1770o();

    /* JADX INFO: renamed from: k */
    public static final cs4[] f21799k = {null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new ri5(19))};

    /* JADX INFO: renamed from: a */
    public final boolean f21800a;

    /* JADX INFO: renamed from: b */
    public final boolean f21801b;

    /* JADX INFO: renamed from: c */
    public final String f21802c;

    /* JADX INFO: renamed from: d */
    public final String f21803d;

    /* JADX INFO: renamed from: e */
    public final ResultCupChampion f21804e;

    /* JADX INFO: renamed from: f */
    public final boolean f21805f;

    /* JADX INFO: renamed from: g */
    public final ResultCupTeam f21806g;

    /* JADX INFO: renamed from: h */
    public final ResultCupMy f21807h;

    /* JADX INFO: renamed from: i */
    public final ResultCupToday f21808i;

    /* JADX INFO: renamed from: j */
    public final List f21809j;

    public /* synthetic */ ResultCupSummary(int i, boolean z, boolean z2, String str, String str2, ResultCupChampion resultCupChampion, boolean z3, ResultCupTeam resultCupTeam, ResultCupMy resultCupMy, ResultCupToday resultCupToday, List list) {
        if ((i & 1) == 0) {
            this.f21800a = false;
        } else {
            this.f21800a = z;
        }
        if ((i & 2) == 0) {
            this.f21801b = false;
        } else {
            this.f21801b = z2;
        }
        if ((i & 4) == 0) {
            this.f21802c = null;
        } else {
            this.f21802c = str;
        }
        if ((i & 8) == 0) {
            this.f21803d = null;
        } else {
            this.f21803d = str2;
        }
        if ((i & 16) == 0) {
            this.f21804e = null;
        } else {
            this.f21804e = resultCupChampion;
        }
        if ((i & 32) == 0) {
            this.f21805f = false;
        } else {
            this.f21805f = z3;
        }
        if ((i & 64) == 0) {
            this.f21806g = null;
        } else {
            this.f21806g = resultCupTeam;
        }
        if ((i & 128) == 0) {
            this.f21807h = null;
        } else {
            this.f21807h = resultCupMy;
        }
        if ((i & 256) == 0) {
            this.f21808i = null;
        } else {
            this.f21808i = resultCupToday;
        }
        if ((i & 512) == 0) {
            this.f21809j = EmptyList.f47638a;
        } else {
            this.f21809j = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupSummary)) {
            return false;
        }
        ResultCupSummary resultCupSummary = (ResultCupSummary) obj;
        return this.f21800a == resultCupSummary.f21800a && this.f21801b == resultCupSummary.f21801b && fa4.m11650l(this.f21802c, resultCupSummary.f21802c) && fa4.m11650l(this.f21803d, resultCupSummary.f21803d) && fa4.m11650l(this.f21804e, resultCupSummary.f21804e) && this.f21805f == resultCupSummary.f21805f && fa4.m11650l(this.f21806g, resultCupSummary.f21806g) && fa4.m11650l(this.f21807h, resultCupSummary.f21807h) && fa4.m11650l(this.f21808i, resultCupSummary.f21808i) && fa4.m11650l(this.f21809j, resultCupSummary.f21809j);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(Boolean.hashCode(this.f21800a) * 31, 31, this.f21801b);
        String str = this.f21802c;
        int iHashCode = (iM12428e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21803d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ResultCupChampion resultCupChampion = this.f21804e;
        int iM12428e2 = g9a.m12428e((iHashCode2 + (resultCupChampion == null ? 0 : resultCupChampion.hashCode())) * 31, 31, this.f21805f);
        ResultCupTeam resultCupTeam = this.f21806g;
        int iHashCode3 = (iM12428e2 + (resultCupTeam == null ? 0 : resultCupTeam.hashCode())) * 31;
        ResultCupMy resultCupMy = this.f21807h;
        int iHashCode4 = (iHashCode3 + (resultCupMy == null ? 0 : resultCupMy.hashCode())) * 31;
        ResultCupToday resultCupToday = this.f21808i;
        return this.f21809j.hashCode() + ((iHashCode4 + (resultCupToday != null ? resultCupToday.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("ResultCupSummary(active=", ", ended=", ", startsAt=", this.f21800a, this.f21801b);
        AbstractC3393o1.m17725C(sbM13357g, this.f21802c, ", endsAt=", this.f21803d, ", champion=");
        sbM13357g.append(this.f21804e);
        sbM13357g.append(", joined=");
        sbM13357g.append(this.f21805f);
        sbM13357g.append(", team=");
        sbM13357g.append(this.f21806g);
        sbM13357g.append(", my=");
        sbM13357g.append(this.f21807h);
        sbM13357g.append(", today=");
        sbM13357g.append(this.f21808i);
        sbM13357g.append(", teams=");
        sbM13357g.append(this.f21809j);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
