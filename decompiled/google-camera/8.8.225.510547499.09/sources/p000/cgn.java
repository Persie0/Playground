package p000;

import android.graphics.PointF;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgn {

    /* JADX INFO: renamed from: a */
    public static final PointF[] f5642a = new PointF[0];

    /* JADX INFO: renamed from: b */
    public final cgz f5643b;

    /* JADX INFO: renamed from: c */
    public final Executor f5644c;

    public cgn(cgz cgzVar, Executor executor) {
        this.f5643b = cgzVar;
        this.f5644c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m3648a(float f) {
        cgz cgzVar = this.f5643b;
        cgzVar.setPivotX(cgzVar.getWidth());
        this.f5643b.setPivotY(0.0f);
        this.f5644c.execute(new euw(this, f, 1));
    }
}
