package p000;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public abstract class i39 extends vi0 {

    /* JADX INFO: renamed from: a */
    public nr9 f43451a;

    /* JADX INFO: renamed from: b */
    public long f43452b = 9205357640488583168L;

    @Override // p000.vi0
    /* JADX INFO: renamed from: b */
    public final void mo13650b(float f, long j, u8a u8aVar) {
        Paint paint = (Paint) u8aVar.f63594c;
        nr9 nr9Var = this.f43451a;
        if (nr9Var == null || !x89.m24404a(this.f43452b, j)) {
            if (x89.m24408e(j)) {
                this.f43451a = null;
                this.f43452b = 9205357640488583168L;
                nr9Var = null;
            } else {
                nr9Var = this.f43451a;
                if (nr9Var == null) {
                    nr9Var = new nr9();
                    this.f43451a = nr9Var;
                }
                nr9Var.f53173a = mo11320c(j);
                this.f43451a = nr9Var;
                this.f43452b = j;
            }
        }
        long jM10035e = d32.m10035e(paint.getColor());
        long j2 = aa1.f403b;
        if (!aa1.m199c(jM10035e, j2)) {
            u8aVar.m22555p(j2);
        }
        if (!fa4.m11650l((Shader) u8aVar.f63595d, nr9Var != null ? (Shader) nr9Var.f53173a : null)) {
            u8aVar.m22559t(nr9Var != null ? (Shader) nr9Var.f53173a : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        u8aVar.m22553n(f);
    }

    /* JADX INFO: renamed from: c */
    public abstract Shader mo11320c(long j);
}
