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
import p000.xf2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$addDictionaryToActive$1", m4291f = "DictManageViewModel.kt", m4292l = {216}, m4293m = "invokeSuspend", m4294v = 2)
final class DictManageViewModel$addDictionaryToActive$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2057b f25680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DictionaryData f25681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictManageViewModel$addDictionaryToActive$1(C2057b c2057b, DictionaryData dictionaryData, Continuation continuation) {
        super(2, continuation);
        this.f25680b = c2057b;
        this.f25681c = dictionaryData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictManageViewModel$addDictionaryToActive$1(this.f25680b, this.f25681c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictManageViewModel$addDictionaryToActive$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25679a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25680b;
            xf2 xf2Var = c2057b.f25793c;
            String strMo4589b2 = c2057b.f25792b.mo4589b2();
            int i2 = this.f25681c.f19008a;
            this.f25679a = 1;
            if (((C1292h) xf2Var).m7196b(i2, strMo4589b2, this) == coroutineSingletons) {
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
