package com.lingq.core.premium.delegate;

import com.android.billingclient.api.Purchase;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.offers.C1516b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c18;
import p000.c83;
import p000.eh9;
import p000.m83;
import p000.pha;
import p000.qn7;
import p000.rn7;
import p000.si7;
import p000.sn7;
import p000.un1;
import p000.up6;
import p000.v18;
import p000.vma;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.premium.delegate.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1844a implements qn7, pha {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pha f22457a;

    /* JADX INFO: renamed from: b */
    public final vma f22458b;

    /* JADX INFO: renamed from: c */
    public final C3244l f22459c;

    /* JADX INFO: renamed from: d */
    public final c18 f22460d;

    public C1844a(un1 un1Var, vma vmaVar, si7 si7Var, C1516b c1516b, pha phaVar) {
        un1Var.getClass();
        vmaVar.getClass();
        si7Var.getClass();
        phaVar.getClass();
        this.f22457a = phaVar;
        this.f22458b = vmaVar;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new rn7(false, false, new sn7(false, null, "en")));
        this.f22459c = c3244lM17114d;
        this.f22460d = AbstractC3224d.m15524c(c3244lM17114d);
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15531j(((C1371d) vmaVar).f18562B, phaVar.mo8562V0(), c1516b.m8193b(null), ((C1368a) si7Var).f18356L0, new PromoBannerDelegateImpl$1(5, null)), new PromoBannerDelegateImpl$2(this, null), 2), un1Var);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: D */
    public final void mo8549D(String str) {
        this.f22457a.mo8549D(str);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: F2 */
    public final boolean mo8550F2(String str) {
        return this.f22457a.mo8550F2(str);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H1 */
    public final String mo8551H1() {
        return this.f22457a.mo8551H1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H2 */
    public final void mo8552H2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22457a.mo8552H2(str, str2);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I */
    public final void mo8553I() {
        this.f22457a.mo8553I();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I1 */
    public final eh9 mo8554I1() {
        return this.f22457a.mo8554I1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K0 */
    public final String mo8555K0() {
        return this.f22457a.mo8555K0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K2 */
    public final c83 mo8556K2() {
        return this.f22457a.mo8556K2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: N1 */
    public final c83 mo8557N1() {
        return this.f22457a.mo8557N1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: O2 */
    public final void mo8558O2() {
        this.f22457a.mo8558O2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: P2 */
    public final eh9 mo8559P2() {
        return this.f22457a.mo8559P2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: R0 */
    public final void mo8560R0(String str) {
        this.f22457a.mo8560R0(str);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: S0 */
    public final String mo8561S0() {
        return this.f22457a.mo8561S0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: V0 */
    public final eh9 mo8562V0() {
        return this.f22457a.mo8562V0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: W1 */
    public final c83 mo8564W1() {
        return this.f22457a.mo8564W1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: Y */
    public final c83 mo8565Y() {
        return this.f22457a.mo8565Y();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: b1 */
    public final eh9 mo8566b1() {
        return this.f22457a.mo8566b1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: c0 */
    public final void mo8567c0(Purchase purchase) {
        this.f22457a.mo8567c0(purchase);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: f1 */
    public final String mo8568f1() {
        return this.f22457a.mo8568f1();
    }

    @Override // p000.qn7
    public final eh9 getState() {
        return this.f22460d;
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: i2 */
    public final void mo8569i2(int i) {
        this.f22457a.mo8569i2(i);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: k1 */
    public final void mo8570k1(List list) {
        list.getClass();
        this.f22457a.mo8570k1(list);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l */
    public final eh9 mo8571l() {
        return this.f22457a.mo8571l();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l1 */
    public final eh9 mo8572l1() {
        return this.f22457a.mo8572l1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o */
    public final void mo8573o(Purchase purchase, v18 v18Var) {
        this.f22457a.mo8573o(purchase, v18Var);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o0 */
    public final String mo8574o0() {
        return this.f22457a.mo8574o0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.qn7
    /* JADX INFO: renamed from: p2 */
    public final Object mo8578p2(Continuation continuation) throws Throwable {
        PromoBannerDelegateImpl$hidePromoBanner$1 promoBannerDelegateImpl$hidePromoBanner$1;
        String strM22854b;
        if (continuation instanceof PromoBannerDelegateImpl$hidePromoBanner$1) {
            promoBannerDelegateImpl$hidePromoBanner$1 = (PromoBannerDelegateImpl$hidePromoBanner$1) continuation;
            int i = promoBannerDelegateImpl$hidePromoBanner$1.f22431d;
            if ((i & Integer.MIN_VALUE) != 0) {
                promoBannerDelegateImpl$hidePromoBanner$1.f22431d = i - Integer.MIN_VALUE;
            } else {
                promoBannerDelegateImpl$hidePromoBanner$1 = new PromoBannerDelegateImpl$hidePromoBanner$1(this, (ContinuationImpl) continuation);
            }
        } else {
            promoBannerDelegateImpl$hidePromoBanner$1 = new PromoBannerDelegateImpl$hidePromoBanner$1(this, (ContinuationImpl) continuation);
        }
        Object objM15541t = promoBannerDelegateImpl$hidePromoBanner$1.f22429b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = promoBannerDelegateImpl$hidePromoBanner$1.f22431d;
        xfa xfaVar = xfa.f68157a;
        vma vmaVar = this.f22458b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            up6 up6Var = ((rn7) this.f22459c.getValue()).f59593c.f61064b;
            if (up6Var != null) {
                strM22854b = up6Var.m22854b();
                c83 c83Var = ((C1371d) vmaVar).f18562B;
                promoBannerDelegateImpl$hidePromoBanner$1.f22428a = strM22854b;
                promoBannerDelegateImpl$hidePromoBanner$1.f22431d = 1;
                objM15541t = AbstractC3224d.m15541t(c83Var, promoBannerDelegateImpl$hidePromoBanner$1);
                if (objM15541t != coroutineSingletons) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        strM22854b = promoBannerDelegateImpl$hidePromoBanner$1.f22428a;
        AbstractC3193b.m15359b(objM15541t);
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(strM22854b, Boolean.TRUE);
        promoBannerDelegateImpl$hidePromoBanner$1.f22428a = null;
        promoBannerDelegateImpl$hidePromoBanner$1.f22431d = 2;
        return ((C1371d) vmaVar).m7967g(linkedHashMapM15372Y, promoBannerDelegateImpl$hidePromoBanner$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: v */
    public final eh9 mo8575v() {
        return this.f22457a.mo8575v();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: x2 */
    public final eh9 mo8576x2() {
        return this.f22457a.mo8576x2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: y2 */
    public final eh9 mo8577y2() {
        return this.f22457a.mo8577y2();
    }
}
