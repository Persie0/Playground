package p021j$.time.format;

import p021j$.time.temporal.EnumC0472a;

/* JADX INFO: renamed from: j$.time.format.m */
/* JADX INFO: loaded from: classes3.dex */
final class C0445m implements InterfaceC0439g {

    /* JADX INFO: renamed from: d */
    static final String[] f32951d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e */
    static final C0445m f32952e = new C0445m("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: a */
    private final String f32953a;

    /* JADX INFO: renamed from: b */
    private final int f32954b;

    /* JADX INFO: renamed from: c */
    private final int f32955c;

    static {
        new C0445m("+HH:MM:ss", "0");
    }

    C0445m(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("pattern");
        }
        int i = 0;
        while (true) {
            String[] strArr = f32951d;
            if (i >= 22) {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
            if (strArr[i].equals(str)) {
                this.f32954b = i;
                this.f32955c = i % 11;
                this.f32953a = str2;
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m12284b(boolean z, int i, StringBuilder sb) {
        sb.append(z ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        Long lM12313e = c0455w.m12313e(EnumC0472a.OFFSET_SECONDS);
        boolean z = false;
        if (lM12313e == null) {
            return false;
        }
        long jLongValue = lM12313e.longValue();
        int i = (int) jLongValue;
        if (jLongValue != i) {
            throw new ArithmeticException();
        }
        if (i == 0) {
            sb.append(this.f32953a);
        } else {
            int iAbs = Math.abs((i / 3600) % 100);
            int iAbs2 = Math.abs((i / 60) % 60);
            int iAbs3 = Math.abs(i % 60);
            int length = sb.length();
            sb.append(i < 0 ? "-" : "+");
            if ((this.f32954b < 11) || iAbs >= 10) {
                m12284b(false, iAbs, sb);
            } else {
                sb.append((char) (iAbs + 48));
            }
            int i2 = this.f32955c;
            if ((i2 >= 3 && i2 <= 8) || ((i2 >= 9 && iAbs3 > 0) || (i2 >= 1 && iAbs2 > 0))) {
                m12284b(i2 > 0 && i2 % 2 == 0, iAbs2, sb);
                iAbs += iAbs2;
                if (i2 == 7 || i2 == 8 || (i2 >= 5 && iAbs3 > 0)) {
                    if (i2 > 0 && i2 % 2 == 0) {
                        z = true;
                    }
                    m12284b(z, iAbs3, sb);
                    iAbs += iAbs3;
                }
            }
            if (iAbs == 0) {
                sb.setLength(length);
                sb.append(this.f32953a);
            }
        }
        return true;
    }

    public final String toString() {
        String strReplace = this.f32953a.replace("'", "''");
        return "Offset(" + f32951d[this.f32954b] + ",'" + strReplace + "')";
    }
}
