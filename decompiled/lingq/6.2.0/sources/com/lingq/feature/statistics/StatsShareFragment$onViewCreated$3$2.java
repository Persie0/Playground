package com.lingq.feature.statistics;

import android.text.format.DateFormat;
import android.widget.LinearLayout;
import java.util.Date;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3352my;
import p000.AbstractC3423or;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.sx7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsShareFragment$onViewCreated$3$2", m4291f = "StatsShareFragment.kt", m4292l = {250}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsShareFragment$onViewCreated$3$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ StatsShareFragment f33341b;

    /* JADX INFO: renamed from: com.lingq.feature.statistics.StatsShareFragment$onViewCreated$3$2$1 */
    @c32(m4290c = "com.lingq.feature.statistics.StatsShareFragment$onViewCreated$3$2$1", m4291f = "StatsShareFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28081 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33342a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StatsShareFragment f33343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28081(StatsShareFragment statsShareFragment, Continuation continuation) {
            super(2, continuation);
            this.f33343b = statsShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28081 c28081 = new C28081(this.f33343b, continuation);
            c28081.f33342a = obj;
            return c28081;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28081 c28081 = (C28081) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28081.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f33342a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = StatsShareFragment.f33326U0;
            StatsShareFragment statsShareFragment = this.f33343b;
            LinearLayout linearLayout = statsShareFragment.m9724A0().f57687d;
            String strM17093L = AbstractC3352my.m17093L(statsShareFragment.m2090R(), str);
            AbstractC3423or.m18241Z(statsShareFragment.m2090R(), linearLayout, null, strM17093L + " " + ((Object) DateFormat.format("MM-dd-yyyy hh:mm:ss", new Date())), new sx7(25, statsShareFragment, strM17093L), 2);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareFragment$onViewCreated$3$2(StatsShareFragment statsShareFragment, Continuation continuation) {
        super(2, continuation);
        this.f33341b = statsShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StatsShareFragment$onViewCreated$3$2(this.f33341b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((StatsShareFragment$onViewCreated$3$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33340a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = StatsShareFragment.f33326U0;
            StatsShareFragment statsShareFragment = this.f33341b;
            du0 du0Var = statsShareFragment.m9725B0().f33475g;
            C28081 c28081 = new C28081(statsShareFragment, null);
            this.f33340a = 1;
            if (AbstractC3224d.m15529h(du0Var, c28081, this) == coroutineSingletons) {
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
