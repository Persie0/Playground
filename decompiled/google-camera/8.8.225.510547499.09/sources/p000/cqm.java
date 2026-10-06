package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.elapsedtimeui.ElapsedTimerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cqm implements jzg {

    /* JADX INFO: renamed from: A */
    public final cwd f8938A;

    /* JADX INFO: renamed from: B */
    private final ElapsedTimerView f8939B;

    /* JADX INFO: renamed from: C */
    private final BottomBarController f8940C;

    /* JADX INFO: renamed from: D */
    private final icf f8941D;

    /* JADX INFO: renamed from: E */
    private final idl f8942E;

    /* JADX INFO: renamed from: F */
    private final cvt f8943F;

    /* JADX INFO: renamed from: G */
    private final igb f8944G;

    /* JADX INFO: renamed from: H */
    private final cvy f8945H;

    /* JADX INFO: renamed from: a */
    public final htf f8946a;

    /* JADX INFO: renamed from: b */
    public final String f8947b;

    /* JADX INFO: renamed from: c */
    public final cyu f8948c;

    /* JADX INFO: renamed from: d */
    public final hxw f8949d;

    /* JADX INFO: renamed from: e */
    public final iuj f8950e;

    /* JADX INFO: renamed from: f */
    public final csr f8951f;

    /* JADX INFO: renamed from: g */
    public final dbr f8952g;

    /* JADX INFO: renamed from: h */
    public final cpo f8953h;

    /* JADX INFO: renamed from: i */
    public final kpb f8954i;

    /* JADX INFO: renamed from: j */
    public final dac f8955j;

    /* JADX INFO: renamed from: k */
    public final cxo f8956k;

    /* JADX INFO: renamed from: l */
    public final csm f8957l;

    /* JADX INFO: renamed from: m */
    public final crj f8958m;

    /* JADX INFO: renamed from: n */
    public final jwn f8959n;

    /* JADX INFO: renamed from: o */
    public final jwn f8960o;

    /* JADX INFO: renamed from: p */
    public final dal f8961p;

    /* JADX INFO: renamed from: q */
    public final jvd f8962q;

    /* JADX INFO: renamed from: r */
    public final dhv f8963r;

    /* JADX INFO: renamed from: s */
    public final hsk f8964s;

    /* JADX INFO: renamed from: t */
    public final jww f8965t;

    /* JADX INFO: renamed from: u */
    public final jww f8966u;

    /* JADX INFO: renamed from: v */
    public final msi f8967v;

    /* JADX INFO: renamed from: w */
    public chm f8968w;

    /* JADX INFO: renamed from: x */
    public ikw f8969x;

    /* JADX INFO: renamed from: y */
    public czd f8970y;

    /* JADX INFO: renamed from: z */
    public csn f8971z;

    public cqm(htf htfVar, djm djmVar, Resources resources, cvy cvyVar, cyu cyuVar, BottomBarController bottomBarController, hxw hxwVar, iuj iujVar, icf icfVar, idl idlVar, cvt cvtVar, csr csrVar, dbr dbrVar, cpo cpoVar, kpb kpbVar, igb igbVar, dac dacVar, cxo cxoVar, cwd cwdVar, csm csmVar, crj crjVar, dal dalVar, jvd jvdVar, dhv dhvVar, jww jwwVar, jww jwwVar2, hsk hskVar, msi msiVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f8946a = htfVar;
        this.f8945H = cvyVar;
        this.f8948c = cyuVar;
        this.f8940C = bottomBarController;
        this.f8949d = hxwVar;
        this.f8950e = iujVar;
        this.f8941D = icfVar;
        this.f8942E = idlVar;
        this.f8943F = cvtVar;
        this.f8951f = csrVar;
        this.f8952g = dbrVar;
        this.f8953h = cpoVar;
        this.f8954i = kpbVar;
        this.f8944G = igbVar;
        this.f8955j = dacVar;
        this.f8956k = cxoVar;
        this.f8938A = cwdVar;
        this.f8957l = csmVar;
        this.f8958m = crjVar;
        this.f8961p = dalVar;
        this.f8962q = jvdVar;
        this.f8963r = dhvVar;
        this.f8965t = jwwVar;
        this.f8966u = jwwVar2;
        this.f8964s = hskVar;
        this.f8967v = msiVar;
        this.f8939B = (ElapsedTimerView) ((jfs) djmVar.f11789c).m13100f(C0100R.id.elapsed_timer_view);
        this.f8947b = resources.getString(C0100R.string.video_accessibility_peek);
        this.f8959n = jwr.m13634d(jwr.m13640j(csmVar.m5464a().f9291u.f26912a, cgh.f5599o), csmVar.m5464a().f9291u.f26913b);
        this.f8960o = jwr.m13634d(jwr.m13640j(csmVar.m5464a().f9291u.f26912a, cgh.f5600p), csmVar.m5464a().f9291u.f26915d);
    }

    /* JADX INFO: renamed from: b */
    public static List m5360b(List list) {
        mrm mrmVarM16829i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jxn jxnVar = (jxn) it.next();
            jxn jxnVar2 = jxn.FPS_AUTO;
            switch (jxnVar) {
                case FPS_AUTO:
                    mrmVarM16829i = mrm.m16829i(gzm.FPS_AUTO);
                    break;
                case f35050b:
                case FPS_60C_24E:
                    mrmVarM16829i = mrm.m16829i(gzm.FPS_24);
                    break;
                case FPS_30:
                case f35054f:
                    mrmVarM16829i = mrm.m16829i(gzm.FPS_30);
                    break;
                case FPS_60:
                    mrmVarM16829i = mrm.m16829i(gzm.FPS_60);
                    break;
                default:
                    mrmVarM16829i = mqu.f41450a;
                    break;
            }
            if (mrmVarM16829i.mo16813g()) {
                arrayList.add((gzm) mrmVarM16829i.mo16809c());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m5361n(ikw ikwVar) {
        return ikwVar.equals(ikw.VIDEO) || ikwVar.equals(ikw.SLOW_MOTION) || ikwVar.equals(ikw.TIME_LAPSE);
    }

    @Override // p000.jzg
    /* JADX INFO: renamed from: a */
    public final void mo5259a(jzf jzfVar) {
        idj idjVar;
        idl idlVar = this.f8942E;
        jzf jzfVar2 = jzf.VIDEO_BUFFER_DELAY;
        switch (jzfVar) {
            case VIDEO_BUFFER_DELAY:
                idjVar = idj.f30452c;
                break;
            case AUDIO_BUFFER_DELAY:
            case AUDIO_TRACK_FAIL_TO_START:
                idjVar = idj.f30451b;
                break;
            case VIDEO_TRACK_FAIL_TO_START:
            case FILE_LOST:
                idjVar = idj.NO_VIDEO_AFTER_RECORDING;
                break;
            case f35270e:
            case MUXER_STOP_ERROR:
            case MEDIA_CODEC_ERROR_AUDIO:
            case MEDIA_CODEC_ERROR_VIDEO:
            case OTHER:
                idjVar = idj.PARTIAL_VIDEO_MISSING_AFTER_RECORDING;
                break;
            case AUDIO_RECORD_ERROR:
                idjVar = idj.MIC_BROKEN;
                break;
            default:
                idjVar = idj.PARTIAL_VIDEO_MISSING_AFTER_RECORDING;
                break;
        }
        idlVar.m11118c(idjVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m5362c(chm chmVar, ikw ikwVar) {
        this.f8968w = chmVar;
        this.f8969x = ikwVar;
        this.f8970y = this.f8945H.m5625b(ikwVar);
        this.f8943F.f9833a = this.f8969x;
        this.f8951f.f9379d = chmVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m5364e() {
        this.f8942E.m11117b();
    }

    /* JADX INFO: renamed from: f */
    public final void m5365f() {
        jvh.m13554b().execute(new cmd(this, 20));
    }

    /* JADX INFO: renamed from: g */
    public final void m5366g() {
        jvh.m13554b().execute(new cqr(this, 1));
    }

    /* JADX INFO: renamed from: h */
    public final void m5367h() {
        if (this.f8943F.mo5396b().mo16813g()) {
            this.f8952g.m5898g((kmq) this.f8943F.mo5396b().mo16809c());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5368i() {
        this.f8950e.mo11734O(mqu.f41450a, false);
        csr csrVar = this.f8951f;
        csrVar.f9378c.execute(new cqr(csrVar, 16));
        ((ciq) this.f8968w).m3809r();
        if (this.f8939B.getVisibility() != 8) {
            this.f8939B.setVisibility(8);
        }
        this.f8950e.mo11775z();
    }

    /* JADX INFO: renamed from: j */
    public final void m5369j(boolean z) {
        jvh.m13554b().execute(new bnp(this, z, 5));
    }

    /* JADX INFO: renamed from: k */
    public final void m5370k(boolean z) {
        this.f8944G.mo11199G(z);
    }

    /* JADX INFO: renamed from: l */
    public final void m5371l(boolean z) {
        this.f8940C.setSnapshotButtonClickEnabled(z);
    }

    /* JADX INFO: renamed from: m */
    public final void m5372m(boolean z) {
        if (this.f8943F.mo5410p()) {
            this.f8941D.mo11013l(true);
        }
        this.f8946a.mo10738f(false);
        this.f8949d.mo10848a(z);
        this.f8964s.m10699d(false);
        if (m5361n(this.f8969x)) {
            if (this.f8956k.m5716a().equals(cxk.DEFAULT)) {
                this.f8955j.mo5796h(z);
            }
            this.f8955j.mo5794f(true);
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m5373o() {
        return this.f8970y.mo5731bp();
    }

    /* JADX INFO: renamed from: d */
    public final void m5363d(boolean z) {
        csr csrVar = this.f8951f;
        if (z) {
            csrVar.f9378c.execute(new cqr(csrVar, 13));
        } else {
            csrVar.f9378c.execute(new cqr(csrVar, 12));
        }
    }
}
