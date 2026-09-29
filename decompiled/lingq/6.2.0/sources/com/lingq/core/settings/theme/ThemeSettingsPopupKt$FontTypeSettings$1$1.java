package com.lingq.core.settings.theme;

import androidx.compose.foundation.lazy.C0127b;
import java.util.List;
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
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsPopupKt$FontTypeSettings$1$1", m4291f = "ThemeSettingsPopup.kt", m4292l = {981}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsPopupKt$FontTypeSettings$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f23195b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f23196c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0127b f23197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsPopupKt$FontTypeSettings$1$1(int i, List list, C0127b c0127b, Continuation continuation) {
        super(2, continuation);
        this.f23195b = i;
        this.f23196c = list;
        this.f23197d = c0127b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThemeSettingsPopupKt$FontTypeSettings$1$1(this.f23195b, this.f23196c, this.f23197d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ThemeSettingsPopupKt$FontTypeSettings$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23194a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int i2 = this.f23195b;
            if (i2 != -1 && i2 > 2 && i2 < this.f23196c.size() - 2) {
                this.f23194a = 1;
                if (C0127b.m973l(this.f23197d, i2 - 2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
