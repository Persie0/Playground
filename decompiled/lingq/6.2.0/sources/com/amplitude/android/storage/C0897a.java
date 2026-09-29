package com.amplitude.android.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.amplitude.android.C0879a;
import com.amplitude.android.C0880b;
import com.amplitude.android.migration.C0891a;
import java.io.File;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3393o1;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3487q7;
import p000.bl2;
import p000.fa4;
import p000.ho5;
import p000.iz3;
import p000.pj5;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.android.storage.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0897a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10983a;

    /* JADX INFO: renamed from: b */
    public final C0879a f10984b;

    /* JADX INFO: renamed from: c */
    public final C0898b f10985c;

    /* JADX INFO: renamed from: d */
    public final bl2 f10986d;

    /* JADX INFO: renamed from: e */
    public final C0898b f10987e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f10988f;

    public C0897a(C0879a c0879a, C0880b c0880b, int i) {
        this.f10983a = i;
        switch (i) {
            case 1:
                c0880b.getClass();
                this.f10984b = c0879a;
                ArrayList arrayList = new ArrayList();
                this.f10988f = arrayList;
                StringBuilder sb = new StringBuilder("amplitude-android-");
                String str = c0880b.f10792e;
                sb.append(str);
                this.f10985c = m5094a(c0880b, "amplitude-disk-queue", sb.toString());
                this.f10987e = m5094a(c0880b, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + str);
                File dir = c0880b.f10789b.getDir("amplitude-kotlin-" + str, 0);
                String str2 = c0880b.f10792e;
                String str3 = c0880b.f10788a;
                ho5 ho5Var = c0880b.f10802o;
                pj5 pj5VarM5104a = c0880b.f10794g.m5104a(c0879a);
                String strM17734i = AbstractC3393o1.m17734i("amplitude-identity-", str);
                dir.getClass();
                iz3 iz3Var = new iz3(str2, str3, ho5Var, dir, strM17734i, pj5VarM5104a);
                arrayList.add(dir);
                this.f10986d = new bl2(iz3Var);
                break;
            default:
                c0880b.getClass();
                this.f10984b = c0879a;
                ArrayList arrayList2 = new ArrayList();
                this.f10988f = arrayList2;
                String str4 = c0880b.f10788a;
                this.f10985c = m5094a(c0880b, "amplitude-disk-queue", "amplitude-android-".concat(str4));
                this.f10987e = m5094a(c0880b, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-".concat(str4));
                Context context = c0880b.f10789b;
                StringBuilder sb2 = new StringBuilder("amplitude-kotlin-");
                String str5 = c0880b.f10792e;
                sb2.append(str5);
                File dir2 = context.getDir(sb2.toString(), 0);
                String str6 = c0880b.f10792e;
                ho5 ho5Var2 = c0880b.f10802o;
                pj5 pj5VarM5104a2 = c0880b.f10794g.m5104a(c0879a);
                String strM17734i2 = AbstractC3393o1.m17734i("amplitude-identity-", str5);
                dir2.getClass();
                iz3 iz3Var2 = new iz3(str6, str4, ho5Var2, dir2, strM17734i2, pj5VarM5104a2);
                arrayList2.add(dir2);
                this.f10986d = new bl2(iz3Var2);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0898b m5094a(C0880b c0880b, String str, String str2) {
        int i = this.f10983a;
        C0879a c0879a = this.f10984b;
        ArrayList arrayList = this.f10988f;
        switch (i) {
            case 0:
                File dir = c0880b.f10789b.getDir(str, 0);
                dir.getClass();
                arrayList.add(dir);
                SharedPreferences sharedPreferences = c0880b.f10789b.getSharedPreferences(str2, 0);
                String str3 = c0880b.f10788a;
                pj5 pj5VarM5104a = c0880b.f10794g.m5104a(c0879a);
                sharedPreferences.getClass();
                return new C0898b(str3, pj5VarM5104a, sharedPreferences, dir, c0879a.f11028m, new C3487q7(this, 1));
            default:
                File dir2 = c0880b.f10789b.getDir(str, 0);
                dir2.getClass();
                arrayList.add(dir2);
                SharedPreferences sharedPreferences2 = c0880b.f10789b.getSharedPreferences(str2, 0);
                String str4 = c0880b.f10792e;
                pj5 pj5VarM5104a2 = c0880b.f10794g.m5104a(c0879a);
                sharedPreferences2.getClass();
                return new C0898b(str4, pj5VarM5104a2, sharedPreferences2, dir2, c0879a.f11028m, new C3487q7(this, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r13.m5077a(r0) == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
    
        if (r13.m5077a(r0) == r6) goto L70;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5095b(ContinuationImpl continuationImpl) throws Throwable {
        AndroidStorageContextV1$migrateToLatestVersion$1 androidStorageContextV1$migrateToLatestVersion$1;
        C0898b c0898b;
        String[] list;
        AndroidStorageContextV2$migrateToLatestVersion$1 androidStorageContextV2$migrateToLatestVersion$1;
        String[] list2;
        int i = this.f10983a;
        xfa xfaVar = xfa.f68157a;
        C0898b c0898b2 = this.f10985c;
        bl2 bl2Var = this.f10986d;
        C0879a c0879a = this.f10984b;
        switch (i) {
            case 0:
                if (continuationImpl instanceof AndroidStorageContextV1$migrateToLatestVersion$1) {
                    androidStorageContextV1$migrateToLatestVersion$1 = (AndroidStorageContextV1$migrateToLatestVersion$1) continuationImpl;
                    int i2 = androidStorageContextV1$migrateToLatestVersion$1.f10972d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        androidStorageContextV1$migrateToLatestVersion$1.f10972d = i2 - Integer.MIN_VALUE;
                    } else {
                        androidStorageContextV1$migrateToLatestVersion$1 = new AndroidStorageContextV1$migrateToLatestVersion$1(this, continuationImpl);
                    }
                } else {
                    androidStorageContextV1$migrateToLatestVersion$1 = new AndroidStorageContextV1$migrateToLatestVersion$1(this, continuationImpl);
                }
                Object obj = androidStorageContextV1$migrateToLatestVersion$1.f10970b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = androidStorageContextV1$migrateToLatestVersion$1.f10972d;
                if (i3 != 0) {
                    if (i3 == 1) {
                        this = androidStorageContextV1$migrateToLatestVersion$1.f10969a;
                        AbstractC3193b.m15359b(obj);
                    } else {
                        if (i3 != 2) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = androidStorageContextV1$migrateToLatestVersion$1.f10969a;
                        AbstractC3193b.m15359b(obj);
                    }
                    for (File file : this.f10988f) {
                        list = file.list();
                        if (list == null && list.length == 0) {
                            file.delete();
                        }
                    }
                    return xfaVar;
                }
                AbstractC3193b.m15359b(obj);
                new C3309ls(bl2Var, c0879a.m5112f(), c0879a.m5113g()).m16513o();
                C0898b c0898bM5114h = c0879a.m5114h();
                if (!(c0898bM5114h instanceof C0898b)) {
                    c0898bM5114h = null;
                }
                if (c0898bM5114h != null) {
                    C0891a c0891a = new C0891a(c0898b2, c0898bM5114h, c0879a.m5113g());
                    androidStorageContextV1$migrateToLatestVersion$1.f10969a = this;
                    androidStorageContextV1$migrateToLatestVersion$1.f10972d = 1;
                    if (c0891a.m5077a(androidStorageContextV1$migrateToLatestVersion$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                C0898b c0898bM5111e = this.f10984b.m5111e();
                c0898b = c0898bM5111e instanceof C0898b ? c0898bM5111e : null;
                if (c0898b != null) {
                    C0891a c0891a2 = new C0891a(this.f10987e, c0898b, this.f10984b.m5113g());
                    androidStorageContextV1$migrateToLatestVersion$1.f10969a = this;
                    androidStorageContextV1$migrateToLatestVersion$1.f10972d = 2;
                    break;
                }
                while (r12.hasNext()) {
                    list = file.list();
                    if (list == null) {
                    }
                }
                return xfaVar;
            default:
                if (continuationImpl instanceof AndroidStorageContextV2$migrateToLatestVersion$1) {
                    androidStorageContextV2$migrateToLatestVersion$1 = (AndroidStorageContextV2$migrateToLatestVersion$1) continuationImpl;
                    int i4 = androidStorageContextV2$migrateToLatestVersion$1.f10976d;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        androidStorageContextV2$migrateToLatestVersion$1.f10976d = i4 - Integer.MIN_VALUE;
                    } else {
                        androidStorageContextV2$migrateToLatestVersion$1 = new AndroidStorageContextV2$migrateToLatestVersion$1(this, continuationImpl);
                    }
                } else {
                    androidStorageContextV2$migrateToLatestVersion$1 = new AndroidStorageContextV2$migrateToLatestVersion$1(this, continuationImpl);
                }
                Object obj2 = androidStorageContextV2$migrateToLatestVersion$1.f10974b;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = androidStorageContextV2$migrateToLatestVersion$1.f10976d;
                if (i5 != 0) {
                    if (i5 == 1) {
                        this = androidStorageContextV2$migrateToLatestVersion$1.f10973a;
                        AbstractC3193b.m15359b(obj2);
                        C0898b c0898bM5111e2 = this.f10984b.m5111e();
                        c0898b = c0898bM5111e2 instanceof C0898b ? c0898bM5111e2 : null;
                        if (c0898b != null) {
                            C0891a c0891a3 = new C0891a(this.f10987e, c0898b, this.f10984b.m5113g());
                            androidStorageContextV2$migrateToLatestVersion$1.f10973a = this;
                            androidStorageContextV2$migrateToLatestVersion$1.f10976d = 2;
                        }
                        break;
                    } else {
                        if (i5 != 2) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = androidStorageContextV2$migrateToLatestVersion$1.f10973a;
                        AbstractC3193b.m15359b(obj2);
                    }
                    for (File file2 : this.f10988f) {
                        list2 = file2.list();
                        if (list2 == null && list2.length == 0) {
                            file2.delete();
                        }
                    }
                    return xfaVar;
                }
                AbstractC3193b.m15359b(obj2);
                new C3309ls(bl2Var, c0879a.m5112f(), c0879a.m5113g()).m16513o();
                if (fa4.m11650l(c0879a.f11016a.f10792e, "$default_instance")) {
                    C0898b c0898bM5114h2 = c0879a.m5114h();
                    if (!(c0898bM5114h2 instanceof C0898b)) {
                        c0898bM5114h2 = null;
                    }
                    if (c0898bM5114h2 != null) {
                        C0891a c0891a4 = new C0891a(c0898b2, c0898bM5114h2, c0879a.m5113g());
                        androidStorageContextV2$migrateToLatestVersion$1.f10973a = this;
                        androidStorageContextV2$migrateToLatestVersion$1.f10976d = 1;
                        if (c0891a4.m5077a(androidStorageContextV2$migrateToLatestVersion$1) != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    }
                    C0898b c0898bM5111e3 = this.f10984b.m5111e();
                    if (c0898bM5111e3 instanceof C0898b) {
                    }
                    if (c0898b != null) {
                        C0891a c0891a5 = new C0891a(this.f10987e, c0898b, this.f10984b.m5113g());
                        androidStorageContextV2$migrateToLatestVersion$1.f10973a = this;
                        androidStorageContextV2$migrateToLatestVersion$1.f10976d = 2;
                    }
                    break;
                }
                while (r12.hasNext()) {
                    list2 = file2.list();
                    if (list2 == null) {
                    }
                }
                return xfaVar;
        }
    }
}
