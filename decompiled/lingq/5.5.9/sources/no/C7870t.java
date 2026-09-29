package no;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: no.t */
/* JADX INFO: loaded from: classes2.dex */
public class C7870t {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42968b = AtomicIntegerFieldUpdater.newUpdater(C7870t.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: a */
    public final Throwable f42969a;

    public C7870t(Throwable th2, boolean z10) {
        this.f42969a = th2;
        this._handled = z10 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: a */
    public final boolean m15614a() {
        return this._handled;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f42969a + ']';
    }
}
