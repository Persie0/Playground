package p000;

import android.graphics.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mig extends mfu {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ min f40582a;

    public mig(min minVar) {
        this.f40582a = minVar;
    }

    @Override // p000.mfu
    /* JADX INFO: renamed from: a */
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.f40582a.f40632y = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // p000.mfu, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}
