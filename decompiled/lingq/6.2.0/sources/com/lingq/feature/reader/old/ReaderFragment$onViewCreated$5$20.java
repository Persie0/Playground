package com.lingq.feature.reader.old;

import android.content.Context;
import com.lingq.core.designsystem.R$bool;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.data.PlayerState;
import com.lingq.feature.player.R$drawable;
import com.lingq.feature.reader.shared.p018ui.components.ReaderPlayerView;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ava;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.gm5;
import p000.hc7;
import p000.jfa;
import p000.kw7;
import p000.lda;
import p000.r79;
import p000.t79;
import p000.un1;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$20", m4291f = "ReaderFragment.kt", m4292l = {2110}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$20 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28295a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28296b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$20$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$20$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22881 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28297a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28298b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22881(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28298b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22881 c22881 = new C22881(this.f28298b, continuation);
            c22881.f28297a = obj;
            return c22881;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22881 c22881 = (C22881) create((hc7) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22881.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            hc7 hc7Var = (hc7) this.f28297a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28298b;
            ReaderPlayerView readerPlayerView = readerFragment.m9288U0().f66686G;
            hc7Var.getClass();
            PlayerState playerState = hc7Var.f42174b;
            PlayerState playerState2 = PlayerState.Playing;
            ava avaVar = readerPlayerView.f30399a;
            if (playerState == playerState2) {
                avaVar.f7596d.setImageResource(R$drawable.ic_player_pause);
            } else {
                avaVar.f7596d.setImageResource(R$drawable.ic_player_play);
            }
            if (playerState == playerState2) {
                readerFragment.m9290W0().mo9034v0(AppUsageType.Reading);
            } else {
                readerFragment.m9290W0().mo9033o1(AppUsageType.Reading, new Integer(readerFragment.m9290W0().m9332l3()));
            }
            readerFragment.m9290W0().mo8745Q();
            int i = kw7.f48508a[hc7Var.f42175c.ordinal()];
            if (i == 1) {
                jfa.m14425h(readerFragment.m9288U0().f66686G);
                if (!readerFragment.m9290W0().m9331k3()) {
                    jfa.m14429l(readerFragment.m9288U0().f66685F);
                    Lesson lesson = (Lesson) ((C3244l) readerFragment.m9290W0().f29385m0.f9311a).getValue();
                    if ((lesson != null ? lesson.f19162u : null) != null) {
                        jfa.m14429l(readerFragment.m9288U0().f66714t);
                    }
                    jfa.m14429l(readerFragment.m9288U0().f66718x);
                    if (!(((C3244l) readerFragment.m9290W0().f29367h2.f9311a).getValue() instanceof t79) && !(((C3244l) readerFragment.m9290W0().f29367h2.f9311a).getValue() instanceof r79)) {
                        jfa.m14429l(readerFragment.m9288U0().f66720z);
                    }
                }
                readerFragment.m9288U0().f66689J.setGravity(17);
            } else {
                if (i != 2) {
                    gm5.m12750e();
                    return null;
                }
                if (!jfa.m14418a(readerFragment.m2089Q())) {
                    readerFragment.m9288U0().f66689J.setGravity(8388613);
                }
                jfa.m14425h(readerFragment.m9288U0().f66720z);
                jfa.m14420c(readerFragment.m9288U0().f66685F);
                jfa.m14429l(readerFragment.m9288U0().f66686G);
                if (!readerFragment.m9290W0().m9331k3() && !jfa.m14418a(readerFragment.m2090R()) && !vz1.m23653w(readerFragment)) {
                    Context contextM2090R = readerFragment.m2090R();
                    if (contextM2090R.getResources().getBoolean(R$bool.is_phone) || contextM2090R.getResources().getConfiguration().orientation != 1) {
                        jfa.m14425h(readerFragment.m9288U0().f66718x);
                    }
                }
                readerFragment.m9290W0().mo8742L(TooltipStep.PlayAudioHighlight);
                C2412n c2412nM9290W0 = readerFragment.m9290W0();
                c2412nM9290W0.getClass();
                wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$showPlayAudioTooltip$1(c2412nM9290W0, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$20(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28296b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$20(this.f28296b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$20) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28295a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28296b;
            C1808b c1808b = readerFragment.f28230N0;
            if (c1808b == null) {
                fa4.m11636J("playerController");
                throw null;
            }
            c18 c18Var = c1808b.f21946D;
            C22881 c22881 = new C22881(readerFragment, null);
            c18Var.getClass();
            this.f28295a = 1;
            if (AbstractC3224d.m15529h(c18Var, c22881, this) == coroutineSingletons) {
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
