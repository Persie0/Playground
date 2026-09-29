package com.lingq.core.settings;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.settings.domain.C1863b;
import com.lingq.core.settings.domain.C1869h;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.km7;
import p000.n29;
import p000.p29;
import p000.un1;
import p000.web;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsPreferenceHandler$updateSelection$1", m4291f = "SettingsPreferenceHandler.kt", m4292l = {71, 72, 73}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsPreferenceHandler$updateSelection$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22677a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewKeys f22678b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p29 f22679c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f22680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPreferenceHandler$updateSelection$1(ViewKeys viewKeys, p29 p29Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f22678b = viewKeys;
        this.f22679c = p29Var;
        this.f22680d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsPreferenceHandler$updateSelection$1(this.f22678b, this.f22679c, this.f22680d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsPreferenceHandler$updateSelection$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22677a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        int i2 = n29.f52242a[this.f22678b.ordinal()];
        String str = this.f22680d;
        p29 p29Var = this.f22679c;
        if (i2 == 1) {
            C1863b c1863b = (C1863b) p29Var.f55494f;
            this.f22677a = 1;
            if (c1863b.m8622e(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (i2 == 2) {
            C1869h c1869h = (C1869h) p29Var.f55496h;
            LqTheme lqThemeValueOf = LqTheme.valueOf(str);
            this.f22677a = 2;
            if (c1869h.m8632a(lqThemeValueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (i2 == 3) {
            web webVar = (web) p29Var.f55497i;
            this.f22677a = 3;
            Object objM7066G = ((C1267a) ((km7) webVar.f66742a)).m7066G(str, this);
            if (objM7066G != coroutineSingletons) {
                objM7066G = xfaVar;
            }
            if (objM7066G == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
