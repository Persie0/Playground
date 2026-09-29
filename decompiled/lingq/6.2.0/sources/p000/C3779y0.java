package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3779y0 extends AbstractC3816z0 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final AbstractC3816z0 f69036a;

    /* JADX INFO: renamed from: b */
    public final int f69037b;

    /* JADX INFO: renamed from: c */
    public final int f69038c;

    public C3779y0(AbstractC3816z0 abstractC3816z0, int i, int i2) {
        this.f69036a = abstractC3816z0;
        this.f69037b = i;
        b34.m3239f(i, i2, abstractC3816z0.mo3718d());
        this.f69038c = i2 - i;
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f69038c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f69038c;
        if (i < 0 || i >= i2) {
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return null;
        }
        return this.f69036a.get(this.f69037b + i);
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final List subList(int i, int i2) {
        b34.m3239f(i, i2, this.f69038c);
        int i3 = this.f69037b;
        return new C3779y0(this.f69036a, i + i3, i3 + i2);
    }
}
