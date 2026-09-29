package p000;

import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class ofa extends cn8 {

    /* JADX INFO: renamed from: g */
    public final ThreadLocal f54284g;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public ofa(kn1 kn1Var, Continuation continuation) {
        wm0 wm0Var = wm0.f67043d;
        super(kn1Var.get(wm0Var) == null ? kn1Var.plus(wm0Var) : kn1Var, continuation);
        this.f54284g = new ThreadLocal();
        if (continuation.getContext().get(jj5.f45612c) instanceof nn1) {
            return;
        }
        Object objM20372O = r46.m20372O(kn1Var, null);
        r46.m20367J(kn1Var, objM20372O);
        m17965t0(kn1Var, objM20372O);
    }

    @Override // p000.cn8
    /* JADX INFO: renamed from: q0 */
    public final void mo4899q0() {
        m17964s0();
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m17963r0() {
        boolean z = this.threadLocalIsSet && this.f54284g.get() == null;
        this.f54284g.remove();
        return !z;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m17964s0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f54284g.get();
            if (pair != null) {
                r46.m20367J((kn1) pair.f47623a, pair.f47624b);
            }
            this.f54284g.remove();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m17965t0(kn1 kn1Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f54284g.set(new Pair(kn1Var, obj));
    }

    @Override // p000.cn8, kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: v */
    public final void mo4901v(Object obj) {
        m17964s0();
        Object objM10550z = do7.m10550z(obj);
        Continuation continuation = this.f10336f;
        kn1 context = continuation.getContext();
        Object objM20372O = r46.m20372O(context, null);
        ofa ofaVarM21986S = objM20372O != r46.f58686p ? te1.m21986S(continuation, context, objM20372O) : null;
        try {
            continuation.resumeWith(objM10550z);
        } finally {
            if (ofaVarM21986S == null || ofaVarM21986S.m17963r0()) {
                r46.m20367J(context, objM20372O);
            }
        }
    }
}
