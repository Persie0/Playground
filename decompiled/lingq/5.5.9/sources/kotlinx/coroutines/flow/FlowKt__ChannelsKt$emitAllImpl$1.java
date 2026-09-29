package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p325po.InterfaceC8438n;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m19206f = "Channels.kt", m19207l = {51, 62}, m19208m = "emitAllImpl$FlowKt__ChannelsKt")
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public InterfaceC7117d f40055d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8438n f40056e;

    /* JADX INFO: renamed from: f */
    public boolean f40057f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f40058g;

    /* JADX INFO: renamed from: h */
    public int f40059h;

    public FlowKt__ChannelsKt$emitAllImpl$1(InterfaceC9968c<? super FlowKt__ChannelsKt$emitAllImpl$1> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f40058g = obj;
        this.f40059h |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.m14359a(null, null, false, this);
    }
}
