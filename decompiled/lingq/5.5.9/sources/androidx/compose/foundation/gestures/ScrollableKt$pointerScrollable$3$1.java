package androidx.compose.foundation.gestures;

import androidx.compose.p017ui.input.nestedscroll.NestedScrollDispatcher;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p470x1.C10025m;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", m19206f = "Scrollable.kt", m19207l = {}, m19208m = "invokeSuspend")
final class ScrollableKt$pointerScrollable$3$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7882z, C10025m, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ long f2183e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC5312g0<NestedScrollDispatcher> f2184f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC5301c1<ScrollingLogic> f2185g;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1 */
    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", m19206f = "Scrollable.kt", m19207l = {278}, m19208m = "invokeSuspend")
    public static final class C04091 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f2186e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC5301c1<ScrollingLogic> f2187f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ long f2188g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04091(InterfaceC5301c1<ScrollingLogic> interfaceC5301c1, long j10, InterfaceC9968c<? super C04091> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f2187f = interfaceC5301c1;
            this.f2188g = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C04091(this.f2187f, this.f2188g, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04091) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2186e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ScrollingLogic value = this.f2187f.getValue();
                this.f2186e = 1;
                if (value.m1481c(this.f2188g, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$3$1(InterfaceC5312g0<NestedScrollDispatcher> interfaceC5312g0, InterfaceC5301c1<ScrollingLogic> interfaceC5301c1, InterfaceC9968c<? super ScrollableKt$pointerScrollable$3$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f2184f = interfaceC5312g0;
        this.f2185g = interfaceC5301c1;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7882z interfaceC7882z, C10025m c10025m, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        long j10 = c10025m.f50987a;
        ScrollableKt$pointerScrollable$3$1 scrollableKt$pointerScrollable$3$1 = new ScrollableKt$pointerScrollable$3$1(this.f2184f, this.f2185g, interfaceC9968c);
        scrollableKt$pointerScrollable$3$1.f2183e = j10;
        return scrollableKt$pointerScrollable$3$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        long j10 = this.f2183e;
        InterfaceC7882z interfaceC7882zMo807E = this.f2184f.getValue().f3578a.mo807E();
        if (interfaceC7882zMo807E == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        C7828f.m15570d(interfaceC7882zMo807E, null, null, new C04091(this.f2185g, j10, null), 3);
        return C9072e.f47360a;
    }
}
