package androidx.datastore.core;

import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p129g3.AbstractC5692i;
import p129g3.C5685b;
import p129g3.C5688e;
import p129g3.C5690g;
import p129g3.C5693j;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m13365d2 = {"T", "Landroidx/datastore/core/SingleProcessDataStore$a;", "msg", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore$actor$3", m19206f = "SingleProcessDataStore.kt", m19207l = {239, 242}, m19208m = "invokeSuspend")
final class SingleProcessDataStore$actor$3 extends SuspendLambda implements InterfaceC2056p<SingleProcessDataStore.AbstractC0790a<Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f5682e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f5683f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SingleProcessDataStore<Object> f5684g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore<Object> singleProcessDataStore, InterfaceC9968c<? super SingleProcessDataStore$actor$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f5684g = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.f5684g, interfaceC9968c);
        singleProcessDataStore$actor$3.f5683f = obj;
        return singleProcessDataStore$actor$3;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(SingleProcessDataStore.AbstractC0790a<Object> abstractC0790a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SingleProcessDataStore$actor$3) mo1336a(abstractC0790a, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objM3010g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f5682e;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        } else {
            C7499b.m14977z0(obj);
            SingleProcessDataStore.AbstractC0790a abstractC0790a = (SingleProcessDataStore.AbstractC0790a) this.f5683f;
            boolean z10 = abstractC0790a instanceof SingleProcessDataStore.AbstractC0790a.a;
            SingleProcessDataStore<Object> singleProcessDataStore = this.f5684g;
            if (z10) {
                SingleProcessDataStore.AbstractC0790a.a aVar = (SingleProcessDataStore.AbstractC0790a.a) abstractC0790a;
                this.f5682e = 1;
                AbstractC5692i abstractC5692i = (AbstractC5692i) singleProcessDataStore.f5672h.getValue();
                if (abstractC5692i instanceof C5685b) {
                    objM3010g = C9072e.f47360a;
                } else if (abstractC5692i instanceof C5690g) {
                    if (abstractC5692i != aVar.f5675a || (objM3010g = singleProcessDataStore.m3010g(this)) != coroutineSingletons) {
                        objM3010g = C9072e.f47360a;
                    }
                } else if (C5207g.m11106a(abstractC5692i, C5693j.f34671a)) {
                    objM3010g = singleProcessDataStore.m3010g(this);
                    if (objM3010g != coroutineSingletons) {
                        objM3010g = C9072e.f47360a;
                    }
                } else {
                    if (abstractC5692i instanceof C5688e) {
                        throw new IllegalStateException("Can't read in final state.".toString());
                    }
                    objM3010g = C9072e.f47360a;
                }
                if (objM3010g == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (abstractC0790a instanceof SingleProcessDataStore.AbstractC0790a.b) {
                this.f5682e = 2;
                if (SingleProcessDataStore.m3004c(singleProcessDataStore, (SingleProcessDataStore.AbstractC0790a.b) abstractC0790a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return C9072e.f47360a;
    }
}
