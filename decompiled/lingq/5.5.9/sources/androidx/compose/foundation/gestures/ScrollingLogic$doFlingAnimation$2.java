package androidx.compose.foundation.gestures;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p260m8.C7499b;
import p375s0.C8941c;
import p401u.InterfaceC9351d;
import p401u.InterfaceC9356i;
import p464wl.InterfaceC9968c;
import p470x1.C10025m;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lu/i;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", m19206f = "Scrollable.kt", m19207l = {442}, m19208m = "invokeSuspend")
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC9356i, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public ScrollingLogic f2217e;

    /* JADX INFO: renamed from: f */
    public Ref$LongRef f2218f;

    /* JADX INFO: renamed from: g */
    public long f2219g;

    /* JADX INFO: renamed from: h */
    public int f2220h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f2221i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ScrollingLogic f2222j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Ref$LongRef f2223k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f2224l;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$a */
    public static final class C0410a implements InterfaceC9356i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ScrollingLogic f2225a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC2052l<C8941c, C8941c> f2226b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0410a(ScrollingLogic scrollingLogic, InterfaceC2052l<? super C8941c, C8941c> interfaceC2052l) {
            this.f2225a = scrollingLogic;
            this.f2226b = interfaceC2052l;
        }

        @Override // p401u.InterfaceC9356i
        /* JADX INFO: renamed from: a */
        public final float mo1442a(float f3) {
            ScrollingLogic scrollingLogic = this.f2225a;
            return scrollingLogic.m1482d(this.f2226b.mo528n(new C8941c(scrollingLogic.m1483e(f3))).f46892a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref$LongRef ref$LongRef, long j10, InterfaceC9968c<? super ScrollingLogic$doFlingAnimation$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2222j = scrollingLogic;
        this.f2223k = ref$LongRef;
        this.f2224l = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.f2222j, this.f2223k, this.f2224l, interfaceC9968c);
        scrollingLogic$doFlingAnimation$2.f2221i = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC9356i interfaceC9356i, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ScrollingLogic$doFlingAnimation$2) mo1336a(interfaceC9356i, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        final ScrollingLogic scrollingLogic;
        Ref$LongRef ref$LongRef;
        long j10;
        ScrollingLogic scrollingLogic2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2220h;
        int i11 = 1;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            final InterfaceC9356i interfaceC9356i = (InterfaceC9356i) this.f2221i;
            scrollingLogic = this.f2222j;
            C0410a c0410a = new C0410a(scrollingLogic, new InterfaceC2052l<C8941c, C8941c>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C8941c mo528n(C8941c c8941c) {
                    long jM17168g = c8941c.f46892a;
                    ScrollingLogic scrollingLogic3 = scrollingLogic;
                    if (scrollingLogic3.f2204b) {
                        jM17168g = C8941c.m17168g(-1.0f, jM17168g);
                    }
                    long jM1479a = scrollingLogic3.m1479a(interfaceC9356i, jM17168g, 2);
                    if (scrollingLogic3.f2204b) {
                        jM1479a = C8941c.m17168g(-1.0f, jM1479a);
                    }
                    return new C8941c(jM1479a);
                }
            });
            InterfaceC9351d interfaceC9351d = scrollingLogic.f2207e;
            ref$LongRef = this.f2223k;
            long j11 = ref$LongRef.f38126a;
            Orientation orientation = Orientation.Horizontal;
            Orientation orientation2 = scrollingLogic.f2203a;
            long j12 = this.f2224l;
            float fM18636b = orientation2 == orientation ? C10025m.m18636b(j12) : C10025m.m18637c(j12);
            if (scrollingLogic.f2204b) {
                fM18636b *= -1;
            }
            this.f2221i = scrollingLogic;
            this.f2217e = scrollingLogic;
            this.f2218f = ref$LongRef;
            this.f2219g = j11;
            this.f2220h = 1;
            obj = interfaceC9351d.mo1491a(c0410a, fM18636b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            j10 = j11;
            scrollingLogic2 = scrollingLogic;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f2219g;
            ref$LongRef = this.f2218f;
            scrollingLogic = this.f2217e;
            scrollingLogic2 = (ScrollingLogic) this.f2221i;
            C7499b.m14977z0(obj);
        }
        float fFloatValue = ((Number) obj).floatValue();
        if (scrollingLogic2.f2204b) {
            fFloatValue *= -1;
        }
        float f3 = 0.0f;
        if (scrollingLogic.f2203a == Orientation.Horizontal) {
            i11 = 2;
        } else {
            f3 = fFloatValue;
            fFloatValue = 0.0f;
        }
        ref$LongRef.f38126a = C10025m.m18635a(j10, fFloatValue, f3, i11);
        return C9072e.f47360a;
    }
}
