package p000;

/* JADX INFO: renamed from: p3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3446p3 extends AbstractC3284l3 {

    /* JADX INFO: renamed from: c */
    public static C3446p3 f55505c;

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: e */
    public final int[] mo15760e(int i) {
        int length = m15763h().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m15763h().charAt(i) == '\n' && (m15763h().charAt(i) == '\n' || (i != 0 && m15763h().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m18862m(i2)) {
            i2++;
        }
        return m15762g(i, i2);
    }

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: k */
    public final int[] mo15766k(int i) {
        int length = m15763h().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m15763h().charAt(i - 1) == '\n' && !m18862m(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (m15763h().charAt(i2) == '\n' || (i2 != 0 && m15763h().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return m15762g(i2, i);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m18862m(int i) {
        if (i <= 0 || m15763h().charAt(i - 1) == '\n') {
            return false;
        }
        return i == m15763h().length() || m15763h().charAt(i) == '\n';
    }
}
