package p000;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class v5b extends u5b {

    /* JADX INFO: renamed from: s */
    public l64 f64899s;

    public v5b(f6b f6bVar, v5b v5bVar) {
        super(f6bVar, v5bVar);
        this.f64899s = null;
        this.f64899s = v5bVar.f64899s;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: b */
    public f6b mo4361b() {
        return f6b.m11570g(null, this.f63458c.consumeStableInsets());
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: c */
    public f6b mo4362c() {
        return f6b.m11570g(null, this.f63458c.consumeSystemWindowInsets());
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: l */
    public final l64 mo4367l() {
        if (this.f64899s == null) {
            WindowInsets windowInsets = this.f63458c;
            this.f64899s = l64.m15830c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f64899s;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: s */
    public boolean mo4372s() {
        return this.f63458c.isConsumed();
    }

    public v5b(f6b f6bVar, WindowInsets windowInsets) {
        super(f6bVar, windowInsets);
        this.f64899s = null;
    }
}
