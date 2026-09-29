package com.lingq.p020ui;

import android.os.Bundle;
import com.lingq.R$id;
import com.lingq.core.domain.model.user.ImportData;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.bv3;
import p000.c32;
import p000.cv3;
import p000.db6;
import p000.du0;
import p000.dv3;
import p000.eb6;
import p000.ec6;
import p000.ev3;
import p000.fa4;
import p000.fc6;
import p000.fv3;
import p000.gm5;
import p000.hc6;
import p000.ic6;
import p000.jfa;
import p000.og8;
import p000.r86;
import p000.ud6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$5", m4291f = "HomeFragment.kt", m4292l = {324}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeFragment$onViewCreated$5$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HomeFragment f33922b;

    /* JADX INFO: renamed from: com.lingq.ui.HomeFragment$onViewCreated$5$5$1 */
    @c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$5$1", m4291f = "HomeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28761 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33923a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeFragment f33924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28761(HomeFragment homeFragment, Continuation continuation) {
            super(2, continuation);
            this.f33924b = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28761 c28761 = new C28761(this.f33924b, continuation);
            c28761.f33923a = obj;
            return c28761;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28761 c28761 = (C28761) create((fv3) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28761.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            String str2;
            String str3;
            fv3 fv3Var = (fv3) this.f33923a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean zM11650l = fa4.m11650l(fv3Var, cv3.f34605a);
            HomeFragment homeFragment = this.f33924b;
            if (zM11650l) {
                r86 r86VarM13127f = b34.m3244j(homeFragment).f63760b.m13127f();
                if (r86VarM13127f != null && r86VarM13127f.f58881b.f57368b == R$id.fragment_home) {
                    ud6 ud6VarM3244j = b34.m3244j(homeFragment);
                    eb6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j, db6.m10269a(), null);
                }
            } else if (fv3Var instanceof dv3) {
                dv3 dv3Var = (dv3) fv3Var;
                jfa.m14428k(b34.m3244j(homeFragment), ec6.m11026a(fc6.Companion, dv3Var.m10683a(), dv3Var.m10684b(), 0, "", 32), null);
            } else if (fv3Var instanceof ev3) {
                og8 og8Var = homeFragment.f33895K0;
                if (og8Var == null) {
                    fa4.m11636J("reviewTermsStore");
                    throw null;
                }
                ev3 ev3Var = (ev3) fv3Var;
                og8Var.f54320a = AbstractC3550rv.m20855w0(EmptyList.f47638a.toArray(new String[0]));
                jfa.m14428k(b34.m3244j(homeFragment), hc6.m13195b(ic6.Companion, ev3Var.m11364c(), true, true, ev3Var.m11363b(), ev3Var.m11362a()), null);
            } else if (fa4.m11650l(fv3Var, cv3.f34606b)) {
                bh4[] bh4VarArr = HomeFragment.f33886N0;
                homeFragment.m9797j0().f59103a.setSelectedItemId(R$id.nav_graph_library);
            } else {
                if (!(fv3Var instanceof bv3)) {
                    gm5.m12750e();
                    return null;
                }
                Bundle bundle = new Bundle();
                bv3 bv3Var = (bv3) fv3Var;
                ImportData importDataM4193a = bv3Var.m4193a();
                String str4 = "";
                if (importDataM4193a == null || (str = importDataM4193a.f19637a) == null) {
                    str = "";
                }
                bundle.putString("title", str);
                ImportData importDataM4193a2 = bv3Var.m4193a();
                if (importDataM4193a2 == null || (str2 = importDataM4193a2.f19638b) == null) {
                    str2 = "";
                }
                bundle.putString("url", str2);
                ImportData importDataM4193a3 = bv3Var.m4193a();
                if (importDataM4193a3 != null && (str3 = importDataM4193a3.f19640d) != null) {
                    str4 = str3;
                }
                bundle.putString("fileUri", str4);
                ud6 ud6Var = homeFragment.f33890F0;
                if (ud6Var == null) {
                    fa4.m11636J("navController");
                    throw null;
                }
                ud6Var.m22687d(R$id.nav_graph_user_import, bundle, null);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$5$5(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f33922b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$onViewCreated$5$5(this.f33922b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeFragment$onViewCreated$5$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33921a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = HomeFragment.f33886N0;
            HomeFragment homeFragment = this.f33922b;
            du0 du0Var = homeFragment.m9798k0().f34188w;
            C28761 c28761 = new C28761(homeFragment, null);
            this.f33921a = 1;
            if (AbstractC3224d.m15529h(du0Var, c28761, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
