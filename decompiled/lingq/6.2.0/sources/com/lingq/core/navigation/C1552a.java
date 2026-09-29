package com.lingq.core.navigation;

import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.web2wave.C1545b;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.he6;
import p000.hf6;
import p000.nm7;
import p000.nn1;
import p000.r32;
import p000.si7;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.core.navigation.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1552a implements r32, cma {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cma f20257a;

    /* JADX INFO: renamed from: b */
    public final nm7 f20258b;

    /* JADX INFO: renamed from: c */
    public final si7 f20259c;

    /* JADX INFO: renamed from: d */
    public final C1545b f20260d;

    /* JADX INFO: renamed from: e */
    public final un1 f20261e;

    /* JADX INFO: renamed from: f */
    public final nn1 f20262f;

    /* JADX INFO: renamed from: g */
    public final C3244l f20263g;

    /* JADX INFO: renamed from: h */
    public final c18 f20264h;

    /* JADX INFO: renamed from: i */
    public final C3244l f20265i;

    /* JADX INFO: renamed from: j */
    public final c18 f20266j;

    /* JADX INFO: renamed from: k */
    public final C3244l f20267k;

    /* JADX INFO: renamed from: l */
    public final c18 f20268l;

    public C1552a(cma cmaVar, nm7 nm7Var, si7 si7Var, C1545b c1545b, un1 un1Var, nn1 nn1Var) {
        cmaVar.getClass();
        nm7Var.getClass();
        si7Var.getClass();
        un1Var.getClass();
        this.f20257a = cmaVar;
        this.f20258b = nm7Var;
        this.f20259c = si7Var;
        this.f20260d = c1545b;
        this.f20261e = un1Var;
        this.f20262f = nn1Var;
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new Pair(bool, ""));
        this.f20263g = c3244lM17114d;
        C3243k c3243k = xi9.f68262a;
        this.f20264h = AbstractC3224d.m15520B(c3244lM17114d, un1Var, c3243k, new Pair(bool, ""));
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f20265i = c3244lM17114d2;
        this.f20266j = AbstractC3224d.m15520B(c3244lM17114d2, un1Var, c3243k, null);
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(null);
        this.f20267k = c3244lM17114d3;
        this.f20268l = AbstractC3224d.m15520B(c3244lM17114d3, un1Var, c3243k, null);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f20257a.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f20257a.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f20257a.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f20257a.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f20257a.mo4575D0(continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: E2 */
    public final void mo8240E2() {
        this.f20267k.m15571i(null);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f20257a.mo4576F1(str, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: G0 */
    public final void mo8241G0() {
        this.f20265i.m15571i(null);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f20257a.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f20257a.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f20257a.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f20257a.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f20257a.mo4581L0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.r32
    /* JADX INFO: renamed from: M2 */
    public final Object mo8242M2(hf6 hf6Var, long j, Continuation continuation) throws Throwable {
        DeepLinkControllerImpl$navigate$2 deepLinkControllerImpl$navigate$2;
        if (continuation instanceof DeepLinkControllerImpl$navigate$2) {
            deepLinkControllerImpl$navigate$2 = (DeepLinkControllerImpl$navigate$2) continuation;
            int i = deepLinkControllerImpl$navigate$2.f20256d;
            if ((i & Integer.MIN_VALUE) != 0) {
                deepLinkControllerImpl$navigate$2.f20256d = i - Integer.MIN_VALUE;
            } else {
                deepLinkControllerImpl$navigate$2 = new DeepLinkControllerImpl$navigate$2(this, continuation);
            }
        } else {
            deepLinkControllerImpl$navigate$2 = new DeepLinkControllerImpl$navigate$2(this, continuation);
        }
        Object obj = deepLinkControllerImpl$navigate$2.f20254b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = deepLinkControllerImpl$navigate$2.f20256d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            deepLinkControllerImpl$navigate$2.f20253a = hf6Var;
            deepLinkControllerImpl$navigate$2.f20256d = 1;
            if (AbstractC3208a.m15437d(j, deepLinkControllerImpl$navigate$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hf6Var = deepLinkControllerImpl$navigate$2.f20253a;
            AbstractC3193b.m15359b(obj);
        }
        mo8243R1(hf6Var);
        return xfa.f68157a;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f20257a.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f20257a.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f20257a.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f20257a.mo4585R();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: R1 */
    public final void mo8243R1(hf6 hf6Var) {
        hf6Var.getClass();
        wfb.m23926u(this.f20261e, this.f20262f, null, new DeepLinkControllerImpl$navigate$1(this, hf6Var, null), 2);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: S1 */
    public final eh9 mo8244S1() {
        return this.f20266j;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f20257a.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f20257a.mo4587X();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: Z1 */
    public final void mo8245Z1(hf6 hf6Var) {
        C3244l c3244l = this.f20267k;
        c3244l.getClass();
        c3244l.m15572j(null, hf6Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m8246a(String str, hf6 hf6Var) {
        C3244l c3244l = this.f20265i;
        if (str == null || str.equals(this.f20257a.mo4589b2())) {
            c3244l.getClass();
            c3244l.m15572j(null, hf6Var);
        } else {
            he6 he6Var = new he6(str, hf6Var);
            c3244l.getClass();
            c3244l.m15572j(null, he6Var);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f20257a.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f20257a.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f20257a.mo4590d0();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: e0 */
    public final void mo8247e0(String str, long j) {
        str.getClass();
        wfb.m23926u(this.f20261e, null, null, new DeepLinkControllerImpl$deepLink$1(j, this, str, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f20257a.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: h1 */
    public final eh9 mo8248h1() {
        return this.f20264h;
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: k */
    public final eh9 mo8249k() {
        return this.f20268l;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f20257a.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f20257a.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f20257a.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f20257a.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f20257a.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f20257a.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f20257a.mo4598w2();
    }
}
