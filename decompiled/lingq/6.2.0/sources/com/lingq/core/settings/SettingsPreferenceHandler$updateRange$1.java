package com.lingq.core.settings;

import com.lingq.core.settings.domain.C1863b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.m29;
import p000.p29;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsPreferenceHandler$updateRange$1", m4291f = "SettingsPreferenceHandler.kt", m4292l = {60}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsPreferenceHandler$updateRange$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22672a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewKeys f22673b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p29 f22674c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f22675d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f22676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPreferenceHandler$updateRange$1(ViewKeys viewKeys, p29 p29Var, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f22673b = viewKeys;
        this.f22674c = p29Var;
        this.f22675d = i;
        this.f22676e = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsPreferenceHandler$updateRange$1(this.f22673b, this.f22674c, this.f22675d, this.f22676e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsPreferenceHandler$updateRange$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22672a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (m29.f50474a[this.f22673b.ordinal()] == 1) {
                p29 p29Var = this.f22674c;
                C1863b c1863b = (C1863b) p29Var.f55493e;
                String strMo4589b2 = ((cma) p29Var.f55499k).mo4589b2();
                this.f22672a = 1;
                if (c1863b.m8621d(this.f22675d, this.f22676e, strMo4589b2, this) == coroutineSingletons) {
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
