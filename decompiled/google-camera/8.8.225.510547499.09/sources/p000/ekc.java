package p000;

import android.app.Activity;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.Surface;
import android.view.View;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.imax.cyclops.processing.NativePoseEstimatorImpl;
import com.google.android.apps.camera.p014ui.views.ViewfinderCover;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekc extends chw implements ein {

    /* JADX INFO: renamed from: b */
    private eln f14445b;

    /* JADX INFO: renamed from: c */
    private final Activity f14446c;

    /* JADX INFO: renamed from: d */
    private final iid f14447d;

    /* JADX INFO: renamed from: e */
    private final Runnable f14448e;

    /* JADX INFO: renamed from: f */
    private final imy f14449f;

    /* JADX INFO: renamed from: g */
    private iek f14450g;

    /* JADX INFO: renamed from: h */
    private final C1058va f14451h;

    /* JADX INFO: renamed from: i */
    private final cwd f14452i;

    public ekc() {
    }

    public ekc(cwd cwdVar, C1058va c1058va, Activity activity, iid iidVar, imy imyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14452i = cwdVar;
        this.f14451h = c1058va;
        this.f14446c = activity;
        this.f14447d = iidVar;
        this.f14449f = imyVar;
        this.f14448e = new efd(activity, 11);
    }

    @Override // p000.ein
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7362a() {
        eln elnVar = this.f14445b;
        lku.m15662p(elnVar);
        elnVar.mo7459b().f14226C = false;
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bL */
    public final synchronized mrm mo3766bL() {
        mrm mrmVarM16829i;
        eln elnVar = this.f14445b;
        if (elnVar == null) {
            return mqu.f41450a;
        }
        eio eioVar = (eio) ((etd) elnVar).f17338d.get();
        imy imyVar = this.f14449f;
        if (eioVar.getHolder().getSurface().isValid()) {
            int width = eioVar.getWidth() / 2;
            int height = eioVar.getHeight() / 2;
            if (width <= 0 || height <= 0) {
                ((nbe) ((nbe) iht.f31001a.m17252c()).mo17276G((char) 4258)).mo17290o("getScreenshotFrom(): the surface size is invalid");
                mrmVarM16829i = mqu.f41450a;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                imyVar.m11500a(eioVar, bitmapCreateBitmap);
                mrmVarM16829i = mrm.m16829i(ihy.m11371b(bitmapCreateBitmap, 2));
            }
        } else {
            ((nbe) ((nbe) iht.f31001a.m17252c()).mo17276G((char) 4259)).mo17290o("getScreenshotFrom(): the surface is not valid");
            mrmVarM16829i = mqu.f41450a;
        }
        return mrmVarM16829i;
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
        iid iidVar = this.f14447d;
        this.f14450g = new iiz(iidVar.f31066c, iidVar.f31067d);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final synchronized void mo3770bV() {
        ViewfinderCover viewfinderCover = this.f14447d.f31068e;
        viewfinderCover.f7292g.f30302E.remove(this.f14448e);
        if (this.f14446c.getRequestedOrientation() == 4) {
            this.f14446c.setRequestedOrientation(2);
        }
        eln elnVar = this.f14445b;
        if (elnVar == null) {
            return;
        }
        lku.m15662p(elnVar);
        ekt ektVarMo7460c = elnVar.mo7460c();
        ektVarMo7460c.f14507a.unregisterListener(ektVarMo7460c);
        eln elnVar2 = this.f14445b;
        lku.m15662p(elnVar2);
        eja ejaVarMo7459b = elnVar2.mo7459b();
        mpw.m16775n(new ceu(ejaVarMo7459b.f14264r, 8));
        if (ejaVarMo7459b.f14264r.compareAndSet(1, 0)) {
            ejaVarMo7459b.f14260n.m7360a(false);
        } else {
            ejaVarMo7459b.f14263q.set(true);
            ejaVarMo7459b.f14265s.block();
            ejaVarMo7459b.m7389h(false, 2);
        }
        jiy jiyVar = ejaVarMo7459b.f14235L;
        ejaVarMo7459b.m7384c();
        ejaVarMo7459b.f14251e.mo7351b();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        synchronized (this) {
            eln elnVar = this.f14445b;
            if (elnVar == null) {
                return;
            }
            lku.m15662p(elnVar);
            ekt ektVarMo7460c = elnVar.mo7460c();
            ektVarMo7460c.f14507a.registerListener(ektVarMo7460c, ektVarMo7460c.f14509c, 1);
            ektVarMo7460c.f14507a.registerListener(ektVarMo7460c, ektVarMo7460c.f14508b, 1);
            eln elnVar2 = this.f14445b;
            lku.m15662p(elnVar2);
            eja ejaVarMo7459b = elnVar2.mo7459b();
            File file = new File(ejaVarMo7459b.f14247a.getCacheDir(), "datasets");
            dhv dhvVar = ejaVarMo7459b.f14250d;
            dhw dhwVar = die.f11473a;
            dhvVar.mo6175c();
            ejaVarMo7459b.f14266t.m5218a(file.toString());
            int iIntValue = ((Integer) ejaVarMo7459b.f14224A.mo10031c(gzy.f27030an)).intValue();
            if (iIntValue < 2 && !ejaVarMo7459b.f14252f.m7376k()) {
                ejaVarMo7459b.m7385d(ejaVarMo7459b.f14247a.getString(C0100R.string.imax_vertical_hint));
                ejaVarMo7459b.f14225B.mo10033e(gzy.f27030an, Integer.valueOf(iIntValue + 1));
            }
            ejaVarMo7459b.f14263q.set(false);
            jiy jiyVar = ejaVarMo7459b.f14235L;
            synchronized (this) {
                eln elnVar3 = this.f14445b;
                lku.m15662p(elnVar3);
                eim eimVarMo7458a = elnVar3.mo7458a();
                eimVarMo7458a.f14151b.mo13944f("Panorama frameserver received onModuleResume");
                kfk kfkVar = eimVarMo7458a.f14157h;
                if (kfkVar != null) {
                    kfkVar.mo14120g();
                }
            }
            if (this.f14446c.getRequestedOrientation() == 2) {
                this.f14446c.setRequestedOrientation(4);
            }
            ViewfinderCover viewfinderCover = this.f14447d.f31068e;
            viewfinderCover.f7292g.f30302E.add(this.f14448e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v59, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v82, types: [igb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v86, types: [eop, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37, types: [igf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.opengl.GLSurfaceView$Renderer, java.lang.Object] */
    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final synchronized void mo3780n() {
        if (this.f14445b != null) {
            return;
        }
        C1058va c1058va = this.f14451h;
        this.f14445b = new etd((esz) c1058va.f47802a, (esr) c1058va.f47803b, (esw) c1058va.f47804c);
        cwd cwdVar = this.f14452i;
        int i = eke.f14458a;
        eln elnVar = this.f14445b;
        lku.m15662p(elnVar);
        float fM7408a = (float) ((ekd) ((etd) elnVar).f17339e.get()).m7408a();
        if (!((AtomicBoolean) cwdVar.f9866a).getAndSet(true)) {
            eke.f14458a = i;
            eke.f14459b = fM7408a;
            ekv.m7428b(ekg.class, new eke());
            ekv.m7428b(ekj.class, new NativePoseEstimatorImpl());
            ekv.m7428b(eki.class, new ela());
            ekv.m7428b(ekw.class, new ekx());
        }
        eln elnVar2 = this.f14445b;
        lku.m15662p(elnVar2);
        fws fwsVar = new fws((eio) ((etd) elnVar2).f17338d.get(), (eju) ((etd) elnVar2).f17342h.get(), (jvb) ((etd) elnVar2).f17343i.get(), (igb) ((etd) elnVar2).f17337c.f16338q.get(), (eja) ((etd) elnVar2).f17344j.get(), (BottomBarController) ((etd) elnVar2).f17337c.f16182h.get(), (eoq) ((etd) elnVar2).f17336b.f15562ad.get(), (eim) ((etd) elnVar2).f17341g.get(), (kbg) ((etd) elnVar2).f17336b.f15612ba.get(), (dhv) ((etd) elnVar2).f17335a.f16641f.get(), new jfs(((etd) elnVar2).f17337c.f15811a.m7817l()), (ekd) ((etd) elnVar2).f17339e.get(), null);
        iek iekVar = this.f14450g;
        lku.m15662p(iekVar);
        if (fwsVar.f23768e.mo6184l(dib.f11336bq)) {
            Object obj = fwsVar.f23764a;
            ((eio) obj).setBackground(((eio) obj).getResources().getDrawable(C0100R.drawable.viewfinder_rounded_background, null));
            ((eio) fwsVar.f23764a).setClipToOutline(true);
        }
        ((eio) fwsVar.f23764a).setEGLContextClientVersion(3);
        ((eio) fwsVar.f23764a).setRenderer(fwsVar.f23770g);
        Object obj2 = fwsVar.f23764a;
        ((eio) obj2).f14165a = this;
        ((eio) obj2).onResume();
        Object obj3 = fwsVar.f23764a;
        jvd.m13538a();
        iekVar.f30551a.addView((View) obj3);
        ((iiz) iekVar).f31158b.m4465f(((iiz) iekVar).f30551a);
        ((iiz) iekVar).f31158b.m4466g(1920, 1080, Integer.valueOf(((ekd) fwsVar.f23776m).f14454b.mo14553f()));
        Object obj4 = fwsVar.f23767d;
        ?? r7 = fwsVar.f23771h;
        Object obj5 = fwsVar.f23770g;
        ((eim) obj4).f14150a.mo13961e("ImaxFrameServer-start");
        kmg kmgVarMo13858e = ((eim) obj4).f14164o.f36117a.mo13858e(kmq.BACK);
        kmgVarMo13858e.getClass();
        eko ekoVar = ((eim) obj4).f14153d.f14455c;
        kbc kbcVar = new kbc(ekoVar.f14475a, ekoVar.f14476b);
        ((eim) obj4).f14151b.mo13944f("Viewfinder size: ".concat(kbcVar.toString()));
        kgh kghVarM14208a = kgi.m14208a();
        kghVarM14208a.m14206k(kgj.SURFACE_TEXTURE);
        kghVarM14208a.m14197b(kmgVarMo13858e);
        kghVarM14208a.m14204i(kbcVar);
        kgi kgiVarM14196a = kghVarM14208a.m14196a();
        ((eim) obj4).f14162m = new ctr((eim) obj4, (kbg) r7, 3);
        kxk.m14975U(((eju) obj5).f14396g, new eog((eim) obj4, kgiVarM14196a, 1), not.INSTANCE);
        ((eim) obj4).f14163n.set(false);
        kfm kfmVarM14151a = kfn.m14151a();
        kfmVarM14151a.m14145f(kmgVarMo13858e);
        kfmVarM14151a.m14143d(kgiVarM14196a);
        kfmVarM14151a.f35821c = new kgb(3);
        ekd ekdVar = ((eim) obj4).f14153d;
        HashSet hashSet = new HashSet();
        hashSet.add(kgq.m14215e(CaptureRequest.FLASH_MODE, 0));
        hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_AE_MODE, 1));
        hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_AE_LOCK, false));
        hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_AWB_MODE, 1));
        hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_AWB_LOCK, false));
        hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0));
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        Range[] rangeArr = (Range[]) ekdVar.f14454b.mo14559l(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range range = rangeArr[rangeArr.length - 1];
        for (Range range2 : rangeArr) {
            if (((Integer) range2.getLower()).intValue() * ((Integer) range.getUpper()).intValue() >= ((Integer) range.getLower()).intValue() * ((Integer) range2.getUpper()).intValue() && Math.abs(((Integer) range2.getUpper()).intValue() - 30) < Math.abs(((Integer) range.getUpper()).intValue() - 30)) {
                range = range2;
            }
        }
        hashSet.add(kgq.m14215e(key, range));
        hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_AF_MODE, 4));
        hashSet.add(kgq.m14215e(CaptureRequest.LENS_FOCUS_DISTANCE, (Float) ekdVar.f14454b.mo14559l(CameraCharacteristics.LENS_INFO_HYPERFOCAL_DISTANCE)));
        hashSet.add(kgq.m14215e(CaptureRequest.NOISE_REDUCTION_MODE, 2));
        for (int i2 : (int[]) ((kmc) ekdVar.f14454b).mo14560m(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES, kmc.f36533c)) {
            if (i2 == 2) {
                hashSet.add(kgq.m14215e(CaptureRequest.EDGE_MODE, 2));
                break;
            }
        }
        CaptureRequest.Key key2 = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
        dhv dhvVar = ekdVar.f14456d;
        dhw dhwVar = die.f11473a;
        dhvVar.mo6179g();
        hashSet.add(kgq.m14215e(key2, 0));
        hashSet.addAll(gls.m9441c(ikw.IMAX, ekdVar.f14454b));
        if (ekdVar.f14456d.mo6184l(dib.f11351ce)) {
            hashSet.add(kgq.m14215e(ivx.f32441d, ekd.f14453a));
        }
        gls.m9442d(hashSet, kfmVarM14151a, ((eim) obj4).f14164o.f36117a.mo13854a(kmgVarMo13858e));
        kfk kfkVarMo14178a = ((eim) obj4).f14164o.mo14178a(kfmVarM14151a.m14140a());
        kfkVarMo14178a.getClass();
        ((eim) obj4).f14157h = kfkVarMo14178a;
        kfkVarMo14178a.mo14123j(hashSet);
        ((eim) obj4).f14150a.mo13962f();
        ((jvb) fwsVar.f23769f).m13537d(new eip(fwsVar, iekVar, 0, null));
        ((jvb) fwsVar.f23769f).m13537d(fwsVar.f23775l.mo11233e(fwsVar.f23765b));
        ((BottomBarController) fwsVar.f23766c).addListener((BottomBarListener) fwsVar.f23774k);
        ((eoq) fwsVar.f23772i).m7597a(fwsVar.f23773j);
        ((jvb) fwsVar.f23769f).m13537d(new eds(fwsVar, 3, (byte[]) null));
        ((jvb) fwsVar.f23769f).m13537d(new eds(fwsVar, 4, (byte[]) null));
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final synchronized void mo3781p() {
        eln elnVar = this.f14445b;
        if (elnVar == null) {
            return;
        }
        lku.m15662p(elnVar);
        eja ejaVarMo7459b = elnVar.mo7459b();
        mpw.m16775n(new ceu(ejaVarMo7459b.f14264r, 8));
        ejaVarMo7459b.f14233J.m7354b(new efd(ejaVarMo7459b, 12));
        ejaVarMo7459b.f14259m.onPause();
        ejaVarMo7459b.f14272z.m11597c();
        eln elnVar2 = this.f14445b;
        lku.m15662p(elnVar2);
        eim eimVarMo7458a = elnVar2.mo7458a();
        eimVarMo7458a.f14151b.mo13944f("Received onModuleStop");
        eimVarMo7458a.f14155f.mo3415bf(false);
        kfc kfcVar = eimVarMo7458a.f14160k;
        if (kfcVar != null) {
            kfcVar.mo9412l(eimVarMo7458a.f14162m);
        }
        kgg kggVar = eimVarMo7458a.f14159j;
        if (kggVar != null) {
            kggVar.mo14194d(null);
        }
        Surface surface = eimVarMo7458a.f14158i;
        if (surface != null) {
            surface.release();
            eimVarMo7458a.f14158i = null;
        }
        eimVarMo7458a.f14159j = null;
        kfc kfcVar2 = eimVarMo7458a.f14160k;
        if (kfcVar2 != null) {
            kfcVar2.close();
        }
        eimVarMo7458a.f14160k = null;
        eimVarMo7458a.f14151b.mo13940b("Panorama frameserver closing");
        kfk kfkVar = eimVarMo7458a.f14157h;
        kfkVar.getClass();
        kfkVar.close();
        eimVarMo7458a.f14157h = null;
        eimVarMo7458a.f14152c.mo5712g();
        eln elnVar3 = this.f14445b;
        lku.m15662p(elnVar3);
        ((eka) ((etd) elnVar3).f17340f.get()).mo5712g();
        eln elnVar4 = this.f14445b;
        lku.m15662p(elnVar4);
        ((jvb) ((etd) elnVar4).f17343i.get()).close();
        this.f14445b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r2 == 0) goto L6;
     */
    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean mo3785t() {
        eln elnVar = this.f14445b;
        if (elnVar != null) {
            eja ejaVarMo7459b = elnVar.mo7459b();
            int i = ejaVarMo7459b.f14264r.get();
            if (i == 3) {
                ejaVarMo7459b.m7384c();
                ejaVarMo7459b.m7389h(false, 2);
            }
            return true;
        }
        return false;
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: v */
    public final boolean mo3787v() {
        return false;
    }
}
