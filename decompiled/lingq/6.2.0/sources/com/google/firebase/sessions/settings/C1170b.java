package com.google.firebase.sessions.settings;

import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.r29;
import p000.xfa;

/* JADX INFO: renamed from: com.google.firebase.sessions.settings.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1170b {

    /* JADX INFO: renamed from: a */
    public final r29 f13901a;

    /* JADX INFO: renamed from: b */
    public final r29 f13902b;

    public C1170b(r29 r29Var, r29 r29Var2) {
        r29Var.getClass();
        r29Var2.getClass();
        this.f13901a = r29Var;
        this.f13902b = r29Var2;
    }

    /* JADX INFO: renamed from: a */
    public final double m6765a() {
        Double dMo6763c = this.f13901a.mo6763c();
        if (dMo6763c != null) {
            double dDoubleValue = dMo6763c.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dMo6763c2 = this.f13902b.mo6763c();
        if (dMo6763c2 != null) {
            double dDoubleValue2 = dMo6763c2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.f13902b.mo6764d(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6766b(ContinuationImpl continuationImpl) throws Throwable {
        SessionsSettings$updateSettings$1 sessionsSettings$updateSettings$1;
        if (continuationImpl instanceof SessionsSettings$updateSettings$1) {
            sessionsSettings$updateSettings$1 = (SessionsSettings$updateSettings$1) continuationImpl;
            int i = sessionsSettings$updateSettings$1.f13884c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sessionsSettings$updateSettings$1.f13884c = i - Integer.MIN_VALUE;
            } else {
                sessionsSettings$updateSettings$1 = new SessionsSettings$updateSettings$1(this, continuationImpl);
            }
        } else {
            sessionsSettings$updateSettings$1 = new SessionsSettings$updateSettings$1(this, continuationImpl);
        }
        Object obj = sessionsSettings$updateSettings$1.f13882a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sessionsSettings$updateSettings$1.f13884c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            sessionsSettings$updateSettings$1.f13884c = 1;
            if (this.f13901a.mo6764d(sessionsSettings$updateSettings$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        sessionsSettings$updateSettings$1.f13884c = 2;
    }
}
