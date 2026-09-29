package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import no.InterfaceC7861q;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore", m19206f = "SingleProcessDataStore.kt", m19207l = {276, 281, 284}, m19208m = "handleUpdate")
final class SingleProcessDataStore$handleUpdate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f5696d;

    /* JADX INFO: renamed from: e */
    public SingleProcessDataStore f5697e;

    /* JADX INFO: renamed from: f */
    public InterfaceC7861q f5698f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f5699g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SingleProcessDataStore<Object> f5700h;

    /* JADX INFO: renamed from: i */
    public int f5701i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$handleUpdate$1(SingleProcessDataStore<Object> singleProcessDataStore, InterfaceC9968c<? super SingleProcessDataStore$handleUpdate$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5700h = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f5699g = obj;
        this.f5701i |= Integer.MIN_VALUE;
        return SingleProcessDataStore.m3004c(this.f5700h, null, this);
    }
}
