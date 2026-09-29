package com.lingq.feature.reader.video;

import com.lingq.core.data.repository.C1296l;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e23;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$3", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {354}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31176a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$3(C2583a c2583a, String str, Continuation continuation) {
        super(2, continuation);
        this.f31177b = c2583a;
        this.f31178c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$3(this.f31177b, this.f31178c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31176a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2583a c2583a = this.f31177b;
            e23 e23Var = c2583a.f31387t;
            int i2 = c2583a.f31348G;
            this.f31176a = 1;
            y95 y95Var = e23Var.f36613a;
            Object objM7311f = ((C1296l) y95Var).m7311f(this.f31178c, vz1.m23604J(new Integer(i2)), this);
            if (objM7311f != coroutineSingletons) {
                objM7311f = xfaVar;
            }
            if (objM7311f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
