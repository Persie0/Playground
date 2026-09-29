package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"R", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m19206f = "FlowCoroutine.kt", m19207l = {51}, m19208m = "invokeSuspend")
final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40337e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f40338f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC2057q<InterfaceC7882z, InterfaceC7117d<Object>, InterfaceC9968c<? super C9072e>, Object> f40339g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC7117d<Object> f40340h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowCoroutineKt$scopedFlow$1$1(InterfaceC2057q<? super InterfaceC7882z, ? super InterfaceC7117d<Object>, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2057q, InterfaceC7117d<Object> interfaceC7117d, InterfaceC9968c<? super FlowCoroutineKt$scopedFlow$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f40339g = interfaceC2057q;
        this.f40340h = interfaceC7117d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f40339g, this.f40340h, interfaceC9968c);
        flowCoroutineKt$scopedFlow$1$1.f40338f = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((FlowCoroutineKt$scopedFlow$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40337e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f40338f;
            this.f40337e = 1;
            if (this.f40339g.mo1343M(interfaceC7882z, this.f40340h, this) == coroutineSingletons) {
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
