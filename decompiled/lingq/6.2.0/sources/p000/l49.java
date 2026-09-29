package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l49 {

    /* JADX INFO: renamed from: a */
    public float f49047a;

    /* JADX INFO: renamed from: b */
    public float f49048b;

    /* JADX INFO: renamed from: c */
    public float f49049c;

    /* JADX INFO: renamed from: d */
    public float f49050d;

    /* JADX INFO: renamed from: e */
    public float f49051e;

    /* JADX INFO: renamed from: f */
    public float f49052f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f49053g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f49054h = new ArrayList();

    public l49() {
        m15800d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m15797a(float f) {
        float f2 = this.f49051e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f49049c;
        float f5 = this.f49050d;
        h49 h49Var = new h49(f4, f5, f4, f5);
        h49.m13044b(h49Var, this.f49051e);
        h49.m13045c(h49Var, f3);
        this.f49054h.add(new f49(h49Var));
        this.f49051e = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m15798b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f49053g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j49) arrayList.get(i)).mo13046a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15799c(float f, float f2) {
        i49 i49Var = new i49();
        i49Var.f43520b = f;
        i49Var.f43521c = f2;
        this.f49053g.add(i49Var);
        g49 g49Var = new g49(i49Var, this.f49049c, this.f49050d);
        float fM12358c = g49Var.m12358c() + 270.0f;
        float fM12358c2 = g49Var.m12358c() + 270.0f;
        m15797a(fM12358c);
        this.f49054h.add(g49Var);
        this.f49051e = fM12358c2;
        this.f49049c = f;
        this.f49050d = f2;
    }

    /* JADX INFO: renamed from: d */
    public final void m15800d(float f, float f2, float f3, float f4) {
        this.f49047a = f;
        this.f49048b = f2;
        this.f49049c = f;
        this.f49050d = f2;
        this.f49051e = f3;
        this.f49052f = (f3 + f4) % 360.0f;
        this.f49053g.clear();
        this.f49054h.clear();
    }
}
