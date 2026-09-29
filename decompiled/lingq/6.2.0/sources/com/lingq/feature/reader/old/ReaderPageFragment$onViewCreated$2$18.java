package com.lingq.feature.reader.old;

import android.content.Context;
import android.graphics.Rect;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.C3509qs;
import p000.c32;
import p000.d8d;
import p000.du0;
import p000.e7a;
import p000.fa4;
import p000.jfa;
import p000.tx5;
import p000.un1;
import p000.vx7;
import p000.wx7;
import p000.xfa;
import p000.xz7;
import p000.y5a;
import p000.zg0;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$18", m4291f = "ReaderPageFragment.kt", m4292l = {642}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$18 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28511b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28512c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$18$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$18$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23381 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28513a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28514b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f28515c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23381(int i, ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28514b = readerPageFragment;
            this.f28515c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23381 c23381 = new C23381(this.f28515c, this.f28514b, continuation);
            c23381.f28513a = obj;
            return c23381;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23381 c23381 = (C23381) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23381.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f28513a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            xz7 xz7Var = (xz7) pair.f47623a;
            TooltipStep tooltipStep = (TooltipStep) pair.f47624b;
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28514b;
            int iM9323d3 = readerPageFragment.m9298W0().m9323d3();
            xfa xfaVar = xfa.f68157a;
            if (iM9323d3 == this.f28515c && ((Boolean) readerPageFragment.m9299X0().f29225c.mo8763g().getValue()).booleanValue()) {
                int i = wx7.f67486a[tooltipStep.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (xz7Var != null) {
                            Rect rectM9295T0 = readerPageFragment.m9295T0(xz7Var, AbstractC3184kh.m15194A(readerPageFragment.m9298W0().f29340b.mo4589b2()));
                            rectM9295T0.top -= (int) jfa.m14419b(readerPageFragment.m2090R(), 5);
                            rectM9295T0.bottom += (int) jfa.m14419b(readerPageFragment.m2090R(), 20);
                            int i2 = readerPageFragment.m2110l().getDisplayMetrics().heightPixels;
                            Rect rect = new Rect();
                            int i3 = rectM9295T0.bottom;
                            if (i3 > i2 / 2) {
                                rect.bottom = rectM9295T0.top - ((int) jfa.m14419b(readerPageFragment.m2090R(), 10));
                            } else {
                                rect.top = i3 + ((int) jfa.m14419b(readerPageFragment.m2090R(), 20));
                            }
                            C2411m c2411mM9299X0 = readerPageFragment.m9299X0();
                            Context contextM2090R = readerPageFragment.m2090R();
                            C3509qs c3509qs = readerPageFragment.f28449K0;
                            if (c3509qs != null) {
                                c2411mM9299X0.mo8775s(new y5a(tooltipStep, d8d.m10163c(tooltipStep, contextM2090R, c3509qs.m20129c())), rectM9295T0, rect, tooltipStep == TooltipStep.TapBlueWord, true, false, new zg0(tooltipStep, readerPageFragment, xz7Var, 22));
                                return xfaVar;
                            }
                            fa4.m11636J("appSettings");
                            throw null;
                        }
                    } else if (!readerPageFragment.m9298W0().mo8744P0(TooltipStep.FirstLingQ)) {
                        readerPageFragment.m9298W0().f29300N1.mo4677k(xfaVar);
                        return xfaVar;
                    }
                } else if (readerPageFragment.m9298W0().m9331k3() && readerPageFragment.m9297V0().f69727r.getVisibility() == 0) {
                    Rect rect2 = new Rect();
                    readerPageFragment.m9297V0().f69727r.getGlobalVisibleRect(rect2);
                    rect2.top -= (int) jfa.m14419b(readerPageFragment.m2090R(), 5);
                    rect2.bottom += (int) jfa.m14419b(readerPageFragment.m2090R(), 5);
                    Rect rect3 = new Rect();
                    rect3.top = rect2.top - ((int) jfa.m14419b(readerPageFragment.m2090R(), 5));
                    rect3.right = (int) jfa.m14419b(readerPageFragment.m2090R(), 10);
                    rect3.left = rect2.right + ((int) jfa.m14419b(readerPageFragment.m2090R(), 10));
                    C2412n c2412nM9298W0 = readerPageFragment.m9298W0();
                    Context contextM2090R2 = readerPageFragment.m2090R();
                    C3509qs c3509qs2 = readerPageFragment.f28449K0;
                    if (c3509qs2 != null) {
                        e7a.m10913k0(c2412nM9298W0, new y5a(tooltipStep, d8d.m10163c(tooltipStep, contextM2090R2, c3509qs2.m20129c())), rect2, rect3, false, new tx5(17), 8);
                        return xfaVar;
                    }
                    fa4.m11636J("appSettings");
                    throw null;
                }
            }
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$18(int i, ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28511b = readerPageFragment;
        this.f28512c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$18(this.f28512c, this.f28511b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$18) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28510a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28511b;
            du0 du0Var = readerPageFragment.m9299X0().f29234g0;
            C23381 c23381 = new C23381(this.f28512c, readerPageFragment, null);
            this.f28510a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23381, this) == coroutineSingletons) {
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
