package p000;

import com.google.android.gms.measurement.internal.zzbf;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cpb implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f34363a;

    public cpb(zzbf zzbfVar) {
        this.f34363a = zzbfVar.f12388a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34363a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f34363a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
