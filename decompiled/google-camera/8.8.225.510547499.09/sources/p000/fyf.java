package p000;

import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyf implements fzt {

    /* JADX INFO: renamed from: a */
    public final gyh f23882a;

    /* JADX INFO: renamed from: b */
    public final fua f23883b;

    /* JADX INFO: renamed from: c */
    public final gvw f23884c;

    /* JADX INFO: renamed from: d */
    public kay f23885d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fyg f23886e;

    /* JADX INFO: renamed from: f */
    private final fyt f23887f;

    /* JADX INFO: renamed from: g */
    private final List f23888g = new ArrayList();

    public fyf(fyg fygVar, fyt fytVar, gyh gyhVar, fua fuaVar, gvw gvwVar) {
        this.f23886e = fygVar;
        this.f23887f = fytVar;
        this.f23882a = gyhVar;
        this.f23883b = fuaVar;
        this.f23884c = gvwVar;
    }

    /* JADX INFO: renamed from: b */
    private final List m8948b(List list) {
        lku.m15669w(list.size() == this.f23888g.size());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new fxn(new kmw((kpw) list.get(i)), ((fxn) this.f23888g.get(i)).m8924k()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private final void m8949c() {
        Iterator it = this.f23888g.iterator();
        while (it.hasNext()) {
            ((kpw) it.next()).close();
        }
    }

    @Override // p000.fzt
    /* JADX INFO: renamed from: a */
    public final void mo3602a(kpw kpwVar, nps npsVar) {
        this.f23885d = kay.m13889b(((Integer) this.f23886e.f23891c.m3565c().mo3831be()).intValue());
        this.f23888g.add(new fxn(kpwVar, npsVar));
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        nps npsVarM17553i;
        if (this.f23888g.size() != 1) {
            this.f23886e.f23889a.mo13947i("Received " + this.f23888g.size() + " images, which is different than  1. Abort shot.");
            m8949c();
            return;
        }
        this.f23885d.getClass();
        try {
            nps npsVarM8924k = ((fxn) this.f23888g.get(0)).m8924k();
            npsVarM8924k.getClass();
            this.f23882a.mo9905k().mo10401c((kpp) npsVarM8924k.get(1000L, TimeUnit.MILLISECONDS), false);
            ArrayList arrayList = new ArrayList();
            for (fxn fxnVar : this.f23888g) {
                if (fxnVar.m8926m()) {
                    arrayList.add(new kmv(fxnVar, 3));
                } else {
                    kbo kboVar = this.f23886e.f23889a;
                    fxl fxlVar = fxm.f23803b;
                    Object objM8925l = fxnVar.m8925l(fxlVar);
                    fxlVar.toString();
                    objM8925l.getClass();
                    kboVar.mo13947i("Ignoring and closing image ".concat(objM8925l.toString()));
                    fxnVar.close();
                }
            }
            List listM8948b = m8948b(arrayList);
            List listM8948b2 = m8948b(arrayList);
            List listM8948b3 = m8948b(arrayList);
            fyt fytVar = this.f23887f;
            kay kayVar = this.f23885d;
            kayVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listM8948b.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((kpw) it.next()).mo7248d()));
            }
            if (listM8948b.size() == 1) {
                ((fxn) listM8948b.get(0)).close();
                npsVarM17553i = kxk.m14965K(0);
            } else {
                jvb jvbVar = new jvb();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = listM8948b.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new kmw((fxn) it2.next()));
                }
                cjb cjbVar = new cjb();
                cjbVar.addAll(arrayList3);
                jvbVar.m13537d(cjbVar);
                grq grqVarM9718a = gsw.m9718a();
                try {
                    nqf nqfVar = grqVarM9718a.f26172a;
                    for (int i = 0; i < listM8948b.size(); i++) {
                        kpw kpwVar = (kpw) arrayList3.get(i);
                        nps npsVarM8924k2 = ((fxn) listM8948b.get(i)).m8924k();
                        grl grlVarM9671a = grm.m9671a(kpwVar);
                        grlVarM9671a.f26145c = kayVar;
                        grlVarM9671a.f26146d = npsVarM8924k2;
                        grm grmVarM9669a = grlVarM9671a.m9669a();
                        grm grmVar = grqVarM9718a.f26173b;
                        if (grmVar == null || grmVar.f26152a.mo7248d() < grmVarM9669a.f26152a.mo7248d()) {
                            grm grmVar2 = grqVarM9718a.f26173b;
                            if (grmVar2 != null) {
                                grmVar2.f26152a.close();
                            }
                            grqVarM9718a.f26173b = grmVarM9669a;
                        } else {
                            grmVarM9669a.f26152a.close();
                        }
                    }
                    grqVarM9718a.close();
                    npsVarM17553i = nod.m17553i(nqfVar, new dzm(listM8948b, 2), not.INSTANCE);
                    kxk.m14975U(npsVarM17553i, new djq(jvbVar, 10), not.INSTANCE);
                } catch (Throwable th) {
                    try {
                        grqVarM9718a.close();
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod(YmzeHXaMYOLk.hOhmphmn, Throwable.class).invoke(th, th2);
                            throw th;
                        } catch (Exception e) {
                            throw th;
                        }
                    }
                }
            }
            nps npsVarM17553i2 = nod.m17553i(npsVarM17553i, new fyv((fyw) fytVar, arrayList2), not.INSTANCE);
            lku.m15613H(this.f23885d != null);
            nps npsVarM17553i3 = nod.m17553i(npsVarM17553i2, new dvz(this, listM8948b2, 3), not.INSTANCE);
            this.f23885d.getClass();
            kxk.m14975U(npsVarM17553i3, new djq(this, 9), not.INSTANCE);
            nps npsVarM17554j = nod.m17554j(nod.m17554j(nod.m17554j(nod.m17553i(npsVarM17553i2, new fye(this, listM8948b3, gzl.m10015a(((Integer) this.f23886e.f23894f.mo3831be()).intValue()), 0), not.INSTANCE), new etv(3), not.INSTANCE), new cnc(this, 7), not.INSTANCE), new cnc(this, 6), not.INSTANCE);
            kxk.m14975U(npsVarM17554j, new djq(this, 5), not.INSTANCE);
            kxk.m14975U(npsVarM17554j, new djq(this, 6), not.INSTANCE);
        } catch (InterruptedException e2) {
            this.f23886e.f23889a.mo13948j("Interrupted before image could be saved", e2);
            m8949c();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            this.f23886e.f23889a.mo13948j("Unable to save image.  Camera likely shutdown.", e3);
            m8949c();
        } catch (TimeoutException e4) {
            this.f23886e.f23889a.mo13948j("Timeout retrieving image metadata, aborting the shot", e4);
            m8949c();
        }
    }
}
