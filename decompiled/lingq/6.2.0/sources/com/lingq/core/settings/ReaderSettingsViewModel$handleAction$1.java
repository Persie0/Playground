package com.lingq.core.settings;

import com.lingq.core.settings.domain.C1871j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.iz7;
import p000.jz7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$handleAction$1", m4291f = "ReaderSettingsViewModel.kt", m4292l = {135}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$handleAction$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1859b f22595b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jz7 f22596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$handleAction$1(C1859b c1859b, jz7 jz7Var, Continuation continuation) {
        super(2, continuation);
        this.f22595b = c1859b;
        this.f22596c = jz7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSettingsViewModel$handleAction$1(this.f22595b, this.f22596c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSettingsViewModel$handleAction$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22594a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1871j c1871j = this.f22595b.f22723e;
            iz7 iz7Var = (iz7) this.f22596c;
            ViewKeys viewKeys = iz7Var.f44808a;
            boolean z = iz7Var.f44809b;
            this.f22594a = 1;
            if (c1871j.m8639a(viewKeys, z, this) == coroutineSingletons) {
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
