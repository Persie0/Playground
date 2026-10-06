package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cxo {

    /* JADX INFO: renamed from: b */
    public final mrm f9989b;

    /* JADX INFO: renamed from: c */
    public final dbr f9990c;

    /* JADX INFO: renamed from: d */
    public final cxu f9991d;

    /* JADX INFO: renamed from: e */
    public final dhv f9992e;

    /* JADX INFO: renamed from: h */
    public final djm f9995h;

    /* JADX INFO: renamed from: i */
    private final jww f9996i;

    /* JADX INFO: renamed from: j */
    private final iuj f9997j;

    /* JADX INFO: renamed from: k */
    private final dac f9998k;

    /* JADX INFO: renamed from: a */
    public final List f9988a = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f9993f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g */
    public boolean f9994g = true;

    public cxo(mrm mrmVar, jww jwwVar, djm djmVar, dbr dbrVar, cxu cxuVar, dhv dhvVar, iuj iujVar, jww jwwVar2, cdu cduVar, dac dacVar, byte[] bArr, byte[] bArr2) {
        this.f9989b = mrmVar;
        this.f9996i = jwwVar;
        this.f9995h = djmVar;
        this.f9990c = dbrVar;
        this.f9991d = cxuVar;
        this.f9992e = dhvVar;
        this.f9997j = iujVar;
        this.f9998k = dacVar;
        cduVar.m3529i().m13537d(jwwVar2.mo3830a(new czq(this, 1), jvh.m13554b()));
        cduVar.m3529i().m13537d(m5717b(new cxl(this, 0)));
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m5715f(cxk cxkVar, cxk cxkVar2) {
        if (cxkVar2 != cxkVar) {
            return cxkVar.f9981f || cxkVar2.f9981f;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final cxk m5716a() {
        return (cxk) this.f9996i.mo3831be();
    }

    /* JADX INFO: renamed from: b */
    public final kba m5717b(cxn cxnVar) {
        this.f9988a.add(cxnVar);
        return new cic(this, cxnVar, 7);
    }

    /* JADX INFO: renamed from: c */
    public final void m5718c(boolean z) {
        this.f9996i.mo3415bf(cxk.DEFAULT);
        if (z) {
            this.f9998k.mo5796h(false);
        }
        this.f9997j.mo11761l(false);
        mrm mrmVar = this.f9989b;
        if (mrmVar.mo16813g()) {
            ((dax) mrmVar.mo16809c()).close();
        }
        this.f9993f.set(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m5719d(cxk cxkVar, boolean z) {
        cxk cxkVar2 = (cxk) this.f9996i.mo3831be();
        if (cxkVar2 != cxkVar) {
            Iterator it = this.f9988a.iterator();
            while (it.hasNext()) {
                ((cxn) it.next()).mo5714a(cxkVar2, cxkVar, z);
            }
            this.f9996i.mo3415bf(cxkVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5720e(cxk cxkVar, boolean z) {
        if (this.f9993f.get()) {
            return;
        }
        cxu cxuVar = this.f9991d;
        cxuVar.f10008k = z;
        cxk cxkVar2 = cxk.OFF;
        switch (cxkVar.ordinal()) {
            case 1:
                cxuVar.mo5707b();
                break;
            case 2:
                cxuVar.mo5706a();
                break;
            case 3:
                cxuVar.mo5708c();
                break;
            case 4:
                cxuVar.mo5709d();
                break;
        }
    }
}
