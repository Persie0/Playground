package com.lingq.feature.reader.video;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3184kh;
import p000.ap1;
import p000.c32;
import p000.cj3;
import p000.hx7;
import p000.v15;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$menuState$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$menuState$2 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f31204a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ v15 f31205b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Lesson f31206c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ap1 f31207d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2583a f31208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$menuState$2(C2583a c2583a, Continuation continuation) {
        super(5, continuation);
        this.f31208e = c2583a;
    }

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ReaderVideoComposeViewModel$menuState$2 readerVideoComposeViewModel$menuState$2 = new ReaderVideoComposeViewModel$menuState$2(this.f31208e, (Continuation) obj5);
        readerVideoComposeViewModel$menuState$2.f31204a = (String) obj;
        readerVideoComposeViewModel$menuState$2.f31205b = (v15) obj2;
        readerVideoComposeViewModel$menuState$2.f31206c = (Lesson) obj3;
        readerVideoComposeViewModel$menuState$2.f31207d = (ap1) obj4;
        return readerVideoComposeViewModel$menuState$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.f31204a;
        v15 v15Var = this.f31205b;
        Lesson lesson = this.f31206c;
        ap1 ap1Var = this.f31207d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new hx7(str, v15Var, lesson, AbstractC3184kh.m15194A(this.f31208e.f31369b.mo4589b2()), ap1Var.f7316a, ap1Var.f7317b, 48);
    }
}
