package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdh {

    /* JADX INFO: renamed from: a */
    static final jdf f33779a;

    /* JADX INFO: renamed from: b */
    static final jdf f33780b;

    /* JADX INFO: renamed from: c */
    private static final Object f33781c;

    /* JADX INFO: renamed from: d */
    private static Context f33782d;

    /* JADX INFO: renamed from: e */
    private static volatile jhv f33783e;

    static {
        new jda(jhr.m13189c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new jdb(jhr.m13189c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f33779a = new jdc(jhr.m13189c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f33780b = new jdd(jhr.m13189c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f33781c = new Object();
    }

    /* JADX INFO: renamed from: a */
    static synchronized void m12920a(Context context) {
        if (f33782d != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else {
            if (context != null) {
                f33782d = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12921b() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m12924e();
                jhv jhvVar = f33783e;
                Parcel parcelM3399y = jhvVar.m3399y(7, jhvVar.m3398a());
                boolean zM3406e = cbs.m3406e(parcelM3399y);
                parcelM3399y.recycle();
                return zM3406e;
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | jjj e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static jdl m12922c(String str, jhr jhrVar, boolean z, boolean z2) {
        jdl jdlVarM12928b;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m12924e();
                jib.m13205j(f33782d);
                jdk jdkVar = new jdk(str, jhrVar, z, z2);
                try {
                    jhv jhvVar = f33783e;
                    jjc jjcVarM13304b = jjb.m13304b(f33782d.getPackageManager());
                    Parcel parcelM3398a = jhvVar.m3398a();
                    cbs.m3404c(parcelM3398a, jdkVar);
                    cbs.m3405d(parcelM3398a, jjcVarM13304b);
                    Parcel parcelM3399y = jhvVar.m3399y(5, parcelM3398a);
                    boolean zM3406e = cbs.m3406e(parcelM3399y);
                    parcelM3399y.recycle();
                    jdlVarM12928b = zM3406e ? jdl.f33798a : new jdl(false);
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    jdlVarM12928b = jdl.m12928b();
                }
            } catch (jjj e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                e2.getMessage();
                jdlVarM12928b = jdl.m12928b();
            }
            return jdlVarM12928b;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, jjc] */
    /* JADX INFO: renamed from: d */
    public static jdl m12923d(String str, boolean z) {
        jdl jdlVarM12928b;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            jib.m13205j(f33782d);
            try {
                m12924e();
                jdi jdiVar = new jdi(str, z, false, jjb.m13304b(f33782d), false, true);
                try {
                    jhv jhvVar = f33783e;
                    Parcel parcelM3398a = jhvVar.m3398a();
                    cbs.m3404c(parcelM3398a, jdiVar);
                    Parcel parcelM3399y = jhvVar.m3399y(6, parcelM3398a);
                    jdj jdjVar = (jdj) cbs.m3402a(parcelM3399y, jdj.CREATOR);
                    parcelM3399y.recycle();
                    if (jdjVar.f33790a) {
                        jdjVar.m12926b();
                        jdlVarM12928b = new jdl(true);
                    } else {
                        String str2 = jdjVar.f33791b;
                        if (jdjVar.m12925a() == 4) {
                            new PackageManager.NameNotFoundException();
                        }
                        jdjVar.m12926b();
                        jdjVar.m12925a();
                        jdlVarM12928b = new jdl(false);
                    }
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    jdlVarM12928b = jdl.m12928b();
                }
            } catch (jjj e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                e2.getMessage();
                jdlVarM12928b = jdl.m12928b();
            }
            return jdlVarM12928b;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m12924e() {
        jhv jhvVar;
        if (f33783e != null) {
            return;
        }
        jib.m13205j(f33782d);
        synchronized (f33781c) {
            if (f33783e == null) {
                IBinder iBinderM13319c = jjn.m13312d(f33782d, jjn.f34172b, "com.google.android.gms.googlecertificates").m13319c("com.google.android.gms.common.GoogleCertificatesImpl");
                if (iBinderM13319c == null) {
                    jhvVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderM13319c.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    jhvVar = iInterfaceQueryLocalInterface instanceof jhv ? (jhv) iInterfaceQueryLocalInterface : new jhv(iBinderM13319c);
                }
                f33783e = jhvVar;
            }
        }
    }
}
