package com.lingq.core.achievements;

import android.widget.TextView;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$1", m4291f = "RepairStreakFragment.kt", m4292l = {57}, m4293m = "invokeSuspend", m4294v = 2)
final class RepairStreakFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RepairStreakFragment f14190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f14191c;

    /* JADX INFO: renamed from: com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$1$1 */
    @c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$1$1", m4291f = "RepairStreakFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12281 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f14192a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RepairStreakFragment f14193b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f14194c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12281(RepairStreakFragment repairStreakFragment, String str, Continuation continuation) {
            super(2, continuation);
            this.f14193b = repairStreakFragment;
            this.f14194c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C12281 c12281 = new C12281(this.f14193b, this.f14194c, continuation);
            c12281.f14192a = obj;
            return c12281;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C12281 c12281 = (C12281) create((Integer) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c12281.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String string;
            Integer num = (Integer) this.f14192a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (num != null) {
                bh4[] bh4VarArr = RepairStreakFragment.f14177T0;
                RepairStreakFragment repairStreakFragment = this.f14193b;
                TextView textView = repairStreakFragment.m6996m0().f578e;
                String str = this.f14194c;
                if (str != null) {
                    string = repairStreakFragment.m2110l().getString(R$string.streak_you_lost_your_streak_on_date, str);
                } else {
                    string = repairStreakFragment.m2110l().getString(R$string.streak_you_lost_your_n_day_streak, num);
                }
                textView.setText(string);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakFragment$onViewCreated$2$1(RepairStreakFragment repairStreakFragment, String str, Continuation continuation) {
        super(2, continuation);
        this.f14190b = repairStreakFragment;
        this.f14191c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepairStreakFragment$onViewCreated$2$1(this.f14190b, this.f14191c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RepairStreakFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14189a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = RepairStreakFragment.f14177T0;
            RepairStreakFragment repairStreakFragment = this.f14190b;
            c18 c18Var = repairStreakFragment.m6997n0().f14231g;
            C12281 c12281 = new C12281(repairStreakFragment, this.f14191c, null);
            this.f14189a = 1;
            if (AbstractC3224d.m15529h(c18Var, c12281, this) == coroutineSingletons) {
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
