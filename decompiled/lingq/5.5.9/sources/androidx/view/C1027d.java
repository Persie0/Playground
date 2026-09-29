package androidx.view;

import ae.C0062b;
import dm.C5207g;
import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import no.InterfaceC7882z;

/* JADX INFO: renamed from: androidx.lifecycle.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1027d implements Closeable, InterfaceC7882z {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f6636a;

    public C1027d(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        this.f6636a = coroutineContext;
    }

    @Override // no.InterfaceC7882z
    /* JADX INFO: renamed from: G0 */
    public final CoroutineContext getF6528b() {
        return this.f6636a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0062b.m330a0(this.f6636a, null);
    }
}
