package com.lingq.feature.reader.old;

import android.widget.ImageView;
import android.widget.TextView;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.feature.reader.shared.p018ui.components.ReaderPlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.C3540rl;
import p000.bh4;
import p000.c32;
import p000.fa4;
import p000.fx5;
import p000.jfa;
import p000.lda;
import p000.lg3;
import p000.lw7;
import p000.qw7;
import p000.r3b;
import p000.rw7;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$6", m4291f = "ReaderFragment.kt", m4292l = {683}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28414a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28415b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$6$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$6$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23201 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28416a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23201(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28417b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23201 c23201 = new C23201(this.f28417b, continuation);
            c23201.f28416a = obj;
            return c23201;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23201 c23201 = (C23201) create((Lesson) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23201.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Lesson lesson = (Lesson) this.f28416a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28417b;
            fx5 fx5Var = readerFragment.f28224H0;
            if (fx5Var == null) {
                fa4.m11636J("viewLessonMenuBinding");
                throw null;
            }
            fx5Var.f39859h.setOnClickListener(new lw7(readerFragment, 2));
            TextView textView = fx5Var.f39866o;
            String str = lesson.f19143b;
            String str2 = lesson.f19147f;
            Integer num = lesson.f19152k;
            Integer num2 = lesson.f19153l;
            String str3 = lesson.f19162u;
            textView.setText(str);
            Integer num3 = !AbstractC3184kh.m15194A(readerFragment.m9290W0().f29340b.mo4589b2()) ? num2 : num;
            if (AbstractC3184kh.m15194A(readerFragment.m9290W0().f29340b.mo4589b2())) {
                num = num2;
            }
            C2412n c2412nM9290W0 = readerFragment.m9290W0();
            ArrayList arrayListM20837e0 = AbstractC3550rv.m20837e0(new Integer[]{num3, num});
            c2412nM9290W0.getClass();
            wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$getLessonCounters$1(c2412nM9290W0, arrayListM20837e0, null), 3);
            ImageView imageView = fx5Var.f39857f;
            if (num3 != null) {
                imageView.setOnClickListener(new ViewOnClickListenerC2405g(readerFragment, num3, 0));
            } else {
                jfa.m14420c(imageView);
            }
            ImageView imageView2 = fx5Var.f39858g;
            if (num != null) {
                imageView2.setOnClickListener(new ViewOnClickListenerC2405g(readerFragment, num, 1));
            } else {
                jfa.m14420c(imageView2);
            }
            fx5Var.f39855d.setOnClickListener(new ViewOnClickListenerC2406h(readerFragment));
            fx5Var.f39860i.setOnClickListener(new lw7(readerFragment, 3));
            fx5Var.f39853b.setOnClickListener(new lw7(readerFragment, 4));
            fx5Var.f39854c.setOnClickListener(new lw7(readerFragment, 5));
            fx5Var.f39856e.setOnClickListener(new qw7(readerFragment, lesson, 0));
            fx5Var.f39862k.setOnClickListener(new lw7(readerFragment, 6));
            fx5Var.f39861j.setOnClickListener(new lw7(readerFragment, 1));
            ReaderPlayerView readerPlayerView = readerFragment.m9288U0().f66686G;
            if (str3 == null || readerFragment.m9290W0().m9331k3() || readerFragment.m9288U0().f66686G.getVisibility() == 0) {
                jfa.m14425h(readerFragment.m9288U0().f66714t);
            } else {
                jfa.m14429l(readerFragment.m9288U0().f66714t);
                readerFragment.m9288U0().f66714t.setOnClickListener(new lw7(readerFragment, 7));
            }
            if (str2 == null && str3 != null) {
                jfa.m14425h(readerFragment.m9288U0().f66712r);
            }
            if (lesson.f19161t == null) {
                C2412n c2412nM9290W1 = readerFragment.m9290W0();
                int i = lesson.f19142a;
                c2412nM9290W1.getClass();
                wfb.m23926u(lda.m16103C(c2412nM9290W1), c2412nM9290W1.f29301O, null, new ReaderViewModel$updateIsTaken$1(c2412nM9290W1, i, null), 2);
            }
            if (str3 != null && str2 == null) {
                lg3 lg3VarM2112n = readerFragment.m2112n();
                lg3VarM2112n.m16179b();
                lg3VarM2112n.f49626e.mo21323g(readerFragment.m9288U0().f66694O);
                YouTubePlayerView youTubePlayerView = readerFragment.m9288U0().f66694O;
                rw7 rw7Var = new rw7(lesson, 0);
                r3b webViewYouTubePlayer$core_release = youTubePlayerView.f34326b.getWebViewYouTubePlayer$core_release();
                webViewYouTubePlayer$core_release.getClass();
                webViewYouTubePlayer$core_release.f58579c.m3590a(rw7Var);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$6(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28415b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$6(this.f28415b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28414a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28415b;
            C3540rl c3540rl = new C3540rl(readerFragment.m9290W0().f29385m0, 5);
            C23201 c23201 = new C23201(readerFragment, null);
            this.f28414a = 1;
            if (AbstractC3224d.m15529h(c3540rl, c23201, this) == coroutineSingletons) {
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
