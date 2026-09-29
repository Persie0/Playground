package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC7117d;
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
public final class SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2 implements InterfaceC7117d<AbstractC5692i<Object>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7117d f5691a;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 */
    @Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", m19206f = "SingleProcessDataStore.kt", m19207l = {137}, m19208m = "emit")
    public static final class C07931 extends ContinuationImpl {

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f5692d;

        /* JADX INFO: renamed from: e */
        public int f5693e;

        public C07931(InterfaceC9968c interfaceC9968c) {
            super(interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) {
            this.f5692d = obj;
            this.f5693e |= Integer.MIN_VALUE;
            return SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2.this.mo1339r(null, this);
        }
    }

    public SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2(InterfaceC7117d interfaceC7117d) {
        this.f5691a = interfaceC7117d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(AbstractC5692i<Object> abstractC5692i, InterfaceC9968c interfaceC9968c) throws Throwable {
        C07931 c07931;
        if (interfaceC9968c instanceof C07931) {
            c07931 = (C07931) interfaceC9968c;
            int i10 = c07931.f5693e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07931.f5693e = i10 - Integer.MIN_VALUE;
            } else {
                c07931 = new C07931(interfaceC9968c);
            }
        } else {
            c07931 = new C07931(interfaceC9968c);
        }
        Object obj = c07931.f5692d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = c07931.f5693e;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            AbstractC5692i<Object> abstractC5692i2 = abstractC5692i;
            if (abstractC5692i2 instanceof C5690g) {
                throw ((C5690g) abstractC5692i2).f34670a;
            }
            if (abstractC5692i2 instanceof C5688e) {
                throw ((C5688e) abstractC5692i2).f34669a;
            }
            if (!(abstractC5692i2 instanceof C5685b)) {
                if (abstractC5692i2 instanceof C5693j) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            T t10 = ((C5685b) abstractC5692i2).f34667a;
            c07931.f5693e = 1;
            if (this.f5691a.mo1339r(t10, c07931) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
