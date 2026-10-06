package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eex implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f13763a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ eez f13764b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ gpv f13765c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ gyh f13766d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ UUID f13767e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ mrm f13768f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ nqf f13769g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ efa f13770h;

    public eex(efa efaVar, int i, eez eezVar, gpv gpvVar, gyh gyhVar, UUID uuid, mrm mrmVar, nqf nqfVar) {
        this.f13770h = efaVar;
        this.f13763a = i;
        this.f13764b = eezVar;
        this.f13765c = gpvVar;
        this.f13766d = gyhVar;
        this.f13767e = uuid;
        this.f13768f = mrmVar;
        this.f13769g = nqfVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        ((nbe) ((nbe) ((nbe) efa.f13787a.m17251b()).mo17283h(th)).mo17276G((char) 1348)).mo17290o("Error encoding jpeg image.");
        this.f13769g.mo8566a(th);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.NavigableMap] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3811b(Object obj) {
        eex eexVar;
        nps npsVarM14965K;
        fxt fxtVar = (fxt) obj;
        try {
            efa efaVar = this.f13770h;
            fxtVar.getClass();
            int i = this.f13763a;
            eez eezVar = this.f13764b;
            gpv gpvVar = this.f13765c;
            gyh gyhVar = this.f13766d;
            UUID uuid = this.f13767e;
            mrm mrmVar = this.f13768f;
            ExifInterface exifInterface = fxtVar.f23820d;
            efaVar.f13794h.m13108n(exifInterface);
            long j = fxtVar.f23817a;
            kay kayVarM13889b = kay.m13889b(fxtVar.f23819c);
            kbc kbcVar = fxtVar.f23821e;
            try {
                gwv gwvVar = new gwv(i, j, uuid, kayVarM13889b, kbcVar.f35517a, kbcVar.f35518b, fxtVar.f23818b, exifInterface, gpvVar, gyhVar.mo9903i(), efaVar.f13792f);
                mrm mrmVarMo7289a = efaVar.f13791e.mo7289a(gyhVar.mo9906l());
                int i2 = gyhVar.mo9902h().f26874a;
                mrm mrmVarMo16808b = gyhVar.mo9907m().mo16808b(ddu.f10592i);
                efaVar.f13795i.f3651a.put(Long.valueOf(fxtVar.f23817a), Float.valueOf(i));
                if (eezVar != eez.PRIMARY) {
                    String str = "";
                    switch (eezVar.ordinal()) {
                        case 0:
                            str = "ORIGINAL";
                            break;
                        case 2:
                            str = "SECONDARY";
                            break;
                        case 3:
                            str = "DEBUG";
                            break;
                    }
                    gyj gyjVarM9988h = gyhVar.mo9901g().m9988h();
                    gyjVarM9988h.f26832a.mo14688h(str);
                    gyjVarM9988h.f26834c = dzk.NONE;
                    mqu mquVar = mqu.f41450a;
                    npsVarM14965K = kxk.m14965K(gwvVar.m9865a(gyjVarM9988h, mquVar, mquVar));
                } else if (mrmVar.mo16813g()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    gyj gyjVarMo9900f = gyhVar.mo9900f();
                    kbc.m13903h(gwvVar.f26646b, gwvVar.f26647c);
                    hln hlnVar = new hln(krd.JPEG);
                    hlnVar.m10448b(gwvVar.f26645a);
                    try {
                        gwvVar.m9866b(mrmVarMo7289a, mrmVarMo16808b, gyjVarMo9900f.f26833b, gyjVarMo9900f.f26834c.m6969d(), byteArrayOutputStream);
                        npsVarM14965K = ((fgv) mrmVar.mo16809c()).mo8371b(hlnVar, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), gyhVar.mo9900f(), mqu.f41450a, gyhVar.mo9898d(), gyhVar.mo9913s(), gyhVar.mo9905k());
                    } catch (IOException e) {
                        gyjVarMo9900f.m9976a();
                        throw new IllegalStateException(e);
                    }
                } else {
                    npsVarM14965K = kxk.m14965K(gwvVar.m9865a(gyhVar.mo9900f(), mrmVarMo7289a, mrmVarMo16808b));
                }
                eexVar = this;
                try {
                    eexVar.f13769g.mo16665f(nod.m17553i(npsVarM14965K, new ceg(fxtVar, 14), not.INSTANCE));
                } catch (RuntimeException e2) {
                    e = e2;
                    ((nbe) ((nbe) ((nbe) efa.f13787a.m17251b()).mo17283h(e)).mo17276G((char) 1351)).mo17293r("Error attaching jpeg image to the session %s", eexVar.f13766d.mo9913s());
                    eexVar.f13769g.mo8566a(e);
                }
            } catch (RuntimeException e3) {
                e = e3;
                eexVar = this;
                ((nbe) ((nbe) ((nbe) efa.f13787a.m17251b()).mo17283h(e)).mo17276G((char) 1351)).mo17293r("Error attaching jpeg image to the session %s", eexVar.f13766d.mo9913s());
                eexVar.f13769g.mo8566a(e);
            }
        } catch (RuntimeException e4) {
            e = e4;
            eexVar = this;
        }
    }
}
