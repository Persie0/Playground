package androidx.room;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.fa4;
import p000.hi1;
import p000.sb2;
import p000.ui3;
import p000.vl1;
import p000.vz1;
import p000.xfa;
import p000.yn9;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class RoomDatabase$closeBarrier$1 extends FunctionReferenceImpl implements ui3 {
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() throws Exception {
        AbstractC0746d abstractC0746d = (AbstractC0746d) this.f47704b;
        vl1 vl1Var = abstractC0746d.f6954a;
        if (vl1Var == null) {
            fa4.m11636J("coroutineScope");
            throw null;
        }
        vz1.m23637j(vl1Var, null);
        abstractC0746d.m2836i();
        sb2 sb2Var = abstractC0746d.f6958e;
        if (sb2Var == null) {
            fa4.m11636J("connectionManager");
            throw null;
        }
        ((hi1) sb2Var.f60617g).close();
        yn9 yn9Var = (yn9) sb2Var.f60618h;
        if (yn9Var != null) {
            yn9Var.close();
        }
        return xfa.f68157a;
    }
}
