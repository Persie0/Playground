package p000;

import androidx.collection.AbstractC0040c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h66 extends AbstractC0040c {

    /* JADX INFO: renamed from: c */
    public f66 f41838c;

    public h66(int i) {
        this.f1293a = i == 0 ? ip6.f44399a : new Object[i];
    }

    /* JADX INFO: renamed from: g */
    public final void m13090g(Object obj) {
        int i = this.f1294b + 1;
        Object[] objArr = this.f1293a;
        if (objArr.length < i) {
            m13097n(objArr, i);
        }
        Object[] objArr2 = this.f1293a;
        int i2 = this.f1294b;
        objArr2[i2] = obj;
        this.f1294b = i2 + 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m13091h(AbstractC0040c abstractC0040c) {
        abstractC0040c.getClass();
        if (abstractC0040c.m719d()) {
            return;
        }
        int i = this.f1294b + abstractC0040c.f1294b;
        Object[] objArr = this.f1293a;
        if (objArr.length < i) {
            m13097n(objArr, i);
        }
        AbstractC3550rv.m20826T(this.f1294b, 0, abstractC0040c.f1294b, abstractC0040c.f1293a, this.f1293a);
        this.f1294b += abstractC0040c.f1294b;
    }

    /* JADX INFO: renamed from: i */
    public final void m13092i(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f1294b;
        int size = list.size() + i;
        Object[] objArr = this.f1293a;
        if (objArr.length < size) {
            m13097n(objArr, size);
        }
        Object[] objArr2 = this.f1293a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.f1294b = list.size() + this.f1294b;
    }

    /* JADX INFO: renamed from: j */
    public final void m13093j() {
        AbstractC3550rv.m20833a0(0, this.f1294b, null, this.f1293a);
        this.f1294b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m13094k(Object obj) {
        int iM718c = m718c(obj);
        if (iM718c < 0) {
            return false;
        }
        m13095l(iM718c);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final Object m13095l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f1294b)) {
            m721f(i);
            throw null;
        }
        Object[] objArr = this.f1293a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            AbstractC3550rv.m20826T(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.f1294b - 1;
        this.f1294b = i3;
        objArr[i3] = null;
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public final void m13096m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f1294b) || i2 < 0 || i2 > i3) {
            ij6.m13949f(this.f1294b, ux5.m22994q(i, i2, "Start (", ") and end (", ") must be in 0.."));
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f1293a;
                AbstractC3550rv.m20826T(i, i2, i3, objArr, objArr);
            }
            int i4 = this.f1294b;
            int i5 = i4 - (i2 - i);
            AbstractC3550rv.m20833a0(i5, i4, null, this.f1293a);
            this.f1294b = i5;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m13097n(Object[] objArr, int i) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        AbstractC3550rv.m20826T(0, 0, length, objArr, objArr2);
        this.f1293a = objArr2;
    }

    /* JADX INFO: renamed from: o */
    public final Object m13098o(int i, Object obj) {
        if (i < 0 || i >= this.f1294b) {
            m721f(i);
            throw null;
        }
        Object[] objArr = this.f1293a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: p */
    public final void m13099p(int i) {
        StringBuilder sbM22998u = ux5.m22998u("Index ", i, " must be in 0..");
        sbM22998u.append(this.f1294b);
        throw new IndexOutOfBoundsException(sbM22998u.toString());
    }

    public /* synthetic */ h66() {
        this(16);
    }
}
