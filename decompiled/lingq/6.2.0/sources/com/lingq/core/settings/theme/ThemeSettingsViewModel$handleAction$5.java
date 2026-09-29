package com.lingq.core.settings.theme;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.datastore.C1368a;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ly9;
import p000.un1;
import p000.vs3;
import p000.xfa;
import p000.xy9;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel$handleAction$5", m4291f = "ThemeSettingsViewModel.kt", m4292l = {77}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsViewModel$handleAction$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1883c f23262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xy9 f23263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$handleAction$5(C1883c c1883c, xy9 xy9Var, Continuation continuation) {
        super(2, continuation);
        this.f23262b = c1883c;
        this.f23263c = xy9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThemeSettingsViewModel$handleAction$5(this.f23262b, this.f23263c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ThemeSettingsViewModel$handleAction$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23261a;
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
        vs3 vs3Var = ((ly9) this.f23263c).f50317a;
        this.f23261a = 1;
        String lowerCase = vs3Var.f65846b.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        C1883c c1883c = this.f23262b;
        C1240a c1240a = (C1240a) c1883c.f23306g;
        c1240a.m7025f("Reader setting changed", c1240a.m7022c("highlighting color", lowerCase));
        c1240a.m7027h("reader highlighting color", lowerCase);
        Object objM7878f0 = ((C1368a) c1883c.f23303d).m7878f0(vs3Var.f65845a, this);
        if (objM7878f0 != coroutineSingletons) {
            objM7878f0 = xfaVar;
        }
        return objM7878f0 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
