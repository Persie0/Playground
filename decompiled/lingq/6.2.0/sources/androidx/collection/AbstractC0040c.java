package androidx.collection;

import p000.fa4;
import p000.i84;
import p000.l70;
import p000.uk9;
import p000.ux5;
import p000.vi3;

/* JADX INFO: renamed from: androidx.collection.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0040c {

    /* JADX INFO: renamed from: a */
    public Object[] f1293a;

    /* JADX INFO: renamed from: b */
    public int f1294b;

    /* JADX INFO: renamed from: a */
    public final Object m716a() {
        if (!m719d()) {
            return this.f1293a[0];
        }
        uk9.m22775i("ObjectList is empty.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m717b(int i) {
        if (i >= 0 && i < this.f1294b) {
            return this.f1293a[i];
        }
        m721f(i);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final int m718c(Object obj) {
        Object[] objArr = this.f1293a;
        int i = 0;
        if (obj == null) {
            int i2 = this.f1294b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.f1294b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m719d() {
        return this.f1294b == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m720e() {
        return this.f1294b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0040c) {
            AbstractC0040c abstractC0040c = (AbstractC0040c) obj;
            int i = abstractC0040c.f1294b;
            int i2 = this.f1294b;
            if (i == i2) {
                Object[] objArr = this.f1293a;
                Object[] objArr2 = abstractC0040c.f1293a;
                i84 i84VarM15922M = l70.m15922M(0, i2);
                int i3 = i84VarM15922M.f40379a;
                int i4 = i84VarM15922M.f40380b;
                if (i3 > i4) {
                    return true;
                }
                while (fa4.m11650l(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m721f(int i) {
        StringBuilder sbM22998u = ux5.m22998u("Index ", i, " must be in 0..");
        sbM22998u.append(this.f1294b - 1);
        throw new IndexOutOfBoundsException(sbM22998u.toString());
    }

    public final int hashCode() {
        Object[] objArr = this.f1293a;
        int i = this.f1294b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        vi3 vi3Var = new vi3() { // from class: androidx.collection.ObjectList$toString$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                return obj == this.f1274b ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f1293a;
        int i = this.f1294b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) vi3Var.invoke(obj));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
