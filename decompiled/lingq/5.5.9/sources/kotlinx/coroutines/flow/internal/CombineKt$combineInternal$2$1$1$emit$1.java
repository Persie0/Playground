package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m19206f = "Combine.kt", m19207l = {35, 36}, m19208m = "emit")
public final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f40334d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CombineKt$combineInternal$2.C71241.AnonymousClass1<T> f40335e;

    /* JADX INFO: renamed from: f */
    public int f40336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.C71241.AnonymousClass1<? super T> anonymousClass1, InterfaceC9968c<? super CombineKt$combineInternal$2$1$1$emit$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f40335e = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 for r4v1 'this'  wl.c
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
            r1 = r4
            r1.f40334d = r5
            r3 = 4
            int r5 = r1.f40336f
            r3 = 6
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 7
            r5 = r5 | r0
            r1.f40336f = r5
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1<T> r5 = r1.f40335e
            r3 = 5
            r3 = 0
            r0 = r3
            java.lang.Object r3 = r5.mo1339r(r0, r1)
            r5 = r3
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
