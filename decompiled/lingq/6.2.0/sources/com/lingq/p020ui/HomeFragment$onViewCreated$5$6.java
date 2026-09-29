package com.lingq.p020ui;

import android.util.SparseArray;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lingq.R$id;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.c80;
import p000.dg0;
import p000.eh9;
import p000.kg6;
import p000.ng6;
import p000.un1;
import p000.x70;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$6", m4291f = "HomeFragment.kt", m4292l = {402}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeFragment$onViewCreated$5$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33925a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HomeFragment f33926b;

    /* JADX INFO: renamed from: com.lingq.ui.HomeFragment$onViewCreated$5$6$1 */
    @c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$6$1", m4291f = "HomeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28771 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f33927a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeFragment f33928b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28771(HomeFragment homeFragment, Continuation continuation) {
            super(2, continuation);
            this.f33928b = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28771 c28771 = new C28771(this.f33928b, continuation);
            c28771.f33927a = ((Number) obj).intValue();
            return c28771;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28771 c28771 = (C28771) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28771.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f33927a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = HomeFragment.f33886N0;
            BottomNavigationView bottomNavigationView = this.f33928b.m9797j0().f59103a;
            int i2 = R$id.nav_graph_more;
            dg0 dg0Var = bottomNavigationView.f13059b;
            dg0Var.getClass();
            kg6 kg6Var = null;
            if (i2 == -1) {
                C3386nv.m17626m(AbstractC3393o1.m17732g(i2, " is not a valid view id"));
                return null;
            }
            SparseArray sparseArray = dg0Var.f56146Q;
            x70 x70Var = (x70) sparseArray.get(i2);
            if (x70Var == null) {
                x70 x70Var2 = new x70(dg0Var.getContext(), null);
                sparseArray.put(i2, x70Var2);
                x70Var = x70Var2;
            }
            c80 c80Var = x70Var.f67857e;
            if (i2 == -1) {
                C3386nv.m17626m(AbstractC3393o1.m17732g(i2, " is not a valid view id"));
                return null;
            }
            ng6[] ng6VarArr = dg0Var.f56165g;
            if (ng6VarArr != null) {
                for (ng6 ng6Var : ng6VarArr) {
                    if (ng6Var instanceof kg6) {
                        kg6 kg6Var2 = (kg6) ng6Var;
                        if (kg6Var2.getId() == i2) {
                            kg6Var = kg6Var2;
                            break;
                        }
                    }
                }
            }
            if (kg6Var != null) {
                kg6Var.setBadge(x70Var);
            }
            if (i <= 0) {
                BadgeState$State badgeState$State = c80Var.f9686a;
                Boolean bool = Boolean.FALSE;
                badgeState$State.f12620O = bool;
                c80Var.f9687b.f12620O = bool;
                x70Var.setVisible(bool.booleanValue(), false);
            } else {
                BadgeState$State badgeState$State2 = c80Var.f9686a;
                Boolean bool2 = Boolean.TRUE;
                badgeState$State2.f12620O = bool2;
                c80Var.f9687b.f12620O = bool2;
                x70Var.setVisible(bool2.booleanValue(), false);
                int iMax = Math.max(0, i);
                BadgeState$State badgeState$State3 = c80Var.f9687b;
                if (badgeState$State3.f12642k != iMax) {
                    c80Var.f9686a.f12642k = iMax;
                    badgeState$State3.f12642k = iMax;
                    if (!c80Var.m4399a()) {
                        x70Var.f67855c.f7527e = true;
                        x70Var.m24331h();
                        x70Var.m24333j();
                        x70Var.invalidateSelf();
                    }
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$5$6(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f33926b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$onViewCreated$5$6(this.f33926b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeFragment$onViewCreated$5$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33925a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = HomeFragment.f33886N0;
            HomeFragment homeFragment = this.f33926b;
            eh9 eh9VarMo7008X1 = homeFragment.m9798k0().f34183r.mo7008X1();
            C28771 c28771 = new C28771(homeFragment, null);
            this.f33925a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo7008X1, c28771, this) == coroutineSingletons) {
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
