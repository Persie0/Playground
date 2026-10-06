package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hso implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f29426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f29427c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f29428d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f29429e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ int f29430f;

    public /* synthetic */ hso(hqz hqzVar, int i, int i2, goy goyVar, jay jayVar, int i3, byte[] bArr, byte[] bArr2) {
        this.f29430f = i3;
        this.f29427c = hqzVar;
        this.f29425a = i;
        this.f29426b = i2;
        this.f29428d = goyVar;
        this.f29429e = jayVar;
    }

    public /* synthetic */ hso(hst hstVar, int i, View view, DialogInterface.OnDismissListener onDismissListener, int i2, int i3) {
        this.f29430f = i3;
        this.f29427c = hstVar;
        this.f29425a = i;
        this.f29428d = view;
        this.f29429e = onDismissListener;
        this.f29426b = i2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.DialogInterface$OnDismissListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        switch (this.f29430f) {
            case 0:
                Object obj = this.f29427c;
                int i = this.f29425a;
                Object obj2 = this.f29428d;
                final ?? r3 = this.f29429e;
                final int i2 = this.f29426b;
                View view = (View) obj2;
                Context context = view.getContext();
                if (i >= 0) {
                    frameLayout = new FrameLayout(context);
                    View.inflate(context, C0100R.layout.title_text, frameLayout);
                    ((TextView) frameLayout.findViewById(C0100R.id.sheet_title)).setText(i);
                } else {
                    frameLayout = null;
                }
                final hst hstVar = (hst) obj;
                ViewGroup viewGroupM10705d = hstVar.m10705d(frameLayout, context);
                viewGroupM10705d.addView(view);
                hstVar.m10707f(viewGroupM10705d);
                mhc mhcVar = hstVar.f29440d;
                if (mhcVar != null) {
                    mhcVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hsp
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            hst hstVar2 = hstVar;
                            DialogInterface.OnDismissListener onDismissListener = r3;
                            int i3 = i2;
                            hstVar2.m10709h();
                            if (onDismissListener != null) {
                                onDismissListener.onDismiss(dialogInterface);
                            }
                            hstVar2.m10711j(i3);
                        }
                    });
                    hstVar.f29440d.show();
                    return;
                }
                return;
            default:
                Object obj3 = this.f29427c;
                int i3 = this.f29425a;
                int i4 = this.f29426b;
                Object obj4 = this.f29428d;
                hqz hqzVar = (hqz) obj3;
                goy goyVar = (goy) obj4;
                hqzVar.f29233h = new drj(hqzVar.f29231f, i3, i4, goyVar, (jay) this.f29429e, null, null, null, null);
                ihk ihkVar = (ihk) hqzVar.f29233h.f12399e;
                int[] iArr = new int[2];
                hrd hrdVar = (hrd) ihkVar.f30966a;
                int[] iArr2 = {12375, hrdVar.f29254c, 12374, hrdVar.f29253b, 12344};
                int[] iArr3 = {12440, 2, 12344};
                hrdVar.f29261j = (EGL10) EGLContext.getEGL();
                hrdVar.f29256e = hrdVar.f29261j.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                if (hrdVar.f29256e == EGL10.EGL_NO_DISPLAY) {
                    throw new RuntimeException("eglGetDisplay failed.");
                }
                if (!hrdVar.f29261j.eglInitialize(hrdVar.f29256e, iArr)) {
                    throw new RuntimeException("eglInitialize failed.");
                }
                int[] iArr4 = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
                hrdVar.f29261j.eglInitialize(hrdVar.f29256e, new int[2]);
                int[] iArr5 = new int[1];
                hrdVar.f29261j.eglChooseConfig(hrdVar.f29256e, iArr4, hrdVar.f29258g, 0, iArr5);
                int i5 = iArr5[0];
                hrdVar.f29258g = new EGLConfig[i5];
                hrdVar.f29261j.eglChooseConfig(hrdVar.f29256e, iArr4, hrdVar.f29258g, i5, iArr5);
                EGLConfig eGLConfig = hrdVar.f29258g[0];
                eGLConfig.getClass();
                hrdVar.f29257f = eGLConfig;
                hrdVar.f29259h = hrdVar.f29261j.eglCreateContext(hrdVar.f29256e, hrdVar.f29257f, EGL10.EGL_NO_CONTEXT, iArr3);
                EGLContext eGLContext = hrdVar.f29259h;
                if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                    throw new RuntimeException("eglContext create failed.");
                }
                hrdVar.f29260i = hrdVar.f29261j.eglCreatePbufferSurface(hrdVar.f29256e, hrdVar.f29257f, iArr2);
                EGLSurface eGLSurface = hrdVar.f29260i;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    throw new RuntimeException("eglSurface create failed.");
                }
                EGL10 egl10 = hrdVar.f29261j;
                EGLDisplay eGLDisplay = hrdVar.f29256e;
                EGLSurface eGLSurface2 = hrdVar.f29260i;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, hrdVar.f29259h);
                hrdVar.f29262k = (GL10) hrdVar.f29259h.getGL();
                hrd hrdVar2 = (hrd) ihkVar.f30966a;
                hrdVar2.f29263l = (hrc) ihkVar.f30967b;
                if (Thread.currentThread().getName().equals(hrdVar2.f29255d)) {
                    hrdVar2.f29263l.onSurfaceChanged(hrdVar2.f29262k, hrdVar2.f29254c, hrdVar2.f29253b);
                    return;
                } else {
                    ((nbe) ((nbe) hrd.f29252a.m17251b()).mo17276G((char) 3915)).mo17290o("setRenderer: This thread does not own the OpenGL context.");
                    return;
                }
        }
    }
}
