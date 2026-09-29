package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.fu8;
import p000.hu8;
import p000.lda;
import p000.ls6;
import p000.thb;
import p000.vi3;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3246a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m15585a(C3247b c3247b, long j, vi3 vi3Var) {
        ls6 ls6Var = new ls6(j);
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.f48164i;
        lda.m16119e(3, onTimeout$selectClause$1);
        fu8 fu8Var = new fu8(c3247b, ls6Var, onTimeout$selectClause$1, hu8.f42957a, thb.f62321q, (SuspendLambda) vi3Var, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3247b.f48168f;
        c3247b.m15592h(fu8Var, false);
    }
}
