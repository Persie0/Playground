package com.lingq.feature.challenges.cup;

import androidx.compose.material3.C0232g0;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lv1;
import p000.su1;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupScreenKt$CupScreen$2$1", m4291f = "CupScreen.kt", m4292l = {106}, m4293m = "invokeSuspend", m4294v = 2)
final class CupScreenKt$CupScreen$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24612a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lv1 f24613b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0232g0 f24614c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f24615d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f24616e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupScreenKt$CupScreen$2$1(lv1 lv1Var, C0232g0 c0232g0, String str, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f24613b = lv1Var;
        this.f24614c = c0232g0;
        this.f24615d = str;
        this.f24616e = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupScreenKt$CupScreen$2$1(this.f24613b, this.f24614c, this.f24615d, this.f24616e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupScreenKt$CupScreen$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CupScreenKt$CupScreen$2$1 cupScreenKt$CupScreen$2$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24612a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (this.f24613b.f50180k) {
                this.f24612a = 1;
                cupScreenKt$CupScreen$2$1 = this;
                if (C0232g0.m1155b(this.f24614c, this.f24615d, null, null, cupScreenKt$CupScreen$2$1, 14) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        cupScreenKt$CupScreen$2$1 = this;
        cupScreenKt$CupScreen$2$1.f24616e.invoke(su1.f61407a);
        return xfa.f68157a;
    }
}
