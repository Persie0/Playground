package com.lingq.feature.dictionary;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.lf2;
import p000.sca;
import p000.un1;
import p000.xfa;
import p000.zf2;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionaryContentViewModel$speakTerm$1", m4291f = "DictionaryContentViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionaryContentViewModel$speakTerm$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2069m f25777a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryContentViewModel$speakTerm$1(C2069m c2069m, Continuation continuation) {
        super(2, continuation);
        this.f25777a = c2069m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictionaryContentViewModel$speakTerm$1(this.f25777a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DictionaryContentViewModel$speakTerm$1 dictionaryContentViewModel$speakTerm$1 = (DictionaryContentViewModel$speakTerm$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        dictionaryContentViewModel$speakTerm$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2069m c2069m = this.f25777a;
        zf2 zf2Var = ((lf2) ((C3244l) c2069m.f25851f.f9311a).getValue()).f49582a;
        if (zf2Var != null) {
            sca.m21224J0(c2069m.f25848c, zf2Var.f71484a, false, 14);
        }
        return xfa.f68157a;
    }
}
