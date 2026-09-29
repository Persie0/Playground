package com.lingq.feature.reader.reader;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.o23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$onPageChanged$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {1082}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$onPageChanged$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30071a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30072b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$onPageChanged$1(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30072b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderComposeViewModel$onPageChanged$1(this.f30072b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderComposeViewModel$onPageChanged$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30071a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2493a c2493a = this.f30072b;
            o23 o23Var = c2493a.f30234x;
            String strMo4589b2 = c2493a.f30206b.mo4589b2();
            int i2 = c2493a.f30190L;
            this.f30071a = 1;
            Object objM7300t = ((C1295k) o23Var.f53649a).m7300t(i2, strMo4589b2, this);
            if (objM7300t != coroutineSingletons) {
                objM7300t = xfaVar;
            }
            if (objM7300t == coroutineSingletons) {
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
