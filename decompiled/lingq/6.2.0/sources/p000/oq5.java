package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class oq5 extends xc3 {

    /* JADX INFO: renamed from: e */
    public static final Object f54732e = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f54733c;

    /* JADX INFO: renamed from: d */
    public final Object f54734d;

    public oq5(z0a z0aVar, Object obj, Object obj2) {
        super(z0aVar);
        this.f54733c = obj;
        this.f54734d = obj2;
    }

    @Override // p000.xc3, p000.z0a
    /* JADX INFO: renamed from: b */
    public final int mo17285b(Object obj) {
        Object obj2;
        if (f54732e == obj && (obj2 = this.f54734d) != null) {
            obj = obj2;
        }
        return this.f68058b.mo17285b(obj);
    }

    @Override // p000.xc3, p000.z0a
    /* JADX INFO: renamed from: f */
    public final x0a mo16393f(int i, x0a x0aVar, boolean z) {
        this.f68058b.mo16393f(i, x0aVar, z);
        if (Objects.equals(x0aVar.f67600b, this.f54734d) && z) {
            x0aVar.f67600b = f54732e;
        }
        return x0aVar;
    }

    @Override // p000.xc3, p000.z0a
    /* JADX INFO: renamed from: l */
    public final Object mo17287l(int i) {
        Object objMo17287l = this.f68058b.mo17287l(i);
        return Objects.equals(objMo17287l, this.f54734d) ? f54732e : objMo17287l;
    }

    @Override // p000.xc3, p000.z0a
    /* JADX INFO: renamed from: m */
    public final y0a mo39m(int i, y0a y0aVar, long j) {
        this.f68058b.mo39m(i, y0aVar, j);
        if (Objects.equals(y0aVar.f69064a, this.f54733c)) {
            y0aVar.f69064a = y0a.f69062o;
        }
        return y0aVar;
    }
}
