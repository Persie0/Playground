package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.lightcycle.p012ui.PhotoSphereMessageOverlay;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exp implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: E */
    public eyi f20792E;

    /* JADX INFO: renamed from: F */
    public exm f20793F;

    /* JADX INFO: renamed from: H */
    public ewz f20795H;

    /* JADX INFO: renamed from: I */
    public ewz f20796I;

    /* JADX INFO: renamed from: J */
    private final exv f20797J;

    /* JADX INFO: renamed from: Z */
    private int f20813Z;

    /* JADX INFO: renamed from: a */
    public ewx f20814a;

    /* JADX INFO: renamed from: aa */
    private int f20815aa;

    /* JADX INFO: renamed from: ab */
    private int f20816ab;

    /* JADX INFO: renamed from: ac */
    private int f20817ac;

    /* JADX INFO: renamed from: ad */
    private boolean f20818ad;

    /* JADX INFO: renamed from: ai */
    private final ggm f20823ai;

    /* JADX INFO: renamed from: ak */
    private eyd f20825ak;

    /* JADX INFO: renamed from: al */
    private eyd f20826al;

    /* JADX INFO: renamed from: as */
    private final Context f20833as;

    /* JADX INFO: renamed from: c */
    public exu f20839c;

    /* JADX INFO: renamed from: d */
    public final exy f20840d;

    /* JADX INFO: renamed from: e */
    public final PhotoSphereMessageOverlay f20841e;

    /* JADX INFO: renamed from: f */
    public eww f20842f;

    /* JADX INFO: renamed from: g */
    public eww f20843g;

    /* JADX INFO: renamed from: h */
    public exw f20844h;

    /* JADX INFO: renamed from: i */
    public eyl f20845i;

    /* JADX INFO: renamed from: j */
    public exa f20846j;

    /* JADX INFO: renamed from: k */
    public eyj f20847k;

    /* JADX INFO: renamed from: o */
    public int f20851o;

    /* JADX INFO: renamed from: p */
    public int f20852p;

    /* JADX INFO: renamed from: b */
    public final exs f20838b = new exs();

    /* JADX INFO: renamed from: K */
    private final float[] f20798K = new float[16];

    /* JADX INFO: renamed from: L */
    private final float[] f20799L = new float[16];

    /* JADX INFO: renamed from: M */
    private final float[] f20800M = new float[16];

    /* JADX INFO: renamed from: N */
    private final float[] f20801N = new float[16];

    /* JADX INFO: renamed from: O */
    private final float[] f20802O = new float[16];

    /* JADX INFO: renamed from: P */
    private final float[] f20803P = new float[16];

    /* JADX INFO: renamed from: Q */
    private final float[] f20804Q = new float[16];

    /* JADX INFO: renamed from: R */
    private final float[] f20805R = new float[16];

    /* JADX INFO: renamed from: S */
    private float[] f20806S = new float[16];

    /* JADX INFO: renamed from: T */
    private float f20807T = 60.0f;

    /* JADX INFO: renamed from: U */
    private float f20808U = 100.0f;

    /* JADX INFO: renamed from: V */
    private float f20809V = 100.0f;

    /* JADX INFO: renamed from: W */
    private int f20810W = 120;

    /* JADX INFO: renamed from: X */
    private int f20811X = 80;

    /* JADX INFO: renamed from: l */
    public boolean f20848l = false;

    /* JADX INFO: renamed from: m */
    public boolean f20849m = false;

    /* JADX INFO: renamed from: Y */
    private boolean f20812Y = false;

    /* JADX INFO: renamed from: n */
    public boolean f20850n = true;

    /* JADX INFO: renamed from: ae */
    private boolean f20819ae = false;

    /* JADX INFO: renamed from: af */
    private int f20820af = 0;

    /* JADX INFO: renamed from: ag */
    private boolean f20821ag = false;

    /* JADX INFO: renamed from: q */
    public boolean f20853q = false;

    /* JADX INFO: renamed from: ah */
    private final ArrayList f20822ah = new ArrayList();

    /* JADX INFO: renamed from: r */
    public boolean f20854r = false;

    /* JADX INFO: renamed from: s */
    public boolean f20855s = false;

    /* JADX INFO: renamed from: t */
    public boolean f20856t = false;

    /* JADX INFO: renamed from: G */
    public int f20794G = 1;

    /* JADX INFO: renamed from: u */
    public boolean f20857u = false;

    /* JADX INFO: renamed from: aj */
    private boolean f20824aj = false;

    /* JADX INFO: renamed from: v */
    public boolean f20858v = false;

    /* JADX INFO: renamed from: w */
    public boolean f20859w = false;

    /* JADX INFO: renamed from: x */
    public int f20860x = C0100R.string.hit_target_to_start;

    /* JADX INFO: renamed from: aw */
    private final exe f20837aw = new exe();

    /* JADX INFO: renamed from: am */
    private boolean f20827am = false;

    /* JADX INFO: renamed from: an */
    private long f20828an = 0;

    /* JADX INFO: renamed from: ao */
    private boolean f20829ao = false;

    /* JADX INFO: renamed from: y */
    public exz f20861y = null;

    /* JADX INFO: renamed from: z */
    public boolean f20862z = false;

    /* JADX INFO: renamed from: A */
    public int f20788A = 0;

    /* JADX INFO: renamed from: B */
    public int f20789B = 0;

    /* JADX INFO: renamed from: C */
    public byte[] f20790C = null;

    /* JADX INFO: renamed from: D */
    public boolean f20791D = false;

    /* JADX INFO: renamed from: ap */
    private double f20830ap = 0.0d;

    /* JADX INFO: renamed from: aq */
    private double f20831aq = 0.0d;

    /* JADX INFO: renamed from: ar */
    private final Vector f20832ar = new Vector();

    /* JADX INFO: renamed from: at */
    private int f20834at = 0;

    /* JADX INFO: renamed from: au */
    private float f20835au = -1.0f;

    /* JADX INFO: renamed from: av */
    private final HashMap f20836av = new HashMap();

    public exp(Context context, exv exvVar, PhotoSphereMessageOverlay photoSphereMessageOverlay, ggm ggmVar) {
        this.f20833as = context;
        this.f20797J = exvVar;
        this.f20841e = photoSphereMessageOverlay;
        this.f20823ai = ggmVar;
        this.f20840d = new exy(context);
    }

    /* JADX INFO: renamed from: g */
    private final float m8011g(float f) {
        int i = this.f20816ab;
        if (i >= this.f20817ac) {
            return f;
        }
        double dTan = Math.tan(Math.toRadians(f) / 2.0d);
        double d = this.f20817ac;
        double d2 = i;
        Double.isNaN(d2);
        double d3 = d2 / (dTan + dTan);
        Double.isNaN(d);
        double dAtan = Math.atan(d / (d3 + d3));
        return (float) Math.toDegrees(dAtan + dAtan);
    }

    /* JADX INFO: renamed from: i */
    private final void m8013i() {
        this.f20839c.m8026b();
        this.f20839c.m8026b();
    }

    /* JADX INFO: renamed from: j */
    private static final int m8014j(int i, int i2) {
        return (i * 31) + i2;
    }

    /* JADX INFO: renamed from: k */
    private static final eyd m8015k(int i) {
        if (i == 2) {
            return new eyf(true);
        }
        if (i == 3) {
            return new eyf(false);
        }
        if (i == 1) {
            return new eye();
        }
        if (i == 5) {
            return new eyc();
        }
        if (i == 4) {
            return new eyg();
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    private static final float m8016l(float f, float f2) {
        double d = f;
        Double.isNaN(d);
        double d2 = f2;
        double dTan = Math.tan(((d * 0.5d) / 180.0d) * 3.141592653589793d);
        Double.isNaN(d2);
        return (float) (Math.atan(d2 * dTan) * 114.59155902616465d);
    }

    /* JADX INFO: renamed from: a */
    public final void m8017a(float f) {
        m8021e(f);
        this.f20807T = this.f20808U;
        this.f20848l = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m8018b() {
        m8017a(this.f20808U / this.f20807T);
    }

    /* JADX INFO: renamed from: c */
    public final void m8019c() {
        this.f20853q = false;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m8020d() {
        int iM8026b = this.f20839c.m8026b();
        exu exuVar = this.f20839c;
        synchronized (exuVar.f20890j) {
            if (!exuVar.f20890j.isEmpty()) {
                Vector vector = exuVar.f20890j;
                vector.removeElementAt(vector.size() - 1);
            }
        }
        while (this.f20832ar.size() > iM8026b) {
            Vector vector2 = this.f20832ar;
            vector2.removeElementAt(vector2.size() - 1);
        }
        if (this.f20832ar.size() == iM8026b) {
            double dDoubleValue = this.f20830ap - ((Double) this.f20832ar.lastElement()).doubleValue();
            this.f20830ap = dDoubleValue;
            this.f20831aq = dDoubleValue / 45.0d;
            Vector vector3 = this.f20832ar;
            vector3.removeElementAt(vector3.size() - 1);
        }
        m8013i();
        exo exoVar = new exo(this);
        exoVar.start();
        try {
            exoVar.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8021e(float f) {
        float f2 = this.f20807T / f;
        this.f20808U = f2;
        float fMin = Math.min(f2, this.f20810W);
        this.f20808U = fMin;
        float fMax = Math.max(fMin, this.f20811X);
        this.f20808U = fMax;
        this.f20809V = m8011g(fMax);
    }

    /* JADX WARN: Code duplicated, block: B:230:0x0842  */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) throws Throwable {
        boolean zBooleanValue;
        int i;
        if (!this.f20849m || this.f20855s || this.f20816ab == 0) {
            return;
        }
        GLES20.glClear(16384);
        if (!this.f20849m || this.f20855s) {
            return;
        }
        synchronized (exh.f20734a) {
            zBooleanValue = exh.f20735b.booleanValue();
        }
        if (zBooleanValue) {
            if (!this.f20819ae) {
                luc.m15984d();
                int iM15984d = luc.m15984d();
                LightCycleNative.InitFrameTexture(iM15984d, this.f20788A, this.f20789B);
                exs exsVar = this.f20838b;
                exsVar.f20700d.clear();
                luc lucVar = new luc(null, null);
                exsVar.f20873k.add(lucVar);
                exsVar.f20700d.add(0, lucVar);
                ((luc) exsVar.f20700d.get(0)).f39211a = iM15984d;
                this.f20819ae = true;
                int iM15983c = luc.m15983c();
                this.f20852p = iM15983c;
                LightCycleNative.InitFrameTexture(iM15983c, this.f20788A, this.f20789B);
                int iM15983c2 = luc.m15983c();
                this.f20851o = iM15983c2;
                LightCycleNative.InitFrameTexture(iM15983c2, this.f20788A, this.f20789B);
            }
            if (!this.f20853q && this.f20862z) {
                if (this.f20794G != 1 || this.f20857u) {
                    m8012h(false);
                } else {
                    m8012h(true);
                }
            }
            if (this.f20850n) {
                this.f20792E.m8043c(0.0d);
            } else {
                double d = this.f20830ap;
                if (d != 0.0d) {
                    double dAbs = Math.abs(d);
                    double dAbs2 = Math.abs(this.f20831aq);
                    if (dAbs < dAbs2 + dAbs2) {
                        eyi eyiVar = this.f20792E;
                        eyiVar.m8043c(eyiVar.m8041a() + this.f20830ap);
                        this.f20830ap = 0.0d;
                    } else {
                        eyi eyiVar2 = this.f20792E;
                        eyiVar2.m8043c(eyiVar2.m8041a() + this.f20831aq);
                        this.f20830ap -= this.f20831aq;
                    }
                }
            }
            float[] fArrM8046f = this.f20792E.m8046f();
            this.f20806S = fArrM8046f;
            LightCycleNative.SetFilteredRotation(fArrM8046f);
            if (this.f20791D) {
                LightCycleNative.UpdateFrameTexture(this.f20852p);
            }
            if (this.f20820af > 0) {
                int i2 = this.f20852p;
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                float f = this.f20816ab;
                float f2 = this.f20817ac;
                float f3 = this.f20809V;
                double dM7980a = this.f20837aw.m7980a();
                if (this.f20794G != 1) {
                    if (this.f20824aj) {
                        double d2 = this.f20809V;
                        Double.isNaN(d2);
                        f3 = (float) (d2 + (dM7980a * 18.0d));
                    } else {
                        double d3 = this.f20809V;
                        Double.isNaN(d3);
                        f3 = (float) (d3 + ((1.0d - dM7980a) * 18.0d));
                    }
                }
                float f4 = f / f2;
                double d4 = f3;
                Double.isNaN(d4);
                float fTan = ((float) Math.tan((d4 / 360.0d) * 3.141592653589793d)) * 0.1f;
                float f5 = fTan * f4;
                Matrix.frustumM(this.f20800M, 0, -f5, f5, -fTan, fTan, 0.1f, 200.0f);
                Matrix.setIdentityM(this.f20801N, 0);
                Matrix.rotateM(this.f20801N, 0, this.f20823ai.mo9216f().m13893a() - this.f20792E.f20974k, 0.0f, 0.0f, 1.0f);
                Matrix.multiplyMM(this.f20798K, 0, this.f20800M, 0, this.f20801N, 0);
                if (!this.f20812Y) {
                    Matrix.orthoM(this.f20803P, 0, 0.0f, this.f20816ab, 0.0f, this.f20817ac, -50.0f, 50.0f);
                    Integer numValueOf = Integer.valueOf(m8014j(this.f20816ab, this.f20817ac));
                    exw exwVar = (exw) this.f20836av.get(numValueOf);
                    if (exwVar != null) {
                        this.f20844h = exwVar;
                    } else {
                        exw exwVar2 = new exw(this.f20833as, this.f20792E, this.f20816ab, this.f20817ac);
                        this.f20844h = exwVar2;
                        this.f20836av.put(numValueOf, exwVar2);
                        this.f20836av.put(Integer.valueOf(m8014j(this.f20817ac, this.f20816ab)), new exw(this.f20833as, this.f20792E, this.f20817ac, this.f20816ab));
                    }
                    exy exyVar = this.f20840d;
                    int i3 = this.f20816ab;
                    int i4 = this.f20817ac;
                    exw exwVar3 = this.f20844h;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = false;
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(exyVar.f20909c.getResources(), C0100R.drawable.pano_target_default, options);
                    if (bitmapDecodeResource != null) {
                        bitmapDecodeResource.recycle();
                    }
                    exyVar.f20911e = new exb();
                    exyVar.f20911e.m7976g(exyVar.f20909c, C0100R.drawable.pano_target_default, -1.0f);
                    exyVar.f20912f = new exb();
                    exyVar.f20912f.m7976g(exyVar.f20909c, C0100R.drawable.pano_target_activated, -1.0f);
                    try {
                        exyVar.f20913g = new eyk();
                        exyVar.f20914h = new eyj();
                    } catch (ewy e) {
                        e.printStackTrace();
                    }
                    exb exbVar = exyVar.f20911e;
                    eyk eykVar = exyVar.f20913g;
                    exbVar.f20701e = eykVar;
                    exyVar.f20912f.f20701e = eykVar;
                    exyVar.f20919m = i3 / 2.0f;
                    exyVar.f20920n = i4 / 2.0f;
                    Matrix.setIdentityM(exyVar.f20929w, 0);
                    exyVar.f20930x = exwVar3;
                    this.f20840d.f20923q = this.f20792E;
                    Context context = this.f20833as;
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inScaled = false;
                    options2.inJustDecodeBounds = true;
                    BitmapFactory.decodeResource(context.getResources(), C0100R.drawable.focus_quadrant_1, options2);
                    float fM2810a = new bon(options2.outWidth, options2.outHeight).m2810a();
                    int i5 = this.f20817ac / 2;
                    int i6 = (int) (fM2810a * 0.85f);
                    float f6 = this.f20816ab / 2;
                    PointF pointF = new PointF(f6, i5 + i6);
                    PointF pointF2 = new PointF(f6, i5 - i6);
                    this.f20842f = new eww();
                    this.f20843g = new eww();
                    this.f20842f.m7976g(this.f20833as, C0100R.drawable.pano_alignhint_up, -1.0f);
                    this.f20843g.m7976g(this.f20833as, C0100R.drawable.pano_alignhint_down, -1.0f);
                    this.f20842f.m7960b(pointF);
                    this.f20843g.m7960b(pointF2);
                    try {
                        this.f20847k = new eyj();
                    } catch (ewy e2) {
                        e2.printStackTrace();
                    }
                    eww ewwVar = this.f20842f;
                    eyj eyjVar = this.f20847k;
                    ewwVar.f20701e = eyjVar;
                    this.f20843g.f20701e = eyjVar;
                    this.f20812Y = true;
                }
                exs exsVar2 = this.f20838b;
                exsVar2.f20874l = true;
                if (this.f20791D) {
                    exsVar2.f20875m = true;
                } else {
                    exsVar2.f20875m = false;
                }
                boolean z = this.f20834at > 3;
                boolean z2 = this.f20839c.m8026b() == 0 && z;
                this.f20791D = z2;
                if (!z2) {
                    this.f20838b.f20875m = false;
                }
                exs exsVar3 = this.f20838b;
                exsVar3.f20874l = z;
                exsVar3.m8025e(i2);
                exv exvVar = this.f20797J;
                boolean z3 = this.f20839c.m8026b() > 0 && !this.f20793F.f20744A.f20730b;
                if (z3 != exvVar.f20895a) {
                    exvVar.f20895a = z3;
                }
                GLES20.glViewport(0, 0, this.f20813Z, this.f20815aa);
                GLES20.glClear(256);
                GLES20.glEnable(2929);
                try {
                    Matrix.multiplyMM(this.f20802O, 0, this.f20801N, 0, this.f20806S, 0);
                    Matrix.multiplyMM(this.f20798K, 0, this.f20800M, 0, this.f20802O, 0);
                    GLES20.glLineWidth(2.0f);
                    this.f20814a.mo7961c(this.f20798K);
                    GLES20.glDisable(2929);
                    GLES20.glEnable(3042);
                    this.f20839c.mo7959a(this.f20798K);
                    Matrix.setIdentityM(this.f20801N, 0);
                    Matrix.rotateM(this.f20801N, 0, this.f20823ai.mo9216f().m13893a() - this.f20792E.f20974k, 0.0f, 0.0f, 1.0f);
                    Matrix.rotateM(this.f20801N, 0, 180.0f, 1.0f, 0.0f, 0.0f);
                    Matrix.multiplyMM(this.f20799L, 0, this.f20800M, 0, this.f20801N, 0);
                    this.f20846j.m7973j(ews.f20685c);
                    if ((!this.f20848l && this.f20818ad) || this.f20850n) {
                        this.f20845i.m7968c();
                        this.f20845i.m8049j(1.0f);
                        this.f20838b.mo7959a(this.f20799L);
                    }
                    exy exyVar2 = this.f20840d;
                    exyVar2.f20918l = this.f20806S;
                    float[] fArr = this.f20798K;
                    float[] fArr2 = this.f20803P;
                    int iGetTargetInRange = LightCycleNative.GetTargetInRange();
                    if (iGetTargetInRange >= 0) {
                        float f7 = exyVar2.f20921o;
                        exyVar2.f20921o = f7 + ((1.0f - f7) * 0.1f);
                    } else {
                        exyVar2.f20921o = 0.0f;
                    }
                    float fMax = ((Math.max(Math.min((float) Math.sqrt(exyVar2.f20923q.f20976m), 0.6981317f), 0.17453292f) - 0.17453292f) / 0.5235988f) * 0.75f;
                    synchronized (exh.f20734a) {
                        if (!exh.f20735b.booleanValue()) {
                            throw new IllegalStateException("State is not ready.");
                        }
                        LightCycleNative.SetTargetHitAngleRadians((fMax + 2.75f) * 0.017453292f);
                    }
                    float[] fArr3 = exyVar2.f20918l;
                    inh inhVar = new inh(-fArr3[2], -fArr3[6], -fArr3[10]);
                    GLES20.glBlendFunc(1, 771);
                    exyVar2.f20913g.m7968c();
                    GLES20.glUniform1f(exyVar2.f20913g.f20983e, 1.0f);
                    exyVar2.f20913g.m8048j(1.0f);
                    try {
                        Map map = exyVar2.f20910d;
                        synchronized (map) {
                            try {
                                for (Map.Entry entry : exyVar2.f20910d.entrySet()) {
                                    float[] fArr4 = (float[]) entry.getValue();
                                    inhVar = inhVar;
                                    map = map;
                                    iGetTargetInRange = iGetTargetInRange;
                                    float[] fArr5 = fArr2;
                                    try {
                                        Matrix.multiplyMM(exyVar2.f20917k, 0, fArr, 0, fArr4, 0);
                                        Matrix.multiplyMV(exyVar2.f20916j, 0, exyVar2.f20917k, 0, exyVar2.f20915i, 0);
                                        exx exxVar = exyVar2.f20924r;
                                        inh inhVar2 = new inh(-fArr4[8], -fArr4[9], -fArr4[10]);
                                        float fAcos = (float) Math.acos((inhVar2.f31591a * inhVar.f31591a) + (inhVar2.f31592b * inhVar.f31592b) + (inhVar2.f31593c * inhVar.f31593c));
                                        float f8 = exy.f20908b;
                                        if (fAcos < f8) {
                                            exxVar.f20905a = 1.0f;
                                            exxVar.f20906b = 1.0f;
                                        } else {
                                            float f9 = exy.f20907a;
                                            if (fAcos < f9) {
                                                float f10 = 1.0f - ((fAcos - f8) / (f9 - f8));
                                                exxVar.f20905a = f10 + 0.0f;
                                                exxVar.f20906b = (f10 * 0.6f) + 0.4f;
                                            } else {
                                                exxVar.f20905a = 0.0f;
                                                exxVar.f20906b = 0.4f;
                                            }
                                        }
                                        float fMax2 = !exyVar2.f20922p ? exyVar2.f20924r.f20905a : 1.0f;
                                        float f11 = exyVar2.f20924r.f20906b;
                                        if (exyVar2.f20910d.size() == 1) {
                                            fMax2 = Math.max(0.75f, fMax2);
                                            f11 = 1.0f;
                                        } else if (exyVar2.f20925s && !exyVar2.f20922p) {
                                            fMax2 = Math.max(exyVar2.f20927u, fMax2);
                                            if (exyVar2.f20926t) {
                                                float f12 = exyVar2.f20927u;
                                                float f13 = f12 + ((1.0f - f12) * 0.01f);
                                                exyVar2.f20927u = f13;
                                                if (f13 > 0.9f) {
                                                    if (exyVar2.f20928v == 0) {
                                                        exyVar2.f20928v = SystemClock.elapsedRealtimeNanos();
                                                    } else {
                                                        double dElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - exyVar2.f20928v;
                                                        Double.isNaN(dElapsedRealtimeNanos);
                                                        if (dElapsedRealtimeNanos / 1.0E9d > 0.5d) {
                                                            exyVar2.f20926t = false;
                                                        }
                                                        exyVar2.f20927u = 0.9f;
                                                    }
                                                }
                                            } else {
                                                exyVar2.f20927u *= 0.985f;
                                            }
                                            if (exyVar2.f20927u < 0.01f) {
                                                exyVar2.f20927u = 0.0f;
                                                exyVar2.f20925s = false;
                                            }
                                        }
                                        float[] fArr6 = exyVar2.f20916j;
                                        if (fArr6[3] >= 0.0f) {
                                            exy.m8029c(fArr6);
                                            float[] fArr7 = exyVar2.f20916j;
                                            float f14 = fArr7[0];
                                            float f15 = exyVar2.f20919m;
                                            float f16 = (f14 * f15) + f15;
                                            float f17 = fArr7[1];
                                            float f18 = exyVar2.f20920n;
                                            float f19 = (f17 * f18) + f18;
                                            if (((Integer) entry.getKey()).intValue() == iGetTargetInRange) {
                                                exyVar2.f20913g.m8048j(fMax2);
                                                exyVar2.f20912f.m7975f(fArr5, f16, f19, f11);
                                                exyVar2.f20913g.m8048j(1.0f - fMax2);
                                                exyVar2.f20911e.m7975f(fArr5, f16, f19, f11);
                                                exyVar2.f20913g.m8048j(1.0f);
                                                fArr2 = fArr5;
                                            } else {
                                                exyVar2.f20913g.m8048j(fMax2);
                                                exyVar2.f20911e.m7975f(fArr5, f16, f19, f11);
                                                fArr2 = fArr5;
                                            }
                                        } else {
                                            fArr2 = fArr5;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                                float[] fArr8 = fArr2;
                                exw exwVar4 = exyVar2.f20930x;
                                if (exwVar4 != null && exwVar4.f20904i) {
                                    if (exwVar4.f20902g) {
                                        double dElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - exwVar4.f20898c;
                                        Double.isNaN(dElapsedRealtimeNanos2);
                                        int i7 = ((int) (((long) ((int) (dElapsedRealtimeNanos2 / 1000000.0d))) / 400)) + 1;
                                        exwVar4.f20901f = i7;
                                        if (i7 >= exwVar4.f20896a.size() - 1) {
                                            exwVar4.f20902g = false;
                                            exwVar4.f20903h = true;
                                            double dElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos() - exwVar4.f20898c;
                                            Double.isNaN(dElapsedRealtimeNanos3);
                                            int i8 = (int) (dElapsedRealtimeNanos3 / 1000000.0d);
                                            eyi eyiVar3 = exwVar4.f20897b;
                                            float[] fArrEndGyroCalibration = LightCycleNative.EndGyroCalibration(eyiVar3.m8045e(), eyiVar3.f20972i, i8);
                                            float f20 = fArrEndGyroCalibration[0];
                                            float f21 = fArrEndGyroCalibration[1];
                                            float f22 = fArrEndGyroCalibration[2];
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Bias : ");
                                            sb.append(f20);
                                            sb.append(", ");
                                            sb.append(f21);
                                            sb.append(", ");
                                            sb.append(f22);
                                            exwVar4.f20901f = exwVar4.f20896a.size() - 1;
                                        }
                                    }
                                    GLES20.glEnable(3042);
                                    exwVar4.f20899d.m7968c();
                                    if (exwVar4.f20902g) {
                                        GLES20.glBlendFunc(1, 771);
                                        exwVar4.f20899d.m8047j(1.2f);
                                    } else {
                                        GLES20.glBlendFunc(770, 771);
                                        exwVar4.f20899d.m8047j(0.5f);
                                    }
                                    exb exbVar2 = (exb) exwVar4.f20896a.get(exwVar4.f20901f);
                                    float f23 = exwVar4.f20900e.x;
                                    float f24 = exwVar4.f20900e.y;
                                    if (exbVar2.f20717l) {
                                        ewz ewzVar = exbVar2.f20701e;
                                        if (ewzVar != null) {
                                            ewzVar.m7968c();
                                            exbVar2.f20697a.position(0);
                                            exbVar2.f20698b.position(0);
                                            exbVar2.f20701e.m7972g(exbVar2.f20697a);
                                            exbVar2.f20701e.m7970e(exbVar2.f20698b);
                                            Matrix.translateM(exbVar2.f20715j, 0, fArr8, 0, f23 + exbVar2.f20713h, f24 + exbVar2.f20714i, 0.0f);
                                            Matrix.rotateM(exbVar2.f20715j, 0, 0.0f, 0.0f, 0.0f, 1.0f);
                                            exbVar2.f20701e.m7971f(exbVar2.f20715j);
                                            if (!exbVar2.f20700d.isEmpty()) {
                                                luc lucVar2 = (luc) exbVar2.f20700d.get(0);
                                                ewz ewzVar2 = exbVar2.f20701e;
                                                lucVar2.m15988f();
                                                exbVar2.f20699c.position(0);
                                                GLES20.glDrawElements(4, exbVar2.f20716k, 5123, exbVar2.f20699c);
                                            }
                                        }
                                    } else {
                                        ((nbe) ((nbe) exb.f20711f.m17251b()).mo17276G((char) 2030)).mo17290o("Sprite not initialized.");
                                    }
                                }
                                GLES20.glBlendFunc(770, 771);
                                if (this.f20794G != 1 && !this.f20857u) {
                                    double dM7980a2 = this.f20837aw.m7980a();
                                    Matrix.multiplyMM(this.f20799L, 0, this.f20800M, 0, this.f20801N, 0);
                                    if (this.f20824aj) {
                                        this.f20825ak.mo8040a(1.0f - ((float) dM7980a2), this.f20840d, this.f20803P, this.f20816ab, this.f20817ac);
                                        exe exeVar = this.f20837aw;
                                        if (exeVar.f20726a) {
                                            exeVar.m7981b();
                                            this.f20824aj = false;
                                        }
                                    } else {
                                        this.f20826al.mo8040a((float) dM7980a2, this.f20840d, this.f20803P, this.f20816ab, this.f20817ac);
                                    }
                                }
                                GLES20.glDisable(3042);
                                GLES20.glDisable(2929);
                                GLES20.glBlendFunc(770, 771);
                                GLES20.glDisable(2929);
                                GLES20.glEnable(3042);
                                int iM8000a = exh.m8000a();
                                if (iM8000a == 0) {
                                    if (!this.f20829ao && LightCycleNative.PhotoSkippedTooFast()) {
                                        this.f20829ao = true;
                                        this.f20827am = false;
                                    }
                                    if (this.f20829ao && !LightCycleNative.PhotoSkippedTooFast()) {
                                        this.f20829ao = false;
                                        this.f20827am = true;
                                        this.f20828an = SystemClock.elapsedRealtimeNanos();
                                    }
                                    if (this.f20827am) {
                                        double dElapsedRealtimeNanos4 = SystemClock.elapsedRealtimeNanos() - this.f20828an;
                                        Double.isNaN(dElapsedRealtimeNanos4);
                                        if (dElapsedRealtimeNanos4 / 1.0E9d > 0.25d) {
                                            this.f20827am = false;
                                            PhotoSphereMessageOverlay photoSphereMessageOverlay = this.f20841e;
                                            TextView textView = (TextView) photoSphereMessageOverlay.findViewById(C0100R.id.short_info_message);
                                            photoSphereMessageOverlay.m4203c(C0100R.string.too_fast);
                                            photoSphereMessageOverlay.postDelayed(new evu(textView, 5), 750L);
                                            i = 0;
                                        } else {
                                            i = 0;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                } else {
                                    i = iM8000a;
                                }
                                int i9 = this.f20794G;
                                boolean z4 = i9 == 2 || i9 == 3 || i9 == 4;
                                if (this.f20850n && !z4) {
                                    float[] fArr9 = this.f20803P;
                                    float f25 = -this.f20792E.m8046f()[6];
                                    GLES20.glEnable(3042);
                                    if (f25 > 0.34906584f) {
                                        try {
                                            this.f20847k.m7968c();
                                            this.f20847k.m8047j(0.5f);
                                            this.f20843g.mo7959a(fArr9);
                                        } catch (ewy e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    if (f25 < -0.34906584f) {
                                        this.f20847k.m7968c();
                                        this.f20847k.m8047j(0.5f);
                                        this.f20842f.mo7959a(fArr9);
                                    }
                                }
                                if (i != 0) {
                                    boolean z5 = i == -1;
                                    PhotoSphereMessageOverlay photoSphereMessageOverlay2 = this.f20841e;
                                    photoSphereMessageOverlay2.post(new bnp(photoSphereMessageOverlay2, z5, 12));
                                } else {
                                    PhotoSphereMessageOverlay photoSphereMessageOverlay3 = this.f20841e;
                                    photoSphereMessageOverlay3.post(new evu(photoSphereMessageOverlay3, 6));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                map = map;
                            }
                        }
                    } catch (ewy e4) {
                        e4.printStackTrace();
                    }
                } catch (ewy e5) {
                    e5.printStackTrace();
                }
            }
            int i10 = this.f20852p;
            this.f20852p = this.f20851o;
            this.f20851o = i10;
            this.f20820af++;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        if (i == this.f20816ab && i2 == this.f20817ac) {
            return;
        }
        this.f20816ab = i;
        this.f20817ac = i2;
        this.f20813Z = i;
        this.f20815aa = i2;
        this.f20812Y = false;
        this.f20862z = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            float fM8003a = this.f20835au;
            if (fM8003a < 0.0f) {
                fM8003a = this.f20793F.m8003a();
                this.f20835au = fM8003a;
            }
            this.f20808U = m8016l(fM8003a, 1.7f);
            this.f20810W = (int) m8016l(this.f20835au, 2.5f);
            this.f20811X = (int) m8016l(this.f20835au, 1.1f);
            float f = this.f20808U;
            this.f20807T = f;
            this.f20809V = m8011g(f);
            this.f20795H = new ewz((byte[]) null);
            this.f20846j = new exa();
            this.f20796I = new ewz((char[]) null);
            this.f20845i = new eyl();
            this.f20846j.m7973j(ews.f20683a);
            this.f20839c = new exu(this.f20838b);
            new BitmapFactory.Options().inScaled = false;
            this.f20814a = new exq();
            exs exsVar = this.f20838b;
            exsVar.f20701e = this.f20845i;
            exsVar.f20872j = this.f20846j;
            if (this.f20791D) {
                exsVar.f20875m = true;
                exsVar.f20874l = true;
            }
            Matrix.setIdentityM(this.f20804Q, 0);
            float[] fArr = this.f20804Q;
            fArr[0] = 0.0f;
            fArr[1] = -1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            Matrix.setIdentityM(this.f20806S, 0);
            float[] fArr2 = ews.f20684b;
            GLES20.glClearColor(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
            this.f20849m = true;
            if (this.f20859w) {
                this.f20841e.m4204d(true, 0);
            }
            Matrix.setIdentityM(this.f20805R, 0);
        } catch (ewy e) {
            e.printStackTrace();
        }
        this.f20862z = false;
    }

    /* JADX INFO: renamed from: f */
    public final void m8022f(int i) {
        int i2 = this.f20794G;
        this.f20794G = i;
        this.f20859w = false;
        this.f20860x = C0100R.string.hit_target_to_start;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 1:
                this.f20860x = C0100R.string.tap_to_start;
                this.f20841e.m4201a();
                this.f20840d.m8035e(1);
                this.f20824aj = true;
                this.f20837aw.m7981b();
                break;
            case 2:
                this.f20860x = C0100R.string.tap_to_start;
                this.f20841e.m4201a();
                this.f20840d.m8035e(2);
                this.f20824aj = true;
                this.f20837aw.m7981b();
                break;
            case 3:
                this.f20860x = C0100R.string.tap_to_start;
                this.f20841e.m4201a();
                this.f20840d.m8035e(3);
                this.f20824aj = true;
                this.f20837aw.m7981b();
                break;
            case 4:
                this.f20841e.m4201a();
                this.f20840d.m8035e(4);
                this.f20824aj = true;
                this.f20837aw.m7981b();
                break;
            case 5:
                this.f20841e.m4204d(false, this.f20793F.f20772n);
                this.f20859w = true;
                break;
            default:
                this.f20840d.m8035e(0);
                break;
        }
        this.f20825ak = m8015k(i2);
        this.f20826al = m8015k(i);
    }

    /* JADX INFO: renamed from: h */
    private final synchronized void m8012h(boolean z) {
        float[] fArrProcessFrame;
        exw exwVar;
        String strAddImage;
        exw exwVar2 = this.f20844h;
        if (exwVar2 != null && this.f20849m) {
            exz exzVar = this.f20861y;
            byte[] bArr = this.f20790C;
            int i = this.f20788A;
            int i2 = this.f20789B;
            boolean z2 = exwVar2.f20903h && this.f20793F.f20777s;
            if (bArr != null) {
                synchronized (exh.f20734a) {
                    if (!exh.f20735b.booleanValue()) {
                        throw new IllegalStateException("State is not ready.");
                    }
                    fArrProcessFrame = LightCycleNative.ProcessFrame(bArr, i, i2, z2);
                }
                exzVar.f20933c = fArrProcessFrame;
                exzVar.f20931a = ((float[]) exzVar.f20933c)[0] != -1.0f;
                exzVar.f20932b = LightCycleNative.TakeNewPhoto();
            }
            this.f20834at++;
            if (!z) {
                boolean z3 = this.f20861y.f20931a;
                this.f20818ad = z3;
                Object obj = exh.f20734a;
                this.f20821ag = LightCycleNative.MovingTooFast();
                exz exzVar2 = this.f20861y;
                if (exzVar2.f20932b && z3 && !this.f20856t) {
                    Object obj2 = exzVar2.f20933c;
                    exu exuVar = this.f20839c;
                    ext extVar = new ext();
                    extVar.f20877b = (float[]) ((float[]) obj2).clone();
                    float[] fArr = extVar.f20877b;
                    float[] fArr2 = extVar.f20876a;
                    float[] fArr3 = exuVar.f20887g;
                    fArr3[0] = fArr[0];
                    fArr3[1] = fArr[1];
                    fArr3[2] = fArr[2];
                    fArr3[3] = 0.0f;
                    fArr3[4] = fArr[3];
                    fArr3[5] = fArr[4];
                    fArr3[6] = fArr[5];
                    fArr3[7] = 0.0f;
                    fArr3[8] = fArr[6];
                    fArr3[9] = fArr[7];
                    fArr3[10] = fArr[8];
                    fArr3[14] = 0.0f;
                    fArr3[13] = 0.0f;
                    fArr3[12] = 0.0f;
                    fArr3[11] = 0.0f;
                    fArr3[15] = 1.0f;
                    Matrix.multiplyMM(exuVar.f20886f, 0, exuVar.f20888h, 0, fArr3, 0);
                    Matrix.transposeM(fArr2, 0, exuVar.f20886f, 0);
                    extVar.f20880e = 0.1f;
                    extVar.f20884i = new luc(null, null, null);
                    LightCycleNative.CreateFrameTexture(extVar.f20884i.f39211a);
                    extVar.f20885j = new luc(null, null, null);
                    exuVar.f20890j.add(extVar);
                    int i3 = extVar.f20885j.f39211a;
                    synchronized (exh.f20734a) {
                        if (!exh.f20735b.booleanValue()) {
                            throw new IllegalStateException(hsSUWRJfoeC.NuCXcsLSnNR);
                        }
                        strAddImage = LightCycleNative.AddImage((float[]) obj2);
                    }
                    int iM8026b = this.f20839c.m8026b() - 1;
                    exm exmVar = this.f20793F;
                    if (!exmVar.f20776r && exmVar.f20777s) {
                        exmVar.f20748E.add(strAddImage);
                        exmVar.f20776r = true;
                        new exi(exmVar).execute(new Void[0]);
                        exmVar.f20747D.add(obj2);
                        Vector vector = exmVar.f20771m;
                        vector.setSize(Math.max(iM8026b + 1, vector.size()));
                        exmVar.f20771m.set(iM8026b, Integer.valueOf(i3));
                    }
                    this.f20839c.m8027e(iM8026b, false);
                    this.f20822ah.add(Integer.valueOf(iM8026b));
                    this.f20853q = true;
                    m8013i();
                    this.f20850n = false;
                    this.f20841e.m4201a();
                    this.f20829ao = false;
                    this.f20827am = false;
                }
                if (this.f20854r) {
                    if (!this.f20822ah.isEmpty()) {
                        int iIntValue = ((Integer) this.f20822ah.get(0)).intValue();
                        this.f20822ah.remove(0);
                        this.f20839c.m8027e(iIntValue, true);
                    }
                    this.f20840d.m8032a();
                    this.f20841e.m4204d(this.f20859w, this.f20793F.f20772n);
                    this.f20854r = false;
                }
                if (!this.f20844h.f20903h) {
                    boolean zTargetHit = LightCycleNative.TargetHit();
                    int iM8000a = exh.m8000a();
                    if (this.f20858v || this.f20844h.f20902g || !zTargetHit || iM8000a != 0) {
                        exwVar = this.f20844h;
                        if (exwVar.f20902g && (!zTargetHit || this.f20821ag || iM8000a != 0)) {
                            exwVar.m8028a();
                        }
                    } else {
                        exm exmVar2 = this.f20793F;
                        if (exmVar2.f20777s) {
                            this.f20858v = true;
                            ewt ewtVar = exmVar2.f20761c;
                            exn exnVar = new exn(this, 0);
                            if (ewtVar.f20690d) {
                                boi boiVarMo2721f = ewtVar.f20688b.mo2721f();
                                boiVarMo2721f.f4002s = bny.AUTO;
                                ewtVar.f20688b.mo2728m(boiVarMo2721f);
                                ewtVar.f20688b.mo2725j(ewtVar.f20687a, exnVar);
                            } else {
                                exnVar.mo2767a(true, null);
                            }
                        } else {
                            iM8000a = 0;
                            exwVar = this.f20844h;
                            if (exwVar.f20902g) {
                                exwVar.m8028a();
                            }
                        }
                    }
                    if (this.f20856t) {
                        this.f20844h.m8028a();
                    }
                }
                this.f20862z = false;
            }
        }
    }
}
