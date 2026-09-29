package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore", m19206f = "SingleProcessDataStore.kt", m19207l = {359, 362, 365}, m19208m = "readDataOrHandleCorruption")
public final class SingleProcessDataStore$readDataOrHandleCorruption$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f5736d;

    /* JADX INFO: renamed from: e */
    public Object f5737e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f5738f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SingleProcessDataStore<T> f5739g;

    /* JADX INFO: renamed from: h */
    public int f5740h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readDataOrHandleCorruption$1(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC9968c<? super SingleProcessDataStore$readDataOrHandleCorruption$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5739g = singleProcessDataStore;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 for r5v1 'this'  wl.c
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
            r1.f5738f = r6
            int r6 = r1.f5740h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3
            r6 = r6 | r0
            r1.f5740h = r6
            r3 = 1
            java.util.LinkedHashSet r6 = androidx.datastore.core.SingleProcessDataStore.f5663k
            androidx.datastore.core.SingleProcessDataStore<T> r6 = r1.f5739g
            r4 = 2
            java.lang.Object r6 = r6.m3012i(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
