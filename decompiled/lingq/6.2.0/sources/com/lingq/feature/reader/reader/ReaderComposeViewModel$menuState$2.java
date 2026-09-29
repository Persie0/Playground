package com.lingq.feature.reader.reader;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.a89;
import p000.ap1;
import p000.c32;
import p000.dj3;
import p000.hx7;
import p000.v15;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$menuState$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$menuState$2 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f29967a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ v15 f29968b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Pair f29969c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ a89 f29970d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ ap1 f29971e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2493a f29972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$menuState$2(C2493a c2493a, Continuation continuation) {
        super(6, continuation);
        this.f29972f = c2493a;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ReaderComposeViewModel$menuState$2 readerComposeViewModel$menuState$2 = new ReaderComposeViewModel$menuState$2(this.f29972f, (Continuation) obj6);
        readerComposeViewModel$menuState$2.f29967a = (String) obj;
        readerComposeViewModel$menuState$2.f29968b = (v15) obj2;
        readerComposeViewModel$menuState$2.f29969c = (Pair) obj3;
        readerComposeViewModel$menuState$2.f29970d = (a89) obj4;
        readerComposeViewModel$menuState$2.f29971e = (ap1) obj5;
        return readerComposeViewModel$menuState$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.f29967a;
        v15 v15Var = this.f29968b;
        Pair pair = this.f29969c;
        a89 a89Var = this.f29970d;
        ap1 ap1Var = this.f29971e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new hx7(str, v15Var, (Lesson) pair.f47623a, ((Boolean) pair.f47624b).booleanValue(), a89Var, this.f29972f.f30230t.f30499h.mo4581L0(), ap1Var.f7316a, ap1Var.f7317b);
    }
}
