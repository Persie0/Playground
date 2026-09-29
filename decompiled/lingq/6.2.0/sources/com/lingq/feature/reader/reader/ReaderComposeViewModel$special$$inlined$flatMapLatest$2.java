package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.ap1;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.i83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$flatMapLatest$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderComposeViewModel$special$$inlined$flatMapLatest$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30087a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30088b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30089c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2493a f30090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$special$$inlined$flatMapLatest$2(C2493a c2493a, Continuation continuation) {
        super(3, continuation);
        this.f30090d = c2493a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderComposeViewModel$special$$inlined$flatMapLatest$2 readerComposeViewModel$special$$inlined$flatMapLatest$2 = new ReaderComposeViewModel$special$$inlined$flatMapLatest$2(this.f30090d, (Continuation) obj3);
        readerComposeViewModel$special$$inlined$flatMapLatest$2.f30088b = (e83) obj;
        readerComposeViewModel$special$$inlined$flatMapLatest$2.f30089c = obj2;
        return readerComposeViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c83 i83Var;
        e83 e83Var = this.f30088b;
        Object obj2 = this.f30089c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30087a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Integer num = (Integer) obj2;
            if (num == null || num.intValue() <= 0) {
                i83Var = new i83(new ap1(false, false), 1);
            } else {
                C2493a c2493a = this.f30090d;
                i83Var = c2493a.f30180B.m9399a(num.intValue(), c2493a.f30206b.mo4589b2());
            }
            this.f30088b = null;
            this.f30089c = null;
            this.f30087a = 1;
            if (AbstractC3224d.m15537p(e83Var, i83Var, this) == coroutineSingletons) {
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
