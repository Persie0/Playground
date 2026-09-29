package com.lingq.core.settings.theme;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.n83;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel$special$$inlined$flatMapLatest$1", m4291f = "ThemeSettingsViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ThemeSettingsViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f23293a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f23294b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23295c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1883c f23296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$special$$inlined$flatMapLatest$1(C1883c c1883c, Continuation continuation) {
        super(3, continuation);
        this.f23296d = c1883c;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ThemeSettingsViewModel$special$$inlined$flatMapLatest$1 themeSettingsViewModel$special$$inlined$flatMapLatest$1 = new ThemeSettingsViewModel$special$$inlined$flatMapLatest$1(this.f23296d, (Continuation) obj3);
        themeSettingsViewModel$special$$inlined$flatMapLatest$1.f23294b = (e83) obj;
        themeSettingsViewModel$special$$inlined$flatMapLatest$1.f23295c = obj2;
        return themeSettingsViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f23294b;
        Object obj2 = this.f23295c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23293a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str = (String) obj2;
            C1882b c1882b = this.f23296d.f23302c;
            c1882b.getClass();
            str.getClass();
            n83 n83VarM8683a = c1882b.m8683a(str, false);
            this.f23294b = null;
            this.f23295c = null;
            this.f23293a = 1;
            if (AbstractC3224d.m15537p(e83Var, n83VarM8683a, this) == coroutineSingletons) {
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
