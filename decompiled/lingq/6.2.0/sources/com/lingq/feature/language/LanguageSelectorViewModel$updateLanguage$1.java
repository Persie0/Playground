package com.lingq.feature.language;

import com.lingq.core.p012ui.R$string;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.mm4;
import p000.nm4;
import p000.pm4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.language.LanguageSelectorViewModel$updateLanguage$1", m4291f = "LanguageSelectorViewModel.kt", m4292l = {126}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageSelectorViewModel$updateLanguage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26329a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2120b f26330b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectorViewModel$updateLanguage$1(C2120b c2120b, String str, Continuation continuation) {
        super(2, continuation);
        this.f26330b = c2120b;
        this.f26331c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageSelectorViewModel$updateLanguage$1(this.f26330b, this.f26331c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageSelectorViewModel$updateLanguage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        String str;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26329a;
        C2120b c2120b = this.f26330b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = c2120b.f26334d;
            do {
                value = c3244l.getValue();
                str = this.f26331c;
            } while (!c3244l.m15570h(value, new nm4(str)));
            this.f26329a = 1;
            obj = c2120b.f26332b.mo4576F1(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3244l c3244l2 = c2120b.f26334d;
        do {
            value2 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value2, zBooleanValue ? pm4.f56464a : new mm4(R$string.lingq_connect_warning)));
        return xfa.f68157a;
    }
}
