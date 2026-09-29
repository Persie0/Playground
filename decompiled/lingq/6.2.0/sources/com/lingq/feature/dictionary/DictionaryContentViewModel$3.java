package com.lingq.feature.dictionary;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.lf2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionaryContentViewModel$3", m4291f = "DictionaryContentViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionaryContentViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f25775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2069m f25776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryContentViewModel$3(C2069m c2069m, Continuation continuation) {
        super(2, continuation);
        this.f25776b = c2069m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DictionaryContentViewModel$3 dictionaryContentViewModel$3 = new DictionaryContentViewModel$3(this.f25776b, continuation);
        dictionaryContentViewModel$3.f25775a = ((Boolean) obj).booleanValue();
        return dictionaryContentViewModel$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        DictionaryContentViewModel$3 dictionaryContentViewModel$3 = (DictionaryContentViewModel$3) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        dictionaryContentViewModel$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        boolean z = this.f25775a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f25776b.f25850e;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, lf2.m16158a((lf2) value, null, null, false, null, Boolean.valueOf(z), null, false, null, 239)));
        return xfa.f68157a;
    }
}
