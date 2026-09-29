package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.common.zzah;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wo3 {

    /* JADX INFO: renamed from: c */
    public static wo3 f67118c;

    /* JADX INFO: renamed from: a */
    public final Object f67119a;

    /* JADX INFO: renamed from: b */
    public volatile Object f67120b;

    public wo3(Looper looper, String str, ccd ccdVar) {
        this.f67119a = new zq3(looper);
        lda.m16127m(str);
        this.f67120b = new qg5(ccdVar, str);
    }

    /* JADX INFO: renamed from: a */
    public static wo3 m24090a(Context context) {
        lda.m16130p(context);
        synchronized (wo3.class) {
            if (f67118c == null) {
                dwb dwbVar = o6d.f53914a;
                synchronized (o6d.class) {
                    if (o6d.f53918e == null) {
                        o6d.f53918e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f67118c = new wo3(context);
            }
        }
        return f67118c;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m24091d(PackageInfo packageInfo, boolean z) {
        zzah zzahVarM5356k;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                zzah zzahVar = z ? m3d.f50552c : m3d.f50551b;
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    zzahVarM5356k = zzah.m5356k();
                } else {
                    bib bibVar = zzah.f11822b;
                    Object[] objArrCopyOf = new Object[4];
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        byte[] byteArray = signingCertificateHistory[i2].toByteArray();
                        byteArray.getClass();
                        int length2 = objArrCopyOf.length;
                        int i4 = i3 + 1;
                        if (i4 < 0) {
                            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                        }
                        if (i4 <= length2) {
                            i = length2;
                        } else {
                            i = (length2 >> 1) + length2 + 1;
                            if (i < i4) {
                                int iHighestOneBit = Integer.highestOneBit(i3);
                                i = iHighestOneBit + iHighestOneBit;
                            }
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                        if (i > length2) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                        }
                        objArrCopyOf[i3] = byteArray;
                        i2++;
                        i3 = i4;
                    }
                    zzahVarM5356k = zzah.m5357l(objArrCopyOf, i3);
                }
                if (zzahVarM5356k.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                zzah zzahVarMo5354i = zzahVarM5356k.mo5354i();
                int size = zzahVarMo5354i.size();
                int i5 = 0;
                while (i5 < size) {
                    byte[] bArr = (byte[]) zzahVarMo5354i.get(i5);
                    bib bibVarM5358m = zzahVar.listIterator(0);
                    do {
                        int i6 = i5 + 1;
                        if (!bibVarM5358m.hasNext()) {
                            i5 = i6;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) bibVarM5358m.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? m24092e(packageInfo, m3d.f50550a) : m24092e(packageInfo, m3d.f50550a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static fnc m24092e(PackageInfo packageInfo, fnc... fncVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            src srcVar = new src(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < fncVarArr.length; i++) {
                if (fncVarArr[i].equals(srcVar)) {
                    return fncVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m24093b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m24091d(packageInfo, false)) {
            return true;
        }
        if (m24091d(packageInfo, true)) {
            if (to3.m22258a((Context) this.f67119a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX INFO: renamed from: c */
    public boolean m24094c(int i) {
        wmd wmdVarM24060g;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = ((Context) this.f67119a).getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            wmdVarM24060g = wmd.m24060g("no pkgs");
        } else {
            boolean z = false;
            int i2 = 0;
            wmdVarM24060g = null;
            while (true) {
                if (i2 >= length) {
                    lda.m16130p(wmdVarM24060g);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    wmdVarM24060g = wmd.m24060g("null pkg");
                } else if (str.equals((String) this.f67120b)) {
                    wmdVarM24060g = wmd.f67075d;
                } else {
                    dwb dwbVar = o6d.f53914a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    boolean z2 = true;
                    try {
                        try {
                            o6d.m17827a();
                            boolean zM13900Q = ((igb) o6d.f53916c).m13900Q();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zM13900Q) {
                                boolean zM22258a = to3.m22258a((Context) this.f67119a);
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    lda.m16130p(o6d.f53918e);
                                    try {
                                        o6d.m17827a();
                                        lda.m16130p(o6d.f53918e);
                                        zzp zzpVar = new zzp(str, zM22258a, false, new lp6(o6d.f53918e), false, true, false);
                                        try {
                                            igb igbVar = (igb) o6d.f53916c;
                                            Parcel parcelM16773J = igbVar.m16773J();
                                            int i3 = zrb.f72016a;
                                            parcelM16773J.writeInt(1);
                                            zzpVar.writeToParcel(parcelM16773J, 0);
                                            Parcel parcelM16771H = igbVar.m16771H(parcelM16773J, 6);
                                            zzr zzrVar = (zzr) zrb.m25756a(parcelM16771H, zzr.CREATOR);
                                            parcelM16771H.recycle();
                                            if (zzrVar.f11765a) {
                                                ycd.m25072b(zzrVar.f11768d);
                                                String str2 = null;
                                                wmdVarM24060g = new wmd(z2, str2, str2);
                                            } else {
                                                String str3 = zzrVar.f11766b;
                                                PackageManager.NameNotFoundException nameNotFoundException = dfd.m10325b(zzrVar.f11767c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str3 == null) {
                                                    str3 = "error checking package certificate";
                                                }
                                                ycd.m25072b(zzrVar.f11768d);
                                                dfd.m10325b(zzrVar.f11767c);
                                                wmdVarM24060g = new wmd(z, str3, nameNotFoundException);
                                            }
                                        } catch (RemoteException e) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                            wmdVarM24060g = wmd.m24061h("module call", e);
                                        }
                                    } catch (DynamiteModule$LoadingException e2) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        wmdVarM24060g = wmd.m24061h("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = ((Context) this.f67119a).getPackageManager().getPackageInfo(str, 134217792);
                                    boolean zM22258a2 = to3.m22258a((Context) this.f67119a);
                                    if (packageInfo == null) {
                                        wmdVarM24060g = wmd.m24060g("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != z2) {
                                            wmdVarM24060g = wmd.m24060g("single cert required");
                                        } else {
                                            src srcVar = new src(packageInfo.signatures[0].toByteArray());
                                            String str4 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                wmd wmdVarM17828b = o6d.m17828b(str4, srcVar, zM22258a2, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (!wmdVarM17828b.f67076a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                                    wmdVarM24060g = wmdVarM17828b;
                                                } else {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        wmd wmdVarM17828b2 = o6d.m17828b(str4, srcVar, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (wmdVarM17828b2.f67076a) {
                                                            wmdVarM24060g = wmd.m24060g("debuggable release cert app rejected");
                                                        } else {
                                                            wmdVarM24060g = wmdVarM17828b;
                                                        }
                                                    } catch (Throwable th2) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th3;
                                            }
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    wmdVarM24060g = wmd.m24061h("no pkg ".concat(str), e3);
                                }
                            }
                        } catch (RemoteException | DynamiteModule$LoadingException e4) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        if (wmdVarM24060g.f67076a) {
                            this.f67120b = str;
                        }
                    } catch (Throwable th4) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th4;
                    }
                }
                if (wmdVarM24060g.f67076a) {
                    break;
                }
                i2++;
            }
        }
        if (!wmdVarM24060g.f67076a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th5 = (Throwable) wmdVarM24060g.f67078c;
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", wmdVarM24060g.mo13338f(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", wmdVarM24060g.mo13338f());
            }
        }
        return wmdVarM24060g.f67076a;
    }

    public wo3(Context context) {
        this.f67119a = context.getApplicationContext();
    }
}
