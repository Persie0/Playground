package com.lingq.core.settings;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.settings.domain.C1863b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.sca;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$1", m4291f = "ReaderSettingsViewModel.kt", m4292l = {114}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1859b f22566b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$1(C1859b c1859b, Continuation continuation) {
        super(2, continuation);
        this.f22566b = c1859b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSettingsViewModel$1(this.f22566b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSettingsViewModel$1) create((Language) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22565a;
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
        C1863b c1863b = this.f22566b.f22732n;
        this.f22565a = 1;
        ((sca) c1863b.f22922c).mo8485c2();
        return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
