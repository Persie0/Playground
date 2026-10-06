package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.io.Serializable;

/* JADX INFO: renamed from: t */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1003t implements Serializable, InterfaceC0841n {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    private final int f47632a;

    /* JADX INFO: renamed from: b */
    private final boolean f47633b;

    /* JADX INFO: renamed from: c */
    private final boolean f47634c;

    /* JADX INFO: renamed from: d */
    private final double f47635d;

    /* JADX INFO: renamed from: e */
    private final double f47636e;

    /* JADX INFO: renamed from: f */
    private final long[] f47637f;

    /* JADX INFO: renamed from: g */
    private final int f47638g;

    public C1003t(int i, boolean z, int i2, boolean z2, double d, double d2, long[] jArr) {
        this.f47632a = i;
        this.f47633b = z;
        this.f47634c = z2;
        this.f47635d = d;
        this.f47636e = d2;
        this.f47637f = jArr;
        this.f47638g = i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x003e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0053  */
    /* JADX WARN: Code duplicated, block: B:39:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0063  */
    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0079 A[SYNTHETIC] */
    @Override // p000.InterfaceC0841n
    /* JADX INFO: renamed from: a */
    public final boolean mo13853a(C0895p c0895p) {
        long j;
        double d;
        int i;
        int i2;
        boolean z;
        int i3;
        long[] jArr;
        int i4 = this.f47638g;
        switch (i4 - 1) {
            case 1:
                j = c0895p.f47137f;
                d = j;
                break;
            case 2:
                j = c0895p.f47135d;
                d = j;
                break;
            case 3:
                j = c0895p.f47136e;
                d = j;
                break;
            case 4:
                i = c0895p.f47133b;
                d = i;
                break;
            case 5:
                i = c0895p.f47134c;
                d = i;
                break;
            default:
                d = c0895p.f47132a;
                break;
        }
        if (!this.f47634c) {
            if (i4 == 7) {
            }
            i2 = this.f47632a;
            if (i2 != 0) {
                double d2 = i2;
                Double.isNaN(d2);
                d %= d2;
            }
            if (d >= this.f47635d) {
                z = false;
            } else {
                z = false;
            }
            if (z) {
                z = false;
                i3 = 0;
                while (!z) {
                    jArr = this.f47637f;
                    if (i3 < jArr.length) {
                        if (d >= jArr[i3]) {
                            z = false;
                        } else {
                            z = false;
                        }
                        i3 += 2;
                    }
                }
            }
            if (this.f47633b == z) {
                return true;
            }
            return false;
        }
        double d3 = (long) d;
        Double.isNaN(d3);
        if (d - d3 == 0.0d) {
            if (i4 == 7 || c0895p.f47133b == 0) {
                i2 = this.f47632a;
                if (i2 != 0) {
                    double d4 = i2;
                    Double.isNaN(d4);
                    d %= d4;
                }
                if (d >= this.f47635d || d > this.f47636e) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && this.f47637f != null) {
                    z = false;
                    i3 = 0;
                    while (!z) {
                        jArr = this.f47637f;
                        if (i3 < jArr.length) {
                            if (d >= jArr[i3] || d > jArr[i3 + 1]) {
                                z = false;
                            } else {
                                z = true;
                            }
                            i3 += 2;
                        }
                    }
                }
                if (this.f47633b == z) {
                    return true;
                }
                return false;
            }
        }
        return !this.f47633b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        switch (this.f47638g) {
            case 1:
                str = "n";
                break;
            case 2:
                str = "i";
                break;
            case 3:
                str = "f";
                break;
            case 4:
                str = "t";
                break;
            case 5:
                str = "v";
                break;
            case 6:
                str = "w";
                break;
            default:
                str = "j";
                break;
        }
        sb.append((Object) str);
        if (this.f47632a != 0) {
            sb.append(" % ");
            sb.append(this.f47632a);
        }
        double d = this.f47635d;
        double d2 = this.f47636e;
        String str2 = xPAWq.omzvXNP;
        if (d != d2) {
            if (!this.f47634c) {
                str2 = this.f47633b ? " within " : " not within ";
            } else if (!this.f47633b) {
                str2 = " != ";
            }
        } else if (!this.f47633b) {
            str2 = " != ";
        }
        sb.append(str2);
        if (this.f47637f != null) {
            int i = 0;
            while (true) {
                long[] jArr = this.f47637f;
                if (i < jArr.length) {
                    C1084w.m19515b(sb, jArr[i], jArr[i + 1], i != 0);
                    i += 2;
                }
            }
        } else {
            C1084w.m19515b(sb, this.f47635d, this.f47636e, false);
        }
        return sb.toString();
    }
}
