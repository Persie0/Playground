package cc;

import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;

/* JADX INFO: renamed from: cc.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1910q implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f10139a;

    public C1910q(zzau zzauVar) {
        this.f10139a = zzauVar.f14612a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10139a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f10139a.next();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
