package p000;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqh {

    /* JADX INFO: renamed from: a */
    static final float f31770a = ill.m11431b(80.0f);

    /* JADX INFO: renamed from: b */
    public static boolean f31771b = false;

    /* JADX INFO: renamed from: c */
    public final GestureDetector f31772c;

    /* JADX INFO: renamed from: d */
    public final ScaleGestureDetector f31773d;

    /* JADX INFO: renamed from: e */
    public final iqa f31774e;

    /* JADX INFO: renamed from: f */
    public final iqd f31775f;

    /* JADX INFO: renamed from: g */
    public final mtz f31776g;

    /* JADX INFO: renamed from: h */
    public final jwn f31777h;

    /* JADX INFO: renamed from: i */
    public final View f31778i;

    /* JADX INFO: renamed from: j */
    public final dhv f31779j;

    /* JADX INFO: renamed from: k */
    public boolean f31780k;

    /* JADX INFO: renamed from: l */
    public boolean f31781l;

    /* JADX INFO: renamed from: m */
    public float f31782m;

    /* JADX INFO: renamed from: n */
    public float f31783n;

    /* JADX INFO: renamed from: o */
    public int f31784o;

    /* JADX INFO: renamed from: p */
    public final eop f31785p;

    /* JADX INFO: renamed from: q */
    public int f31786q;

    /* JADX INFO: renamed from: r */
    public final iki f31787r;

    /* JADX INFO: renamed from: s */
    public final ikj f31788s;

    /* JADX INFO: renamed from: t */
    public final jfo f31789t;

    /* JADX INFO: renamed from: u */
    public final AmbientModeSupport.AmbientController f31790u;

    /* JADX INFO: renamed from: v */
    private final GestureDetector.OnGestureListener f31791v;

    public iqh(jfo jfoVar, iki ikiVar, ikj ikjVar, iqa iqaVar, iqd iqdVar, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, jfo jfoVar2, AmbientModeSupport.AmbientController ambientController, jwn jwnVar, View view, Context context, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        iqf iqfVar = new iqf(this);
        this.f31791v = iqfVar;
        this.f31785p = new iqg(this);
        this.f31772c = new GestureDetector((Context) jfoVar.f33910a, iqfVar, (Handler) jfoVar.f33911b);
        iqe iqeVar = new iqe(this, onScaleGestureListener, iqaVar);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector((Context) jfoVar.f33910a, iqeVar, (Handler) jfoVar.f33911b);
        this.f31773d = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f31787r = ikiVar;
        this.f31788s = ikjVar;
        iqaVar.getClass();
        this.f31774e = iqaVar;
        this.f31775f = iqdVar;
        this.f31789t = jfoVar2;
        this.f31790u = ambientController;
        this.f31786q = 1;
        this.f31776g = mwh.m17062b(ipx.ZOOM, context.getResources().getString(C0100R.string.preference_double_tap_zoom), ipx.SWITCH_CAMERA, context.getResources().getString(C0100R.string.preference_double_tap_switch_camera), ipx.NONE, context.getResources().getString(C0100R.string.preference_double_tap_none));
        this.f31779j = dhvVar;
        this.f31777h = jwnVar;
        this.f31778i = view;
    }

    /* JADX INFO: renamed from: c */
    public static void m11599c() {
        f31771b = false;
    }

    /* JADX INFO: renamed from: d */
    public static void m11600d() {
        f31771b = true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11601e(float f) {
        return Math.abs(f) > f31770a;
    }

    /* JADX INFO: renamed from: a */
    public final PointF m11602a(MotionEvent motionEvent) {
        return new ihk(motionEvent, this.f31778i).m11339d();
    }

    /* JADX INFO: renamed from: b */
    public final ipz m11603b() {
        int i = this.f31786q;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
                return this.f31787r;
            case 2:
                return this.f31788s;
            default:
                return ipz.f31764A;
        }
    }
}
