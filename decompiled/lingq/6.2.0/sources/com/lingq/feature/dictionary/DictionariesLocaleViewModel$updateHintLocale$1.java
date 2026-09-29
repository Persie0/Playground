package com.lingq.feature.dictionary;

import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.feature.dictionary.domain.C2060a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionariesLocaleViewModel$updateHintLocale$1", m4291f = "DictionariesLocaleViewModel.kt", m4292l = {63}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionariesLocaleViewModel$updateHintLocale$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2061e f25719b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f25720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesLocaleViewModel$updateHintLocale$1(C2061e c2061e, String str, Continuation continuation) {
        super(2, continuation);
        this.f25719b = c2061e;
        this.f25720c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictionariesLocaleViewModel$updateHintLocale$1(this.f25719b, this.f25720c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictionariesLocaleViewModel$updateHintLocale$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25718a;
        C2061e c2061e = this.f25719b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            TokenMeaning tokenMeaning = (TokenMeaning) c2061e.f25821h.getValue();
            if (tokenMeaning != null) {
                C2060a c2060a = c2061e.f25816c;
                String str = (String) c2061e.f25819f.getValue();
                String str2 = (String) c2061e.f25820g.getValue();
                String strMo4589b2 = c2061e.f25815b.mo4589b2();
                this.f25718a = 1;
                if (c2060a.m8977a(str, this.f25720c, tokenMeaning, str2, strMo4589b2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3244l c3244l = c2061e.f25818e;
        do {
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.TRUE));
        return xfa.f68157a;
    }
}
