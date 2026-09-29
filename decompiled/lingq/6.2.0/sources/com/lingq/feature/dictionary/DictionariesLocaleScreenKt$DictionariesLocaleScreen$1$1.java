package com.lingq.feature.dictionary;

import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1", m4291f = "DictionariesLocaleScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2061e f25711a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f25712b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f25713c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TokenMeaning f25714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1(C2061e c2061e, String str, String str2, TokenMeaning tokenMeaning, Continuation continuation) {
        super(2, continuation);
        this.f25711a = c2061e;
        this.f25712b = str;
        this.f25713c = str2;
        this.f25714d = tokenMeaning;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1(this.f25711a, this.f25712b, this.f25713c, this.f25714d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1 dictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1 = (DictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        dictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = this.f25712b;
        str.getClass();
        String str2 = this.f25713c;
        str2.getClass();
        TokenMeaning tokenMeaning = this.f25714d;
        tokenMeaning.getClass();
        C2061e c2061e = this.f25711a;
        C3244l c3244l = c2061e.f25819f;
        c3244l.getClass();
        c3244l.m15572j(null, str);
        C3244l c3244l2 = c2061e.f25820g;
        c3244l2.getClass();
        c3244l2.m15572j(null, str2);
        C3244l c3244l3 = c2061e.f25821h;
        c3244l3.getClass();
        c3244l3.m15572j(null, tokenMeaning);
        return xfa.f68157a;
    }
}
