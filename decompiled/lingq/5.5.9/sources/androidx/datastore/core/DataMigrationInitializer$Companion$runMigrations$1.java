package androidx.datastore.core;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.datastore.core.DataMigrationInitializer$Companion", m19206f = "DataMigrationInitializer.kt", m19207l = {42, 57}, m19208m = "runMigrations")
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Serializable f5639d;

    /* JADX INFO: renamed from: e */
    public Iterator f5640e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f5641f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0794a.a f5642g;

    /* JADX INFO: renamed from: h */
    public int f5643h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$1(C0794a.a aVar, InterfaceC9968c<? super DataMigrationInitializer$Companion$runMigrations$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5642g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f5641f = obj;
        this.f5643h |= Integer.MIN_VALUE;
        return C0794a.a.m3016a(this.f5642g, null, null, this);
    }
}
