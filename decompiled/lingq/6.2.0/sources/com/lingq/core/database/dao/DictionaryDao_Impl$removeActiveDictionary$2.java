package com.lingq.core.database.dao;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.DictionaryDao_Impl$removeActiveDictionary$2", m4291f = "DictionaryDao_Impl.kt", m4292l = {158}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionaryDao_Impl$removeActiveDictionary$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16926a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1318f f16927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f16928c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f16929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryDao_Impl$removeActiveDictionary$2(C1318f c1318f, int i, String str, Continuation continuation) {
        super(1, continuation);
        this.f16927b = c1318f;
        this.f16928c = i;
        this.f16929d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DictionaryDao_Impl$removeActiveDictionary$2(this.f16927b, this.f16928c, this.f16929d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((DictionaryDao_Impl$removeActiveDictionary$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16926a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16926a = 1;
            if (C1318f.m7473B0(this.f16927b, this.f16928c, this.f16929d, this) == coroutineSingletons) {
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
