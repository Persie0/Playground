package com.lingq.feature.reader.pagination;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.jn8;
import p000.ox9;
import p000.ph2;
import p000.t45;
import p000.u65;
import p000.un1;
import p000.v72;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.pagination.PageCalculatorKt$PageCalculator$3$1", m4291f = "PageCalculator.kt", m4292l = {88}, m4293m = "invokeSuspend", m4294v = 2)
final class PageCalculatorKt$PageCalculator$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ u65 f29703H;

    /* JADX INFO: renamed from: a */
    public int f29704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f29705b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f29706c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f29707d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f29708e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f29709f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vi3 f29710g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f29711h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f29712i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ox9 f29713j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ jn8 f29714k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Map f29715l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageCalculatorKt$PageCalculator$3$1(long j, int i, int i2, int i3, int i4, vi3 vi3Var, Context context, String str, ox9 ox9Var, jn8 jn8Var, Map map, u65 u65Var, Continuation continuation) {
        super(2, continuation);
        this.f29705b = j;
        this.f29706c = i;
        this.f29707d = i2;
        this.f29708e = i3;
        this.f29709f = i4;
        this.f29710g = vi3Var;
        this.f29711h = context;
        this.f29712i = str;
        this.f29713j = ox9Var;
        this.f29714k = jn8Var;
        this.f29715l = map;
        this.f29703H = u65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PageCalculatorKt$PageCalculator$3$1(this.f29705b, this.f29706c, this.f29707d, this.f29708e, this.f29709f, this.f29710g, this.f29711h, this.f29712i, this.f29713j, this.f29714k, this.f29715l, this.f29703H, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PageCalculatorKt$PageCalculator$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29704a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            long j = this.f29705b;
            t45 t45Var = new t45((int) (j >> 32), (int) (j & 4294967295L), this.f29706c, this.f29707d, this.f29708e, this.f29709f);
            v72 v72Var = ph2.f56212a;
            PageCalculatorKt$PageCalculator$3$1$pages$1 pageCalculatorKt$PageCalculator$3$1$pages$1 = new PageCalculatorKt$PageCalculator$3$1$pages$1(this.f29711h, this.f29712i, t45Var, this.f29713j, this.f29714k, this.f29715l, this.f29703H, null);
            this.f29704a = 1;
            obj = wfb.m23905G(pageCalculatorKt$PageCalculator$3$1$pages$1, v72Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f29710g.invoke((List) obj);
        return xfa.f68157a;
    }
}
