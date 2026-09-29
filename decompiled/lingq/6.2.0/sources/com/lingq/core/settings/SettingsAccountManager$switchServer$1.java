package com.lingq.core.settings;

import com.lingq.core.domain.model.server.ServerEnvironment;
import com.lingq.core.settings.domain.C1862a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.k09;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsAccountManager$switchServer$1", m4291f = "SettingsAccountManager.kt", m4292l = {55}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsAccountManager$switchServer$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22648a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k09 f22649b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ServerEnvironment f22650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsAccountManager$switchServer$1(k09 k09Var, ServerEnvironment serverEnvironment, Continuation continuation) {
        super(2, continuation);
        this.f22649b = k09Var;
        this.f22650c = serverEnvironment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsAccountManager$switchServer$1(this.f22649b, this.f22650c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsAccountManager$switchServer$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22648a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1862a c1862a = this.f22649b.f46511g;
            this.f22648a = 1;
            if (c1862a.m8615a(this.f22650c, this) == coroutineSingletons) {
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
