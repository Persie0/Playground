package com.lingq.feature.playlist;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {436}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionPlaylistViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2251a f27535b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.CollectionPlaylistViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$1$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22331 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f27536a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2251a f27537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22331(C2251a c2251a, Continuation continuation) {
            super(2, continuation);
            this.f27537b = c2251a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22331 c22331 = new C22331(this.f27537b, continuation);
            c22331.f27536a = obj;
            return c22331;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22331 c22331 = (C22331) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22331.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f27536a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f27537b.m9208a3(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPlaylistViewModel$1(C2251a c2251a, Continuation continuation) {
        super(2, continuation);
        this.f27535b = c2251a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionPlaylistViewModel$1(this.f27535b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionPlaylistViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27534a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2251a c2251a = this.f27535b;
            c18 c18Var = c2251a.f27790s;
            C22331 c22331 = new C22331(c2251a, null);
            c18Var.getClass();
            this.f27534a = 1;
            if (AbstractC3224d.m15529h(c18Var, c22331, this) == coroutineSingletons) {
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
