package com.lingq.feature.challenges;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.core.p012ui.challenges.LeaderboardMetric;
import com.lingq.feature.challenges.domain.C1984c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3013ft;
import p000.C3386nv;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.du0;
import p000.eh9;
import p000.fa4;
import p000.fr0;
import p000.hm5;
import p000.is0;
import p000.kr0;
import p000.lda;
import p000.ma3;
import p000.ms0;
import p000.nl8;
import p000.nm7;
import p000.nn1;
import p000.np0;
import p000.ob1;
import p000.or0;
import p000.ps0;
import p000.sk9;
import p000.ss5;
import p000.thb;
import p000.u91;
import p000.vqb;
import p000.vz1;
import p000.wfb;
import p000.wq0;
import p000.wta;
import p000.xi9;
import p000.yf4;

/* JADX INFO: renamed from: com.lingq.feature.challenges.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1962b extends wta implements cma, bia {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f24491b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bia f24492c;

    /* JADX INFO: renamed from: d */
    public final or0 f24493d;

    /* JADX INFO: renamed from: e */
    public final hm5 f24494e;

    /* JADX INFO: renamed from: f */
    public final nm7 f24495f;

    /* JADX INFO: renamed from: g */
    public final vqb f24496g;

    /* JADX INFO: renamed from: h */
    public final C1984c f24497h;

    /* JADX INFO: renamed from: i */
    public final ob1 f24498i;

    /* JADX INFO: renamed from: j */
    public final nn1 f24499j;

    /* JADX INFO: renamed from: k */
    public final wq0 f24500k;

    /* JADX INFO: renamed from: l */
    public final C3211a f24501l;

    /* JADX INFO: renamed from: m */
    public final du0 f24502m;

    /* JADX INFO: renamed from: n */
    public final C3244l f24503n;

    /* JADX INFO: renamed from: o */
    public final List f24504o;

    /* JADX INFO: renamed from: p */
    public final String f24505p;

    /* JADX INFO: renamed from: q */
    public final C3244l f24506q;

    /* JADX INFO: renamed from: r */
    public final C3244l f24507r;

    /* JADX INFO: renamed from: s */
    public final C3244l f24508s;

    /* JADX INFO: renamed from: t */
    public final C3244l f24509t;

    /* JADX INFO: renamed from: u */
    public final c18 f24510u;

    /* JADX WARN: Code duplicated, block: B:67:0x01a1  */
    public C1962b(or0 or0Var, hm5 hm5Var, nm7 nm7Var, vqb vqbVar, C1984c c1984c, ob1 ob1Var, nn1 nn1Var, cma cmaVar, bia biaVar, nl8 nl8Var) {
        String str;
        String str2;
        Object next;
        String lowerCase;
        ChallengeType challengeType;
        String str3;
        or0Var.getClass();
        hm5Var.getClass();
        nm7Var.getClass();
        ob1Var.getClass();
        cmaVar.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f24491b = cmaVar;
        this.f24492c = biaVar;
        this.f24493d = or0Var;
        this.f24494e = hm5Var;
        this.f24495f = nm7Var;
        this.f24496g = vqbVar;
        this.f24497h = c1984c;
        this.f24498i = ob1Var;
        this.f24499j = nn1Var;
        wq0.Companion.getClass();
        if (!nl8Var.m17487a("challengeCode")) {
            C3386nv.m17626m("Required argument \"challengeCode\" is missing and does not have an android:defaultValue");
            throw null;
        }
        String str4 = (String) nl8Var.m17488b("challengeCode");
        if (str4 == null) {
            C3386nv.m17626m("Argument \"challengeCode\" is marked as non-null but was passed a null value");
            throw null;
        }
        if (nl8Var.m17487a("challengeType")) {
            str = (String) nl8Var.m17488b("challengeType");
            if (str == null) {
                C3386nv.m17626m("Argument \"challengeType\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        if (nl8Var.m17487a("languageFromDeeplink")) {
            str2 = (String) nl8Var.m17488b("languageFromDeeplink");
            if (str2 == null) {
                C3386nv.m17626m("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str2 = "";
        }
        this.f24500k = new wq0(str4, str, str2);
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f24501l = c3211aM7042a;
        this.f24502m = AbstractC3224d.m15519A(c3211aM7042a);
        this.f24503n = AbstractC3352my.m17114d(LeaderboardMetric.AllMembers);
        String strM17897k = ob1Var.m17897k("country_list.txt");
        yf4 yf4VarM21704c = ss5.m21704c(new C3013ft(17));
        sk9 sk9Var = sk9.f60959a;
        Map map = strM17897k != null ? (Map) yf4VarM21704c.m10321a(strM17897k, thb.m22043b(sk9Var, sk9Var)) : null;
        List listM23604J = EmptyList.f47638a;
        if (map != null && map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(map.size());
                    arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    listM23604J = arrayList;
                } else {
                    listM23604J = vz1.m23604J(new Pair(entry.getKey(), entry.getValue()));
                }
            }
        }
        this.f24504o = listM23604J;
        this.f24505p = this.f24498i.m17890c();
        Iterator it2 = listM23604J.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!fa4.m11650l(((Pair) next).f47624b, this.f24505p));
        Pair pair = (Pair) next;
        if (pair == null || (str3 = (String) pair.f47623a) == null) {
            lowerCase = null;
        } else {
            lowerCase = str3.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        this.f24506q = AbstractC3352my.m17114d(lowerCase != null ? lowerCase : "");
        ms0 ms0Var = ChallengeType.Companion;
        String str5 = this.f24500k.f67169b;
        ChallengeType[] challengeTypeArr = (ChallengeType[]) ChallengeType.class.getEnumConstants();
        if (challengeTypeArr != null) {
            int length = challengeTypeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    challengeType = null;
                    break;
                }
                challengeType = challengeTypeArr[i];
                if (fa4.m11650l(challengeType.getValue(), str5)) {
                    break;
                } else {
                    i++;
                }
            }
            challengeType = challengeType == null ? ChallengeType.Undefined : challengeType;
        }
        C3244l c3244lM17114d = AbstractC3352my.m17114d(challengeType);
        this.f24507r = c3244lM17114d;
        this.f24508s = AbstractC3352my.m17114d(null);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(new fr0((ChallengeType) c3244lM17114d.getValue(), (2558 & 2) != 0 ? ps0.f56735a : null, (2558 & 4) != 0 ? is0.f44478a : null, (2558 & 8) != 0 ? kr0.f48354a : null, (2558 & 16) != 0 ? np0.f53085a : null, null, EmptyList.f47638a, EmptySet.f47640a, false, u91.m22614f1(this.f24504o, new ma3(5)), this.f24505p, LeaderboardMetric.AllMembers));
        this.f24509t = c3244lM17114d2;
        this.f24510u = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), xi9.f68262a, c3244lM17114d2.getValue());
        wfb.m23926u(lda.m16103C(this), this.f24499j, null, new ChallengeDetailsViewModel$observableChallengeDetail$1(this, null), 2);
        m8808V2();
        wfb.m23926u(lda.m16103C(this), null, null, new ChallengeDetailsViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ChallengeDetailsViewModel$2(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f24491b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f24491b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f24491b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f24491b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f24491b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f24491b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f24491b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f24491b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f24491b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f24491b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f24491b.mo4581L0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f24492c.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f24491b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f24491b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f24491b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f24491b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f24491b.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m8808V2() {
        AbstractC1263a.m7047b(lda.m16103C(this), this.f24499j, "networkGetChallenge", new ChallengeDetailsViewModel$networkGetChallenge$1(this, null));
    }

    /* JADX INFO: renamed from: W2 */
    public final void m8809W2() {
        AbstractC1263a.m7047b(lda.m16103C(this), this.f24499j, AbstractC3393o1.m17734i("networkGetChallengeRanking ", ((LeaderboardMetric) this.f24503n.getValue()).getKey()), new ChallengeDetailsViewModel$networkGetChallengeRanking$1(this, null));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f24491b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m8810X2() {
        AbstractC1263a.m7047b(lda.m16103C(this), this.f24499j, AbstractC3393o1.m17734i("ranking ", ((LeaderboardMetric) this.f24503n.getValue()).getKey()), new ChallengeDetailsViewModel$observableUserRankings$1(this, null));
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f24492c.mo3738Z();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f24491b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f24491b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f24491b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f24491b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f24492c.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f24492c.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f24491b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f24491b.mo4593p0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f24492c.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f24491b.mo4594r1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f24492c.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f24491b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f24491b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f24491b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f24491b.mo4598w2();
    }
}
