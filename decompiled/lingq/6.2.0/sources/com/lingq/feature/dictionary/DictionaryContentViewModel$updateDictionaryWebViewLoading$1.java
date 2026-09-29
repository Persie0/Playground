package com.lingq.feature.dictionary;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.lf2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionaryContentViewModel$updateDictionaryWebViewLoading$1", m4291f = "DictionaryContentViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionaryContentViewModel$updateDictionaryWebViewLoading$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2069m f25778a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f25779b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryContentViewModel$updateDictionaryWebViewLoading$1(C2069m c2069m, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f25778a = c2069m;
        this.f25779b = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictionaryContentViewModel$updateDictionaryWebViewLoading$1(this.f25778a, this.f25779b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DictionaryContentViewModel$updateDictionaryWebViewLoading$1 dictionaryContentViewModel$updateDictionaryWebViewLoading$1 = (DictionaryContentViewModel$updateDictionaryWebViewLoading$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        dictionaryContentViewModel$updateDictionaryWebViewLoading$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f25778a.f25850e;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, lf2.m16158a((lf2) value, null, null, this.f25779b, null, null, null, false, null, 251)));
        return xfa.f68157a;
    }
}
