package p000;

import android.opengl.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyf implements eyd {

    /* JADX INFO: renamed from: a */
    private boolean f20956a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f20957b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final float[] f20958c;

    public eyf(boolean z) {
        this.f20956a = true;
        float[] fArr = new float[16];
        this.f20958c = fArr;
        this.f20956a = z;
        Matrix.setIdentityM(fArr, 0);
    }

    @Override // p000.eyd
    /* JADX INFO: renamed from: a */
    public final void mo8040a(float f, exy exyVar, float[] fArr, int i, int i2) {
        ArrayList arrayList = this.f20957b;
        arrayList.clear();
        boolean z = this.f20956a;
        float f2 = true != z ? 0.0f : 1.0f;
        float f3 = true != z ? 1.0f : 0.0f;
        int i3 = 0;
        for (int i4 = -2; i4 <= 2; i4++) {
            if (i4 != 0) {
                float[] fArr2 = new float[16];
                Matrix.setIdentityM(fArr2, 0);
                Matrix.rotateM(fArr2, 0, i4 * 20.0f * f, f3, f2, 0.0f);
                arrayList.add(i3, fArr2);
                i3++;
            }
        }
        float[] fArr3 = this.f20958c;
        ArrayList arrayList2 = this.f20957b;
        eyk eykVar = exyVar.f20913g;
        if (eykVar == null || exyVar.f20911e == null) {
            return;
        }
        eykVar.m7968c();
        exyVar.f20913g.m8048j(1.0f);
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            try {
                float[] fArr4 = (float[]) arrayList2.get(i5);
                exb exbVar = exyVar.f20911e;
                Matrix.multiplyMM(exyVar.f20917k, 0, fArr3, 0, fArr4, 0);
                Matrix.multiplyMV(exyVar.f20916j, 0, exyVar.f20917k, 0, exyVar.f20915i, 0);
                exy.m8029c(exyVar.f20916j);
                float[] fArr5 = exyVar.f20916j;
                float f4 = fArr5[0];
                float f5 = exyVar.f20919m;
                float f6 = (f4 * f5) + f5;
                float f7 = fArr5[1];
                float f8 = exyVar.f20920n;
                float f9 = (f7 * f8) + f8;
                if (exbVar != null) {
                    exbVar.m7975f(fArr, f6, f9, 0.4f);
                }
            } catch (ewy e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
