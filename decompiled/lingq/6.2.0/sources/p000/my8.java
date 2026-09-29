package p000;

import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: loaded from: classes2.dex */
public final class my8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final wb5 f52043a;

    /* JADX INFO: renamed from: b */
    public final Lifecycle$Event f52044b;

    /* JADX INFO: renamed from: c */
    public boolean f52045c;

    public my8(wb5 wb5Var, Lifecycle$Event lifecycle$Event) {
        wb5Var.getClass();
        lifecycle$Event.getClass();
        this.f52043a = wb5Var;
        this.f52044b = lifecycle$Event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f52045c) {
            return;
        }
        this.f52043a.m23833G(this.f52044b);
        this.f52045c = true;
    }
}
