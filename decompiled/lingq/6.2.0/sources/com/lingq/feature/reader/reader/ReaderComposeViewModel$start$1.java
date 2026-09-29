package com.lingq.feature.reader.reader;

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
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$start$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {360}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$start$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30122a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30123b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f30124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$start$1(C2493a c2493a, String str, Continuation continuation) {
        super(2, continuation);
        this.f30123b = c2493a;
        this.f30124c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderComposeViewModel$start$1(this.f30123b, this.f30124c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderComposeViewModel$start$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30122a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2493a c2493a = this.f30123b;
            e23 e23Var = c2493a.f30185G;
            int i2 = c2493a.f30190L;
            this.f30122a = 1;
            y95 y95Var = e23Var.f36613a;
            Object objM7311f = ((C1296l) y95Var).m7311f(this.f30124c, vz1.m23604J(new Integer(i2)), this);
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
