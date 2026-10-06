package p000;

import com.google.common.p019io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgd implements fgv {

    /* JADX INFO: renamed from: a */
    public final fgh f21808a;

    /* JADX INFO: renamed from: b */
    public final fgv f21809b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ gyu f21810c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ nqf f21811d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ gyh f21812e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ fgh f21813f;

    public fgd(fgh fghVar, gyu gyuVar, nqf nqfVar, gyh gyhVar) {
        this.f21813f = fghVar;
        this.f21810c = gyuVar;
        this.f21811d = nqfVar;
        this.f21812e = gyhVar;
        this.f21808a = fghVar;
        this.f21809b = new fgm(gyuVar);
    }

    @Override // p000.fgv
    /* JADX INFO: renamed from: a */
    public final nps mo8370a(final hln hlnVar, final gyj gyjVar, final mrm mrmVar, final long j, final hjy hjyVar) {
        nqf nqfVar = this.f21811d;
        nom nomVar = new nom() { // from class: fgb
            @Override // p000.nom
            /* JADX INFO: renamed from: a */
            public final nps mo3942a(Object obj) {
                fgd fgdVar = this.f21796a;
                final hln hlnVar2 = hlnVar;
                final gyj gyjVar2 = gyjVar;
                final mrm mrmVar2 = mrmVar;
                final hjy hjyVar2 = hjyVar;
                final fgg fggVar = (fgg) obj;
                final fgh fghVar = fgdVar.f21808a;
                final nqf nqfVarM17621g = nqf.m17621g();
                fghVar.f21850b.execute(new Runnable() { // from class: fft
                    @Override // java.lang.Runnable
                    public final void run() {
                        fgh fghVar2 = fghVar;
                        hln hlnVar3 = hlnVar2;
                        mrm mrmVar3 = mrmVar2;
                        hjy hjyVar3 = hjyVar2;
                        gyj gyjVar3 = gyjVar2;
                        fgg fggVar2 = fggVar;
                        nqf nqfVar2 = nqfVarM17621g;
                        drj drjVar = new drj(hlnVar3, mrmVar3, hjyVar3, (byte[]) null, gyjVar3);
                        fggVar2.f21828h.mo14894e(Long.valueOf(fggVar2.f21825e));
                        fggVar2.f21832l.mo14894e(hlnVar3.f28269d);
                        kxk.m14975U(fggVar2.f21834n.mo8411b(), new fgf(fghVar2, fggVar2, drjVar, 0, null, null), fghVar2.f21851c);
                        nqfVar2.mo16665f(fggVar2.f21833m);
                    }
                });
                return nqfVarM17621g;
            }
        };
        final gyh gyhVar = this.f21812e;
        return fgh.m8373b(nqfVar, nomVar, new nom() { // from class: fgc
            @Override // p000.nom
            /* JADX INFO: renamed from: a */
            public final nps mo3942a(Object obj) {
                fgd fgdVar = this.f21801a;
                gyh gyhVar2 = gyhVar;
                hln hlnVar2 = hlnVar;
                gyj gyjVar2 = gyjVar;
                mrm mrmVar2 = mrmVar;
                long j2 = j;
                hjy hjyVar2 = hjyVar;
                RuntimeException runtimeException = (RuntimeException) obj;
                if (!(runtimeException instanceof CancellationException)) {
                    ((nbe) ((nbe) ((nbe) fgh.f21843a.m17251b()).mo17283h(runtimeException)).mo17276G((char) 2184)).mo17290o("Error during long shot.");
                    gyhVar2.mo9870B(ihd.f30944a, runtimeException);
                }
                return fgdVar.f21809b.mo8370a(hlnVar2, gyjVar2, mrmVar2, j2, hjyVar2);
            }
        });
    }

    @Override // p000.fgv
    /* JADX INFO: renamed from: b */
    public final nps mo8371b(final hln hlnVar, final InputStream inputStream, final gyj gyjVar, final mrm mrmVar, final long j, final String str, final hjy hjyVar) {
        return fgh.m8373b(this.f21811d, new nom() { // from class: ffz
            @Override // p000.nom
            /* JADX INFO: renamed from: a */
            public final nps mo3942a(Object obj) {
                fgd fgdVar = this.f21778a;
                hln hlnVar2 = hlnVar;
                InputStream inputStream2 = inputStream;
                gyj gyjVar2 = gyjVar;
                mrm mrmVar2 = mrmVar;
                hjy hjyVar2 = hjyVar;
                fgg fggVar = (fgg) obj;
                fgh fghVar = fgdVar.f21808a;
                boolean z = fhc.f21954a;
                try {
                    lku.m15613H(!((mrm) kxk.m14973S(fggVar.f21832l)).mo16813g());
                    mrm mrmVar3 = fghVar.f21855g;
                    if (mrmVar3.mo16813g()) {
                        ((fti) mrmVar3.mo16809c()).mo8758c(fggVar.f21821a);
                    }
                    try {
                        drj drjVar = new drj(hlnVar2, mrmVar2, hjyVar2, ByteStreams.toByteArray(inputStream2), gyjVar2);
                        gyu gyuVar = fggVar.f21821a;
                        if (!fggVar.f21835o) {
                            lku.m15613H(true);
                            fghVar.f21863o.postDelayed(new epm(fghVar, fggVar, drjVar, 7, (byte[]) null, (byte[]) null), fggVar.f21821a, 15000L);
                            fgh.m8374d(fggVar.f21827g, fggVar.f21821a, fghVar.f21863o);
                        }
                        if (!fggVar.f21828h.isDone()) {
                            fggVar.f21828h.mo14894e(Long.valueOf(fggVar.f21825e));
                        }
                        kxk.m14975U(fggVar.f21834n.mo8411b(), new fge(fghVar, fggVar, drjVar, null, null), fghVar.f21851c);
                        return fggVar.f21833m;
                    } catch (IOException e) {
                        ((nbe) ((nbe) ((nbe) fgh.f21843a.m17251b()).mo17283h(e)).mo17276G((char) 2195)).mo17290o("Error occurred fetching jpeg bytes in finishMicrovideo");
                        return kxk.m14964J(e);
                    }
                } catch (ExecutionException e2) {
                    ((nbe) ((nbe) ((nbe) fgh.f21843a.m17251b()).mo17283h(e2)).mo17276G((char) 2196)).mo17290o("Location info found for a non-long shot");
                    return kxk.m14964J(e2);
                }
            }
        }, new nom() { // from class: fga
            @Override // p000.nom
            /* JADX INFO: renamed from: a */
            public final nps mo3942a(Object obj) {
                fgd fgdVar = this.f21788a;
                return fgdVar.f21809b.mo8371b(hlnVar, inputStream, gyjVar, mrmVar, j, str, hjyVar);
            }
        });
    }

    @Override // p000.fgv
    /* JADX INFO: renamed from: c */
    public final void mo8372c() {
        kxk.m14975U(this.f21811d, new cmo(this, 12), not.INSTANCE);
    }
}
