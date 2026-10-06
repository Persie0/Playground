package p000;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class efr implements FusionProgressCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ egk f13855a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eft f13856b;

    public efr(eft eftVar, egk egkVar) {
        this.f13856b = eftVar;
        this.f13855a = egkVar;
    }

    /* JADX INFO: renamed from: e */
    private final void m7282e(final long j, final ihk ihkVar, final ShotMetadata shotMetadata, final boolean z) {
        final hcu hcuVarM13114x = this.f13856b.f13868j.m13114x();
        mrm mrmVar = (mrm) ihkVar.f30967b;
        boolean z2 = mrmVar.mo16813g() && ((InterleavedImageU8) mrmVar.mo16809c()).m5004c() > 0 && ((InterleavedImageU8) ((mrm) ihkVar.f30967b).mo16809c()).m5003b() > 0;
        mrm mrmVar2 = (mrm) ihkVar.f30966a;
        boolean z3 = mrmVar2.mo16813g() && ((HardwareBuffer) mrmVar2.mo16809c()).getWidth() > 0 && ((HardwareBuffer) ((mrm) ihkVar.f30966a).mo16809c()).getHeight() > 0;
        if (!z2 && !z3) {
            eft eftVar = this.f13856b;
            hcuVarM13114x.close();
            eftVar.m7284f(j);
        } else {
            final byte[] bArr = null;
            final byte[] bArr2 = null;
            final byte[] bArr3 = null;
            this.f13856b.m7285g(new Runnable(j, ihkVar, shotMetadata, hcuVarM13114x, z, bArr, bArr2, bArr3) { // from class: efq

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f13850b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ShotMetadata f13851c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f13852d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ hcu f13853e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ ihk f13854f;

                @Override // java.lang.Runnable
                public final void run() {
                    efr efrVar = this.f13849a;
                    long j2 = this.f13850b;
                    ihk ihkVar2 = this.f13854f;
                    ShotMetadata shotMetadata2 = this.f13851c;
                    hcu hcuVar = this.f13853e;
                    boolean z4 = this.f13852d;
                    eft eftVar2 = efrVar.f13856b;
                    try {
                        eftVar2.f13865g.f13881f.mo13961e("fusion#saveImage");
                        edz edzVarM7202a = eea.m7202a();
                        edzVarM7202a.m7192c(kxk.m14965K(new InterleavedImageU16()));
                        edzVarM7202a.m7193d(new gmj());
                        edzVarM7202a.m7196g(TimeUnit.MICROSECONDS.toNanos(shotMetadata2.m5096b()));
                        edzVarM7202a.f13542j = eftVar2.f13866h;
                        edzVarM7202a.m7194e(kay.m13889b(eftVar2.f13862d));
                        edzVarM7202a.m7191b();
                        Object obj = ihkVar2.f30967b;
                        if (((mrm) obj).mo16813g()) {
                            edzVarM7202a.f13533a = (InterleavedImageU8) ((mrm) obj).mo16809c();
                        } else {
                            edzVarM7202a.f13535c = (HardwareBuffer) ((mrm) ihkVar2.f30966a).mo16809c();
                        }
                        edzVarM7202a.m7195f(shotMetadata2);
                        edzVarM7202a.f13543k = eftVar2.f13869k;
                        if (z4) {
                            ((eck) eftVar2.f13865g.f13877b.get()).mo7118a(eftVar2.f13866h, mrm.m16829i(edzVarM7202a.m7190a()), egl.NONE);
                            eftVar2.f13864f = true;
                        } else {
                            ((eck) eftVar2.f13865g.f13877b.get()).mo7119b(eftVar2.f13866h, edzVarM7202a.m7190a());
                        }
                    } finally {
                        eftVar2.f13865g.f13881f.mo13962f();
                        hcuVar.close();
                        eftVar2.m7284f(j2);
                    }
                }
            });
        }
    }

    @Override // com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback
    /* JADX INFO: renamed from: a */
    public final void mo4179a(long j, int i, int i2, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        eft eftVar = this.f13856b;
        long j2 = jCurrentTimeMillis - eftVar.f13863e;
        nxl nxlVar = eftVar.f13867i;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        int i3 = (int) j2;
        niz nizVar = (niz) nxlVar.f44974b;
        niz nizVar2 = niz.f42849e;
        nizVar.f42851a |= 1;
        nizVar.f42852b = i3;
        nxl nxlVar2 = this.f13856b.f13867i;
        int iMo4176h = this.f13855a.mo4176h(i);
        if (!nxlVar2.f44974b.m18142ac()) {
            nxlVar2.mo18106p();
        }
        niz nizVar3 = (niz) nxlVar2.f44974b;
        nizVar3.f42853c = iMo4176h - 1;
        nizVar3.f42851a |= 2;
        nxl nxlVar3 = this.f13856b.f13867i;
        int iMo4175g = this.f13855a.mo4175g(i2);
        if (!nxlVar3.f44974b.m18142ac()) {
            nxlVar3.mo18106p();
        }
        niz nizVar4 = (niz) nxlVar3.f44974b;
        nizVar4.f42854d = iMo4175g - 1;
        nizVar4.f42851a |= 4;
        if (z) {
            try {
                egk egkVar = this.f13855a;
                eft eftVar2 = this.f13856b;
                egkVar.mo4170b(eftVar2.f13865g.f13878c, eftVar2.f13860b);
            } catch (IOException e) {
                ((nbe) ((nbe) ((nbe) efu.f13876a.m17252c()).mo17283h(e)).mo17276G(1388)).mo17292q("Couldn't apply special type for %s", j);
            }
        }
        this.f13856b.f13875q = true;
        this.f13856b.m7284f(j);
    }

    @Override // com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback
    /* JADX INFO: renamed from: b */
    public final void mo4180b(long j, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) {
        m7282e(j, ihk.m11330i(interleavedImageU8), shotMetadata, false);
    }

    @Override // com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback
    /* JADX INFO: renamed from: c */
    public final void mo4181c(InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, String str) {
        this.f13856b.m7285g(new cgg(this, shotMetadata, interleavedImageU8, str, this.f13856b.f13868j.m13114x(), 8, null));
    }

    @Override // com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback
    /* JADX INFO: renamed from: d */
    public final void mo4182d(long j, ihk ihkVar, ShotMetadata shotMetadata) {
        m7282e(j, ihkVar, shotMetadata, true);
    }

    @Override // com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback
    public void onProgress(long j, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        lku.m15669w(z);
        this.f13856b.f13859a.mo9016a(eec.f13605b, f);
    }
}
