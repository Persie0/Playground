package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import java.io.File;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ehq implements edy {

    /* JADX INFO: renamed from: a */
    public final gyh f14064a;

    /* JADX INFO: renamed from: b */
    public long f14065b;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ehr f14068e;

    /* JADX INFO: renamed from: h */
    private final gaw f14071h;

    /* JADX INFO: renamed from: i */
    private final mrm f14072i;

    /* JADX INFO: renamed from: j */
    private final UUID f14073j;

    /* JADX INFO: renamed from: k */
    private InterleavedImageU8 f14074k;

    /* JADX INFO: renamed from: l */
    private nsa f14075l;

    /* JADX INFO: renamed from: m */
    private ShotMetadata f14076m;

    /* JADX INFO: renamed from: n */
    private nsa f14077n;

    /* JADX INFO: renamed from: o */
    private ShotMetadata f14078o;

    /* JADX INFO: renamed from: p */
    private PortraitRequest f14079p;

    /* JADX INFO: renamed from: q */
    private ShotMetadata f14080q;

    /* JADX INFO: renamed from: r */
    private nps f14081r;

    /* JADX INFO: renamed from: s */
    private jvb f14082s;

    /* JADX INFO: renamed from: v */
    private final ehn f14085v;

    /* JADX INFO: renamed from: g */
    public final jfs f14070g = new jfs((char[]) null);

    /* JADX INFO: renamed from: f */
    public final nxl f14069f = nlg.f43509f.m18137O();

    /* JADX INFO: renamed from: c */
    public boolean f14066c = false;

    /* JADX INFO: renamed from: t */
    private boolean f14083t = false;

    /* JADX INFO: renamed from: d */
    public int f14067d = 1;

    /* JADX INFO: renamed from: u */
    private boolean f14084u = false;

    public ehq(ehr ehrVar, gyh gyhVar, gaw gawVar, mrm mrmVar, UUID uuid, mrm mrmVar2) {
        this.f14068e = ehrVar;
        this.f14071h = gawVar;
        this.f14064a = gyhVar;
        this.f14072i = mrmVar;
        this.f14073j = uuid;
        gawVar.mo9016a(edx.f13532a, 0.0f);
        this.f14085v = new ehn(this, gawVar, gyhVar, mrmVar2);
    }

    @Override // p000.fzt
    /* JADX INFO: renamed from: a */
    public final void mo3602a(kpw kpwVar, nps npsVar) {
    }

    @Override // p000.edy
    /* JADX INFO: renamed from: b */
    public final void mo7186b(nsa nsaVar, ShotMetadata shotMetadata, nrt nrtVar, List list) {
        this.f14064a.mo9913s();
        if (nsaVar == null || shotMetadata == null) {
            this.f14075l = new nsa();
            this.f14076m = new ShotMetadata();
        } else {
            this.f14075l = nsaVar;
            this.f14076m = shotMetadata;
        }
    }

    @Override // p000.edy
    /* JADX INFO: renamed from: c */
    public final void mo7187c(InterleavedImageU8 interleavedImageU8, PortraitRequest portraitRequest, ShotMetadata shotMetadata, nps npsVar, jvb jvbVar) {
        this.f14074k = interleavedImageU8;
        this.f14079p = portraitRequest;
        this.f14080q = shotMetadata;
        this.f14081r = npsVar;
        this.f14082s = jvbVar;
        ehl ehlVar = this.f14068e.f14087c;
        PortraitRequest portraitRequest2 = this.f14079p;
        long jMo9898d = this.f14064a.mo9898d();
        mrm mrmVarM8495b = ((fjp) ehlVar.f14048b).m8495b();
        if (ehlVar.f14049c.mo6184l(dio.f11670l) && mrmVarM8495b.mo16813g()) {
            File file = new File((File) mrmVarM8495b.mo16809c(), "portrait");
            if (!file.exists() && !file.mkdirs()) {
                ((nbe) ((nbe) ehl.f14047a.m17251b()).mo17276G((char) 1456)).mo17290o("Could not create portrait mode debug data folder.");
            }
            GcamModuleJNI.PortraitRequest_portrait_raw_path_set(portraitRequest2.f8338a, portraitRequest2, file.getAbsolutePath());
            GcamModuleJNI.PortraitRequest_shot_prefix_set(portraitRequest2.f8338a, portraitRequest2, ebq.m7071d(jMo9898d));
        }
        this.f14064a.mo9913s();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        nps npsVarM14964J;
        PortraitRequest portraitRequest;
        int iPixelRectVector_size;
        if (this.f14068e.f14089e.mo6184l(dio.f11644A) && this.f14075l == null) {
            ((nbe) ((nbe) ehr.f14086b.m17252c()).mo17276G((char) 1475)).mo17290o("Attempting to close the session but no primary RAW image has been received.");
            return;
        }
        if (this.f14074k == null) {
            ((nbe) ((nbe) ehr.f14086b.m17252c()).mo17276G((char) 1474)).mo17290o("Attempting to close the session but no RGB image has been received.");
            return;
        }
        if (this.f14068e.f14090f && this.f14077n == null) {
            ((nbe) ((nbe) ehr.f14086b.m17252c()).mo17276G((char) 1473)).mo17290o("Attempting to close the session but no RAW image has been received.");
            return;
        }
        if (this.f14084u) {
            ((nbe) ((nbe) ehr.f14086b.m17252c()).mo17276G((char) 1472)).mo17290o("Postprocessing has already been started from another request.");
            return;
        }
        this.f14064a.mo9913s();
        this.f14084u = true;
        this.f14068e.f14091g.remove(this.f14064a.mo9913s());
        long andIncrement = this.f14068e.f14088d.getAndIncrement();
        InterleavedImageU16 interleavedImageU16M7331e = ehr.m7331e(this.f14081r);
        if (!this.f14072i.mo16813g() || (portraitRequest = this.f14079p) == null) {
            kec kecVar = new kec("Portrait controller not available or null PortraitRequest, no effect applied.");
            ((nbe) ((nbe) ((nbe) ehr.f14086b.m17251b()).mo17283h(kecVar)).mo17276G((char) 1470)).mo17290o("No effect applied.");
            npsVarM14964J = kxk.m14964J(kecVar);
        } else {
            if (portraitRequest.m5076a() == null) {
                iPixelRectVector_size = 0;
            } else {
                PixelRectVector pixelRectVectorM5076a = this.f14079p.m5076a();
                iPixelRectVector_size = (int) GcamModuleJNI.PixelRectVector_size(pixelRectVectorM5076a.f8333a, pixelRectVectorM5076a);
            }
            nxl nxlVar = this.f14069f;
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            nlg nlgVar = (nlg) nxlVar.f44974b;
            nlg nlgVar2 = nlg.f43509f;
            nlgVar.f43511a |= 4;
            nlgVar.f43514d = iPixelRectVector_size;
            this.f14064a.mo9913s();
            npsVarM14964J = ((gpu) this.f14072i.mo16809c()).mo9606e(andIncrement, this.f14074k, interleavedImageU16M7331e, this.f14068e.f14094j, this.f14079p, this.f14075l, this.f14076m, this.f14077n, this.f14078o, this.f14085v);
        }
        kxk.m14975U(npsVarM14964J, new eho(this, andIncrement, 0), not.INSTANCE);
    }

    @Override // p000.edy
    /* JADX INFO: renamed from: d */
    public final void mo7188d(nsa nsaVar, ShotMetadata shotMetadata, nrt nrtVar, List list) {
        this.f14064a.mo9913s();
        if (nsaVar == null || shotMetadata == null) {
            this.f14077n = new nsa();
            this.f14078o = new ShotMetadata();
        } else {
            this.f14077n = nsaVar;
            this.f14078o = shotMetadata;
        }
    }

    @Override // p000.edy
    /* JADX INFO: renamed from: e */
    public final void mo7189e(InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, List list) {
        throw new UnsupportedOperationException("Invalid operation: addSecondaryRgbImage");
    }

    /* JADX INFO: renamed from: f */
    public final void m7329f(long j, mrm mrmVar) {
        if (!this.f14083t || this.f14070g.m13113w() != 0) {
            nbh nbhVar = ehr.f14086b;
            return;
        }
        this.f14071h.mo9016a(edx.f13532a, 1.0f);
        this.f14082s.close();
        if (!this.f14066c) {
            dos dosVar = new dos("PostProcessingPortraitImageSaverImpl did not save any output images.");
            ((nbe) ((nbe) ((nbe) ehr.f14086b.m17251b()).mo17283h(dosVar)).mo17276G(1477)).mo17300y("Error processing the image, cancelling the session %s for %d", this.f14064a.mo9913s(), j);
            this.f14064a.mo9917w(dosVar);
            return;
        }
        nbh nbhVar2 = ehr.f14086b;
        this.f14064a.mo9913s();
        hjy hjyVarMo9905k = this.f14064a.mo9905k();
        nlg nlgVar = (nlg) this.f14069f.mo18103l();
        nxl nxlVar = (nxl) nlgVar.m18143ad(5);
        nxlVar.m18108s(nlgVar);
        ((hjz) hjyVarMo9905k).f28100z = nxlVar;
        if (mrmVar.mo16813g()) {
            ((hjz) this.f14064a.mo9905k()).f28081g = (ExifInterface) mrmVar.mo16809c();
        } else {
            ((hjz) this.f14064a.mo9905k()).f28081g = ebq.m7069a(this.f14074k.m5004c(), this.f14074k.m5003b(), this.f14080q, this.f14064a.mo9907m());
        }
        this.f14064a.mo9869A();
    }

    /* JADX INFO: renamed from: h */
    public final void m7330h(long j, ihk ihkVar, gpv gpvVar, int i, eez eezVar, hcu hcuVar, mrm mrmVar) {
        PortraitRequest portraitRequest = this.f14079p;
        kxk.m14975U(this.f14068e.f14092h.m7265a(j, ihkVar, gpvVar, i, (360 - ntw.m17721g(nrn.m17632a(GcamModuleJNI.PortraitRequest_image_rotation_get(portraitRequest.f8338a, portraitRequest)))) % 360, this.f14079p.m5079d(), eezVar, this.f14064a, this.f14073j, this.f14080q, mrmVar), new ehp(this, hcuVar, eezVar, j, ihkVar, null, null, null), not.INSTANCE);
    }
}
