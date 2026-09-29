package com.lingq.core.settings;

import com.lingq.core.settings.domain.C1863b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$4", m4291f = "ReaderSettingsViewModel.kt", m4292l = {128}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1859b f22572b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$4(C1859b c1859b, Continuation continuation) {
        super(2, continuation);
        this.f22572b = c1859b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSettingsViewModel$4(this.f22572b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSettingsViewModel$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22571a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1859b c1859b = this.f22572b;
            C1863b c1863b = c1859b.f22732n;
            String strMo4589b2 = c1859b.f22720b.mo4589b2();
            this.f22571a = 1;
            if (c1863b.m8619b(strMo4589b2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
