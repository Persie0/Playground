package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p325po.InterfaceC8438n;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m19206f = "ChannelFlow.kt", m19207l = {123}, m19208m = "invokeSuspend")
final class ChannelFlow$collect$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40288e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f40289f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7117d<Object> f40290g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC7125a<Object> f40291h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(InterfaceC9968c interfaceC9968c, InterfaceC7117d interfaceC7117d, AbstractC7125a abstractC7125a) {
        super(2, interfaceC9968c);
        this.f40290g = interfaceC7117d;
        this.f40291h = abstractC7125a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(interfaceC9968c, this.f40290g, this.f40291h);
        channelFlow$collect$2.f40289f = obj;
        return channelFlow$collect$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChannelFlow$collect$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f40288e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC8438n<Object> interfaceC8438nMo14376h = this.f40291h.mo14376h((InterfaceC7882z) this.f40289f);
            this.f40288e = 1;
            Object objM14359a = FlowKt__ChannelsKt.m14359a(this.f40290g, interfaceC8438nMo14376h, true, this);
            if (objM14359a != obj2) {
                objM14359a = C9072e.f47360a;
            }
            if (objM14359a == obj2) {
                return obj2;
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
