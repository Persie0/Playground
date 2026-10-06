package p000;

import com.google.android.apps.camera.debugui.DebugCanvasView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnf {

    /* JADX INFO: renamed from: a */
    public static final nbh f12084a = nbh.m17259h("com/google/android/apps/camera/debugui/DebugCanvasAdapter");

    /* JADX INFO: renamed from: b */
    public DebugCanvasView f12085b;

    /* JADX INFO: renamed from: c */
    public final kfv f12086c;

    /* JADX INFO: renamed from: d */
    private final dhv f12087d;

    public dnf(dhv dhvVar) {
        this.f12087d = dhvVar;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        dhvVar.mo6175c();
        dhvVar.mo6175c();
        dhvVar.mo6175c();
        dhvVar.mo6175c();
        this.f12086c = new dne(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m6428a(DebugCanvasView debugCanvasView) {
        this.f12085b = debugCanvasView;
        if (debugCanvasView != null) {
            debugCanvasView.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6429b() {
        dhv dhvVar = this.f12087d;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        this.f12087d.mo6175c();
    }

    /* JADX INFO: renamed from: c */
    public final void m6430c() {
        DebugCanvasView debugCanvasView = this.f12085b;
        if (debugCanvasView == null) {
            ((nbe) ((nbe) f12084a.m17252c()).mo17276G((char) 1018)).mo17290o("UI view not yet initialized");
        } else {
            debugCanvasView.setVisibility(4);
        }
    }
}
