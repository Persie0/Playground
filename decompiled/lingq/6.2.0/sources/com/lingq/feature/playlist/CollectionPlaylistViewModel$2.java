package com.lingq.feature.playlist;

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

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$2", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {191}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionPlaylistViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2251a f27539b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.CollectionPlaylistViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$2$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22341 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f27540a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2251a f27541b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22341(C2251a c2251a, Continuation continuation) {
            super(2, continuation);
            this.f27541b = c2251a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22341 c22341 = new C22341(this.f27541b, continuation);
            c22341.f27540a = ((Number) obj).intValue();
            return c22341;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22341 c22341 = (C22341) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22341.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f27540a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(i > 0, this.f27541b.f27795x, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPlaylistViewModel$2(C2251a c2251a, Continuation continuation) {
        super(2, continuation);
        this.f27539b = c2251a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionPlaylistViewModel$2(this.f27539b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionPlaylistViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27538a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2251a c2251a = this.f27539b;
            i93 i93VarM7396k = c2251a.f27780i.m7396k(c2251a.f27773b.mo4589b2());
            C22341 c22341 = new C22341(c2251a, null);
            this.f27538a = 1;
            if (AbstractC3224d.m15529h(i93VarM7396k, c22341, this) == coroutineSingletons) {
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
