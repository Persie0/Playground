package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.vision.opengl.Texture;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ejt implements ejc {

    /* JADX INFO: renamed from: l */
    private final eii f14378l;

    /* JADX INFO: renamed from: m */
    private final elp f14379m;

    /* JADX INFO: renamed from: n */
    private final elp f14380n;

    /* JADX INFO: renamed from: o */
    private final Map f14381o;

    /* JADX INFO: renamed from: p */
    private final float[] f14382p;

    /* JADX INFO: renamed from: q */
    private elt f14383q;

    /* JADX INFO: renamed from: r */
    private elr f14384r;

    /* JADX INFO: renamed from: s */
    private final ejd f14385s;

    /* JADX INFO: renamed from: t */
    private final eim f14386t;

    /* JADX INFO: renamed from: u */
    private final eiw f14387u;

    /* JADX INFO: renamed from: v */
    private final Context f14388v;

    /* JADX INFO: renamed from: a */
    private final ejp[] f14367a = new ejp[4];

    /* JADX INFO: renamed from: w */
    private final C0274ir f14389w = new C0274ir();

    /* JADX INFO: renamed from: b */
    private final ejr f14368b = new ejr();

    /* JADX INFO: renamed from: c */
    private final float[] f14369c = {0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.3f};

    /* JADX INFO: renamed from: d */
    private ejs f14370d = ejs.IDLE;

    /* JADX INFO: renamed from: e */
    private ejs f14371e = ejs.IDLE;

    /* JADX INFO: renamed from: f */
    private boolean f14372f = false;

    /* JADX INFO: renamed from: g */
    private float f14373g = 1.0f;

    /* JADX INFO: renamed from: h */
    private float f14374h = 1.0f;

    /* JADX INFO: renamed from: i */
    private final float[] f14375i = {1.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: j */
    private final float[] f14376j = {1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k */
    private boolean f14377k = false;

    public ejt(ejd ejdVar, eim eimVar, eiw eiwVar, Context context) {
        EnumMap enumMap = new EnumMap(eiv.class);
        this.f14381o = enumMap;
        this.f14382p = new float[16];
        this.f14385s = ejdVar;
        this.f14386t = eimVar;
        this.f14387u = eiwVar;
        this.f14388v = context;
        enumMap.put(eiv.WHITE, Float.valueOf(25.0f));
        enumMap.put(eiv.RED, Float.valueOf(35.0f));
        this.f14378l = new eii();
        this.f14379m = new elp(ejs.IDLE);
        this.f14380n = new elp(ejq.WHITE);
        this.f14383q = new elt();
        this.f14384r = new elr();
    }

    /* JADX INFO: renamed from: d */
    private final void m7399d(ejs ejsVar, float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        String str;
        float f7 = f;
        float f8 = f2;
        if (ejsVar == ejs.SHOW_WARNING_VELOCITY) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            float[] fArr = this.f14369c;
            float[] fArr2 = this.f14385s.f14313i;
            float[] fArr3 = ejk.f14338a;
            for (int i = 0; i < 4; i++) {
                int i2 = i * 4;
                fArr[i2] = fArr2[0];
                fArr[i2 + 1] = fArr2[1];
                fArr[i2 + 2] = fArr2[2];
            }
            Float f9 = (Float) this.f14381o.get(eiv.WHITE);
            float fFloatValue = f9 != null ? f9.floatValue() : 25.0f;
            float fMin = ((Math.min(Math.abs(this.f14387u.m7371f()), 140.0f) - fFloatValue) / (140.0f - fFloatValue)) * 0.74f * this.f14373g;
            float f10 = this.f14385s.f14316l;
            Matrix.setIdentityM(this.f14382p, 0);
            Matrix.translateM(this.f14382p, 0, f7, f8, 0.0f);
            float[] fArr4 = this.f14382p;
            Matrix.multiplyMM(fArr4, 0, fArr4, 0, this.f14385s.f14310f, 0);
            ejd ejdVar = this.f14385s;
            float f11 = (fMin / f10) + (0.06f / f10);
            if (ejdVar.f14312h) {
                float[] fArr5 = this.f14382p;
                boolean z = ejdVar.f14317m;
                float f12 = (-(ejdVar.f14309e / 2.0f)) - (f11 / 2.0f);
                if (!z) {
                    f12 = -f12;
                }
                Matrix.translateM(fArr5, 0, 0.0f, f12, 0.0f);
                if (this.f14385s.f14317m) {
                    ejk.m7395a(this.f14369c, 0.6f, 0.6f, 0.0f, 0.0f);
                } else {
                    ejk.m7395a(this.f14369c, 0.0f, 0.0f, 0.6f, 0.6f);
                }
            } else {
                float[] fArr6 = this.f14382p;
                boolean z2 = ejdVar.f14317m;
                float f13 = (-(ejdVar.f14308d / 2.0f)) - (f11 / 2.0f);
                if (!z2) {
                    f13 = -f13;
                }
                Matrix.translateM(fArr6, 0, f13, 0.0f, 0.0f);
                if (this.f14385s.f14317m) {
                    ejk.m7395a(this.f14369c, 0.0f, 0.6f, 0.0f, 0.6f);
                } else {
                    ejk.m7395a(this.f14369c, 0.6f, 0.0f, 0.6f, 0.0f);
                }
            }
            elr elrVar = this.f14384r;
            elrVar.getClass();
            System.arraycopy(this.f14382p, 0, elrVar.f14629a, 0, 16);
            elr elrVar2 = this.f14384r;
            elrVar2.getClass();
            elrVar2.m7472e(this.f14369c);
            if (this.f14385s.f14312h) {
                elr elrVar3 = this.f14384r;
                elrVar3.getClass();
                elrVar3.m7471d(-f3, f11 / 2.0f, f3, (-f11) / 2.0f);
            } else {
                elr elrVar4 = this.f14384r;
                elrVar4.getClass();
                elrVar4.m7471d((-f11) / 2.0f, f3, f11 / 2.0f, -f3);
            }
            elr elrVar5 = this.f14384r;
            elrVar5.getClass();
            elrVar5.m7469b();
            return;
        }
        this.f14385s.f14313i[3] = this.f14379m.f14612a;
        Matrix.setIdentityM(this.f14382p, 0);
        C0274ir c0274ir = this.f14389w;
        switch (ejsVar.ordinal()) {
            case 0:
                Matrix.setIdentityM((float[]) c0274ir.f31846b, 0);
                c0274ir.f31847c = null;
                c0274ir.f31845a = 8;
                break;
            case 1:
                Matrix.setIdentityM((float[]) c0274ir.f31846b, 0);
                ejd ejdVar2 = this.f14385s;
                if (!ejdVar2.f14317m || ejdVar2.f14312h) {
                    Matrix.setIdentityM((float[]) c0274ir.f31846b, 0);
                    Matrix.scaleM((float[]) c0274ir.f31846b, 0, -1.0f, 1.0f, 1.0f);
                    c0274ir.f31847c = this.f14367a[1];
                    c0274ir.f31845a = 2;
                } else {
                    Matrix.setIdentityM((float[]) c0274ir.f31846b, 0);
                    c0274ir.f31847c = this.f14367a[0];
                    c0274ir.f31845a = 1;
                }
                break;
            case 2:
                ejd ejdVar3 = this.f14385s;
                if (ejdVar3.f14317m || ejdVar3.f14312h) {
                    Matrix.setIdentityM((float[]) c0274ir.f31846b, 0);
                    c0274ir.f31847c = this.f14367a[1];
                    c0274ir.f31845a = 1;
                } else {
                    Matrix.setIdentityM((float[]) c0274ir.f31846b, 0);
                    Matrix.scaleM((float[]) c0274ir.f31846b, 0, -1.0f, 1.0f, 1.0f);
                    c0274ir.f31847c = this.f14367a[0];
                    c0274ir.f31845a = 2;
                }
                break;
            case 3:
                Matrix.setIdentityM((float[]) c0274ir.f31846b, 0);
                c0274ir.f31847c = this.f14367a[2];
                c0274ir.f31845a = 4;
                break;
            case 4:
                Matrix.setRotateEulerM((float[]) c0274ir.f31846b, 0, 0.0f, 0.0f, 180.0f);
                c0274ir.f31847c = this.f14367a[2];
                c0274ir.f31845a = 3;
                break;
            case 5:
                Matrix.setRotateEulerM((float[]) c0274ir.f31846b, 0, 0.0f, 0.0f, true != this.f14385s.f14312h ? -90.0f : 180.0f);
                c0274ir.f31847c = this.f14367a[2];
                c0274ir.f31845a = 8;
                break;
            case 6:
                Matrix.setRotateEulerM((float[]) c0274ir.f31846b, 0, 0.0f, 0.0f, true != this.f14385s.f14312h ? 90.0f : 0.0f);
                c0274ir.f31847c = this.f14367a[2];
                c0274ir.f31845a = 7;
                break;
            case 7:
                c0274ir.f31847c = this.f14367a[2];
                ejd ejdVar4 = this.f14385s;
                if (ejdVar4.f14317m) {
                    Matrix.setRotateEulerM((float[]) c0274ir.f31846b, 0, 0.0f, 0.0f, true != ejdVar4.f14312h ? 0.0f : -90.0f);
                    c0274ir.f31845a = 4;
                } else {
                    Matrix.setRotateEulerM((float[]) c0274ir.f31846b, 0, 0.0f, 0.0f, true == ejdVar4.f14312h ? 90.0f : 180.0f);
                    c0274ir.f31845a = 3;
                }
                break;
            case 8:
                Matrix.setRotateEulerM((float[]) c0274ir.f31846b, 0, 0.0f, 0.0f, true == this.f14385s.f14312h ? 90.0f : 180.0f);
                c0274ir.f31847c = this.f14367a[2];
                c0274ir.f31845a = 5;
                break;
            case 9:
                Matrix.setRotateEulerM((float[]) c0274ir.f31846b, 0, 0.0f, 0.0f, true != this.f14385s.f14312h ? 0.0f : -90.0f);
                c0274ir.f31847c = this.f14367a[2];
                c0274ir.f31845a = 6;
                break;
            case 10:
                throw new RuntimeException("Invalid WarningRenderState for getWarningInfoForWarningState: ".concat(String.valueOf(String.valueOf(ejsVar))));
            default:
                throw new RuntimeException("Unhandled WarningRenderState: ".concat(String.valueOf(String.valueOf(ejsVar))));
        }
        int i3 = this.f14389w.f31845a;
        ejr ejrVar = this.f14368b;
        float f14 = this.f14374h;
        ejd ejdVar5 = this.f14385s;
        float f15 = ejdVar5.f14305a;
        float f16 = f14 * f15;
        float f17 = this.f14378l.f14136a;
        ejrVar.f14354a = true;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        switch (i4) {
            case 0:
                float f18 = ejdVar5.f14308d / 2.0f;
                ejrVar.f14354a = false;
                f7 = (f7 - (f16 * 0.12f)) - f18;
                break;
            case 1:
                f7 = f7 + (f16 * 0.12f) + (ejdVar5.f14308d / 2.0f);
                break;
            case 2:
                if (ejdVar5.f14312h) {
                    f8 = (f8 + ((f17 + 0.2f) * f16)) - (ejdVar5.f14309e / 2.0f);
                } else {
                    f7 = (f7 + ((f17 + 0.2f) * f16)) - (ejdVar5.f14308d / 2.0f);
                }
                break;
            case 3:
                if (ejdVar5.f14312h) {
                    f8 = (f8 - ((f17 + 0.2f) * f16)) + (ejdVar5.f14309e / 2.0f);
                } else {
                    f7 = (f7 - ((f17 + 0.2f) * f16)) + (ejdVar5.f14308d / 2.0f);
                }
                break;
            case 4:
                if (ejdVar5.f14312h) {
                    f4 = ((f17 + 0.3f) * f16) - 1.0f;
                    f7 = 0.0f;
                } else {
                    f7 = (-f15) + ((f17 + 0.3f) * f16);
                    f4 = 0.0f;
                }
                ejrVar.f14354a = false;
                f8 = f4;
                break;
            case 5:
                float f19 = (f17 + 0.3f) * f16;
                if (ejdVar5.f14312h) {
                    f6 = 1.0f - f19;
                    f5 = 0.0f;
                } else {
                    f5 = f15 - f19;
                    f6 = 0.0f;
                }
                ejrVar.f14354a = false;
                f8 = f6;
                f7 = f5;
                break;
            case 6:
                if (ejdVar5.f14312h) {
                    f7 = -(f17 * f16);
                } else {
                    f8 = f17 * f16;
                }
                ejrVar.f14354a = false;
                break;
            case 7:
                if (ejdVar5.f14312h) {
                    f7 = f17 * f16;
                } else {
                    f8 = -(f17 * f16);
                }
                ejrVar.f14354a = false;
                break;
            default:
                switch (i3) {
                    case 1:
                        str = "OUTER_MIDDLE_LEFT";
                        break;
                    case 2:
                        str = "OUTER_MIDDLE_RIGHT";
                        break;
                    case 3:
                        str = "INNER_LEFT";
                        break;
                    case 4:
                        str = "INNER_RIGHT";
                        break;
                    case 5:
                        str = "START_INNER_LEFT";
                        break;
                    case 6:
                        str = "START_INNER_RIGHT";
                        break;
                    case 7:
                        str = "CENTER_DOWN_ANIM";
                        break;
                    default:
                        str = "CENTER_UP_ANIM";
                        break;
                }
                throw new RuntimeException("Unhandled WarningPositionEnum: ".concat(str));
        }
        Matrix.translateM(this.f14382p, 0, f7, f8, 0.0f);
        if (this.f14368b.f14354a) {
            float[] fArr7 = this.f14382p;
            Matrix.multiplyMM(fArr7, 0, fArr7, 0, this.f14385s.f14310f, 0);
        }
        float[] fArr8 = this.f14382p;
        float f20 = this.f14373g;
        Matrix.scaleM(fArr8, 0, f20, f20, 1.0f);
        C0274ir c0274ir2 = this.f14389w;
        if (c0274ir2.f31847c != null) {
            float[] fArr9 = this.f14382p;
            Matrix.multiplyMM(fArr9, 0, fArr9, 0, (float[]) c0274ir2.f31846b, 0);
            elt eltVar = this.f14383q;
            eltVar.getClass();
            Object obj = this.f14389w.f31847c;
            obj.getClass();
            ejp ejpVar = (ejp) obj;
            eltVar.f14651b = ejpVar.f14348a;
            eltVar.getClass();
            obj.getClass();
            float f21 = ejpVar.f14349b;
            float f22 = this.f14385s.f14305a;
            float f23 = f21 * f22;
            obj.getClass();
            obj.getClass();
            float f24 = f21 * ejpVar.f14350c * f22;
            eltVar.m7476d(f23 + f23, f24 + f24);
            elt eltVar2 = this.f14383q;
            eltVar2.getClass();
            System.arraycopy(this.f14385s.f14313i, 0, eltVar2.f14654e, 0, 4);
            eltVar2.f14653d = true;
            elt eltVar3 = this.f14383q;
            eltVar3.getClass();
            eltVar3.m7478f(this.f14382p);
            elt eltVar4 = this.f14383q;
            eltVar4.getClass();
            eltVar4.m7474b();
        }
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: a */
    public final void mo7390a() {
        elt eltVar = this.f14383q;
        if (eltVar != null) {
            eltVar.m7473a();
            this.f14383q = null;
        }
        elr elrVar = this.f14384r;
        if (elrVar != null) {
            elrVar.m7468a();
            this.f14384r = null;
        }
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: b */
    public final void mo7391b() {
        boolean z;
        boolean z2 = this.f14377k;
        boolean z3 = this.f14385s.f14311g < 0.007f;
        this.f14377k = z3;
        if (z3 && !z2) {
            this.f14378l.m7355a();
            this.f14379m.m7462a();
            this.f14380n.m7462a();
        }
        if (!this.f14377k && z2) {
            this.f14379m.m7462a();
            this.f14379m.f14614c = ejs.IDLE;
            this.f14380n.m7462a();
        }
        ejd ejdVar = this.f14385s;
        float f = 1.0f - ejdVar.f14311g;
        float f2 = (f * 0.5f) + 0.5f;
        this.f14373g = f2;
        float f3 = ejdVar.f14316l;
        this.f14373g = f2 * f3;
        this.f14374h = ((f * 0.7f) + 0.3f) * f3;
        this.f14372f = false;
        this.f14387u.m7373h(this.f14381o);
        Float f4 = (Float) this.f14381o.get(eiv.WHITE);
        float fFloatValue = f4 != null ? f4.floatValue() : 25.0f;
        if (this.f14385s.f14317m) {
            z = this.f14387u.m7371f() >= fFloatValue;
        } else {
            z = this.f14387u.m7371f() <= (-fFloatValue);
        }
        Float f5 = (Float) this.f14381o.get(eiv.RED);
        float fFloatValue2 = f5 != null ? f5.floatValue() : 35.0f;
        if (!z || Math.abs(this.f14387u.m7371f()) < fFloatValue2) {
            eiw eiwVar = this.f14387u;
            double d = eiwVar.f14205p;
            if (d <= -10.0d) {
                this.f14370d = ejs.SHOW_ROLL_RIGHT;
                this.f14372f = true;
            } else if (d >= 10.0d) {
                this.f14370d = ejs.SHOW_ROLL_LEFT;
                this.f14372f = true;
            } else {
                float f6 = (float) eiwVar.f14195f;
                if (f6 >= 10.0f) {
                    this.f14370d = ejs.SHOW_ARROW_UP;
                    this.f14372f = true;
                } else if (f6 <= -10.0f) {
                    this.f14370d = ejs.SHOW_ARROW_DOWN;
                    this.f14372f = true;
                } else {
                    float f7 = (float) eiwVar.f14196g;
                    if (f7 >= 10.0f) {
                        this.f14370d = ejs.SHOW_ARROW_BACKTRACK;
                        this.f14372f = true;
                    } else if (z) {
                        this.f14370d = ejs.SHOW_WARNING_VELOCITY;
                    } else if (d <= -3.5d) {
                        this.f14370d = ejs.SHOW_ROLL_RIGHT;
                    } else if (d >= 3.5d) {
                        this.f14370d = ejs.SHOW_ROLL_LEFT;
                    } else if (f6 >= 2.5f) {
                        this.f14370d = ejs.SHOW_ARROW_UP;
                    } else if (f6 <= -2.5f) {
                        this.f14370d = ejs.SHOW_ARROW_DOWN;
                    } else if (f7 >= 2.0f) {
                        this.f14370d = ejs.SHOW_ARROW_BACKTRACK;
                    } else {
                        this.f14370d = ejs.IDLE;
                    }
                }
            }
        } else {
            this.f14370d = ejs.SHOW_WARNING_VELOCITY;
            this.f14372f = true;
        }
        if (this.f14377k) {
            this.f14372f = false;
        }
        if (!this.f14387u.m7375j() || this.f14385s.f14318n) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            ejd ejdVar2 = this.f14385s;
            float f8 = ejdVar2.f14306b;
            float f9 = ejdVar2.f14307c;
            float f10 = ejdVar2.f14312h ? ejdVar2.f14308d / 2.0f : ejdVar2.f14309e / 2.0f;
            if (this.f14383q == null || !this.f14386t.m7361b()) {
                return;
            }
            this.f14380n.f14614c = this.f14372f ? ejq.RED : ejq.WHITE;
            this.f14380n.m7463b();
            float[] fArr = this.f14385s.f14313i;
            float[] fArr2 = this.f14376j;
            float[] fArr3 = this.f14375i;
            float f11 = this.f14380n.f14612a;
            float[] fArr4 = ejk.f14338a;
            float f12 = fArr3[0];
            float f13 = fArr2[0];
            fArr[0] = ((f12 - f13) * f11) + f13;
            float f14 = fArr3[1];
            float f15 = fArr2[1];
            fArr[1] = ((f14 - f15) * f11) + f15;
            float f16 = fArr3[2];
            float f17 = fArr2[2];
            fArr[2] = ((f16 - f17) * f11) + f17;
            elp elpVar = this.f14379m;
            elpVar.f14614c = this.f14377k ? ejs.SHOW_START_ARROW_LEFT : this.f14370d;
            elpVar.m7463b();
            if (this.f14377k) {
                this.f14378l.m7356b();
                m7399d(ejs.SHOW_START_ARROW_LEFT, f8, f9, f10);
                m7399d(ejs.SHOW_START_ARROW_RIGHT, f8, f9, f10);
            } else {
                Object obj = this.f14379m.f14613b;
                if (obj != ejs.IDLE) {
                    if (this.f14371e != obj) {
                        this.f14378l.m7355a();
                    }
                    this.f14378l.m7356b();
                    m7399d((ejs) this.f14379m.f14613b, f8, f9, f10);
                }
            }
            this.f14371e = (ejs) this.f14379m.f14613b;
        }
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: c */
    public final void mo7392c(int i, int i2) {
        elt eltVar = this.f14383q;
        if (eltVar != null) {
            eltVar.m7475c(i, i2);
        }
        elr elrVar = this.f14384r;
        if (elrVar != null) {
            elrVar.m7470c(i, i2);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f14388v.getResources(), C0100R.drawable.ic_arrow_alt, options);
        ejp[] ejpVarArr = this.f14367a;
        ejp ejpVar = new ejp();
        ejpVarArr[2] = ejpVar;
        ejpVar.f14348a = new Texture(bitmapDecodeResource);
        this.f14367a[2].f14350c = bitmapDecodeResource.getHeight() / bitmapDecodeResource.getWidth();
        this.f14367a[2].f14349b = 0.12f;
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(this.f14388v.getResources(), C0100R.drawable.ic_tilt_up, options);
        ejp[] ejpVarArr2 = this.f14367a;
        ejp ejpVar2 = new ejp();
        ejpVarArr2[1] = ejpVar2;
        ejpVar2.f14348a = new Texture(bitmapDecodeResource2);
        this.f14367a[1].f14350c = bitmapDecodeResource2.getHeight() / bitmapDecodeResource2.getWidth();
        this.f14367a[1].f14349b = 0.075f;
        Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(this.f14388v.getResources(), C0100R.drawable.ic_tilt_down, options);
        ejp[] ejpVarArr3 = this.f14367a;
        ejp ejpVar3 = new ejp();
        ejpVarArr3[0] = ejpVar3;
        ejpVar3.f14348a = new Texture(bitmapDecodeResource3);
        this.f14367a[0].f14350c = bitmapDecodeResource3.getHeight() / bitmapDecodeResource3.getWidth();
        this.f14367a[0].f14349b = 0.075f;
    }
}
