package p000;

import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.core.p012ui.challenges.LeaderboardMetric;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class fr0 {

    /* JADX INFO: renamed from: a */
    public final ChallengeType f39503a;

    /* JADX INFO: renamed from: b */
    public final rs0 f39504b;

    /* JADX INFO: renamed from: c */
    public final ls0 f39505c;

    /* JADX INFO: renamed from: d */
    public final nr0 f39506d;

    /* JADX INFO: renamed from: e */
    public final qp0 f39507e;

    /* JADX INFO: renamed from: f */
    public final ef0 f39508f;

    /* JADX INFO: renamed from: g */
    public final List f39509g;

    /* JADX INFO: renamed from: h */
    public final Set f39510h;

    /* JADX INFO: renamed from: i */
    public final boolean f39511i;

    /* JADX INFO: renamed from: j */
    public final List f39512j;

    /* JADX INFO: renamed from: k */
    public final String f39513k;

    /* JADX INFO: renamed from: l */
    public final LeaderboardMetric f39514l;

    public fr0(ChallengeType challengeType, rs0 rs0Var, ls0 ls0Var, nr0 nr0Var, qp0 qp0Var, ef0 ef0Var, List list, Set set, boolean z, List list2, String str, LeaderboardMetric leaderboardMetric) {
        challengeType.getClass();
        rs0Var.getClass();
        ls0Var.getClass();
        nr0Var.getClass();
        qp0Var.getClass();
        str.getClass();
        leaderboardMetric.getClass();
        this.f39503a = challengeType;
        this.f39504b = rs0Var;
        this.f39505c = ls0Var;
        this.f39506d = nr0Var;
        this.f39507e = qp0Var;
        this.f39508f = ef0Var;
        this.f39509g = list;
        this.f39510h = set;
        this.f39511i = z;
        this.f39512j = list2;
        this.f39513k = str;
        this.f39514l = leaderboardMetric;
    }

    /* JADX INFO: renamed from: a */
    public static fr0 m12004a(fr0 fr0Var, ChallengeType challengeType, rs0 rs0Var, ls0 ls0Var, nr0 nr0Var, qp0 qp0Var, ef0 ef0Var, List list, LinkedHashSet linkedHashSet, String str, LeaderboardMetric leaderboardMetric, int i) {
        ChallengeType challengeType2 = (i & 1) != 0 ? fr0Var.f39503a : challengeType;
        rs0 rs0Var2 = (i & 2) != 0 ? fr0Var.f39504b : rs0Var;
        ls0 ls0Var2 = (i & 4) != 0 ? fr0Var.f39505c : ls0Var;
        nr0 nr0Var2 = (i & 8) != 0 ? fr0Var.f39506d : nr0Var;
        qp0 qp0Var2 = (i & 16) != 0 ? fr0Var.f39507e : qp0Var;
        ef0 ef0Var2 = (i & 32) != 0 ? fr0Var.f39508f : ef0Var;
        List list2 = (i & 64) != 0 ? fr0Var.f39509g : list;
        Set set = (i & 128) != 0 ? fr0Var.f39510h : linkedHashSet;
        boolean z = (i & 256) != 0 ? fr0Var.f39511i : true;
        List list3 = fr0Var.f39512j;
        String str2 = (i & 1024) != 0 ? fr0Var.f39513k : str;
        LeaderboardMetric leaderboardMetric2 = (i & 2048) != 0 ? fr0Var.f39514l : leaderboardMetric;
        fr0Var.getClass();
        challengeType2.getClass();
        rs0Var2.getClass();
        ls0Var2.getClass();
        nr0Var2.getClass();
        qp0Var2.getClass();
        list2.getClass();
        set.getClass();
        list3.getClass();
        str2.getClass();
        leaderboardMetric2.getClass();
        return new fr0(challengeType2, rs0Var2, ls0Var2, nr0Var2, qp0Var2, ef0Var2, list2, set, z, list3, str2, leaderboardMetric2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12005b() {
        ef0 ef0Var;
        return this.f39503a == ChallengeType.BookChallenge && (ef0Var = this.f39508f) != null && ef0Var.f37160b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr0)) {
            return false;
        }
        fr0 fr0Var = (fr0) obj;
        return this.f39503a == fr0Var.f39503a && fa4.m11650l(this.f39504b, fr0Var.f39504b) && fa4.m11650l(this.f39505c, fr0Var.f39505c) && fa4.m11650l(this.f39506d, fr0Var.f39506d) && fa4.m11650l(this.f39507e, fr0Var.f39507e) && fa4.m11650l(this.f39508f, fr0Var.f39508f) && fa4.m11650l(this.f39509g, fr0Var.f39509g) && fa4.m11650l(this.f39510h, fr0Var.f39510h) && this.f39511i == fr0Var.f39511i && fa4.m11650l(this.f39512j, fr0Var.f39512j) && fa4.m11650l(this.f39513k, fr0Var.f39513k) && this.f39514l == fr0Var.f39514l;
    }

    public final int hashCode() {
        int iHashCode = (this.f39507e.hashCode() + ((this.f39506d.hashCode() + ((this.f39505c.hashCode() + ((this.f39504b.hashCode() + (this.f39503a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        ef0 ef0Var = this.f39508f;
        return this.f39514l.hashCode() + ux5.m22980c(ux5.m22979b(g9a.m12428e((this.f39510h.hashCode() + ux5.m22979b((iHashCode + (ef0Var == null ? 0 : ef0Var.hashCode())) * 31, 31, this.f39509g)) * 31, 31, this.f39511i), 31, this.f39512j), this.f39513k, 31);
    }

    public final String toString() {
        return "ChallengeDetailsScreenState(challengeType=" + this.f39503a + ", challengeUiState=" + this.f39504b + ", challengeStatsUiState=" + this.f39505c + ", challengeRankingUiState=" + this.f39506d + ", challengeBadgeUiState=" + this.f39507e + ", bookChallengeState=" + this.f39508f + ", languages=" + this.f39509g + ", selectedBookLanguages=" + this.f39510h + ", showAllBooks=" + this.f39511i + ", countries=" + this.f39512j + ", country=" + this.f39513k + ", selectedMetric=" + this.f39514l + ")";
    }
}
