package p000;

import kotlinx.coroutines.C3213d;
import kotlinx.coroutines.internal.C3245a;

/* JADX INFO: loaded from: classes.dex */
public abstract class be4 extends C3245a implements ci2, e34 {

    /* JADX INFO: renamed from: g */
    public C3213d f8428g;

    @Override // p000.ci2
    /* JADX INFO: renamed from: a */
    public final void mo125a() {
        m3668q().m15510g0(this);
    }

    @Override // p000.e34
    /* JADX INFO: renamed from: b */
    public final boolean mo3666b() {
        return true;
    }

    @Override // p000.e34
    /* JADX INFO: renamed from: d */
    public final ul6 mo3667d() {
        return null;
    }

    public cd4 getParent() {
        return m3668q();
    }

    /* JADX INFO: renamed from: q */
    public final C3213d m3668q() {
        C3213d c3213d = this.f8428g;
        if (c3213d != null) {
            return c3213d;
        }
        fa4.m11636J("job");
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo3669r();

    /* JADX INFO: renamed from: s */
    public abstract void mo3670s(Throwable th);

    @Override // kotlinx.coroutines.internal.C3245a
    public final String toString() {
        return getClass().getSimpleName() + '@' + d32.m10016N(this) + "[job@" + d32.m10016N(m3668q()) + ']';
    }
}
