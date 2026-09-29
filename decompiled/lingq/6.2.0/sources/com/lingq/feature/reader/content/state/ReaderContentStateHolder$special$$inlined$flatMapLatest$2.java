package com.lingq.feature.reader.content.state;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$flatMapLatest$2", m4291f = "ReaderContentStateHolder.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderContentStateHolder$special$$inlined$flatMapLatest$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f28032a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28033b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f28034c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2264a f28035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$special$$inlined$flatMapLatest$2(C2264a c2264a, Continuation continuation) {
        super(3, continuation);
        this.f28035d = c2264a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderContentStateHolder$special$$inlined$flatMapLatest$2 readerContentStateHolder$special$$inlined$flatMapLatest$2 = new ReaderContentStateHolder$special$$inlined$flatMapLatest$2(this.f28035d, (Continuation) obj3);
        readerContentStateHolder$special$$inlined$flatMapLatest$2.f28033b = (e83) obj;
        readerContentStateHolder$special$$inlined$flatMapLatest$2.f28034c = obj2;
        return readerContentStateHolder$special$$inlined$flatMapLatest$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f28033b;
        Object obj2 = this.f28034c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28032a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Pair pair = (Pair) obj2;
            c83 c83VarM8214a = this.f28035d.f28121j.m8214a(((Number) pair.f47623a).intValue(), (String) pair.f47624b);
            this.f28033b = null;
            this.f28034c = null;
            this.f28032a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM8214a, this) == coroutineSingletons) {
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
