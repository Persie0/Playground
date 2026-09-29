package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class y5b extends x5b {

    /* JADX INFO: renamed from: w */
    public static final f6b f69330w = f6b.m11570g(null, WindowInsets.CONSUMED);

    public y5b(f6b f6bVar, WindowInsets windowInsets) {
        super(f6bVar, windowInsets);
    }

    @Override // p000.u5b, p000.c6b
    /* JADX INFO: renamed from: d */
    public final void mo4363d(View view) {
    }

    @Override // p000.u5b, p000.c6b
    /* JADX INFO: renamed from: i */
    public l64 mo136i(int i) {
        return l64.m15831d(this.f63458c.getInsets(d6b.m10133a(i)));
    }

    @Override // p000.u5b, p000.c6b
    /* JADX INFO: renamed from: j */
    public l64 mo137j(int i) {
        return l64.m15831d(this.f63458c.getInsetsIgnoringVisibility(d6b.m10133a(i)));
    }

    @Override // p000.u5b, p000.c6b
    /* JADX INFO: renamed from: u */
    public boolean mo139u(int i) {
        return this.f63458c.isVisible(d6b.m10133a(i));
    }

    public y5b(f6b f6bVar, y5b y5bVar) {
        super(f6bVar, y5bVar);
    }
}
