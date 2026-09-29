package androidx.compose.foundation.gestures;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p060d1.InterfaceC5016c;
import p060d1.InterfaceC5035v;
import p081e0.InterfaceC5301c1;
import p260m8.C7499b;
import p401u.InterfaceC9355h;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Ld1/v;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", m19206f = "Scrollable.kt", m19207l = {291}, m19208m = "invokeSuspend")
final class ScrollableKt$mouseWheelScroll$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC5035v, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2173e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2174f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC9355h f2175g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC5301c1<ScrollingLogic> f2176h;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Ld1/c;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", m19206f = "Scrollable.kt", m19207l = {293}, m19208m = "invokeSuspend")
    public static final class C04081 extends RestrictedSuspendLambda implements InterfaceC2056p<InterfaceC5016c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: c */
        public int f2177c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f2178d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC9355h f2179e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC5301c1<ScrollingLogic> f2180f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04081(InterfaceC9355h interfaceC9355h, InterfaceC5301c1<ScrollingLogic> interfaceC5301c1, InterfaceC9968c<? super C04081> interfaceC9968c) {
            super(interfaceC9968c);
            this.f2179e = interfaceC9355h;
            this.f2180f = interfaceC5301c1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C04081 c04081 = new C04081(this.f2179e, this.f2180f, interfaceC9968c);
            c04081.f2178d = obj;
            return c04081;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC5016c interfaceC5016c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04081) mo1336a(interfaceC5016c, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004e  */
        /* JADX WARN: Code duplicated, block: B:19:0x0061 A[LOOP:0: B:15:0x004c->B:19:0x0061, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:34:0x005f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0064 A[SYNTHETIC] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:14:0x0041). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final java.lang.Object mo1338x(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                r12 = 5
                int r1 = r13.f2177c
                r2 = 1
                r11 = 7
                if (r1 == 0) goto L25
                if (r1 != r2) goto L19
                java.lang.Object r1 = r13.f2178d
                r11 = 5
                d1.c r1 = (p060d1.InterfaceC5016c) r1
                r12 = 2
                p260m8.C7499b.m14977z0(r14)
                r11 = 1
                r3 = r1
                r1 = r0
                r0 = r13
                goto L41
            L19:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                r12 = 6
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r0 = r10
                r14.<init>(r0)
                r11 = 2
                throw r14
                r12 = 4
            L25:
                p260m8.C7499b.m14977z0(r14)
                r11 = 7
                java.lang.Object r14 = r13.f2178d
                d1.c r14 = (p060d1.InterfaceC5016c) r14
                r1 = r14
                r14 = r13
            L2f:
                r14.f2178d = r1
                r12 = 7
                r14.f2177c = r2
                r12 = 7
                java.lang.Object r3 = androidx.compose.foundation.gestures.ScrollableKt.m1469a(r1, r14)
                if (r3 != r0) goto L3c
                return r0
            L3c:
                r9 = r0
                r0 = r14
                r14 = r3
                r3 = r1
                r1 = r9
            L41:
                d1.k r14 = (p060d1.C5024k) r14
                java.util.List<d1.o> r4 = r14.f32832a
                int r5 = r4.size()
                r6 = 0
                r11 = 5
                r7 = r6
            L4c:
                if (r7 >= r5) goto L64
                r12 = 7
                java.lang.Object r10 = r4.get(r7)
                r8 = r10
                d1.o r8 = (p060d1.C5028o) r8
                r11 = 6
                boolean r10 = r8.m10714b()
                r8 = r10
                r8 = r8 ^ r2
                if (r8 != 0) goto L61
                r4 = r6
                goto L65
            L61:
                int r7 = r7 + 1
                goto L4c
            L64:
                r4 = r2
            L65:
                if (r4 == 0) goto Lb1
                r12 = 3
                r3.mo2028c()
                u.h r4 = r0.f2179e
                long r4 = r4.mo16805e(r3, r14)
                e0.c1<androidx.compose.foundation.gestures.ScrollingLogic> r7 = r0.f2180f
                java.lang.Object r7 = r7.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r7 = (androidx.compose.foundation.gestures.ScrollingLogic) r7
                r11 = 2
                float r4 = r7.m1482d(r4)
                boolean r5 = r7.f2204b
                if (r5 == 0) goto L88
                r11 = 2
                r5 = -1
                r11 = 6
                float r5 = (float) r5
                r12 = 2
                float r4 = r4 * r5
            L88:
                u.j r5 = r7.f2206d
                float r4 = r5.mo1420f(r4)
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                r12 = 2
                if (r4 != 0) goto L97
                r11 = 3
                r4 = r2
                goto L98
            L97:
                r4 = r6
            L98:
                if (r4 != 0) goto Lb1
                java.util.List<d1.o> r14 = r14.f32832a
                r12 = 7
                int r10 = r14.size()
                r4 = r10
            La2:
                if (r6 >= r4) goto Lb1
                r12 = 3
                java.lang.Object r5 = r14.get(r6)
                d1.o r5 = (p060d1.C5028o) r5
                r5.m10713a()
                int r6 = r6 + 1
                goto La2
            Lb1:
                r11 = 1
                r14 = r0
                r0 = r1
                r1 = r3
                goto L2f
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1.C04081.mo1338x(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$mouseWheelScroll$1(InterfaceC9355h interfaceC9355h, InterfaceC5301c1<ScrollingLogic> interfaceC5301c1, InterfaceC9968c<? super ScrollableKt$mouseWheelScroll$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2175g = interfaceC9355h;
        this.f2176h = interfaceC5301c1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ScrollableKt$mouseWheelScroll$1 scrollableKt$mouseWheelScroll$1 = new ScrollableKt$mouseWheelScroll$1(this.f2175g, this.f2176h, interfaceC9968c);
        scrollableKt$mouseWheelScroll$1.f2174f = obj;
        return scrollableKt$mouseWheelScroll$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC5035v interfaceC5035v, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ScrollableKt$mouseWheelScroll$1) mo1336a(interfaceC5035v, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2173e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC5035v interfaceC5035v = (InterfaceC5035v) this.f2174f;
            C04081 c04081 = new C04081(this.f2175g, this.f2176h, null);
            this.f2173e = 1;
            if (interfaceC5035v.mo2020D0(c04081, this) == coroutineSingletons) {
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
