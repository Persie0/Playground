package p000;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ve7 extends z0a {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f65274k = 0;

    /* JADX INFO: renamed from: b */
    public final int f65275b;

    /* JADX INFO: renamed from: c */
    public final l69 f65276c;

    /* JADX INFO: renamed from: d */
    public final int f65277d;

    /* JADX INFO: renamed from: e */
    public final int f65278e;

    /* JADX INFO: renamed from: f */
    public final int[] f65279f;

    /* JADX INFO: renamed from: g */
    public final int[] f65280g;

    /* JADX INFO: renamed from: h */
    public final z0a[] f65281h;

    /* JADX INFO: renamed from: i */
    public final Object[] f65282i;

    /* JADX INFO: renamed from: j */
    public final HashMap f65283j;

    public ve7(z0a[] z0aVarArr, Object[] objArr, l69 l69Var) {
        this.f65276c = l69Var;
        this.f65275b = l69Var.f49200b.length;
        int length = z0aVarArr.length;
        this.f65281h = z0aVarArr;
        this.f65279f = new int[length];
        this.f65280g = new int[length];
        this.f65282i = objArr;
        this.f65283j = new HashMap();
        int length2 = z0aVarArr.length;
        int i = 0;
        int iMo17288o = 0;
        int iMo17286h = 0;
        int i2 = 0;
        while (i < length2) {
            z0a z0aVar = z0aVarArr[i];
            this.f65281h[i2] = z0aVar;
            this.f65280g[i2] = iMo17288o;
            this.f65279f[i2] = iMo17286h;
            iMo17288o += z0aVar.mo17288o();
            iMo17286h += this.f65281h[i2].mo17286h();
            this.f65283j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f65277d = iMo17288o;
        this.f65278e = iMo17286h;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: a */
    public final int mo23247a(boolean z) {
        if (this.f65275b != 0) {
            int iM23253r = 0;
            if (z) {
                int[] iArr = this.f65276c.f49200b;
                iM23253r = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                z0a[] z0aVarArr = this.f65281h;
                if (!z0aVarArr[iM23253r].m25398p()) {
                    return z0aVarArr[iM23253r].mo23247a(z) + this.f65280g[iM23253r];
                }
                iM23253r = m23253r(iM23253r, z);
            } while (iM23253r != -1);
        }
        return -1;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: b */
    public final int mo17285b(Object obj) {
        int iMo17285b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f65283j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iMo17285b = this.f65281h[iIntValue].mo17285b(obj3)) != -1) {
                return this.f65279f[iIntValue] + iMo17285b;
            }
        }
        return -1;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: c */
    public final int mo23248c(boolean z) {
        int iM23254s;
        int i = this.f65275b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.f65276c.f49200b;
                iM23254s = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iM23254s = i - 1;
            }
            do {
                z0a[] z0aVarArr = this.f65281h;
                if (!z0aVarArr[iM23254s].m25398p()) {
                    return z0aVarArr[iM23254s].mo23248c(z) + this.f65280g[iM23254s];
                }
                iM23254s = m23254s(iM23254s, z);
            } while (iM23254s != -1);
        }
        return -1;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: e */
    public final int mo23249e(int i, int i2, boolean z) {
        int[] iArr = this.f65280g;
        int iM22808c = uma.m22808c(iArr, i + 1, false, false);
        int i3 = iArr[iM22808c];
        z0a[] z0aVarArr = this.f65281h;
        int iMo23249e = z0aVarArr[iM22808c].mo23249e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iMo23249e != -1) {
            return i3 + iMo23249e;
        }
        int iM23253r = m23253r(iM22808c, z);
        while (iM23253r != -1 && z0aVarArr[iM23253r].m25398p()) {
            iM23253r = m23253r(iM23253r, z);
        }
        if (iM23253r != -1) {
            return z0aVarArr[iM23253r].mo23247a(z) + iArr[iM23253r];
        }
        if (i2 == 2) {
            return mo23247a(z);
        }
        return -1;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: f */
    public final x0a mo16393f(int i, x0a x0aVar, boolean z) {
        int[] iArr = this.f65279f;
        int iM22808c = uma.m22808c(iArr, i + 1, false, false);
        int i2 = this.f65280g[iM22808c];
        this.f65281h[iM22808c].mo16393f(i - iArr[iM22808c], x0aVar, z);
        x0aVar.f67601c += i2;
        if (z) {
            Object obj = this.f65282i[iM22808c];
            Object obj2 = x0aVar.f67600b;
            obj2.getClass();
            x0aVar.f67600b = Pair.create(obj, obj2);
        }
        return x0aVar;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: g */
    public final x0a mo23250g(Object obj, x0a x0aVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f65283j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f65280g[iIntValue];
        this.f65281h[iIntValue].mo23250g(obj3, x0aVar);
        x0aVar.f67601c += i;
        x0aVar.f67600b = obj;
        return x0aVar;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: h */
    public final int mo17286h() {
        return this.f65278e;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: k */
    public final int mo23251k(int i, int i2, boolean z) {
        int[] iArr = this.f65280g;
        int iM22808c = uma.m22808c(iArr, i + 1, false, false);
        int i3 = iArr[iM22808c];
        z0a[] z0aVarArr = this.f65281h;
        int iMo23251k = z0aVarArr[iM22808c].mo23251k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iMo23251k != -1) {
            return i3 + iMo23251k;
        }
        int iM23254s = m23254s(iM22808c, z);
        while (iM23254s != -1 && z0aVarArr[iM23254s].m25398p()) {
            iM23254s = m23254s(iM23254s, z);
        }
        if (iM23254s != -1) {
            return z0aVarArr[iM23254s].mo23248c(z) + iArr[iM23254s];
        }
        if (i2 == 2) {
            return mo23248c(z);
        }
        return -1;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: l */
    public final Object mo17287l(int i) {
        int[] iArr = this.f65279f;
        int iM22808c = uma.m22808c(iArr, i + 1, false, false);
        return Pair.create(this.f65282i[iM22808c], this.f65281h[iM22808c].mo17287l(i - iArr[iM22808c]));
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: m */
    public final y0a mo39m(int i, y0a y0aVar, long j) {
        int[] iArr = this.f65280g;
        int iM22808c = uma.m22808c(iArr, i + 1, false, false);
        int i2 = iArr[iM22808c];
        int i3 = this.f65279f[iM22808c];
        this.f65281h[iM22808c].mo39m(i - i2, y0aVar, j);
        Object objCreate = this.f65282i[iM22808c];
        Object obj = y0a.f69062o;
        Object obj2 = y0aVar.f69064a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        y0aVar.f69064a = objCreate;
        y0aVar.f69075l += i3;
        y0aVar.f69076m += i3;
        return y0aVar;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: o */
    public final int mo17288o() {
        return this.f65277d;
    }

    /* JADX INFO: renamed from: q */
    public final ve7 m23252q(l69 l69Var) {
        z0a[] z0aVarArr = this.f65281h;
        z0a[] z0aVarArr2 = new z0a[z0aVarArr.length];
        for (int i = 0; i < z0aVarArr.length; i++) {
            z0aVarArr2[i] = new ue7(z0aVarArr[i]);
        }
        return new ve7(z0aVarArr2, this.f65282i, l69Var);
    }

    /* JADX INFO: renamed from: r */
    public final int m23253r(int i, boolean z) {
        if (!z) {
            if (i < this.f65275b - 1) {
                return i + 1;
            }
            return -1;
        }
        l69 l69Var = this.f65276c;
        int i2 = l69Var.f49201c[i] + 1;
        int[] iArr = l69Var.f49200b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public final int m23254s(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        l69 l69Var = this.f65276c;
        int i2 = l69Var.f49201c[i] - 1;
        if (i2 >= 0) {
            return l69Var.f49200b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ve7(List list, l69 l69Var) {
        z0a[] z0aVarArr = new z0a[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            z0aVarArr[i2] = ((pv5) it.next()).mo12929b();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((pv5) it2.next()).mo12928a();
            i++;
        }
        this(z0aVarArr, objArr, l69Var);
    }
}
