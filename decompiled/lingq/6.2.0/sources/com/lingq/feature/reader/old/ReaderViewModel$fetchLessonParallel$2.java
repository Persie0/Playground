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
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$fetchLessonParallel$2", m4291f = "ReaderViewModel.kt", m4292l = {1166}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$fetchLessonParallel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f28942c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f28943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$fetchLessonParallel$2(int i, C2412n c2412n, String str, Continuation continuation) {
        super(2, continuation);
        this.f28941b = c2412n;
        this.f28942c = str;
        this.f28943d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$fetchLessonParallel$2(this.f28943d, this.f28941b, this.f28942c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$fetchLessonParallel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28940a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            o23 o23Var = this.f28941b.f29259A;
            this.f28940a = 1;
            if (((C1295k) o23Var.f53649a).m7303w(this.f28943d, this.f28942c, this) == coroutineSingletons) {
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
