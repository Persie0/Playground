package p000;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dnw implements doe, fbp, fbl, fbj {

    /* JADX INFO: renamed from: a */
    private static final nbh f12131a = nbh.m17259h("com/google/android/apps/camera/error/FatalActivityErrorHandler");

    /* JADX INFO: renamed from: b */
    private static final mws f12132b = mws.m17100o(ikw.PHOTO, ikw.VIDEO, ikw.VIDEO_INTENT, ikw.IMAGE_INTENT);

    /* JADX INFO: renamed from: c */
    private final WeakReference f12133c;

    /* JADX INFO: renamed from: d */
    private final fcp f12134d;

    /* JADX INFO: renamed from: e */
    private final cie f12135e;

    /* JADX INFO: renamed from: f */
    private final jww f12136f;

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f12137g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    private final cwd f12138h;

    public dnw(WeakReference weakReference, fcp fcpVar, cie cieVar, jww jwwVar, cwd cwdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12133c = weakReference;
        this.f12134d = fcpVar;
        this.f12135e = cieVar;
        this.f12136f = jwwVar;
        this.f12138h = cwdVar;
    }

    /* JADX INFO: renamed from: a */
    protected final void m6455a(boolean z, String str, Exception exc) {
        if (z) {
            Activity activity = (Activity) this.f12133c.get();
            if (activity != null && !activity.isFinishing()) {
                ((nbe) ((nbe) ((nbe) f12131a.m17251b()).mo17283h(exc)).mo17276G((char) 1049)).mo17293r("Activity received a fatal error. Finishing activity: %s", str);
                activity.finish();
            }
        } else {
            ((nbe) ((nbe) f12131a.m17252c()).mo17276G((char) 1050)).mo17293r("Activity received a fatal error. Not finishing the activity: %s", str);
        }
        synchronized (this.f12135e) {
            Iterator it = this.f12135e.iterator();
            while (it.hasNext()) {
                ((cid) it.next()).mo3797a(exc);
            }
        }
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        this.f12137g.set(true);
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f12137g.set(false);
    }

    @Override // p000.doj
    /* JADX INFO: renamed from: d */
    public final void mo6456d() {
        Exception exc = new Exception();
        ((nbe) ((nbe) ((nbe) f12131a.m17251b()).mo17283h(exc)).mo17276G((char) 1051)).mo17290o("Handling Camera Disabled Failure:");
        fcp fcpVar = this.f12134d;
        int i = mws.f41739d;
        mws mwsVar = mzr.f41857a;
        fcpVar.mo8147V(2, null, exc, -1, -1, 0, mwsVar, mwsVar, kcl.CAMERA_ERROR_CODE_UNKNOWN, false);
        m6455a(true, "Camera has been disabled because of security policies.", exc);
    }

    @Override // p000.kea
    /* JADX INFO: renamed from: e */
    public final void mo6457e(Throwable th) {
        Exception exc = new Exception();
        ((nbe) ((nbe) ((nbe) f12131a.m17251b()).mo17283h(exc)).mo17276G((char) 1052)).mo17290o("Camera Hardware failure:");
        kcl kclVar = kcl.CAMERA_OPEN_TIMEOUT;
        ArrayList arrayList = new ArrayList();
        doc docVar = (doc) th;
        kcl kclVar2 = docVar.f12152b;
        arrayList.addAll(docVar.f12151a);
        fcp fcpVar = this.f12134d;
        int i = mws.f41739d;
        fcpVar.mo8147V(12, null, exc, -1, -1, 0, arrayList, mzr.f41857a, kclVar2, false);
        m6455a(true, "Camera Hardware failure: One or more cameras may not have been enumerated", exc);
    }

    @Override // p000.kea
    /* JADX INFO: renamed from: f */
    public final void mo6458f(Throwable th) {
        kcl kclVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        dnv dnvVar;
        boolean z5;
        Exception exc = new Exception(th);
        ArrayList arrayList = new ArrayList();
        kcl kclVar2 = kcl.CAMERA_ERROR_CODE_UNKNOWN;
        dnv dnvVar2 = dnv.UNKNOWN;
        if (th instanceof kcr) {
            kcr kcrVar = (kcr) th;
            kcl kclVar3 = kcrVar.f35598a;
            boolean z6 = kcrVar.f35600c;
            if (kcrVar.f35599b.m14577c()) {
                arrayList.add(kcrVar.f35599b.f36540a);
            }
            if (kcl.m13982e(kclVar3) && f12132b.contains(this.f12136f.mo3831be()) && this.f12138h.m5672t()) {
                dnvVar = dnv.DEVICE_FORWARDED;
                z4 = true;
                z5 = false;
            } else {
                z4 = !this.f12137g.get();
                dnvVar = dnv.DEVICE_HANDLED;
                z5 = true;
            }
            z2 = z4;
            kclVar = kclVar3;
            z = z6;
            dnvVar2 = dnvVar;
            z3 = z5;
        } else if (th instanceof dof) {
            dof dofVar = (dof) th;
            kcl kclVar4 = dofVar.f12153a;
            if (dofVar.f12154b.m14577c()) {
                arrayList.add(dofVar.f12154b.f36540a);
            }
            kclVar = kclVar4;
            z = dofVar.f12155c > 0;
            z2 = true;
            z3 = true;
            dnvVar2 = dnv.FALLBACK_HANDLED;
        } else {
            kclVar = kclVar2;
            z = false;
            z2 = true;
            z3 = true;
        }
        fcp fcpVar = this.f12134d;
        String str = dnvVar2.f12130e;
        int i = mws.f41739d;
        fcpVar.mo8147V(3, str, th, -1, -1, 0, mzr.f41857a, arrayList, kclVar, z);
        if (z3) {
            ((nbe) ((nbe) ((nbe) f12131a.m17251b()).mo17283h(exc)).mo17276G(1053)).mo17293r("Handling Camera Open Failure. %s", true != z2 ? "Not finishing activity. Activity in background when CameraDeviceException is received" : "Finishing activity.");
            m6455a(z2, kclVar.m13983c(), exc);
        }
    }

    @Override // p000.doj
    /* JADX INFO: renamed from: g */
    public final void mo6459g() {
        Exception exc = new Exception();
        ((nbe) ((nbe) ((nbe) f12131a.m17251b()).mo17283h(exc)).mo17276G((char) 1054)).mo17290o("Handling Camera Reconnect Failure:");
        fcp fcpVar = this.f12134d;
        int i = mws.f41739d;
        mws mwsVar = mzr.f41857a;
        fcpVar.mo8147V(4, null, exc, -1, -1, 0, mwsVar, mwsVar, kcl.CAMERA_ERROR_CODE_UNKNOWN, false);
        m6455a(true, "Camera Reconnect Failure", exc);
    }

    @Override // p000.doj
    /* JADX INFO: renamed from: h */
    public final void mo6460h() {
        Exception exc = new Exception();
        ((nbe) ((nbe) ((nbe) f12131a.m17251b()).mo17283h(exc)).mo17276G((char) 1055)).mo17290o("Handling Camera Access Failure:");
        fcp fcpVar = this.f12134d;
        int i = mws.f41739d;
        mws mwsVar = mzr.f41857a;
        fcpVar.mo8147V(1, null, exc, -1, -1, 0, mwsVar, mwsVar, kcl.CAMERA_ERROR_CODE_UNKNOWN, false);
        m6455a(true, "Camera Access Failure", exc);
    }

    @Override // p000.dol
    /* JADX INFO: renamed from: i */
    public final void mo6461i() {
        Exception exc = new Exception();
        ((nbe) ((nbe) ((nbe) f12131a.m17251b()).mo17283h(exc)).mo17276G((char) 1056)).mo17290o("Handling MediaRecorder Failure:");
        this.f12134d.mo8194n();
        m6455a(true, "There was a problem with the media recorder.", exc);
    }
}
