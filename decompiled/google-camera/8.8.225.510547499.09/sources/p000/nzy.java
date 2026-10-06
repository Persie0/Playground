package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nzy {

    /* JADX INFO: renamed from: a */
    public static final nzy f45105a = new nzy(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: b */
    public int f45106b;

    /* JADX INFO: renamed from: c */
    public int[] f45107c;

    /* JADX INFO: renamed from: d */
    public Object[] f45108d;

    /* JADX INFO: renamed from: e */
    public int f45109e;

    /* JADX INFO: renamed from: f */
    private boolean f45110f;

    private nzy() {
        this(0, new int[8], new Object[8], true);
    }

    public nzy(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f45109e = -1;
        this.f45106b = i;
        this.f45107c = iArr;
        this.f45108d = objArr;
        this.f45110f = z;
    }

    /* JADX INFO: renamed from: b */
    public static nzy m18329b() {
        return new nzy(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m18330a() {
        int iM17984ac;
        int i = this.f45109e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f45106b; i3++) {
            int i4 = this.f45107c[i3];
            int iM18386a = oal.m18386a(i4);
            switch (oal.m18387b(i4)) {
                case 0:
                    iM17984ac = nxb.m17984ac(iM18386a, ((Long) this.f45108d[i3]).longValue());
                    break;
                case 1:
                    ((Long) this.f45108d[i3]).longValue();
                    iM17984ac = nxb.m17993aw(iM18386a);
                    break;
                case 2:
                    iM17984ac = nxb.m17962G(iM18386a, (nwr) this.f45108d[i3]);
                    break;
                case 3:
                    int iM17981Z = nxb.m17981Z(iM18386a);
                    iM17984ac = iM17981Z + iM17981Z + ((nzy) this.f45108d[i3]).m18330a();
                    break;
                case 4:
                default:
                    throw new IllegalStateException(nyb.m18159a());
                case 5:
                    ((Integer) this.f45108d[i3]).intValue();
                    iM17984ac = nxb.m17992av(iM18386a);
                    break;
            }
            i2 += iM17984ac;
        }
        this.f45109e = i2;
        return i2;
    }

    /* JADX INFO: renamed from: c */
    final void m18331c() {
        if (!this.f45110f) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18332d(int i) {
        int[] iArr = this.f45107c;
        if (i > iArr.length) {
            int i2 = this.f45106b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f45107c = Arrays.copyOf(iArr, i);
            this.f45108d = Arrays.copyOf(this.f45108d, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18333e() {
        this.f45110f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nzy)) {
            return false;
        }
        nzy nzyVar = (nzy) obj;
        int i = this.f45106b;
        if (i == nzyVar.f45106b) {
            int[] iArr = this.f45107c;
            int[] iArr2 = nzyVar.f45107c;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f45108d;
            Object[] objArr2 = nzyVar.f45108d;
            int i3 = this.f45106b;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m18334f(int i, Object obj) {
        m18331c();
        m18332d(this.f45106b + 1);
        int[] iArr = this.f45107c;
        int i2 = this.f45106b;
        iArr[i2] = i;
        this.f45108d[i2] = obj;
        this.f45106b = i2 + 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m18335g(liv livVar) {
        if (this.f45106b != 0) {
            for (int i = 0; i < this.f45106b; i++) {
                int i2 = this.f45107c[i];
                Object obj = this.f45108d[i];
                int iM18387b = oal.m18387b(i2);
                int iM18386a = oal.m18386a(i2);
                switch (iM18387b) {
                    case 0:
                        livVar.m15496s(iM18386a, ((Long) obj).longValue());
                        break;
                    case 1:
                        livVar.m15492o(iM18386a, ((Long) obj).longValue());
                        break;
                    case 2:
                        livVar.m15488k(iM18386a, (nwr) obj);
                        break;
                    case 3:
                        ((nxb) livVar.f38339a).mo17929A(iM18386a, 3);
                        ((nzy) obj).m18335g(livVar);
                        ((nxb) livVar.f38339a).mo17929A(iM18386a, 4);
                        break;
                    case 4:
                    default:
                        throw new RuntimeException(nyb.m18159a());
                    case 5:
                        livVar.m15491n(iM18386a, ((Integer) obj).intValue());
                        break;
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.f45106b;
        int i2 = i + 527;
        int[] iArr = this.f45107c;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 * 31) + i3;
        Object[] objArr = this.f45108d;
        int i6 = this.f45106b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return (i5 * 31) + iHashCode;
    }
}
