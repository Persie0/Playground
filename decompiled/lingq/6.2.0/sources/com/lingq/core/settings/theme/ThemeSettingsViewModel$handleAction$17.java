package com.lingq.core.settings.theme;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.LanguageLearn;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.si7;
import p000.un1;
import p000.uy9;
import p000.xfa;
import p000.xy9;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.theme.ThemeSettingsViewModel$handleAction$17", m4291f = "ThemeSettingsViewModel.kt", m4292l = {89}, m4293m = "invokeSuspend", m4294v = 2)
final class ThemeSettingsViewModel$handleAction$17 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1883c f23250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xy9 f23251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSettingsViewModel$handleAction$17(C1883c c1883c, xy9 xy9Var, Continuation continuation) {
        super(2, continuation);
        this.f23250b = c1883c;
        this.f23251c = xy9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThemeSettingsViewModel$handleAction$17(this.f23250b, this.f23251c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ThemeSettingsViewModel$handleAction$17) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7890l0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23249a;
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
        String str = ((uy9) this.f23251c).f64546a;
        this.f23249a = 1;
        C1883c c1883c = this.f23250b;
        si7 si7Var = c1883c.f23303d;
        String str2 = (String) c1883c.f23312m.getValue();
        if (!fa4.m11650l(str2, LanguageLearn.Mandarin.getCode()) ? !fa4.m11650l(str2, LanguageLearn.Japanese.getCode()) ? !fa4.m11650l(str2, LanguageLearn.ChineseTraditional.getCode()) ? !fa4.m11650l(str2, LanguageLearn.Cantonese.getCode()) ? !AbstractC3184kh.m15230y(str2) || (objM7890l0 = ((C1368a) si7Var).m7890l0(str, this)) != coroutineSingletons : (objM7890l0 = ((C1368a) si7Var).m7884i0(str, this)) != coroutineSingletons : (objM7890l0 = ((C1368a) si7Var).m7886j0(str, this)) != coroutineSingletons : (objM7890l0 = ((C1368a) si7Var).m7888k0(str, this)) != coroutineSingletons : (objM7890l0 = ((C1368a) si7Var).m7892m0(str, this)) != coroutineSingletons) {
            objM7890l0 = xfaVar;
        }
        return objM7890l0 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
