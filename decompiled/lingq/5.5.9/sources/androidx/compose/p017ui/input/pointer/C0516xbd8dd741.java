package androidx.compose.p017ui.input.pointer;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7840j;
import no.InterfaceC7882z;
import p060d1.C5024k;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m13365d2 = {"T", "R", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", m19206f = "SuspendingPointerInputFilter.kt", m19207l = {620, 621}, m19208m = "invokeSuspend")
public final class C0516xbd8dd741 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f3625e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f3626f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> f3627g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0516xbd8dd741(long j10, SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, InterfaceC9968c<? super C0516xbd8dd741> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f3626f = j10;
        this.f3627g = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C0516xbd8dd741(this.f3626f, this.f3627g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C0516xbd8dd741) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7840j<? super C5024k> interfaceC7840j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f3625e;
        long j10 = this.f3626f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            interfaceC7840j = this.f3627g.f3617c;
            if (interfaceC7840j != null) {
                interfaceC7840j.mo2031y(C7499b.m14967u(new PointerEventTimeoutCancellationException(j10)));
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        this.f3625e = 1;
        if (C7828f.m15567a(j10 - 1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.f3625e = 2;
        if (C7828f.m15567a(1L, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        interfaceC7840j = this.f3627g.f3617c;
        if (interfaceC7840j != null) {
            interfaceC7840j.mo2031y(C7499b.m14967u(new PointerEventTimeoutCancellationException(j10)));
        }
        return C9072e.f47360a;
    }
}
