package androidx.compose.p017ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0618e extends AbstractC0601a {

    /* JADX INFO: renamed from: c */
    public static C0618e f4305c;

    public C0618e(int i10) {
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0621f
    /* JADX INFO: renamed from: a */
    public final int[] mo2335a(int i10) {
        int length = m2327d().length();
        if (length > 0 && i10 < length) {
            if (i10 < 0) {
                i10 = 0;
            }
            while (i10 < length && m2327d().charAt(i10) == '\n' && !m2349f(i10)) {
                i10++;
            }
            if (i10 >= length) {
                return null;
            }
            int i11 = i10 + 1;
            while (i11 < length && !m2348e(i11)) {
                i11++;
            }
            return m2326c(i10, i11);
        }
        return null;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0621f
    /* JADX INFO: renamed from: b */
    public final int[] mo2336b(int i10) {
        int length = m2327d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0) {
            int i11 = i10 - 1;
            if (m2327d().charAt(i11) != '\n' || m2348e(i10)) {
                break;
            }
            i10 = i11;
        }
        if (i10 <= 0) {
            return null;
        }
        int i12 = i10 - 1;
        while (i12 > 0 && !m2349f(i12)) {
            i12--;
        }
        return m2326c(i12, i10);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2348e(int i10) {
        if (i10 <= 0 || m2327d().charAt(i10 - 1) == '\n' || (i10 != m2327d().length() && m2327d().charAt(i10) != '\n')) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: f */
    public final boolean m2349f(int i10) {
        boolean z10;
        if (m2327d().charAt(i10) != '\n') {
            z10 = true;
            if (i10 != 0 && m2327d().charAt(i10 - 1) != '\n') {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return z10;
    }
}
