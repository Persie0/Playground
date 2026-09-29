package p000;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C3211a;

/* JADX INFO: loaded from: classes.dex */
public final class ci1 extends C3211a {

    /* JADX INFO: renamed from: K */
    public final BufferOverflow f10110K;

    public ci1(int i, BufferOverflow bufferOverflow) {
        super(i);
        this.f10110K = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            v63.m23135m("This implementation does not support suspension for senders, use ", y38.m24933a(C3211a.class).m25414c(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        C3386nv.m17624j(ux5.m22989l("Buffered channel capacity must be at least 1, but ", i, " was specified"));
        throw null;
    }

    @Override // kotlinx.coroutines.channels.C3211a
    /* JADX INFO: renamed from: E */
    public final boolean mo4675E() {
        return this.f10110K == BufferOverflow.DROP_OLDEST;
    }

    /* JADX INFO: renamed from: T */
    public final Object m4676T(Object obj, boolean z) {
        BufferOverflow bufferOverflow = this.f10110K;
        BufferOverflow bufferOverflow2 = BufferOverflow.DROP_LATEST;
        xfa xfaVar = xfa.f68157a;
        if (bufferOverflow == bufferOverflow2) {
            Object objMo4677k = super.mo4677k(obj);
            return (!(objMo4677k instanceof iu0) || (objMo4677k instanceof hu0)) ? objMo4677k : xfaVar;
        }
        Object obj2 = fj0.f39173d;
        ku0 ku0Var = (ku0) C3211a.f47788f.get(this);
        while (true) {
            long andIncrement = C3211a.f47784b.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zM15455B = m15455B(andIncrement, false);
            int i = fj0.f39171b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (ku0Var.f7522e != j3) {
                ku0 ku0VarM15477s = m15477s(j3, ku0Var);
                if (ku0VarM15477s != null) {
                    ku0Var = ku0VarM15477s;
                } else if (zM15455B) {
                    return new hu0(m15480v());
                }
            }
            int iM15452c = C3211a.m15452c(this, ku0Var, i2, obj, j, obj2, zM15455B);
            if (iM15452c == 0) {
                ku0Var.m12572a();
                return xfaVar;
            }
            if (iM15452c != 1) {
                if (iM15452c != 2) {
                    if (iM15452c == 3) {
                        C3386nv.m17633t("unexpected");
                        return null;
                    }
                    if (iM15452c == 4) {
                        if (j < C3211a.f47785c.get(this)) {
                            ku0Var.m12572a();
                        }
                        return new hu0(m15480v());
                    }
                    if (iM15452c == 5) {
                        ku0Var.m12572a();
                    }
                } else {
                    if (zM15455B) {
                        ku0Var.m3064n();
                        return new hu0(m15480v());
                    }
                    z1b z1bVar = obj2 instanceof z1b ? (z1b) obj2 : null;
                    if (z1bVar != null) {
                        z1bVar.mo10138a(ku0Var, i2 + i);
                    }
                    m15473n((ku0Var.f7522e * j2) + ((long) i2));
                }
            }
            return xfaVar;
        }
    }

    @Override // kotlinx.coroutines.channels.C3211a, p000.yv8
    /* JADX INFO: renamed from: k */
    public final Object mo4677k(Object obj) {
        return m4676T(obj, false);
    }

    @Override // kotlinx.coroutines.channels.C3211a, p000.yv8
    /* JADX INFO: renamed from: m */
    public final Object mo4678m(Object obj, Continuation continuation) throws Throwable {
        if (m4676T(obj, true) instanceof hu0) {
            throw m15480v();
        }
        return xfa.f68157a;
    }
}
