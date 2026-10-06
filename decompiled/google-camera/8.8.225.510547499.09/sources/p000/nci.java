package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum nci {
    STRING('s', nck.GENERAL, "-#", true),
    BOOLEAN('b', nck.BOOLEAN, "-", true),
    CHAR('c', nck.CHARACTER, "-", true),
    DECIMAL('d', nck.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', nck.INTEGRAL, "-#0(", false),
    HEX('x', nck.INTEGRAL, "-#0(", true),
    FLOAT('f', nck.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', nck.FLOAT, "-#0+ (", true),
    GENERAL('g', nck.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', nck.FLOAT, "-#0+ ", true);


    /* JADX INFO: renamed from: k */
    public static final nci[] f41998k = new nci[26];

    /* JADX INFO: renamed from: l */
    public final char f42000l;

    /* JADX INFO: renamed from: m */
    public final nck f42001m;

    /* JADX INFO: renamed from: n */
    public final int f42002n;

    /* JADX INFO: renamed from: o */
    public final String f42003o;

    static {
        for (nci nciVar : values()) {
            f41998k[m17330a(nciVar.f42000l)] = nciVar;
        }
    }

    nci(char c, nck nckVar, String str, boolean z) {
        this.f42000l = c;
        this.f42001m = nckVar;
        ncj ncjVar = ncj.f42004a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iM17331a = ncj.m17331a(str.charAt(i2));
            if (iM17331a < 0) {
                throw new IllegalArgumentException(xRFdVyfdeve.fhZLjogUkD.concat(str));
            }
            i |= 1 << iM17331a;
        }
        this.f42002n = i;
        this.f42003o = "%" + c;
    }

    /* JADX INFO: renamed from: a */
    public static int m17330a(char c) {
        return (c | ' ') - 97;
    }
}
