package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class i49 extends j49 {

    /* JADX INFO: renamed from: b */
    public float f43520b;

    /* JADX INFO: renamed from: c */
    public float f43521c;

    @Override // p000.j49
    /* JADX INFO: renamed from: a */
    public final void mo13046a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f45047a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f43520b, this.f43521c);
        path.transform(matrix);
    }
}
