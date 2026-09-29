package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m19206f = "Errors.kt", m19207l = {156}, m19208m = "catchImpl")
final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Ref$ObjectRef f40112d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f40113e;

    /* JADX INFO: renamed from: f */
    public int f40114f;

    public FlowKt__ErrorsKt$catchImpl$1(InterfaceC9968c<? super FlowKt__ErrorsKt$catchImpl$1> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f40113e = obj;
        this.f40114f |= Integer.MIN_VALUE;
        return C7121h.m14383a(this, null, null);
    }
}
