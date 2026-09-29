package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m13365d2 = {"T", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m19206f = "ChannelFlow.kt", m19207l = {212}, m19208m = "invokeSuspend")
public final class UndispatchedContextCollector$emitRef$1<T> extends SuspendLambda implements InterfaceC2056p<T, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40353e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f40354f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7117d<T> f40355g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<? super UndispatchedContextCollector$emitRef$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f40355g = interfaceC7117d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.f40355g, interfaceC9968c);
        undispatchedContextCollector$emitRef$1.f40354f = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(Object obj, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UndispatchedContextCollector$emitRef$1) mo1336a(obj, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1<T> for r7v1 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.f40353e
            r4 = 2
            r2 = 1
            r4 = 7
            if (r1 == 0) goto L1c
            r4 = 6
            if (r1 != r2) goto L11
            r5 = 7
            p260m8.C7499b.m14977z0(r8)
            goto L2f
        L11:
            r5 = 6
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r6 = 5
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r0 = r3
            r8.<init>(r0)
            throw r8
        L1c:
            p260m8.C7499b.m14977z0(r8)
            r4 = 7
            java.lang.Object r8 = r7.f40354f
            r7.f40353e = r2
            kotlinx.coroutines.flow.d<T> r1 = r7.f40355g
            java.lang.Object r3 = r1.mo1339r(r8, r7)
            r8 = r3
            if (r8 != r0) goto L2e
            return r0
        L2e:
            r5 = 6
        L2f:
            sl.e r8 = sl.C9072e.f47360a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
