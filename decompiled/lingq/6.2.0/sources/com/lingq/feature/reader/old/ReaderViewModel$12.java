package com.lingq.feature.reader.old;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.c83;
import p000.p08;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$12", m4291f = "ReaderViewModel.kt", m4292l = {938}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$12 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28804a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28805b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$12$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$12$2", m4291f = "ReaderViewModel.kt", m4292l = {941}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23742 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f28806a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28807b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23742(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28807b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23742(this.f28807b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C23742) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28806a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f28806a = 1;
                if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            this.f28807b.m9336p3(true);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$12(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28805b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$12(this.f28805b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$12) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28804a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28805b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(new C3540rl(new p08(c2412n.f29340b.mo4585R(), 2), 3));
            C23742 c23742 = new C23742(c2412n, null);
            this.f28804a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c23742, this) == coroutineSingletons) {
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
