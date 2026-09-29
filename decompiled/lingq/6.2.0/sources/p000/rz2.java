package p000;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rz2 extends pk8 {

    /* JADX INFO: renamed from: e */
    public final HashMap f60071e = new HashMap();

    @Override // p000.pk8
    /* JADX INFO: renamed from: d */
    public final mk8 mo19364d(Object obj) {
        return (mk8) this.f60071e.get(obj);
    }

    @Override // p000.pk8
    /* JADX INFO: renamed from: f */
    public final Object mo19365f(Object obj) {
        Object objMo19365f = super.mo19365f(obj);
        this.f60071e.remove(obj);
        return objMo19365f;
    }
}
