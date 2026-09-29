package androidx.compose.foundation;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p060d1.InterfaceC5035v;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p260m8.C7499b;
import p338qd.C8573r0;
import p375s0.C8941c;
import p401u.InterfaceC9354g;
import p423v.C9615m;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p470x1.C10020h;
import p470x1.C10022j;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", m19206f = "Clickable.kt", m19207l = {156}, m19208m = "invokeSuspend")
final class ClickableKt$clickable$4$gesture$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC5035v, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f1749e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f1750f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC5312g0<C8941c> f1751g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f1752h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC9612j f1753i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC5312g0<C9615m> f1754j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC5301c1<InterfaceC2041a<Boolean>> f1755k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC5301c1<InterfaceC2041a<C9072e>> f1756l;

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1 */
    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1", m19206f = "Clickable.kt", m19207l = {159}, m19208m = "invokeSuspend")
    public static final class C03771 extends SuspendLambda implements InterfaceC2057q<InterfaceC9354g, C8941c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f1757e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ InterfaceC9354g f1758f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ long f1759g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f1760h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC9612j f1761i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC5312g0<C9615m> f1762j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ InterfaceC5301c1<InterfaceC2041a<Boolean>> f1763k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03771(boolean z10, InterfaceC9612j interfaceC9612j, InterfaceC5312g0<C9615m> interfaceC5312g0, InterfaceC5301c1<? extends InterfaceC2041a<Boolean>> interfaceC5301c1, InterfaceC9968c<? super C03771> interfaceC9968c) {
            super(3, interfaceC9968c);
            this.f1760h = z10;
            this.f1761i = interfaceC9612j;
            this.f1762j = interfaceC5312g0;
            this.f1763k = interfaceC5301c1;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC9354g interfaceC9354g, C8941c c8941c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            long j10 = c8941c.f46892a;
            C03771 c03771 = new C03771(this.f1760h, this.f1761i, this.f1762j, this.f1763k, interfaceC9968c);
            c03771.f1758f = interfaceC9354g;
            c03771.f1759g = j10;
            return c03771.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1757e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC9354g interfaceC9354g = this.f1758f;
                long j10 = this.f1759g;
                if (this.f1760h) {
                    InterfaceC9612j interfaceC9612j = this.f1761i;
                    InterfaceC5312g0<C9615m> interfaceC5312g0 = this.f1762j;
                    InterfaceC5301c1<InterfaceC2041a<Boolean>> interfaceC5301c1 = this.f1763k;
                    this.f1757e = 1;
                    Object objM14963s = C7499b.m14963s(new ClickableKt$handlePressInteraction$2(interfaceC9354g, j10, interfaceC9612j, interfaceC5312g0, interfaceC5301c1, null), this);
                    if (objM14963s != coroutineSingletons) {
                        objM14963s = C9072e.f47360a;
                    }
                    if (objM14963s == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableKt$clickable$4$gesture$1$1(InterfaceC5312g0<C8941c> interfaceC5312g0, boolean z10, InterfaceC9612j interfaceC9612j, InterfaceC5312g0<C9615m> interfaceC5312g1, InterfaceC5301c1<? extends InterfaceC2041a<Boolean>> interfaceC5301c1, InterfaceC5301c1<? extends InterfaceC2041a<C9072e>> interfaceC5301c2, InterfaceC9968c<? super ClickableKt$clickable$4$gesture$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1751g = interfaceC5312g0;
        this.f1752h = z10;
        this.f1753i = interfaceC9612j;
        this.f1754j = interfaceC5312g1;
        this.f1755k = interfaceC5301c1;
        this.f1756l = interfaceC5301c2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ClickableKt$clickable$4$gesture$1$1 clickableKt$clickable$4$gesture$1$1 = new ClickableKt$clickable$4$gesture$1$1(this.f1751g, this.f1752h, this.f1753i, this.f1754j, this.f1755k, this.f1756l, interfaceC9968c);
        clickableKt$clickable$4$gesture$1$1.f1750f = obj;
        return clickableKt$clickable$4$gesture$1$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC5035v interfaceC5035v, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ClickableKt$clickable$4$gesture$1$1) mo1336a(interfaceC5035v, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1749e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC5035v interfaceC5035v = (InterfaceC5035v) this.f1750f;
            long jM10718c = interfaceC5035v.m10718c();
            long jM16752r = C8573r0.m16752r(((int) (jM10718c >> 32)) / 2, C10022j.m18628b(jM10718c) / 2);
            this.f1751g.setValue(new C8941c(C7499b.m14932c((int) (jM16752r >> 32), C10020h.m18625a(jM16752r))));
            C03771 c03771 = new C03771(this.f1752h, this.f1753i, this.f1754j, this.f1755k, null);
            final boolean z10 = this.f1752h;
            final InterfaceC5301c1<InterfaceC2041a<C9072e>> interfaceC5301c1 = this.f1756l;
            InterfaceC2052l<C8941c, C9072e> interfaceC2052l = new InterfaceC2052l<C8941c, C9072e>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(C8941c c8941c) {
                    long j10 = c8941c.f46892a;
                    if (z10) {
                        interfaceC5301c1.getValue().mo807E();
                    }
                    return C9072e.f47360a;
                }
            };
            this.f1749e = 1;
            if (TapGestureDetectorKt.m1486c(interfaceC5035v, c03771, interfaceC2052l, this) == coroutineSingletons) {
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
