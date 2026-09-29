package com.lingq.core.settings;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.settings.domain.C1869h;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.em3;
import p000.o29;
import p000.p29;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsPreferenceHandler$updateSwitch$1", m4291f = "SettingsPreferenceHandler.kt", m4292l = {50, 51}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsPreferenceHandler$updateSwitch$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewKeys f22682b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p29 f22683c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f22684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPreferenceHandler$updateSwitch$1(ViewKeys viewKeys, p29 p29Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f22682b = viewKeys;
        this.f22683c = p29Var;
        this.f22684d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsPreferenceHandler$updateSwitch$1(this.f22682b, this.f22683c, this.f22684d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsPreferenceHandler$updateSwitch$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22681a;
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
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        int i2 = o29.f53655a[this.f22682b.ordinal()];
        boolean z = this.f22684d;
        p29 p29Var = this.f22683c;
        if (i2 != 1) {
            if (i2 == 2) {
                C1869h c1869h = (C1869h) p29Var.f55492d;
                this.f22681a = 2;
                if (c1869h.m8634c(z, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfaVar;
        }
        em3 em3Var = (em3) p29Var.f55491c;
        this.f22681a = 1;
        Object objM7911x = ((C1368a) em3Var.f37455a).m7911x(z, this);
        if (objM7911x != coroutineSingletons) {
            objM7911x = xfaVar;
        }
        if (objM7911x == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
