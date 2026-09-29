package com.lingq.feature.playlist;

import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$3", m4291f = "PlaylistViewModel.kt", m4292l = {316}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27621b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$3$1", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22381 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f27622a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2255e f27623b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22381(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27623b = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22381 c22381 = new C22381(this.f27623b, continuation);
            c22381.f27622a = obj;
            return c22381;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22381 c22381 = (C22381) create((Playlist) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22381.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Playlist playlist = (Playlist) this.f27622a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27623b;
            c2255e.m9243e3(playlist);
            C3244l c3244l = c2255e.f27816K;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$3(C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27621b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$3(this.f27621b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27620a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27621b;
            c83 c83VarMo346t1 = c2255e.f27828e.mo346t1();
            C22381 c22381 = new C22381(c2255e, null);
            this.f27620a = 1;
            if (AbstractC3224d.m15529h(c83VarMo346t1, c22381, this) == coroutineSingletons) {
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
