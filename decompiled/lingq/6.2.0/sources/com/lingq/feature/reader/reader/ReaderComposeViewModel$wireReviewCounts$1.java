package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.dd8;
import p000.dj3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$wireReviewCounts$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$wireReviewCounts$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f30134a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f30135b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f30136c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f30137d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f30138e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2493a f30139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$wireReviewCounts$1(C2493a c2493a, Continuation continuation) {
        super(6, continuation);
        this.f30139f = c2493a;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) throws Throwable {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        int iIntValue5 = ((Number) obj5).intValue();
        ReaderComposeViewModel$wireReviewCounts$1 readerComposeViewModel$wireReviewCounts$1 = new ReaderComposeViewModel$wireReviewCounts$1(this.f30139f, (Continuation) obj6);
        readerComposeViewModel$wireReviewCounts$1.f30134a = iIntValue;
        readerComposeViewModel$wireReviewCounts$1.f30135b = iIntValue2;
        readerComposeViewModel$wireReviewCounts$1.f30136c = iIntValue3;
        readerComposeViewModel$wireReviewCounts$1.f30137d = iIntValue4;
        readerComposeViewModel$wireReviewCounts$1.f30138e = iIntValue5;
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$wireReviewCounts$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        int i = this.f30134a;
        int i2 = this.f30135b;
        int i3 = this.f30136c;
        int i4 = this.f30137d;
        int i5 = this.f30138e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f30139f.f30222l.f30310c;
        do {
            value = c3244l.getValue();
            ((dd8) value).getClass();
        } while (!c3244l.m15570h(value, new dd8(i, i2, i3, i4, i5)));
        return xfa.f68157a;
    }
}
