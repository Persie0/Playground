package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpb {

    /* JADX INFO: renamed from: A */
    private final boolean f36764A;

    /* JADX INFO: renamed from: B */
    private final boolean f36765B;

    /* JADX INFO: renamed from: C */
    private final boolean f36766C;

    /* JADX INFO: renamed from: D */
    private final boolean f36767D;

    /* JADX INFO: renamed from: a */
    public final boolean f36768a;

    /* JADX INFO: renamed from: b */
    public final boolean f36769b;

    /* JADX INFO: renamed from: c */
    public final boolean f36770c;

    /* JADX INFO: renamed from: d */
    public final boolean f36771d;

    /* JADX INFO: renamed from: e */
    public final boolean f36772e;

    /* JADX INFO: renamed from: f */
    public final boolean f36773f;

    /* JADX INFO: renamed from: g */
    public final boolean f36774g;

    /* JADX INFO: renamed from: h */
    public final boolean f36775h;

    /* JADX INFO: renamed from: i */
    public final boolean f36776i;

    /* JADX INFO: renamed from: j */
    public final boolean f36777j;

    /* JADX INFO: renamed from: k */
    public final boolean f36778k;

    /* JADX INFO: renamed from: l */
    public final boolean f36779l;

    /* JADX INFO: renamed from: m */
    public final boolean f36780m;

    /* JADX INFO: renamed from: n */
    public final boolean f36781n;

    /* JADX INFO: renamed from: o */
    public final boolean f36782o;

    /* JADX INFO: renamed from: p */
    private final boolean f36783p;

    /* JADX INFO: renamed from: q */
    private final boolean f36784q;

    /* JADX INFO: renamed from: r */
    private final boolean f36785r;

    /* JADX INFO: renamed from: s */
    private final boolean f36786s;

    /* JADX INFO: renamed from: t */
    private final boolean f36787t;

    /* JADX INFO: renamed from: u */
    private final boolean f36788u;

    /* JADX INFO: renamed from: v */
    private final boolean f36789v;

    /* JADX INFO: renamed from: w */
    private final boolean f36790w;

    /* JADX INFO: renamed from: x */
    private final boolean f36791x;

    /* JADX INFO: renamed from: y */
    private final boolean f36792y;

    /* JADX INFO: renamed from: z */
    private final boolean f36793z;

    private kpb(long j) {
        this.f36768a = j == -8977428044353436645L;
        this.f36769b = j == -5238078545268050332L;
        this.f36784q = j == 2353878190013225779L;
        this.f36783p = j == 5177423953723387160L;
        this.f36785r = j == 1998349393618216766L;
        this.f36786s = j == -3048193804805810922L;
        this.f36787t = j == -1134170917312626182L;
        this.f36788u = j == 7819589124620182093L;
        this.f36789v = j == 1863053326329578117L;
        this.f36790w = j == -6540513541338685385L;
        this.f36791x = j == 8020350475331722164L;
        this.f36792y = j == 4736388726057620427L;
        this.f36793z = j == 1128693008105137506L;
        this.f36770c = j == 8617630140713188829L;
        this.f36771d = j == -2165063365505996463L;
        this.f36772e = j == -6176613516764112573L;
        this.f36764A = j == 8476275058780644385L;
        this.f36773f = j == -5619725207126906835L;
        this.f36765B = j == -1152407906810979636L;
        this.f36774g = j == 4003097551557419468L;
        this.f36775h = j == -3704938238089310216L;
        this.f36776i = j == -1280572264377593363L;
        this.f36777j = j == -381037733589485599L;
        this.f36778k = j == -1047407971738119953L;
        this.f36779l = j == -8855284661636827676L;
        this.f36780m = j == -8315270892160693163L;
        this.f36767D = j == -7371889686577558909L;
        this.f36766C = j == -2846298906185802293L;
        this.f36781n = j == 8742890211663261537L;
        this.f36782o = j == 6662093836018699494L;
    }

    /* JADX INFO: renamed from: a */
    public static kpb m14660a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.FINGERPRINT;
        String strM14661k = m14661k(str);
        String strM14661k2 = m14661k(str2);
        String strM14661k3 = m14661k(str3);
        if (strM14661k2.startsWith("GENERIC") || strM14661k3.startsWith("GENERIC") || strM14661k3.contains("SDK_") || strM14661k3.contains("_SDK")) {
            return new kpb(-8977428044353436645L);
        }
        String str4 = "G1V5VHBME0Mq6trmUxb9Q9URJXm0Sof1|" + strM14661k2 + "|" + strM14661k;
        int i = nff.f42172a;
        nfd nfdVar = nfe.f42171a;
        String upperCase = str4.toUpperCase(Locale.ROOT);
        int length = upperCase.length();
        int i2 = length + length;
        lku.m15672z(i2 >= 0, "expectedInputSize must be >= 0 but was %s", i2);
        nea neaVarA = ((nfa) nfdVar).mo17442a();
        int length2 = upperCase.length();
        for (int i3 = 0; i3 < length2; i3++) {
            nez nezVar = (nez) neaVarA;
            nezVar.f42160a.putChar(upperCase.charAt(i3));
            try {
                ((nez) neaVarA).mo17431u(((nez) neaVarA).f42160a.array());
                nezVar.f42160a.clear();
            } catch (Throwable th) {
                nezVar.f42160a.clear();
                throw th;
            }
        }
        nfg nfgVar = (nfg) neaVarA;
        nfgVar.m17443v();
        nfgVar.f42175d = true;
        nfb nfbVar = (nfb) (nfgVar.f42174c == nfgVar.f42173b.getDigestLength() ? nfc.m17441f(nfgVar.f42173b.digest()) : nfc.m17441f(Arrays.copyOf(nfgVar.f42173b.digest(), nfgVar.f42174c)));
        int length3 = nfbVar.f42168a.length;
        lku.m15615J(length3 >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length3);
        long j = nfbVar.f42168a[0] & 255;
        for (int i4 = 1; i4 < Math.min(nfbVar.f42168a.length, 8); i4++) {
            j |= (((long) nfbVar.f42168a[i4]) & 255) << (i4 * 8);
        }
        return new kpb(j);
    }

    /* JADX INFO: renamed from: k */
    private static String m14661k(String str) {
        return str == null ? "unknown" : str.toUpperCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14662b() {
        return this.f36778k || this.f36779l || this.f36780m;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14663c() {
        return this.f36784q || this.f36783p;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14664d() {
        return this.f36785r || this.f36786s;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m14665e() {
        return this.f36788u || this.f36787t;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m14666f() {
        return this.f36791x || this.f36792y || this.f36793z;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m14667g() {
        return this.f36789v || this.f36790w;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14668h() {
        return this.f36771d || this.f36772e;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m14669i() {
        return this.f36764A || this.f36765B || this.f36774g || this.f36775h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m14670j() {
        return this.f36766C || this.f36767D;
    }
}
