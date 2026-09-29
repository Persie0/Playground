package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class mtb {

    /* JADX INFO: renamed from: d */
    public static final mtb f51835d = new mtb();

    /* JADX INFO: renamed from: a */
    public final Runnable f51836a;

    /* JADX INFO: renamed from: b */
    public final Executor f51837b;

    /* JADX INFO: renamed from: c */
    public mtb f51838c;

    public mtb() {
        this.f51836a = null;
        this.f51837b = null;
    }

    public mtb(Runnable runnable, Executor executor) {
        this.f51836a = runnable;
        this.f51837b = executor;
    }
}
