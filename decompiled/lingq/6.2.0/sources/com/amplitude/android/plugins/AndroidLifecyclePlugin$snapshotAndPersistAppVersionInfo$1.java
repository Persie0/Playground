package com.amplitude.android.plugins;

import com.amplitude.android.storage.C0898b;
import com.amplitude.core.Storage$Constants;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.y92;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.plugins.AndroidLifecyclePlugin$snapshotAndPersistAppVersionInfo$1", m4291f = "AndroidLifecyclePlugin.kt", m4292l = {244, 246, 247}, m4293m = "invokeSuspend")
final class AndroidLifecyclePlugin$snapshotAndPersistAppVersionInfo$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0895b f10943b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0898b f10944c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f10945d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f10946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLifecyclePlugin$snapshotAndPersistAppVersionInfo$1(C0895b c0895b, C0898b c0898b, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f10943b = c0895b;
        this.f10944c = c0898b;
        this.f10945d = str;
        this.f10946e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidLifecyclePlugin$snapshotAndPersistAppVersionInfo$1(this.f10943b, this.f10944c, this.f10945d, this.f10946e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidLifecyclePlugin$snapshotAndPersistAppVersionInfo$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10942a;
        C0898b c0898b = this.f10944c;
        C0895b c0895b = this.f10943b;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                y92 y92Var = c0895b.m5090c().f11027l;
                this.f10942a = 1;
                if (y92Var.m15517w(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        AbstractC3193b.m15359b(obj);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            Storage$Constants storage$Constants = Storage$Constants.APP_BUILD;
            String str = this.f10946e;
            this.f10942a = 3;
            c0898b.m5102g(storage$Constants, str);
            if (xfaVar != coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
            Storage$Constants storage$Constants2 = Storage$Constants.APP_VERSION;
            String str2 = this.f10945d;
            this.f10942a = 2;
            c0898b.m5102g(storage$Constants2, str2);
            if (xfaVar != coroutineSingletons) {
                Storage$Constants storage$Constants3 = Storage$Constants.APP_BUILD;
                String str3 = this.f10946e;
                this.f10942a = 3;
                c0898b.m5102g(storage$Constants3, str3);
                if (xfaVar != coroutineSingletons) {
                    return xfaVar;
                }
            }
            return coroutineSingletons;
        } catch (Exception e) {
            c0895b.m5090c().m5113g().mo16255a("Failed to persist app version/build: " + e);
            return xfaVar;
        }
    }
}
