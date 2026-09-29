package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m19206f = "SharingStarted.kt", m19207l = {158}, m19208m = "emit")
public final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f40254d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ StartedLazily$command$1.C71131<T> f40255e;

    /* JADX INFO: renamed from: f */
    public int f40256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StartedLazily$command$1$1$emit$1(StartedLazily$command$1.C71131<? super T> c71131, InterfaceC9968c<? super StartedLazily$command$1$1$emit$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f40255e = c71131;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 for r3v1 'this'  wl.c
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
            r3.f40254d = r4
            int r4 = r3.f40256f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r1
            r4 = r4 | r0
            r3.f40256f = r4
            kotlinx.coroutines.flow.StartedLazily$command$1$1<T> r4 = r3.f40255e
            r2 = 4
            r1 = 0
            r0 = r1
            java.lang.Object r4 = r4.m14364a(r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
