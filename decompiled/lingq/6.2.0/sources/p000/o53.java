package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o53 implements n53 {

    /* JADX INFO: renamed from: a */
    public final String f53859a;

    /* JADX INFO: renamed from: b */
    public final int f53860b;

    public o53(String str, int i) {
        this.f53859a = str;
        this.f53860b = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17803a() {
        if (this.f53860b != 0) {
            String strTrim = m17806d().trim();
            if (zg1.f71515e.matcher(strTrim).matches()) {
                return true;
            }
            if (!zg1.f71516f.matcher(strTrim).matches()) {
                C3386nv.m17626m(wq1.m24118n("[Value: ", strTrim, "] cannot be converted to a boolean."));
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final double m17804b() {
        if (this.f53860b == 0) {
            return 0.0d;
        }
        String strTrim = m17806d().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(wq1.m24118n("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m17805c() {
        if (this.f53860b == 0) {
            return 0L;
        }
        String strTrim = m17806d().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(wq1.m24118n("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m17806d() {
        return this.f53860b == 0 ? "" : this.f53859a;
    }
}
