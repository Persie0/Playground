package com.lingq.feature.reader.old;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1577}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28603a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28604b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$1$1", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23581 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2411m f28605a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23581(C2411m c2411m, Continuation continuation) {
            super(2, continuation);
            this.f28605a = c2411m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23581(this.f28605a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23581 c23581 = (C23581) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23581.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28605a;
            wfb.m23926u(lda.m16103C(c2411m), null, null, new ReaderPageViewModel$showWordTooltips$1(c2411m, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$1(C2411m c2411m, Continuation continuation) {
        super(2, continuation);
        this.f28604b = c2411m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$1(this.f28604b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28603a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28604b;
            C3244l c3244l = c2411m.f29197B;
            C23581 c23581 = new C23581(c2411m, null);
            c3244l.getClass();
            this.f28603a = 1;
            if (AbstractC3224d.m15529h(c3244l, c23581, this) == coroutineSingletons) {
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
