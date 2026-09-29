package androidx.compose.foundation.style;

import java.util.Iterator;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.C0006a4;
import p000.C3386nv;
import p000.e83;
import p000.gm9;
import p000.kj7;
import p000.lj7;
import p000.mj7;
import p000.q84;
import p000.q93;
import p000.r93;
import p000.rv3;
import p000.sv3;
import p000.v66;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.style.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0156a implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0006a4 f2738a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v66 f2739b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0006a4 f2740c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0006a4 f2741d;

    public C0156a(C0006a4 c0006a4, v66 v66Var, C0006a4 c0006a5, C0006a4 c0006a6) {
        this.f2738a = c0006a4;
        this.f2739b = v66Var;
        this.f2740c = c0006a5;
        this.f2741d = c0006a6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.e83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(q84 q84Var, Continuation continuation) throws Throwable {
        MutableStyleState$processInteractions$2$emit$1 mutableStyleState$processInteractions$2$emit$1;
        v66 v66Var;
        Iterator it;
        if (continuation instanceof MutableStyleState$processInteractions$2$emit$1) {
            mutableStyleState$processInteractions$2$emit$1 = (MutableStyleState$processInteractions$2$emit$1) continuation;
            int i = mutableStyleState$processInteractions$2$emit$1.f2729f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mutableStyleState$processInteractions$2$emit$1.f2729f = i - Integer.MIN_VALUE;
            } else {
                mutableStyleState$processInteractions$2$emit$1 = new MutableStyleState$processInteractions$2$emit$1(this, continuation);
            }
        } else {
            mutableStyleState$processInteractions$2$emit$1 = new MutableStyleState$processInteractions$2$emit$1(this, continuation);
        }
        Object obj = mutableStyleState$processInteractions$2$emit$1.f2727d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mutableStyleState$processInteractions$2$emit$1.f2729f;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            boolean z = q84Var instanceof lj7;
            C0006a4 c0006a4 = this.f2738a;
            v66Var = this.f2739b;
            if (z) {
                c0006a4.m95a(q84Var);
                v66Var.m23151c(true);
                return xfaVar;
            }
            if (q84Var instanceof mj7) {
                c0006a4.m96c(((mj7) q84Var).f51399a);
                v66Var.m23151c(c0006a4.f193a != null);
                return xfaVar;
            }
            if (q84Var instanceof kj7) {
                c0006a4.m96c(((kj7) q84Var).f47397a);
                v66Var.m23151c(c0006a4.f193a != null);
                return xfaVar;
            }
            boolean z2 = q84Var instanceof rv3;
            C0006a4 c0006a5 = this.f2740c;
            if (z2) {
                c0006a5.m95a(q84Var);
                v66Var.m23150b(true);
                return xfaVar;
            }
            if (q84Var instanceof sv3) {
                c0006a5.m96c(((sv3) q84Var).f61480a);
                v66Var.m23150b(c0006a5.f193a != null);
                return xfaVar;
            }
            boolean z3 = q84Var instanceof q93;
            C0006a4 c0006a6 = this.f2741d;
            if (z3) {
                c0006a6.m95a(q84Var);
                v66Var.m23149a(true);
                return xfaVar;
            }
            if (q84Var instanceof r93) {
                c0006a6.m96c(((r93) q84Var).f58940a);
                v66Var.m23149a(c0006a6.f193a != null);
                return xfaVar;
            }
            it = v66Var.f64936b.f9941b.iterator();
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = mutableStyleState$processInteractions$2$emit$1.f2726c;
            v66 v66Var2 = mutableStyleState$processInteractions$2$emit$1.f2725b;
            q84 q84Var2 = mutableStyleState$processInteractions$2$emit$1.f2724a;
            AbstractC3193b.m15359b(obj);
            v66Var = v66Var2;
            q84Var = q84Var2;
        }
        while (it.hasNext()) {
            gm9 gm9Var = (gm9) ((Map.Entry) it.next()).getKey();
            mutableStyleState$processInteractions$2$emit$1.f2724a = q84Var;
            mutableStyleState$processInteractions$2$emit$1.f2725b = v66Var;
            mutableStyleState$processInteractions$2$emit$1.f2726c = it;
            mutableStyleState$processInteractions$2$emit$1.f2729f = 1;
            gm9Var.getClass();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (xfaVar == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
