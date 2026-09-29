package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore", m19206f = "SingleProcessDataStore.kt", m19207l = {311}, m19208m = "readAndInitOrPropagateFailure")
public final class SingleProcessDataStore$readAndInitOrPropagateFailure$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SingleProcessDataStore f5727d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f5728e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SingleProcessDataStore<T> f5729f;

    /* JADX INFO: renamed from: g */
    public int f5730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInitOrPropagateFailure$1(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC9968c<? super SingleProcessDataStore$readAndInitOrPropagateFailure$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5729f = singleProcessDataStore;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 for r5v1 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r6) {
        /*
            r5 = this;
            r1 = r5
            r1.f5728e = r6
            int r6 = r1.f5730g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3
            r6 = r6 | r0
            r1.f5730g = r6
            r4 = 4
            java.util.LinkedHashSet r6 = androidx.datastore.core.SingleProcessDataStore.f5663k
            androidx.datastore.core.SingleProcessDataStore<T> r6 = r1.f5729f
            r3 = 3
            java.lang.Object r6 = r6.m3010g(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
