package com.lingq.core.settings.theme;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.my9;
import p000.un1;
import p000.xfa;
import p000.xy9;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel$handleAction$2", m4291f = "ThemeSettingsViewModel.kt", m4292l = {74}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsViewModel$handleAction$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23252a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1883c f23253b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xy9 f23254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$handleAction$2(C1883c c1883c, xy9 xy9Var, Continuation continuation) {
        super(2, continuation);
        this.f23253b = c1883c;
        this.f23254c = xy9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThemeSettingsViewModel$handleAction$2(this.f23253b, this.f23254c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ThemeSettingsViewModel$handleAction$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23252a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            double d = ((my9) this.f23254c).f52046a;
            this.f23252a = 1;
            if (C1883c.m8685W2(this.f23253b, d, this) == coroutineSingletons) {
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
