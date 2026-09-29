package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.fragment.app.C0987y;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.RestrictedInheritance;
import p176ib.C6272i;
import p320pb.BinderC8215b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.google.android.gms.common.f */
/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public final class C2551f {

    /* JADX INFO: renamed from: c */
    public static C2551f f13923c;

    /* JADX INFO: renamed from: a */
    public final Context f13924a;

    /* JADX INFO: renamed from: b */
    public volatile String f13925b;

    public C2551f(Context context) {
        this.f13924a = context.getApplicationContext();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C2551f m7592a(Context context) {
        C6272i.m12915i(context);
        synchronized (C2551f.class) {
            if (f13923c == null) {
                BinderC2562n binderC2562n = C2568t.f13996a;
                synchronized (C2568t.class) {
                    if (C2568t.f14000e == null) {
                        C2568t.f14000e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f13923c = new C2551f(context);
            }
        }
        return f13923c;
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractBinderC2564p m7593c(PackageInfo packageInfo, AbstractBinderC2564p... abstractBinderC2564pArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC2565q binderC2565q = new BinderC2565q(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < abstractBinderC2564pArr.length; i10++) {
            if (abstractBinderC2564pArr[i10].equals(binderC2565q)) {
                return abstractBinderC2564pArr[i10];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m7594d(PackageInfo packageInfo, boolean z10) {
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? m7593c(packageInfo, C2567s.f13995a) : m7593c(packageInfo, C2567s.f13995a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0176  */
    /* JADX INFO: renamed from: b */
    public final boolean m7595b(int i10) {
        C2573y c2573yM7620b;
        int length;
        boolean zMo12921f;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.f13924a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            c2573yM7620b = C2573y.m7620b("no pkgs");
        } else {
            c2573yM7620b = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    C6272i.m12915i(c2573yM7620b);
                    break;
                }
                String str = packagesForUid[i11];
                if (str == null) {
                    c2573yM7620b = C2573y.m7620b("null pkg");
                } else if (str.equals(this.f13925b)) {
                    c2573yM7620b = C2573y.f14004d;
                } else {
                    BinderC2562n binderC2562n = C2568t.f13996a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            C2568t.m7618b();
                            zMo12921f = C2568t.f13998c.mo12921f();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (RemoteException | DynamiteModule.LoadingException e10) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        zMo12921f = false;
                    }
                    if (zMo12921f) {
                        boolean zHonorsDebugCertificates = C2550e.honorsDebugCertificates(this.f13924a);
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            C6272i.m12915i(C2568t.f14000e);
                            try {
                                C2568t.m7618b();
                                try {
                                    zzq zzqVarMo12919c0 = C2568t.f13998c.mo12919c0(new zzo(str, zHonorsDebugCertificates, false, new BinderC8215b(C2568t.f14000e), false, true));
                                    if (zzqVarMo12919c0.f14014a) {
                                        C0987y.m3835q(zzqVarMo12919c0.f14017d);
                                        c2573yM7620b = new C2573y(true, null, null);
                                    } else {
                                        String str2 = zzqVarMo12919c0.f14015b;
                                        PackageManager.NameNotFoundException nameNotFoundException = C8573r0.m16743n1(zzqVarMo12919c0.f14016c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        C0987y.m3835q(zzqVarMo12919c0.f14017d);
                                        C8573r0.m16743n1(zzqVarMo12919c0.f14016c);
                                        c2573yM7620b = new C2573y(false, str2, nameNotFoundException);
                                    }
                                } catch (RemoteException e11) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                                    c2573yM7620b = C2573y.m7621c("module call", e11);
                                }
                            } catch (DynamiteModule.LoadingException e12) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e12);
                                c2573yM7620b = C2573y.m7621c("module init: ".concat(String.valueOf(e12.getMessage())), e12);
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            throw th3;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = this.f13924a.getPackageManager().getPackageInfo(str, 64);
                            boolean zHonorsDebugCertificates2 = C2550e.honorsDebugCertificates(this.f13924a);
                            if (packageInfo == null) {
                                c2573yM7620b = C2573y.m7620b("null pkg");
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    c2573yM7620b = C2573y.m7620b("single cert required");
                                } else {
                                    BinderC2565q binderC2565q = new BinderC2565q(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        C2573y c2573yM7617a = C2568t.m7617a(str3, binderC2565q, zHonorsDebugCertificates2, false);
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        if (c2573yM7617a.f14005a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                C2573y c2573yM7617a2 = C2568t.m7617a(str3, binderC2565q, false, true);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                if (c2573yM7617a2.f14005a) {
                                                    c2573yM7620b = C2573y.m7620b("debuggable release cert app rejected");
                                                }
                                            } catch (Throwable th4) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                throw th4;
                                            }
                                        }
                                        c2573yM7620b = c2573yM7617a;
                                    } catch (Throwable th5) {
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        throw th5;
                                    }
                                }
                            }
                            if (c2573yM7620b.f14005a) {
                                this.f13925b = str;
                            }
                        } catch (PackageManager.NameNotFoundException e13) {
                            c2573yM7620b = C2573y.m7621c("no pkg ".concat(str), e13);
                        }
                    }
                    if (c2573yM7620b.f14005a) {
                        this.f13925b = str;
                    }
                }
                if (c2573yM7620b.f14005a) {
                    break;
                }
                i11++;
            }
        }
        if (!c2573yM7620b.f14005a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th6 = c2573yM7620b.f14007c;
            if (th6 != null) {
                Log.d("GoogleCertificatesRslt", c2573yM7620b.mo7619a(), th6);
            } else {
                Log.d("GoogleCertificatesRslt", c2573yM7620b.mo7619a());
            }
        }
        return c2573yM7620b.f14005a;
    }
}
