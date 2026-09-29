package com.amplitude.p007id;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bl2;
import p000.c32;
import p000.gz3;
import p000.sq5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.id.IdentityManagerImpl$persistIdentity$1", m4291f = "IdentityManager.kt", m4292l = {}, m4293m = "invokeSuspend")
final class IdentityManagerImpl$persistIdentity$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f11270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0916a f11271b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gz3 f11272c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f11273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManagerImpl$persistIdentity$1(boolean z, C0916a c0916a, gz3 gz3Var, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f11270a = z;
        this.f11271b = c0916a;
        this.f11272c = gz3Var;
        this.f11273d = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IdentityManagerImpl$persistIdentity$1(this.f11270a, this.f11271b, this.f11272c, this.f11273d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        IdentityManagerImpl$persistIdentity$1 identityManagerImpl$persistIdentity$1 = (IdentityManagerImpl$persistIdentity$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        identityManagerImpl$persistIdentity$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        bl2 bl2Var = this.f11271b.f11274a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        boolean z = this.f11270a;
        gz3 gz3Var = this.f11272c;
        if (z) {
            String str = gz3Var.f41547a;
            sq5 sq5Var = (sq5) bl2Var.f8656b;
            if (str == null) {
                str = "";
            }
            sq5Var.m21581x("user_id", str);
        }
        if (this.f11273d) {
            String str2 = gz3Var.f41548b;
            ((sq5) bl2Var.f8656b).m21581x("device_id", str2 != null ? str2 : "");
        }
        return xfa.f68157a;
    }
}
