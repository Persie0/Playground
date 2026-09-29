package com.lingq.feature.reader.old;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.dj3;
import p000.lda;
import p000.n83;
import p000.ox7;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$3", m4291f = "ReaderPageViewModel.kt", m4292l = {534}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28611b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$3$1", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23601 extends SuspendLambda implements dj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ ox7 f28612a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ boolean f28613b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Map f28614c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Map f28615d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C2411m f28616e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23601(C2411m c2411m, Continuation continuation) {
            super(6, continuation);
            this.f28616e = c2411m;
        }

        @Override // p000.dj3
        /* JADX INFO: renamed from: h */
        public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) throws Throwable {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj4).getClass();
            C23601 c23601 = new C23601(this.f28616e, (Continuation) obj6);
            c23601.f28612a = (ox7) obj;
            c23601.f28613b = zBooleanValue;
            c23601.f28614c = (Map) obj3;
            c23601.f28615d = (Map) obj5;
            xfa xfaVar = xfa.f68157a;
            c23601.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ox7 ox7Var = this.f28612a;
            boolean z = this.f28613b;
            Map map = this.f28614c;
            Map map2 = this.f28615d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (z) {
                C2411m c2411m = this.f28616e;
                wfb.m23926u(lda.m16103C(c2411m), null, null, new ReaderPageViewModel$updateCwts$1(ox7Var, map2, c2411m, map, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$3$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$3$2", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23612 extends SuspendLambda implements zi3 {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23612(2, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23612 c23612 = (C23612) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23612.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$3(C2411m c2411m, Continuation continuation) {
        super(2, continuation);
        this.f28611b = c2411m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$3(this.f28611b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28610a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28611b;
            n83 n83VarM15530i = AbstractC3224d.m15530i(new C3540rl(c2411m.f29254v, 5), new C3540rl(c2411m.f29200E, 5), c2411m.f29204I, c2411m.f29250r, c2411m.f29197B, new C23601(c2411m, null));
            C23612 c23612 = new C23612(2, null);
            this.f28610a = 1;
            if (AbstractC3224d.m15529h(n83VarM15530i, c23612, this) == coroutineSingletons) {
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
