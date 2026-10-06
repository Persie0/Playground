package p000;

import android.animation.AnimatorSet;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.p014ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.apps.camera.p014ui.views.ViewfinderCover;
import com.google.android.apps.camera.p014ui.wirers.PreviewOverlay;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ciq implements chm {

    /* JADX INFO: renamed from: a */
    public static final nbh f5815a = nbh.m17259h("com/google/android/apps/camera/app/ui/CameraAppUiImpl");

    /* JADX INFO: renamed from: A */
    public final Consumer f5816A;

    /* JADX INFO: renamed from: B */
    public boolean f5817B;

    /* JADX INFO: renamed from: C */
    public final dnr f5818C;

    /* JADX INFO: renamed from: D */
    private final boolean f5819D;

    /* JADX INFO: renamed from: E */
    private final hxp f5820E;

    /* JADX INFO: renamed from: F */
    private final BottomBarController f5821F;

    /* JADX INFO: renamed from: G */
    private final eoq f5822G;

    /* JADX INFO: renamed from: H */
    private final gvy f5823H;

    /* JADX INFO: renamed from: I */
    private final dhv f5824I;

    /* JADX INFO: renamed from: J */
    private final CaptureAnimationOverlay f5825J;

    /* JADX INFO: renamed from: K */
    private final gfa f5826K;

    /* JADX INFO: renamed from: L */
    private final ien f5827L;

    /* JADX INFO: renamed from: M */
    private final ien f5828M;

    /* JADX INFO: renamed from: N */
    private final ien f5829N;

    /* JADX INFO: renamed from: O */
    private final huu f5830O;

    /* JADX INFO: renamed from: P */
    private final oju f5831P;

    /* JADX INFO: renamed from: Q */
    private final imy f5832Q;

    /* JADX INFO: renamed from: S */
    private final cdu f5834S;

    /* JADX INFO: renamed from: b */
    public final chj f5836b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f5837c;

    /* JADX INFO: renamed from: d */
    public final icf f5838d;

    /* JADX INFO: renamed from: e */
    public final ViewfinderCover f5839e;

    /* JADX INFO: renamed from: f */
    public final MainActivityLayout f5840f;

    /* JADX INFO: renamed from: g */
    public final FrameLayout f5841g;

    /* JADX INFO: renamed from: h */
    public final ShutterButton f5842h;

    /* JADX INFO: renamed from: i */
    public final igb f5843i;

    /* JADX INFO: renamed from: j */
    public final dnf f5844j;

    /* JADX INFO: renamed from: k */
    public final hyz f5845k;

    /* JADX INFO: renamed from: l */
    public final DisplayManager.DisplayListener f5846l;

    /* JADX INFO: renamed from: m */
    public int f5847m;

    /* JADX INFO: renamed from: n */
    public final PreviewOverlay f5848n;

    /* JADX INFO: renamed from: o */
    public ieq f5849o;

    /* JADX INFO: renamed from: q */
    public final htf f5851q;

    /* JADX INFO: renamed from: r */
    public ien f5852r;

    /* JADX INFO: renamed from: s */
    public final iht f5853s;

    /* JADX INFO: renamed from: t */
    public SurfaceTexture f5854t;

    /* JADX INFO: renamed from: u */
    public int f5855u;

    /* JADX INFO: renamed from: v */
    public int f5856v;

    /* JADX INFO: renamed from: w */
    public final DisplayManager f5857w;

    /* JADX INFO: renamed from: x */
    public final WindowManager f5858x;

    /* JADX INFO: renamed from: y */
    public final fcp f5859y;

    /* JADX INFO: renamed from: z */
    public final CameraActivityTiming f5860z;

    /* JADX INFO: renamed from: p */
    public final View.OnLayoutChangeListener f5850p = new cin();

    /* JADX INFO: renamed from: T */
    private int f5835T = 1;

    /* JADX INFO: renamed from: R */
    private nqf f5833R = nqf.m17621g();

    public ciq(final chj chjVar, MainActivityLayout mainActivityLayout, iid iidVar, djm djmVar, hzu hzuVar, iht ihtVar, cdu cduVar, DisplayManager displayManager, WindowManager windowManager, htf htfVar, huu huuVar, cht chtVar, BottomBarController bottomBarController, igb igbVar, eoq eoqVar, fcp fcpVar, CameraActivityTiming cameraActivityTiming, oju ojuVar, icf icfVar, hxp hxpVar, gfa gfaVar, jfs jfsVar, Consumer consumer, dnf dnfVar, dhv dhvVar, gvy gvyVar, imy imyVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5836b = chjVar;
        this.f5840f = mainActivityLayout;
        this.f5819D = z;
        this.f5853s = ihtVar;
        this.f5831P = ojuVar;
        this.f5834S = cduVar;
        this.f5857w = displayManager;
        this.f5858x = windowManager;
        this.f5830O = huuVar;
        this.f5851q = htfVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) djmVar.f11787a;
        this.f5837c = constraintLayout;
        this.f5821F = bottomBarController;
        this.f5843i = igbVar;
        this.f5822G = eoqVar;
        this.f5838d = icfVar;
        this.f5820E = hxpVar;
        this.f5826K = gfaVar;
        this.f5844j = dnfVar;
        this.f5823H = gvyVar;
        this.f5824I = dhvVar;
        this.f5832Q = imyVar;
        this.f5839e = (ViewfinderCover) ((jfs) djmVar.f11789c).m13100f(C0100R.id.viewfinder_cover);
        this.f5859y = fcpVar;
        this.f5860z = cameraActivityTiming;
        this.f5816A = consumer;
        gfaVar.mo9130p(new gey() { // from class: cil
            @Override // p000.gey
            /* JADX INFO: renamed from: a */
            public final void mo3800a() {
                this.f5812a.mo3714d();
            }
        });
        gfaVar.mo9132s(new gez() { // from class: cim
            @Override // p000.gez
            /* JADX INFO: renamed from: a */
            public final void mo3801a() {
                chjVar.mo3703q();
            }
        });
        ((ife) jfsVar.f33914a).f30617c.setOnClickListener(new ViewOnClickListenerC0250hu(this, 5));
        cduVar.m3529i().m13537d(htfVar.mo10733a(new cio(chtVar)));
        cduVar.m3529i().m13537d(chtVar.mo3753a(new esi(this, 1)));
        this.f5847m = ggi.m9211c(windowManager);
        fnq fnqVar = new fnq(this, 1);
        this.f5846l = fnqVar;
        displayManager.registerDisplayListener(fnqVar, null);
        this.f5842h = (ShutterButton) iidVar.f31080q.m13100f(C0100R.id.shutter_button);
        jfs jfsVarM13066o = jfs.m13066o(constraintLayout);
        this.f5841g = (FrameLayout) jfsVarM13066o.m13100f(C0100R.id.module_layout);
        this.f5848n = (PreviewOverlay) jfsVarM13066o.m13100f(C0100R.id.preview_overlay);
        this.f5825J = (CaptureAnimationOverlay) jfsVarM13066o.m13100f(C0100R.id.capture_animation_overlay);
        this.f5818C = new dnr(null);
        dnfVar.m6428a((DebugCanvasView) jfsVarM13066o.m13100f(C0100R.id.debug_viz_view));
        this.f5845k = new hyz((ViewStub) jfsVarM13066o.m13100f(C0100R.id.hotshot_view_stub), dhvVar);
        ieo ieoVar = new ieo(new ies((ConstraintLayout) mainActivityLayout.findViewById(C0100R.id.activity_root_view), hzuVar, windowManager, this));
        this.f5829N = ieoVar;
        this.f5852r = ieoVar;
        ieo ieoVar2 = new ieo(new iet(ihtVar));
        this.f5827L = ieoVar2;
        this.f5828M = ieoVar2;
        iidVar.f31067d.setImportantForAccessibility(1);
        iidVar.f31067d.setAccessibilityDelegate(new cip());
    }

    /* JADX INFO: renamed from: t */
    private final void m3805t(boolean z) {
        this.f5821F.setCameraSwitchEnabled(z);
        this.f5820E.m10837d(z);
    }

    /* JADX INFO: renamed from: u */
    private static final void m3806u(ien ienVar) {
        ienVar.mo11157h(null);
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: a */
    public final mrm mo3711a() {
        return this.f5852r.mo11152c(this.f5832Q);
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: b */
    public final void mo3712b() {
        this.f5852r.mo11155f();
    }

    @Override // p000.ezs
    /* JADX INFO: renamed from: bH */
    public final boolean mo3807bH() {
        if (!this.f5826K.mo9108G()) {
            return this.f5836b.mo3694h().mo3785t();
        }
        this.f5826K.mo9113M();
        return true;
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: c */
    public final void mo3713c() {
        CaptureAnimationOverlay captureAnimationOverlay = this.f5825J;
        AnimatorSet animatorSet = captureAnimationOverlay.f7193b;
        if (animatorSet != null && animatorSet.isRunning()) {
            captureAnimationOverlay.f7193b.cancel();
        }
        captureAnimationOverlay.f7194c = 1;
        captureAnimationOverlay.setVisibility(4);
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: d */
    public final void mo3714d() {
        if (this.f5834S.m3526f()) {
            return;
        }
        if (this.f5819D) {
            this.f5836b.mo3699m();
        } else {
            this.f5838d.mo11003b();
            this.f5830O.mo10754a();
        }
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: e */
    public final void mo3715e() {
        this.f5821F.setSideButtonsClickable(false);
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: f */
    public final void mo3716f() {
        this.f5821F.setSideButtonsClickable(true);
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: g */
    public final void mo3717g() {
        this.f5821F.setClickable(true);
        this.f5843i.mo11197E(true);
        this.f5822G.m7600g(1);
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: h */
    public final void mo3718h(boolean z) {
        this.f5859y.mo8126A(z);
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: i */
    public final void mo3719i() {
        this.f5839e.mo4494f(this.f5836b.mo3698l());
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: j */
    public final void mo3720j(boolean z) {
        this.f5843i.mo11199G(z);
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: k */
    public final void mo3721k() {
        this.f5825J.m4436b();
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: l */
    public final void mo3722l() {
        this.f5825J.m4435a(true);
        m3805t(false);
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: m */
    public final void mo3723m() {
        this.f5825J.m4435a(false);
        m3805t(true);
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: n */
    public final void mo3724n() {
        int i = 0;
        this.f5817B = false;
        this.f5839e.m4498j();
        if (this.f5824I.mo6184l(dhm.f11138c)) {
            this.f5823H.mo9802a(this.f5836b.mo3698l());
        }
        Object obj = this.f5831P.get();
        hlc hlcVar = (hlc) obj;
        if (!hlcVar.m10440k(hkt.MODE_SWITCH_FIRST_PREVIEW)) {
            hlcVar.m10437h(hkt.MODE_SWITCH_FIRST_PREVIEW);
            hku hkuVar = (hku) obj;
            hkuVar.f28215a.mo13952a();
            hkuVar.f28215a = kcc.f35555b;
            this.f5833R.mo14894e(Object.class);
            this.f5833R = nqf.m17621g();
        }
        if (this.f5860z.m10440k(hkp.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED)) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(new cij(this, i));
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: o */
    public final void mo3725o() {
        this.f5821F.setCameraSwitchEnabled(true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f5854t = surfaceTexture;
        this.f5855u = i;
        this.f5856v = i2;
        ieq ieqVar = this.f5849o;
        if (ieqVar != null) {
            ieqVar.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f5854t = null;
        ieq ieqVar = this.f5849o;
        if (ieqVar == null) {
            return false;
        }
        ieqVar.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f5854t = surfaceTexture;
        this.f5855u = i;
        this.f5856v = i2;
        ieq ieqVar = this.f5849o;
        if (ieqVar != null) {
            ieqVar.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f5854t = surfaceTexture;
    }

    @Override // p000.chm
    /* JADX INFO: renamed from: p */
    public final void mo3726p(int i, ieq ieqVar) {
        this.f5827L.getClass();
        this.f5828M.getClass();
        this.f5829N.getClass();
        lku.m15669w(true);
        int i2 = this.f5835T;
        if (i == i2) {
            this.f5849o = ieqVar;
        } else {
            this.f5849o = null;
            if (i2 != 1) {
                if (i2 == 3) {
                    m3806u(this.f5852r);
                }
                ien ienVar = this.f5852r;
                if (ienVar != null) {
                    ienVar.mo11154e();
                }
            }
            this.f5849o = ieqVar;
            ien ienVar2 = this.f5827L;
            ienVar2.getClass();
            ien ienVar3 = this.f5828M;
            ienVar3.getClass();
            ien ienVar4 = this.f5829N;
            ienVar4.getClass();
            switch (i - 1) {
                case 2:
                    ienVar2 = ienVar4;
                    break;
                default:
                    if (this.f5852r == ienVar2) {
                        ienVar2 = ienVar3;
                    }
                    break;
            }
            this.f5852r = ienVar2;
            this.f5835T = i;
            ienVar2.getClass();
            if (i == 3) {
                ienVar2.mo11157h(this.f5850p);
            }
            this.f5852r.mo11153d();
        }
        ieq ieqVar2 = this.f5849o;
        if (ieqVar2 != null) {
            GestureDetector.OnGestureListener onGestureListenerMo11145a = ieqVar2.mo11145a();
            if (onGestureListenerMo11145a != null) {
                PreviewOverlay previewOverlay = this.f5848n;
                previewOverlay.f7297a = new GestureDetector(previewOverlay.getContext(), onGestureListenerMo11145a);
            }
            View.OnTouchListener onTouchListenerMo11146b = this.f5849o.mo11146b();
            if (onTouchListenerMo11146b != null) {
                this.f5848n.f7298b = onTouchListenerMo11146b;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3808q(ikw ikwVar) {
        this.f5836b.mo3702p(ikwVar);
        if (this.f5838d.mo11020s(ikwVar)) {
            this.f5838d.mo11013l(true);
        } else if (ikwVar == ikw.VIDEO_INTENT) {
            this.f5838d.mo11013l(false);
        } else {
            this.f5838d.mo11013l(false);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3809r() {
        if (this.f5835T == 1) {
            return;
        }
        m3806u(this.f5852r);
        try {
            this.f5852r.mo11154e().get(2000L, TimeUnit.MILLISECONDS);
            this.f5835T = 1;
        } catch (InterruptedException e) {
            throw new IllegalStateException("Synchronization close failed on preview switch.");
        } catch (ExecutionException e2) {
            throw new IllegalStateException("Synchronization close failed on preview switch.");
        } catch (TimeoutException e3) {
            throw new IllegalStateException("Surface Destruction Synchronization on Module Switch Timed out.", e3);
        }
    }
}
