package com.lingq.feature.review;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.review.data.ReviewActivityResult;
import com.lingq.feature.review.domain.C2756b;
import com.lingq.feature.review.state.C2761a;
import com.lingq.feature.review.state.C2762b;
import com.lingq.feature.review.state.C2763c;
import com.lingq.feature.review.state.C2764d;
import com.lingq.feature.review.views.result.ReviewResultType;
import com.lingq.feature.review.views.speaking.SpeechRecognitionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random$Default;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.C3329mb;
import p000.C3386nv;
import p000.InterfaceC3733ws;
import p000.aa8;
import p000.ab8;
import p000.ad8;
import p000.ba8;
import p000.bb8;
import p000.bd8;
import p000.be8;
import p000.c18;
import p000.c83;
import p000.ca8;
import p000.cb8;
import p000.cd8;
import p000.ce8;
import p000.cma;
import p000.da8;
import p000.db8;
import p000.ea8;
import p000.eb8;
import p000.ec8;
import p000.ed8;
import p000.eg8;
import p000.eh9;
import p000.f41;
import p000.fa4;
import p000.fa8;
import p000.fb8;
import p000.fd8;
import p000.fi3;
import p000.ga8;
import p000.gb8;
import p000.gd8;
import p000.ge8;
import p000.gm5;
import p000.gxc;
import p000.ha8;
import p000.hb8;
import p000.hd8;
import p000.he8;
import p000.hg8;
import p000.ia8;
import p000.ib8;
import p000.id8;
import p000.ie8;
import p000.ja8;
import p000.jb8;
import p000.jq7;
import p000.ka8;
import p000.kb8;
import p000.kc8;
import p000.la8;
import p000.lb8;
import p000.ld8;
import p000.lda;
import p000.ma8;
import p000.mb8;
import p000.n58;
import p000.na8;
import p000.nb8;
import p000.nl8;
import p000.oa8;
import p000.og8;
import p000.pa8;
import p000.pg8;
import p000.qa8;
import p000.qg8;
import p000.ra8;
import p000.rc8;
import p000.rg8;
import p000.sa8;
import p000.sc8;
import p000.sca;
import p000.sx7;
import p000.t66;
import p000.ta8;
import p000.td8;
import p000.u91;
import p000.ua8;
import p000.ud8;
import p000.v0b;
import p000.v91;
import p000.v98;
import p000.va8;
import p000.vc8;
import p000.vd8;
import p000.vk9;
import p000.vz1;
import p000.w98;
import p000.wa8;
import p000.wfb;
import p000.wta;
import p000.x98;
import p000.xa2;
import p000.xa8;
import p000.xb8;
import p000.xc9;
import p000.xd8;
import p000.xe9;
import p000.xfa;
import p000.xz7;
import p000.y98;
import p000.ya8;
import p000.z98;
import p000.za8;
import p000.zc8;

/* JADX INFO: renamed from: com.lingq.feature.review.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2751b extends wta implements cma, InterfaceC3733ws, sca {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f32394b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3733ws f32395c;

    /* JADX INFO: renamed from: d */
    public final C2764d f32396d;

    /* JADX INFO: renamed from: e */
    public final C2761a f32397e;

    /* JADX INFO: renamed from: f */
    public final C2763c f32398f;

    /* JADX INFO: renamed from: g */
    public final C2762b f32399g;

    /* JADX INFO: renamed from: h */
    public final C2756b f32400h;

    /* JADX INFO: renamed from: i */
    public final sca f32401i;

    /* JADX INFO: renamed from: j */
    public final n58 f32402j;

    /* JADX INFO: renamed from: k */
    public final ec8 f32403k;

    /* JADX INFO: renamed from: l */
    public final String f32404l;

    /* JADX INFO: renamed from: m */
    public final C3244l f32405m;

    /* JADX INFO: renamed from: n */
    public final c18 f32406n;

    public C2751b(f41 f41Var, C2764d c2764d, C2761a c2761a, C2763c c2763c, C2762b c2762b, C2756b c2756b, sca scaVar, n58 n58Var, cma cmaVar, InterfaceC3733ws interfaceC3733ws, nl8 nl8Var) {
        f41Var.getClass();
        scaVar.getClass();
        cmaVar.getClass();
        interfaceC3733ws.getClass();
        nl8Var.getClass();
        this.f32394b = cmaVar;
        this.f32395c = interfaceC3733ws;
        this.f32396d = c2764d;
        this.f32397e = c2761a;
        this.f32398f = c2763c;
        this.f32399g = c2762b;
        this.f32400h = c2756b;
        this.f32401i = scaVar;
        this.f32402j = n58Var;
        id8.Companion.getClass();
        id8 id8VarM13206a = hd8.m13206a(nl8Var);
        ReviewType reviewType = id8VarM13206a.f43979b;
        String str = id8VarM13206a.f43986i;
        if (str.length() == 0) {
            ReviewType reviewType2 = id8VarM13206a.f43979b;
            reviewType2.getClass();
            switch (qg8.f57765a[reviewType2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    str = "Reader_Review icon";
                    break;
                case 4:
                case 5:
                case 6:
                    str = "Vocabulary";
                    break;
                case 7:
                case 8:
                    str = "Reader_Review Sentence";
                    break;
                default:
                    gm5.m12750e();
                    throw null;
            }
        }
        String str2 = str;
        int i = id8VarM13206a.f43978a;
        this.f32403k = new ec8(reviewType, str2, i, id8VarM13206a.f43985h, id8VarM13206a.f43982e, id8VarM13206a.f43984g, id8VarM13206a.f43980c, id8VarM13206a.f43981d);
        this.f32404l = str2;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new hg8(new pg8(), new be8(0, 0), new cd8((bd8) null, (bd8) null, (ie8) null, 15), vc8.f65195a, false, null, null, null, null));
        this.f32405m = c3244lM17114d;
        this.f32406n = AbstractC3224d.m15524c(c3244lM17114d);
        m24153Q2(f41Var);
        c2761a.f32723t = i;
        og8 og8Var = c2764d.f32753l;
        Set set = og8Var.f54320a;
        og8Var.f54320a = EmptySet.f47640a;
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$1(this, set, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: V2 */
    public static final Object m9564V2(C2751b c2751b, Set set, ContinuationImpl continuationImpl) throws Throwable {
        ReviewComposeViewModel$loadSession$1 reviewComposeViewModel$loadSession$1;
        ec8 ec8Var = c2751b.f32403k;
        C2763c c2763c = c2751b.f32398f;
        C2756b c2756b = c2751b.f32400h;
        C3244l c3244l = c2751b.f32405m;
        if (continuationImpl instanceof ReviewComposeViewModel$loadSession$1) {
            reviewComposeViewModel$loadSession$1 = (ReviewComposeViewModel$loadSession$1) continuationImpl;
            int i = reviewComposeViewModel$loadSession$1.f31714c;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewComposeViewModel$loadSession$1.f31714c = i - Integer.MIN_VALUE;
            } else {
                reviewComposeViewModel$loadSession$1 = new ReviewComposeViewModel$loadSession$1(c2751b, continuationImpl);
            }
        } else {
            reviewComposeViewModel$loadSession$1 = new ReviewComposeViewModel$loadSession$1(c2751b, continuationImpl);
        }
        Object objM9650i = reviewComposeViewModel$loadSession$1.f31712a;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewComposeViewModel$loadSession$1.f31714c;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM9650i);
            c2756b.m9601a(c2751b.f32394b.mo4589b2(), c2763c.f32739m);
            c2763c.f32739m = null;
            C2761a c2761a = c2751b.f32397e;
            ((xc9) c2761a.f32716m).setValue(null);
            ((xc9) c2761a.f32717n).setValue(null);
            ((xc9) c2761a.f32718o).setValue(ReviewActivityResult.None);
            ((xc9) c2761a.f32719p).setValue("");
            t66 t66Var = c2761a.f32720q;
            Boolean bool = Boolean.FALSE;
            ((xc9) t66Var).setValue(bool);
            ((xc9) c2761a.f32721r).setValue(bool);
            c2763c.m9639e();
            c2751b.f32399g.f32726c = EmptyList.f47638a;
            hg8 hg8Var = (hg8) c3244l.getValue();
            hg8Var.getClass();
            c3244l.m15572j(null, hg8.m13232a(hg8Var, new be8(0, 0), new cd8((bd8) null, (bd8) null, (ie8) null, 15), vc8.f65195a, false, null, null, null, null, 65));
            C2764d c2764d = c2751b.f32396d;
            reviewComposeViewModel$loadSession$1.f31714c = 1;
            objM9650i = c2764d.m9650i(ec8Var, set, reviewComposeViewModel$loadSession$1);
            if (objM9650i != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM9650i);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM9650i);
        gd8 gd8Var = (gd8) objM9650i;
        if (gd8Var != null) {
            hg8 hg8Var2 = (hg8) c3244l.getValue();
            hg8Var2.getClass();
            c3244l.m15572j(null, hg8.m13232a(hg8Var2, null, null, null, false, gd8Var, null, null, null, 479));
            return xfaVar;
        }
        String strM12971c = gxc.m12971c(ec8Var.f37003a);
        String str = c2751b.f32404l;
        c2756b.getClass();
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("Review type", strM12971c);
        bundle.putString("Review location", str);
        ((C1240a) c2756b.f32468a).m7025f("Review session started", bundle);
        reviewComposeViewModel$loadSession$1.f31714c = 2;
        return c2751b.m9568Z2(reviewComposeViewModel$loadSession$1) == obj ? obj : xfaVar;
    }

    /* JADX INFO: renamed from: W2 */
    public static final Object m9565W2(C2751b c2751b, String str, SuspendLambda suspendLambda) {
        Object objM9628l;
        C2764d c2764d = c2751b.f32396d;
        c2764d.getClass();
        str.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(c2764d.f32742a.mo4589b2());
        localeForLanguageTag.getClass();
        String strM23610P = vz1.m23610P(str, localeForLanguageTag);
        LinkedHashMap linkedHashMap = c2764d.f32759r;
        Integer num = (Integer) linkedHashMap.get(strM23610P);
        int iIntValue = (num != null ? num.intValue() : 0) + 1;
        linkedHashMap.put(strM23610P, Integer.valueOf(iIntValue));
        return (iIntValue == 2 && (objM9628l = c2751b.f32397e.m9628l(str, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM9628l : xfa.f68157a;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32394b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32394b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32394b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32394b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32394b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32394b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32394b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32394b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32394b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32394b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32394b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32394b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32394b.mo4583O1();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: P */
    public final void mo8482P() {
        this.f32401i.mo8482P();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32394b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32394b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32394b.mo4586T0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: U0 */
    public final void mo8483U0(int i, double d, Double d2, float f, String str) {
        str.getClass();
        this.f32401i.mo8483U0(i, d, d2, f, str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32394b.mo4587X();
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02e8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X2 */
    public final void m9566X2(cb8 cb8Var) {
        ReviewResultType reviewResultType;
        String str;
        rg8 rg8Var;
        String str2;
        cb8Var.getClass();
        boolean zEquals = cb8Var.equals(z98.f71243a);
        td8 td8Var = td8.f62167a;
        if (zEquals || cb8Var.equals(pa8.f55894a) || cb8Var.equals(ea8.f36948a)) {
            m9567Y2(td8Var);
            return;
        }
        boolean zEquals2 = cb8Var.equals(qa8.f57502a);
        ud8 ud8Var = ud8.f63791a;
        if (zEquals2) {
            m9567Y2(ud8Var);
            return;
        }
        boolean zEquals3 = cb8Var.equals(ka8.f46947a);
        C3244l c3244l = this.f32405m;
        if (zEquals3) {
            hg8 hg8Var = (hg8) c3244l.getValue();
            hg8Var.getClass();
            hg8 hg8VarM13232a = hg8.m13232a(hg8Var, null, null, null, false, null, null, null, null, 447);
            c3244l.getClass();
            c3244l.m15572j(null, hg8VarM13232a);
            return;
        }
        if (cb8Var.equals(ca8.f9801a)) {
            hg8 hg8Var2 = (hg8) c3244l.getValue();
            hg8Var2.getClass();
            hg8 hg8VarM13232a2 = hg8.m13232a(hg8Var2, null, null, null, false, null, null, null, null, 479);
            c3244l.getClass();
            c3244l.m15572j(null, hg8VarM13232a2);
            return;
        }
        if (cb8Var.equals(da8.f35303a)) {
            gd8 gd8Var = ((hg8) c3244l.getValue()).f42331f;
            if (fa4.m11650l(gd8Var, ed8.f37069a)) {
                hg8 hg8Var3 = (hg8) c3244l.getValue();
                hg8Var3.getClass();
                c3244l.m15572j(null, hg8.m13232a(hg8Var3, null, null, null, false, null, null, null, null, 479));
                m9567Y2(ud8Var);
                return;
            }
            if (!fa4.m11650l(gd8Var, fd8.f38913a)) {
                if (gd8Var == null) {
                    return;
                }
                gm5.m12750e();
                return;
            } else {
                hg8 hg8Var4 = (hg8) c3244l.getValue();
                hg8Var4.getClass();
                c3244l.m15572j(null, hg8.m13232a(hg8Var4, null, null, null, false, null, null, null, null, 479));
                m9567Y2(td8Var);
                return;
            }
        }
        boolean zEquals4 = cb8Var.equals(ga8.f40464a);
        C2761a c2761a = this.f32397e;
        C2764d c2764d = this.f32396d;
        if (zEquals4) {
            ((xc9) c2761a.f32720q).setValue(Boolean.TRUE);
            ((xc9) c2761a.f32718o).setValue(ReviewActivityResult.None);
            nb8 nb8VarM9645c = c2764d.m9645c();
            eg8 eg8Var = nb8VarM9645c instanceof eg8 ? (eg8) nb8VarM9645c : null;
            if (eg8Var != null) {
                c2761a.m9625i(eg8Var);
            }
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleFlipCard$2(this, null), 3);
            return;
        }
        if (cb8Var.equals(ba8.f8229a)) {
            nb8 nb8VarM9645c2 = c2764d.m9645c();
            eg8 eg8Var2 = nb8VarM9645c2 instanceof eg8 ? (eg8) nb8VarM9645c2 : null;
            if (eg8Var2 != null) {
                c2764d.f32758q++;
            }
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleCorrect$1(eg8Var2, this, null), 3);
            return;
        }
        if (cb8Var.equals(ha8.f42095a)) {
            nb8 nb8VarM9645c3 = c2764d.m9645c();
            eg8 eg8Var3 = nb8VarM9645c3 instanceof eg8 ? (eg8) nb8VarM9645c3 : null;
            if (eg8Var3 != null) {
                c2764d.m9652k(eg8Var3.mo10270a().f64672b);
            }
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleIncorrect$2(this, null), 3);
            return;
        }
        if (cb8Var.equals(aa8.f426a)) {
            if (((hg8) c3244l.getValue()).f42334i != null) {
                hg8 hg8Var5 = (hg8) c3244l.getValue();
                hg8Var5.getClass();
                c3244l.m15572j(null, hg8.m13232a(hg8Var5, null, null, null, false, null, null, null, null, 255));
                Iterator it = c2764d.f32754m.iterator();
                while (it.hasNext()) {
                    c2764d.m9652k(((v0b) it.next()).f64672b);
                }
            }
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleContinue$2(this, null), 3);
            return;
        }
        String str3 = "";
        if (cb8Var.equals(fa8.f38724a)) {
            nb8 nb8VarM9645c4 = c2764d.m9645c();
            if (nb8VarM9645c4 instanceof eg8) {
                c2761a.getClass();
                ((xc9) c2761a.f32718o).setValue(ReviewActivityResult.Incorrect);
                ((xc9) c2761a.f32719p).setValue("");
                ((xc9) c2761a.f32720q).setValue(Boolean.TRUE);
                eg8 eg8Var4 = (eg8) nb8VarM9645c4;
                c2764d.m9652k(eg8Var4.mo10270a().f64672b);
                c2761a.m9625i(eg8Var4);
                wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleDoNotKnow$1(this, null), 3);
                return;
            }
            if (!(nb8VarM9645c4 instanceof ib8) && !(nb8VarM9645c4 instanceof lb8) && !(nb8VarM9645c4 instanceof mb8)) {
                if (nb8VarM9645c4 == null) {
                    return;
                }
                gm5.m12750e();
                return;
            } else {
                Iterator it2 = c2764d.f32754m.iterator();
                while (it2.hasNext()) {
                    c2764d.m9652k(((v0b) it2.next()).f64672b);
                }
                wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleDoNotKnow$2(this, null), 3);
                return;
            }
        }
        if (cb8Var instanceof y98) {
            y98 y98Var = (y98) cb8Var;
            nb8 nb8VarM9645c5 = c2764d.m9645c();
            eg8 eg8Var5 = nb8VarM9645c5 instanceof eg8 ? (eg8) nb8VarM9645c5 : null;
            if (eg8Var5 == null) {
                return;
            }
            rc8 rc8Var = y98Var.f69513a;
            c2761a.getClass();
            t66 t66Var = c2761a.f32718o;
            rc8Var.getClass();
            ((xc9) t66Var).setValue(rc8Var.f59073b ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect);
            ((xc9) c2761a.f32719p).setValue(rc8Var.f59072a);
            ((xc9) c2761a.f32720q).setValue(Boolean.TRUE);
            ReviewActivityResult reviewActivityResult = (ReviewActivityResult) ((xc9) t66Var).getValue();
            if (reviewActivityResult == ReviewActivityResult.Correct) {
                c2764d.f32758q++;
            } else {
                c2764d.m9652k(eg8Var5.mo10270a().f64672b);
            }
            c2761a.m9625i(eg8Var5);
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleChoiceSelected$1(reviewActivityResult, this, eg8Var5, null), 3);
            return;
        }
        if (cb8Var.equals(x98.f67979a)) {
            if (!(c2764d.m9645c() instanceof db8)) {
                LessonCard lessonCardM9624h = c2761a.m9624h();
                if (lessonCardM9624h != null) {
                    sca.m21224J0(this, lessonCardM9624h.f19178a, false, 12);
                    return;
                }
                return;
            }
            sc8 sc8Var = (sc8) ((xc9) c2761a.f32717n).getValue();
            if (sc8Var != null) {
                str2 = sc8Var.f60683a;
                if (vk9.m23391n0(str2)) {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            if (str2 == null) {
                LessonCard lessonCardM9624h2 = c2761a.m9624h();
                String str4 = lessonCardM9624h2 != null ? lessonCardM9624h2.f19178a : null;
                if (str4 != null) {
                    str3 = str4;
                }
            } else {
                str3 = str2;
            }
            sca.m21224J0(this, str3, true, 4);
            return;
        }
        if (cb8Var.equals(v98.f65081a)) {
            LessonCard lessonCardM9624h3 = c2761a.m9624h();
            if (lessonCardM9624h3 != null) {
                m9569a3(lessonCardM9624h3.f19178a);
                return;
            }
            return;
        }
        if (cb8Var instanceof w98) {
            int i = ((w98) cb8Var).f66547a;
            LessonCard lessonCardM9624h4 = c2761a.m9624h();
            if (lessonCardM9624h4 == null) {
                return;
            }
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleCardStatusChanged$1(this, lessonCardM9624h4, i, null), 3);
            return;
        }
        if (cb8Var instanceof xa8) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$openTagUrl$1(this, ((xa8) cb8Var).f68000a, null), 3);
            return;
        }
        if (cb8Var instanceof la8) {
            m9569a3(((la8) cb8Var).f49370a);
            return;
        }
        if (cb8Var instanceof na8) {
            sca.m21224J0(this, ((na8) cb8Var).f52540a, false, 12);
            return;
        }
        if (cb8Var instanceof ma8) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleSessionItemStatusChanged$1(this, (ma8) cb8Var, null), 3);
            return;
        }
        if (cb8Var.equals(oa8.f54103a)) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleAction$3(this, null), 3);
            return;
        }
        boolean z = cb8Var instanceof ya8;
        C2763c c2763c = this.f32398f;
        if (z) {
            String str5 = ((ya8) cb8Var).f69553a;
            ad8 ad8Var = ((hg8) c3244l.getValue()).f42329d;
            zc8 zc8Var = ad8Var instanceof zc8 ? (zc8) ad8Var : null;
            if (zc8Var == null) {
                return;
            }
            c3244l.m15571i(new fi3(zc8Var, str5, !vk9.m23391n0(str5)).invoke(c3244l.getValue()));
            c2763c.getClass();
            c2763c.f32740n = str5;
            vk9.m23391n0(str5);
            AbstractC3184kh.m15194A(c2763c.f32727a.mo4589b2());
            return;
        }
        if (cb8Var.equals(wa8.f66566a)) {
            LessonTranslationSentence lessonTranslationSentence = c2763c.f32734h;
            String str6 = lessonTranslationSentence != null ? lessonTranslationSentence.f19296e : null;
            if (str6 == null) {
                str6 = "";
            }
            if (!vk9.m23391n0(str6) && fa4.m11650l(c2763c.f32740n, vk9.m23376L0(str6).toString())) {
                m9576h3();
                return;
            }
            LessonTranslationSentence lessonTranslationSentence2 = c2763c.f32734h;
            String str7 = lessonTranslationSentence2 != null ? lessonTranslationSentence2.f19296e : null;
            str3 = str7 != null ? str7 : "";
            if (vk9.m23391n0(str3) || fa4.m11650l(c2763c.f32740n, vk9.m23376L0(str3).toString())) {
                rg8Var = null;
            } else {
                Locale localeForLanguageTag = Locale.forLanguageTag(c2763c.f32727a.mo4580K1());
                localeForLanguageTag.getClass();
                int iM16728e = new C3329mb(str3, c2763c.f32740n, localeForLanguageTag).m16728e();
                if (70 > iM16728e || iM16728e >= 99) {
                    reviewResultType = iM16728e == 100 ? ReviewResultType.CORRECT : ReviewResultType.INCORRECT;
                } else {
                    reviewResultType = ReviewResultType.ALMOST;
                }
                int i2 = he8.f42263a[reviewResultType.ordinal()];
                if (i2 == 1) {
                    List list = xb8.f68031a;
                    Random$Default random$Default = jq7.f46010a;
                    str = (String) u91.m22605W0(list);
                } else if (i2 == 2) {
                    List list2 = xb8.f68033c;
                    Random$Default random$Default2 = jq7.f46010a;
                    str = (String) u91.m22605W0(list2);
                } else if (i2 != 3) {
                    gm5.m12750e();
                    return;
                } else {
                    List list3 = xb8.f68032b;
                    Random$Default random$Default3 = jq7.f46010a;
                    str = (String) u91.m22605W0(list3);
                }
                rg8Var = new rg8(reviewResultType, str, str3, c2763c.f32740n);
            }
            if (rg8Var != null) {
                hg8 hg8Var6 = (hg8) c3244l.getValue();
                hg8Var6.getClass();
                c3244l.m15572j(null, hg8.m13232a(hg8Var6, null, null, null, false, null, null, null, rg8Var, 255));
                return;
            }
            return;
        }
        if (cb8Var.equals(za8.f71290a)) {
            m9576h3();
            return;
        }
        if (cb8Var.equals(ab8.f465a)) {
            hg8 hg8Var7 = (hg8) c3244l.getValue();
            hg8Var7.getClass();
            c3244l.m15572j(null, hg8.m13232a(hg8Var7, null, null, null, false, null, null, null, null, 255));
            c2763c.m9639e();
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$handleUnscrambleTryAgain$2(this, null), 3);
            return;
        }
        if (cb8Var instanceof bb8) {
            sca.m21224J0(this, ((bb8) cb8Var).f8281a, false, 12);
            return;
        }
        if (cb8Var.equals(ia8.f43862a)) {
            m9576h3();
            return;
        }
        if (cb8Var instanceof ja8) {
            sca.m21224J0(this, ((ja8) cb8Var).f45352a, false, 12);
            return;
        }
        if (cb8Var.equals(ta8.f62055a)) {
            xe9 xe9Var = c2763c.f32738l;
            SpeechRecognitionState speechRecognitionState = xe9Var.f68138e;
            SpeechRecognitionState speechRecognitionState2 = SpeechRecognitionState.LISTENING;
            if (speechRecognitionState == speechRecognitionState2) {
                speechRecognitionState2 = SpeechRecognitionState.STOPPED;
            }
            c2763c.f32738l = xe9.m24478a(xe9Var, false, 0, null, null, speechRecognitionState2, null, null, 111);
            m9577i3();
            return;
        }
        if (cb8Var.equals(va8.f65144a)) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$speakSentence$1(this, null), 3);
            return;
        }
        if (!(cb8Var instanceof sa8)) {
            if (cb8Var.equals(ra8.f58974a)) {
                c2763c.f32738l = xe9.m24478a(c2763c.f32738l, false, 0, null, null, SpeechRecognitionState.ERROR, null, null, 111);
                m9577i3();
                return;
            } else {
                if (!(cb8Var instanceof ua8)) {
                    gm5.m12750e();
                    return;
                }
                xz7 xz7Var = ((ua8) cb8Var).f63644a;
                String str8 = xz7Var.f69008e;
                Locale localeForLanguageTag2 = Locale.forLanguageTag(this.f32394b.mo4589b2());
                localeForLanguageTag2.getClass();
                m9567Y2(new vd8(new TokenPopupData(str8, vz1.m23610P(str8, localeForLanguageTag2), xz7Var.f69014k == TextTokenType.WORD ? TokenType.WordType : TokenType.CardType, 0, 0, null, null, TokenControllerType.ReviewSentence, null, 0, null, false, xz7Var.f69010g, xz7Var.f69011h, xz7Var.f69017n, 0, 0, 0, 0, false, null, null, false, 8359800, null)));
                return;
            }
        }
        sa8 sa8Var = (sa8) cb8Var;
        String str9 = sa8Var.f60596a;
        boolean z2 = sa8Var.f60597b;
        c2763c.getClass();
        Locale localeForLanguageTag3 = Locale.forLanguageTag(c2763c.f32727a.mo4589b2());
        localeForLanguageTag3.getClass();
        C3329mb c3329mb = new C3329mb(c2763c.f32736j, str9, localeForLanguageTag3);
        c2763c.f32738l = xe9.m24478a(c2763c.f32738l, false, c3329mb.m16728e(), null, str9, z2 ? SpeechRecognitionState.STOPPED : SpeechRecognitionState.LISTENING, c3329mb, null, 69);
        boolean z3 = z2 && c3329mb.m16728e() > 70;
        m9577i3();
        if (z3) {
            m9576h3();
        }
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: Y0 */
    public final void mo8484Y0(String str, boolean z, float f, boolean z2) {
        str.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$speak$1(this, str, z, f, z2, null), 3);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9567Y2(xd8 xd8Var) {
        C3244l c3244l = this.f32405m;
        hg8 hg8Var = (hg8) c3244l.getValue();
        hg8Var.getClass();
        hg8 hg8VarM13232a = hg8.m13232a(hg8Var, null, null, null, false, null, xd8Var, null, null, 447);
        c3244l.getClass();
        c3244l.m15572j(null, hg8VarM13232a);
    }

    /* JADX INFO: renamed from: Z2 */
    public final Object m9568Z2(ContinuationImpl continuationImpl) throws Throwable {
        String strMo4589b2 = this.f32394b.mo4589b2();
        C2763c c2763c = this.f32398f;
        Long l = c2763c.f32739m;
        C2756b c2756b = this.f32400h;
        c2756b.m9601a(strMo4589b2, l);
        c2763c.f32739m = null;
        C2764d c2764d = this.f32396d;
        int i = c2764d.f32757p + 1;
        c2764d.f32757p = i;
        nb8 nb8Var = (nb8) u91.m22592J0(i, c2764d.f32756o);
        xfa xfaVar = xfa.f68157a;
        if (nb8Var == null) {
            ec8 ec8Var = this.f32403k;
            String strM12971c = gxc.m12971c(ec8Var.f37003a);
            c2756b.getClass();
            String str = this.f32404l;
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("Review type", strM12971c);
            bundle.putString("Review location", str);
            ((C1240a) c2756b.f32468a).m7025f("Review session completed", bundle);
            if (gxc.m12970b(ec8Var.f37003a)) {
                m9567Y2(td8.f62167a);
                return xfaVar;
            }
            Object objM9573e3 = m9573e3(continuationImpl);
            if (objM9573e3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM9573e3;
            }
        } else {
            C2761a c2761a = this.f32397e;
            ((xc9) c2761a.f32716m).setValue(null);
            ((xc9) c2761a.f32717n).setValue(null);
            ((xc9) c2761a.f32718o).setValue(ReviewActivityResult.None);
            ((xc9) c2761a.f32719p).setValue("");
            t66 t66Var = c2761a.f32720q;
            Boolean bool = Boolean.FALSE;
            ((xc9) t66Var).setValue(bool);
            ((xc9) c2761a.f32721r).setValue(bool);
            c2763c.m9639e();
            this.f32399g.f32726c = EmptyList.f47638a;
            Object objM9571c3 = m9571c3(continuationImpl);
            if (objM9571c3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM9571c3;
            }
        }
        return xfaVar;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32394b.mo4588a0();
    }

    /* JADX INFO: renamed from: a3 */
    public final void m9569a3(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(this.f32394b.mo4589b2());
        localeForLanguageTag.getClass();
        m9567Y2(new vd8(new TokenPopupData(str, vz1.m23610P(str, localeForLanguageTag), TokenType.CardType, 0, 0, null, null, TokenControllerType.Review, null, 0, null, false, 0, 0, null, 0, 0, 0, 0, false, null, null, false, 8388472, null)));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32394b.mo4589b2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r2 == r4) goto L31;
     */
    /* JADX INFO: renamed from: b3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9570b3(nb8 nb8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewComposeViewModel$renderCardActivity$1 reviewComposeViewModel$renderCardActivity$1;
        nb8 nb8Var2 = nb8Var;
        if (continuationImpl instanceof ReviewComposeViewModel$renderCardActivity$1) {
            reviewComposeViewModel$renderCardActivity$1 = (ReviewComposeViewModel$renderCardActivity$1) continuationImpl;
            int i = reviewComposeViewModel$renderCardActivity$1.f31721d;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewComposeViewModel$renderCardActivity$1.f31721d = i - Integer.MIN_VALUE;
            } else {
                reviewComposeViewModel$renderCardActivity$1 = new ReviewComposeViewModel$renderCardActivity$1(this, continuationImpl);
            }
        } else {
            reviewComposeViewModel$renderCardActivity$1 = new ReviewComposeViewModel$renderCardActivity$1(this, continuationImpl);
        }
        Object objM9631o = reviewComposeViewModel$renderCardActivity$1.f31719b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewComposeViewModel$renderCardActivity$1.f31721d;
        xfa xfaVar = xfa.f68157a;
        C2764d c2764d = this.f32396d;
        C2761a c2761a = this.f32397e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM9631o);
            boolean z = c2764d.f32761t;
            reviewComposeViewModel$renderCardActivity$1.f31718a = nb8Var2;
            reviewComposeViewModel$renderCardActivity$1.f31721d = 1;
            objM9631o = c2761a.m9631o(nb8Var2, z, reviewComposeViewModel$renderCardActivity$1);
            if (objM9631o != obj) {
            }
        }
        if (i2 == 1) {
            nb8Var2 = reviewComposeViewModel$renderCardActivity$1.f31718a;
            AbstractC3193b.m15359b(objM9631o);
        } else {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM9631o);
                return xfaVar;
            }
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM9631o);
        }
        String str = (String) objM9631o;
        if (str != null) {
            sca.m21224J0(this, str, false, 12);
        }
        kc8 kc8Var = (kc8) objM9631o;
        if (kc8Var == null) {
            ArrayList arrayListM22624p1 = u91.m22624p1(c2764d.f32756o);
            arrayListM22624p1.remove(c2764d.f32757p);
            c2764d.f32756o = arrayListM22624p1;
            c2764d.f32757p--;
            reviewComposeViewModel$renderCardActivity$1.f31718a = null;
            reviewComposeViewModel$renderCardActivity$1.f31721d = 2;
            return m9568Z2(reviewComposeViewModel$renderCardActivity$1) == obj ? obj : xfaVar;
        }
        C3244l c3244l = this.f32405m;
        hg8 hg8Var = (hg8) c3244l.getValue();
        hg8Var.getClass();
        hg8 hg8VarM13232a = hg8.m13232a(hg8Var, null, kc8Var.f47032b, kc8Var.f47031a, false, null, null, null, null, 99);
        c3244l.getClass();
        c3244l.m15572j(null, hg8VarM13232a);
        LessonCard lessonCardM9624h = c2761a.m9624h();
        if (lessonCardM9624h != null) {
            reviewComposeViewModel$renderCardActivity$1.f31718a = null;
            reviewComposeViewModel$renderCardActivity$1.f31721d = 3;
            objM9631o = c2761a.m9630n(nb8Var2, lessonCardM9624h, reviewComposeViewModel$renderCardActivity$1);
        }
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: c2 */
    public final void mo8485c2() {
        this.f32401i.mo8485c2();
    }

    /* JADX INFO: renamed from: c3 */
    public final Object m9571c3(ContinuationImpl continuationImpl) throws Throwable {
        nb8 nb8VarM9645c = this.f32396d.m9645c();
        if (nb8VarM9645c == null) {
            Object objM9573e3 = m9573e3(continuationImpl);
            if (objM9573e3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM9573e3;
            }
        } else {
            sx7 sx7Var = new sx7(9, this, nb8VarM9645c);
            C3244l c3244l = this.f32405m;
            c3244l.m15571i(sx7Var.invoke(c3244l.getValue()));
            if ((nb8VarM9645c instanceof gb8) || (nb8VarM9645c instanceof hb8) || (nb8VarM9645c instanceof jb8) || (nb8VarM9645c instanceof kb8) || (nb8VarM9645c instanceof eb8) || (nb8VarM9645c instanceof fb8) || (nb8VarM9645c instanceof db8)) {
                Object objM9570b3 = m9570b3(nb8VarM9645c, continuationImpl);
                if (objM9570b3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM9570b3;
                }
            } else if (nb8VarM9645c instanceof ib8) {
                Object objM9572d3 = m9572d3((ib8) nb8VarM9645c, continuationImpl);
                if (objM9572d3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM9572d3;
                }
            } else if (nb8VarM9645c instanceof lb8) {
                Object objM9574f3 = m9574f3((lb8) nb8VarM9645c, continuationImpl);
                if (objM9574f3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM9574f3;
                }
            } else {
                if (!(nb8VarM9645c instanceof mb8)) {
                    gm5.m12750e();
                    return null;
                }
                Object objM9575g3 = m9575g3((mb8) nb8VarM9645c, continuationImpl);
                if (objM9575g3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM9575g3;
                }
            }
        }
        return xfa.f68157a;
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: d */
    public final c83 mo8486d() {
        return this.f32401i.mo8486d();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32394b.mo4590d0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d3 */
    public final Object m9572d3(ib8 ib8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewComposeViewModel$renderMatchingActivity$1 reviewComposeViewModel$renderMatchingActivity$1;
        if (continuationImpl instanceof ReviewComposeViewModel$renderMatchingActivity$1) {
            reviewComposeViewModel$renderMatchingActivity$1 = (ReviewComposeViewModel$renderMatchingActivity$1) continuationImpl;
            int i = reviewComposeViewModel$renderMatchingActivity$1.f31724c;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewComposeViewModel$renderMatchingActivity$1.f31724c = i - Integer.MIN_VALUE;
            } else {
                reviewComposeViewModel$renderMatchingActivity$1 = new ReviewComposeViewModel$renderMatchingActivity$1(this, continuationImpl);
            }
        } else {
            reviewComposeViewModel$renderMatchingActivity$1 = new ReviewComposeViewModel$renderMatchingActivity$1(this, continuationImpl);
        }
        Object objM9634a = reviewComposeViewModel$renderMatchingActivity$1.f31722a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewComposeViewModel$renderMatchingActivity$1.f31724c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM9634a);
            reviewComposeViewModel$renderMatchingActivity$1.f31724c = 1;
            objM9634a = this.f32399g.m9634a(ib8Var, reviewComposeViewModel$renderMatchingActivity$1);
            if (objM9634a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM9634a);
        }
        ld8 ld8Var = (ld8) objM9634a;
        C3244l c3244l = this.f32405m;
        hg8 hg8Var = (hg8) c3244l.getValue();
        hg8Var.getClass();
        hg8 hg8VarM13232a = hg8.m13232a(hg8Var, null, ld8Var.f49507b, ld8Var.f49506a, false, null, null, null, null, 99);
        c3244l.getClass();
        c3244l.m15572j(null, hg8VarM13232a);
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e3 */
    public final Object m9573e3(ContinuationImpl continuationImpl) throws Throwable {
        ReviewComposeViewModel$renderSessionComplete$1 reviewComposeViewModel$renderSessionComplete$1;
        if (continuationImpl instanceof ReviewComposeViewModel$renderSessionComplete$1) {
            reviewComposeViewModel$renderSessionComplete$1 = (ReviewComposeViewModel$renderSessionComplete$1) continuationImpl;
            int i = reviewComposeViewModel$renderSessionComplete$1.f31727c;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewComposeViewModel$renderSessionComplete$1.f31727c = i - Integer.MIN_VALUE;
            } else {
                reviewComposeViewModel$renderSessionComplete$1 = new ReviewComposeViewModel$renderSessionComplete$1(this, continuationImpl);
            }
        } else {
            reviewComposeViewModel$renderSessionComplete$1 = new ReviewComposeViewModel$renderSessionComplete$1(this, continuationImpl);
        }
        Object objM15541t = reviewComposeViewModel$renderSessionComplete$1.f31725a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewComposeViewModel$renderSessionComplete$1.f31727c;
        int i3 = 10;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            reviewComposeViewModel$renderSessionComplete$1.f31727c = 1;
            C2764d c2764d = this.f32396d;
            List list = c2764d.f32754m;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((v0b) it.next()).f64672b);
            }
            xa2 xa2Var = c2764d.f32751j;
            String strMo4589b2 = c2764d.f32742a.mo4589b2();
            strMo4589b2.getClass();
            objM15541t = AbstractC3224d.m15541t(((C1287c) xa2Var.f67988a).m7123m(strMo4589b2, arrayList), reviewComposeViewModel$renderSessionComplete$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        sx7 sx7Var = new sx7(i3, this, (List) objM15541t);
        C3244l c3244l = this.f32405m;
        c3244l.m15571i(sx7Var.invoke(c3244l.getValue()));
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (r1 == r3) goto L21;
     */
    /* JADX INFO: renamed from: f3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9574f3(lb8 lb8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewComposeViewModel$renderSpeakingActivity$1 reviewComposeViewModel$renderSpeakingActivity$1;
        if (continuationImpl instanceof ReviewComposeViewModel$renderSpeakingActivity$1) {
            reviewComposeViewModel$renderSpeakingActivity$1 = (ReviewComposeViewModel$renderSpeakingActivity$1) continuationImpl;
            int i = reviewComposeViewModel$renderSpeakingActivity$1.f31730c;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewComposeViewModel$renderSpeakingActivity$1.f31730c = i - Integer.MIN_VALUE;
            } else {
                reviewComposeViewModel$renderSpeakingActivity$1 = new ReviewComposeViewModel$renderSpeakingActivity$1(this, continuationImpl);
            }
        } else {
            reviewComposeViewModel$renderSpeakingActivity$1 = new ReviewComposeViewModel$renderSpeakingActivity$1(this, continuationImpl);
        }
        Object objM9637c = reviewComposeViewModel$renderSpeakingActivity$1.f31728a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewComposeViewModel$renderSpeakingActivity$1.f31730c;
        C2764d c2764d = this.f32396d;
        C2763c c2763c = this.f32398f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM9637c);
            int i3 = this.f32403k.f37005c;
            boolean z = c2764d.f32761t;
            reviewComposeViewModel$renderSpeakingActivity$1.f31730c = 1;
            objM9637c = c2763c.m9637c(lb8Var, i3, z, reviewComposeViewModel$renderSpeakingActivity$1);
            if (objM9637c != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM9637c);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM9637c);
        }
        if (((Boolean) objM9637c).booleanValue()) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$speakSentence$1(this, null), 3);
        }
        return xfa.f68157a;
        ge8 ge8Var = (ge8) objM9637c;
        C3244l c3244l = this.f32405m;
        hg8 hg8Var = (hg8) c3244l.getValue();
        hg8Var.getClass();
        hg8 hg8VarM13232a = hg8.m13232a(hg8Var, null, ge8Var.f40636b, ge8Var.f40635a, false, null, null, null, null, 99);
        c3244l.getClass();
        c3244l.m15572j(null, hg8VarM13232a);
        boolean z2 = c2764d.f32761t;
        reviewComposeViewModel$renderSpeakingActivity$1.f31730c = 2;
        objM9637c = c2763c.m9640f(z2, reviewComposeViewModel$renderSpeakingActivity$1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: g3 */
    public final Object m9575g3(mb8 mb8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewComposeViewModel$renderUnscrambleActivity$1 reviewComposeViewModel$renderUnscrambleActivity$1;
        if (continuationImpl instanceof ReviewComposeViewModel$renderUnscrambleActivity$1) {
            reviewComposeViewModel$renderUnscrambleActivity$1 = (ReviewComposeViewModel$renderUnscrambleActivity$1) continuationImpl;
            int i = reviewComposeViewModel$renderUnscrambleActivity$1.f31733c;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewComposeViewModel$renderUnscrambleActivity$1.f31733c = i - Integer.MIN_VALUE;
            } else {
                reviewComposeViewModel$renderUnscrambleActivity$1 = new ReviewComposeViewModel$renderUnscrambleActivity$1(this, continuationImpl);
            }
        } else {
            reviewComposeViewModel$renderUnscrambleActivity$1 = new ReviewComposeViewModel$renderUnscrambleActivity$1(this, continuationImpl);
        }
        Object objM9638d = reviewComposeViewModel$renderUnscrambleActivity$1.f31731a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewComposeViewModel$renderUnscrambleActivity$1.f31733c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM9638d);
            int i3 = this.f32403k.f37005c;
            reviewComposeViewModel$renderUnscrambleActivity$1.f31733c = 1;
            objM9638d = this.f32398f.m9638d(mb8Var, i3, reviewComposeViewModel$renderUnscrambleActivity$1);
            if (objM9638d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM9638d);
        }
        ge8 ge8Var = (ge8) objM9638d;
        C3244l c3244l = this.f32405m;
        hg8 hg8Var = (hg8) c3244l.getValue();
        hg8Var.getClass();
        hg8 hg8VarM13232a = hg8.m13232a(hg8Var, null, ge8Var.f40636b, ge8Var.f40635a, false, null, null, null, null, 99);
        c3244l.getClass();
        c3244l.m15572j(null, hg8VarM13232a);
        return xfa.f68157a;
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: h */
    public final Map mo9032h() {
        return this.f32395c.mo9032h();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32394b.mo4591h0(profileAccount, continuation);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m9576h3() {
        this.f32396d.f32758q++;
        C3244l c3244l = this.f32405m;
        hg8 hg8Var = (hg8) c3244l.getValue();
        hg8Var.getClass();
        List list = xb8.f68031a;
        Random$Default random$Default = jq7.f46010a;
        hg8 hg8VarM13232a = hg8.m13232a(hg8Var, null, null, null, false, null, null, new ce8((String) u91.m22605W0(list)), null, 383);
        c3244l.getClass();
        c3244l.m15572j(null, hg8VarM13232a);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewComposeViewModel$showSuccessOverlayAndAdvance$2(this, null), 3);
    }

    /* JADX INFO: renamed from: i3 */
    public final void m9577i3() {
        ge8 ge8VarM9635a = this.f32398f.m9635a();
        C3244l c3244l = this.f32405m;
        hg8 hg8Var = (hg8) c3244l.getValue();
        hg8Var.getClass();
        hg8 hg8VarM13232a = hg8.m13232a(hg8Var, null, ge8VarM9635a.f40636b, ge8VarM9635a.f40635a, false, null, null, null, null, 99);
        c3244l.getClass();
        c3244l.m15572j(null, hg8VarM13232a);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32394b.mo4592m0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: m1 */
    public final Object mo8492m1(ContinuationImpl continuationImpl) {
        return this.f32401i.mo8492m1(continuationImpl);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: n */
    public final void mo8493n(double d, Double d2, int i, float f, Long l) {
        this.f32401i.mo8493n(d, d2, i, 1.0f, l);
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: o1 */
    public final void mo9033o1(AppUsageType appUsageType, Integer num) {
        appUsageType.getClass();
        this.f32395c.mo9033o1(appUsageType, num);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32394b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32394b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32394b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32394b.mo4596t();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: u */
    public final eh9 mo8494u() {
        return this.f32401i.mo8494u();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: v0 */
    public final void mo9034v0(AppUsageType appUsageType) {
        appUsageType.getClass();
        this.f32395c.mo9034v0(appUsageType);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32394b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32394b.mo4598w2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: y1 */
    public final void mo8495y1(Set set) {
        this.f32401i.mo8495y1(set);
    }
}
