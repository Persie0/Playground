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
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$6", m4291f = "PlaylistViewModel.kt", m4292l = {1066}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27633b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$6$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$6$1", m4291f = "PlaylistViewModel.kt", m4292l = {336}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22411 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f27634a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f27635b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2255e f27636c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22411(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27636c = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22411 c22411 = new C22411(this.f27636c, continuation);
            c22411.f27635b = obj;
            return c22411;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C22411) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f27635b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f27634a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f27635b = null;
                this.f27634a = 1;
                if (C2255e.m9236X2(this.f27636c, list, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$6(C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27633b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$6(this.f27633b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27632a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27633b;
            c18 c18Var = c2255e.f27808C;
            C22411 c22411 = new C22411(c2255e, null);
            c18Var.getClass();
            this.f27632a = 1;
            if (AbstractC3224d.m15529h(c18Var, c22411, this) == coroutineSingletons) {
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
