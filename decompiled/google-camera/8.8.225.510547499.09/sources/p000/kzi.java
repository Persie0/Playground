package p000;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kzi {

    /* JADX INFO: renamed from: a */
    public final nnb f37770a;

    protected kzi(int[] iArr) {
        lku.m15669w(true);
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            if (i2 < 0) {
                throw new IllegalArgumentException("One dimension is < 0: " + i2);
            }
        }
        this.f37770a = new nnb(Arrays.copyOf(iArr, 2));
    }

    /* JADX INFO: renamed from: d */
    public static kzh m15087d(int i, int i2) {
        return new kzh(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final int m15088a() {
        nnb nnbVar = this.f37770a;
        if (nnbVar.f43928a > 1) {
            return nnbVar.m17515a(1);
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final int m15089b() {
        return this.f37770a.m17515a(0);
    }

    /* JADX INFO: renamed from: c */
    public final kzh m15090c() {
        int i = this.f37770a.f43928a;
        if (i == 2) {
            return m15087d(m15089b(), m15088a());
        }
        throw new IllegalArgumentException("Attempting to convert " + i + "D size to 2D!");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kzi) {
            return this.f37770a.equals(((kzi) obj).f37770a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37770a.hashCode();
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        nnb nnbVar = this.f37770a;
        int iM17515a = 0;
        objArr[0] = nnbVar;
        if (nnbVar.f43928a != 0) {
            iM17515a = nnbVar.m17515a(0);
            int i = 1;
            while (true) {
                nnb nnbVar2 = this.f37770a;
                if (i >= nnbVar2.f43928a) {
                    break;
                }
                iM17515a *= nnbVar2.m17515a(i);
                i++;
            }
        }
        objArr[1] = Integer.valueOf(iM17515a);
        return String.format(locale, "Dimensions = %s, Volume = %d)", objArr);
    }
}
