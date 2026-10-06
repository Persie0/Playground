package p000;

import android.content.Context;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cqj implements kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f8906a = nbh.m17259h("com/google/android/apps/camera/camcorder/VideoRecorderProvider");

    /* JADX INFO: renamed from: b */
    public nps f8907b;

    /* JADX INFO: renamed from: c */
    public cuu f8908c;

    /* JADX INFO: renamed from: d */
    public final Object f8909d = new Object();

    /* JADX INFO: renamed from: e */
    private final cux f8910e;

    /* JADX INFO: renamed from: f */
    private final csm f8911f;

    /* JADX INFO: renamed from: g */
    private final kbz f8912g;

    /* JADX INFO: renamed from: h */
    private final fws f8913h;

    public cqj(djm djmVar, csm csmVar, fws fwsVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f8910e = (cux) djmVar.f11788b;
        this.f8911f = csmVar;
        this.f8913h = fwsVar;
        this.f8912g = kbzVar;
    }

    /* JADX INFO: renamed from: c */
    private final void m5357c() {
        synchronized (this.f8909d) {
            cuu cuuVar = this.f8908c;
            if (cuuVar != null) {
                cuuVar.close();
                this.f8908c = null;
            }
            nps npsVar = this.f8907b;
            if (npsVar != null) {
                npsVar.cancel(true);
                this.f8907b = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final cuu m5358a(csn csnVar) {
        cuu cuuVar;
        try {
            try {
                this.f8912g.mo13961e(VzWFSVj.IzCAhxMAFalb);
                synchronized (this.f8909d) {
                    cuuVar = (cuu) m5359b(csnVar).get();
                }
                this.f8912g.mo13962f();
                return cuuVar;
            } catch (Throwable th) {
                this.f8912g.mo13962f();
                throw th;
            }
        } catch (InterruptedException | ExecutionException e) {
            ((nbe) ((nbe) ((nbe) f8906a.m17251b()).mo17283h(e)).mo17276G(484)).mo17290o("Error creating video recorder: ");
            this.f8912g.mo13962f();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    final nps m5359b(final csn csnVar) {
        nps npsVar;
        synchronized (this.f8909d) {
            m5357c();
            final cux cuxVar = this.f8910e;
            final fws fwsVar = this.f8913h;
            final csl cslVarM5464a = this.f8911f.m5464a();
            synchronized (cuxVar.f9713k) {
                if (cuxVar.f9716n) {
                    cuxVar.f9716n = false;
                    cuxVar.f9718p.m5657d(cum.VIDEO_RECORDER).m13537d(cuxVar);
                    cuxVar.f9715m = ((cvh) cuxVar.f9704b).get();
                }
            }
            final byte[] bArr = null;
            final byte[] bArr2 = null;
            nps npsVarM14970P = kxk.m14970P(new nol(fwsVar, csnVar, cslVarM5464a, bArr, bArr2) { // from class: cuw

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ csn f9700b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ csl f9701c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ fws f9702d;

                /* JADX WARN: Code duplicated, block: B:105:0x0302 A[Catch: Exception -> 0x03cf, all -> 0x03de, TryCatch #0 {Exception -> 0x03cf, blocks: (B:92:0x02a7, B:94:0x02af, B:96:0x02bb, B:109:0x031c, B:111:0x0334, B:112:0x0363, B:97:0x02c8, B:99:0x02d4, B:101:0x02d8, B:102:0x02eb, B:104:0x02ef, B:105:0x0302, B:107:0x0308), top: B:142:0x02a7 }] */
                /* JADX WARN: Code duplicated, block: B:107:0x0308 A[Catch: Exception -> 0x03cf, all -> 0x03de, TryCatch #0 {Exception -> 0x03cf, blocks: (B:92:0x02a7, B:94:0x02af, B:96:0x02bb, B:109:0x031c, B:111:0x0334, B:112:0x0363, B:97:0x02c8, B:99:0x02d4, B:101:0x02d8, B:102:0x02eb, B:104:0x02ef, B:105:0x0302, B:107:0x0308), top: B:142:0x02a7 }] */
                /* JADX WARN: Code duplicated, block: B:108:0x031b  */
                /* JADX WARN: Code duplicated, block: B:22:0x00a3 A[Catch: all -> 0x03de, TryCatch #5 {, blocks: (B:6:0x0017, B:8:0x001c, B:10:0x002f, B:23:0x00a5, B:25:0x00ab, B:27:0x00b1, B:29:0x00cd, B:31:0x00ea, B:33:0x00f0, B:37:0x0101, B:39:0x0107, B:40:0x010e, B:42:0x0114, B:43:0x011c, B:45:0x0126, B:46:0x0128, B:48:0x012c, B:58:0x0173, B:60:0x01ae, B:62:0x01b6, B:69:0x01dd, B:70:0x01e9, B:85:0x0248, B:87:0x024c, B:89:0x0254, B:91:0x0282, B:92:0x02a7, B:94:0x02af, B:96:0x02bb, B:109:0x031c, B:111:0x0334, B:112:0x0363, B:113:0x0390, B:114:0x03a7, B:97:0x02c8, B:99:0x02d4, B:101:0x02d8, B:102:0x02eb, B:104:0x02ef, B:105:0x0302, B:107:0x0308, B:131:0x03d5, B:132:0x03da, B:90:0x0274, B:135:0x03dd, B:65:0x01c2, B:49:0x0135, B:53:0x0143, B:28:0x00cb, B:11:0x0032, B:13:0x0036, B:15:0x003a, B:17:0x004c, B:19:0x0056, B:21:0x0061, B:22:0x00a3, B:54:0x014b, B:56:0x0154, B:57:0x0162, B:71:0x01ea, B:73:0x01f7, B:74:0x01fd, B:76:0x01ff, B:80:0x0208, B:82:0x0212, B:83:0x0232, B:84:0x0247), top: B:150:0x0017, outer: #1, inners: #2 }] */
                /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, jzy] */
                /* JADX WARN: Type inference failed for: r3v3, types: [dhv, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v8, types: [dhv, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v12, types: [dhv, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v17, types: [dhv, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v7, types: [dhv, java.lang.Object] */
                @Override // p000.nol
                /* JADX INFO: renamed from: a */
                public final nps mo3988a() {
                    int i;
                    jyy kadVar;
                    Surface surface;
                    int iIntValue;
                    cuu cuuVar;
                    nps npsVarM14965K;
                    mrm mrmVarM16829i;
                    mrm mrmVarM16829i2;
                    cux cuxVar2 = this.f9699a;
                    fws fwsVar2 = this.f9702d;
                    csn csnVar2 = this.f9700b;
                    csl cslVar = this.f9701c;
                    synchronized (cuxVar2.f9713k) {
                        cuxVar2.f9703a.mo13961e("VideoRecorderFactory#CreateVideoRecorder");
                        synchronized (cuxVar2.f9713k) {
                            boolean z = true;
                            if (csnVar2.f9329A) {
                                mrm mrmVar = cuxVar2.f9705c;
                                dhv dhvVar = cuxVar2.f9712j;
                                dhx dhxVar = dhh.f11074a;
                                dhvVar.mo6175c();
                                iay iayVar = cuxVar2.f9719q;
                                if (csnVar2.f9343h.mo16813g() && iayVar.f30190b && csnVar2.f9331C && ((gzo) ((jxc) iayVar.f30189a).mo3831be()).equals(gzo.ON) && ((mrm) iayVar.f30191c).mo16813g()) {
                                    Object obj = iayVar.f30192d;
                                    if (((mrm) obj).mo16813g()) {
                                        hiw hiwVar = (hiw) ((mrm) iayVar.f30191c).mo16809c();
                                        int i2 = ((jxs) csnVar2.f9343h.mo16809c()).f35088c;
                                        int i3 = ((jxs) csnVar2.f9343h.mo16809c()).f35090e;
                                        mrmVarM16829i = mrm.m16829i(new hig(hiwVar, i2, i3, new crx(jxl.ENCODING_PCM_16BIT.f35042f * 8 * i2 * i3, Integer.MAX_VALUE)));
                                    } else {
                                        mrmVarM16829i = mqu.f41450a;
                                    }
                                } else {
                                    mrmVarM16829i = mqu.f41450a;
                                }
                                if (mrmVar.mo16813g() && mrmVarM16829i.mo16813g()) {
                                    mrmVarM16829i2 = mrm.m16829i(new cru((hig) mrmVarM16829i.mo16809c(), (crn) ((cwd) mrmVar.mo16809c()).f9866a));
                                } else {
                                    mrmVarM16829i2 = mqu.f41450a;
                                }
                                jzv jzvVar = new jzv(cuxVar2.f9706d, cuxVar2.f9709g.m5525a(), cuxVar2.f9703a);
                                jzvVar.f35418n = cuxVar2.f9711i;
                                jzvVar.f35423s = cuxVar2.f9712j.mo6184l(dhh.f11081ag) && !mrmVarM16829i2.mo16813g() && cslVar.f9291u.m10005b().equals(gzn.EXT_BLUETOOTH);
                                if (csnVar2.f9330B) {
                                    jzvVar.f35419o.add(cuxVar2.f9722t);
                                }
                                if (mrmVarM16829i2.mo16813g()) {
                                    jzvVar.f35428x = (kns) mrmVarM16829i2.mo16809c();
                                }
                                if (cuxVar2.f9712j.mo6184l(dhh.f11065R)) {
                                    jzvVar.f35420p = true;
                                }
                                if (csnVar2.f9334F) {
                                    i = 6;
                                    jzvVar.f35410f = 6;
                                    jzvVar.f35411g = 1;
                                    jzvVar.f35412h = 7;
                                    kadVar = jzvVar;
                                } else {
                                    i = 6;
                                    jzvVar.f35410f = true != cuxVar2.f9712j.mo6184l(dhh.f11080af) ? 2 : 1;
                                    jzvVar.f35411g = 1;
                                    jzvVar.f35412h = 3;
                                    kadVar = jzvVar;
                                }
                            } else {
                                i = 6;
                                if (!cuxVar2.f9714l.mo16813g()) {
                                    cuxVar2.f9714l = mrm.m16829i(((cvo) cuxVar2.f9708f).get());
                                }
                                kadVar = new kad((jzz) cuxVar2.f9714l.mo16809c(), cuxVar2.f9706d, fwsVar2.f23767d);
                            }
                            jxv jxvVar = csnVar2.f9342g;
                            jyz jyzVar = cuxVar2.f9715m;
                            jyzVar.getClass();
                            jyy jyyVarMo13760b = kadVar.mo13760b(jyzVar);
                            jyyVarMo13760b.mo13776r(jxvVar);
                            jyyVarMo13760b.mo13761c((jxs) csnVar2.f9343h.mo16812f());
                            jyyVarMo13760b.mo13769k(((Long) csnVar2.f9346k.mo16811e(Long.MAX_VALUE)).longValue());
                            if (cuxVar2.f9712j.mo6184l(dhh.f11058K) && csnVar2.f9339d.m13663d() && csnVar2.f9338c.equals(jxn.FPS_60)) {
                                i = 2;
                            } else {
                                jyz jyzVar2 = cuxVar2.f9715m;
                                jyzVar2.getClass();
                                if (true == ((gzn) ((cvg) jyzVar2).f9778a.f26912a.mo3831be()).equals(gzn.EXT_BLUETOOTH)) {
                                    i = 2;
                                }
                            }
                            jyyVarMo13760b.mo13762d(i);
                            Object obj2 = fwsVar2.f23773j;
                            jxp jxpVar = csnVar2.f9339d;
                            synchronized (((czl) obj2).f10106b) {
                                mrm mrmVarM5738a = ((czl) obj2).m5738a(jxpVar);
                                if (mrmVarM5738a.mo16813g()) {
                                    surface = (Surface) mrmVarM5738a.mo16809c();
                                } else {
                                    if (((czl) obj2).f10107c != null) {
                                        z = false;
                                    }
                                    lku.m15613H(z);
                                    if (((czl) obj2).f10108d != null) {
                                        ((nbe) ((nbe) czl.f10105a.m17252c()).mo17276G(782)).mo17290o("Pending surface exists, release it first before creating new one.");
                                        Surface surface2 = ((czl) obj2).f10108d;
                                        surface2.getClass();
                                        surface2.release();
                                    }
                                    jzn jznVar = ((czl) obj2).f10109e;
                                    ((czl) obj2).f10108d = MediaCodec.createPersistentInputSurface();
                                    surface = ((czl) obj2).f10108d;
                                    surface.getClass();
                                }
                            }
                            kadVar.mo13765g(surface);
                            ctg ctgVar = null;
                            try {
                                mrm mrmVar2 = csnVar2.f9344i;
                                if (mrmVar2.mo16813g()) {
                                    ParcelFileDescriptor parcelFileDescriptor = lro.m15916a((Context) fwsVar2.f23774k, (Uri) mrmVar2.mo16809c(), "rw").getParcelFileDescriptor();
                                    cvy cvyVar = cuxVar2.f9723u;
                                    parcelFileDescriptor.getClass();
                                    cuxVar2.f9717o = cvyVar.m5632i(parcelFileDescriptor);
                                } else {
                                    cuxVar2.f9717o = cuxVar2.f9723u.m5633j(csnVar2.f9342g.f35097a.f35067f);
                                }
                                ctp ctpVar = cuxVar2.f9717o;
                                ctpVar.getClass();
                                kadVar.mo13774p(ctpVar.mo5501e());
                                lmv lmvVarM5491a = ctg.m5491a();
                                ctp ctpVar2 = cuxVar2.f9717o;
                                ctpVar2.getClass();
                                lmvVarM5491a.m15743h(ctpVar2);
                                lmvVarM5491a.m15744i(cuxVar2.f9720r.m6236k());
                                ctg ctgVarM15742g = lmvVarM5491a.m15742g();
                                try {
                                    mrm mrmVar3 = csnVar2.f9345j;
                                    if (!mrmVar3.mo16813g() || ((Integer) mrmVar3.mo16809c()).intValue() == 0) {
                                        djm djmVar = cuxVar2.f9721s;
                                        jxn jxnVar = jxvVar.f35099c;
                                        jxp jxpVar2 = jxvVar.f35098b;
                                        if (jxnVar.m13658f()) {
                                            if (jxpVar2 == jxp.RES_2160P) {
                                                iIntValue = ((Integer) djmVar.f11787a.mo6173a(dhh.f11091d).get()).intValue();
                                            } else if (jxpVar2 == jxp.RES_1080P) {
                                                iIntValue = ((Integer) djmVar.f11787a.mo6173a(dhh.f11090c).get()).intValue();
                                            } else if (jxnVar.m13657e()) {
                                                iIntValue = ((Integer) djmVar.f11787a.mo6173a(dhh.f11092e).get()).intValue();
                                            } else {
                                                iIntValue = 0;
                                            }
                                        } else if (jxnVar.m13657e()) {
                                            iIntValue = ((Integer) djmVar.f11787a.mo6173a(dhh.f11092e).get()).intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                    } else {
                                        iIntValue = ((Integer) csnVar2.f9345j.mo16809c()).intValue();
                                    }
                                    kadVar.mo13768j(iIntValue * 1000);
                                    kadVar.mo13773o(((Integer) ((jwf) cslVar.f9284n).f34942d).intValue());
                                    if (csnVar2.f9347l) {
                                        cjr cjrVarMo8116b = cuxVar2.f9710h.mo8116b();
                                        kadVar.mo13767i(nnj.m17523i(kxk.m14972R(nod.m17553i(kxk.m14966L(cjrVarMo8116b.f5938b), cgh.f5588d, not.INSTANCE), cjrVarMo8116b.f5939c, TimeUnit.MILLISECONDS, cuxVar2.f9707e), Exception.class, new ceg(cjrVarMo8116b, 2), not.INSTANCE));
                                    }
                                    kadVar.mo13770l(((Long) cuxVar2.f9721s.f11787a.mo6181i(dhh.f11064Q).orElse(4000000000L)).longValue());
                                    kadVar.mo13777s(cuxVar2.f9721s.f11787a.mo6184l(dhh.f11053F));
                                    cuuVar = new cuu(kadVar.mo13759a(), ctgVarM15742g, cslVar.f9291u.m10005b(), (gzo) cslVar.f9286p.mo3831be());
                                } catch (Exception e) {
                                    e = e;
                                    ctgVar = ctgVarM15742g;
                                    if (ctgVar != null) {
                                        ctgVar.f9423a.close();
                                    }
                                    throw e;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                        Object obj3 = fwsVar2.f23773j;
                        synchronized (((czl) obj3).f10106b) {
                            Surface surface3 = ((czl) obj3).f10108d;
                            if (surface3 != null) {
                                ((czl) obj3).f10107c = surface3;
                                ((czl) obj3).f10108d = null;
                            }
                        }
                        cuxVar2.f9703a.mo13962f();
                        npsVarM14965K = kxk.m14965K(cuuVar);
                    }
                    return npsVarM14965K;
                }
            }, cuxVar.f9709g.m5526b());
            this.f8907b = npsVarM14970P;
            kxk.m14975U(npsVarM14970P, new djq(this, 1), not.INSTANCE);
            npsVar = this.f8907b;
        }
        return npsVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        m5357c();
    }
}
