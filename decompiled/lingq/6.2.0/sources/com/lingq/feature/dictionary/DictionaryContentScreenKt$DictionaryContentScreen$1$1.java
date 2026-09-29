package com.lingq.feature.dictionary;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.ld9;
import p000.lf2;
import p000.pa2;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionaryContentScreenKt$DictionaryContentScreen$1$1", m4291f = "DictionaryContentScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionaryContentScreenKt$DictionaryContentScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ld9 f25764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f25765b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2069m f25766c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f25767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryContentScreenKt$DictionaryContentScreen$1$1(ld9 ld9Var, vi3 vi3Var, C2069m c2069m, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f25764a = ld9Var;
        this.f25765b = vi3Var;
        this.f25766c = c2069m;
        this.f25767d = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictionaryContentScreenKt$DictionaryContentScreen$1$1(this.f25764a, this.f25765b, this.f25766c, this.f25767d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DictionaryContentScreenKt$DictionaryContentScreen$1$1 dictionaryContentScreenKt$DictionaryContentScreen$1$1 = (DictionaryContentScreenKt$DictionaryContentScreen$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        dictionaryContentScreenKt$DictionaryContentScreen$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        t66 t66Var = this.f25767d;
        if (((lf2) t66Var.getValue()).f49588g) {
            ld9 ld9Var = this.f25764a;
            if (ld9Var != null) {
                ((pa2) ld9Var).m19004a();
            }
            this.f25765b.invoke(((lf2) t66Var.getValue()).f49589h);
            C3244l c3244l = this.f25766c.f25850e;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, lf2.m16158a((lf2) value, null, null, false, null, null, null, false, null, 63)));
        }
        return xfa.f68157a;
    }
}
