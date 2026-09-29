package com.lingq.feature.reader.rating.p016ui;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.rating.ui.RatingDailogKt$RatingSelection$1$1", m4291f = "RatingDailog.kt", m4292l = {126}, m4293m = "invokeSuspend", m4294v = 2)
final class RatingDailogKt$RatingSelection$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29915a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f29916b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f29917c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f29918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingDailogKt$RatingSelection$1$1(vi3 vi3Var, t66 t66Var, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f29916b = vi3Var;
        this.f29917c = t66Var;
        this.f29918d = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RatingDailogKt$RatingSelection$1$1(this.f29916b, this.f29917c, this.f29918d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RatingDailogKt$RatingSelection$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29915a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f29915a = 1;
            if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        boolean zBooleanValue = ((Boolean) this.f29917c.getValue()).booleanValue();
        vi3 vi3Var = this.f29916b;
        if (zBooleanValue) {
            vi3Var.invoke(Boolean.TRUE);
        }
        if (((Boolean) this.f29918d.getValue()).booleanValue()) {
            vi3Var.invoke(Boolean.FALSE);
        }
        return xfa.f68157a;
    }
}
