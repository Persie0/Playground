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
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.StateFlowImpl", m19206f = "StateFlow.kt", m19207l = {386, 398, 403}, m19208m = "collect")
public final class StateFlowImpl$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public StateFlowImpl f40265d;

    /* JADX INFO: renamed from: e */
    public InterfaceC7117d f40266e;

    /* JADX INFO: renamed from: f */
    public C7143x f40267f;

    /* JADX INFO: renamed from: g */
    public InterfaceC7875v0 f40268g;

    /* JADX INFO: renamed from: h */
    public Object f40269h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f40270i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ StateFlowImpl<T> f40271j;

    /* JADX INFO: renamed from: k */
    public int f40272k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(StateFlowImpl<T> stateFlowImpl, InterfaceC9968c<? super StateFlowImpl$collect$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f40271j = stateFlowImpl;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to kotlinx.coroutines.flow.StateFlowImpl$collect$1 for r5v1 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r6) {
        /*
            r5 = this;
            r5.f40270i = r6
            r2 = 7
            int r6 = r5.f40272k
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r1
            r6 = r6 | r0
            r5.f40272k = r6
            r4 = 2
            kotlinx.coroutines.flow.StateFlowImpl<T> r6 = r5.f40271j
            r3 = 1
            r0 = 0
            java.lang.Object r1 = r6.mo9539a(r0, r5)
            r6 = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl$collect$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
