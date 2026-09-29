package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b6b extends a6b {
    public b6b(f6b f6bVar, WindowInsets windowInsets) {
        super(f6bVar, windowInsets);
    }

    @Override // p000.u5b, p000.c6b
    /* JADX INFO: renamed from: f */
    public List<Rect> mo3378f(int i) {
        return this.f63458c.getBoundingRects(e6b.m10895a(i));
    }

    @Override // p000.u5b, p000.c6b
    /* JADX INFO: renamed from: g */
    public List<Rect> mo3379g(int i) {
        return this.f63458c.getBoundingRectsIgnoringVisibility(e6b.m10895a(i));
    }

    @Override // p000.u5b, p000.c6b
    /* JADX INFO: renamed from: q */
    public void mo3380q() {
    }

    public b6b(f6b f6bVar, b6b b6bVar) {
        super(f6bVar, b6bVar);
    }
}
