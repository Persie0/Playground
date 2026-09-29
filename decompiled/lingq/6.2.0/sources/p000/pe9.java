package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pe9 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f56013a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int[] f56014b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f56015c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f56016d;

    public pe9(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f56014b = new int[i5];
        this.f56015c = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pe9 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        pe9 pe9Var = (pe9) objClone;
        pe9Var.f56014b = (int[]) this.f56014b.clone();
        pe9Var.f56015c = (Object[]) this.f56015c.clone();
        return pe9Var;
    }

    /* JADX INFO: renamed from: b */
    public final Object m19078b(int i) {
        Object obj;
        int iM18260j = AbstractC3423or.m18260j(this.f56016d, i, this.f56014b);
        if (iM18260j < 0 || (obj = this.f56015c[iM18260j]) == AbstractC3122is.f44471d) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final int m19079c(int i) {
        if (this.f56013a) {
            AbstractC3122is.m14091e(this);
        }
        return this.f56014b[i];
    }

    /* JADX INFO: renamed from: d */
    public final void m19080d(int i, Object obj) {
        int iM18260j = AbstractC3423or.m18260j(this.f56016d, i, this.f56014b);
        if (iM18260j >= 0) {
            this.f56015c[iM18260j] = obj;
            return;
        }
        int i2 = ~iM18260j;
        int i3 = this.f56016d;
        if (i2 < i3) {
            Object[] objArr = this.f56015c;
            if (objArr[i2] == AbstractC3122is.f44471d) {
                this.f56014b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f56013a && i3 >= this.f56014b.length) {
            AbstractC3122is.m14091e(this);
            i2 = ~AbstractC3423or.m18260j(this.f56016d, i, this.f56014b);
        }
        int i4 = this.f56016d;
        if (i4 >= this.f56014b.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            this.f56014b = Arrays.copyOf(this.f56014b, i8);
            this.f56015c = Arrays.copyOf(this.f56015c, i8);
        }
        int i9 = this.f56016d;
        if (i9 - i2 != 0) {
            int[] iArr = this.f56014b;
            int i10 = i2 + 1;
            AbstractC3550rv.m20825S(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.f56015c;
            AbstractC3550rv.m20826T(i10, i2, this.f56016d, objArr2, objArr2);
        }
        this.f56014b[i2] = i;
        this.f56015c[i2] = obj;
        this.f56016d++;
    }

    /* JADX INFO: renamed from: e */
    public final int m19081e() {
        if (this.f56013a) {
            AbstractC3122is.m14091e(this);
        }
        return this.f56016d;
    }

    /* JADX INFO: renamed from: f */
    public final Object m19082f(int i) {
        if (this.f56013a) {
            AbstractC3122is.m14091e(this);
        }
        Object[] objArr = this.f56015c;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (m19081e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f56016d * 28);
        sb.append('{');
        int i = this.f56016d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m19079c(i2));
            sb.append('=');
            Object objM19082f = m19082f(i2);
            if (objM19082f != this) {
                sb.append(objM19082f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
