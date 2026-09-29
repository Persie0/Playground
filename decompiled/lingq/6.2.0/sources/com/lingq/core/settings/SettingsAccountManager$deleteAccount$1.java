package com.lingq.core.settings;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.settings.domain.C1864c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.hi8;
import p000.k09;
import p000.km7;
import p000.un1;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsAccountManager$deleteAccount$1", m4291f = "SettingsAccountManager.kt", m4292l = {104, 105}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsAccountManager$deleteAccount$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k09 f22639b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsAccountManager$deleteAccount$1(k09 k09Var, Continuation continuation) {
        super(2, continuation);
        this.f22639b = k09Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsAccountManager$deleteAccount$1(this.f22639b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsAccountManager$deleteAccount$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r6.m8625a(r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22638a;
        k09 k09Var = this.f22639b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            hi8 hi8Var = k09Var.f46515k;
            this.f22638a = 1;
            obj = ((C1267a) ((km7) hi8Var.f42410b)).m7073b(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        if (((ym5) obj) instanceof xm5) {
            C1864c c1864c = k09Var.f46509e;
            this.f22638a = 2;
        }
        return xfa.f68157a;
    }
}
