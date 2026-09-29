package re;

import p150h9.C5931p;
import p298oe.C8038a;

/* JADX INFO: renamed from: re.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8770a {

    /* JADX INFO: renamed from: b */
    public static final C8038a f46490b = new C8038a();

    /* JADX INFO: renamed from: c */
    public static final String f46491c = m17018a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: d */
    public static final String f46492d = m17018a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: e */
    public static final C5931p f46493e = new C5931p(23);

    /* JADX INFO: renamed from: a */
    public final C8772c f46494a;

    public C8770a(C8772c c8772c) {
        this.f46494a = c8772c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static String m17018a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }
}
