package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import no.InterfaceC7882z;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C7155e implements InterfaceC7882z {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f40418a;

    public C7155e(CoroutineContext coroutineContext) {
        this.f40418a = coroutineContext;
    }

    @Override // no.InterfaceC7882z
    /* JADX INFO: renamed from: G0 */
    public final CoroutineContext mo3889G0() {
        return this.f40418a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f40418a + ')';
    }
}
