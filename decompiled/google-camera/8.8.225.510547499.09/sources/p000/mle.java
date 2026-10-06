package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mle {

    /* JADX INFO: renamed from: a */
    private final mlk[] f40958a = new mlk[4];

    /* JADX INFO: renamed from: b */
    private final Matrix[] f40959b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    private final Matrix[] f40960c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    private final PointF f40961d = new PointF();

    /* JADX INFO: renamed from: e */
    private final Path f40962e = new Path();

    /* JADX INFO: renamed from: f */
    private final Path f40963f = new Path();

    /* JADX INFO: renamed from: g */
    private final mlk f40964g = new mlk();

    /* JADX INFO: renamed from: h */
    private final float[] f40965h = new float[2];

    /* JADX INFO: renamed from: i */
    private final float[] f40966i = new float[2];

    /* JADX INFO: renamed from: j */
    private final Path f40967j = new Path();

    /* JADX INFO: renamed from: k */
    private final Path f40968k = new Path();

    /* JADX INFO: renamed from: l */
    private boolean f40969l = true;

    public mle() {
        for (int i = 0; i < 4; i++) {
            this.f40958a[i] = new mlk();
            this.f40959b[i] = new Matrix();
            this.f40960c[i] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m16596c(Path path, int i) {
        this.f40968k.reset();
        this.f40958a[i].m16605c(this.f40959b[i], this.f40968k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f40968k.computeBounds(rectF, true);
        path.op(this.f40968k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private static final float m16597d(int i) {
        return ((i + 1) % 4) * 90;
    }

    /* JADX INFO: renamed from: a */
    public final void m16598a(mlc mlcVar, float f, RectF rectF, Path path) {
        m16599b(mlcVar, f, rectF, null, path);
    }

    /* JADX INFO: renamed from: b */
    public final void m16599b(mlc mlcVar, float f, RectF rectF, AmbientMode.AmbientController ambientController, Path path) {
        mkt mktVar;
        mkv mkvVar;
        path.rewind();
        this.f40962e.rewind();
        this.f40963f.rewind();
        this.f40963f.addRect(rectF, Path.Direction.CW);
        int i = 0;
        while (true) {
            int i2 = 4;
            char c = 1;
            if (i >= 4) {
                int i3 = 0;
                while (i3 < i2) {
                    float[] fArr = this.f40965h;
                    mlk mlkVar = this.f40958a[i3];
                    fArr[0] = 0.0f;
                    fArr[c] = mlkVar.f40983a;
                    this.f40959b[i3].mapPoints(fArr);
                    if (i3 == 0) {
                        float[] fArr2 = this.f40965h;
                        path.moveTo(fArr2[0], fArr2[c]);
                    } else {
                        float[] fArr3 = this.f40965h;
                        path.lineTo(fArr3[0], fArr3[c]);
                    }
                    this.f40958a[i3].m16605c(this.f40959b[i3], path);
                    if (ambientController != null) {
                        mlk mlkVar2 = this.f40958a[i3];
                        Matrix matrix = this.f40959b[i3];
                        ((mkx) ambientController.f1697a).f40896d.set(i3, false);
                        ((mkx) ambientController.f1697a).f40894b[i3] = mlkVar2.m16603a(matrix);
                    }
                    int i4 = i3 + 1;
                    float[] fArr4 = this.f40965h;
                    mlk mlkVar3 = this.f40958a[i3];
                    fArr4[0] = mlkVar3.f40984b;
                    fArr4[c] = mlkVar3.f40985c;
                    this.f40959b[i3].mapPoints(fArr4);
                    float[] fArr5 = this.f40966i;
                    int i5 = i4 % 4;
                    mlk mlkVar4 = this.f40958a[i5];
                    fArr5[0] = 0.0f;
                    fArr5[c] = mlkVar4.f40983a;
                    this.f40959b[i5].mapPoints(fArr5);
                    float[] fArr6 = this.f40965h;
                    float f2 = fArr6[0];
                    float[] fArr7 = this.f40966i;
                    float fMax = Math.max(((float) Math.hypot(f2 - fArr7[0], fArr6[c] - fArr7[c])) - 0.001f, 0.0f);
                    float[] fArr8 = this.f40965h;
                    mlk mlkVar5 = this.f40958a[i3];
                    fArr8[0] = mlkVar5.f40984b;
                    fArr8[1] = mlkVar5.f40985c;
                    this.f40959b[i3].mapPoints(fArr8);
                    switch (i3) {
                        case 1:
                        case 3:
                            Math.abs(rectF.centerX() - this.f40965h[0]);
                            break;
                        case 2:
                        default:
                            Math.abs(rectF.centerY() - this.f40965h[1]);
                            break;
                    }
                    this.f40964g.m16607e();
                    switch (i3) {
                        case 1:
                            mkv mkvVar2 = mlcVar.f40951h;
                            break;
                        case 2:
                            mkv mkvVar3 = mlcVar.f40952i;
                            break;
                        case 3:
                            mkv mkvVar4 = mlcVar.f40949f;
                            break;
                        default:
                            mkv mkvVar5 = mlcVar.f40950g;
                            break;
                    }
                    this.f40964g.m16606d(fMax, 0.0f);
                    this.f40967j.reset();
                    this.f40964g.m16605c(this.f40960c[i3], this.f40967j);
                    if (this.f40969l && (m16596c(this.f40967j, i3) || m16596c(this.f40967j, i5))) {
                        Path path2 = this.f40967j;
                        path2.op(path2, this.f40963f, Path.Op.DIFFERENCE);
                        float[] fArr9 = this.f40965h;
                        fArr9[0] = 0.0f;
                        fArr9[1] = this.f40964g.f40983a;
                        this.f40960c[i3].mapPoints(fArr9);
                        Path path3 = this.f40962e;
                        float[] fArr10 = this.f40965h;
                        path3.moveTo(fArr10[0], fArr10[1]);
                        this.f40964g.m16605c(this.f40960c[i3], this.f40962e);
                    } else {
                        this.f40964g.m16605c(this.f40960c[i3], path);
                    }
                    if (ambientController != null) {
                        mlk mlkVar6 = this.f40964g;
                        Matrix matrix2 = this.f40960c[i3];
                        ((mkx) ambientController.f1697a).f40896d.set(i3 + 4, false);
                        ((mkx) ambientController.f1697a).f40895c[i3] = mlkVar6.m16603a(matrix2);
                    }
                    i3 = i4;
                    i2 = 4;
                    c = 1;
                }
                path.close();
                this.f40962e.close();
                if (this.f40962e.isEmpty()) {
                    return;
                }
                path.op(this.f40962e, Path.Op.UNION);
                return;
            }
            switch (i) {
                case 1:
                    mktVar = mlcVar.f40947d;
                    break;
                case 2:
                    mktVar = mlcVar.f40948e;
                    break;
                case 3:
                    mktVar = mlcVar.f40945b;
                    break;
                default:
                    mktVar = mlcVar.f40946c;
                    break;
            }
            switch (i) {
                case 1:
                    mkvVar = mlcVar.f40955l;
                    break;
                case 2:
                    mkvVar = mlcVar.f40956m;
                    break;
                case 3:
                    mkvVar = mlcVar.f40953j;
                    break;
                default:
                    mkvVar = mlcVar.f40954k;
                    break;
            }
            mkvVar.mo16492a(this.f40958a[i], f, mktVar.mo16491a(rectF));
            float fM16597d = m16597d(i);
            this.f40959b[i].reset();
            PointF pointF = this.f40961d;
            switch (i) {
                case 1:
                    pointF.set(rectF.right, rectF.bottom);
                    break;
                case 2:
                    pointF.set(rectF.left, rectF.bottom);
                    break;
                case 3:
                    pointF.set(rectF.left, rectF.top);
                    break;
                default:
                    pointF.set(rectF.right, rectF.top);
                    break;
            }
            this.f40959b[i].setTranslate(this.f40961d.x, this.f40961d.y);
            this.f40959b[i].preRotate(fM16597d);
            float[] fArr11 = this.f40965h;
            mlk mlkVar7 = this.f40958a[i];
            fArr11[0] = mlkVar7.f40984b;
            fArr11[1] = mlkVar7.f40985c;
            this.f40959b[i].mapPoints(fArr11);
            float fM16597d2 = m16597d(i);
            this.f40960c[i].reset();
            Matrix matrix3 = this.f40960c[i];
            float[] fArr12 = this.f40965h;
            matrix3.setTranslate(fArr12[0], fArr12[1]);
            this.f40960c[i].preRotate(fM16597d2);
            i++;
        }
    }
}
