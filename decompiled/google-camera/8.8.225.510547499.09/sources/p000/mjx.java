package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mjx {

    /* JADX INFO: renamed from: a */
    final mjj f40788a;

    /* JADX INFO: renamed from: b */
    protected mjw f40789b;

    public mjx(mjj mjjVar) {
        this.f40788a = mjjVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo16454a();

    /* JADX INFO: renamed from: b */
    public abstract int mo16455b();

    /* JADX INFO: renamed from: c */
    public abstract void mo16456c(Canvas canvas, Rect rect, float f);

    /* JADX INFO: renamed from: d */
    public abstract void mo16457d(Canvas canvas, Paint paint, float f, float f2, int i);

    /* JADX INFO: renamed from: e */
    public abstract void mo16458e(Canvas canvas, Paint paint);

    /* JADX INFO: renamed from: f */
    final void m16476f(Canvas canvas, Rect rect, float f) {
        this.f40788a.mo16449a();
        mo16456c(canvas, rect, f);
    }
}
