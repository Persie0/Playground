package com.lingq.feature.dictionary;

import com.lingq.core.data.repository.C1292h;
import com.lingq.core.database.dao.C1318f;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.g41;
import p000.h23;
import p000.hi8;
import p000.jd0;
import p000.lda;
import p000.lf2;
import p000.m83;
import p000.nl8;
import p000.ph2;
import p000.sca;
import p000.t62;
import p000.v72;
import p000.vk9;
import p000.wfb;
import p000.wta;
import p000.zf2;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C2069m extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f25847b;

    /* JADX INFO: renamed from: c */
    public final sca f25848c;

    /* JADX INFO: renamed from: d */
    public final h23 f25849d;

    /* JADX INFO: renamed from: e */
    public final C3244l f25850e;

    /* JADX INFO: renamed from: f */
    public final c18 f25851f;

    public C2069m(hi8 hi8Var, sca scaVar, h23 h23Var, h23 h23Var2, cma cmaVar, nl8 nl8Var) {
        scaVar.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f25847b = cmaVar;
        this.f25848c = scaVar;
        this.f25849d = h23Var2;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new lf2(null, "", false, "", null, EmptyList.f47638a, false, null));
        this.f25850e = c3244lM17114d;
        this.f25851f = AbstractC3224d.m15524c(c3244lM17114d);
        g41 g41VarM16103C = lda.m16103C(this);
        v72 v72Var = ph2.f56212a;
        wfb.m23926u(g41VarM16103C, t62.f61909c, null, new DictionaryContentViewModel$1(this, null), 2);
        String strMo4589b2 = cmaVar.mo4589b2();
        strMo4589b2.getClass();
        C1292h c1292h = (C1292h) h23Var.f41694a;
        c1292h.getClass();
        C1318f c1318f = c1292h.f16483b;
        c1318f.getClass();
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageActiveDictionaryJoin"}, new jd0(strMo4589b2, 6)))), new DictionaryContentViewModel$2(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(hi8Var.m13285v(cmaVar.mo4589b2()), new DictionaryContentViewModel$3(this, null), 2), lda.m16103C(this));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f25847b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f25847b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f25847b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f25847b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f25847b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f25847b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f25847b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f25847b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f25847b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f25847b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f25847b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f25847b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f25847b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f25847b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f25847b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f25847b.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m8980V2() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f25850e;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, lf2.m16158a((lf2) value, null, null, false, null, null, null, true, null, 191)));
    }

    /* JADX INFO: renamed from: W2 */
    public final void m8981W2() {
        Object value;
        String str;
        Object value2;
        TokenMeaning tokenMeaning;
        C3244l c3244l = this.f25850e;
        lf2 lf2Var = (lf2) c3244l.getValue();
        if (vk9.m23391n0(lf2Var.f49585d)) {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, lf2.m16158a((lf2) value, null, null, false, null, null, null, true, null, 191)));
            return;
        }
        zf2 zf2Var = lf2Var.f49582a;
        if (zf2Var == null || (str = zf2Var.f71487d) == null) {
            str = "";
        }
        TokenMeaning tokenMeaning2 = new TokenMeaning(0, str, lf2Var.f49585d, 0, false, this.f25847b.mo4580K1(), true, 0, 136);
        do {
            value2 = c3244l.getValue();
            tokenMeaning = tokenMeaning2;
            tokenMeaning2 = tokenMeaning;
        } while (!c3244l.m15570h(value2, lf2.m16158a((lf2) value2, null, null, false, null, null, null, true, tokenMeaning, 63)));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f25847b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m8982X2(String str) {
        str.getClass();
        while (true) {
            C3244l c3244l = this.f25850e;
            Object value = c3244l.getValue();
            String str2 = str;
            if (c3244l.m15570h(value, lf2.m16158a((lf2) value, null, null, false, str2, null, null, false, null, 247))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f25847b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f25847b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f25847b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f25847b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f25847b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f25847b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f25847b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f25847b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f25847b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f25847b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f25847b.mo4598w2();
    }
}
