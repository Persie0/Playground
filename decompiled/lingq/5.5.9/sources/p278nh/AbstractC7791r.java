package p278nh;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.language.LanguageProgressMetric;
import com.lingq.shared.uimodel.language.LanguageProgressPeriod;
import com.lingq.shared.uimodel.language.LanguageProgressSort;
import com.linguist.R;
import dk.C5196a;
import dm.C5207g;
import java.util.List;
import p003a2.C0009a;
import p301oh.C8048g;

/* JADX INFO: renamed from: nh.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7791r {

    /* JADX INFO: renamed from: nh.r$a */
    public static final class a extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final boolean f42821a;

        /* JADX INFO: renamed from: b */
        public final boolean f42822b;

        /* JADX INFO: renamed from: c */
        public final boolean f42823c;

        /* JADX INFO: renamed from: d */
        public final boolean f42824d;

        public a(boolean z10, boolean z11, boolean z12, boolean z13) {
            this.f42821a = z10;
            this.f42822b = z11;
            this.f42823c = z12;
            this.f42824d = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f42821a == aVar.f42821a && this.f42822b == aVar.f42822b && this.f42823c == aVar.f42823c && this.f42824d == aVar.f42824d) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        public final int hashCode() {
            ?? r10 = 1;
            boolean z10 = this.f42821a;
            ?? r11 = z10;
            if (z10) {
                r11 = 1;
            }
            int i10 = r11 * 31;
            boolean z11 = this.f42822b;
            ?? r12 = z11;
            if (z11) {
                r12 = 1;
            }
            int i11 = (i10 + r12) * 31;
            boolean z12 = this.f42823c;
            ?? r13 = z12;
            if (z12) {
                r13 = 1;
            }
            int i12 = (i11 + r13) * 31;
            boolean z13 = this.f42824d;
            if (!z13) {
                r10 = z13;
            }
            return i12 + r10;
        }

        public final String toString() {
            return "ButtonActions(isFavourite=" + this.f42821a + ", isLiked=" + this.f42822b + ", isLoading=" + this.f42823c + ", shouldShowAddPlaylist=" + this.f42824d + ")";
        }
    }

    /* JADX INFO: renamed from: nh.r$b */
    public static final class b extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final List<ChallengeDetail> f42825a;

        /* JADX INFO: renamed from: b */
        public final boolean f42826b;

        public b(List<ChallengeDetail> list, boolean z10) {
            C5207g.m11111f(list, "challenges");
            this.f42825a = list;
            this.f42826b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C5207g.m11106a(this.f42825a, bVar.f42825a) && this.f42826b == bVar.f42826b) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public final int hashCode() {
            int iHashCode = this.f42825a.hashCode() * 31;
            boolean z10 = this.f42826b;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            return "Challenges(challenges=" + this.f42825a + ", isLoading=" + this.f42826b + ")";
        }
    }

    /* JADX INFO: renamed from: nh.r$c */
    public static final class c extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final C7779f f42827a;

        /* JADX INFO: renamed from: b */
        public final C7779f f42828b;

        /* JADX INFO: renamed from: c */
        public final boolean f42829c;

        public c(C7779f c7779f, C7779f c7779f2, boolean z10) {
            C5207g.m11111f(c7779f2, "daily");
            this.f42827a = c7779f;
            this.f42828b = c7779f2;
            this.f42829c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C5207g.m11106a(this.f42827a, cVar.f42827a) && C5207g.m11106a(this.f42828b, cVar.f42828b) && this.f42829c == cVar.f42829c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        public final int hashCode() {
            int iHashCode = (this.f42828b.hashCode() + (this.f42827a.hashCode() * 31)) * 31;
            boolean z10 = this.f42829c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CombinedLineGraph(cumulative=");
            sb2.append(this.f42827a);
            sb2.append(", daily=");
            sb2.append(this.f42828b);
            sb2.append(", isLoading=");
            return C0166e.m769p(sb2, this.f42829c, ")");
        }
    }

    /* JADX INFO: renamed from: nh.r$d */
    public static final class d extends AbstractC7791r {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return C5207g.m11106a(null, null);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public final int hashCode() {
            Integer.hashCode(0);
            Integer.hashCode(0);
            throw null;
        }

        public final String toString() {
            return "CurrentDay(count=0, goal=0, timeRemaining=null)";
        }
    }

    /* JADX INFO: renamed from: nh.r$e */
    public static final class e extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final String f42830a;

        public e(String str) {
            this.f42830a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C5207g.m11106a(this.f42830a, ((e) obj).f42830a);
        }

        public final int hashCode() {
            return this.f42830a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("Description(title="), this.f42830a, ")");
        }
    }

    /* JADX INFO: renamed from: nh.r$f */
    public static final class f extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final int f42831a;

        /* JADX INFO: renamed from: b */
        public final List<LanguageProgressSort> f42832b;

        /* JADX INFO: renamed from: c */
        public final String f42833c;

        public f(String str, List list) {
            C5207g.m11111f(list, "options");
            this.f42831a = R.string.stats_details;
            this.f42832b = list;
            this.f42833c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f42831a == fVar.f42831a && C5207g.m11106a(this.f42832b, fVar.f42832b) && C5207g.m11106a(this.f42833c, fVar.f42833c);
        }

        public final int hashCode() {
            return this.f42833c.hashCode() + C0204c.m848g(this.f42832b, Integer.hashCode(this.f42831a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Filter(title=");
            sb2.append(this.f42831a);
            sb2.append(", options=");
            sb2.append(this.f42832b);
            sb2.append(", key=");
            return C0009a.m23l(sb2, this.f42833c, ")");
        }
    }

    /* JADX INFO: renamed from: nh.r$g */
    public static final class g extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final List<C5196a> f42834a;

        /* JADX INFO: renamed from: b */
        public final int f42835b;

        /* JADX INFO: renamed from: c */
        public final boolean f42836c;

        public g(int i10, List list, boolean z10) {
            C5207g.m11111f(list, "languageGoals");
            this.f42834a = list;
            this.f42835b = i10;
            this.f42836c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (C5207g.m11106a(this.f42834a, gVar.f42834a) && this.f42835b == gVar.f42835b && this.f42836c == gVar.f42836c) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int iM16d = C0009a.m16d(this.f42835b, this.f42834a.hashCode() * 31, 31);
            boolean z10 = this.f42836c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iM16d + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Goals(languageGoals=");
            sb2.append(this.f42834a);
            sb2.append(", activityScore=");
            sb2.append(this.f42835b);
            sb2.append(", isLoading=");
            return C0166e.m769p(sb2, this.f42836c, ")");
        }
    }

    /* JADX INFO: renamed from: nh.r$h */
    public static final class h extends AbstractC7791r {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            ((h) obj).getClass();
            return C5207g.m11106a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "LineGraph(graphs=null, isLoading=false)";
        }
    }

    /* JADX INFO: renamed from: nh.r$i */
    public static final class i extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final List<C7780g> f42837a;

        /* JADX INFO: renamed from: b */
        public final boolean f42838b;

        public i(List<C7780g> list, boolean z10) {
            C5207g.m11111f(list, "numberItems");
            this.f42837a = list;
            this.f42838b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return C5207g.m11106a(this.f42837a, iVar.f42837a) && this.f42838b == iVar.f42838b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public final int hashCode() {
            int iHashCode = this.f42837a.hashCode() * 31;
            boolean z10 = this.f42838b;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            return "Numbers(numberItems=" + this.f42837a + ", isLoading=" + this.f42838b + ")";
        }
    }

    /* JADX INFO: renamed from: nh.r$j */
    public static final class j extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final int f42839a;

        /* JADX INFO: renamed from: b */
        public final List<C8048g> f42840b;

        /* JADX INFO: renamed from: c */
        public final boolean f42841c;

        /* JADX INFO: renamed from: d */
        public final boolean f42842d;

        public j(int i10, List<C8048g> list, boolean z10, boolean z11) {
            C5207g.m11111f(list, "entries");
            this.f42839a = i10;
            this.f42840b = list;
            this.f42841c = z10;
            this.f42842d = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f42839a == jVar.f42839a && C5207g.m11106a(this.f42840b, jVar.f42840b) && this.f42841c == jVar.f42841c && this.f42842d == jVar.f42842d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        public final int hashCode() {
            int iM848g = C0204c.m848g(this.f42840b, Integer.hashCode(this.f42839a) * 31, 31);
            ?? r10 = 1;
            boolean z10 = this.f42841c;
            ?? r11 = z10;
            if (z10) {
                r11 = 1;
            }
            int i10 = (iM848g + r11) * 31;
            boolean z11 = this.f42842d;
            if (!z11) {
                r10 = z11;
            }
            return i10 + r10;
        }

        public final String toString() {
            return "Streak(value=" + this.f42839a + ", entries=" + this.f42840b + ", showCurrentDayStreak=" + this.f42841c + ", isLoading=" + this.f42842d + ")";
        }
    }

    /* JADX INFO: renamed from: nh.r$k */
    public static final class k extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final String f42843a;

        public k(String str) {
            this.f42843a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && C5207g.m11106a(this.f42843a, ((k) obj).f42843a);
        }

        public final int hashCode() {
            return this.f42843a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("Timer(timeRemaining="), this.f42843a, ")");
        }
    }

    /* JADX INFO: renamed from: nh.r$l */
    public static final class l extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final int f42844a = R.string.complete_lesson_stats;

        /* JADX INFO: renamed from: b */
        public final Object f42845b = null;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (this.f42844a == lVar.f42844a && C5207g.m11106a(this.f42845b, lVar.f42845b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f42844a) * 31;
            Object obj = this.f42845b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "Title(title=" + this.f42844a + ", arg=" + this.f42845b + ")";
        }
    }

    /* JADX INFO: renamed from: nh.r$m */
    public static final class m extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final int f42846a = R.string.stats_n_day_streak;

        /* JADX INFO: renamed from: b */
        public final Object f42847b;

        /* JADX INFO: renamed from: c */
        public final Integer f42848c;

        /* JADX INFO: renamed from: d */
        public final Integer f42849d;

        /* JADX INFO: renamed from: e */
        public final Integer f42850e;

        /* JADX INFO: renamed from: f */
        public final Integer f42851f;

        public m(Object obj, Integer num, Integer num2, Integer num3, Integer num4) {
            this.f42847b = obj;
            this.f42848c = num;
            this.f42849d = num2;
            this.f42850e = num3;
            this.f42851f = num4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.f42846a == mVar.f42846a && C5207g.m11106a(this.f42847b, mVar.f42847b) && C5207g.m11106a(this.f42848c, mVar.f42848c) && C5207g.m11106a(this.f42849d, mVar.f42849d) && C5207g.m11106a(this.f42850e, mVar.f42850e) && C5207g.m11106a(this.f42851f, mVar.f42851f);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f42846a) * 31;
            int iHashCode2 = 0;
            Object obj = this.f42847b;
            int iHashCode3 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Integer num = this.f42848c;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f42849d;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f42850e;
            int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f42851f;
            if (num4 != null) {
                iHashCode2 = num4.hashCode();
            }
            return iHashCode6 + iHashCode2;
        }

        public final String toString() {
            return "TitleRepairStreak(title=" + this.f42846a + ", arg=" + this.f42847b + ", streak=" + this.f42848c + ", previousDayLingqs=" + this.f42849d + ", goal=" + this.f42850e + ", activityLevel=" + this.f42851f + ")";
        }
    }

    /* JADX INFO: renamed from: nh.r$n */
    public static final class n extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final int f42852a = R.string.challenges_active_challenges;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f42852a == ((n) obj).f42852a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42852a);
        }

        public final String toString() {
            return C0166e.m768o(new StringBuilder("TitleWithViewAll(title="), this.f42852a, ")");
        }
    }

    /* JADX INFO: renamed from: nh.r$o */
    public static final class o extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final int f42853a;

        /* JADX INFO: renamed from: b */
        public final int f42854b;

        /* JADX INFO: renamed from: c */
        public final int f42855c;

        /* JADX INFO: renamed from: d */
        public final double f42856d;

        /* JADX INFO: renamed from: e */
        public final int f42857e;

        /* JADX INFO: renamed from: f */
        public final int f42858f;

        /* JADX INFO: renamed from: g */
        public final int f42859g;

        public o(double d10, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f42853a = i10;
            this.f42854b = i11;
            this.f42855c = i12;
            this.f42856d = d10;
            this.f42857e = i13;
            this.f42858f = i14;
            this.f42859g = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.f42853a == oVar.f42853a && this.f42854b == oVar.f42854b && this.f42855c == oVar.f42855c && Double.compare(this.f42856d, oVar.f42856d) == 0 && this.f42857e == oVar.f42857e && this.f42858f == oVar.f42858f && this.f42859g == oVar.f42859g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42859g) + C0009a.m16d(this.f42858f, C0009a.m16d(this.f42857e, C0141b.m609e(this.f42856d, C0009a.m16d(this.f42855c, C0009a.m16d(this.f42854b, Integer.hashCode(this.f42853a) * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Today(lingqsCreated=");
            sb2.append(this.f42853a);
            sb2.append(", wordsLearned=");
            sb2.append(this.f42854b);
            sb2.append(", wordsRead=");
            sb2.append(this.f42855c);
            sb2.append(", hoursListened=");
            sb2.append(this.f42856d);
            sb2.append(", count=");
            sb2.append(this.f42857e);
            sb2.append(", goal=");
            sb2.append(this.f42858f);
            sb2.append(", activityID=");
            return C0166e.m768o(sb2, this.f42859g, ")");
        }
    }

    /* JADX INFO: renamed from: nh.r$p */
    public static final class p extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final boolean f42860a;

        public p(boolean z10) {
            this.f42860a = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f42860a == ((p) obj).f42860a;
        }

        public final int hashCode() {
            boolean z10 = this.f42860a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final String toString() {
            return "TodayAllTime(isToday=" + this.f42860a + ")";
        }
    }

    /* JADX INFO: renamed from: nh.r$q */
    public static final class q extends AbstractC7791r {

        /* JADX INFO: renamed from: a */
        public final int f42861a;

        /* JADX INFO: renamed from: b */
        public final List<LanguageProgressMetric> f42862b;

        /* JADX INFO: renamed from: c */
        public final List<LanguageProgressPeriod> f42863c;

        /* JADX INFO: renamed from: d */
        public final String f42864d;

        /* JADX INFO: renamed from: e */
        public final String f42865e;

        public q(List list, List list2, String str, String str2) {
            C5207g.m11111f(list, "metrics");
            C5207g.m11111f(list2, "periods");
            C5207g.m11111f(str, "key1");
            C5207g.m11111f(str2, "key2");
            this.f42861a = R.string.stats_activity;
            this.f42862b = list;
            this.f42863c = list2;
            this.f42864d = str;
            this.f42865e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.f42861a == qVar.f42861a && C5207g.m11106a(this.f42862b, qVar.f42862b) && C5207g.m11106a(this.f42863c, qVar.f42863c) && C5207g.m11106a(this.f42864d, qVar.f42864d) && C5207g.m11106a(this.f42865e, qVar.f42865e);
        }

        public final int hashCode() {
            return this.f42865e.hashCode() + C0166e.m758d(this.f42864d, C0204c.m848g(this.f42863c, C0204c.m848g(this.f42862b, Integer.hashCode(this.f42861a) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TwoFilters(title=");
            sb2.append(this.f42861a);
            sb2.append(", metrics=");
            sb2.append(this.f42862b);
            sb2.append(", periods=");
            sb2.append(this.f42863c);
            sb2.append(", key1=");
            sb2.append(this.f42864d);
            sb2.append(", key2=");
            return C0009a.m23l(sb2, this.f42865e, ")");
        }
    }
}
