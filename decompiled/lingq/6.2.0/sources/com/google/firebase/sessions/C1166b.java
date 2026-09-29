package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.installations.C1154a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.c74;
import p000.t40;
import p000.tld;
import p000.wfb;
import p000.x43;

/* JADX INFO: renamed from: com.google.firebase.sessions.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1166b {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r7 == r9) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [x43] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6754a(x43 x43Var, ContinuationImpl continuationImpl) throws Throwable {
        InstallationId$Companion$create$1 installationId$Companion$create$1;
        ?? r7;
        String str;
        ?? r8;
        if (continuationImpl instanceof InstallationId$Companion$create$1) {
            installationId$Companion$create$1 = (InstallationId$Companion$create$1) continuationImpl;
            int i = installationId$Companion$create$1.f13806d;
            if ((i & Integer.MIN_VALUE) != 0) {
                installationId$Companion$create$1.f13806d = i - Integer.MIN_VALUE;
            } else {
                installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuationImpl);
            }
        } else {
            installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuationImpl);
        }
        Object objM23911f = installationId$Companion$create$1.f13804b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = installationId$Companion$create$1.f13806d;
        String str2 = "";
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        x43 x43Var2 = (x43) installationId$Companion$create$1.f13803a;
                        AbstractC3193b.m15359b(objM23911f);
                        x43Var = x43Var2;
                    } else {
                        if (i2 != 2) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str3 = (String) installationId$Companion$create$1.f13803a;
                        AbstractC3193b.m15359b(objM23911f);
                        x43Var = str3;
                    }
                    String str4 = (String) objM23911f;
                    r8 = x43Var;
                    if (str4 != null) {
                        str2 = str4;
                        r8 = x43Var;
                    }
                    return new c74(str2, r8);
                }
                AbstractC3193b.m15359b(objM23911f);
                C1154a c1154a = (C1154a) x43Var;
                tld tldVarM6698d = c1154a.m6698d();
                try {
                    tldVarM6698d.getClass();
                    installationId$Companion$create$1.f13803a = c1154a;
                    installationId$Companion$create$1.f13806d = 1;
                    Object objM23911f2 = wfb.m23911f(tldVarM6698d, installationId$Companion$create$1);
                    if (objM23911f2 != coroutineSingletons) {
                        x43Var = c1154a;
                        objM23911f = objM23911f2;
                    }
                } catch (Exception e) {
                    x43Var = c1154a;
                    e = e;
                    Log.w("FirebaseSessions", "Error getting authentication token.", e);
                    r7 = x43Var;
                    str = "";
                }
                return coroutineSingletons;
                String str5 = ((t40) objM23911f).f61836a;
                str5.getClass();
                ?? r6 = x43Var;
                str = str5;
                r7 = r6;
            } catch (Exception e2) {
                e = e2;
            }
            tld tldVarM6697c = ((C1154a) r7).m6697c();
            tldVarM6697c.getClass();
            installationId$Companion$create$1.f13803a = str;
            installationId$Companion$create$1.f13806d = 2;
            objM23911f = wfb.m23911f(tldVarM6697c, installationId$Companion$create$1);
            x43Var = str;
        } catch (Exception e3) {
            Log.w("FirebaseSessions", "Error getting Firebase installation id .", e3);
            r8 = x43Var;
        }
    }
}
