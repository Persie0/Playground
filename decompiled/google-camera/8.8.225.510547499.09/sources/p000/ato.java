package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ato {

    /* JADX INFO: renamed from: a */
    public static final Matrix f2338a = new Matrix();

    /* JADX INFO: renamed from: b */
    Paint f2339b;

    /* JADX INFO: renamed from: c */
    Paint f2340c;

    /* JADX INFO: renamed from: d */
    final atm f2341d;

    /* JADX INFO: renamed from: e */
    float f2342e;

    /* JADX INFO: renamed from: f */
    float f2343f;

    /* JADX INFO: renamed from: g */
    float f2344g;

    /* JADX INFO: renamed from: h */
    float f2345h;

    /* JADX INFO: renamed from: i */
    int f2346i;

    /* JADX INFO: renamed from: j */
    String f2347j;

    /* JADX INFO: renamed from: k */
    Boolean f2348k;

    /* JADX INFO: renamed from: l */
    final C1109wy f2349l;

    /* JADX INFO: renamed from: m */
    private final Path f2350m;

    /* JADX INFO: renamed from: n */
    private final Path f2351n;

    /* JADX INFO: renamed from: o */
    private final Matrix f2352o;

    /* JADX INFO: renamed from: p */
    private PathMeasure f2353p;

    /* JADX INFO: renamed from: q */
    private int f2354q;

    public ato() {
        this.f2352o = new Matrix();
        this.f2342e = 0.0f;
        this.f2343f = 0.0f;
        this.f2344g = 0.0f;
        this.f2345h = 0.0f;
        this.f2346i = 255;
        this.f2347j = null;
        this.f2348k = null;
        this.f2349l = new C1109wy();
        this.f2341d = new atm();
        this.f2350m = new Path();
        this.f2351n = new Path();
    }

    /* JADX INFO: renamed from: a */
    public final void m1987a(atm atmVar, Matrix matrix, Canvas canvas, int i, int i2) {
        atmVar.f2321a.set(matrix);
        atmVar.f2321a.preConcat(atmVar.f2330j);
        canvas.save();
        for (int i3 = 0; i3 < atmVar.f2322b.size(); i3++) {
            asp aspVar = (asp) atmVar.f2322b.get(i3);
            if (aspVar instanceof atm) {
                m1987a((atm) aspVar, atmVar.f2321a, canvas, i, i2);
            } else if (aspVar instanceof atn) {
                atn atnVar = (atn) aspVar;
                float f = i / this.f2344g;
                float f2 = i2 / this.f2345h;
                float fMin = Math.min(f, f2);
                Matrix matrix2 = atmVar.f2321a;
                this.f2352o.set(matrix2);
                this.f2352o.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f3 = fArr[0];
                float f4 = fArr[1];
                float f5 = fArr[2];
                float f6 = f3 * fArr[3];
                float f7 = f4 * f5;
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f6 - f7) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.f2350m;
                    path.reset();
                    acs[] acsVarArr = atnVar.f2334m;
                    if (acsVarArr != null) {
                        acs.m223a(acsVarArr, path);
                    }
                    Path path2 = this.f2350m;
                    this.f2351n.reset();
                    if (atnVar.mo1985d()) {
                        this.f2351n.setFillType(atnVar.f2336o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        this.f2351n.addPath(path2, this.f2352o);
                        canvas.clipPath(this.f2351n);
                    } else {
                        atl atlVar = (atl) atnVar;
                        float f8 = atlVar.f2313e;
                        if (f8 != 0.0f || atlVar.f2314f != 1.0f) {
                            float f9 = atlVar.f2315g;
                            float f10 = (f8 + f9) % 1.0f;
                            float f11 = (atlVar.f2314f + f9) % 1.0f;
                            if (this.f2353p == null) {
                                this.f2353p = new PathMeasure();
                            }
                            this.f2353p.setPath(this.f2350m, false);
                            float length = this.f2353p.getLength();
                            float f12 = f10 * length;
                            float f13 = f11 * length;
                            path2.reset();
                            if (f12 > f13) {
                                this.f2353p.getSegment(f12, length, path2, true);
                                this.f2353p.getSegment(0.0f, f13, path2, true);
                            } else {
                                this.f2353p.getSegment(f12, f13, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.f2351n.addPath(path2, this.f2352o);
                        if (atlVar.f2320l.m11445h()) {
                            ilo iloVar = atlVar.f2320l;
                            if (this.f2340c == null) {
                                Paint paint = new Paint(1);
                                this.f2340c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f2340c;
                            if (iloVar.m11442e()) {
                                Shader shader = (Shader) iloVar.f31456b;
                                shader.setLocalMatrix(this.f2352o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(atlVar.f2312d * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(atr.m1990a(iloVar.f31455a, atlVar.f2312d));
                            }
                            paint2.setColorFilter(null);
                            this.f2351n.setFillType(atlVar.f2336o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(this.f2351n, paint2);
                        }
                        if (atlVar.f2319k.m11445h()) {
                            ilo iloVar2 = atlVar.f2319k;
                            if (this.f2339b == null) {
                                Paint paint3 = new Paint(1);
                                this.f2339b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f2339b;
                            Paint.Join join = atlVar.f2317i;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = atlVar.f2316h;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(atlVar.f2318j);
                            if (iloVar2.m11442e()) {
                                Shader shader2 = (Shader) iloVar2.f31456b;
                                shader2.setLocalMatrix(this.f2352o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(atlVar.f2311c * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(atr.m1990a(iloVar2.f31455a, atlVar.f2311c));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(atlVar.f2310b * fAbs * fMin);
                            canvas.drawPath(this.f2351n, paint4);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f2346i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f2346i = i;
    }

    public ato(ato atoVar) {
        this.f2352o = new Matrix();
        this.f2342e = 0.0f;
        this.f2343f = 0.0f;
        this.f2344g = 0.0f;
        this.f2345h = 0.0f;
        this.f2346i = 255;
        this.f2347j = null;
        this.f2348k = null;
        C1109wy c1109wy = new C1109wy();
        this.f2349l = c1109wy;
        this.f2341d = new atm(atoVar.f2341d, c1109wy);
        this.f2350m = new Path(atoVar.f2350m);
        this.f2351n = new Path(atoVar.f2351n);
        this.f2342e = atoVar.f2342e;
        this.f2343f = atoVar.f2343f;
        this.f2344g = atoVar.f2344g;
        this.f2345h = atoVar.f2345h;
        int i = atoVar.f2354q;
        this.f2354q = 0;
        this.f2346i = atoVar.f2346i;
        this.f2347j = atoVar.f2347j;
        String str = atoVar.f2347j;
        if (str != null) {
            c1109wy.put(str, this);
        }
        this.f2348k = atoVar.f2348k;
    }
}
