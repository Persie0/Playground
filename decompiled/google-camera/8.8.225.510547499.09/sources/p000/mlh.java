package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlh extends mli {

    /* JADX INFO: renamed from: a */
    public float f40980a;

    /* JADX INFO: renamed from: b */
    public float f40981b;

    @Override // p000.mli
    /* JADX INFO: renamed from: a */
    public final void mo16601a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f40982g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f40980a, this.f40981b);
        path.transform(matrix);
    }
}
