package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class luo {

    /* JADX INFO: renamed from: a */
    public String f39239a = "";

    /* JADX INFO: renamed from: b */
    public String f39240b = "";

    /* JADX INFO: renamed from: c */
    public lum f39241c = lum.OPEN;

    /* JADX INFO: renamed from: d */
    public Boolean f39242d = false;

    /* JADX INFO: renamed from: a */
    public static String m16013a(String str) {
        return "\"" + str + "\"";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16014b(String str) {
        for (char c : str.toCharArray()) {
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                    break;
                case ':':
                case ';':
                case '<':
                case '=':
                case '>':
                case '?':
                case '@':
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16015c(String str, int i, int i2) {
        return str.length() >= i && str.length() <= i2;
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("ssid", this.f39239a);
        mrlVarM16765d.m16823b("password", this.f39240b);
        mrlVarM16765d.m16823b("encryption", this.f39241c);
        return mrlVarM16765d.toString();
    }
}
