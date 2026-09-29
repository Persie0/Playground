package com.lingq.core.p012ui.chart;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.fda;
import p000.ic5;
import p000.sc9;
import p000.ss5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.chart.LineChartKt$LineChart$3$1", m4291f = "LineChart.kt", m4292l = {77, 81, 82, 85}, m4293m = "invokeSuspend", m4294v = 2)
final class LineChartKt$LineChart$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23952a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f23953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ic5 f23954c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sc9 f23955d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ sc9 f23956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineChartKt$LineChart$3$1(C0059a c0059a, ic5 ic5Var, sc9 sc9Var, sc9 sc9Var2, Continuation continuation) {
        super(2, continuation);
        this.f23953b = c0059a;
        this.f23954c = ic5Var;
        this.f23955d = sc9Var;
        this.f23956e = sc9Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LineChartKt$LineChart$3$1(this.f23953b, this.f23954c, this.f23955d, this.f23956e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LineChartKt$LineChart$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Float f;
        fda fdaVarM21703b0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23952a;
        xfa xfaVar = xfa.f68157a;
        sc9 sc9Var = this.f23956e;
        sc9 sc9Var2 = this.f23955d;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                this.f23952a = 3;
                if (AbstractC3208a.m15437d(50L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i == 4) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            sc9Var.m21223i(sc9Var2.m21222h());
            f = new Float(12.0f);
            fdaVarM21703b0 = ss5.m21703b0(100, 0, null, 6);
            this.f23952a = 4;
            if (C0059a.m744c(this.f23953b, f, fdaVarM21703b0, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        AbstractC3193b.m15359b(obj);
        if (sc9Var2.m21222h() == -1) {
            sc9Var.m21223i(-1);
            Float f2 = new Float(0.0f);
            fda fdaVarM21703b1 = ss5.m21703b0(0, 0, null, 6);
            this.f23952a = 1;
            if (C0059a.m744c(this.f23953b, f2, fdaVarM21703b1, null, this, 12) != coroutineSingletons) {
                return xfaVar;
            }
        } else if (sc9Var.m21222h() != -1) {
            Float f3 = new Float(0.0f);
            fda fdaVarM21703b2 = ss5.m21703b0(100, 0, null, 6);
            this.f23952a = 2;
            if (C0059a.m744c(this.f23953b, f3, fdaVarM21703b2, null, this, 12) != coroutineSingletons) {
                this.f23952a = 3;
                if (AbstractC3208a.m15437d(50L, this) != coroutineSingletons) {
                    sc9Var.m21223i(sc9Var2.m21222h());
                    f = new Float(12.0f);
                    fdaVarM21703b0 = ss5.m21703b0(100, 0, null, 6);
                    this.f23952a = 4;
                    if (C0059a.m744c(this.f23953b, f, fdaVarM21703b0, null, this, 12) == coroutineSingletons) {
                        return xfaVar;
                    }
                }
            }
        } else {
            sc9Var.m21223i(sc9Var2.m21222h());
            f = new Float(12.0f);
            fdaVarM21703b0 = ss5.m21703b0(100, 0, null, 6);
            this.f23952a = 4;
            if (C0059a.m744c(this.f23953b, f, fdaVarM21703b0, null, this, 12) == coroutineSingletons) {
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }
}
