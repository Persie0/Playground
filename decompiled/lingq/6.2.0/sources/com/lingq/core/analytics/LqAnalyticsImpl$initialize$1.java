package com.lingq.core.analytics;

import android.content.Context;
import com.amplitude.android.AutocaptureOption;
import com.amplitude.android.C0879a;
import com.amplitude.android.C0880b;
import com.kochava.tracker.Tracker;
import com.kochava.tracker.log.LogLevel;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0842cc;
import p000.c32;
import p000.cc4;
import p000.r46;
import p000.sq5;
import p000.t9a;
import p000.un1;
import p000.v8a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.analytics.LqAnalyticsImpl$initialize$1", m4291f = "LqAnalyticsImpl.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LqAnalyticsImpl$initialize$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1240a f14297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LqAnalyticsImpl$initialize$1(C1240a c1240a, Continuation continuation) {
        super(2, continuation);
        this.f14297a = c1240a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LqAnalyticsImpl$initialize$1(this.f14297a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LqAnalyticsImpl$initialize$1 lqAnalyticsImpl$initialize$1 = (LqAnalyticsImpl$initialize$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lqAnalyticsImpl$initialize$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sq5 sq5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String strM17892f = this.f14297a.f14299b.m17892f("amplitude_key");
        Context context = this.f14297a.f14298a;
        AutocaptureOption.Companion.getClass();
        C0879a c0879a = new C0879a(new C0880b(context, strM17892f, AutocaptureOption.ALL));
        v8a tracker = Tracker.getInstance();
        C1240a c1240a = this.f14297a;
        Context context2 = c1240a.f14298a;
        String strM17892f2 = c1240a.f14299b.m17892f("kochava_key");
        Tracker tracker2 = (Tracker) tracker;
        synchronized (tracker2.f14119a) {
            try {
                sq5Var = Tracker.f14106i;
                String strM21915e = t9a.m21915e(strM17892f2, 256, sq5Var, "startWithAppGuid", "appGuid");
                r46.m20360A(sq5Var, "Host called API: Start With App GUID " + strM21915e);
                if (strM21915e != null) {
                    tracker2.m6977f(context2, strM21915e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f14297a.f14299b.m17891d()) {
            v8a tracker3 = Tracker.getInstance();
            LogLevel logLevel = LogLevel.DEBUG;
            synchronized (((Tracker) tracker3).f14119a) {
                try {
                    r46.m20360A(sq5Var, "Host called API: Set Log Level " + logLevel);
                    if (logLevel == null) {
                        r46.m20373P(sq5Var, "setLogLevel", "level");
                    } else {
                        r46.m20396w().f60929a = logLevel.toLevel();
                        if (logLevel.toLevel() < 4) {
                            sq5Var.m21557F(logLevel + " log level detected. Set to Info or lower prior to publishing");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C1240a c1240a2 = this.f14297a;
        cc4 cc4Var = new cc4();
        cc4Var.f9881a = c0879a;
        c1240a2.f14303f = cc4Var;
        C0842cc c0842cc = new C0842cc(3);
        c0842cc.f9872b = "";
        c1240a2.f14304g = c0842cc;
        return xfa.f68157a;
    }
}
