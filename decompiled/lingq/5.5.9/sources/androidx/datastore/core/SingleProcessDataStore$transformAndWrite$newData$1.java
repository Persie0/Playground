package androidx.datastore.core;

import cm.InterfaceC2056p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Lno/z;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", m19206f = "SingleProcessDataStore.kt", m19207l = {402}, m19208m = "invokeSuspend")
final class SingleProcessDataStore$transformAndWrite$newData$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<Object>, Object> {

    /* JADX INFO: renamed from: e */
    public int f5747e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2056p<Object, InterfaceC9968c<Object>, Object> f5748f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f5749g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore$transformAndWrite$newData$1(InterfaceC2056p<Object, ? super InterfaceC9968c<Object>, ? extends Object> interfaceC2056p, Object obj, InterfaceC9968c<? super SingleProcessDataStore$transformAndWrite$newData$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f5748f = interfaceC2056p;
        this.f5749g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.f5748f, this.f5749g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<Object> interfaceC9968c) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f5747e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            this.f5747e = 1;
            obj = this.f5748f.mo1337m0(this.f5749g, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return obj;
    }
}
