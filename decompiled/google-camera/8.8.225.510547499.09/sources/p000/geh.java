package p000;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class geh implements gfg {

    /* JADX INFO: renamed from: a */
    public final oju f24377a;

    /* JADX INFO: renamed from: b */
    public final jwn f24378b;

    /* JADX INFO: renamed from: c */
    public final jvd f24379c;

    /* JADX INFO: renamed from: d */
    public gfn f24380d;

    /* JADX INFO: renamed from: e */
    public final jvb f24381e;

    /* JADX INFO: renamed from: f */
    private final SparseIntArray f24382f = new SparseIntArray();

    /* JADX INFO: renamed from: g */
    private final SparseArray f24383g = new SparseArray();

    public geh(oju ojuVar, jwn jwnVar, jvd jvdVar, jvb jvbVar) {
        this.f24377a = ojuVar;
        this.f24378b = jwnVar;
        this.f24379c = jvdVar;
        this.f24381e = jvbVar;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m9093j(int i) {
        return this.f24382f.indexOfKey(i) >= 0;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: a */
    public final void mo5759a() {
        this.f24380d.mo4220c();
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5760b() {
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo5761c() {
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: d */
    public final void mo5762d() {
        this.f24380d.mo4221d();
    }

    /* JADX INFO: renamed from: e */
    public final void m9094e() {
        this.f24380d.setEnabled(false);
        this.f24380d.mo4218a();
    }

    /* JADX INFO: renamed from: f */
    public final void m9095f() {
        if (this.f24380d.mo4229l()) {
            this.f24380d.mo4226i();
            m9096g();
            this.f24380d.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9096g() {
        if (this.f24380d.mo4230m()) {
            this.f24380d.mo4225h(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m9097h(String str, boolean z, int i, String str2) {
        if (!this.f24383g.contains(i)) {
            this.f24383g.put(i, new HashSet());
        }
        Set set = (Set) this.f24383g.get(i);
        if (z) {
            set.add(str);
        } else {
            set.remove(str);
        }
        boolean z2 = !set.isEmpty();
        int i2 = 0;
        if (!z2) {
            if (m9093j(i)) {
                int i3 = this.f24382f.get(i);
                this.f24382f.delete(i);
                this.f24380d.mo4222e(i3, false, 0, null);
                return;
            }
            return;
        }
        if (m9093j(i)) {
            return;
        }
        str2.getClass();
        while (true) {
            this.f24380d.mo4231n();
            if (i2 >= 4) {
                throw new IllegalStateException("All extended items are occupied.");
            }
            if (this.f24382f.indexOfValue(i2) < 0) {
                this.f24380d.mo4222e(i2, true, i, str2);
                this.f24382f.put(i, i2);
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9098i(boolean z) {
        boolean z2 = z && ((gfa) this.f24377a.get()).mo9105D() && this.f24380d.mo4229l();
        this.f24380d.setVisibility(true != z ? 8 : 0);
        this.f24380d.setEnabled(z2);
    }
}
