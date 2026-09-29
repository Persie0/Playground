package com.lingq.feature.reader.reader.state;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.dd8;
import p000.rd8;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.state.ReaderReviewStateHolder$reviewMenuState$1", m4291f = "ReaderReviewStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderReviewStateHolder$reviewMenuState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ rd8 f30285a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ dd8 f30286b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderReviewStateHolder$reviewMenuState$1 readerReviewStateHolder$reviewMenuState$1 = new ReaderReviewStateHolder$reviewMenuState$1(3, (Continuation) obj3);
        readerReviewStateHolder$reviewMenuState$1.f30285a = (rd8) obj;
        readerReviewStateHolder$reviewMenuState$1.f30286b = (dd8) obj2;
        return readerReviewStateHolder$reviewMenuState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        rd8 rd8Var = this.f30285a;
        dd8 dd8Var = this.f30286b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new rd8(rd8Var.f59118a, rd8Var.f59119b, rd8Var.f59120c, dd8Var.f35449a, dd8Var.f35450b, dd8Var.f35451c, dd8Var.f35452d, dd8Var.f35453e);
    }
}
