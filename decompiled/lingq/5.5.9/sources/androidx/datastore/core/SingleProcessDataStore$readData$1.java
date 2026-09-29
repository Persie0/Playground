package androidx.datastore.core;

import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore", m19206f = "SingleProcessDataStore.kt", m19207l = {381}, m19208m = "readData")
public final class SingleProcessDataStore$readData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SingleProcessDataStore f5731d;

    /* JADX INFO: renamed from: e */
    public FileInputStream f5732e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f5733f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SingleProcessDataStore<T> f5734g;

    /* JADX INFO: renamed from: h */
    public int f5735h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readData$1(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC9968c<? super SingleProcessDataStore$readData$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5734g = singleProcessDataStore;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to androidx.datastore.core.SingleProcessDataStore$readData$1 for r4v1 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r5) {
        /*
            r4 = this;
            r4.f5733f = r5
            r2 = 3
            int r5 = r4.f5735h
            r2 = 2
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r1
            r5 = r5 | r0
            r4.f5735h = r5
            java.util.LinkedHashSet r5 = androidx.datastore.core.SingleProcessDataStore.f5663k
            r2 = 4
            androidx.datastore.core.SingleProcessDataStore<T> r5 = r4.f5734g
            r2 = 6
            java.lang.Object r5 = r5.m3011h(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readData$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
