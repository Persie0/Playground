package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vs3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$4", m4291f = "ReaderPageViewModel.kt", m4292l = {540}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28618b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$4$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$4$1", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23621 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28619a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2411m f28620b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23621(C2411m c2411m, Continuation continuation) {
            super(2, continuation);
            this.f28620b = c2411m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23621 c23621 = new C23621(this.f28620b, continuation);
            c23621.f28619a = obj;
            return c23621;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23621 c23621 = (C23621) create((vs3) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23621.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            vs3 vs3Var = (vs3) this.f28619a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f28620b.f29202G.m15571i(vs3Var);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$4(C2411m c2411m, Continuation continuation) {
        super(2, continuation);
        this.f28618b = c2411m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$4(this.f28618b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28617a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28618b;
            C3228h c3228hM8209a = c2411m.f29241k.m8209a();
            C23621 c23621 = new C23621(c2411m, null);
            this.f28617a = 1;
            if (AbstractC3224d.m15529h(c3228hM8209a, c23621, this) == coroutineSingletons) {
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
