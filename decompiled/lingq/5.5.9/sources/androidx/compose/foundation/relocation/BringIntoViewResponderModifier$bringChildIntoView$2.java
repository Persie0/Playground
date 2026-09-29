package androidx.compose.foundation.relocation;

import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import no.C7828f;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p127g1.InterfaceC5647k;
import p260m8.C7499b;
import p375s0.C8942d;
import p464wl.InterfaceC9968c;
import p468x.InterfaceC9995c;
import p468x.InterfaceC9999g;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lno/v0;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", m19206f = "BringIntoViewResponder.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class BringIntoViewResponderModifier$bringChildIntoView$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super InterfaceC7875v0>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2454e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BringIntoViewResponderModifier f2455f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC5647k f2456g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2041a<C8942d> f2457h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC2041a<C8942d> f2458i;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$1", m19206f = "BringIntoViewResponder.kt", m19207l = {162}, m19208m = "invokeSuspend")
    public static final class C04401 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f2459e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ BringIntoViewResponderModifier f2460f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC5647k f2461g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC2041a<C8942d> f2462h;

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$1$1, reason: invalid class name */
        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements InterfaceC2041a<C8942d> {

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ BringIntoViewResponderModifier f2463j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ InterfaceC5647k f2464k;

            /* JADX INFO: renamed from: l */
            public final /* synthetic */ InterfaceC2041a<C8942d> f2465l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BringIntoViewResponderModifier bringIntoViewResponderModifier, InterfaceC5647k interfaceC5647k, InterfaceC2041a<C8942d> interfaceC2041a) {
                super(0, C5207g.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderModifier;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.f2463j = bringIntoViewResponderModifier;
                this.f2464k = interfaceC5647k;
                this.f2465l = interfaceC2041a;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C8942d mo807E() {
                return BringIntoViewResponderModifier.m1528h(this.f2463j, this.f2464k, this.f2465l);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04401(BringIntoViewResponderModifier bringIntoViewResponderModifier, InterfaceC5647k interfaceC5647k, InterfaceC2041a<C8942d> interfaceC2041a, InterfaceC9968c<? super C04401> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f2460f = bringIntoViewResponderModifier;
            this.f2461g = interfaceC5647k;
            this.f2462h = interfaceC2041a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C04401(this.f2460f, this.f2461g, this.f2462h, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04401) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2459e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                BringIntoViewResponderModifier bringIntoViewResponderModifier = this.f2460f;
                InterfaceC9999g interfaceC9999g = bringIntoViewResponderModifier.f2453d;
                if (interfaceC9999g == null) {
                    C5207g.m11117l("responder");
                    throw null;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(bringIntoViewResponderModifier, this.f2461g, this.f2462h);
                this.f2459e = 1;
                if (interfaceC9999g.mo1436d(anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$2", m19206f = "BringIntoViewResponder.kt", m19207l = {171}, m19208m = "invokeSuspend")
    public static final class C04412 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f2466e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ BringIntoViewResponderModifier f2467f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC2041a<C8942d> f2468g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04412(BringIntoViewResponderModifier bringIntoViewResponderModifier, InterfaceC2041a<C8942d> interfaceC2041a, InterfaceC9968c<? super C04412> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f2467f = bringIntoViewResponderModifier;
            this.f2468g = interfaceC2041a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C04412(this.f2467f, this.f2468g, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04412) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2466e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                BringIntoViewResponderModifier bringIntoViewResponderModifier = this.f2467f;
                InterfaceC9995c interfaceC9995c = bringIntoViewResponderModifier.f50809b;
                if (interfaceC9995c == null) {
                    interfaceC9995c = bringIntoViewResponderModifier.f50808a;
                }
                InterfaceC5647k interfaceC5647kM18582d = bringIntoViewResponderModifier.m18582d();
                if (interfaceC5647kM18582d == null) {
                    return C9072e.f47360a;
                }
                this.f2466e = 1;
                if (interfaceC9995c.mo1529c(interfaceC5647kM18582d, this.f2468g, this) == coroutineSingletons) {
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
    public BringIntoViewResponderModifier$bringChildIntoView$2(BringIntoViewResponderModifier bringIntoViewResponderModifier, InterfaceC5647k interfaceC5647k, InterfaceC2041a<C8942d> interfaceC2041a, InterfaceC2041a<C8942d> interfaceC2041a2, InterfaceC9968c<? super BringIntoViewResponderModifier$bringChildIntoView$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2455f = bringIntoViewResponderModifier;
        this.f2456g = interfaceC5647k;
        this.f2457h = interfaceC2041a;
        this.f2458i = interfaceC2041a2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        BringIntoViewResponderModifier$bringChildIntoView$2 bringIntoViewResponderModifier$bringChildIntoView$2 = new BringIntoViewResponderModifier$bringChildIntoView$2(this.f2455f, this.f2456g, this.f2457h, this.f2458i, interfaceC9968c);
        bringIntoViewResponderModifier$bringChildIntoView$2.f2454e = obj;
        return bringIntoViewResponderModifier$bringChildIntoView$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super InterfaceC7875v0> interfaceC9968c) {
        return ((BringIntoViewResponderModifier$bringChildIntoView$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f2454e;
        BringIntoViewResponderModifier bringIntoViewResponderModifier = this.f2455f;
        C7828f.m15570d(interfaceC7882z, null, null, new C04401(bringIntoViewResponderModifier, this.f2456g, this.f2457h, null), 3);
        return C7828f.m15570d(interfaceC7882z, null, null, new C04412(bringIntoViewResponderModifier, this.f2458i, null), 3);
    }
}
