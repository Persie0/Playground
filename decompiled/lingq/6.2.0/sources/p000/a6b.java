package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class a6b extends z5b {

    /* JADX INFO: renamed from: x */
    public static final f6b f299x = f6b.m11570g(null, WindowInsets.CONSUMED);

    public a6b(f6b f6bVar, WindowInsets windowInsets) {
        super(f6bVar, windowInsets);
    }

    @Override // p000.y5b, p000.u5b, p000.c6b
    /* JADX INFO: renamed from: i */
    public l64 mo136i(int i) {
        return l64.m15831d(this.f63458c.getInsets(e6b.m10895a(i)));
    }

    @Override // p000.y5b, p000.u5b, p000.c6b
    /* JADX INFO: renamed from: j */
    public l64 mo137j(int i) {
        return l64.m15831d(this.f63458c.getInsetsIgnoringVisibility(e6b.m10895a(i)));
    }

    @Override // p000.u5b, p000.c6b
    /* JADX INFO: renamed from: p */
    public void mo138p(View view) {
    }

    @Override // p000.y5b, p000.u5b, p000.c6b
    /* JADX INFO: renamed from: u */
    public boolean mo139u(int i) {
        return this.f63458c.isVisible(e6b.m10895a(i));
    }

    public a6b(f6b f6bVar, a6b a6bVar) {
        super(f6bVar, a6bVar);
    }
}
