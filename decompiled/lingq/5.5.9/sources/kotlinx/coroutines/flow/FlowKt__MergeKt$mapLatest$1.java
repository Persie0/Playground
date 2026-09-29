package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m19206f = "Merge.kt", m19207l = {214, 214}, m19208m = "invokeSuspend")
final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<Object>, Object, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40135e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f40136f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f40137g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2056p<Object, InterfaceC9968c<Object>, Object> f40138h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$mapLatest$1(InterfaceC2056p<Object, ? super InterfaceC9968c<Object>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super FlowKt__MergeKt$mapLatest$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f40138h = interfaceC2056p;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<Object> interfaceC7117d, Object obj, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.f40138h, interfaceC9968c);
        flowKt__MergeKt$mapLatest$1.f40136f = interfaceC7117d;
        flowKt__MergeKt$mapLatest$1.f40137g = obj;
        return flowKt__MergeKt$mapLatest$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40135e;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC7117d = this.f40136f;
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        interfaceC7117d = this.f40136f;
        Object obj2 = this.f40137g;
        this.f40136f = interfaceC7117d;
        this.f40135e = 1;
        obj = this.f40138h.mo1337m0(obj2, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.f40136f = null;
        this.f40135e = 2;
        return interfaceC7117d.mo1339r(obj, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }
}
