package com.lingq.core.web;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c83;
import p000.cma;
import p000.du0;
import p000.eh9;
import p000.hf6;
import p000.hm5;
import p000.l3b;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.r32;
import p000.wfb;
import p000.wta;

/* JADX INFO: renamed from: com.lingq.core.web.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1943a extends wta implements cma, r32 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f24338b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r32 f24339c;

    /* JADX INFO: renamed from: d */
    public final hm5 f24340d;

    /* JADX INFO: renamed from: e */
    public final l3b f24341e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f24342f;

    /* JADX INFO: renamed from: g */
    public final C3211a f24343g;

    /* JADX INFO: renamed from: h */
    public final du0 f24344h;

    /* JADX INFO: renamed from: i */
    public final C3244l f24345i;

    public C1943a(hm5 hm5Var, nn1 nn1Var, r32 r32Var, cma cmaVar, nl8 nl8Var) {
        hm5Var.getClass();
        r32Var.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f24338b = cmaVar;
        this.f24339c = r32Var;
        this.f24340d = hm5Var;
        l3b.Companion.getClass();
        if (!nl8Var.m17487a("url")) {
            C3386nv.m17626m("Required argument \"url\" is missing and does not have an android:defaultValue");
            throw null;
        }
        String str = (String) nl8Var.m17488b("url");
        if (str == null) {
            C3386nv.m17626m("Argument \"url\" is marked as non-null but was passed a null value");
            throw null;
        }
        this.f24341e = new l3b(str, nl8Var.m17487a("grammarOpenedPath") ? (String) nl8Var.m17488b("grammarOpenedPath") : null, nl8Var.m17487a("title") ? (String) nl8Var.m17488b("title") : null);
        this.f24342f = new LinkedHashSet();
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f24343g = c3211aM7042a;
        this.f24344h = AbstractC3224d.m15519A(c3211aM7042a);
        this.f24345i = AbstractC3352my.m17114d(str);
        wfb.m23926u(lda.m16103C(this), null, null, new WebViewModel$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f24338b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f24338b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f24338b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f24338b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f24338b.mo4575D0(continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: E2 */
    public final void mo8240E2() {
        this.f24339c.mo8240E2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f24338b.mo4576F1(str, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: G0 */
    public final void mo8241G0() {
        this.f24339c.mo8241G0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f24338b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f24338b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f24338b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f24338b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f24338b.mo4581L0();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: M2 */
    public final Object mo8242M2(hf6 hf6Var, long j, Continuation continuation) {
        return this.f24339c.mo8242M2(hf6Var, 500L, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f24338b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f24338b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f24338b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f24338b.mo4585R();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: R1 */
    public final void mo8243R1(hf6 hf6Var) {
        hf6Var.getClass();
        this.f24339c.mo8243R1(hf6Var);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: S1 */
    public final eh9 mo8244S1() {
        return this.f24339c.mo8244S1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f24338b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f24338b.mo4587X();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: Z1 */
    public final void mo8245Z1(hf6 hf6Var) {
        this.f24339c.mo8245Z1(hf6Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f24338b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f24338b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f24338b.mo4590d0();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: e0 */
    public final void mo8247e0(String str, long j) {
        str.getClass();
        this.f24339c.mo8247e0(str, j);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f24338b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: h1 */
    public final eh9 mo8248h1() {
        return this.f24339c.mo8248h1();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: k */
    public final eh9 mo8249k() {
        return this.f24339c.mo8249k();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f24338b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f24338b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f24338b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f24338b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f24338b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f24338b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f24338b.mo4598w2();
    }
}
