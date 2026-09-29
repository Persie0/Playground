package com.lingq.feature.reader.old;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.gm5;
import p000.hw7;
import p000.jfa;
import p000.kbb;
import p000.nbb;
import p000.obb;
import p000.pw7;
import p000.r3b;
import p000.rw7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$41", m4291f = "ReaderFragment.kt", m4292l = {1659}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$41 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28385a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28386b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$41$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$41$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23121 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28387a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28388b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23121(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28388b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23121 c23121 = new C23121(this.f28388b, continuation);
            c23121.f28387a = obj;
            return c23121;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23121 c23121 = (C23121) create((obb) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23121.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            ReaderFragment readerFragment = this.f28388b;
            rw7 rw7Var = readerFragment.f28226J0;
            obb obbVar = (obb) this.f28387a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (obbVar instanceof kbb) {
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                jfa.m14429l(readerFragment.m9288U0().f66693N);
                jfa.m14429l(readerFragment.m9288U0().f66694O);
                C3244l c3244l = readerFragment.m9290W0().f29343b2;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, null));
                readerFragment.m9288U0().f66694O.m9820a(new pw7(obbVar, readerFragment));
                YouTubePlayerView youTubePlayerView = readerFragment.m9288U0().f66694O;
                rw7Var.getClass();
                r3b webViewYouTubePlayer$core_release = youTubePlayerView.f34326b.getWebViewYouTubePlayer$core_release();
                webViewYouTubePlayer$core_release.getClass();
                webViewYouTubePlayer$core_release.f58579c.m3595f(rw7Var);
                YouTubePlayerView youTubePlayerView2 = readerFragment.m9288U0().f66694O;
                rw7Var.getClass();
                r3b webViewYouTubePlayer$core_release2 = youTubePlayerView2.f34326b.getWebViewYouTubePlayer$core_release();
                webViewYouTubePlayer$core_release2.getClass();
                webViewYouTubePlayer$core_release2.f58579c.m3590a(rw7Var);
            } else {
                if (!(obbVar instanceof nbb)) {
                    gm5.m12750e();
                    return null;
                }
                bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                readerFragment.m9288U0().f66694O.m9820a(new hw7(1));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$41(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28386b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$41(this.f28386b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$41) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28385a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28386b;
            du0 du0Var = readerFragment.m9290W0().f29401r0;
            C23121 c23121 = new C23121(readerFragment, null);
            this.f28385a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23121, this) == coroutineSingletons) {
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
