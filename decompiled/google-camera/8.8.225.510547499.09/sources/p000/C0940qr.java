package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: qr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0940qr extends AbstractC0942qt implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0943qu f47503a;

    /* JADX INFO: renamed from: b */
    private C0939qq f47504b;

    /* JADX INFO: renamed from: c */
    private boolean f47505c = true;

    public C0940qr(C0943qu c0943qu) {
        this.f47503a = c0943qu;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        C0939qq c0939qq;
        if (this.f47505c) {
            this.f47505c = false;
            c0939qq = this.f47503a.f47508b;
        } else {
            C0939qq c0939qq2 = this.f47504b;
            c0939qq = c0939qq2 != null ? c0939qq2.f47501c : null;
        }
        this.f47504b = c0939qq;
        return this.f47504b;
    }

    @Override // p000.AbstractC0942qt
    /* JADX INFO: renamed from: aQ */
    public final void mo19354aQ(C0939qq c0939qq) {
        C0939qq c0939qq2 = this.f47504b;
        if (c0939qq == c0939qq2) {
            C0939qq c0939qq3 = c0939qq2.f47502d;
            this.f47504b = c0939qq3;
            this.f47505c = c0939qq3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f47505c) {
            return this.f47503a.f47508b != null;
        }
        C0939qq c0939qq = this.f47504b;
        return (c0939qq == null || c0939qq.f47501c == null) ? false : true;
    }
}
