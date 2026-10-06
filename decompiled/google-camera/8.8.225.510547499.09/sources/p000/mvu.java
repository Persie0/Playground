package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mvu implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Comparator f41685a;

    /* JADX INFO: renamed from: b */
    public final boolean f41686b;

    /* JADX INFO: renamed from: c */
    public final Object f41687c;

    /* JADX INFO: renamed from: d */
    public final boolean f41688d;

    /* JADX INFO: renamed from: e */
    public final Object f41689e;

    /* JADX INFO: renamed from: f */
    public final int f41690f;

    /* JADX INFO: renamed from: g */
    public final int f41691g;

    public mvu(Comparator comparator, boolean z, Object obj, int i, boolean z2, Object obj2, int i2) {
        comparator.getClass();
        this.f41685a = comparator;
        this.f41686b = z;
        this.f41688d = z2;
        this.f41687c = obj;
        this.f41690f = i;
        this.f41689e = obj2;
        this.f41691g = i2;
        if (z) {
            comparator.compare(obj, obj);
        }
        if (z2) {
            comparator.compare(obj2, obj2);
        }
        if (z && z2) {
            int iCompare = comparator.compare(obj, obj2);
            boolean z3 = false;
            lku.m15610E(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                if (i != 1 || i2 != 1) {
                    z3 = true;
                }
                lku.m15669w(z3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static mvu m17033a(Comparator comparator) {
        return new mvu(comparator, false, null, 1, false, null, 1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX INFO: renamed from: b */
    final mvu m17034b(mvu mvuVar) {
        int iCompare;
        boolean z;
        boolean z2;
        Object obj;
        int i;
        int iCompare2;
        boolean z3;
        Object obj2;
        Object obj3;
        int i2;
        int i3;
        lku.m15669w(this.f41685a.equals(mvuVar.f41685a));
        boolean z4 = this.f41686b;
        Object obj4 = this.f41687c;
        int i4 = this.f41690f;
        if (z4) {
            if (mvuVar.f41686b && ((iCompare = this.f41685a.compare(obj4, mvuVar.f41687c)) < 0 || (iCompare == 0 && mvuVar.f41690f == 1))) {
                obj4 = mvuVar.f41687c;
                i4 = mvuVar.f41690f;
                z = z4;
            }
            z2 = this.f41688d;
            obj = this.f41689e;
            i = this.f41691g;
            if (!z2) {
                if (!mvuVar.f41688d && ((iCompare2 = this.f41685a.compare(obj, mvuVar.f41689e)) > 0 || (iCompare2 == 0 && mvuVar.f41691g == 1))) {
                    Object obj5 = mvuVar.f41689e;
                    i = mvuVar.f41691g;
                    z3 = z2;
                    obj2 = obj5;
                }
                if (z || !z3) {
                    obj3 = obj4;
                    i2 = i4;
                    i3 = i;
                } else {
                    int iCompare3 = this.f41685a.compare(obj4, obj2);
                    if (iCompare3 > 0) {
                        obj3 = obj2;
                        i2 = 1;
                    } else if (iCompare3 != 0 || i4 != 1) {
                        obj3 = obj4;
                        i2 = i4;
                        i3 = i;
                    } else if (i == 1) {
                        obj3 = obj2;
                        i2 = 1;
                        i3 = 2;
                    } else {
                        obj3 = obj4;
                        i2 = i4;
                    }
                    i3 = 2;
                }
                return new mvu(this.f41685a, z, obj3, i2, z3, obj2, i3);
            }
            z2 = mvuVar.f41688d;
            obj = mvuVar.f41689e;
            i = mvuVar.f41691g;
            z3 = z2;
            obj2 = obj;
            if (z) {
                obj3 = obj4;
                i2 = i4;
                i3 = i;
            } else {
                obj3 = obj4;
                i2 = i4;
                i3 = i;
            }
            return new mvu(this.f41685a, z, obj3, i2, z3, obj2, i3);
        }
        z4 = mvuVar.f41686b;
        obj4 = mvuVar.f41687c;
        i4 = mvuVar.f41690f;
        z = z4;
        z2 = this.f41688d;
        obj = this.f41689e;
        i = this.f41691g;
        if (!z2) {
            if (!mvuVar.f41688d) {
            }
            if (z) {
                obj3 = obj4;
                i2 = i4;
                i3 = i;
            } else {
                obj3 = obj4;
                i2 = i4;
                i3 = i;
            }
            return new mvu(this.f41685a, z, obj3, i2, z3, obj2, i3);
        }
        z2 = mvuVar.f41688d;
        obj = mvuVar.f41689e;
        i = mvuVar.f41691g;
        z3 = z2;
        obj2 = obj;
        if (z) {
            obj3 = obj4;
            i2 = i4;
            i3 = i;
        } else {
            obj3 = obj4;
            i2 = i4;
            i3 = i;
        }
        return new mvu(this.f41685a, z, obj3, i2, z3, obj2, i3);
    }

    /* JADX INFO: renamed from: c */
    final boolean m17035c(Object obj) {
        return (m17037e(obj) || m17036d(obj)) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    final boolean m17036d(Object obj) {
        if (!this.f41688d) {
            return false;
        }
        int iCompare = this.f41685a.compare(obj, this.f41689e);
        return ((iCompare == 0) & (this.f41691g == 1)) | (iCompare > 0);
    }

    /* JADX INFO: renamed from: e */
    final boolean m17037e(Object obj) {
        if (!this.f41686b) {
            return false;
        }
        int iCompare = this.f41685a.compare(obj, this.f41687c);
        return ((iCompare == 0) & (this.f41690f == 1)) | (iCompare < 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mvu) {
            mvu mvuVar = (mvu) obj;
            if (this.f41685a.equals(mvuVar.f41685a) && this.f41686b == mvuVar.f41686b && this.f41688d == mvuVar.f41688d && this.f41690f == mvuVar.f41690f && this.f41691g == mvuVar.f41691g && mpw.m16768g(this.f41687c, mvuVar.f41687c) && mpw.m16768g(this.f41689e, mvuVar.f41689e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41685a, this.f41687c, Integer.valueOf(this.f41690f), this.f41689e, Integer.valueOf(this.f41691g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41685a);
        sb.append(":");
        sb.append(this.f41690f == 2 ? '[' : '(');
        sb.append(this.f41686b ? this.f41687c : "-∞");
        sb.append(',');
        sb.append(this.f41688d ? this.f41689e : "∞");
        sb.append(this.f41691g == 2 ? ']' : ')');
        return sb.toString();
    }
}
