package com.lingq.core.settings;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.fa4;
import p000.kz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsViewModel$1", m4291f = "SettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1873e f22694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$1(C1873e c1873e, Continuation continuation) {
        super(2, continuation);
        this.f22694b = c1873e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SettingsViewModel$1 settingsViewModel$1 = new SettingsViewModel$1(this.f22694b, continuation);
        settingsViewModel$1.f22693a = obj;
        return settingsViewModel$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SettingsViewModel$1 settingsViewModel$1 = (SettingsViewModel$1) create((Language) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        settingsViewModel$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        kz1 kz1VarM15733a;
        Language language = (Language) this.f22693a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f22694b.f22978r;
        do {
            value = c3244l.getValue();
            kz1VarM15733a = (kz1) value;
            if (fa4.m11650l(kz1VarM15733a.f48789a, C1873e.m8644Z2(language))) {
                kz1VarM15733a = kz1.m15733a(kz1VarM15733a, null, null, false, null, 14);
            }
        } while (!c3244l.m15570h(value, kz1VarM15733a));
        return xfa.f68157a;
    }
}
