package androidx.datastore.core;

import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore", m19206f = "SingleProcessDataStore.kt", m19207l = {402, 410}, m19208m = "transformAndWrite")
final class SingleProcessDataStore$transformAndWrite$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SingleProcessDataStore f5741d;

    /* JADX INFO: renamed from: e */
    public Object f5742e;

    /* JADX INFO: renamed from: f */
    public Object f5743f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f5744g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SingleProcessDataStore<Object> f5745h;

    /* JADX INFO: renamed from: i */
    public int f5746i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$1(SingleProcessDataStore<Object> singleProcessDataStore, InterfaceC9968c<? super SingleProcessDataStore$transformAndWrite$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5745h = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f5744g = obj;
        this.f5746i |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f5663k;
        return this.f5745h.m3013j(this, null, null);
    }
}
