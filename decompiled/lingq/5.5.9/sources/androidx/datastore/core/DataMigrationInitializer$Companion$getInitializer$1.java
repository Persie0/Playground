package androidx.datastore.core;

import cm.InterfaceC2056p;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p129g3.InterfaceC5686c;
import p129g3.InterfaceC5689f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@"}, m13365d2 = {"T", "Lg3/f;", "api", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
@InterfaceC10224c(m19205c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", m19206f = "DataMigrationInitializer.kt", m19207l = {33}, m19208m = "invokeSuspend")
final class DataMigrationInitializer$Companion$getInitializer$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC5689f<Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f5636e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f5637f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<InterfaceC5686c<Object>> f5638g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$getInitializer$1(List<? extends InterfaceC5686c<Object>> list, InterfaceC9968c<? super DataMigrationInitializer$Companion$getInitializer$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f5638g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.f5638g, interfaceC9968c);
        dataMigrationInitializer$Companion$getInitializer$1.f5637f = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC5689f<Object> interfaceC5689f, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) mo1336a(interfaceC5689f, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f5636e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC5689f interfaceC5689f = (InterfaceC5689f) this.f5637f;
            C0794a.a aVar = C0794a.f5757a;
            this.f5636e = 1;
            if (C0794a.a.m3016a(aVar, this.f5638g, interfaceC5689f, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
