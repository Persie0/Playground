package com.amplitude.android.migration;

import android.content.SharedPreferences;
import com.amplitude.android.C0879a;
import com.amplitude.android.C0880b;
import com.amplitude.android.storage.C0897a;
import com.amplitude.android.storage.StorageVersion;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.pj5;
import p000.u02;
import p000.v02;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.android.migration.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0892b {

    /* JADX INFO: renamed from: a */
    public final C0879a f10929a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f10930b;

    /* JADX INFO: renamed from: c */
    public final pj5 f10931c;

    /* JADX INFO: renamed from: d */
    public final int f10932d;

    public C0892b(C0879a c0879a) {
        this.f10929a = c0879a;
        C0880b c0880b = c0879a.f11016a;
        this.f10931c = c0879a.m5113g();
        SharedPreferences sharedPreferences = c0880b.f10789b.getSharedPreferences("amplitude-android-" + c0880b.f10792e, 0);
        sharedPreferences.getClass();
        this.f10930b = sharedPreferences;
        this.f10932d = sharedPreferences.getInt("storage_version", 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
    
        if (r0.m5095b(r1) == r2) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5081a(ContinuationImpl continuationImpl) {
        MigrationManager$safePerformMigration$1 migrationManager$safePerformMigration$1;
        C0880b c0880b;
        C0892b c0892b;
        String lowerCase;
        C0879a c0879a = this.f10929a;
        if (continuationImpl instanceof MigrationManager$safePerformMigration$1) {
            migrationManager$safePerformMigration$1 = (MigrationManager$safePerformMigration$1) continuationImpl;
            int i = migrationManager$safePerformMigration$1.f10892e;
            if ((i & Integer.MIN_VALUE) != 0) {
                migrationManager$safePerformMigration$1.f10892e = i - Integer.MIN_VALUE;
            } else {
                migrationManager$safePerformMigration$1 = new MigrationManager$safePerformMigration$1(this, continuationImpl);
            }
        } else {
            migrationManager$safePerformMigration$1 = new MigrationManager$safePerformMigration$1(this, continuationImpl);
        }
        Object obj = migrationManager$safePerformMigration$1.f10890c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = migrationManager$safePerformMigration$1.f10892e;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                c0880b = c0879a.f11016a;
                if (c0880b.f10803p) {
                    LinkedHashMap linkedHashMap = v02.f64655a;
                    String str = c0880b.f10792e;
                    if (str != null) {
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        lowerCase = str.toLowerCase(locale);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                    String strConcat = (lowerCase == null || lowerCase.length() == 0 || lowerCase.equals("$default_instance")) ? "com.amplitude.api" : "com.amplitude.api_".concat(lowerCase);
                    LinkedHashMap linkedHashMap2 = v02.f64655a;
                    u02 u02Var = (u02) linkedHashMap2.get(strConcat);
                    if (u02Var == null) {
                        u02Var = new u02(c0880b.f10789b, strConcat, c0880b.f10794g.m5104a(c0879a));
                        linkedHashMap2.put(strConcat, u02Var);
                    }
                    migrationManager$safePerformMigration$1.f10888a = this;
                    migrationManager$safePerformMigration$1.f10889b = c0880b;
                    migrationManager$safePerformMigration$1.f10892e = 1;
                    Object objM5083b = new C0893c(c0879a, u02Var).m5083b(migrationManager$safePerformMigration$1);
                    if (objM5083b != coroutineSingletons) {
                        objM5083b = xfaVar;
                    }
                    if (objM5083b == coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            try {
                if (i2 == 1) {
                    C0880b c0880b2 = migrationManager$safePerformMigration$1.f10889b;
                    C0892b c0892b2 = migrationManager$safePerformMigration$1.f10888a;
                    AbstractC3193b.m15359b(obj);
                    c0880b = c0880b2;
                    this = c0892b2;
                } else if (i2 == 2) {
                    C0880b c0880b3 = migrationManager$safePerformMigration$1.f10889b;
                    C0892b c0892b3 = migrationManager$safePerformMigration$1.f10888a;
                    AbstractC3193b.m15359b(obj);
                    c0880b = c0880b3;
                    c0892b = c0892b3;
                    C0897a c0897a = new C0897a(c0892b.f10929a, c0880b, 1);
                    migrationManager$safePerformMigration$1.f10888a = c0892b;
                    migrationManager$safePerformMigration$1.f10889b = null;
                    migrationManager$safePerformMigration$1.f10892e = 3;
                    this = c0892b;
                } else {
                    if (i2 != 3) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    C0892b c0892b4 = migrationManager$safePerformMigration$1.f10888a;
                    AbstractC3193b.m15359b(obj);
                    this = c0892b4;
                }
                this.f10930b.edit().putInt("storage_version", StorageVersion.V3.getRawValue()).apply();
                return xfaVar;
            } catch (Throwable th) {
                th = th;
                this = c0879a;
                this.f10931c.mo16255a("Failed to migrate storage: " + th.getMessage());
                return xfaVar;
            }
            C0897a c0897a2 = new C0897a(this.f10929a, c0880b, 0);
            migrationManager$safePerformMigration$1.f10888a = this;
            migrationManager$safePerformMigration$1.f10889b = c0880b;
            migrationManager$safePerformMigration$1.f10892e = 2;
            c0892b = this;
            if (c0897a2.m5095b(migrationManager$safePerformMigration$1) != coroutineSingletons) {
                C0897a c0897a3 = new C0897a(c0892b.f10929a, c0880b, 1);
                migrationManager$safePerformMigration$1.f10888a = c0892b;
                migrationManager$safePerformMigration$1.f10889b = null;
                migrationManager$safePerformMigration$1.f10892e = 3;
                this = c0892b;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
