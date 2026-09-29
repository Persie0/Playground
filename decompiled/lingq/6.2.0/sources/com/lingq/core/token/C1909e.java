package com.lingq.core.token;

import android.graphics.Rect;
import android.os.Parcelable;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1306v;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.dictionaries.C1376b;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.theme.C1530a;
import com.lingq.core.domain.token.C1533a;
import com.lingq.core.domain.token.C1534b;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.player.C1808b;
import com.lingq.core.token.domain.C1904a;
import com.lingq.core.token.domain.C1905b;
import com.lingq.core.token.domain.C1906c;
import com.lingq.core.token.domain.C1907d;
import com.lingq.core.token.domain.C1908e;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.C3509qs;
import p000.C3540rl;
import p000.a3a;
import p000.b3a;
import p000.bia;
import p000.bz5;
import p000.c13;
import p000.c18;
import p000.c2a;
import p000.c3a;
import p000.c7a;
import p000.c83;
import p000.ck6;
import p000.cl9;
import p000.cma;
import p000.d2a;
import p000.d3a;
import p000.e28;
import p000.e2a;
import p000.e3a;
import p000.e7a;
import p000.eh9;
import p000.f2a;
import p000.f3a;
import p000.f5a;
import p000.fa4;
import p000.fm3;
import p000.g2a;
import p000.g3a;
import p000.g41;
import p000.gm5;
import p000.h23;
import p000.h2a;
import p000.h3a;
import p000.hi8;
import p000.i2a;
import p000.i3a;
import p000.j2a;
import p000.j3a;
import p000.j5a;
import p000.k2a;
import p000.l2a;
import p000.l3a;
import p000.l83;
import p000.lda;
import p000.m2a;
import p000.m83;
import p000.n2a;
import p000.n58;
import p000.nl3;
import p000.nl8;
import p000.o2a;
import p000.oz8;
import p000.p08;
import p000.p2a;
import p000.p33;
import p000.pg9;
import p000.ph2;
import p000.pk6;
import p000.pl3;
import p000.q2a;
import p000.r2a;
import p000.rm3;
import p000.s2a;
import p000.sca;
import p000.t2a;
import p000.t4a;
import p000.t62;
import p000.u29;
import p000.u2a;
import p000.u66;
import p000.u91;
import p000.ui3;
import p000.un1;
import p000.v2a;
import p000.v72;
import p000.va2;
import p000.vj6;
import p000.vk9;
import p000.vqb;
import p000.vz1;
import p000.w2a;
import p000.w3a;
import p000.w65;
import p000.wfb;
import p000.wta;
import p000.wz0;
import p000.x2a;
import p000.xa2;
import p000.xi9;
import p000.y2a;
import p000.y5a;
import p000.z2a;
import p000.zf2;

/* JADX INFO: renamed from: com.lingq.core.token.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1909e extends wta implements cma, bia, e7a, l3a {
    public static final j5a Companion = new j5a();

    /* JADX INFO: renamed from: A */
    public final C1908e f23863A;

    /* JADX INFO: renamed from: B */
    public final C1534b f23864B;

    /* JADX INFO: renamed from: C */
    public final oz8 f23865C;

    /* JADX INFO: renamed from: D */
    public final fm3 f23866D;

    /* JADX INFO: renamed from: E */
    public final C1906c f23867E;

    /* JADX INFO: renamed from: F */
    public final l3a f23868F;

    /* JADX INFO: renamed from: G */
    public final e7a f23869G;

    /* JADX INFO: renamed from: H */
    public final C1808b f23870H;

    /* JADX INFO: renamed from: I */
    public final bz5 f23871I;

    /* JADX INFO: renamed from: J */
    public final cma f23872J;

    /* JADX INFO: renamed from: K */
    public final bia f23873K;

    /* JADX INFO: renamed from: L */
    public final sca f23874L;

    /* JADX INFO: renamed from: M */
    public final C3509qs f23875M;

    /* JADX INFO: renamed from: N */
    public final pk6 f23876N;

    /* JADX INFO: renamed from: O */
    public final un1 f23877O;

    /* JADX INFO: renamed from: P */
    public final t4a f23878P;

    /* JADX INFO: renamed from: Q */
    public final C3244l f23879Q;

    /* JADX INFO: renamed from: R */
    public final int f23880R;

    /* JADX INFO: renamed from: S */
    public final C3244l f23881S;

    /* JADX INFO: renamed from: T */
    public final C3244l f23882T;

    /* JADX INFO: renamed from: U */
    public final C3244l f23883U;

    /* JADX INFO: renamed from: V */
    public pg9 f23884V;

    /* JADX INFO: renamed from: W */
    public final C3244l f23885W;

    /* JADX INFO: renamed from: X */
    public final c18 f23886X;

    /* JADX INFO: renamed from: Y */
    public final C3244l f23887Y;

    /* JADX INFO: renamed from: b */
    public final C1904a f23888b;

    /* JADX INFO: renamed from: c */
    public final C1907d f23889c;

    /* JADX INFO: renamed from: d */
    public final vj6 f23890d;

    /* JADX INFO: renamed from: e */
    public final vqb f23891e;

    /* JADX INFO: renamed from: f */
    public final p33 f23892f;

    /* JADX INFO: renamed from: g */
    public final ck6 f23893g;

    /* JADX INFO: renamed from: h */
    public final C1907d f23894h;

    /* JADX INFO: renamed from: i */
    public final h23 f23895i;

    /* JADX INFO: renamed from: j */
    public final h23 f23896j;

    /* JADX INFO: renamed from: k */
    public final xa2 f23897k;

    /* JADX INFO: renamed from: l */
    public final va2 f23898l;

    /* JADX INFO: renamed from: m */
    public final C1904a f23899m;

    /* JADX INFO: renamed from: n */
    public final C1533a f23900n;

    /* JADX INFO: renamed from: o */
    public final pl3 f23901o;

    /* JADX INFO: renamed from: p */
    public final xa2 f23902p;

    /* JADX INFO: renamed from: q */
    public final C1906c f23903q;

    /* JADX INFO: renamed from: r */
    public final C1904a f23904r;

    /* JADX INFO: renamed from: s */
    public final C1534b f23905s;

    /* JADX INFO: renamed from: t */
    public final C1905b f23906t;

    /* JADX INFO: renamed from: u */
    public final hi8 f23907u;

    /* JADX INFO: renamed from: v */
    public final n58 f23908v;

    /* JADX INFO: renamed from: w */
    public final C1906c f23909w;

    /* JADX INFO: renamed from: x */
    public final C1904a f23910x;

    /* JADX INFO: renamed from: y */
    public final xa2 f23911y;

    /* JADX INFO: renamed from: z */
    public final C1906c f23912z;

    public C1909e(C1904a c1904a, C1907d c1907d, vj6 vj6Var, vqb vqbVar, p33 p33Var, ck6 ck6Var, C1907d c1907d2, h23 h23Var, h23 h23Var2, xa2 xa2Var, va2 va2Var, C1904a c1904a2, C1533a c1533a, pl3 pl3Var, xa2 xa2Var2, C1906c c1906c, C1904a c1904a3, C1376b c1376b, C1534b c1534b, C1905b c1905b, hi8 hi8Var, n58 n58Var, C1906c c1906c2, C1904a c1904a4, xa2 xa2Var3, C1906c c1906c3, nl3 nl3Var, C1908e c1908e, rm3 rm3Var, C1908e c1908e2, C1534b c1534b2, oz8 oz8Var, fm3 fm3Var, C1906c c1906c4, C1530a c1530a, nl3 nl3Var2, l3a l3aVar, e7a e7aVar, C1808b c1808b, bz5 bz5Var, cma cmaVar, bia biaVar, sca scaVar, C3509qs c3509qs, pk6 pk6Var, un1 un1Var, nl8 nl8Var) {
        TokenPopupData tokenPopupData;
        Integer num;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        l3aVar.getClass();
        e7aVar.getClass();
        c1808b.getClass();
        bz5Var.getClass();
        cmaVar.getClass();
        biaVar.getClass();
        scaVar.getClass();
        c3509qs.getClass();
        pk6Var.getClass();
        un1Var.getClass();
        nl8Var.getClass();
        this.f23888b = c1904a;
        this.f23889c = c1907d;
        this.f23890d = vj6Var;
        this.f23891e = vqbVar;
        this.f23892f = p33Var;
        this.f23893g = ck6Var;
        this.f23894h = c1907d2;
        this.f23895i = h23Var;
        this.f23896j = h23Var2;
        this.f23897k = xa2Var;
        this.f23898l = va2Var;
        this.f23899m = c1904a2;
        this.f23900n = c1533a;
        this.f23901o = pl3Var;
        this.f23902p = xa2Var2;
        this.f23903q = c1906c;
        this.f23904r = c1904a3;
        this.f23905s = c1534b;
        this.f23906t = c1905b;
        this.f23907u = hi8Var;
        this.f23908v = n58Var;
        this.f23909w = c1906c2;
        this.f23910x = c1904a4;
        this.f23911y = xa2Var3;
        this.f23912z = c1906c3;
        this.f23863A = c1908e2;
        this.f23864B = c1534b2;
        this.f23865C = oz8Var;
        this.f23866D = fm3Var;
        this.f23867E = c1906c4;
        this.f23868F = l3aVar;
        this.f23869G = e7aVar;
        this.f23870H = c1808b;
        this.f23871I = bz5Var;
        this.f23872J = cmaVar;
        this.f23873K = biaVar;
        this.f23874L = scaVar;
        this.f23875M = c3509qs;
        this.f23876N = pk6Var;
        this.f23877O = un1Var;
        t4a.Companion.getClass();
        if (!nl8Var.m17487a("tokenData")) {
            tokenPopupData = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(TokenPopupData.class) && !Serializable.class.isAssignableFrom(TokenPopupData.class)) {
                C3386nv.m17636w(TokenPopupData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                throw null;
            }
            tokenPopupData = (TokenPopupData) nl8Var.m17488b("tokenData");
        }
        if (nl8Var.m17487a("lessonId")) {
            num = (Integer) nl8Var.m17488b("lessonId");
            if (num == null) {
                C3386nv.m17626m("Argument \"lessonId\" of type integer does not support null values");
                throw null;
            }
        } else {
            num = -1;
        }
        if (nl8Var.m17487a("shouldPlayTts")) {
            bool = (Boolean) nl8Var.m17488b("shouldPlayTts");
            if (bool == null) {
                C3386nv.m17626m("Argument \"shouldPlayTts\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool = Boolean.TRUE;
        }
        if (nl8Var.m17487a("fromVocabulary")) {
            bool2 = (Boolean) nl8Var.m17488b("fromVocabulary");
            if (bool2 == null) {
                C3386nv.m17626m("Argument \"fromVocabulary\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool2 = Boolean.FALSE;
        }
        if (nl8Var.m17487a("isSentence")) {
            bool3 = (Boolean) nl8Var.m17488b("isSentence");
            if (bool3 == null) {
                C3386nv.m17626m("Argument \"isSentence\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool3 = Boolean.FALSE;
        }
        int iIntValue = num.intValue();
        this.f23878P = new t4a(tokenPopupData, iIntValue, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
        C3244l c3244lM17114d = AbstractC3352my.m17114d(tokenPopupData);
        this.f23879Q = c3244lM17114d;
        this.f23880R = iIntValue;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f23881S = c3244lM17114d2;
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(emptyList);
        this.f23882T = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(emptyList);
        this.f23883U = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(new f5a(0, true, null, null, null, -9, 2097151));
        this.f23885W = c3244lM17114d5;
        this.f23886X = AbstractC3224d.m15520B(c3244lM17114d5, lda.m16103C(this), xi9.f68262a, new f5a(iIntValue, true, null, null, null, -13, 2097151));
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(null);
        this.f23887Y = c3244lM17114d6;
        int i = 2;
        AbstractC3224d.m15545x(new m83(new C3540rl(cmaVar.mo4572B0(), 5), new TokenUpdateViewModel$1(this, null), i), lda.m16103C(this));
        int i2 = 13;
        AbstractC3224d.m15545x(new m83(new C3228h(new p08(cmaVar.mo4585R(), i2), new C3540rl(c3244lM17114d, 5), new TokenUpdateViewModel$3(3, null)), new TokenUpdateViewModel$4(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new C3540rl(c3244lM17114d, 5), new TokenUpdateViewModel$5(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d5, new TokenUpdateViewModel$6(2, null))), new TokenUpdateViewModel$7(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new C3228h(AbstractC3224d.m15536o(new c13(c3244lM17114d5, i2)), AbstractC3224d.m15536o(((C1368a) nl3Var.f52909a).f18422k1), new TokenUpdateViewModel$9(this, null)), new TokenUpdateViewModel$10(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new p08(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d5, new TokenUpdateViewModel$11(2, null))), 12), new TokenUpdateViewModel$13(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d5, new TokenUpdateViewModel$14(2, null))), new TokenUpdateViewModel$15(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(((C1368a) rm3Var.f59534a).f18383W0), new TokenUpdateViewModel$16(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15530i(c3244lM17114d4, c3244lM17114d2, c3244lM17114d3, AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d5, new TokenUpdateViewModel$17(2, null))), AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d5, new TokenUpdateViewModel$18(2, null))), new TokenUpdateViewModel$19(null)), new TokenUpdateViewModel$20(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(c1908e.m8728a(), new TokenUpdateViewModel$21(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(c1530a.m8209a(), new TokenUpdateViewModel$22(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(((C1368a) nl3Var2.f52909a).f18464y1), new TokenUpdateViewModel$23(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new wz0(28, c3244lM17114d5, this)), new TokenUpdateViewModel$25(this, null), i), lda.m16103C(this));
        m83 m83Var = new m83(new l83(c1376b.m7982a(), new TokenUpdateViewModel$observeAvailableLocales$1(this, null), 1), new TokenUpdateViewModel$observeAvailableLocales$2(this, null), i);
        g41 g41VarM16103C = lda.m16103C(this);
        String strM17734i = AbstractC3393o1.m17734i("available locales ", cmaVar.mo4589b2());
        v72 v72Var = ph2.f56212a;
        AbstractC1263a.m7049d(m83Var, g41VarM16103C, strM17734i, t62.f61909c);
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15535n(new C3540rl(c3244lM17114d6, 5), 500L), new TokenUpdateViewModel$26(this, null), i), lda.m16103C(this));
    }

    /* JADX INFO: renamed from: V2 */
    public static final void m8730V2(C1909e c1909e, String str, String str2, String str3, String str4) {
        Object value;
        Object value2;
        String str5 = str;
        C3244l c3244l = c1909e.f23881S;
        C3244l c3244l2 = c1909e.f23885W;
        if (vk9.m23391n0(str3)) {
            return;
        }
        String strM23609O = vz1.m23609O(str3, str5);
        while (true) {
            Object value3 = c3244l2.getValue();
            if (c3244l2.m15570h(value3, f5a.m11558a((f5a) value3, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, true, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097095))) {
                break;
            } else {
                str5 = str;
            }
        }
        while (true) {
            Object value4 = c3244l.getValue();
            if (c3244l.m15570h(value4, new TokenMeaning(-1, str2, "", 0, false, str2, false, 0, 136))) {
                break;
            } else {
                str5 = str;
            }
        }
        vj6 vj6Var = c1909e.f23890d;
        vj6Var.getClass();
        m83 m83Var = new m83(AbstractC3224d.m15536o(((C1306v) ((w3a) vj6Var.f65506b)).m7383i(str5, str2, strM23609O)), new TokenUpdateViewModel$observeTranslationIfApplicable$3(c1909e, str2, null), 2);
        g41 g41VarM16103C = lda.m16103C(c1909e);
        v72 v72Var = ph2.f56212a;
        t62 t62Var = t62.f61909c;
        AbstractC1263a.m7049d(m83Var, g41VarM16103C, "translation", t62Var);
        pg9 pg9Var = c1909e.f23884V;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        if (c1909e.f23876N.m19362a()) {
            c1909e.f23884V = wfb.m23926u(lda.m16103C(c1909e), t62Var, null, new TokenUpdateViewModel$fetchTranslation$3(c1909e, str5, str2, strM23609O, str4, null), 2);
            return;
        }
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, null));
        do {
            value2 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value2, f5a.m11558a((f5a) value2, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, true, true, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097095)));
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m8731c3(C1909e c1909e, TokenPopupData tokenPopupData, int i) {
        boolean z = (i & 1) == 0;
        if ((i & 2) != 0) {
            tokenPopupData = null;
        }
        c1909e.m8757b3(tokenPopupData, z);
    }

    /* JADX INFO: renamed from: e3 */
    public static boolean m8732e3(f5a f5aVar) {
        Map map;
        TokenPopupData tokenPopupData = f5aVar.f38475g;
        if (tokenPopupData == null || (map = tokenPopupData.f23436J) == null) {
            return false;
        }
        String str = (String) u91.m22591I0(f5aVar.f38470b);
        if (str != null) {
            CharSequence charSequence = (CharSequence) map.get(str);
            return (charSequence == null || vk9.m23391n0(charSequence)) ? false : true;
        }
        Collection collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (!vk9.m23391n0((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f23872J.mo4571A();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: A0 */
    public final void mo8733A0(boolean z) {
        this.f23869G.mo8733A0(z);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f23868F.mo8734A2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f23868F.mo8735B();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f23872J.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f23872J.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f23872J.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f23872J.mo4575D0(continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: D1 */
    public final c83 mo8736D1() {
        return this.f23869G.mo8736D1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f23868F.mo8737E(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f23868F.mo8738E1(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f23868F.mo8739F();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f23872J.mo4576F1(str, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: G */
    public final void mo8740G(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f23869G.mo8740G(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f23872J.mo4577H();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f23868F.mo8741I2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f23872J.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f23872J.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f23872J.mo4580K1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: L */
    public final void mo8742L(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f23869G.mo8742L(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f23872J.mo4581L0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f23868F.mo8743L2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f23873K.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f23872J.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f23872J.mo4583O1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: P0 */
    public final boolean mo8744P0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f23869G.mo8744P0(tooltipStep);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Q */
    public final void mo8745Q() {
        this.f23869G.mo8745Q();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f23872J.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f23872J.mo4585R();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f23868F.mo8746T();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f23872J.mo4586T0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f23868F.mo8747U1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f23868F.mo8748W();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        this.f23868F.mo8749W0(tokenRelatedPhrase, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: W2 */
    public final void m8750W2(String str, int i, TokenMeaning tokenMeaning, int i2, boolean z, TokenPopupData tokenPopupData) {
        String str2;
        TokenFragmentData tokenFragmentData;
        String str3;
        c18 c18Var = this.f23886X;
        TokenPopupData tokenPopupData2 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g;
        if (tokenPopupData2 == null || (str2 = tokenPopupData2.f23446b) == null) {
            str2 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38476h;
        }
        String str4 = str2;
        TokenPopupData tokenPopupData3 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g;
        if (tokenPopupData3 == null || (tokenFragmentData = tokenPopupData3.f23450f) == null) {
            tokenFragmentData = new TokenFragmentData();
        }
        TokenFragmentData tokenFragmentData2 = tokenFragmentData;
        boolean z2 = this.f23878P.f61866e;
        TokenPopupData tokenPopupData4 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g;
        boolean z3 = tokenPopupData4 != null ? tokenPopupData4.f23456l : false;
        if (vk9.m23391n0(str4) || (str3 = tokenMeaning.f19596c) == null || vk9.m23391n0(str3)) {
            m8755a3(tokenPopupData, z);
        } else {
            wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$addMeaning$1(this, i, str, str4, tokenMeaning, i2, tokenFragmentData2, z2, z3, z, tokenPopupData, null), 3);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f23872J.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m8751X2(TokenPopupData tokenPopupData, boolean z) {
        wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$autoCreateLingQAndDismiss$1(this, tokenPopupData, z, null), 3);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m8752Y2() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f23885W;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2093439)));
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f23873K.mo3738Z();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo8753Z0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f23869G.mo8753Z0(tooltipStep);
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m8754Z2(String str, int i, int i2, boolean z, TokenPopupData tokenPopupData) {
        Object next;
        Iterator it = ((f5a) ((C3244l) this.f23886X.f9311a).getValue()).f38488t.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((TokenMeaning) next).f19594a == -1);
        TokenMeaning tokenMeaning = (TokenMeaning) next;
        if (tokenMeaning != null) {
            m8750W2(str, i, tokenMeaning, i2, z, tokenPopupData);
        } else {
            m8755a3(tokenPopupData, z);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f23872J.mo4588a0();
    }

    /* JADX INFO: renamed from: a3 */
    public final void m8755a3(TokenPopupData tokenPopupData, boolean z) {
        C3244l c3244l;
        Object value;
        if (z || tokenPopupData == null) {
            m8731c3(this, tokenPopupData, 1);
            return;
        }
        do {
            c3244l = this.f23879Q;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, tokenPopupData));
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f23868F.mo8756b0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f23872J.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m8757b3(TokenPopupData tokenPopupData, boolean z) {
        C3244l c3244l;
        Object value;
        C3244l c3244l2;
        Object value2;
        C3244l c3244l3;
        Object value3;
        EmptyList emptyList;
        C3244l c3244l4;
        Object value4;
        TokenPopupData tokenPopupData2;
        c18 c18Var = this.f23886X;
        if (((f5a) ((C3244l) c18Var.f9311a).getValue()).f38474f instanceof LessonCard) {
            wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$dismissPopup$1(this, null), 3);
        }
        this.f23868F.mo8776s2(z || ((tokenPopupData2 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g) != null && tokenPopupData2.f23441O && tokenPopupData == null), true);
        do {
            c3244l = this.f23879Q;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, null));
        do {
            c3244l2 = this.f23881S;
            value2 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value2, null));
        do {
            c3244l3 = this.f23882T;
            value3 = c3244l3.getValue();
            emptyList = EmptyList.f47638a;
        } while (!c3244l3.m15570h(value3, emptyList));
        do {
            c3244l4 = this.f23883U;
            value4 = c3244l4.getValue();
        } while (!c3244l4.m15570h(value4, emptyList));
        while (true) {
            C3244l c3244l5 = this.f23885W;
            Object value5 = c3244l5.getValue();
            EmptyList emptyList2 = emptyList;
            if (c3244l5.m15570h(value5, f5a.m11558a((f5a) value5, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, emptyList2, emptyList, null, emptyList, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -720969, 2097127))) {
                wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$dismissPopup$7(tokenPopupData, this, null), 3);
                return;
            }
            emptyList = emptyList2;
        }
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f23868F.mo8758c();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f23872J.mo4590d0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: d1 */
    public final void mo8759d1() {
        this.f23869G.mo8759d1();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m8760d3(j3a j3aVar) {
        C3244l c3244l;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        String str;
        String str2;
        Object value10;
        String strM17734i;
        Object value11;
        Object value12;
        f5a f5aVar;
        String str3;
        Object value13;
        Object value14;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        Object value15;
        d3a d3aVar;
        j3aVar.getClass();
        cma cmaVar = this.f23872J;
        String strMo4589b2 = cmaVar.mo4589b2();
        cmaVar.mo4580K1();
        boolean z = j3aVar instanceof c3a;
        int i2 = 2;
        C3244l c3244l2 = this.f23885W;
        if (z) {
            c3a c3aVar = (c3a) j3aVar;
            TokenPopupData tokenPopupData = c3aVar.f9427a;
            TokenPopupData tokenPopupData2 = ((f5a) c3244l2.getValue()).f38475g;
            if (tokenPopupData != null) {
                String str8 = tokenPopupData.f23446b;
                if (tokenPopupData2 != null && !tokenPopupData.f23444R && fa4.m11650l(tokenPopupData2.f23446b, str8) && tokenPopupData2.f23447c == tokenPopupData.f23447c && tokenPopupData2.f23456l == tokenPopupData.f23456l && tokenPopupData2.f23452h == tokenPopupData.f23452h && tokenPopupData2.f23454j == tokenPopupData.f23454j && tokenPopupData2.f23434H == tokenPopupData.f23434H && tokenPopupData2.f23435I == tokenPopupData.f23435I && tokenPopupData2.f23439M == tokenPopupData.f23439M && tokenPopupData2.f23440N == tokenPopupData.f23440N) {
                    wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$playTtsIfApplicable$2(((f5a) c3244l2.getValue()).f38478j, str8, this, strMo4589b2, new u29(this, tokenPopupData2, j3aVar, i2), null), 3);
                    return;
                }
            }
            m8764g3(c3aVar);
            return;
        }
        if (j3aVar instanceof n2a) {
            m8751X2(null, false);
            return;
        }
        if (j3aVar instanceof p2a) {
            m8751X2(null, true);
            return;
        }
        if (j3aVar instanceof d3a) {
            do {
                value15 = c3244l2.getValue();
                d3aVar = (d3a) j3aVar;
            } while (!c3244l2.m15570h(value15, f5a.m11558a((f5a) value15, null, null, false, null, null, null, null, null, false, false, new Pair(d3aVar.f34970a, d3aVar.f34971b), null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -2049, 2097151)));
            return;
        }
        if (j3aVar instanceof t2a) {
            t2a t2aVar = (t2a) j3aVar;
            wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$playTts$1(this, t2aVar.f61774a, t2aVar.f61775b, null), 3);
            return;
        }
        boolean z2 = j3aVar instanceof h3a;
        c18 c18Var = this.f23886X;
        if (z2) {
            String str9 = ((h3a) j3aVar).f41760a;
            u66 u66Var = c18Var.f9311a;
            u66 u66Var2 = c18Var.f9311a;
            TokenPopupData tokenPopupData3 = ((f5a) ((C3244l) u66Var).getValue()).f38475g;
            if (tokenPopupData3 == null || (str7 = tokenPopupData3.f23446b) == null) {
                str7 = ((f5a) ((C3244l) u66Var2).getValue()).f38476h;
            }
            if (!(((f5a) ((C3244l) u66Var2).getValue()).f38474f instanceof LessonCard) || vk9.m23391n0(str7)) {
                return;
            }
            AbstractC1263a.m7048c(lda.m16103C(this), str7.concat(" notes"), new TokenUpdateViewModel$scheduleNotesUpdate$1(this, strMo4589b2, str7, str9, null));
            return;
        }
        if (!(j3aVar instanceof x2a)) {
            if (j3aVar instanceof i3a) {
                TokenStatus tokenStatus = ((i3a) j3aVar).f43453a;
                w65 w65Var = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38474f;
                if (w65Var == null) {
                    return;
                }
                String strM23609O = vz1.m23609O(w65Var.mo8037d(), cmaVar.mo4589b2());
                TokenPopupData tokenPopupData4 = ((f5a) c3244l2.getValue()).f38475g;
                if ((tokenPopupData4 != null ? Integer.valueOf(tokenPopupData4.f23439M) : null) == null || (i = tokenPopupData4.f23439M) == -1) {
                    i = this.f23880R;
                }
                wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$handleStatusUpdate$1(w65Var, tokenStatus, this, strMo4589b2, strM23609O, i, null), 3);
                return;
            }
            if (j3aVar instanceof d2a) {
                m8750W2(strMo4589b2, this.f23880R, ((d2a) j3aVar).f34875a, CardStatus.New.getValue(), true, null);
                return;
            }
            if (j3aVar instanceof g3a) {
                g3a g3aVar = (g3a) j3aVar;
                TokenMeaning tokenMeaning = g3aVar.f40135a;
                String str10 = g3aVar.f40136b;
                TokenPopupData tokenPopupData5 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g;
                if (tokenPopupData5 == null || (str6 = tokenPopupData5.f23446b) == null) {
                    str6 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38476h;
                }
                if (vk9.m23391n0(str6)) {
                    return;
                }
                wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$updateMeaning$1(this, strMo4589b2, str6, tokenMeaning, str10, null), 3);
                return;
            }
            if (j3aVar instanceof u2a) {
                u2a u2aVar = (u2a) j3aVar;
                TokenMeaning tokenMeaning2 = u2aVar.f63329a;
                int i3 = u2aVar.f63330b;
                TokenPopupData tokenPopupData6 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g;
                if (tokenPopupData6 == null || (str5 = tokenPopupData6.f23446b) == null) {
                    str5 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38476h;
                }
                if (vk9.m23391n0(str5)) {
                    return;
                }
                wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$removeMeaning$1(this, strMo4589b2, str5, tokenMeaning2, i3, null), 3);
                return;
            }
            if (j3aVar instanceof q2a) {
                TokenMeaning tokenMeaning3 = ((q2a) j3aVar).f57172a;
                u66 u66Var3 = c18Var.f9311a;
                u66 u66Var4 = c18Var.f9311a;
                TokenPopupData tokenPopupData7 = ((f5a) ((C3244l) u66Var3).getValue()).f38475g;
                if (tokenPopupData7 == null || (str4 = tokenPopupData7.f23446b) == null) {
                    str4 = ((f5a) ((C3244l) u66Var4).getValue()).f38476h;
                }
                String str11 = ((f5a) ((C3244l) u66Var4).getValue()).f38494z;
                if (vk9.m23391n0(str4)) {
                    return;
                }
                wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$flagMeaning$1(this, strMo4589b2, str4, tokenMeaning3, str11, null), 3);
                return;
            }
            if (j3aVar instanceof e2a) {
                wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$changePopularMeaningLocale$1(this, strMo4589b2, ((e2a) j3aVar).f36630a, null), 3);
                return;
            }
            if (j3aVar instanceof z2a) {
                zf2 zf2Var = ((z2a) j3aVar).f70806a;
                do {
                    value14 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value14, f5a.m11558a((f5a) value14, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, new Pair(vz1.m23609O(((f5a) ((C3244l) c18Var.f9311a).getValue()).f38476h, cmaVar.mo4589b2()), zf2Var), false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097023)));
                return;
            }
            if (j3aVar instanceof y2a) {
                do {
                    value13 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value13, f5a.m11558a((f5a) value13, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, true, null, null, null, false, false, null, null, false, null, null, null, -1, 2096639)));
                return;
            }
            if (j3aVar instanceof w2a) {
                w2a w2aVar = (w2a) j3aVar;
                TokenMeaning tokenMeaning4 = w2aVar.f66308a;
                String str12 = w2aVar.f66309b;
                do {
                    value12 = c3244l2.getValue();
                    f5aVar = (f5a) value12;
                    TokenPopupData tokenPopupData8 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g;
                    if (tokenPopupData8 == null || (str3 = tokenPopupData8.f23446b) == null) {
                        str3 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38476h;
                    }
                } while (!c3244l2.m15570h(value12, f5a.m11558a(f5aVar, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, new Triple(str3, tokenMeaning4, str12), null, null, false, false, null, null, false, null, null, null, -1, 2096127)));
                return;
            }
            if (j3aVar instanceof b3a) {
                String str13 = ((b3a) j3aVar).f7880a;
                if (!fa4.m11650l(cmaVar.mo4589b2(), LanguageLearn.Japanese.getCode())) {
                    List list = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38485q;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (cl9.m4834Q((String) it.next(), str13, true)) {
                        }
                    }
                    return;
                }
                List list2 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38485q;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return;
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (cl9.m4834Q((String) it2.next(), str13, true)) {
                        if (AbstractC3352my.m17096O(str13, cmaVar.mo4589b2())) {
                            return;
                        }
                    }
                }
                return;
                if (fa4.m11650l(cmaVar.mo4589b2(), LanguageLearn.Japanese.getCode())) {
                    String strM17084C = AbstractC3352my.m17084C(str13);
                    strM17734i = !vk9.m23391n0(strM17084C) ? String.format("https://www.lingq.com/%s/grammar-resource/japanese/%s", Arrays.copyOf(new Object[]{cmaVar.mo4580K1(), strM17084C}, 2)) : AbstractC3393o1.m17734i("https://cooljugator.com/ja/", URLEncoder.encode(str13, "utf-8"));
                } else {
                    strM17734i = String.format("https://www.lingq.com/%s/grammar-resource/%s/tag/%s/", Arrays.copyOf(new Object[]{cmaVar.mo4580K1(), cmaVar.mo4589b2(), str13}, 3));
                }
                String str14 = strM17734i;
                do {
                    value11 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value11, f5a.m11558a((f5a) value11, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, str14, null, false, false, null, null, false, null, null, null, -1, 2095103)));
                return;
            }
            if (j3aVar instanceof v2a) {
                do {
                    value10 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value10, f5a.m11558a((f5a) value10, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, true, false, false, false, false, null, false, null, null, null, true, false, null, null, false, null, null, null, -1, 2088955)));
                l83 l83Var = new l83(new m83(new m83(this.f23909w.m8722b(strMo4589b2), new TokenUpdateViewModel$fetchAvailableTags$1(this, "", null)), new TokenUpdateViewModel$fetchAvailableTags$2(this, null), i2), new TokenUpdateViewModel$fetchAvailableTags$3(this, null), 1);
                g41 g41VarM16103C = lda.m16103C(this);
                String strConcat = strMo4589b2.concat(" ");
                v72 v72Var = ph2.f56212a;
                AbstractC1263a.m7049d(l83Var, g41VarM16103C, strConcat, t62.f61909c);
                return;
            }
            if (j3aVar instanceof e3a) {
                String str15 = ((e3a) j3aVar).f36662a;
                TokenPopupData tokenPopupData9 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g;
                if (tokenPopupData9 == null || (str2 = tokenPopupData9.f23446b) == null) {
                    str2 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38476h;
                }
                String str16 = str2;
                if (vk9.m23391n0(str16)) {
                    return;
                }
                wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$toggleUserTag$1(this, str15, strMo4589b2, str16, null), 3);
                return;
            }
            if (j3aVar instanceof c2a) {
                String str17 = ((c2a) j3aVar).f9372a;
                TokenPopupData tokenPopupData10 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g;
                if (tokenPopupData10 == null || (str = tokenPopupData10.f23446b) == null) {
                    str = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38476h;
                }
                if (vk9.m23391n0(str) || vk9.m23391n0(str17)) {
                    return;
                }
                wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$addUserTag$1(this, strMo4589b2, str, str17, null), 3);
                return;
            }
            if (j3aVar instanceof o2a) {
                do {
                    value9 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value9, f5a.m11558a((f5a) value9, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2088959)));
                return;
            }
            if (j3aVar instanceof a3a) {
                a3a a3aVar = (a3a) j3aVar;
                TokenRelatedPhrase tokenRelatedPhrase = a3aVar.f183a;
                int i4 = a3aVar.f184b;
                int i5 = a3aVar.f185c;
                int i6 = a3aVar.f186d;
                int i7 = a3aVar.f187e;
                TokenPopupData tokenPopupData11 = ((f5a) ((C3244l) c18Var.f9311a).getValue()).f38475g;
                this.f23868F.mo8749W0(tokenRelatedPhrase, i4, i5, i6, i7, tokenPopupData11 != null ? tokenPopupData11.f23454j : -1);
                return;
            }
            if (j3aVar instanceof k2a) {
                m8752Y2();
                return;
            }
            if (j3aVar instanceof l2a) {
                do {
                    value8 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value8, f5a.m11558a((f5a) value8, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2095103)));
                return;
            }
            if (j3aVar instanceof g2a) {
                do {
                    value7 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value7, f5a.m11558a((f5a) value7, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2096127)));
                return;
            }
            if (j3aVar instanceof j2a) {
                do {
                    value6 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value6, f5a.m11558a((f5a) value6, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2096639)));
                return;
            }
            if (j3aVar instanceof h2a) {
                do {
                    value5 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value5, f5a.m11558a((f5a) value5, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 1572863)));
                return;
            }
            if (j3aVar instanceof f2a) {
                do {
                    value4 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value4, f5a.m11558a((f5a) value4, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 1048575)));
                return;
            }
            if (j3aVar instanceof r2a) {
                do {
                    value3 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value3, f5a.m11558a((f5a) value3, null, null, false, null, null, null, null, null, false, false, new Pair(null, TokenPopupAnchor.Collapsed), ((r2a) j3aVar).f58537a, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -6145, 2097151)));
                return;
            }
            if (j3aVar.equals(i2a.f43391a)) {
                do {
                    value2 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value2, f5a.m11558a((f5a) value2, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -4097, 2097151)));
                return;
            }
            if (j3aVar.equals(s2a.f60219a)) {
                mo8758c();
                return;
            }
            if (!(j3aVar instanceof f3a)) {
                if (j3aVar instanceof m2a) {
                    m8762f3();
                    return;
                } else {
                    gm5.m12750e();
                    return;
                }
            }
            f3a f3aVar = (f3a) j3aVar;
            e28 e28Var = f3aVar.f38369a;
            TokenMeaning tokenMeaning5 = f3aVar.f38370b;
            e28Var.getClass();
            tokenMeaning5.getClass();
            do {
                c3244l = this.f23887Y;
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, new Pair(e28Var, tokenMeaning5)));
            return;
        }
        if (!cmaVar.mo4598w2()) {
            mo3737M1(UpgradeReason.EXPLAIN);
            return;
        }
        TokenPopupData tokenPopupData12 = ((f5a) c3244l2.getValue()).f38475g;
        if (tokenPopupData12 == null) {
            return;
        }
        w65 w65Var2 = ((f5a) c3244l2.getValue()).f38474f;
        LessonCard lessonCard = w65Var2 instanceof LessonCard ? (LessonCard) w65Var2 : null;
        if (lessonCard == null) {
            return;
        }
        int i8 = tokenPopupData12.f23434H;
        int i9 = tokenPopupData12.f23435I;
        while (true) {
            Object value16 = c3244l2.getValue();
            if (c3244l2.m15570h(value16, f5a.m11558a((f5a) value16, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, true, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097149))) {
                wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$requestExplain$2(tokenPopupData12, this, strMo4589b2, lessonCard, i8, i9, null), 3);
                return;
            } else {
                tokenPopupData12 = tokenPopupData12;
                i9 = i9;
            }
        }
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f23868F.mo8761f();
    }

    /* JADX INFO: renamed from: f3 */
    public final void m8762f3() {
        Object value;
        C3244l c3244l = this.f23885W;
        c7a c7aVar = ((f5a) c3244l.getValue()).f38464V;
        TooltipStep tooltipStep = c7aVar != null ? c7aVar.f9664a : null;
        if (tooltipStep != null) {
            this.f23869G.mo8742L(tooltipStep);
        }
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 1900543)));
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: g */
    public final eh9 mo8763g() {
        return this.f23869G.mo8763g();
    }

    /* JADX INFO: renamed from: g3 */
    public final void m8764g3(c3a c3aVar) {
        boolean z = c3aVar.f9428b;
        TokenPopupData tokenPopupData = c3aVar.f9427a;
        if (z) {
            m8751X2(tokenPopupData, false);
            return;
        }
        C3244l c3244l = this.f23885W;
        TokenPopupData tokenPopupData2 = ((f5a) c3244l.getValue()).f38475g;
        C3244l c3244l2 = this.f23879Q;
        if (tokenPopupData2 == null || !tokenPopupData2.f23441O) {
            if (((f5a) c3244l.getValue()).f38475g == null || tokenPopupData == null) {
                c3244l2.m15571i(tokenPopupData);
                return;
            } else {
                m8751X2(tokenPopupData, false);
                return;
            }
        }
        if (tokenPopupData == null) {
            c3244l2.m15571i(null);
            return;
        }
        if (((f5a) ((C3244l) this.f23886X.f9311a).getValue()).f38474f instanceof LessonCard) {
            wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$updateDataTablet$1(this, null), 3);
        }
        wfb.m23926u(lda.m16103C(this), null, null, new TokenUpdateViewModel$updateDataTablet$2(tokenPopupData, this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f23872J.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f23868F.mo8765i();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: i1 */
    public final void mo8766i1() {
        this.f23869G.mo8766i1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f23868F.mo8767j();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: j0 */
    public final void mo8768j0(boolean z) {
        this.f23869G.mo8768j0(z);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f23873K.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f23873K.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f23872J.mo4592m0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f23868F.mo8769n0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f23872J.mo4593p0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f23868F.mo8770p1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: q0 */
    public final c83 mo8771q0() {
        return this.f23869G.mo8771q0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f23868F.mo8772q1(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f23868F.mo8773q2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f23873K.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f23872J.mo4594r1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f23868F.mo8774r2(i);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: s */
    public final void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        this.f23869G.mo8775s(y5aVar, rect, rect2, z, z2, z3, ui3Var);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f23873K.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f23872J.mo4595s1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        this.f23868F.mo8776s2(z, z2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f23872J.mo4596t();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: t0 */
    public final void mo8777t0() {
        this.f23869G.mo8777t0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: u0 */
    public final c83 mo8778u0() {
        return this.f23869G.mo8778u0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f23868F.mo8779v2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: w */
    public final c83 mo8780w() {
        return this.f23869G.mo8780w();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f23872J.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f23872J.mo4598w2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: y0 */
    public final c83 mo8781y0() {
        return this.f23869G.mo8781y0();
    }
}
