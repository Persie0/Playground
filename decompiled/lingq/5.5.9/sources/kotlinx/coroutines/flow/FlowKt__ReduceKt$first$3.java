package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m19206f = "Reduce.kt", m19207l = {183}, m19208m = "first")
final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public InterfaceC2056p f40152d;

    /* JADX INFO: renamed from: e */
    public Ref$ObjectRef f40153e;

    /* JADX INFO: renamed from: f */
    public FlowKt__ReduceKt$first$$inlined$collectWhile$2 f40154f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f40155g;

    /* JADX INFO: renamed from: h */
    public int f40156h;

    public FlowKt__ReduceKt$first$3(InterfaceC9968c<? super FlowKt__ReduceKt$first$3> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f40155g = obj;
        this.f40156h |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.m14361b(null, null, this);
    }
}
