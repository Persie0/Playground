package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class msu extends mvs {

    /* JADX INFO: renamed from: a */
    final Set f41561a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ msv f41562b;

    public msu(msv msvVar) {
        this.f41562b = msvVar;
        this.f41561a = msvVar.f41564b.keySet();
    }

    @Override // p000.mvl, p000.mvq
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object mo3817b() {
        return this.f41561a;
    }

    @Override // p000.mvs, p000.mvl
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ Collection mo3817b() {
        return this.f41561a;
    }

    @Override // p000.mvs
    /* JADX INFO: renamed from: c */
    protected final Set mo3816a() {
        return this.f41561a;
    }

    @Override // p000.mvl, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return mkv.m16495C(this.f41562b.entrySet().iterator());
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return m17030u();
    }

    @Override // p000.mvq
    public final String toString() {
        StringBuilder sbM15649c = lku.m15649c(size());
        sbM15649c.append('[');
        boolean z = true;
        for (Object obj : this) {
            if (!z) {
                sbM15649c.append(", ");
            }
            z = false;
            if (obj == this) {
                sbM15649c.append("(this Collection)");
            } else {
                sbM15649c.append(obj);
            }
        }
        sbM15649c.append(']');
        return sbM15649c.toString();
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return mkv.m16550o(this, objArr);
    }
}
