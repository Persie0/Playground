package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlk {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public float f40983a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public float f40984b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public float f40985c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public float f40986d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public float f40987e;

    /* JADX INFO: renamed from: f */
    public final List f40988f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final List f40989g = new ArrayList();

    public mlk() {
        m16607e();
    }

    /* JADX INFO: renamed from: g */
    private final void m16602g(float f) {
        float f2 = this.f40986d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            float f4 = this.f40984b;
            float f5 = this.f40985c;
            mlg mlgVar = new mlg(f4, f5, f4, f5);
            mlgVar.f40978e = this.f40986d;
            mlgVar.f40979f = f3;
            this.f40989g.add(new mlj());
            this.f40986d = f;
        }
    }

    /* JADX INFO: renamed from: a */
    final mlj m16603a(Matrix matrix) {
        m16602g(this.f40987e);
        new Matrix(matrix);
        new ArrayList(this.f40989g);
        return new mlj();
    }

    /* JADX INFO: renamed from: b */
    public final void m16604b(mlj mljVar, float f, float f2) {
        m16602g(f);
        this.f40989g.add(mljVar);
        this.f40986d = f2;
    }

    /* JADX INFO: renamed from: c */
    public final void m16605c(Matrix matrix, Path path) {
        int size = this.f40988f.size();
        for (int i = 0; i < size; i++) {
            ((mli) this.f40988f.get(i)).mo16601a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16606d(float f, float f2) {
        mlh mlhVar = new mlh();
        mlhVar.f40980a = f;
        mlhVar.f40981b = f2;
        this.f40988f.add(mlhVar);
        mlf mlfVar = new mlf(mlhVar, this.f40984b, this.f40985c);
        m16604b(mlfVar, mlfVar.m16600a() + 270.0f, mlfVar.m16600a() + 270.0f);
        this.f40984b = f;
        this.f40985c = f2;
    }

    /* JADX INFO: renamed from: e */
    public final void m16607e() {
        m16608f(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m16608f(float f, float f2, float f3) {
        this.f40983a = f;
        this.f40984b = 0.0f;
        this.f40985c = f;
        this.f40986d = f2;
        this.f40987e = (f2 + f3) % 360.0f;
        this.f40988f.clear();
        this.f40989g.clear();
    }
}
