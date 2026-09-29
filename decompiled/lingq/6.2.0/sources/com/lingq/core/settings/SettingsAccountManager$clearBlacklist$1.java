package com.lingq.core.settings;

import com.lingq.core.data.repository.C1286b;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.hi8;
import p000.k09;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsAccountManager$clearBlacklist$1", m4291f = "SettingsAccountManager.kt", m4292l = {60}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsAccountManager$clearBlacklist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k09 f22634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsAccountManager$clearBlacklist$1(k09 k09Var, Continuation continuation) {
        super(2, continuation);
        this.f22634b = k09Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsAccountManager$clearBlacklist$1(this.f22634b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsAccountManager$clearBlacklist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22633a;
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
        k09 k09Var = this.f22634b;
        hi8 hi8Var = k09Var.f46512h;
        cma cmaVar = k09Var.f46516l;
        Language language = (Language) cmaVar.mo4572B0().getValue();
        int i2 = language != null ? language.f19025b : 0;
        String strMo4589b2 = cmaVar.mo4589b2();
        this.f22633a = 1;
        Object objM7101c = ((C1286b) hi8Var.f42410b).m7101c(i2, strMo4589b2, this);
        if (objM7101c != coroutineSingletons) {
            objM7101c = xfaVar;
        }
        return objM7101c == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
