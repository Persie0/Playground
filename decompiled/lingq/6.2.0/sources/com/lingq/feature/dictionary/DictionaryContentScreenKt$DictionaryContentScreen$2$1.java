package com.lingq.feature.dictionary;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.lf2;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zf2;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionaryContentScreenKt$DictionaryContentScreen$2$1", m4291f = "DictionaryContentScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionaryContentScreenKt$DictionaryContentScreen$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2069m f25768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zf2 f25769b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f25770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryContentScreenKt$DictionaryContentScreen$2$1(C2069m c2069m, zf2 zf2Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f25768a = c2069m;
        this.f25769b = zf2Var;
        this.f25770c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictionaryContentScreenKt$DictionaryContentScreen$2$1(this.f25768a, this.f25769b, this.f25770c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DictionaryContentScreenKt$DictionaryContentScreen$2$1 dictionaryContentScreenKt$DictionaryContentScreen$2$1 = (DictionaryContentScreenKt$DictionaryContentScreen$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        dictionaryContentScreenKt$DictionaryContentScreen$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        zf2 zf2Var = this.f25769b;
        zf2Var.getClass();
        String str = this.f25770c;
        str.getClass();
        C2069m c2069m = this.f25768a;
        C3244l c3244l = c2069m.f25850e;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, lf2.m16158a((lf2) value, zf2Var, vz1.m23609O(str, c2069m.f25847b.mo4589b2()), false, "", null, null, false, null, 244)));
        return xfa.f68157a;
    }
}
