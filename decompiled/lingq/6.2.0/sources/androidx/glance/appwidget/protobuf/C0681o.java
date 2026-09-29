package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import p000.ij6;
import p000.uk9;
import p000.v63;
import p000.vj6;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C0681o {

    /* JADX INFO: renamed from: f */
    public static final C0681o f6100f = new C0681o(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f6101a;

    /* JADX INFO: renamed from: b */
    public int[] f6102b;

    /* JADX INFO: renamed from: c */
    public Object[] f6103c;

    /* JADX INFO: renamed from: d */
    public int f6104d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f6105e;

    public C0681o(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f6101a = i;
        this.f6102b = iArr;
        this.f6103c = objArr;
        this.f6105e = z;
    }

    /* JADX INFO: renamed from: c */
    public static C0681o m2468c() {
        return new C0681o(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final void m2469a(int i) {
        int[] iArr = this.f6102b;
        if (i > iArr.length) {
            int i2 = this.f6101a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f6102b = Arrays.copyOf(iArr, i);
            this.f6103c = Arrays.copyOf(this.f6103c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2470b() {
        int iM2374e;
        int iM2376g;
        int iM2374e2;
        int i = this.f6104d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f6101a; i3++) {
            int i4 = this.f6102b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f6103c[i3]).getClass();
                    iM2374e2 = AbstractC0673g.m2374e(i5) + 8;
                } else if (i6 == 2) {
                    iM2374e2 = AbstractC0673g.m2370a(i5, (ByteString) this.f6103c[i3]);
                } else if (i6 == 3) {
                    iM2374e = AbstractC0673g.m2374e(i5) * 2;
                    iM2376g = ((C0681o) this.f6103c[i3]).m2470b();
                } else {
                    if (i6 != 5) {
                        uk9.m22779n(InvalidProtocolBufferException.m2269c());
                        return 0;
                    }
                    ((Integer) this.f6103c[i3]).getClass();
                    iM2374e2 = AbstractC0673g.m2374e(i5) + 4;
                }
                i2 = iM2374e2 + i2;
            } else {
                long jLongValue = ((Long) this.f6103c[i3]).longValue();
                iM2374e = AbstractC0673g.m2374e(i5);
                iM2376g = AbstractC0673g.m2376g(jLongValue);
            }
            i2 = iM2376g + iM2374e + i2;
        }
        this.f6104d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m2471d(int i, Object obj) {
        if (!this.f6105e) {
            ij6.m13946b();
            return;
        }
        m2469a(this.f6101a + 1);
        int[] iArr = this.f6102b;
        int i2 = this.f6101a;
        iArr[i2] = i;
        this.f6103c[i2] = obj;
        this.f6101a = i2 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m2472e(vj6 vj6Var) {
        if (this.f6101a == 0) {
            return;
        }
        vj6Var.getClass();
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i = 0; i < this.f6101a; i++) {
            int i2 = this.f6102b[i];
            Object obj = this.f6103c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                abstractC0673g.mo2359x(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                abstractC0673g.mo2349n(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                vj6Var.m23340B(i3, (ByteString) obj);
            } else if (i4 == 3) {
                Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                abstractC0673g.mo2356u(i3, 3);
                ((C0681o) obj).m2472e(vj6Var);
                abstractC0673g.mo2356u(i3, 4);
            } else {
                if (i4 != 5) {
                    v63.m23141s(InvalidProtocolBufferException.m2269c());
                    return;
                }
                abstractC0673g.mo2347l(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0681o)) {
            return false;
        }
        C0681o c0681o = (C0681o) obj;
        int i = this.f6101a;
        if (i == c0681o.f6101a) {
            int[] iArr = this.f6102b;
            int[] iArr2 = c0681o.f6102b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f6103c;
            Object[] objArr2 = c0681o.f6103c;
            int i3 = this.f6101a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f6101a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f6102b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f6103c;
        int i6 = this.f6101a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
