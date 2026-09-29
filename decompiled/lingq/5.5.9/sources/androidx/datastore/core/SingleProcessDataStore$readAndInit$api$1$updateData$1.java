package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", m19206f = "SingleProcessDataStore.kt", m19207l = {503, 337, 339}, m19208m = "updateData")
public final class SingleProcessDataStore$readAndInit$api$1$updateData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f5715d;

    /* JADX INFO: renamed from: e */
    public Object f5716e;

    /* JADX INFO: renamed from: f */
    public Object f5717f;

    /* JADX INFO: renamed from: g */
    public Ref$ObjectRef f5718g;

    /* JADX INFO: renamed from: h */
    public SingleProcessDataStore f5719h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f5720i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ SingleProcessDataStore$readAndInit$api$1 f5721j;

    /* JADX INFO: renamed from: k */
    public int f5722k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$api$1$updateData$1(SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, InterfaceC9968c<? super SingleProcessDataStore$readAndInit$api$1$updateData$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5721j = singleProcessDataStore$readAndInit$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f5720i = obj;
        this.f5722k |= Integer.MIN_VALUE;
        return this.f5721j.mo3015b(null, this);
    }
}
