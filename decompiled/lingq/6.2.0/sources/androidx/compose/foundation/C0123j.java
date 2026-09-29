package androidx.compose.foundation;

import androidx.compose.p002ui.input.pointer.PointerEventPass;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.d16;
import p000.fg7;
import p000.ng7;
import p000.rv3;
import p000.sv3;
import p000.v56;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0123j extends d16 implements ng7 {

    /* JADX INFO: renamed from: J */
    public v56 f2396J;

    /* JADX INFO: renamed from: K */
    public rv3 f2397K;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Z0 */
    public static final Object m958Z0(C0123j c0123j, ContinuationImpl continuationImpl) throws Throwable {
        HoverableNode$emitEnter$1 hoverableNode$emitEnter$1;
        rv3 rv3Var;
        if (continuationImpl instanceof HoverableNode$emitEnter$1) {
            hoverableNode$emitEnter$1 = (HoverableNode$emitEnter$1) continuationImpl;
            int i = hoverableNode$emitEnter$1.f1680d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitEnter$1.f1680d = i - Integer.MIN_VALUE;
            } else {
                hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(c0123j, continuationImpl);
            }
        } else {
            hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(c0123j, continuationImpl);
        }
        Object obj = hoverableNode$emitEnter$1.f1678b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = hoverableNode$emitEnter$1.f1680d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (c0123j.f2397K == null) {
                rv3 rv3Var2 = new rv3();
                v56 v56Var = c0123j.f2396J;
                hoverableNode$emitEnter$1.f1677a = rv3Var2;
                hoverableNode$emitEnter$1.f1680d = 1;
                if (v56Var.m23125a(rv3Var2, hoverableNode$emitEnter$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rv3Var = rv3Var2;
            }
            return xfa.f68157a;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rv3Var = hoverableNode$emitEnter$1.f1677a;
        AbstractC3193b.m15359b(obj);
        c0123j.f2397K = rv3Var;
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a1 */
    public static final Object m959a1(C0123j c0123j, ContinuationImpl continuationImpl) throws Throwable {
        HoverableNode$emitExit$1 hoverableNode$emitExit$1;
        if (continuationImpl instanceof HoverableNode$emitExit$1) {
            hoverableNode$emitExit$1 = (HoverableNode$emitExit$1) continuationImpl;
            int i = hoverableNode$emitExit$1.f1683c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitExit$1.f1683c = i - Integer.MIN_VALUE;
            } else {
                hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(c0123j, continuationImpl);
            }
        } else {
            hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(c0123j, continuationImpl);
        }
        Object obj = hoverableNode$emitExit$1.f1681a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = hoverableNode$emitExit$1.f1683c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            rv3 rv3Var = c0123j.f2397K;
            if (rv3Var != null) {
                sv3 sv3Var = new sv3(rv3Var);
                v56 v56Var = c0123j.f2396J;
                hoverableNode$emitExit$1.f1683c = 1;
                if (v56Var.m23125a(sv3Var, hoverableNode$emitExit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        c0123j.f2397K = null;
        return xfa.f68157a;
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: D */
    public final void mo786D(fg7 fg7Var, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            int i = fg7Var.f39076f;
            if (i == 4) {
                wfb.m23926u(m9971N0(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3);
            } else if (i == 5) {
                wfb.m23926u(m9971N0(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3);
            }
        }
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: K */
    public final void mo818K() {
        m960b1();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        m960b1();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m960b1() {
        rv3 rv3Var = this.f2397K;
        if (rv3Var != null) {
            this.f2396J.m23126b(new sv3(rv3Var));
            this.f2397K = null;
        }
    }
}
