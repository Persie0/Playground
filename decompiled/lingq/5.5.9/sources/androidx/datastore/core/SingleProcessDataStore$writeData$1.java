package androidx.datastore.core;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore", m19206f = "SingleProcessDataStore.kt", m19207l = {426}, m19208m = "writeData$datastore_core")
public final class SingleProcessDataStore$writeData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SingleProcessDataStore f5750d;

    /* JADX INFO: renamed from: e */
    public File f5751e;

    /* JADX INFO: renamed from: f */
    public FileOutputStream f5752f;

    /* JADX INFO: renamed from: g */
    public FileOutputStream f5753g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f5754h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SingleProcessDataStore<T> f5755i;

    /* JADX INFO: renamed from: j */
    public int f5756j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$writeData$1(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC9968c<? super SingleProcessDataStore$writeData$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5755i = singleProcessDataStore;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to androidx.datastore.core.SingleProcessDataStore$writeData$1 for r5v1 'this'  wl.c
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
            r5.f5754h = r6
            int r6 = r5.f5756j
            r3 = 1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 2
            r6 = r6 | r0
            r3 = 7
            r5.f5756j = r6
            r4 = 5
            androidx.datastore.core.SingleProcessDataStore<T> r6 = r5.f5755i
            r3 = 1
            r0 = 0
            r4 = 7
            java.lang.Object r6 = r6.m3014k(r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$writeData$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
