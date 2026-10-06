package p000;

import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyc implements eyd {

    /* JADX INFO: renamed from: a */
    final ArrayList f20952a = new ArrayList();

    /* JADX INFO: renamed from: b */
    final float[] f20953b = {-0.893333f, -0.86f, -0.86f, -0.726667f, -0.706667f, -0.706667f, -0.66f, -0.66f, -0.403333f, -0.396667f, -0.396667f, -0.383333f, -0.383333f, -0.37f, -0.37f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.37f, 0.37f, 0.383333f, 0.383333f, 0.396667f, 0.396667f, 0.403333f, 0.66f, 0.66f, 0.706667f, 0.706667f, 0.726667f, 0.86f, 0.86f, 0.893333f, -0.893333f};

    /* JADX INFO: renamed from: c */
    final float[] f20954c = {0.0f, -0.366667f, 0.366667f, 0.0f, -0.38f, 0.38f, -0.663333f, 0.663333f, 0.0f, -0.393333f, 0.393333f, -0.71f, 0.71f, -0.863333f, 0.863333f, -0.943333f, -0.726667f, -0.403333f, 0.0f, 0.403333f, 0.726667f, 0.943333f, -0.863333f, 0.863333f, -0.71f, 0.71f, -0.393333f, 0.393333f, 0.0f, -0.663333f, 0.663333f, -0.38f, 0.38f, 0.0f, -0.366667f, 0.366667f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: d */
    final float[] f20955d = {0.5f, 0.5f, 0.5f, 0.7f, 0.7f, 0.7f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f, 0.7f, 0.7f, 0.5f, 0.5f, 0.5f, 0.7f, 1.0f, 1.0f, 1.0f, 0.7f, 0.5f, 0.5f, 0.5f, 0.7f, 0.7f, 1.0f, 1.0f, 1.0f, 0.5f, 0.5f, 0.7f, 0.7f, 0.7f, 0.5f, 0.5f, 0.5f, 0.5f};

    @Override // p000.eyd
    /* JADX INFO: renamed from: a */
    public final void mo8040a(float f, exy exyVar, float[] fArr, int i, int i2) {
        float f2 = i / 2.0f;
        float f3 = i2 / 2.0f;
        float fMin = Math.min(f2, f3) * 0.95f;
        this.f20952a.clear();
        PointF pointF = new PointF();
        eyj eyjVar = exyVar.f20914h;
        if (eyjVar != null) {
            eyjVar.m7968c();
            exyVar.f20914h.m8047j(1.0f);
        }
        for (int i3 = 0; i3 < 38; i3++) {
            pointF.x = (this.f20953b[i3] * f * fMin) + f2;
            pointF.y = (this.f20954c[i3] * f * fMin) + f3;
            float f4 = this.f20955d[i3] * 0.4f;
            exb exbVar = exyVar.f20911e;
            if (exbVar != null && exyVar.f20914h != null) {
                try {
                    exbVar.m7975f(fArr, pointF.x, pointF.y, f4);
                } catch (ewy e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
