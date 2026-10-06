package p000;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mvp extends mvl implements myy {
    protected mvp() {
    }

    @Override // p000.mvl
    /* JADX INFO: renamed from: b */
    protected /* bridge */ /* synthetic */ Collection mo3817b() {
        throw null;
    }

    @Override // p000.myy
    /* JADX INFO: renamed from: co */
    public final int mo16911co(Object obj) {
        return mo17015o().mo16911co(obj);
    }

    @Override // p000.myy
    /* JADX INFO: renamed from: d */
    public int mo16918d(Object obj, int i) {
        return mo17015o().mo16918d(obj, Integer.MAX_VALUE);
    }

    @Override // java.util.Collection, p000.myy
    public final boolean equals(Object obj) {
        return obj == this || mo17015o().equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public Set mo16920f() {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public Set mo16921g() {
        throw null;
    }

    @Override // p000.myy
    /* JADX INFO: renamed from: h */
    public void mo16922h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection, p000.myy
    public final int hashCode() {
        return mo17015o().hashCode();
    }

    @Override // p000.myy
    /* JADX INFO: renamed from: i */
    public boolean mo16923i(Object obj, int i) {
        return mo17015o().mo16923i(obj, i);
    }

    /* JADX INFO: renamed from: o */
    protected abstract myy mo17015o();
}
