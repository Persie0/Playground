package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m19206f = "Emitters.kt", m19207l = {216}, m19208m = "invokeSafely$FlowKt__EmittersKt")
final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Throwable f40087d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f40088e;

    /* JADX INFO: renamed from: f */
    public int f40089f;

    public FlowKt__EmittersKt$invokeSafely$1(InterfaceC9968c<? super FlowKt__EmittersKt$invokeSafely$1> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f40088e = obj;
        this.f40089f |= Integer.MIN_VALUE;
        return C7120g.m14380b(null, null, null, this);
    }
}
