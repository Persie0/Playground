package p000;

import com.google.android.gms.internal.vision.C1031p;
import com.google.android.gms.internal.vision.C1032q;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzjn;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ozc {

    /* JADX INFO: renamed from: f */
    public static final ozc f55341f = new ozc(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f55342a;

    /* JADX INFO: renamed from: b */
    public int[] f55343b;

    /* JADX INFO: renamed from: c */
    public Object[] f55344c;

    /* JADX INFO: renamed from: d */
    public int f55345d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f55346e;

    public ozc(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f55342a = i;
        this.f55343b = iArr;
        this.f55344c = objArr;
        this.f55346e = z;
    }

    /* JADX INFO: renamed from: b */
    public static ozc m18846b() {
        return new ozc(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final void m18847a(int i, Object obj) {
        if (!this.f55346e) {
            ij6.m13946b();
            return;
        }
        int i2 = this.f55342a;
        int[] iArr = this.f55343b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f55343b = Arrays.copyOf(iArr, i3);
            this.f55344c = Arrays.copyOf(this.f55344c, i3);
        }
        int[] iArr2 = this.f55343b;
        int i4 = this.f55342a;
        iArr2[i4] = i;
        this.f55344c[i4] = obj;
        this.f55342a = i4 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m18848c(C1032q c1032q) {
        if (this.f55342a == 0) {
            return;
        }
        c1032q.getClass();
        C1031p c1031p = c1032q.f12240a;
        for (int i = 0; i < this.f55342a; i++) {
            int i2 = this.f55343b[i];
            Object obj = this.f55344c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                long jLongValue = ((Long) obj).longValue();
                c1031p.m5730c(i3, 0);
                c1031p.m5731d(jLongValue);
            } else if (i4 == 1) {
                long jLongValue2 = ((Long) obj).longValue();
                c1031p.m5730c(i3, 1);
                c1031p.m5734j(jLongValue2);
            } else if (i4 == 2) {
                c1032q.m5737a(i3, (zzht) obj);
            } else if (i4 == 3) {
                c1031p.m5730c(i3, 3);
                ((ozc) obj).m18848c(c1032q);
                c1031p.m5730c(i3, 4);
            } else if (i4 != 5) {
                v63.m23141s(new zzjn("Protocol message tag had invalid wire type."));
                return;
            } else {
                int iIntValue = ((Integer) obj).intValue();
                c1031p.m5730c(i3, 5);
                c1031p.m5736l(iIntValue);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m18849d() {
        int iM5719n;
        int i = this.f55345d;
        if (i != -1) {
            return i;
        }
        int iM18849d = 0;
        for (int i2 = 0; i2 < this.f55342a; i2++) {
            int i3 = this.f55343b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM5719n = C1031p.m5719n(i4, ((Long) this.f55344c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f55344c[i2]).getClass();
                iM5719n = C1031p.m5723r(i4);
            } else if (i5 != 2) {
                if (i5 == 3) {
                    iM18849d = ((ozc) this.f55344c[i2]).m18849d() + (C1031p.m5718m(i4) << 1) + iM18849d;
                } else {
                    if (i5 != 5) {
                        uk9.m22779n(new zzjn("Protocol message tag had invalid wire type."));
                        return 0;
                    }
                    ((Integer) this.f55344c[i2]).getClass();
                    iM5719n = C1031p.m5727v(i4);
                }
            } else {
                iM5719n = C1031p.m5716h(i4, (zzht) this.f55344c[i2]);
            }
            iM18849d = iM5719n + iM18849d;
        }
        this.f55345d = iM18849d;
        return iM18849d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ozc)) {
            return false;
        }
        ozc ozcVar = (ozc) obj;
        int i = this.f55342a;
        if (i == ozcVar.f55342a) {
            int[] iArr = this.f55343b;
            int[] iArr2 = ozcVar.f55343b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f55344c;
            Object[] objArr2 = ozcVar.f55344c;
            int i3 = this.f55342a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f55342a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f55343b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f55344c;
        int i6 = this.f55342a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
