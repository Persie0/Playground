package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5206f;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p260m8.C7499b;
import p325po.C8431g;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Lpo/g;", "", "value", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m19206f = "Delay.kt", m19207l = {243}, m19208m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements InterfaceC2056p<C8431g<? extends Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Ref$ObjectRef f40071e;

    /* JADX INFO: renamed from: f */
    public int f40072f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f40073g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Ref$ObjectRef<Object> f40074h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC7117d<Object> f40075i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(InterfaceC9968c interfaceC9968c, Ref$ObjectRef ref$ObjectRef, InterfaceC7117d interfaceC7117d) {
        super(2, interfaceC9968c);
        this.f40074h = ref$ObjectRef;
        this.f40075i = interfaceC7117d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(interfaceC9968c, this.f40074h, this.f40075i);
        flowKt__DelayKt$debounceInternal$1$3$2.f40073g = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(C8431g<? extends Object> c8431g, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) mo1336a(new C8431g(c8431g.f45567a), interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [T, kotlinx.coroutines.internal.r] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40072f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ?? r10 = ((C8431g) this.f40073g).f45567a;
            boolean z10 = r10 instanceof C8431g.b;
            ref$ObjectRef = this.f40074h;
            if (!z10) {
                ref$ObjectRef.f38127a = r10;
            }
            if (z10) {
                C8431g.a aVar = r10 instanceof C8431g.a ? (C8431g.a) r10 : null;
                Throwable th2 = aVar != null ? aVar.f45568a : null;
                if (th2 != null) {
                    throw th2;
                }
                Object obj2 = ref$ObjectRef.f38127a;
                if (obj2 != null) {
                    Object obj3 = obj2 != C5206f.f33272g ? obj2 : null;
                    this.f40073g = r10;
                    this.f40071e = ref$ObjectRef;
                    this.f40072f = 1;
                    if (this.f40075i.mo1339r(obj3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.f38127a = C5206f.f33274i;
            }
            return C9072e.f47360a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef2 = this.f40071e;
        C7499b.m14977z0(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.f38127a = C5206f.f33274i;
        return C9072e.f47360a;
    }
}
