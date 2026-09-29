package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e14 extends AbstractC3816z0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3096i1 f36570a;

    /* JADX INFO: renamed from: b */
    public final int f36571b;

    /* JADX INFO: renamed from: c */
    public final int f36572c;

    public e14(AbstractC3096i1 abstractC3096i1, int i, int i2) {
        this.f36570a = abstractC3096i1;
        this.f36571b = i;
        vz1.m23646p(i, i2, abstractC3096i1.size());
        this.f36572c = i2 - i;
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f36572c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vz1.m23642n(i, this.f36572c);
        return this.f36570a.get(this.f36571b + i);
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final List subList(int i, int i2) {
        vz1.m23646p(i, i2, this.f36572c);
        int i3 = this.f36571b;
        return new e14(this.f36570a, i + i3, i3 + i2);
    }
}
