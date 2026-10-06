package p000;

import android.hardware.HardwareBuffer;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotMetadata;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eoa implements edb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f14804a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f14805b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f14806c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f14807d;

    public eoa(eoc eocVar, eob eobVar, kcc kccVar, int i) {
        this.f14807d = i;
        this.f14806c = eocVar;
        this.f14804a = eobVar;
        this.f14805b = kccVar;
    }

    public eoa(ewq ewqVar, edz edzVar, ebn ebnVar, int i, byte[] bArr) {
        this.f14807d = i;
        this.f14804a = ewqVar;
        this.f14805b = edzVar;
        this.f14806c = ebnVar;
    }

    /* JADX INFO: renamed from: b */
    private final void m7582b(HardwareBuffer hardwareBuffer, dos dosVar) {
        hardwareBuffer.close();
        ((eob) this.f14804a).f14812e.mo8566a(dosVar);
        ((eoc) this.f14806c).m7584b((eob) this.f14804a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r0v33, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r6v3, types: [fca, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // p000.edb
    /* JADX INFO: renamed from: a */
    public final void mo7172a(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        switch (this.f14807d) {
            case 0:
                nbz nbzVar = nch.f41987a;
                this.f14805b.mo13952a();
                int size = ((eob) this.f14804a).f14817j.size();
                eob eobVar = (eob) this.f14804a;
                int i = eobVar.f14819l;
                if (size > i) {
                    ((kba) eobVar.f14817j.get(i)).close();
                } else {
                    ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17276G(1645)).mo17291p("Image token for %dth callback not found.", ((eob) this.f14804a).f14819l);
                }
                ((eob) this.f14804a).f14816i.open();
                synchronized (this.f14806c) {
                    if (!((eoc) this.f14806c).f14831j.containsKey(((eob) this.f14804a).f14808a)) {
                        hardwareBuffer.close();
                        ((eob) this.f14804a).f14808a.m7218a();
                        return;
                    }
                    try {
                        if (((eob) this.f14804a).f14819l == 0) {
                            Object obj = this.f14806c;
                            kbc kbcVar = new kbc(hardwareBuffer.getWidth(), hardwareBuffer.getHeight());
                            Object obj2 = this.f14804a;
                            int iM3564b = cem.m3564b(((fua) ((eob) obj2).f14808a.f13675v.f25503d).f23573a, ((eoc) obj).f14828g, ((eoc) obj).f14832k, ((eoc) obj).f14830i, ((eoc) obj).f14829h);
                            glk glkVar = ((eoc) obj).f14834m;
                            FileOutputStream fileOutputStreamMo14685e = ((eob) obj2).f14811d.mo14685e();
                            kay kayVarM13889b = kay.m13889b(iM3564b);
                            Object obj3 = glkVar.f25501b;
                            ?? r6 = glkVar.f25500a;
                            ?? r7 = glkVar.f25502c;
                            ?? r0 = glkVar.f25503d;
                            dhx dhxVar = did.f11416a;
                            r0.mo6179g();
                            ((eob) obj2).f14821n = new eod((bko) obj3, r6, r7, fileOutputStreamMo14685e, kbcVar, kayVarM13889b, null, null, null);
                            FrameMetadata frameMetadataM5098d = shotMetadata.m5098d();
                            long jFrameMetadata_wb_get = GcamModuleJNI.FrameMetadata_wb_get(frameMetadataM5098d.f8263a, frameMetadataM5098d);
                            AwbInfo awbInfo = jFrameMetadata_wb_get == 0 ? null : new AwbInfo(jFrameMetadata_wb_get, false);
                            ((eob) this.f14804a).f14814g.mo14894e(new AwbInfo(GcamModuleJNI.new_AwbInfo__SWIG_1(AwbInfo.m4899a(awbInfo), awbInfo), true));
                            AeResults aeResultsM5097c = shotMetadata.m5097c();
                            ((eob) this.f14804a).f14815h.mo14894e(new ecp(aeResultsM5097c.m4882a(nqz.f44120a), aeResultsM5097c.m4882a(nqz.f44121b)));
                            break;
                        }
                        eod eodVar = ((eob) this.f14804a).f14821n;
                        if (eodVar == null) {
                            m7582b(hardwareBuffer, new dos("Encoder not available."));
                            return;
                        }
                        eodVar.m7588b(hardwareBuffer, TimeUnit.NANOSECONDS.convert(((eob) this.f14804a).f14820m, TimeUnit.MILLISECONDS));
                        eob eobVar2 = (eob) this.f14804a;
                        int i2 = eobVar2.f14819l + 1;
                        eobVar2.f14819l = i2;
                        eobVar2.f14820m += ((eoc) this.f14806c).f14823b;
                        if (i2 == eobVar2.f14810c) {
                            kxk.m14975U(eodVar.m7587a(), new juv(this, 1), ((eoc) this.f14806c).f14825d);
                            return;
                        }
                        return;
                    } catch (IOException e) {
                        ((nbe) ((nbe) ((nbe) eoc.f14822a.m17251b().mo17282g(nch.f41987a, "KeplerController")).mo17283h(e)).mo17276G((char) 1643)).mo17290o("Encoder creation failed");
                        m7582b(hardwareBuffer, new dos("Failed to create encoder.", e));
                        return;
                    }
                }
            default:
                ((ewq) this.f14804a).f20674h.mo13961e(voNZjxiJou.sjXk);
                edz edzVar = (edz) this.f14805b;
                edzVar.f13535c = hardwareBuffer;
                edzVar.m7195f(shotMetadata);
                ((ewq) this.f14804a).m7954c((ebn) this.f14806c, edzVar.m7190a());
                ((ewq) this.f14804a).f20674h.mo13962f();
                return;
        }
    }
}
