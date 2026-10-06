package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bki extends bkc {

    /* JADX INFO: renamed from: h */
    private final RectF f3620h;

    /* JADX INFO: renamed from: i */
    private final Paint f3621i;

    /* JADX INFO: renamed from: j */
    private final float[] f3622j;

    /* JADX INFO: renamed from: k */
    private final Path f3623k;

    /* JADX INFO: renamed from: l */
    private final bkf f3624l;

    /* JADX INFO: renamed from: m */
    private bie f3625m;

    public bki(bgv bgvVar, bkf bkfVar) {
        super(bgvVar, bkfVar);
        this.f3620h = new RectF();
        bhg bhgVar = new bhg();
        this.f3621i = bhgVar;
        this.f3622j = new float[8];
        this.f3623k = new Path();
        this.f3624l = bkfVar;
        bhgVar.setAlpha(0);
        bhgVar.setStyle(Paint.Style.FILL);
        bhgVar.setColor(bkfVar.f3607k);
    }

    @Override // p000.bkc, p000.bhk
    /* JADX INFO: renamed from: b */
    public final void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        super.mo2464b(rectF, matrix, z);
        RectF rectF2 = this.f3620h;
        bkf bkfVar = this.f3624l;
        rectF2.set(0.0f, 0.0f, bkfVar.f3605i, bkfVar.f3606j);
        this.f3566a.mapRect(this.f3620h);
        rectF.set(this.f3620h);
    }

    @Override // p000.bkc, p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        super.mo2468f(obj, bkoVar);
        if (obj == bha.f3233E) {
            this.f3625m = new bis(bkoVar, null);
        }
    }

    @Override // p000.bkc
    /* JADX INFO: renamed from: i */
    public final void mo2535i(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.f3624l.f3607k);
        if (iAlpha == 0) {
            return;
        }
        bie bieVar = this.f3572g.f3434e;
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (bieVar == null ? 100 : ((Integer) bieVar.mo2492e()).intValue())) / 100.0f) * 255.0f);
        this.f3621i.setAlpha(iIntValue);
        bie bieVar2 = this.f3625m;
        if (bieVar2 != null) {
            this.f3621i.setColorFilter((ColorFilter) bieVar2.mo2492e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f3622j;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            bkf bkfVar = this.f3624l;
            float f = bkfVar.f3605i;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = bkfVar.f3606j;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            this.f3623k.reset();
            Path path = this.f3623k;
            float[] fArr2 = this.f3622j;
            path.moveTo(fArr2[0], fArr2[1]);
            Path path2 = this.f3623k;
            float[] fArr3 = this.f3622j;
            path2.lineTo(fArr3[2], fArr3[3]);
            Path path3 = this.f3623k;
            float[] fArr4 = this.f3622j;
            path3.lineTo(fArr4[4], fArr4[5]);
            Path path4 = this.f3623k;
            float[] fArr5 = this.f3622j;
            path4.lineTo(fArr5[6], fArr5[7]);
            Path path5 = this.f3623k;
            float[] fArr6 = this.f3622j;
            path5.lineTo(fArr6[0], fArr6[1]);
            this.f3623k.close();
            canvas.drawPath(this.f3623k, this.f3621i);
        }
    }
}
