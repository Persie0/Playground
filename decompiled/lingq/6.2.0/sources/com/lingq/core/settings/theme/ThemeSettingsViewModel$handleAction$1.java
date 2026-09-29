package com.lingq.core.settings.theme;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ky9;
import p000.un1;
import p000.xfa;
import p000.xy9;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel$handleAction$1", m4291f = "ThemeSettingsViewModel.kt", m4292l = {73}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsViewModel$handleAction$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1883c f23226b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xy9 f23227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$handleAction$1(C1883c c1883c, xy9 xy9Var, Continuation continuation) {
        super(2, continuation);
        this.f23226b = c1883c;
        this.f23227c = xy9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThemeSettingsViewModel$handleAction$1(this.f23226b, this.f23227c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ThemeSettingsViewModel$handleAction$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23225a;
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
        int i2 = ((ky9) this.f23227c).f48779a;
        this.f23225a = 1;
        Object objM7858Q = ((C1368a) this.f23226b.f23303d).m7858Q(i2, this);
        if (objM7858Q != coroutineSingletons) {
            objM7858Q = xfaVar;
        }
        return objM7858Q == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
