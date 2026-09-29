package com.lingq.feature.reader.old;

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
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$handleLessonLoadSuccess$3", m4291f = "ReaderViewModel.kt", m4292l = {1200}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$handleLessonLoadSuccess$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28967a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28968b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$handleLessonLoadSuccess$3(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28968b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$handleLessonLoadSuccess$3(this.f28968b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$handleLessonLoadSuccess$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28967a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28968b;
            o23 o23Var = c2412n.f29259A;
            String strMo4589b2 = c2412n.f29340b.mo4589b2();
            int iM9332l3 = c2412n.m9332l3();
            this.f28967a = 1;
            if (((C1295k) o23Var.f53649a).m7303w(iM9332l3, strMo4589b2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
