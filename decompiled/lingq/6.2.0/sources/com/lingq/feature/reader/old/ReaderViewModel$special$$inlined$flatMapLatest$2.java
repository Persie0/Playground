package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.mv0;
import p000.q05;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$flatMapLatest$2", m4291f = "ReaderViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderViewModel$special$$inlined$flatMapLatest$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f29113a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f29114b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29115c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2412n f29116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$special$$inlined$flatMapLatest$2(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f29116d = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$special$$inlined$flatMapLatest$2 readerViewModel$special$$inlined$flatMapLatest$2 = new ReaderViewModel$special$$inlined$flatMapLatest$2(this.f29116d, (Continuation) obj3);
        readerViewModel$special$$inlined$flatMapLatest$2.f29114b = (e83) obj;
        readerViewModel$special$$inlined$flatMapLatest$2.f29115c = obj2;
        return readerViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f29114b;
        Object obj2 = this.f29115c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29113a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((q05) ((C1295k) this.f29116d.f29394p).f16498b).f57071K, true, new String[]{"LessonsSimplifiedJoin"}, new mv0(((Number) obj2).intValue(), 12)));
            this.f29114b = null;
            this.f29115c = null;
            this.f29113a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM15536o, this) == coroutineSingletons) {
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
