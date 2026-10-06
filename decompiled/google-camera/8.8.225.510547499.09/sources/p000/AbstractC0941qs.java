package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: qs */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0941qs extends AbstractC0942qt implements Iterator {

    /* JADX INFO: renamed from: a */
    C0939qq f47506a;

    /* JADX INFO: renamed from: b */
    C0939qq f47507b;

    public AbstractC0941qs(C0939qq c0939qq, C0939qq c0939qq2) {
        this.f47506a = c0939qq2;
        this.f47507b = c0939qq;
    }

    /* JADX INFO: renamed from: d */
    private final C0939qq m19355d() {
        C0939qq c0939qq = this.f47507b;
        C0939qq c0939qq2 = this.f47506a;
        if (c0939qq == c0939qq2 || c0939qq2 == null) {
            return null;
        }
        return mo19352b(c0939qq);
    }

    /* JADX INFO: renamed from: a */
    public abstract C0939qq mo19351a(C0939qq c0939qq);

    @Override // p000.AbstractC0942qt
    /* JADX INFO: renamed from: aQ */
    public final void mo19354aQ(C0939qq c0939qq) {
        if (this.f47506a == c0939qq && c0939qq == this.f47507b) {
            this.f47507b = null;
            this.f47506a = null;
        }
        C0939qq c0939qq2 = this.f47506a;
        if (c0939qq2 == c0939qq) {
            this.f47506a = mo19351a(c0939qq2);
        }
        if (this.f47507b == c0939qq) {
            this.f47507b = m19355d();
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract C0939qq mo19352b(C0939qq c0939qq);

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        C0939qq c0939qq = this.f47507b;
        this.f47507b = m19355d();
        return c0939qq;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47507b != null;
    }
}
