package p000;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class blt implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final String[] f3707a = new String[128];

    /* JADX INFO: renamed from: b */
    int f3708b;

    /* JADX INFO: renamed from: c */
    int[] f3709c = new int[32];

    /* JADX INFO: renamed from: d */
    String[] f3710d = new String[32];

    /* JADX INFO: renamed from: e */
    int[] f3711e = new int[32];

    static {
        for (int i = 0; i <= 31; i++) {
            f3707a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f3707a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: renamed from: d */
    public static blt m2649d(paw pawVar) {
        return new blu(pawVar);
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo2650a();

    /* JADX INFO: renamed from: b */
    public abstract int mo2651b();

    /* JADX INFO: renamed from: c */
    final bls m2652c(String str) throws bls {
        throw new bls(str + " at path " + m2653e());
    }

    /* JADX INFO: renamed from: e */
    public final String m2653e() {
        int i = this.f3708b;
        int[] iArr = this.f3709c;
        String[] strArr = this.f3710d;
        int[] iArr2 = this.f3711e;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            switch (iArr[i2]) {
                case 1:
                case 2:
                    sb.append('[');
                    sb.append(iArr2[i2]);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = strArr[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo2654f();

    /* JADX INFO: renamed from: g */
    public abstract String mo2655g();

    /* JADX INFO: renamed from: h */
    public abstract void mo2656h();

    /* JADX INFO: renamed from: i */
    public abstract void mo2657i();

    /* JADX INFO: renamed from: j */
    public abstract void mo2658j();

    /* JADX INFO: renamed from: k */
    public abstract void mo2659k();

    /* JADX INFO: renamed from: l */
    final void m2660l(int i) {
        int i2 = this.f3708b;
        int[] iArr = this.f3709c;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 == 256) {
                throw new blr("Nesting too deep at ".concat(m2653e()));
            }
            this.f3709c = Arrays.copyOf(iArr, length + length);
            String[] strArr = this.f3710d;
            int length2 = strArr.length;
            this.f3710d = (String[]) Arrays.copyOf(strArr, length2 + length2);
            int[] iArr2 = this.f3711e;
            int length3 = iArr2.length;
            this.f3711e = Arrays.copyOf(iArr2, length3 + length3);
        }
        int[] iArr3 = this.f3709c;
        int i3 = this.f3708b;
        this.f3708b = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo2661m();

    /* JADX INFO: renamed from: n */
    public abstract void mo2662n();

    /* JADX INFO: renamed from: o */
    public abstract boolean mo2663o();

    /* JADX INFO: renamed from: p */
    public abstract boolean mo2664p();

    /* JADX INFO: renamed from: q */
    public abstract int mo2665q();

    /* JADX INFO: renamed from: r */
    public abstract int mo2666r(dsx dsxVar);
}
