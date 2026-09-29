package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p325po.InterfaceC8436l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m13365d2 = {"T", "Lpo/l;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m19206f = "ChannelFlow.kt", m19207l = {60}, m19208m = "invokeSuspend")
final class ChannelFlow$collectToFun$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC8436l<Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40292e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f40293f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC7125a<Object> f40294g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(AbstractC7125a<Object> abstractC7125a, InterfaceC9968c<? super ChannelFlow$collectToFun$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f40294g = abstractC7125a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.f40294g, interfaceC9968c);
        channelFlow$collectToFun$1.f40293f = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC8436l<Object> interfaceC8436l, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChannelFlow$collectToFun$1) mo1336a(interfaceC8436l, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40292e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC8436l<? super Object> interfaceC8436l = (InterfaceC8436l) this.f40293f;
            this.f40292e = 1;
            if (this.f40294g.mo14373e(interfaceC8436l, this) == coroutineSingletons) {
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
