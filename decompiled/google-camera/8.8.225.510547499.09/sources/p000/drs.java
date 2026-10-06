package p000;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.opengl.EGL14;
import com.google.android.apps.camera.jni.faceobfuscation.GpuRedactorNative;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class drs implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12430a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12431b;

    public /* synthetic */ drs(Activity activity, int i) {
        this.f12431b = i;
        this.f12430a = activity;
    }

    public /* synthetic */ drs(ckp ckpVar, int i) {
        this.f12431b = i;
        this.f12430a = ckpVar;
    }

    public /* synthetic */ drs(drt drtVar, int i) {
        this.f12431b = i;
        this.f12430a = drtVar;
    }

    public /* synthetic */ drs(dru druVar, int i) {
        this.f12431b = i;
        this.f12430a = druVar;
    }

    public /* synthetic */ drs(dsf dsfVar, int i) {
        this.f12431b = i;
        this.f12430a = dsfVar;
    }

    public /* synthetic */ drs(dur durVar, int i) {
        this.f12431b = i;
        this.f12430a = durVar;
    }

    public /* synthetic */ drs(dxi dxiVar, int i) {
        this.f12431b = i;
        this.f12430a = dxiVar;
    }

    public drs(eaj eajVar, int i) {
        this.f12431b = i;
        this.f12430a = eajVar;
    }

    public /* synthetic */ drs(eal ealVar, int i) {
        this.f12431b = i;
        this.f12430a = ealVar;
    }

    public /* synthetic */ drs(ebw ebwVar, int i) {
        this.f12431b = i;
        this.f12430a = ebwVar;
    }

    public drs(Object obj, int i) {
        this.f12431b = i;
        this.f12430a = obj;
    }

    public /* synthetic */ drs(key keyVar, int i) {
        this.f12431b = i;
        this.f12430a = keyVar;
    }

    public /* synthetic */ drs(kpw kpwVar, int i) {
        this.f12431b = i;
        this.f12430a = kpwVar;
    }

    public /* synthetic */ drs(ohb ohbVar, int i) {
        this.f12431b = i;
        this.f12430a = ohbVar;
    }

    public /* synthetic */ drs(oju ojuVar, int i) {
        this.f12431b = i;
        this.f12430a = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v29, types: [dxn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ohb] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12431b) {
            case 0:
                mrm mrmVar = ((drt) this.f12430a).f12432a;
                mrmVar.getClass();
                ((dsq) mrmVar.mo16809c()).mo6644d(false);
                return;
            case 1:
                this.f12430a.get();
                return;
            case 2:
                mrm mrmVar2 = ((drt) this.f12430a).f12432a;
                mrmVar2.getClass();
                ((dsq) mrmVar2.mo16809c()).mo6644d(true);
                return;
            case 3:
                Object obj = this.f12430a;
                synchronized (((dru) obj).f12440a) {
                    ((dru) obj).f12441b = GpuRedactorNative.createRedactor(true);
                    break;
                }
                return;
            case 4:
                ((dsf) this.f12430a).m6649c();
                return;
            case 5:
                ?? r0 = this.f12430a;
                kfd kfdVarMo7041b = r0.mo7041b();
                ((nbe) ((nbe) dtc.f12543a.m17251b()).mo17276G(1136)).mo17292q("Dropped frame%d because the feature extraction took too long", kfdVarMo7041b != null ? kfdVarMo7041b.f35811b : -1L);
                r0.close();
                return;
            case 6:
                Object obj2 = this.f12430a;
                synchronized (((dur) obj2).f12611b) {
                    if (((dur) obj2).f12612c == null) {
                        ((dur) obj2).f12612c = ((dur) obj2).f12610a.mo7000a("FeatureCentral");
                    }
                    break;
                }
                return;
            case 7:
                Object obj3 = this.f12430a;
                synchronized (((dur) obj3).f12611b) {
                    knh knhVar = ((dur) obj3).f12612c;
                    if (knhVar != null) {
                        knhVar.close();
                        ((dur) obj3).f12612c = null;
                    }
                    break;
                }
                return;
            case 8:
                ((djm) this.f12430a.get()).m6232g();
                return;
            case 9:
                ((ckp) this.f12430a).m3842b();
                return;
            case 10:
                this.f12430a.mo6846c();
                return;
            case 11:
                ((Activity) this.f12430a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/googlecamera/answer/9937175")));
                return;
            case 12:
                ((Activity) this.f12430a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/googlecamera/answer/9937175")));
                return;
            case 13:
                synchronized (((eaj) this.f12430a).f13064k) {
                    Object obj4 = this.f12430a;
                    if (((eaj) obj4).f13056c != null && ((eaj) obj4).f13058e != null) {
                        eai eaiVar = ((eaj) obj4).f13063j;
                        GL10 gl10 = ((eaj) obj4).f13060g;
                        exp expVar = ((foc) eaiVar).f22886q;
                        if (expVar != null) {
                            expVar.onDrawFrame(gl10);
                        }
                        Object obj5 = this.f12430a;
                        ((eaj) obj5).f13059f.eglSwapBuffers(((eaj) obj5).f13056c, ((eaj) obj5).f13058e);
                        ((eaj) this.f12430a).f13061h = false;
                    }
                    ((eaj) this.f12430a).f13064k.notifyAll();
                    break;
                }
                return;
            case 14:
                eaj eajVar = (eaj) this.f12430a;
                eajVar.f13059f.eglDestroySurface(eajVar.f13056c, eajVar.f13058e);
                eaj eajVar2 = (eaj) this.f12430a;
                eajVar2.f13059f.eglDestroyContext(eajVar2.f13056c, eajVar2.f13057d);
                eaj eajVar3 = (eaj) this.f12430a;
                eajVar3.f13059f.eglMakeCurrent(eajVar3.f13056c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                eaj eajVar4 = (eaj) this.f12430a;
                eajVar4.f13058e = null;
                eajVar4.f13057d = null;
                eajVar4.f13056c = null;
                EGL14.eglReleaseThread();
                return;
            case 15:
                synchronized (this.f12430a) {
                    this.f12430a.notifyAll();
                    break;
                }
                return;
            case 16:
                ((eal) this.f12430a).m7001b();
                return;
            case 17:
                ((ebw) this.f12430a).m7089c(0.5f);
                return;
            case 18:
                Object obj6 = this.f12430a;
                ebw ebwVar = (ebw) obj6;
                ebwVar.m7089c(1.0f);
                synchronized (ebwVar.f13309a) {
                    ((ebw) obj6).f13311c = null;
                    break;
                }
                return;
            case 19:
                ((ebw) this.f12430a).m7089c(1.0f);
                return;
            default:
                this.f12430a.close();
                return;
        }
    }
}
