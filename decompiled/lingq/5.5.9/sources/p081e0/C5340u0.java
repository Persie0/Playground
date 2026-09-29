package p081e0;

import androidx.compose.runtime.InterfaceC0476a;
import dm.C5207g;

/* JADX INFO: renamed from: e0.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5340u0<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0476a f33620a;

    public /* synthetic */ C5340u0(InterfaceC0476a interfaceC0476a) {
        this.f33620a = interfaceC0476a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5340u0) {
            return C5207g.m11106a(this.f33620a, ((C5340u0) obj).f33620a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33620a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f33620a + ')';
    }
}
