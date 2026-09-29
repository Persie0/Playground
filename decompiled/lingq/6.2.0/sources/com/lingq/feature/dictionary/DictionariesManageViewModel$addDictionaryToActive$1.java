package com.lingq.feature.dictionary;

import com.lingq.core.data.repository.C1292h;
import com.lingq.core.domain.model.language.DictionaryData;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vj6;
import p000.xf2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionariesManageViewModel$addDictionaryToActive$1", m4291f = "DictionariesManageViewModel.kt", m4292l = {86}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionariesManageViewModel$addDictionaryToActive$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2066j f25746b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DictionaryData f25747c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesManageViewModel$addDictionaryToActive$1(C2066j c2066j, DictionaryData dictionaryData, Continuation continuation) {
        super(2, continuation);
        this.f25746b = c2066j;
        this.f25747c = dictionaryData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictionariesManageViewModel$addDictionaryToActive$1(this.f25746b, this.f25747c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictionariesManageViewModel$addDictionaryToActive$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25745a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2066j c2066j = this.f25746b;
        vj6 vj6Var = c2066j.f25835d;
        String strMo4589b2 = c2066j.f25833b.mo4589b2();
        int i2 = this.f25747c.f19008a;
        this.f25745a = 1;
        Object objM7196b = ((C1292h) ((xf2) vj6Var.f65506b)).m7196b(i2, strMo4589b2, this);
        if (objM7196b != coroutineSingletons) {
            objM7196b = xfaVar;
        }
        return objM7196b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
