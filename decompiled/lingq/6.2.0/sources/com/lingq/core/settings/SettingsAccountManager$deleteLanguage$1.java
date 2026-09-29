package com.lingq.core.settings;

import com.lingq.core.domain.language.C1377a;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cg7;
import p000.k09;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsAccountManager$deleteLanguage$1", m4291f = "SettingsAccountManager.kt", m4292l = {94}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsAccountManager$deleteLanguage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k09 f22641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f22642c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cg7 f22643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsAccountManager$deleteLanguage$1(k09 k09Var, String str, cg7 cg7Var, Continuation continuation) {
        super(2, continuation);
        this.f22641b = k09Var;
        this.f22642c = str;
        this.f22643d = cg7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsAccountManager$deleteLanguage$1(this.f22641b, this.f22642c, this.f22643d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsAccountManager$deleteLanguage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22640a;
        cg7 cg7Var = this.f22643d;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C1377a c1377a = this.f22641b.f46514j;
                String str = this.f22642c;
                this.f22640a = 1;
                obj = c1377a.m7983a(str, this);
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
            Language language = (Language) obj;
            cg7Var.invoke(language != null ? language.f19024a : null);
        } catch (Exception unused) {
            cg7Var.invoke(null);
        }
        return xfa.f68157a;
    }
}
