package p000;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class lnv extends lnx {

    /* JADX INFO: renamed from: a */
    private final Random f38783a;

    /* JADX INFO: renamed from: b */
    private final ksi f38784b;

    /* JADX INFO: renamed from: c */
    private final long f38785c;

    /* JADX INFO: renamed from: d */
    private final lnm f38786d;

    public lnv(pas pasVar, Random random, lnm lnmVar, ksi ksiVar) {
        super(pasVar);
        this.f38783a = random;
        this.f38785c = pasVar.f47272b;
        this.f38786d = lnmVar;
        this.f38784b = ksiVar;
    }

    @Override // p000.lnx
    /* JADX INFO: renamed from: a */
    public final long mo15774a(String str) {
        long j;
        if (mro.m16832b(str)) {
            j = this.f38785c;
        } else {
            lnm lnmVar = this.f38786d;
            long jMo14816b = this.f38784b.mo14816b() - lnmVar.f38762d;
            if (jMo14816b >= 14400000) {
                long j2 = jMo14816b / 14400000;
                long jMax = Math.max(j2, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = lnmVar.f38759a;
                    int i2 = (int) jMax;
                    int i3 = sArr[i] >> i2;
                    sArr[i] = (short) i3;
                    lnmVar.f38760b[i] = (short) (i3 >> i2);
                }
                lnmVar.f38762d += j2 * 14400000;
            }
            int iHashCode = str.hashCode() * lnmVar.f38761c;
            int iCharAt = ((iHashCode >>> 24) + (str.isEmpty() ? (char) 0 : str.charAt(0))) & 255;
            int length = ((iHashCode >>> 16) + str.length()) & 255;
            int iMin = Math.min((int) lnmVar.f38759a[iCharAt], (int) lnmVar.f38760b[length]);
            int i4 = iMin + 1;
            short sMin = (short) Math.min(32767, i4);
            short[] sArr2 = lnmVar.f38759a;
            if (sArr2[iCharAt] == iMin) {
                sArr2[iCharAt] = sMin;
            }
            short[] sArr3 = lnmVar.f38760b;
            if (sArr3[length] == iMin) {
                sArr3[length] = sMin;
            }
            double dSqrt = i4 < 50 ? Math.sqrt(i4) : i4;
            double d = this.f38785c;
            Double.isNaN(d);
            j = (int) (d / dSqrt);
        }
        if (this.f38783a.nextDouble() * 1000.0d < j) {
            return j;
        }
        return -1L;
    }

    @Override // p000.lnx
    /* JADX INFO: renamed from: b */
    public final pas mo15775b(Long l) {
        return mo15776c() ? m15779e(l) : m15778d();
    }

    @Override // p000.lnx
    /* JADX INFO: renamed from: c */
    public final boolean mo15776c() {
        return this.f38785c > 0;
    }
}
