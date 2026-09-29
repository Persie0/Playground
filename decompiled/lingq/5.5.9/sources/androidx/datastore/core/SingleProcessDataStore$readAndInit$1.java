package androidx.datastore.core;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore", m19206f = "SingleProcessDataStore.kt", m19207l = {322, 348, 505}, m19208m = "readAndInit")
public final class SingleProcessDataStore$readAndInit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SingleProcessDataStore f5702d;

    /* JADX INFO: renamed from: e */
    public Object f5703e;

    /* JADX INFO: renamed from: f */
    public Serializable f5704f;

    /* JADX INFO: renamed from: g */
    public Object f5705g;

    /* JADX INFO: renamed from: h */
    public SingleProcessDataStore$readAndInit$api$1 f5706h;

    /* JADX INFO: renamed from: i */
    public Iterator f5707i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f5708j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ SingleProcessDataStore<T> f5709k;

    /* JADX INFO: renamed from: l */
    public int f5710l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$1(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC9968c<? super SingleProcessDataStore$readAndInit$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5709k = singleProcessDataStore;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to androidx.datastore.core.SingleProcessDataStore$readAndInit$1 for r5v1 'this'  wl.c
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
            r1.f5708j = r6
            int r6 = r1.f5710l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3
            r6 = r6 | r0
            r1.f5710l = r6
            java.util.LinkedHashSet r6 = androidx.datastore.core.SingleProcessDataStore.f5663k
            androidx.datastore.core.SingleProcessDataStore<T> r6 = r1.f5709k
            r3 = 6
            java.lang.Object r4 = r6.m3008e(r1)
            r6 = r4
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readAndInit$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
