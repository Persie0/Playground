package p000;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.apps.camera.zoomui.view.ZoomUi;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikn implements ikg {

    /* JADX INFO: renamed from: a */
    private final iuj f31366a;

    /* JADX INFO: renamed from: b */
    private final oju f31367b;

    /* JADX INFO: renamed from: c */
    private final Context f31368c;

    public ikn(iuj iujVar, oju ojuVar, Context context) {
        this.f31366a = iujVar;
        this.f31367b = ojuVar;
        this.f31368c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [hfc, iuj] */
    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        ZoomUi zoomUi = (ZoomUi) ((jfs) ((djm) this.f31367b.get()).f11789c).m13100f(C0100R.id.zoom_ui);
        ?? r2 = this.f31366a;
        Context context = this.f31368c;
        final ite iteVar = (ite) r2;
        iteVar.f32064O = zoomUi;
        iteVar.f32064O.m4575w(iteVar.f32068S);
        iteVar.f32064O.f7415k = iteVar.f32050A;
        iteVar.f32071V = true;
        iteVar.f32103h.mo3415bf(Float.valueOf(iteVar.f32111p));
        iteVar.f32052C.mo3415bf(gee.f24361a);
        iteVar.f32056G = iteVar.f32064O.m4557e();
        iteVar.f32057H = iteVar.f32064O.m4558f();
        iteVar.f32060K = iteVar.f32064O.m4572t();
        iteVar.f32061L = iteVar.f32064O.m4563k();
        iteVar.f32062M = iteVar.f32064O.m4573u();
        iteVar.f32063N = iteVar.f32064O.m4566n();
        iteVar.f32059J = context.getResources();
        iteVar.f32085ai = 0;
        if (iteVar.f32074Y) {
            iteVar.f32062M.m4539h();
            if (!iteVar.f32108m) {
                iteVar.f32060K.setVisibility(8);
            }
            iteVar.f32062M.setHorizontalFadingEdgeEnabled(true);
        }
        iteVar.f32065P = new isp(iteVar.f32110o, iteVar.f32103h, iteVar.f32102g, iteVar.f32101f, iteVar.f32098c, iteVar.f32109n, iteVar.f32099d, iteVar.f32121z);
        dhv dhvVar = iteVar.f32099d;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6179g();
        iteVar.f32054E = new isk(iteVar.f32064O, iteVar.f32104i, iteVar.f32103h, iteVar.f32115t, iteVar.f32107l, iteVar.f32120y, iteVar.f32098c, iteVar.f32110o, iteVar.f32099d, iteVar.f32111p, iteVar.f32065P, iteVar.f32105j);
        iteVar.f32053D = new isn(iteVar.f32064O, iteVar.f32054E);
        iteVar.m11735P();
        iteVar.m11769t();
        iteVar.m11727H(iteVar.f32056G, false);
        iteVar.m11727H(iteVar.f32057H, true);
        iteVar.f32063N.setOnTouchListener(new isv(iteVar, 0));
        if (iteVar.f32068S) {
            iteVar.f32070U = false;
            iteVar.f32069T = false;
            final GestureDetector gestureDetector = new GestureDetector(iteVar.f32064O.m4563k().getContext(), new isy(iteVar));
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            iteVar.f32061L.setOnTouchListener(new View.OnTouchListener() { // from class: isu
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    ite iteVar2 = iteVar;
                    AtomicBoolean atomicBoolean3 = atomicBoolean;
                    AtomicBoolean atomicBoolean4 = atomicBoolean2;
                    GestureDetector gestureDetector2 = gestureDetector;
                    if (!iteVar2.f32064O.m4550D() && !iteVar2.f32069T) {
                        return false;
                    }
                    if (motionEvent.getAction() == 1) {
                        if (atomicBoolean3.get()) {
                            atomicBoolean3.set(false);
                            return false;
                        }
                        if (atomicBoolean4.get()) {
                            atomicBoolean4.set(false);
                        }
                        if (iteVar2.f32070U) {
                            iteVar2.f32054E.mo11678ci();
                            iteVar2.f32060K.m4528c(false);
                            iteVar2.f32070U = false;
                        }
                        view.postDelayed(iteVar2.f32113r, 100L);
                        view.removeCallbacks(iteVar2.f32114s);
                        iteVar2.f32112q.set(true);
                        iteVar2.f32078ab = 0.0f;
                    }
                    gestureDetector2.onTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 0) {
                        view.postDelayed(iteVar2.f32114s, iteVar2.f32117v.mo16813g() ? ((Integer) iteVar2.f32117v.mo16809c()).intValue() : 400L);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(1);
                        atomicBoolean3.set(true);
                        view.postDelayed(new ipe(iteVar2, motionEventObtain, 3), 1L);
                        iteVar2.f32112q.set(false);
                        iteVar2.f32066Q = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
                    }
                    if (motionEvent.getAction() == 2 && !iteVar2.f32069T && (iteVar2.m11758i(motionEvent) > iteVar2.f32060K.getWidth() / 2.0f || iteVar2.m11758i(motionEvent) < (-(iteVar2.f32060K.getWidth() / 2.0f)))) {
                        view.removeCallbacks(iteVar2.f32114s);
                        if (iteVar2.f32074Y) {
                            view.postDelayed(iteVar2.f32114s, 1L);
                            return true;
                        }
                        iteVar2.f32112q.set(true);
                    }
                    if (motionEvent.getAction() == 2 && iteVar2.f32069T) {
                        if (iteVar2.f32074Y) {
                            if (!atomicBoolean4.get()) {
                                iteVar2.f32065P.m11707f();
                                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                                motionEventObtain2.setAction(0);
                                motionEventObtain2.setLocation(motionEvent.getX(), motionEvent.getY());
                                view.postDelayed(new ipe(iteVar2, motionEventObtain2, 5), 1L);
                                atomicBoolean4.set(true);
                            } else if (Math.abs(iteVar2.m11758i(motionEvent)) > 30.0f) {
                                iteVar2.m11720A();
                                motionEvent.setLocation(motionEvent.getX() - iteVar2.f32078ab, motionEvent.getY());
                                view.postDelayed(new ipe(iteVar2, motionEvent, 6), 1L);
                            }
                            iteVar2.m11762m();
                            return true;
                        }
                        if (Math.abs(iteVar2.m11758i(motionEvent)) > 30.0f) {
                            iteVar2.m11720A();
                            motionEvent.setLocation(motionEvent.getX() - iteVar2.f32078ab, motionEvent.getY());
                            iteVar2.f32065P.m11707f();
                            return false;
                        }
                    }
                    return iteVar2.f32069T;
                }
            });
        }
        ijp ijpVar = new ijp(iteVar, 12);
        ijp ijpVar2 = new ijp(iteVar, 13);
        iteVar.f32100e.m13537d(iteVar.f32103h.mo3830a(ijpVar, iteVar.f32118w));
        iteVar.f32100e.m13537d(iteVar.f32101f.mo3830a(ijpVar2, iteVar.f32118w));
        iteVar.f32100e.m13537d(iteVar.f32102g.mo3830a(ijpVar2, iteVar.f32118w));
        ZoomUi zoomUi2 = iteVar.f32064O;
        AnimatorListenerAdapter animatorListenerAdapter = iteVar.f32081ae;
        if (animatorListenerAdapter != null) {
            zoomUi2.f7408d.addListener(animatorListenerAdapter);
        }
        iteVar.f32061L.setOnSeekBarChangeListener(new ita(iteVar));
        iteVar.f32061L.setAccessibilityDelegate(new itb(iteVar));
        afq.m547g(iteVar.f32063N, new itc());
        if (iteVar.f32120y.mo16813g()) {
            ((hfd) iteVar.f32120y.mo16809c()).mo10168e(r2);
        }
        if (iteVar.f32074Y) {
            iteVar.f32062M.f7399u = new isz(iteVar);
        }
        iteVar.f32053D.mo5711f();
        if (iteVar.f32099d.mo6184l(dib.f11351ce)) {
            iteVar.f32100e.m13537d(iteVar.f32051B.mo3830a(new ijp(iteVar, 11), jvd.f34877a));
        }
        if (iteVar.f32108m) {
            iteVar.f32068S = false;
            iteVar.f32064O.m4575w(false);
            iteVar.f32054E.f32171G = false;
        }
        ((MainActivityLayout) ((jfs) ((djm) this.f31367b.get()).f11789c).m13100f(C0100R.id.activity_root_view)).m4463d(zoomUi, hzd.TO_LEFT);
    }
}
