package androidx.compose.p017ui.input.pointer;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p060d1.InterfaceC5035v;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", m19206f = "SuspendingPointerInputFilter.kt", m19207l = {292}, m19208m = "invokeSuspend")
final class SuspendingPointerInputFilterKt$pointerInput$4$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f3640e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f3641f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SuspendingPointerInputFilter f3642g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2056p<InterfaceC5035v, InterfaceC9968c<? super C9072e>, Object> f3643h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendingPointerInputFilterKt$pointerInput$4$2$1(SuspendingPointerInputFilter suspendingPointerInputFilter, InterfaceC2056p<? super InterfaceC5035v, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super SuspendingPointerInputFilterKt$pointerInput$4$2$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f3642g = suspendingPointerInputFilter;
        this.f3643h = interfaceC2056p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        SuspendingPointerInputFilterKt$pointerInput$4$2$1 suspendingPointerInputFilterKt$pointerInput$4$2$1 = new SuspendingPointerInputFilterKt$pointerInput$4$2$1(this.f3642g, this.f3643h, interfaceC9968c);
        suspendingPointerInputFilterKt$pointerInput$4$2$1.f3641f = obj;
        return suspendingPointerInputFilterKt$pointerInput$4$2$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SuspendingPointerInputFilterKt$pointerInput$4$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f3640e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f3641f;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.f3642g;
            suspendingPointerInputFilter.getClass();
            C5207g.m11111f(interfaceC7882z, "<set-?>");
            suspendingPointerInputFilter.f3614i = interfaceC7882z;
            this.f3640e = 1;
            if (this.f3643h.mo1337m0(suspendingPointerInputFilter, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
