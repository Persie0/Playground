package androidx.compose.p017ui.input.pointer;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import no.C7848l1;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", m19206f = "SuspendingPointerInputFilter.kt", m19207l = {628}, m19208m = "withTimeout")
public final class C0515xffebe5e8<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public C7848l1 f3621d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f3622e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> f3623f;

    /* JADX INFO: renamed from: g */
    public int f3624g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0515xffebe5e8(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, InterfaceC9968c<? super C0515xffebe5e8> interfaceC9968c) {
        super(interfaceC9968c);
        this.f3623f = pointerEventHandlerCoroutine;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1<T> for r7v1 'this'  wl.c
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
            r7.f3622e = r8
            r6 = 6
            int r8 = r7.f3624g
            r5 = 3
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 6
            r8 = r8 | r0
            r7.f3624g = r8
            r5 = 4
            r0 = 0
            r8 = 0
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<R> r2 = r7.f3623f
            java.lang.Object r8 = r2.mo2025F(r0, r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.input.pointer.C0515xffebe5e8.mo1338x(java.lang.Object):java.lang.Object");
    }
}
