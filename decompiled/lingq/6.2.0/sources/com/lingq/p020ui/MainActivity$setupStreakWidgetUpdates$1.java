package com.lingq.p020ui;

import com.lingq.core.domain.model.language.Language;
import com.lingq.feature.widget.C2864b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.fa4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainActivity$setupStreakWidgetUpdates$1", m4291f = "MainActivity.kt", m4292l = {540}, m4293m = "invokeSuspend", m4294v = 2)
final class MainActivity$setupStreakWidgetUpdates$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f34100a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MainActivity f34101b;

    /* JADX INFO: renamed from: com.lingq.ui.MainActivity$setupStreakWidgetUpdates$1$1 */
    @c32(m4290c = "com.lingq.ui.MainActivity$setupStreakWidgetUpdates$1$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28821 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f34102a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MainActivity f34103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28821(MainActivity mainActivity, Continuation continuation) {
            super(2, continuation);
            this.f34103b = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28821 c28821 = new C28821(this.f34103b, continuation);
            c28821.f34102a = obj;
            return c28821;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28821 c28821 = (C28821) create((Language) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28821.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Language language = (Language) this.f34102a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2864b c2864b = this.f34103b.f34006h0;
            if (c2864b != null) {
                c2864b.m9778b(language.f19024a);
                return xfa.f68157a;
            }
            fa4.m11636J("widgetUpdateNotifier");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$setupStreakWidgetUpdates$1(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.f34101b = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainActivity$setupStreakWidgetUpdates$1(this.f34101b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MainActivity$setupStreakWidgetUpdates$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f34100a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int i2 = MainActivity.f33994m0;
            MainActivity mainActivity = this.f34101b;
            C3540rl c3540rl = new C3540rl(AbstractC3224d.m15536o(new C3540rl(mainActivity.m9802q().f34200b.mo4572B0(), 5)), 3);
            C28821 c28821 = new C28821(mainActivity, null);
            this.f34100a = 1;
            if (AbstractC3224d.m15529h(c3540rl, c28821, this) == coroutineSingletons) {
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
