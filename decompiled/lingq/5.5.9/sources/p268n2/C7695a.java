package p268n2;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;

/* JADX INFO: renamed from: n2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7695a {
    /* JADX INFO: renamed from: a */
    public static Signature[] m15286a(SigningInfo signingInfo) {
        return signingInfo.getApkContentsSigners();
    }

    /* JADX INFO: renamed from: b */
    public static long m15287b(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* JADX INFO: renamed from: c */
    public static Signature[] m15288c(SigningInfo signingInfo) {
        return signingInfo.getSigningCertificateHistory();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15289d(SigningInfo signingInfo) {
        return signingInfo.hasMultipleSigners();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m15290e(PackageManager packageManager, String str, byte[] bArr, int i10) {
        return packageManager.hasSigningCertificate(str, bArr, i10);
    }
}
