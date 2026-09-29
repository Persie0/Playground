package androidx.compose.foundation.gestures;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p401u.InterfaceC9348a;
import p401u.InterfaceC9356i;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lu/i;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", m19206f = "Scrollable.kt", m19207l = {476}, m19208m = "invokeSuspend")
public final class ScrollDraggableState$drag$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC9356i, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2152e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2153f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ScrollDraggableState f2154g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2056p<InterfaceC9348a, InterfaceC9968c<? super C9072e>, Object> f2155h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollDraggableState$drag$2(ScrollDraggableState scrollDraggableState, InterfaceC2056p<? super InterfaceC9348a, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super ScrollDraggableState$drag$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2154g = scrollDraggableState;
        this.f2155h = interfaceC2056p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.f2154g, this.f2155h, interfaceC9968c);
        scrollDraggableState$drag$2.f2153f = obj;
        return scrollDraggableState$drag$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC9356i interfaceC9356i, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ScrollDraggableState$drag$2) mo1336a(interfaceC9356i, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2152e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC9356i interfaceC9356i = (InterfaceC9356i) this.f2153f;
            ScrollDraggableState scrollDraggableState = this.f2154g;
            scrollDraggableState.getClass();
            C5207g.m11111f(interfaceC9356i, "<set-?>");
            scrollDraggableState.f2151b = interfaceC9356i;
            this.f2152e = 1;
            if (this.f2155h.mo1337m0(scrollDraggableState, this) == coroutineSingletons) {
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
