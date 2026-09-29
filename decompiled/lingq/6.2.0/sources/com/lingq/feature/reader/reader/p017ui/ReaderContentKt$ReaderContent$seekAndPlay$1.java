package com.lingq.feature.reader.reader.p017ui;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.lbb;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ui.ReaderContentKt$ReaderContent$seekAndPlay$1", m4291f = "ReaderContent.kt", m4292l = {171}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentKt$ReaderContent$seekAndPlay$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f30355b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentKt$ReaderContent$seekAndPlay$1(t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f30355b = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderContentKt$ReaderContent$seekAndPlay$1(this.f30355b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderContentKt$ReaderContent$seekAndPlay$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30354a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f30354a = 1;
            if (AbstractC3208a.m15437d(150L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f30355b.setValue(lbb.f49418a);
        return xfa.f68157a;
    }
}
