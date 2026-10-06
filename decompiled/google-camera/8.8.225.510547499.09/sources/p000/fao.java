package p000;

import java.util.ArrayList;
import java.util.List;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fao implements fbp, fbj, fbl, fbn, fbo {

    /* JADX INFO: renamed from: d */
    public faz f21142d;

    /* JADX INFO: renamed from: f */
    private faz f21144f;

    /* JADX INFO: renamed from: g */
    private faz f21145g;

    /* JADX INFO: renamed from: a */
    final List f21139a = new ArrayList();

    /* JADX INFO: renamed from: b */
    final List f21140b = new ArrayList();

    /* JADX INFO: renamed from: e */
    private int f21143e = 0;

    /* JADX INFO: renamed from: c */
    public int f21141c = 0;

    /* JADX INFO: renamed from: a */
    public final void m8081a(faz fazVar) {
        this.f21140b.remove(fazVar);
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        int i = this.f21141c - 1;
        this.f21141c = i;
        lku.m15669w(i >= 0);
        if (this.f21141c == 0) {
            m8081a(this.f21145g);
            for (fbp fbpVar : this.f21139a) {
                if (fbpVar instanceof faq) {
                    ((faq) fbpVar).mo5928b();
                }
            }
        }
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        int i = this.f21141c + 1;
        this.f21141c = i;
        lku.m15669w(i > 0);
        if (this.f21141c == 1) {
            fag fagVar = fag.f21101c;
            m8082f(fagVar);
            this.f21145g = fagVar;
        }
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        int i = this.f21143e + 1;
        this.f21143e = i;
        lku.m15669w(i > 0);
        if (this.f21143e == 1) {
            fag fagVar = fag.f21103e;
            m8082f(fagVar);
            this.f21144f = fagVar;
        }
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        int i = this.f21143e - 1;
        this.f21143e = i;
        lku.m15669w(i >= 0);
        if (this.f21143e == 0) {
            m8081a(this.f21144f);
            for (fbp fbpVar : this.f21139a) {
                if (fbpVar instanceof fat) {
                    ((fat) fbpVar).mo8086d();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8082f(faz fazVar) {
        Collection$EL.forEach(this.f21139a, new dco(fazVar, 15));
        this.f21140b.add(fazVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m8083g(fbp fbpVar) {
        jvd.m13538a();
        this.f21139a.add(fbpVar);
        Collection$EL.forEach(this.f21140b, new dco(fbpVar, 16));
    }
}
