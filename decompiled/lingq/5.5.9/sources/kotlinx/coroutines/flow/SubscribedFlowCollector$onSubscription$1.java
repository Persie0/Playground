package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m19206f = "Share.kt", m19207l = {419, 423}, m19208m = "onSubscription")
final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public C7144y f40273d;

    /* JADX INFO: renamed from: e */
    public SafeCollector f40274e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f40275f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C7144y<Object> f40276g;

    /* JADX INFO: renamed from: h */
    public int f40277h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(C7144y<Object> c7144y, InterfaceC9968c<? super SubscribedFlowCollector$onSubscription$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f40276g = c7144y;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f40275f = obj;
        this.f40277h |= Integer.MIN_VALUE;
        return this.f40276g.m14404a(this);
    }
}
