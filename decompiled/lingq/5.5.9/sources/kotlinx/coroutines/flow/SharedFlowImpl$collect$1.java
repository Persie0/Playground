package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import no.InterfaceC7875v0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.SharedFlowImpl", m19206f = "SharedFlow.kt", m19207l = {373, 380, 383}, m19208m = "collect$suspendImpl")
final class SharedFlowImpl$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public C7138s f40242d;

    /* JADX INFO: renamed from: e */
    public InterfaceC7117d f40243e;

    /* JADX INFO: renamed from: f */
    public C7139t f40244f;

    /* JADX INFO: renamed from: g */
    public InterfaceC7875v0 f40245g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f40246h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C7138s<Object> f40247i;

    /* JADX INFO: renamed from: j */
    public int f40248j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(C7138s<Object> c7138s, InterfaceC9968c<? super SharedFlowImpl$collect$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f40247i = c7138s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f40246h = obj;
        this.f40248j |= Integer.MIN_VALUE;
        return C7138s.m14389m(this.f40247i, null, this);
    }
}
