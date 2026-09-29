package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
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
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$flatMapLatest$5", m4291f = "ReaderViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderViewModel$special$$inlined$flatMapLatest$5 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f29129a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f29130b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29131c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2412n f29132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$special$$inlined$flatMapLatest$5(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f29132d = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$special$$inlined$flatMapLatest$5 readerViewModel$special$$inlined$flatMapLatest$5 = new ReaderViewModel$special$$inlined$flatMapLatest$5(this.f29132d, (Continuation) obj3);
        readerViewModel$special$$inlined$flatMapLatest$5.f29130b = (e83) obj;
        readerViewModel$special$$inlined$flatMapLatest$5.f29131c = obj2;
        return readerViewModel$special$$inlined$flatMapLatest$5.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f29130b;
        Object obj2 = this.f29131c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29129a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM7315j = ((C1296l) this.f29132d.f29412v).m7315j(((Lesson) obj2).f19149h);
            this.f29130b = null;
            this.f29131c = null;
            this.f29129a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7315j, this) == coroutineSingletons) {
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
