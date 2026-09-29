package com.lingq.feature.dictionary;

import com.lingq.core.data.repository.C1292h;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.nt0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionariesManageViewModel$changePosition$1", m4291f = "DictionariesManageViewModel.kt", m4292l = {92}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionariesManageViewModel$changePosition$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25752a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2066j f25753b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25754c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f25755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesManageViewModel$changePosition$1(C2066j c2066j, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f25753b = c2066j;
        this.f25754c = i;
        this.f25755d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictionariesManageViewModel$changePosition$1(this.f25753b, this.f25754c, this.f25755d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictionariesManageViewModel$changePosition$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25752a;
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
        C2066j c2066j = this.f25753b;
        nt0 nt0Var = c2066j.f25837f;
        String strMo4589b2 = c2066j.f25833b.mo4589b2();
        this.f25752a = 1;
        Object objM7197c = ((C1292h) nt0Var.f53228a).m7197c(this.f25754c, this.f25755d, strMo4589b2, this);
        if (objM7197c != coroutineSingletons) {
            objM7197c = xfaVar;
        }
        return objM7197c == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
