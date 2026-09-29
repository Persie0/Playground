package com.lingq.feature.reader.stats.p019ui.components;

import androidx.compose.animation.core.C0059a;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p000.C3386nv;
import p000.c32;
import p000.do4;
import p000.kk8;
import p000.mn5;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.components.LynxCoachCardKt$LynxCoachMessage$1$1", m4291f = "LynxCoachCard.kt", m4292l = {382, 387}, m4293m = "invokeSuspend", m4294v = 2)
final class LynxCoachCardKt$LynxCoachMessage$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30979a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mn5 f30980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f30981c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0059a f30982d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f30983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxCoachCardKt$LynxCoachMessage$1$1(mn5 mn5Var, String str, C0059a c0059a, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f30980b = mn5Var;
        this.f30981c = str;
        this.f30982d = c0059a;
        this.f30983e = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LynxCoachCardKt$LynxCoachMessage$1$1(this.f30980b, this.f30981c, this.f30982d, this.f30983e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LynxCoachCardKt$LynxCoachMessage$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30979a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        boolean z = this.f30980b.f51561c;
        C0059a c0059a = this.f30982d;
        if (!z || this.f30981c.length() == 0) {
            Float f = new Float(1.0f);
            this.f30979a = 1;
            if (c0059a.m747f(f, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        kk8 kk8VarM1264n = AbstractC0278f.m1264n(new do4(11, this.f30983e));
        C2557a c2557a = new C2557a(c0059a, ref$IntRef);
        this.f30979a = 2;
        if (kk8VarM1264n.collect(c2557a, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
