package p000;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mvs extends mvl implements Set {
    protected mvs() {
    }

    @Override // p000.mvl
    /* JADX INFO: renamed from: b */
    protected /* bridge */ /* synthetic */ Collection mo3817b() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    protected abstract Set mo16874c();

    /* JADX INFO: renamed from: d */
    protected final boolean m17031d(Collection collection) {
        collection.getClass();
        return mpw.m16753E(this, collection);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || mo16874c().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return mo16874c().hashCode();
    }
}
