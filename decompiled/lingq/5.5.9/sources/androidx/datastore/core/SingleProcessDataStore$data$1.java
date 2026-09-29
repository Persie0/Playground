package androidx.datastore.core;

import ae.C0062b;
import cm.InterfaceC2056p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p129g3.AbstractC5692i;
import p129g3.C5685b;
import p129g3.C5688e;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m13365d2 = {"T", "Lkotlinx/coroutines/flow/d;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
@InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore$data$1", m19206f = "SingleProcessDataStore.kt", m19207l = {117}, m19208m = "invokeSuspend")
final class SingleProcessDataStore$data$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f5686e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f5687f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SingleProcessDataStore<Object> f5688g;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m13365d2 = {"T", "Lg3/i;", "it", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
    @InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", m19206f = "SingleProcessDataStore.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C07921 extends SuspendLambda implements InterfaceC2056p<AbstractC5692i<Object>, InterfaceC9968c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f5689e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AbstractC5692i<Object> f5690f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07921(AbstractC5692i<Object> abstractC5692i, InterfaceC9968c<? super C07921> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f5690f = abstractC5692i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C07921 c07921 = new C07921(this.f5690f, interfaceC9968c);
            c07921.f5689e = obj;
            return c07921;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC5692i<Object> abstractC5692i, InterfaceC9968c<? super Boolean> interfaceC9968c) {
            return ((C07921) mo1336a(abstractC5692i, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC5692i<Object> abstractC5692i = (AbstractC5692i) this.f5689e;
            AbstractC5692i<Object> abstractC5692i2 = this.f5690f;
            boolean z10 = false;
            if (!(abstractC5692i2 instanceof C5685b) && !(abstractC5692i2 instanceof C5688e) && abstractC5692i == abstractC5692i2) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(SingleProcessDataStore<Object> singleProcessDataStore, InterfaceC9968c<? super SingleProcessDataStore$data$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f5688g = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.f5688g, interfaceC9968c);
        singleProcessDataStore$data$1.f5687f = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SingleProcessDataStore$data$1) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f5686e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = (InterfaceC7117d) this.f5687f;
            SingleProcessDataStore<Object> singleProcessDataStore = this.f5688g;
            AbstractC5692i abstractC5692i = (AbstractC5692i) singleProcessDataStore.f5672h.getValue();
            if (!(abstractC5692i instanceof C5685b)) {
                singleProcessDataStore.f5674j.m3003a(new SingleProcessDataStore.AbstractC0790a.a(abstractC5692i));
            }
            C07921 c07921 = new C07921(abstractC5692i, null);
            this.f5686e = 1;
            C0062b.m289M0(interfaceC7117d);
            Object objMo9539a = singleProcessDataStore.f5672h.mo9539a(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), new SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2(interfaceC7117d), c07921), this);
            if (objMo9539a != coroutineSingletons) {
                objMo9539a = C9072e.f47360a;
            }
            if (objMo9539a != coroutineSingletons) {
                objMo9539a = C9072e.f47360a;
            }
            if (objMo9539a != coroutineSingletons) {
                objMo9539a = C9072e.f47360a;
            }
            if (objMo9539a == coroutineSingletons) {
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
