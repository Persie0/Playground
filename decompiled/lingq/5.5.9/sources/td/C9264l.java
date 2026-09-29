package td;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p290o6.C7967l0;

/* JADX INFO: renamed from: td.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9264l {

    /* JADX INFO: renamed from: a */
    public static final C7967l0 f47966a = new C7967l0("PhoneskyVerificationUtils");

    /* JADX INFO: renamed from: a */
    public static boolean m17624a(Context context) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        return packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17625b(Context context) {
        String strEncodeToString;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            strEncodeToString = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                            if (Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) {
                                if (!"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                                }
                            }
                        }
                        return true;
                    }
                }
                f47966a.m15815p("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }
}
