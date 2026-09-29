package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m19206f = "Limit.kt", m19207l = {37, 38, 40}, m19208m = "emit")
public final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public FlowKt__LimitKt$dropWhile$1$1 f40130d;

    /* JADX INFO: renamed from: e */
    public Object f40131e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f40132f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ FlowKt__LimitKt$dropWhile$1$1<T> f40133g;

    /* JADX INFO: renamed from: h */
    public int f40134h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1$emit$1(FlowKt__LimitKt$dropWhile$1$1<? super T> flowKt__LimitKt$dropWhile$1$1, InterfaceC9968c<? super FlowKt__LimitKt$dropWhile$1$1$emit$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f40133g = flowKt__LimitKt$dropWhile$1$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 for r5v1 'this'  wl.c
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
            r1 = r5
            r1.f40132f = r6
            int r6 = r1.f40134h
            r3 = 4
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3
            r6 = r6 | r0
            r4 = 3
            r1.f40134h = r6
            r3 = 7
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1<T> r6 = r1.f40133g
            r4 = 5
            r4 = 0
            r0 = r4
            java.lang.Object r4 = r6.mo1339r(r0, r1)
            r6 = r4
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
