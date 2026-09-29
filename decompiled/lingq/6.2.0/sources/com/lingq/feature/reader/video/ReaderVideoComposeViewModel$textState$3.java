package com.lingq.feature.reader.video;

import com.lingq.core.domain.store.AudioUnderlineMode;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3184kh;
import p000.bx7;
import p000.c32;
import p000.dj3;
import p000.f00;
import p000.iy7;
import p000.wz7;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$textState$3", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$textState$3 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Integer f31314a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Integer f31315b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ bx7 f31316c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ f00 f31317d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Pair f31318e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2583a f31319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$textState$3(C2583a c2583a, Continuation continuation) {
        super(6, continuation);
        this.f31319f = c2583a;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ReaderVideoComposeViewModel$textState$3 readerVideoComposeViewModel$textState$3 = new ReaderVideoComposeViewModel$textState$3(this.f31319f, (Continuation) obj6);
        readerVideoComposeViewModel$textState$3.f31314a = (Integer) obj;
        readerVideoComposeViewModel$textState$3.f31315b = (Integer) obj2;
        readerVideoComposeViewModel$textState$3.f31316c = (bx7) obj3;
        readerVideoComposeViewModel$textState$3.f31317d = (f00) obj4;
        readerVideoComposeViewModel$textState$3.f31318e = (Pair) obj5;
        return readerVideoComposeViewModel$textState$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num = this.f31314a;
        Integer num2 = this.f31315b;
        bx7 bx7Var = this.f31316c;
        f00 f00Var = this.f31317d;
        Pair pair = this.f31318e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        AudioUnderlineMode audioUnderlineMode = (AudioUnderlineMode) pair.f47623a;
        boolean zBooleanValue = ((Boolean) pair.f47624b).booleanValue();
        String strMo4589b2 = this.f31319f.f31369b.mo4589b2();
        xz7 xz7Var = bx7Var.f9137a;
        Integer num3 = xz7Var != null ? new Integer(xz7Var.f69009f) : null;
        iy7 iy7Var = bx7Var.f9138b;
        return new wz7(num, num2, num3, iy7Var != null ? new Integer(iy7Var.f44780b) : null, f00Var, audioUnderlineMode, zBooleanValue, strMo4589b2, AbstractC3184kh.m15194A(strMo4589b2));
    }
}
