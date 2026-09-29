package p000;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o6a extends i39 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f53907c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f53908d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ l44 f53909e;

    public o6a(long j, List list, l44 l44Var) {
        this.f53907c = j;
        this.f53908d = list;
        this.f53909e = l44Var;
    }

    @Override // p000.i39
    /* JADX INFO: renamed from: c */
    public final Shader mo11320c(long j) {
        List list = this.f53908d;
        long j2 = this.f53907c;
        SweepGradient sweepGradientM11126f = eh0.m11126f(j2, list, null);
        Matrix matrix = new Matrix();
        matrix.preRotate(((Number) this.f53909e.getValue()).floatValue(), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        sweepGradientM11126f.setLocalMatrix(matrix);
        return sweepGradientM11126f;
    }
}
