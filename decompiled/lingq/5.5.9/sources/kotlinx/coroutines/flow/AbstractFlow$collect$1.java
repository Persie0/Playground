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
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.AbstractFlow", m19206f = "Flow.kt", m19207l = {230}, m19208m = "collect")
public final class AbstractFlow$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SafeCollector f40036d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f40037e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractFlow<T> f40038f;

    /* JADX INFO: renamed from: g */
    public int f40039g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(AbstractFlow<T> abstractFlow, InterfaceC9968c<? super AbstractFlow$collect$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f40038f = abstractFlow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to kotlinx.coroutines.flow.AbstractFlow$collect$1 for r3v1 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r4) {
        /*
            r3 = this;
            r3.f40037e = r4
            r2 = 3
            int r4 = r3.f40039g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r1
            r4 = r4 | r0
            r3.f40039g = r4
            r2 = 7
            kotlinx.coroutines.flow.AbstractFlow<T> r4 = r3.f40038f
            r0 = 0
            java.lang.Object r1 = r4.mo9539a(r0, r3)
            r4 = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractFlow$collect$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
