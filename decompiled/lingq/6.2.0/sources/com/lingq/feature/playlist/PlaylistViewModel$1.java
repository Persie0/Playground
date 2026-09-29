package com.lingq.feature.playlist;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.fa4;
import p000.lda;
import p000.pd7;
import p000.un1;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$1", m4291f = "PlaylistViewModel.kt", m4292l = {1066}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27612b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$1$1", m4291f = "PlaylistViewModel.kt", m4292l = {299}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22361 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f27613a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f27614b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2255e f27615c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22361(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27615c = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22361 c22361 = new C22361(this.f27615c, continuation);
            c22361.f27614b = obj;
            return c22361;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C22361) create((Language) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0044  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2255e c2255e = this.f27615c;
            pd7 pd7Var = c2255e.f27848y;
            Language language = (Language) this.f27614b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f27613a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (vk9.m23391n0(pd7Var.f55974a)) {
                    c2255e.m9238Z2();
                    AbstractC1263a.m7047b(lda.m16103C(c2255e), c2255e.f27840q, "playlists", new PlaylistViewModel$getPlaylists$1(c2255e, null));
                    C2255e.m9237Y2(c2255e);
                    wfb.m23926u(lda.m16103C(c2255e), null, null, new PlaylistViewModel$checkHasTTS$1(c2255e, null), 3);
                } else {
                    if (fa4.m11650l(language != null ? language.f19024a : null, pd7Var.f55974a)) {
                        c2255e.m9238Z2();
                        AbstractC1263a.m7047b(lda.m16103C(c2255e), c2255e.f27840q, "playlists", new PlaylistViewModel$getPlaylists$1(c2255e, null));
                        C2255e.m9237Y2(c2255e);
                        wfb.m23926u(lda.m16103C(c2255e), null, null, new PlaylistViewModel$checkHasTTS$1(c2255e, null), 3);
                    } else {
                        String str = pd7Var.f55974a;
                        this.f27614b = null;
                        this.f27613a = 1;
                        if (c2255e.f27825b.mo4576F1(str, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
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
    public PlaylistViewModel$1(C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27612b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$1(this.f27612b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27611a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27612b;
            eh9 eh9VarMo4572B0 = c2255e.f27825b.mo4572B0();
            C22361 c22361 = new C22361(c2255e, null);
            eh9VarMo4572B0.getClass();
            this.f27611a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c22361, this) == coroutineSingletons) {
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
