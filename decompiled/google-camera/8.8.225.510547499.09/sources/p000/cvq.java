package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cvq implements kqf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gyw f9814a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gyj f9815b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ gyv f9816c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f9817d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ gyx f9818e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ cvr f9819f;

    public cvq(cvr cvrVar, gyw gywVar, gyj gyjVar, gyv gyvVar, boolean z, gyx gyxVar) {
        this.f9819f = cvrVar;
        this.f9814a = gywVar;
        this.f9815b = gyjVar;
        this.f9816c = gyvVar;
        this.f9817d = z;
        this.f9818e = gyxVar;
    }

    @Override // p000.kqf
    /* JADX INFO: renamed from: a */
    public final void mo5614a() {
        this.f9819f.f9824e.mo6355c(this.f9816c.f26876b, "onAbandoned");
        ((nbe) ((nbe) cvr.f9820a.m17251b()).mo17276G((char) 734)).mo17290o("Video publish abandoned.");
    }

    @Override // p000.kqf
    /* JADX INFO: renamed from: b */
    public final void mo5615b(Throwable th) {
        this.f9819f.f9824e.mo6355c(this.f9816c.f26876b, "onError");
        ((nbe) ((nbe) ((nbe) cvr.f9820a.m17251b()).mo17283h(th)).mo17276G((char) 735)).mo17290o("Video publish error.");
    }

    @Override // p000.kqf
    /* JADX INFO: renamed from: c */
    public final void mo5616c() {
        Uri uriMo14682b = this.f9815b.f26832a.mo14682b();
        boolean z = !uriMo14682b.equals(Uri.EMPTY);
        gyu gyuVar = this.f9816c.f26875a;
        gyuVar.getClass();
        lku.m15616K(z, "MediaStoreUri is empty. Insert video into MediaStore failed for %s", gyuVar);
        gyo gyoVarM9998a = gyp.m9998a();
        gyoVarM9998a.m9992c(this.f9814a);
        gyoVarM9998a.m9993d(uriMo14682b);
        gyoVarM9998a.m9991b(this.f9817d);
        nps npsVarM14965K = kxk.m14965K(gyoVarM9998a.m9990a());
        gye gyeVar = this.f9819f.f9821b;
        gyu gyuVar2 = this.f9816c.f26875a;
        gyuVar2.getClass();
        gyeVar.m9972g(gyuVar2, npsVarM14965K, this.f9818e);
        gye gyeVar2 = this.f9819f.f9821b;
        gyu gyuVar3 = this.f9816c.f26875a;
        gyuVar3.getClass();
        gyeVar2.m9971f(gyuVar3);
        this.f9819f.f9824e.mo6361i(this.f9816c.f26876b);
    }

    @Override // p000.kqf
    /* JADX INFO: renamed from: d */
    public final void mo5617d() {
        this.f9819f.f9824e.mo6355c(this.f9816c.f26876b, "onTimeout");
    }
}
