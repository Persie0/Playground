package kotlinx.coroutines.channels;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.channels.AbstractChannel", m19206f = "AbstractChannel.kt", m19207l = {633}, m19208m = "receiveCatching-JP2dKIU")
public final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f40032d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractChannel<E> f40033e;

    /* JADX INFO: renamed from: f */
    public int f40034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, InterfaceC9968c<? super AbstractChannel$receiveCatching$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f40033e = abstractChannel;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 for r4v1 'this'  wl.c
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
            r4.f40032d = r5
            int r5 = r4.f40034f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r1
            r5 = r5 | r0
            r2 = 5
            r4.f40034f = r5
            kotlinx.coroutines.channels.AbstractChannel<E> r5 = r4.f40033e
            java.lang.Object r1 = r5.mo14337g(r4)
            r5 = r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r3 = 2
            if (r5 != r0) goto L19
            r3 = 7
            return r5
        L19:
            po.g r0 = new po.g
            r2 = 5
            r0.<init>(r5)
            r2 = 5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
