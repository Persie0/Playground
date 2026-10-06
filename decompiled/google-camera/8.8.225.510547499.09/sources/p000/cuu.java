package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cuu implements kba {

    /* JADX INFO: renamed from: a */
    public final jyx f9689a;

    /* JADX INFO: renamed from: b */
    public final List f9690b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f9691c;

    /* JADX INFO: renamed from: d */
    public final gzn f9692d;

    /* JADX INFO: renamed from: e */
    public final gyx f9693e;

    /* JADX INFO: renamed from: f */
    public final gzo f9694f;

    public cuu(jyx jyxVar, ctg ctgVar, gzn gznVar, gzo gzoVar) {
        ArrayList arrayList = new ArrayList();
        this.f9690b = arrayList;
        this.f9691c = new AtomicBoolean(false);
        this.f9689a = jyxVar;
        this.f9692d = gznVar;
        this.f9693e = ctgVar.f9423a.mo5498b();
        this.f9694f = gzoVar;
        arrayList.add(ctgVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f9691c.compareAndSet(false, true)) {
            this.f9689a.close();
            Collection$EL.stream(this.f9690b).map(cqk.f8918e).forEach(cpf.f8552d);
        }
    }
}
