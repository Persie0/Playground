package com.lingq.feature.playlist;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.ux5;
import p000.vi7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$5", m4291f = "PlaylistViewModel.kt", m4292l = {329}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27628a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27629b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$5$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$5$1", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22401 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f27630a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2255e f27631b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22401(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27631b = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22401 c22401 = new C22401(this.f27631b, continuation);
            c22401.f27630a = ((Boolean) obj).booleanValue();
            return c22401;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C22401 c22401 = (C22401) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22401.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f27630a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(z, this.f27631b.f27806A, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$5(C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27629b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$5(this.f27629b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27628a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27629b;
            vi7 vi7Var = ((C1368a) c2255e.f27833j.f37455a).f18404e1;
            C22401 c22401 = new C22401(c2255e, null);
            this.f27628a = 1;
            if (AbstractC3224d.m15529h(vi7Var, c22401, this) == coroutineSingletons) {
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
