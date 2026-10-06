package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: qn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0936qn extends C0943qu {

    /* JADX INFO: renamed from: a */
    public final HashMap f47498a = new HashMap();

    @Override // p000.C0943qu
    /* JADX INFO: renamed from: a */
    public final C0939qq mo19348a(Object obj) {
        return (C0939qq) this.f47498a.get(obj);
    }

    @Override // p000.C0943qu
    /* JADX INFO: renamed from: b */
    public final Object mo19349b(Object obj) {
        Object objMo19349b = super.mo19349b(obj);
        this.f47498a.remove(obj);
        return objMo19349b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19350c(Object obj) {
        return this.f47498a.containsKey(obj);
    }
}
