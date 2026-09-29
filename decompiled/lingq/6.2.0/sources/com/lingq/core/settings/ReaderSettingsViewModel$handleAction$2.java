package com.lingq.core.settings;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dz7;
import p000.em3;
import p000.jz7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$handleAction$2", m4291f = "ReaderSettingsViewModel.kt", m4292l = {139}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$handleAction$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1859b f22598b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jz7 f22599c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$handleAction$2(C1859b c1859b, jz7 jz7Var, Continuation continuation) {
        super(2, continuation);
        this.f22598b = c1859b;
        this.f22599c = jz7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSettingsViewModel$handleAction$2(this.f22598b, this.f22599c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSettingsViewModel$handleAction$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22597a;
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
        em3 em3Var = this.f22598b.f22724f;
        ((dz7) this.f22599c).getClass();
        this.f22597a = 1;
        Object objM7855N = ((C1368a) em3Var.f37455a).m7855N(0, this);
        if (objM7855N != coroutineSingletons) {
            objM7855N = xfaVar;
        }
        return objM7855N == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
