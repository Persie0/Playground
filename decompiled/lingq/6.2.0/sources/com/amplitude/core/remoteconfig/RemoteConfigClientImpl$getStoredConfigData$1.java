package com.amplitude.core.remoteconfig;

import com.amplitude.android.storage.C0898b;
import com.amplitude.core.Storage$Constants;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.pj5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.amplitude.core.remoteconfig.RemoteConfigClientImpl$getStoredConfigData$1", m4291f = "RemoteConfigClient.kt", m4292l = {241, 242}, m4293m = "invokeSuspend")
final class RemoteConfigClientImpl$getStoredConfigData$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0912a f11163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigClientImpl$getStoredConfigData$1(C0912a c0912a, Continuation continuation) {
        super(2, continuation);
        this.f11163b = c0912a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteConfigClientImpl$getStoredConfigData$1(this.f11163b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteConfigClientImpl$getStoredConfigData$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r6 == r2) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0912a c0912a = this.f11163b;
        pj5 pj5Var = c0912a.f11185h;
        C0898b c0898b = c0912a.f11183f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11162a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Storage$Constants storage$Constants = Storage$Constants.REMOTE_CONFIG;
                this.f11162a = 1;
                c0898b.m5099d(storage$Constants);
                if (xfaVar == coroutineSingletons) {
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
            pj5Var.mo16256b("Cleared storage due to hard inconsistency (no expected keys present)");
            return xfaVar;
            Storage$Constants storage$Constants2 = Storage$Constants.REMOTE_CONFIG_TIMESTAMP;
            this.f11162a = 2;
            c0898b.m5099d(storage$Constants2);
        } catch (Exception e) {
            pj5Var.mo16255a("Failed to clear inconsistent storage: " + e.getMessage());
            return xfaVar;
        }
    }
}
