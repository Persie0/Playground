package com.lingq.core.settings.theme;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ty9;
import p000.un1;
import p000.xfa;
import p000.xy9;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel$handleAction$6", m4291f = "ThemeSettingsViewModel.kt", m4292l = {78}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsViewModel$handleAction$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23264a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1883c f23265b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xy9 f23266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$handleAction$6(C1883c c1883c, xy9 xy9Var, Continuation continuation) {
        super(2, continuation);
        this.f23265b = c1883c;
        this.f23266c = xy9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThemeSettingsViewModel$handleAction$6(this.f23265b, this.f23266c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ThemeSettingsViewModel$handleAction$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23264a;
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
        TextHighlightStyle textHighlightStyle = ((ty9) this.f23266c).f63100a;
        this.f23264a = 1;
        Object objM7880g0 = ((C1368a) this.f23265b.f23303d).m7880g0(textHighlightStyle, this);
        if (objM7880g0 != coroutineSingletons) {
            objM7880g0 = xfaVar;
        }
        return objM7880g0 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
