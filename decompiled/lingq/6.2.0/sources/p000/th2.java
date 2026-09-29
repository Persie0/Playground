package p000;

/* JADX INFO: loaded from: classes.dex */
public final class th2 {

    /* JADX INFO: renamed from: a */
    public final sh2 f62273a;

    static {
        new th2("", 0, 0);
    }

    public th2(String str, int i, int i2) {
        this.f62273a = new sh2(str, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static th2 m22035a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String string;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder sbM22994q = ux5.m22994q(i8, i7, "M0,", " A", ",");
            hn1.m13360j(i8, i, " 0 1,1 ", ",", sbM22994q);
            hn1.m13360j(i8, i7, " A", ",", sbM22994q);
            sbM22994q.append(i8);
            sbM22994q.append(" 0 1,1 0,");
            sbM22994q.append(i8);
            sbM22994q.append(" Z");
            string = sbM22994q.toString();
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i / 2, i2 / 2);
            int iMin2 = Math.min(iMin, i3);
            int iMin3 = Math.min(iMin, i4);
            int iMin4 = Math.min(iMin, i5);
            int iMin5 = Math.min(iMin, i6);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                wq1.m24127w(iMin3, iMin3, " A ", ",", sb);
                wq1.m24127w(i, iMin3, " 0 0,1 ", ",", sb);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(",");
            sb.append(i2 - iMin4);
            if (iMin4 > 0) {
                wq1.m24127w(iMin4, iMin4, " A ", ",", sb);
                sb.append(" 0 0,1 ");
                sb.append(i - iMin4);
                sb.append(",");
                sb.append(i2);
            }
            wq1.m24127w(iMin5, i2, " L ", ",", sb);
            if (iMin5 > 0) {
                wq1.m24127w(iMin5, iMin5, " A ", ",", sb);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - iMin5);
            }
            if (iMin2 > 0) {
                wq1.m24127w(iMin2, iMin2, " L 0,", " A ", sb);
                wq1.m24127w(iMin2, iMin2, ",", " 0 0,1 ", sb);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new th2(string, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof th2) {
            return this.f62273a.equals(((th2) obj).f62273a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f62273a.hashCode();
    }

    public final String toString() {
        return this.f62273a.toString();
    }
}
