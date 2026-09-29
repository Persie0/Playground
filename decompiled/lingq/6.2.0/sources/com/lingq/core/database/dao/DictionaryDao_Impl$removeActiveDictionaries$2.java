package com.lingq.core.database.dao;

import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.database.dao.DictionaryDao_Impl$removeActiveDictionaries$2", m4291f = "DictionaryDao_Impl.kt", m4292l = {162}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionaryDao_Impl$removeActiveDictionaries$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1318f f16923b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f16924c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f16925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryDao_Impl$removeActiveDictionaries$2(C1318f c1318f, String str, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f16923b = c1318f;
        this.f16924c = str;
        this.f16925d = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DictionaryDao_Impl$removeActiveDictionaries$2(this.f16923b, this.f16924c, this.f16925d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((DictionaryDao_Impl$removeActiveDictionaries$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16922a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16922a = 1;
            if (C1318f.m7474z0(this.f16923b, this.f16924c, this.f16925d, this) == coroutineSingletons) {
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
