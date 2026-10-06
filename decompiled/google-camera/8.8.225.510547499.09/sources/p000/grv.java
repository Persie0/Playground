package p000;

import android.graphics.Rect;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class grv implements Runnable {

    /* JADX INFO: renamed from: c */
    public final grk f26185c;

    /* JADX INFO: renamed from: d */
    protected final Executor f26186d;

    /* JADX INFO: renamed from: e */
    public final long f26187e;

    /* JADX INFO: renamed from: f */
    protected final grm f26188f;

    /* JADX INFO: renamed from: g */
    protected final gyh f26189g;

    /* JADX INFO: renamed from: h */
    protected final int f26190h;

    public grv(grm grmVar, Executor executor, grk grkVar, int i, gyh gyhVar) {
        this.f26188f = grmVar;
        this.f26187e = grmVar.f26152a.mo7248d();
        this.f26186d = executor;
        this.f26185c = grkVar;
        this.f26190h = i;
        this.f26189g = gyhVar;
    }

    /* JADX INFO: renamed from: h */
    public static final Rect m9687h(int i, int i2, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, i, i2);
        }
        Rect rect2 = new Rect(rect);
        if (rect.top > rect.bottom || rect.left > rect.right || rect.width() <= 0 || rect.height() <= 0) {
            return new Rect(0, 0, 0, 0);
        }
        rect2.left = Math.max(rect2.left, 0);
        rect2.top = Math.max(rect2.top, 0);
        rect2.right = Math.max(Math.min(rect2.right, i), rect2.left);
        rect2.bottom = Math.max(Math.min(rect2.bottom, i2), rect2.top);
        return (rect2.width() <= 0 || rect2.height() <= 0) ? new Rect(0, 0, 0, 0) : rect2;
    }

    /* JADX INFO: renamed from: i */
    public static final Rect m9688i(kpw kpwVar, Rect rect) {
        return m9687h(kpwVar.mo7247c(), kpwVar.mo7246b(), rect);
    }

    /* JADX INFO: renamed from: j */
    public final void m9689j(long j, grt grtVar, int i) {
        ((grc) this.f26185c).f26118k.mo8957b(new gru(j, grtVar, i));
    }
}
