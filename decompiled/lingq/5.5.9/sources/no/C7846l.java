package no;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: no.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C7846l extends C7870t {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42945c = AtomicIntegerFieldUpdater.newUpdater(C7846l.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    public C7846l(InterfaceC9968c<?> interfaceC9968c, Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + interfaceC9968c + " was cancelled normally");
        }
        super(th2, z10);
        this._resumed = 0;
    }
}
