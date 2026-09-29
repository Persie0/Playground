package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import no.InterfaceC7875v0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m19206f = "Merge.kt", m19207l = {30}, m19208m = "emit")
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ChannelFlowTransformLatest$flowCollect$3.C71231 f40311d;

    /* JADX INFO: renamed from: e */
    public Object f40312e;

    /* JADX INFO: renamed from: f */
    public InterfaceC7875v0 f40313f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f40314g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.C71231<T> f40315h;

    /* JADX INFO: renamed from: i */
    public int f40316i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.C71231<? super T> c71231, InterfaceC9968c<? super ChannelFlowTransformLatest$flowCollect$3$1$emit$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f40315h = c71231;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 for r4v1 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r5) {
        /*
            r4 = this;
            r4.f40314g = r5
            r2 = 7
            int r5 = r4.f40316i
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r0
            r4.f40316i = r5
            r2 = 1
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1<T> r5 = r4.f40315h
            r1 = 0
            r0 = r1
            java.lang.Object r1 = r5.mo1339r(r0, r4)
            r5 = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
