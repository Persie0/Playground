package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o02 {

    /* JADX INFO: renamed from: b */
    public static final yq1 f53503b = new yq1();

    /* JADX INFO: renamed from: c */
    public static final String f53504c = m17719a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: d */
    public static final String f53505d = m17719a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: e */
    public static final C3386nv f53506e = new C3386nv(22);

    /* JADX INFO: renamed from: a */
    public final v68 f53507a;

    public o02(v68 v68Var) {
        this.f53507a = v68Var;
    }

    /* JADX INFO: renamed from: a */
    public static String m17719a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            C3386nv.m17626m("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
