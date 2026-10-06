package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gun {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f26442a = 0;

    /* JADX INFO: renamed from: b */
    private static final nbh f26443b = nbh.m17259h("com/google/android/apps/camera/remotecontrol/SignatureValidator");

    /* JADX INFO: renamed from: c */
    private static final String[] f26444c = {"13:86:84:D0:65:DB:A8:0B:62:77:7E:2C:E3:5E:08:1A:97:22:BC:0E:43:F1:39:0E:CA:11:DC:20:AA:BE:B2:B5"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX INFO: renamed from: a */
    public static final boolean m9780a(String str, PackageManager packageManager) {
        String strM17454f;
        boolean z;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Signature[] signingCertificateHistory = packageInfo.signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory.length == 0) {
                ((nbe) ((nbe) f26443b.m17251b()).mo17276G((char) 3275)).mo17290o("Unsigned package");
                strM17454f = "";
            } else {
                byte[] bArrDigest = messageDigest.digest(signingCertificateHistory[0].toByteArray());
                nfp nfpVar = nfp.f42200e;
                nfp nflVar = ((nfo) nfpVar).f42199d;
                if (nflVar == null) {
                    nfk nfkVar = ((nfo) nfpVar).f42197b;
                    for (char c : nfkVar.f42186b) {
                        if (mpw.m16771j(c)) {
                            char[] cArr = nfkVar.f42186b;
                            int length = cArr.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    z = false;
                                    break;
                                }
                                if (mpw.m16772k(cArr[i])) {
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                            lku.m15614I(!z, "Cannot call upperCase() on a mixed-case alphabet");
                            char[] cArr2 = new char[nfkVar.f42186b.length];
                            int i2 = 0;
                            while (true) {
                                char[] cArr3 = nfkVar.f42186b;
                                if (i2 >= cArr3.length) {
                                    break;
                                }
                                char c2 = cArr3[i2];
                                if (mpw.m16771j(c2)) {
                                    c2 ^= 32;
                                }
                                cArr2[i2] = (char) c2;
                                i2++;
                            }
                            nfk nfkVar2 = new nfk(nfkVar.f42185a.concat(".upperCase()"), cArr2);
                            if (nfkVar.f42193i && !nfkVar2.f42193i) {
                                byte[] bArr = nfkVar2.f42191g;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (int i3 = 65; i3 <= 90; i3++) {
                                    int i4 = i3 | 32;
                                    byte[] bArr2 = nfkVar2.f42191g;
                                    byte b = bArr2[i3];
                                    byte b2 = bArr2[i4];
                                    if (b == -1) {
                                        bArrCopyOf[i3] = b2;
                                    } else {
                                        char c3 = (char) i3;
                                        char c4 = (char) i4;
                                        if (b2 != -1) {
                                            throw new IllegalStateException(lku.m15665s("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                                        }
                                        bArrCopyOf[i4] = b;
                                    }
                                }
                                nfkVar = new nfk(nfkVar2.f42185a.concat(".ignoreCase()"), nfkVar2.f42186b, bArrCopyOf, true);
                                break;
                            }
                            nfkVar = nfkVar2;
                            break;
                        }
                    }
                    if (nfkVar == ((nfo) nfpVar).f42197b) {
                        nflVar = nfpVar;
                    } else {
                        Character ch = ((nfo) nfpVar).f42198c;
                        nflVar = new nfl(nfkVar);
                    }
                    ((nfo) nfpVar).f42199d = nflVar;
                }
                for (int i5 = 0; i5 <= 0; i5++) {
                    lku.m15607B(!((nfo) nflVar).f42197b.m17448c(":".charAt(i5)), "Separator (%s) cannot contain alphabet characters", ":");
                }
                Character ch2 = ((nfo) nflVar).f42198c;
                if (ch2 != null) {
                    ch2.charValue();
                    lku.m15607B(":".indexOf(61) < 0, "Separator (%s) cannot contain padding character", ":");
                }
                strM17454f = new nfn(nflVar).m17454f(bArrDigest);
            }
            String[] strArr = f26444c;
            for (int i6 = 0; i6 <= 0; i6++) {
                if (strArr[i6].equals(strM17454f)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e) {
            ((nbe) ((nbe) ((nbe) f26443b.m17251b()).mo17283h(e)).mo17276G((char) 3277)).mo17293r("Error validating package %s", str);
        }
        ((nbe) ((nbe) f26443b.m17251b()).mo17276G((char) 3278)).mo17293r("Validation failed for %s", str);
        return false;
    }
}
