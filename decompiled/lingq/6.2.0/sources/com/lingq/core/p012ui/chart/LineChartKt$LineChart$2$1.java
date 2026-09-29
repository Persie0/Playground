package com.lingq.core.p012ui.chart;

import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.gq6;
import p000.ic5;
import p000.qc9;
import p000.sc9;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.chart.LineChartKt$LineChart$2$1", m4291f = "LineChart.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LineChartKt$LineChart$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ic5 f23947a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f23948b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f23949c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qc9 f23950d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ sc9 f23951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineChartKt$LineChart$2$1(ic5 ic5Var, vi3 vi3Var, t66 t66Var, qc9 qc9Var, sc9 sc9Var, Continuation continuation) {
        super(2, continuation);
        this.f23947a = ic5Var;
        this.f23948b = vi3Var;
        this.f23949c = t66Var;
        this.f23950d = qc9Var;
        this.f23951e = sc9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LineChartKt$LineChart$2$1(this.f23947a, this.f23948b, this.f23949c, this.f23950d, this.f23951e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LineChartKt$LineChart$2$1 lineChartKt$LineChart$2$1 = (LineChartKt$LineChart$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lineChartKt$LineChart$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList = this.f23947a.f43926a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        t66 t66Var = this.f23949c;
        if ((((gq6) t66Var.getValue()).f41189a & 9223372034707292159L) != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (((gq6) t66Var.getValue()).f41189a >> 32));
            float fM19861h = this.f23950d.m19861h();
            int size = arrayList.size();
            float f = 0.0f;
            int i = 0;
            if (fIntBitsToFloat > 0.0f) {
                if (fIntBitsToFloat >= fM19861h) {
                    i = size - 1;
                } else {
                    float f2 = fM19861h / size;
                    if (size != 2) {
                        float f3 = (fM19861h - f2) / (size - 2);
                        while (f < fIntBitsToFloat) {
                            f += (i == 0 || i == size + (-1)) ? f2 / 2.0f : f3;
                            i++;
                        }
                        i--;
                    } else if (fIntBitsToFloat >= f2) {
                        i = 1;
                    }
                }
            }
            sc9 sc9Var = this.f23951e;
            sc9Var.m21223i(i);
            this.f23948b.invoke(arrayList.get(sc9Var.m21222h()));
        }
        return xfa.f68157a;
    }
}
