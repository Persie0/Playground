package p000;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwk implements cwj {

    /* JADX INFO: renamed from: a */
    private final oju f9880a;

    /* JADX INFO: renamed from: b */
    private ctq f9881b;

    /* JADX INFO: renamed from: c */
    private final cwd f9882c;

    public cwk(oju ojuVar, cwd cwdVar, byte[] bArr) {
        this.f9880a = ojuVar;
        this.f9882c = cwdVar;
    }

    @Override // p000.cwj
    /* JADX INFO: renamed from: a */
    public final nps mo5680a() {
        nqf nqfVarM17621g;
        ctq ctqVar = this.f9881b;
        ctqVar.getClass();
        synchronized (((ctx) ctqVar).f9521c) {
            kgg kggVar = ((ctx) ctqVar).f9529k;
            kggVar.getClass();
            kgg kggVar2 = ((ctx) ctqVar).f9530l;
            kggVar2.getClass();
            csn csnVar = ((ctx) ctqVar).f9527i;
            csnVar.getClass();
            kfk kfkVar = ((ctx) ctqVar).f9528j;
            kfkVar.getClass();
            synchronized (((ctx) ctqVar).f9521c) {
                csd csdVar = ((ctx) ctqVar).f9538t;
                csdVar.getClass();
                ((ctx) ctqVar).f9515G.m5657d(cum.CAPTURE_SESSION).m13537d(csdVar.m5456f(new ctv((ctx) ctqVar)));
                jvb jvbVarM5657d = ((ctx) ctqVar).f9515G.m5657d(cum.CAPTURE_SESSION);
                ccz cczVar = ((ctx) ctqVar).f9540v;
                cczVar.getClass();
                jvbVarM5657d.m13537d(csdVar.m5456f(cczVar));
                jvb jvbVarM5657d2 = ((ctx) ctqVar).f9515G.m5657d(cum.CAPTURE_SESSION);
                gaf gafVar = ((ctx) ctqVar).f9541w;
                gafVar.getClass();
                jvbVarM5657d2.m13537d(csdVar.m5456f(gafVar));
                Iterator it = ((ctx) ctqVar).f9510B.iterator();
                while (it.hasNext()) {
                    ((ctx) ctqVar).f9515G.m5657d(cum.CAPTURE_SESSION).m13537d(csdVar.m5456f((kfv) it.next()));
                }
                ((ctx) ctqVar).f9527i.getClass();
            }
            ihw ihwVar = ((ctx) ctqVar).f9533o;
            ihwVar.getClass();
            mrm mrmVar = ((ctx) ctqVar).f9543y.f9421b;
            if (mrmVar.mo16813g()) {
                ((ipp) mrmVar.mo16809c()).mo11592c(ihwVar.f31016a, ihwVar.f31017b, ihwVar.f31018c);
            }
            ((ctx) ctqVar).f9536r = kfkVar.mo14131r(kfkVar.mo14132s(kggVar), 1);
            kfc kfcVar = ((ctx) ctqVar).f9536r;
            nqfVarM17621g = nqf.m17621g();
            kfcVar.mo9411k(new ctt((ctx) ctqVar, new AtomicInteger(0), nqfVarM17621g, kfcVar));
            ((ctx) ctqVar).f9515G.m5657d(cum.CAPTURE_SESSION).m13537d(((ctx) ctqVar).f9539u.m6433c(new ctu((ctx) ctqVar, nqfVarM17621g)));
            if (mrmVar.mo16813g()) {
                ((ipp) mrmVar.mo16809c()).mo11590a(((ctx) ctqVar).f9536r, kggVar);
            }
            ((ctx) ctqVar).f9513E = kfkVar.mo14134u(kggVar2, mxk.m17136H(kgq.m14215e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, csnVar.f9349n)));
            Surface surface = ((ctx) ctqVar).f9534p;
            surface.getClass();
            kggVar2.mo14194d(surface);
            kgg kggVar3 = ((ctx) ctqVar).f9531m;
            if (kggVar3 != null) {
                ((ctx) ctqVar).f9514F = kfkVar.mo14132s(kggVar3);
            }
            if (((ctx) ctqVar).m5513b(csnVar)) {
                kgg kggVar4 = ((ctx) ctqVar).f9532n;
                kggVar4.getClass();
                ((ctx) ctqVar).f9537s = kfkVar.mo14131r(kfkVar.mo14132s(kggVar4), 2);
                if (((ctx) ctqVar).f9516H.m6229c(csnVar)) {
                    kfc kfcVar2 = ((ctx) ctqVar).f9537s;
                    kfcVar2.getClass();
                    kfcVar2.mo9411k(new ctr((ctx) ctqVar, kggVar4, 1));
                }
                if (csnVar.f9331C && ((ctx) ctqVar).f9525g.mo5420i(csnVar)) {
                    kfc kfcVar3 = ((ctx) ctqVar).f9537s;
                    kfcVar3.getClass();
                    kfcVar3.mo9411k(new ctr((ctx) ctqVar, kggVar4, 0));
                }
            }
            ((ctx) ctqVar).f9511C = false;
        }
        return nqfVarM17621g;
    }

    @Override // p000.cwj
    /* JADX INFO: renamed from: b */
    public final nps mo5681b(kay kayVar) {
        nps npsVarM14964J;
        kfk kfkVar;
        ctq ctqVar = this.f9881b;
        ctqVar.getClass();
        synchronized (((ctx) ctqVar).f9521c) {
            if (((ctx) ctqVar).f9531m == null || (kfkVar = ((ctx) ctqVar).f9528j) == null || ((ctx) ctqVar).f9514F == null) {
                npsVarM14964J = kxk.m14964J(new IllegalStateException("Snapshot not available"));
            } else {
                kfkVar.mo14122i(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(kayVar.f35503e));
                nqf nqfVarM17621g = nqf.m17621g();
                kfk kfkVar2 = ((ctx) ctqVar).f9528j;
                kfkVar2.getClass();
                kho khoVar = ((ctx) ctqVar).f9514F;
                khoVar.getClass();
                key keyVarMo14130q = kfkVar2.mo14130q(khoVar);
                keyVarMo14130q.mo7050k(new ctw((ctx) ctqVar, nqfVarM17621g, keyVarMo14130q));
                npsVarM14964J = nqfVarM17621g;
            }
        }
        return npsVarM14964J;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r4v11, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, jwn] */
    @Override // p000.cwj
    /* JADX INFO: renamed from: c */
    public final void mo5682c(csn csnVar, ihw ihwVar, Surface surface) {
        ctx ctxVar = ((cty) this.f9880a).get();
        this.f9881b = ctxVar;
        synchronized (ctxVar.f9521c) {
            ctxVar.f9527i = csnVar;
            csd csdVar = ((cse) ctxVar.f9523e).get();
            csdVar.f9223g = new cbt(csdVar.f9224h, new bkn(new oyo(((kmr) csnVar.f9335G.f12521a).mo14553f()), (byte[]) null, (byte[]) null), csdVar.f9218b, csdVar.f9219c, csdVar.f9220d, csnVar.f9335G.f12521a, null, null, null, null);
            csdVar.f9221e.m6429b();
            cqr cqrVar = new cqr(csdVar, 10);
            if (jvd.m13540d()) {
                cqrVar.run();
            } else {
                csdVar.f9222f.post(cqrVar);
            }
            ctxVar.f9538t = csdVar;
            ctxVar.f9539u = dbk.m5877d();
            djm djmVar = ctxVar.f9517I;
            ccz cczVar = new ccz(djmVar.f11788b, Boolean.valueOf(djmVar.f11789c.mo5407m()), csnVar.f9335G.f12521a, djmVar.f11787a, csnVar.f9336a, djmVar.f11789c.mo5395a());
            ctxVar.f9540v = cczVar;
            ctxVar.f9541w = new gaf(ctxVar.f9544z, ctxVar.f9512D.f36117a, csnVar.f9335G.f12521a, ctxVar.f9509A);
            synchronized (ctxVar.f9521c) {
                ctxVar.f9533o = ihwVar;
            }
            synchronized (ctxVar.f9521c) {
                ctxVar.f9527i.getClass();
                ctxVar.f9534p = surface;
            }
            ctxVar.m5512a();
        }
        this.f9882c.m5657d(cum.CAPTURE_SESSION).m13537d(this);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        ctq ctqVar = this.f9881b;
        if (ctqVar != null) {
            ctqVar.close();
        }
    }

    @Override // p000.cwj
    /* JADX INFO: renamed from: d */
    public final void mo5683d() {
        ctq ctqVar = this.f9881b;
        ctqVar.getClass();
        synchronized (((ctx) ctqVar).f9521c) {
            if (((ctx) ctqVar).f9511C) {
                ((nbe) ((nbe) ctx.f9507a.m17252c()).mo17276G(628)).mo17290o("Already closed.");
                return;
            }
            kfc kfcVar = ((ctx) ctqVar).f9535q;
            if (kfcVar != null) {
                kfcVar.close();
                ((ctx) ctqVar).f9535q = null;
                ccz cczVar = ((ctx) ctqVar).f9540v;
                cczVar.getClass();
                cczVar.m3474b(6);
            } else {
                ((nbe) ((nbe) ctx.f9507a.m17252c()).mo17276G(626)).mo17290o("Recording stream not attached.");
            }
        }
    }

    @Override // p000.cwj
    /* JADX INFO: renamed from: e */
    public final void mo5684e(List list) {
        ctq ctqVar = this.f9881b;
        ctqVar.getClass();
        synchronized (((ctx) ctqVar).f9521c) {
            if (((ctx) ctqVar).f9511C) {
                ((nbe) ((nbe) ctx.f9507a.m17252c()).mo17276G(625)).mo17290o("Already closed.");
            } else {
                csd csdVar = ((ctx) ctqVar).f9538t;
                csdVar.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ctx) ctqVar).f9515G.m5657d(cum.RECORDING_SESSION).m13537d(csdVar.m5456f((kfv) it.next()));
                }
                kfk kfkVar = ((ctx) ctqVar).f9528j;
                kfkVar.getClass();
                kho khoVar = ((ctx) ctqVar).f9513E;
                khoVar.getClass();
                if (((ctx) ctqVar).f9535q == null) {
                    ((ctx) ctqVar).f9527i.getClass();
                    ((ctx) ctqVar).f9535q = kfkVar.mo14131r(khoVar, 0);
                    ccz cczVar = ((ctx) ctqVar).f9540v;
                    cczVar.getClass();
                    cczVar.m3474b(5);
                } else {
                    ((nbe) ((nbe) ctx.f9507a.m17252c()).mo17276G(624)).mo17290o("Recording stream already attached.");
                }
            }
        }
        kxk.m14965K(null);
    }

    @Override // p000.cwj
    /* JADX INFO: renamed from: f */
    public final cdj mo5685f(bko bkoVar) {
        ctq ctqVar = this.f9881b;
        ctqVar.getClass();
        return ((ctx) ctqVar).f9522d.f9008e.mo3409bh(bkoVar);
    }
}
