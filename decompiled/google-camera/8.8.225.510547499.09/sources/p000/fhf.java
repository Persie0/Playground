package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.libraries.microvideo.xmp.nativemotionphotos.NativeMotionPhotoProcessor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhf implements kyq {

    /* JADX INFO: renamed from: a */
    public static final nbh f21962a = nbh.m17259h("com/google/android/apps/camera/microvideo/encoder/AddMetaTrackMuxer");

    /* JADX INFO: renamed from: b */
    public final nps f21963b;

    /* JADX INFO: renamed from: c */
    public final nqf f21964c;

    /* JADX INFO: renamed from: d */
    public final nps f21965d;

    /* JADX INFO: renamed from: e */
    public final nps f21966e;

    /* JADX INFO: renamed from: f */
    public final nps f21967f;

    /* JADX INFO: renamed from: g */
    public final boolean f21968g;

    /* JADX INFO: renamed from: h */
    public final boolean f21969h;

    /* JADX INFO: renamed from: i */
    private final kyq f21970i;

    /* JADX INFO: renamed from: j */
    private final MediaFormat f21971j;

    /* JADX INFO: renamed from: k */
    private final List f21972k = new ArrayList();

    /* JADX INFO: renamed from: l */
    private final Executor f21973l;

    public fhf(kyq kyqVar, boolean z, nps npsVar, nqf nqfVar, nps npsVar2, nps npsVar3, nps npsVar4, boolean z2, Executor executor) {
        this.f21970i = kyqVar;
        this.f21966e = npsVar3;
        this.f21967f = npsVar4;
        this.f21973l = executor;
        this.f21963b = npsVar;
        this.f21964c = nqfVar;
        this.f21965d = npsVar2;
        this.f21968g = z2;
        this.f21969h = z;
        MediaFormat mediaFormat = new MediaFormat();
        this.f21971j = mediaFormat;
        mediaFormat.setString("mime", true != z ? "application/microvideo-image-meta" : "application/motionphoto-image-meta");
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: a */
    public final synchronized kyt mo8410a() {
        kyt kytVarMo8410a;
        nqf nqfVarM17621g;
        kytVarMo8410a = this.f21970i.mo8410a();
        nqfVarM17621g = nqf.m17621g();
        this.f21972k.add(nqfVarM17621g);
        return new fhe(kytVarMo8410a, nqfVarM17621g);
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: b */
    public final nps mo8411b() {
        return this.f21970i.mo8411b();
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: c */
    public final void mo8412c() {
        this.f21970i.mo8412c();
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: d */
    public final void mo8413d() {
        final nps npsVarM14961G;
        nps npsVarM14962H;
        final kyt kytVarMo8410a = this.f21970i.mo8410a();
        kytVarMo8410a.mo8408a(kxk.m14965K(this.f21971j));
        kytVarMo8410a.mo8409b(ByteBuffer.allocateDirect(0), new MediaCodec.BufferInfo());
        synchronized (this) {
            npsVarM14961G = kxk.m14961G(this.f21972k);
        }
        synchronized (this) {
            npsVarM14962H = kxk.m14962H(npsVarM14961G, this.f21965d, this.f21966e, this.f21963b, this.f21967f);
        }
        npsVarM14962H.mo2282d(new Runnable() { // from class: fhd
            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArrMo17760J;
                fhf fhfVar = this.f21957a;
                nps npsVar = npsVarM14961G;
                kyt kytVar = kytVarMo8410a;
                long jLongValue = -1;
                for (Long l : (List) kxk.m14974T(npsVar)) {
                    if (l != null && (jLongValue < 0 || l.longValue() < jLongValue)) {
                        jLongValue = l.longValue();
                    }
                }
                long jMax = Math.max(jLongValue, 0L);
                long jLongValue2 = ((Long) kxk.m14974T(fhfVar.f21963b)).longValue();
                fhfVar.f21964c.mo14894e(Long.valueOf(jMax));
                if (jLongValue2 < jMax) {
                    ((nbe) ((nbe) fhf.f21962a.m17251b()).mo17276G(2249)).mo17297v("A shutter timestamp (%d) with value less than the starting timestamp (%d) was selected. Overwriting timestamp with starting timestamp.", jLongValue2, jMax);
                }
                long jMax2 = Math.max(jMax, jLongValue2);
                boolean z = fhfVar.f21968g;
                mrm mrmVar = (mrm) kxk.m14974T(fhfVar.f21965d);
                mrm mrmVarM16829i = (mrm) kxk.m14974T(fhfVar.f21966e);
                mrm mrmVar2 = (mrm) kxk.m14974T(fhfVar.f21967f);
                boolean z2 = fhfVar.f21969h;
                nxl nxlVarM18137O = obj.f45302g.m18137O();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                obj objVar = (obj) nxqVar;
                objVar.f45304a |= 4;
                objVar.f45307d = z;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O.f44974b;
                obj objVar2 = (obj) nxqVar2;
                objVar2.f45304a |= 1;
                objVar2.f45305b = jMax2;
                long j = jMax2 - jMax;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                obj objVar3 = (obj) nxlVarM18137O.f44974b;
                objVar3.f45304a |= 2;
                objVar3.f45306c = j;
                if (mrmVar.mo16813g()) {
                    obp obpVar = (obp) mrmVar.mo16809c();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    obj objVar4 = (obj) nxlVarM18137O.f44974b;
                    objVar4.f45308e = obpVar;
                    objVar4.f45304a |= 8;
                }
                if (mrmVarM16829i.mo16813g()) {
                    if (mrmVar2.mo16813g()) {
                        lku.m15614I(!z2, "meta + V2 isn't supported yet!");
                        obm obmVar = (obm) mrmVarM16829i.mo16809c();
                        nxl nxlVar = (nxl) obmVar.m18143ad(5);
                        nxlVar.m18108s(obmVar);
                        obn obnVar = (obn) mrmVar2.mo16809c();
                        if (!nxlVar.f44974b.m18142ac()) {
                            nxlVar.mo18106p();
                        }
                        obm obmVar2 = (obm) nxlVar.f44974b;
                        obmVar2.f45327e = obnVar;
                        obmVar2.f45323a |= 4;
                        mrmVarM16829i = mrm.m16829i((obm) nxlVar.mo18103l());
                    }
                    obm obmVar3 = (obm) mrmVarM16829i.mo16809c();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    obj objVar5 = (obj) nxlVarM18137O.f44974b;
                    objVar5.f45309f = obmVar3;
                    objVar5.f45304a |= 16;
                }
                if (z2) {
                    obj objVar6 = (obj) nxlVarM18137O.mo18103l();
                    int i = NativeMotionPhotoProcessor.f7947a;
                    bArrMo17760J = NativeMotionPhotoProcessor.encodeVideoMetadata(objVar6.mo17760J());
                } else {
                    bArrMo17760J = ((obj) nxlVarM18137O.mo18103l()).mo17760J();
                }
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.size = bArrMo17760J.length;
                bufferInfo.presentationTimeUs = jMax2;
                kytVar.mo8409b(ByteBuffer.wrap(bArrMo17760J), bufferInfo);
                kytVar.close();
            }
        }, this.f21973l);
        this.f21970i.mo8413d();
    }
}
