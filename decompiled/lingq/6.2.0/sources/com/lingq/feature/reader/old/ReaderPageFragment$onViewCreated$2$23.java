package com.lingq.feature.reader.old;

import com.lingq.feature.player.R$drawable;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$23", m4291f = "ReaderPageFragment.kt", m4292l = {1532}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$23 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28540a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28541b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$23$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$23$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23451 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ float f28542a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28543b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23451(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28543b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23451 c23451 = new C23451(this.f28543b, continuation);
            c23451.f28542a = ((Number) obj).floatValue();
            return c23451;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23451 c23451 = (C23451) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23451.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            float f = this.f28542a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderPageFragment readerPageFragment = this.f28543b;
            if (f < 1.0f) {
                vx7 vx7Var = ReaderPageFragment.Companion;
                readerPageFragment.m9297V0().f69715f.setImageResource(R$drawable.ic_playback_slow);
            } else {
                vx7 vx7Var2 = ReaderPageFragment.Companion;
                readerPageFragment.m9297V0().f69715f.setImageResource(R$drawable.ic_playback_fast);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$23(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28541b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$23(this.f28541b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$23) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28540a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28541b;
            c18 c18Var = readerPageFragment.m9299X0().f29216U;
            C23451 c23451 = new C23451(readerPageFragment, null);
            c18Var.getClass();
            this.f28540a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23451, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
