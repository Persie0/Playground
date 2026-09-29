package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class jb9 extends AbstractC3096i1 {

    /* JADX INFO: renamed from: b */
    public static final jb9 f45384b = new jb9(new Object[0]);

    /* JADX INFO: renamed from: a */
    public final Object[] f45385a;

    public jb9(Object[] objArr) {
        this.f45385a = objArr;
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f45385a.length;
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: f */
    public final AbstractC3096i1 mo13604f(int i, Object obj) {
        Object[] objArr = this.f45385a;
        vz1.m23644o(i, objArr.length);
        if (i == objArr.length) {
            return mo13605g(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC3550rv.m20830X(0, i, 6, objArr, objArr2);
            AbstractC3550rv.m20826T(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new jb9(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3550rv.m20826T(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new w77(objArr.length + 1, 0, objArrCopyOf, objArr3);
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: g */
    public final AbstractC3096i1 mo13605g(Object obj) {
        Object[] objArr = this.f45385a;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new jb9(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new w77(objArr.length + 1, 0, objArr, objArr2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.f45385a;
        vz1.m23642n(i, objArr.length);
        return objArr[i];
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: h */
    public final AbstractC3096i1 mo13606h(Collection collection) {
        Object[] objArr = this.f45385a;
        if (collection.size() + objArr.length > 32) {
            x77 x77VarMo13607i = mo13607i();
            x77VarMo13607i.addAll(collection);
            return x77VarMo13607i.m24385g();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new jb9(objArrCopyOf);
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: i */
    public final x77 mo13607i() {
        return new x77(this, null, this.f45385a, 0);
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC3550rv.m20844l0(this.f45385a, obj);
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: j */
    public final AbstractC3096i1 mo13608j(C3059h1 c3059h1) {
        Object[] objArr = this.f45385a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) c3059h1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f45384b : new jb9(AbstractC3550rv.m20832Z(objArrCopyOf, 0, length));
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: k */
    public final AbstractC3096i1 mo13609k(int i) {
        Object[] objArr = this.f45385a;
        vz1.m23642n(i, objArr.length);
        if (objArr.length == 1) {
            return f45384b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC3550rv.m20826T(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new jb9(objArrCopyOf);
    }

    @Override // p000.AbstractC3096i1
    /* JADX INFO: renamed from: l */
    public final AbstractC3096i1 mo13610l(int i, Object obj) {
        Object[] objArr = this.f45385a;
        vz1.m23642n(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new jb9(objArrCopyOf);
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f45385a;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f45385a;
        vz1.m23644o(i, objArr.length);
        return new cj0(objArr, i, objArr.length);
    }
}
