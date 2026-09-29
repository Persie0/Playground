package p000;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class x66 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public Object[] f67830a;

    /* JADX INFO: renamed from: b */
    public f66 f67831b;

    /* JADX INFO: renamed from: c */
    public int f67832c = 0;

    public x66(Object[] objArr) {
        this.f67830a = objArr;
    }

    /* JADX INFO: renamed from: b */
    public final void m24304b(int i, Object obj) {
        int i2 = this.f67832c + 1;
        if (this.f67830a.length < i2) {
            m24316n(i2);
        }
        Object[] objArr = this.f67830a;
        int i3 = this.f67832c;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f67832c++;
    }

    /* JADX INFO: renamed from: c */
    public final void m24305c(Object obj) {
        int i = this.f67832c + 1;
        if (this.f67830a.length < i) {
            m24316n(i);
        }
        Object[] objArr = this.f67830a;
        int i2 = this.f67832c;
        objArr[i2] = obj;
        this.f67832c = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m24306d(int i, x66 x66Var) {
        int i2 = x66Var.f67832c;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f67832c + i2;
        if (this.f67830a.length < i3) {
            m24316n(i3);
        }
        Object[] objArr = this.f67830a;
        int i4 = this.f67832c;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(x66Var.f67830a, 0, objArr, i, i2);
        this.f67832c += i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m24307e(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f67832c + size;
        if (this.f67830a.length < i2) {
            m24316n(i2);
        }
        Object[] objArr = this.f67830a;
        int i3 = this.f67832c;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f67832c += size;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m24308f(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f67832c + size;
        if (this.f67830a.length < i3) {
            m24316n(i3);
        }
        Object[] objArr = this.f67830a;
        int i4 = this.f67832c;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                vz1.m23628e0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f67832c += size;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final List m24309g() {
        f66 f66Var = this.f67831b;
        if (f66Var != null) {
            return f66Var;
        }
        f66 f66Var2 = new f66(this, 1);
        this.f67831b = f66Var2;
        return f66Var2;
    }

    /* JADX INFO: renamed from: h */
    public final void m24310h() {
        Object[] objArr = this.f67830a;
        int i = this.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f67832c = 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m24311i(Object obj) {
        int i = this.f67832c - 1;
        if (i >= 0) {
            for (int i2 = 0; !fa4.m11650l(this.f67830a[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final int m24312j(Object obj) {
        Object[] objArr = this.f67830a;
        int i = this.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            if (fa4.m11650l(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m24313k(Object obj) {
        int iM24312j = m24312j(obj);
        if (iM24312j < 0) {
            return false;
        }
        m24314l(iM24312j);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final Object m24314l(int i) {
        Object[] objArr = this.f67830a;
        Object obj = objArr[i];
        int i2 = this.f67832c;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f67832c - 1;
        this.f67832c = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public final void m24315m(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f67832c;
            if (i2 < i3) {
                Object[] objArr = this.f67830a;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f67832c;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f67830a[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f67832c = i5;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m24316n(int i) {
        Object[] objArr = this.f67830a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f67830a = objArr2;
    }
}
