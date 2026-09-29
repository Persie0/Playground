package com.lingq.feature.dictionary;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.i93;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictContentViewModel$1", m4291f = "DictContentViewModel.kt", m4292l = {87}, m4293m = "invokeSuspend", m4294v = 2)
final class DictContentViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2056a f25653b;

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictContentViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictContentViewModel$1$1", m4291f = "DictContentViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20391 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f25654a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2056a f25655b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20391(C2056a c2056a, Continuation continuation) {
            super(2, continuation);
            this.f25655b = c2056a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20391 c20391 = new C20391(this.f25655b, continuation);
            c20391.f25654a = ((Number) obj).intValue();
            return c20391;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20391 c20391 = (C20391) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20391.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f25654a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(i > 0, this.f25655b.f25791m, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictContentViewModel$1(C2056a c2056a, Continuation continuation) {
        super(2, continuation);
        this.f25653b = c2056a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictContentViewModel$1(this.f25653b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictContentViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25652a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2056a c2056a = this.f25653b;
            i93 i93VarM7396k = c2056a.f25783e.m7396k(c2056a.f25780b.mo4589b2());
            C20391 c20391 = new C20391(c2056a, null);
            this.f25652a = 1;
            if (AbstractC3224d.m15529h(i93VarM7396k, c20391, this) == coroutineSingletons) {
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
