package p000;

import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyg implements eyd {

    /* JADX INFO: renamed from: a */
    private static final float[] f20959a = {-0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f};

    /* JADX INFO: renamed from: b */
    private static final float[] f20960b = {-0.5f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f};

    /* JADX INFO: renamed from: c */
    private final ArrayList f20961c = new ArrayList();

    @Override // p000.eyd
    /* JADX INFO: renamed from: a */
    public final void mo8040a(float f, exy exyVar, float[] fArr, int i, int i2) {
        float f2 = i / 2.0f;
        float f3 = i2 / 2.0f;
        float fMin = Math.min(f2, f3) * 0.95f;
        this.f20961c.clear();
        int i3 = 0;
        while (true) {
            float f4 = 1.0f;
            if (i3 >= 9) {
                break;
            }
            float f5 = i > i2 ? 1.3333334f : 1.0f;
            if (i <= i2) {
                f4 = 1.3333334f;
            }
            this.f20961c.add(new PointF((f20959a[i3] * f * fMin * f5) + f2, (f20960b[i3] * f * fMin * f4) + f3));
            i3++;
        }
        ArrayList arrayList = this.f20961c;
        eyk eykVar = exyVar.f20913g;
        if (eykVar == null || exyVar.f20911e == null) {
            return;
        }
        eykVar.m7968c();
        exyVar.f20913g.m8048j(1.0f);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            try {
                PointF pointF = (PointF) arrayList.get(i4);
                exb exbVar = exyVar.f20911e;
                if (exbVar != null) {
                    exbVar.m7975f(fArr, pointF.x, pointF.y, 0.4f);
                }
            } catch (ewy e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
