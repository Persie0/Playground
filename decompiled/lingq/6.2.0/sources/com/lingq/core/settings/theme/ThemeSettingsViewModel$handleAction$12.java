package com.lingq.core.settings.theme;

import com.lingq.core.settings.domain.C1869h;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.qy9;
import p000.un1;
import p000.xfa;
import p000.xy9;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel$handleAction$12", m4291f = "ThemeSettingsViewModel.kt", m4292l = {84}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsViewModel$handleAction$12 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23234a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1883c f23235b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xy9 f23236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$handleAction$12(C1883c c1883c, xy9 xy9Var, Continuation continuation) {
        super(2, continuation);
        this.f23235b = c1883c;
        this.f23236c = xy9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThemeSettingsViewModel$handleAction$12(this.f23235b, this.f23236c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ThemeSettingsViewModel$handleAction$12) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23234a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1869h c1869h = this.f23235b.f23308i;
            boolean z = ((qy9) this.f23236c).f58394a;
            this.f23234a = 1;
            if (c1869h.m8634c(z, this) == coroutineSingletons) {
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
