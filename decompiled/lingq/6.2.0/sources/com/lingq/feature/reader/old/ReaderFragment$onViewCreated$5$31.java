package com.lingq.feature.reader.old;

import android.graphics.Rect;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.data.PlayerViewState;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.d8d;
import p000.du0;
import p000.e7a;
import p000.fa4;
import p000.hc7;
import p000.jfa;
import p000.nw7;
import p000.o47;
import p000.un1;
import p000.xfa;
import p000.y5a;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$31", m4291f = "ReaderFragment.kt", m4292l = {1366}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$31 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28343b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$31$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$31$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23001 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28344a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28345b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23001(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28345b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23001 c23001 = new C23001(this.f28345b, continuation);
            c23001.f28344a = obj;
            return c23001;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23001 c23001 = (C23001) create((TooltipStep) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23001.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TooltipStep tooltipStep = (TooltipStep) this.f28344a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int i = nw7.f53329a[tooltipStep.ordinal()];
            ReaderFragment readerFragment = this.f28345b;
            switch (i) {
                case 1:
                    bh4[] bh4VarArr = ReaderFragment.f28218P0;
                    if (((Boolean) readerFragment.m9290W0().f29376k.mo8763g().getValue()).booleanValue()) {
                        Rect rect = new Rect();
                        readerFragment.m9288U0().f66688I.getGlobalVisibleRect(rect);
                        e7a.m10913k0(readerFragment.m9290W0(), new y5a(tooltipStep, d8d.m10163c(tooltipStep, readerFragment.m2090R(), readerFragment.m9287T0().m20129c())), rect, new Rect(), true, o47.f53828c, 8);
                    }
                    break;
                case 2:
                    bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                    if (((Boolean) readerFragment.m9290W0().f29376k.mo8763g().getValue()).booleanValue() && !readerFragment.m9290W0().m9331k3() && readerFragment.m9288U0().f66686G.getVisibility() != 0) {
                        C1808b c1808b = readerFragment.f28230N0;
                        if (c1808b == null) {
                            fa4.m11636J("playerController");
                            throw null;
                        }
                        if (((hc7) ((C3244l) c1808b.f21946D.f9311a).getValue()).f42175c != PlayerViewState.Opened) {
                            Rect rect2 = new Rect();
                            readerFragment.m9288U0().f66712r.getGlobalVisibleRect(rect2);
                            e7a.m10913k0(readerFragment.m9290W0(), new y5a(tooltipStep, d8d.m10163c(tooltipStep, readerFragment.m2090R(), readerFragment.m9287T0().m20129c())), rect2, null, false, o47.f53829d, 60);
                        }
                    }
                    break;
                case 3:
                    bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                    if (((Boolean) readerFragment.m9290W0().f29376k.mo8763g().getValue()).booleanValue() && readerFragment.m9288U0().f66686G.getVisibility() == 0) {
                        C1808b c1808b2 = readerFragment.f28230N0;
                        if (c1808b2 == null) {
                            fa4.m11636J("playerController");
                            throw null;
                        }
                        if (((hc7) ((C3244l) c1808b2.f21946D.f9311a).getValue()).f42175c == PlayerViewState.Opened) {
                            Rect rect3 = new Rect();
                            readerFragment.m9288U0().f66686G.getGlobalVisibleRect(rect3);
                            Rect rect4 = new Rect();
                            rect4.top = rect3.top;
                            rect4.bottom = rect3.bottom;
                            Rect rect5 = new Rect();
                            rect5.bottom = rect4.top - ((int) jfa.m14419b(readerFragment.m2090R(), 5));
                            rect5.right = (int) jfa.m14419b(readerFragment.m2090R(), 30);
                            rect5.left = (int) jfa.m14419b(readerFragment.m2090R(), 30);
                            e7a.m10913k0(readerFragment.m9290W0(), new y5a(tooltipStep, d8d.m10163c(tooltipStep, readerFragment.m2090R(), readerFragment.m9287T0().m20129c())), rect4, rect5, true, o47.f53830e, 8);
                        }
                    }
                    break;
                case 4:
                    bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                    if (((Boolean) readerFragment.m9290W0().f29376k.mo8763g().getValue()).booleanValue() && !readerFragment.m9290W0().m9331k3()) {
                        Rect rect6 = new Rect();
                        readerFragment.m9288U0().f66717w.getGlobalVisibleRect(rect6);
                        rect6.top -= (int) jfa.m14419b(readerFragment.m2090R(), 5);
                        rect6.bottom += (int) jfa.m14419b(readerFragment.m2090R(), 5);
                        Rect rect7 = new Rect();
                        rect7.bottom = rect6.top - ((int) jfa.m14419b(readerFragment.m2090R(), 5));
                        e7a.m10913k0(readerFragment.m9290W0(), new y5a(tooltipStep, d8d.m10163c(tooltipStep, readerFragment.m2090R(), readerFragment.m9287T0().m20129c())), rect6, rect7, true, o47.f53831f, 8);
                    }
                    break;
                case 5:
                    bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                    if (readerFragment.m9290W0().m9331k3() && ((Boolean) readerFragment.m9290W0().f29376k.mo8763g().getValue()).booleanValue()) {
                        Rect rect8 = new Rect();
                        readerFragment.m9288U0().f66709o.getGlobalVisibleRect(rect8);
                        Rect rect9 = new Rect(rect8.right - ((int) jfa.m14419b(readerFragment.m2090R(), 40)), rect8.top, rect8.right - ((int) jfa.m14419b(readerFragment.m2090R(), 3)), rect8.bottom);
                        Rect rect10 = new Rect();
                        rect10.top = rect8.centerY() + ((int) jfa.m14419b(readerFragment.m2090R(), 5));
                        rect10.right = (int) jfa.m14419b(readerFragment.m2090R(), 30);
                        e7a.m10913k0(readerFragment.m9290W0(), new y5a(tooltipStep, d8d.m10163c(tooltipStep, readerFragment.m2090R(), readerFragment.m9287T0().m20129c())), rect9, rect10, true, o47.f53832g, 8);
                    }
                    break;
                case 6:
                    bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                    if (((Boolean) readerFragment.m9290W0().f29376k.mo8763g().getValue()).booleanValue() && !readerFragment.m9290W0().m9331k3()) {
                        int measuredHeight = readerFragment.m9288U0().f66709o.getMeasuredHeight();
                        int measuredWidth = readerFragment.m9288U0().f66709o.getMeasuredWidth();
                        float fM14419b = jfa.m14419b(readerFragment.m2090R(), 30);
                        float f = measuredWidth;
                        float fM14419b2 = f - jfa.m14419b(readerFragment.m2090R(), 35);
                        float fM14419b3 = f - jfa.m14419b(readerFragment.m2090R(), 3);
                        float fM14419b4 = jfa.m14419b(readerFragment.m2090R(), 40) + (measuredHeight / 2);
                        e7a.m10913k0(readerFragment.m9290W0(), new y5a(tooltipStep, d8d.m10163c(tooltipStep, readerFragment.m2090R(), readerFragment.m9287T0().m20129c())), new Rect((int) fM14419b2, (int) fM14419b4, (int) fM14419b3, (int) (fM14419b + fM14419b4)), null, false, o47.f53833h, 60);
                    }
                    break;
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$31(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28343b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$31(this.f28343b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$31) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28342a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28343b;
            du0 du0Var = readerFragment.m9290W0().f29273E1;
            C23001 c23001 = new C23001(readerFragment, null);
            this.f28342a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23001, this) == coroutineSingletons) {
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
