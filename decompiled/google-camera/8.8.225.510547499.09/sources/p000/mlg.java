package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlg extends mli {

    /* JADX INFO: renamed from: h */
    private static final RectF f40973h = new RectF();

    /* JADX INFO: renamed from: a */
    @Deprecated
    public final float f40974a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public final float f40975b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public final float f40976c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public final float f40977d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public float f40978e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public float f40979f;

    public mlg(float f, float f2, float f3, float f4) {
        this.f40974a = f;
        this.f40975b = f2;
        this.f40976c = f3;
        this.f40977d = f4;
    }

    @Override // p000.mli
    /* JADX INFO: renamed from: a */
    public final void mo16601a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f40982g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f40973h;
        rectF.set(this.f40974a, this.f40975b, this.f40976c, this.f40977d);
        path.arcTo(rectF, this.f40978e, this.f40979f, false);
        path.transform(matrix);
    }
}
