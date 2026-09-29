package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class u3c {

    /* JADX INFO: renamed from: e */
    public static final u3c f63367e = new u3c(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f63368a;

    /* JADX INFO: renamed from: b */
    public int[] f63369b;

    /* JADX INFO: renamed from: c */
    public Object[] f63370c;

    /* JADX INFO: renamed from: d */
    public boolean f63371d;

    public u3c(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f63368a = i;
        this.f63369b = iArr;
        this.f63370c = objArr;
        this.f63371d = z;
    }

    /* JADX INFO: renamed from: b */
    public static u3c m22437b() {
        return new u3c(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final void m22438a(int i, Object obj) {
        if (!this.f63371d) {
            ij6.m13946b();
            return;
        }
        int i2 = this.f63368a;
        int[] iArr = this.f63369b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f63369b = Arrays.copyOf(iArr, i3);
            this.f63370c = Arrays.copyOf(this.f63370c, i3);
        }
        int[] iArr2 = this.f63369b;
        int i4 = this.f63368a;
        iArr2[i4] = i;
        this.f63370c[i4] = obj;
        this.f63368a = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u3c)) {
            return false;
        }
        u3c u3cVar = (u3c) obj;
        int i = this.f63368a;
        if (i == u3cVar.f63368a) {
            int[] iArr = this.f63369b;
            int[] iArr2 = u3cVar.f63369b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f63370c;
            Object[] objArr2 = u3cVar.f63370c;
            int i3 = this.f63368a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f63368a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f63369b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f63370c;
        int i6 = this.f63368a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
