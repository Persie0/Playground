package androidx.compose.foundation.gestures;

import androidx.activity.result.C0204c;
import androidx.compose.foundation.C0391c;
import androidx.compose.foundation.ScrollState;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p017ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p017ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p017ui.input.pointer.util.C0519a;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import no.InterfaceC7882z;
import p037c1.InterfaceC1657a;
import p060d1.C5028o;
import p060d1.InterfaceC5016c;
import p060d1.InterfaceC5035v;
import p081e0.C5319k;
import p081e0.C5329p;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p081e0.InterfaceC5336s0;
import p142h1.C5877h;
import p260m8.C7499b;
import p284o0.InterfaceC7887c;
import p325po.InterfaceC8428d;
import p338qd.C8573r0;
import p338qd.C8584v;
import p350r.C8679m;
import p350r.C8680n;
import p374s.C8923o;
import p374s.InterfaceC8921n;
import p375s0.C8941c;
import p386t.InterfaceC9132x;
import p401u.C9349b;
import p401u.C9352e;
import p401u.InterfaceC9348a;
import p401u.InterfaceC9350c;
import p401u.InterfaceC9351d;
import p401u.InterfaceC9356i;
import p401u.InterfaceC9357j;
import p423v.C9613k;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p470x1.InterfaceC10015c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableKt {

    /* JADX INFO: renamed from: a */
    public static final C0407b f2166a = new C0407b();

    /* JADX INFO: renamed from: b */
    public static final C5877h<Boolean> f2167b = C8573r0.m16680J0(new InterfaceC2041a<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$ModifierLocalScrollableContainer$1
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final Boolean mo807E() {
            return Boolean.FALSE;
        }
    });

    /* JADX INFO: renamed from: c */
    public static final C0406a f2168c = new C0406a();

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$a */
    public static final class C0406a implements InterfaceC7887c {
        @Override // kotlin.coroutines.CoroutineContext
        /* JADX INFO: renamed from: C */
        public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
            C5207g.m11111f(coroutineContext, "context");
            return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
        }

        @Override // p284o0.InterfaceC7887c
        /* JADX INFO: renamed from: d0 */
        public final float mo1472d0() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext
        /* JADX INFO: renamed from: m0 */
        public final CoroutineContext mo1473m0(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
            C5207g.m11111f(interfaceC6758b, "key");
            return CoroutineContext.InterfaceC6757a.a.m13472b(this, interfaceC6758b);
        }

        @Override // kotlin.coroutines.CoroutineContext
        /* JADX INFO: renamed from: w */
        public final <E extends CoroutineContext.InterfaceC6757a> E mo1474w(CoroutineContext.InterfaceC6758b<E> interfaceC6758b) {
            C5207g.m11111f(interfaceC6758b, "key");
            return (E) CoroutineContext.InterfaceC6757a.a.m13471a(this, interfaceC6758b);
        }

        @Override // kotlin.coroutines.CoroutineContext
        /* JADX INFO: renamed from: y0 */
        public final <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super CoroutineContext.InterfaceC6757a, ? extends R> interfaceC2056p) {
            C5207g.m11111f(interfaceC2056p, "operation");
            return interfaceC2056p.mo1337m0(r10, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$b */
    public static final class C0407b implements InterfaceC9356i {
        @Override // p401u.InterfaceC9356i
        /* JADX INFO: renamed from: a */
        public final float mo1442a(float f3) {
            return f3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004e -> B:20:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m1469a(p060d1.InterfaceC5016c r9, p464wl.InterfaceC9968c r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L17
            r0 = r10
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            r7 = 7
            int r1 = r0.f2172f
            r6 = 3
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r5
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f2172f = r1
            r7 = 5
            goto L1d
        L17:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r6 = 2
            r0.<init>(r10)
        L1d:
            java.lang.Object r10 = r0.f2171e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f2172f
            r6 = 1
            r3 = 1
            r8 = 7
            if (r2 == 0) goto L3f
            r8 = 5
            if (r2 != r3) goto L33
            r8 = 4
            d1.c r9 = r0.f2170d
            r7 = 7
            p260m8.C7499b.m14977z0(r10)
            goto L51
        L33:
            r8 = 1
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r10 = r5
            r9.<init>(r10)
            r8 = 1
            throw r9
            r8 = 5
        L3f:
            p260m8.C7499b.m14977z0(r10)
            r6 = 5
        L43:
            r7 = 7
            r0.f2170d = r9
            r6 = 4
            r0.f2172f = r3
            r8 = 7
            java.lang.Object r10 = p060d1.InterfaceC5016c.m10698O(r9, r0)
            if (r10 != r1) goto L51
            goto L63
        L51:
            d1.k r10 = (p060d1.C5024k) r10
            int r2 = r10.f32833b
            r6 = 3
            r4 = 6
            if (r2 != r4) goto L5c
            r6 = 1
            r2 = r3
            goto L5f
        L5c:
            r7 = 5
            r5 = 0
            r2 = r5
        L5f:
            if (r2 == 0) goto L43
            r8 = 4
            r1 = r10
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.m1469a(d1.c, wl.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0500b m1470b(final ScrollState scrollState, final Orientation orientation, final InterfaceC9132x interfaceC9132x, final boolean z10, final boolean z11, final InterfaceC9351d interfaceC9351d, final C9613k c9613k) {
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        C5207g.m11111f(scrollState, "state");
        return ComposedModifierKt.m1927a(aVar, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$scrollable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC9351d interfaceC9351d2;
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b, "$this$composed", interfaceC0476a2, -629830927);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                interfaceC0476a2.mo1622c(773894976);
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                if (objMo1624d == c10586a) {
                    C5319k c5319k = new C5319k(C5333r.m11463e(EmptyCoroutineContext.f38093a, interfaceC0476a2));
                    interfaceC0476a2.mo1655t(c5319k);
                    objMo1624d = c5319k;
                }
                interfaceC0476a2.mo1661w();
                InterfaceC7882z interfaceC7882z = ((C5319k) objMo1624d).f33592a;
                interfaceC0476a2.mo1661w();
                Orientation orientation2 = orientation;
                InterfaceC9357j interfaceC9357j = scrollState;
                boolean z12 = z11;
                Object[] objArr = {interfaceC7882z, orientation2, interfaceC9357j, Boolean.valueOf(z12)};
                interfaceC0476a2.mo1622c(-568225417);
                boolean zMo1665y = false;
                for (int i10 = 0; i10 < 4; i10++) {
                    zMo1665y |= interfaceC0476a2.mo1665y(objArr[i10]);
                }
                Object objMo1624d2 = interfaceC0476a2.mo1624d();
                if (zMo1665y || objMo1624d2 == c10586a) {
                    objMo1624d2 = new ContentInViewModifier(interfaceC7882z, orientation2, interfaceC9357j, z12);
                    interfaceC0476a2.mo1655t(objMo1624d2);
                }
                interfaceC0476a2.mo1661w();
                InterfaceC0500b.a aVar2 = InterfaceC0500b.a.f3325a;
                InterfaceC0500b interfaceC0500bMo1929K = C0391c.m1429a().mo1929K(((ContentInViewModifier) objMo1624d2).f1952H);
                final InterfaceC9612j interfaceC9612j = c9613k;
                final Orientation orientation3 = orientation;
                boolean z13 = z11;
                InterfaceC9357j interfaceC9357j2 = scrollState;
                InterfaceC9132x interfaceC9132x2 = interfaceC9132x;
                final boolean z14 = z10;
                interfaceC0476a2.mo1622c(-2012025036);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                interfaceC0476a2.mo1622c(-1730186281);
                InterfaceC9351d interfaceC9351d3 = interfaceC9351d;
                if (interfaceC9351d3 == null) {
                    interfaceC0476a2.mo1622c(1107739818);
                    float f3 = C8680n.f46271a;
                    interfaceC0476a2.mo1622c(904445851);
                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4137e);
                    Float fValueOf = Float.valueOf(interfaceC10015c.getDensity());
                    interfaceC0476a2.mo1622c(1157296644);
                    boolean zMo1665y2 = interfaceC0476a2.mo1665y(fValueOf);
                    Object objMo1624d3 = interfaceC0476a2.mo1624d();
                    if (zMo1665y2 || objMo1624d3 == c10586a) {
                        objMo1624d3 = new C8923o(new C8679m(interfaceC10015c));
                        interfaceC0476a2.mo1655t(objMo1624d3);
                    }
                    interfaceC0476a2.mo1661w();
                    InterfaceC8921n interfaceC8921n = (InterfaceC8921n) objMo1624d3;
                    interfaceC0476a2.mo1661w();
                    interfaceC0476a2.mo1622c(1157296644);
                    boolean zMo1665y3 = interfaceC0476a2.mo1665y(interfaceC8921n);
                    Object objMo1624d4 = interfaceC0476a2.mo1624d();
                    if (zMo1665y3 || objMo1624d4 == c10586a) {
                        objMo1624d4 = new C0413b(interfaceC8921n);
                        interfaceC0476a2.mo1655t(objMo1624d4);
                    }
                    interfaceC0476a2.mo1661w();
                    interfaceC0476a2.mo1661w();
                    interfaceC9351d2 = (C0413b) objMo1624d4;
                } else {
                    interfaceC9351d2 = interfaceC9351d3;
                }
                interfaceC0476a2.mo1661w();
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d5 = interfaceC0476a2.mo1624d();
                if (objMo1624d5 == c10586a) {
                    objMo1624d5 = C8573r0.m16684L0(new NestedScrollDispatcher());
                    interfaceC0476a2.mo1655t(objMo1624d5);
                }
                interfaceC0476a2.mo1661w();
                InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d5;
                final InterfaceC5312g0 interfaceC5312g0M16704V0 = C8573r0.m16704V0(new ScrollingLogic(orientation3, z13, interfaceC5312g0, interfaceC9357j2, interfaceC9351d2, interfaceC9132x2), interfaceC0476a2);
                Boolean boolValueOf = Boolean.valueOf(z14);
                interfaceC0476a2.mo1622c(1157296644);
                boolean zMo1665y4 = interfaceC0476a2.mo1665y(boolValueOf);
                Object objMo1624d6 = interfaceC0476a2.mo1624d();
                if (zMo1665y4 || objMo1624d6 == c10586a) {
                    objMo1624d6 = new ScrollableKt$scrollableNestedScrollConnection$1(interfaceC5312g0M16704V0, z14);
                    interfaceC0476a2.mo1655t(objMo1624d6);
                }
                interfaceC0476a2.mo1661w();
                InterfaceC1657a interfaceC1657a = (InterfaceC1657a) objMo1624d6;
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d7 = interfaceC0476a2.mo1624d();
                if (objMo1624d7 == c10586a) {
                    objMo1624d7 = new ScrollDraggableState(interfaceC5312g0M16704V0);
                    interfaceC0476a2.mo1655t(objMo1624d7);
                }
                interfaceC0476a2.mo1661w();
                final ScrollDraggableState scrollDraggableState = (ScrollDraggableState) objMo1624d7;
                interfaceC0476a2.mo1622c(-1485272842);
                interfaceC0476a2.mo1661w();
                C8584v c8584v = C8584v.f46025f;
                final ScrollableKt$pointerScrollable$1 scrollableKt$pointerScrollable$1 = new InterfaceC2052l<C5028o, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(C5028o c5028o) {
                        C5028o c5028o2 = c5028o;
                        C5207g.m11111f(c5028o2, "down");
                        return Boolean.valueOf(!(c5028o2.f32842h == 2));
                    }
                };
                interfaceC0476a2.mo1622c(1157296644);
                boolean zMo1665y5 = interfaceC0476a2.mo1665y(interfaceC5312g0M16704V0);
                Object objMo1624d8 = interfaceC0476a2.mo1624d();
                if (zMo1665y5 || objMo1624d8 == c10586a) {
                    objMo1624d8 = new InterfaceC2041a<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Code duplicated, block: B:11:0x0032  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Boolean mo807E() {
                            boolean z15;
                            ScrollingLogic value = interfaceC5312g0M16704V0.getValue();
                            if (!value.f2206d.mo1416a() && !((Boolean) value.f2209g.getValue()).booleanValue()) {
                                InterfaceC9132x interfaceC9132x3 = value.f2208f;
                                z15 = interfaceC9132x3 != null ? interfaceC9132x3.mo1397d() : false;
                            }
                            return Boolean.valueOf(z15);
                        }
                    };
                    interfaceC0476a2.mo1655t(objMo1624d8);
                }
                interfaceC0476a2.mo1661w();
                final InterfaceC2041a interfaceC2041a = (InterfaceC2041a) objMo1624d8;
                interfaceC0476a2.mo1622c(511388516);
                boolean zMo1665y6 = interfaceC0476a2.mo1665y(interfaceC5312g0) | interfaceC0476a2.mo1665y(interfaceC5312g0M16704V0);
                Object objMo1624d9 = interfaceC0476a2.mo1624d();
                if (zMo1665y6 || objMo1624d9 == c10586a) {
                    objMo1624d9 = new ScrollableKt$pointerScrollable$3$1(interfaceC5312g0, interfaceC5312g0M16704V0, null);
                    interfaceC0476a2.mo1655t(objMo1624d9);
                }
                interfaceC0476a2.mo1661w();
                final InterfaceC2057q interfaceC2057q3 = (InterfaceC2057q) objMo1624d9;
                final DraggableKt$draggable$6 draggableKt$draggable$6 = new DraggableKt$draggable$6(null);
                final boolean z15 = false;
                C5207g.m11111f(interfaceC0500bMo1929K, "<this>");
                C5207g.m11111f(scrollDraggableState, "state");
                C5207g.m11111f(scrollableKt$pointerScrollable$1, "canDrag");
                C5207g.m11111f(interfaceC2041a, "startDragImmediately");
                C5207g.m11111f(interfaceC2057q3, "onDragStopped");
                InterfaceC0500b interfaceC0500bM2016a = NestedScrollModifierKt.m2016a(SuspendingPointerInputFilterKt.m2033b(ComposedModifierKt.m1927a(interfaceC0500bMo1929K, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9

                    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2 */
                    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                    @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", m19206f = "Draggable.kt", m19207l = {239, 241, 243, 251, 253, 257}, m19208m = "invokeSuspend")
                    final class C04032 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                        /* JADX INFO: renamed from: e */
                        public Ref$ObjectRef f2080e;

                        /* JADX INFO: renamed from: f */
                        public Ref$ObjectRef f2081f;

                        /* JADX INFO: renamed from: g */
                        public int f2082g;

                        /* JADX INFO: renamed from: h */
                        public /* synthetic */ Object f2083h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ InterfaceC8428d<AbstractC0414c> f2084i;

                        /* JADX INFO: renamed from: j */
                        public final /* synthetic */ InterfaceC9350c f2085j;

                        /* JADX INFO: renamed from: k */
                        public final /* synthetic */ InterfaceC5301c1<DragLogic> f2086k;

                        /* JADX INFO: renamed from: l */
                        public final /* synthetic */ Orientation f2087l;

                        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2, reason: invalid class name */
                        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                        @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", m19206f = "Draggable.kt", m19207l = {246}, m19208m = "invokeSuspend")
                        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<InterfaceC9348a, InterfaceC9968c<? super C9072e>, Object> {

                            /* JADX INFO: renamed from: e */
                            public Ref$ObjectRef f2088e;

                            /* JADX INFO: renamed from: f */
                            public int f2089f;

                            /* JADX INFO: renamed from: g */
                            public /* synthetic */ Object f2090g;

                            /* JADX INFO: renamed from: h */
                            public final /* synthetic */ Ref$ObjectRef<AbstractC0414c> f2091h;

                            /* JADX INFO: renamed from: i */
                            public final /* synthetic */ InterfaceC8428d<AbstractC0414c> f2092i;

                            /* JADX INFO: renamed from: j */
                            public final /* synthetic */ Orientation f2093j;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(Ref$ObjectRef<AbstractC0414c> ref$ObjectRef, InterfaceC8428d<AbstractC0414c> interfaceC8428d, Orientation orientation, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                                super(2, interfaceC9968c);
                                this.f2091h = ref$ObjectRef;
                                this.f2092i = interfaceC8428d;
                                this.f2093j = orientation;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: a */
                            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f2091h, this.f2092i, this.f2093j, interfaceC9968c);
                                anonymousClass2.f2090g = obj;
                                return anonymousClass2;
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final Object mo1337m0(InterfaceC9348a interfaceC9348a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                                return ((AnonymousClass2) mo1336a(interfaceC9348a, interfaceC9968c)).mo1338x(C9072e.f47360a);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007a -> B:28:0x0081). Please report as a decompilation issue!!! */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) throws Throwable {
                                InterfaceC9348a interfaceC9348a;
                                AnonymousClass2 anonymousClass2;
                                AbstractC0414c abstractC0414c;
                                AnonymousClass2 anonymousClass3;
                                T t10;
                                InterfaceC9348a interfaceC9348a2;
                                Ref$ObjectRef<AbstractC0414c> ref$ObjectRef;
                                CoroutineSingletons coroutineSingletons;
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i10 = this.f2089f;
                                if (i10 == 0) {
                                    C7499b.m14977z0(obj);
                                    interfaceC9348a = (InterfaceC9348a) this.f2090g;
                                    anonymousClass2 = this;
                                    Ref$ObjectRef<AbstractC0414c> ref$ObjectRef2 = anonymousClass2.f2091h;
                                    abstractC0414c = ref$ObjectRef2.f38127a;
                                    if (!(abstractC0414c instanceof AbstractC0414c.d) || (abstractC0414c instanceof AbstractC0414c.a)) {
                                        return C9072e.f47360a;
                                    }
                                    AbstractC0414c.b bVar = abstractC0414c instanceof AbstractC0414c.b ? (AbstractC0414c.b) abstractC0414c : null;
                                    if (bVar != null) {
                                        Orientation orientation = Orientation.Vertical;
                                        Orientation orientation2 = anonymousClass2.f2093j;
                                        long j10 = bVar.f2289a;
                                        interfaceC9348a.mo1468b(orientation2 == orientation ? C8941c.m17165d(j10) : C8941c.m17164c(j10));
                                    }
                                    anonymousClass2.f2090g = interfaceC9348a;
                                    anonymousClass2.f2088e = ref$ObjectRef2;
                                    anonymousClass2.f2089f = 1;
                                    Object objMo14338m = anonymousClass2.f2092i.mo14338m(anonymousClass2);
                                    if (objMo14338m == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                    anonymousClass3 = anonymousClass2;
                                    t10 = objMo14338m;
                                    interfaceC9348a2 = interfaceC9348a;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    coroutineSingletons = coroutineSingletons3;
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    Ref$ObjectRef<AbstractC0414c> ref$ObjectRef3 = this.f2088e;
                                    InterfaceC9348a interfaceC9348a3 = (InterfaceC9348a) this.f2090g;
                                    C7499b.m14977z0(obj);
                                    interfaceC9348a2 = interfaceC9348a3;
                                    ref$ObjectRef = ref$ObjectRef3;
                                    coroutineSingletons = coroutineSingletons2;
                                    anonymousClass3 = this;
                                    t10 = obj;
                                }
                                ref$ObjectRef.f38127a = t10;
                                anonymousClass2 = anonymousClass3;
                                coroutineSingletons2 = coroutineSingletons;
                                interfaceC9348a = interfaceC9348a2;
                                Ref$ObjectRef<AbstractC0414c> ref$ObjectRef4 = anonymousClass2.f2091h;
                                abstractC0414c = ref$ObjectRef4.f38127a;
                                if (abstractC0414c instanceof AbstractC0414c.d) {
                                }
                                return C9072e.f47360a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C04032(InterfaceC8428d<AbstractC0414c> interfaceC8428d, InterfaceC9350c interfaceC9350c, InterfaceC5301c1<DragLogic> interfaceC5301c1, Orientation orientation, InterfaceC9968c<? super C04032> interfaceC9968c) {
                            super(2, interfaceC9968c);
                            this.f2084i = interfaceC8428d;
                            this.f2085j = interfaceC9350c;
                            this.f2086k = interfaceC5301c1;
                            this.f2087l = orientation;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: a */
                        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                            C04032 c04032 = new C04032(this.f2084i, this.f2085j, this.f2086k, this.f2087l, interfaceC9968c);
                            c04032.f2083h = obj;
                            return c04032;
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                            return ((C04032) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                        }

                        /* JADX WARN: Code duplicated, block: B:22:0x006e  */
                        /* JADX WARN: Code duplicated, block: B:24:0x0088 A[RETURN] */
                        /* JADX WARN: Code duplicated, block: B:25:0x0089  */
                        /* JADX WARN: Code duplicated, block: B:28:0x0097  */
                        /* JADX WARN: Code duplicated, block: B:30:0x00be  */
                        /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
                        /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
                        /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
                        /* JADX WARN: Code duplicated, block: B:40:0x00fb A[Catch: CancellationException -> 0x012c, TryCatch #0 {CancellationException -> 0x012c, blocks: (B:38:0x00ea, B:40:0x00fb, B:43:0x0113, B:45:0x0117), top: B:58:0x00ea }] */
                        /* JADX WARN: Code duplicated, block: B:42:0x0112 A[RETURN] */
                        /* JADX WARN: Code duplicated, block: B:43:0x0113 A[Catch: CancellationException -> 0x012c, TryCatch #0 {CancellationException -> 0x012c, blocks: (B:38:0x00ea, B:40:0x00fb, B:43:0x0113, B:45:0x0117), top: B:58:0x00ea }] */
                        /* JADX WARN: Code duplicated, block: B:45:0x0117 A[Catch: CancellationException -> 0x012c, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x012c, blocks: (B:38:0x00ea, B:40:0x00fb, B:43:0x0113, B:45:0x0117), top: B:58:0x00ea }] */
                        /* JADX WARN: Code duplicated, block: B:47:0x0128 A[RETURN] */
                        /* JADX WARN: Code duplicated, block: B:53:0x014b  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0110 -> B:20:0x0067). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0115 -> B:20:0x0067). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0126 -> B:20:0x0067). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0147 -> B:20:0x0067). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x014b -> B:20:0x0067). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final java.lang.Object mo1338x(java.lang.Object r13) {
                            /*
                                Method dump skipped, instruction units count: 360
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9.C04032.mo1338x(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3 */
                    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                    @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", m19206f = "Draggable.kt", m19207l = {263}, m19208m = "invokeSuspend")
                    final class C04043 extends SuspendLambda implements InterfaceC2056p<InterfaceC5035v, InterfaceC9968c<? super C9072e>, Object> {

                        /* JADX INFO: renamed from: e */
                        public int f2094e;

                        /* JADX INFO: renamed from: f */
                        public /* synthetic */ Object f2095f;

                        /* JADX INFO: renamed from: g */
                        public final /* synthetic */ boolean f2096g;

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ InterfaceC5301c1<InterfaceC2052l<C5028o, Boolean>> f2097h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ InterfaceC5301c1<InterfaceC2041a<Boolean>> f2098i;

                        /* JADX INFO: renamed from: j */
                        public final /* synthetic */ Orientation f2099j;

                        /* JADX INFO: renamed from: k */
                        public final /* synthetic */ InterfaceC8428d<AbstractC0414c> f2100k;

                        /* JADX INFO: renamed from: l */
                        public final /* synthetic */ boolean f2101l;

                        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1, reason: invalid class name */
                        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                        @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", m19206f = "Draggable.kt", m19207l = {265}, m19208m = "invokeSuspend")
                        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                            /* JADX INFO: renamed from: e */
                            public int f2102e;

                            /* JADX INFO: renamed from: f */
                            public /* synthetic */ Object f2103f;

                            /* JADX INFO: renamed from: g */
                            public final /* synthetic */ InterfaceC5035v f2104g;

                            /* JADX INFO: renamed from: h */
                            public final /* synthetic */ InterfaceC5301c1<InterfaceC2052l<C5028o, Boolean>> f2105h;

                            /* JADX INFO: renamed from: i */
                            public final /* synthetic */ InterfaceC5301c1<InterfaceC2041a<Boolean>> f2106i;

                            /* JADX INFO: renamed from: j */
                            public final /* synthetic */ Orientation f2107j;

                            /* JADX INFO: renamed from: k */
                            public final /* synthetic */ InterfaceC8428d<AbstractC0414c> f2108k;

                            /* JADX INFO: renamed from: l */
                            public final /* synthetic */ boolean f2109l;

                            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1, reason: invalid class name and collision with other inner class name */
                            @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                            @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", m19206f = "Draggable.kt", m19207l = {268, 276}, m19208m = "invokeSuspend")
                            public static final class C105851 extends RestrictedSuspendLambda implements InterfaceC2056p<InterfaceC5016c, InterfaceC9968c<? super C9072e>, Object> {

                                /* JADX INFO: renamed from: H */
                                public final /* synthetic */ InterfaceC8428d<AbstractC0414c> f2110H;

                                /* JADX INFO: renamed from: I */
                                public final /* synthetic */ boolean f2111I;

                                /* JADX INFO: renamed from: c */
                                public C0519a f2112c;

                                /* JADX INFO: renamed from: d */
                                public InterfaceC8428d f2113d;

                                /* JADX INFO: renamed from: e */
                                public InterfaceC7882z f2114e;

                                /* JADX INFO: renamed from: f */
                                public boolean f2115f;

                                /* JADX INFO: renamed from: g */
                                public int f2116g;

                                /* JADX INFO: renamed from: h */
                                public /* synthetic */ Object f2117h;

                                /* JADX INFO: renamed from: i */
                                public final /* synthetic */ InterfaceC7882z f2118i;

                                /* JADX INFO: renamed from: j */
                                public final /* synthetic */ InterfaceC5301c1<InterfaceC2052l<C5028o, Boolean>> f2119j;

                                /* JADX INFO: renamed from: k */
                                public final /* synthetic */ InterfaceC5301c1<InterfaceC2041a<Boolean>> f2120k;

                                /* JADX INFO: renamed from: l */
                                public final /* synthetic */ Orientation f2121l;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C105851(InterfaceC7882z interfaceC7882z, InterfaceC5301c1<? extends InterfaceC2052l<? super C5028o, Boolean>> interfaceC5301c1, InterfaceC5301c1<? extends InterfaceC2041a<Boolean>> interfaceC5301c2, Orientation orientation, InterfaceC8428d<AbstractC0414c> interfaceC8428d, boolean z10, InterfaceC9968c<? super C105851> interfaceC9968c) {
                                    super(interfaceC9968c);
                                    this.f2118i = interfaceC7882z;
                                    this.f2119j = interfaceC5301c1;
                                    this.f2120k = interfaceC5301c2;
                                    this.f2121l = orientation;
                                    this.f2110H = interfaceC8428d;
                                    this.f2111I = z10;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                /* JADX INFO: renamed from: a */
                                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                                    C105851 c105851 = new C105851(this.f2118i, this.f2119j, this.f2120k, this.f2121l, this.f2110H, this.f2111I, interfaceC9968c);
                                    c105851.f2117h = obj;
                                    return c105851;
                                }

                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final Object mo1337m0(InterfaceC5016c interfaceC5016c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                                    return ((C105851) mo1336a(interfaceC5016c, interfaceC9968c)).mo1338x(C9072e.f47360a);
                                }

                                /* JADX WARN: Code duplicated, block: B:19:0x0055  */
                                /* JADX WARN: Code duplicated, block: B:21:0x0075 A[RETURN] */
                                /* JADX WARN: Code duplicated, block: B:22:0x0076  */
                                /* JADX WARN: Code duplicated, block: B:25:0x007e  */
                                /* JADX WARN: Code duplicated, block: B:29:0x0093  */
                                /* JADX WARN: Code duplicated, block: B:30:0x0096  */
                                /* JADX WARN: Code duplicated, block: B:35:0x00ba A[RETURN] */
                                /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
                                /* JADX WARN: Code duplicated, block: B:68:0x0138  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bb -> B:78:0x00c5). Please report as a decompilation issue!!! */
                                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0128 -> B:64:0x012e). Please report as a decompilation issue!!! */
                                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0138 -> B:17:0x004d). Please report as a decompilation issue!!! */
                                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                    */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                /* JADX INFO: renamed from: x */
                                public final java.lang.Object mo1338x(java.lang.Object r20) {
                                    /*
                                        Method dump skipped, instruction units count: 323
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9.C04043.AnonymousClass1.C105851.mo1338x(java.lang.Object):java.lang.Object");
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass1(InterfaceC5035v interfaceC5035v, InterfaceC5301c1<? extends InterfaceC2052l<? super C5028o, Boolean>> interfaceC5301c1, InterfaceC5301c1<? extends InterfaceC2041a<Boolean>> interfaceC5301c2, Orientation orientation, InterfaceC8428d<AbstractC0414c> interfaceC8428d, boolean z10, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                                super(2, interfaceC9968c);
                                this.f2104g = interfaceC5035v;
                                this.f2105h = interfaceC5301c1;
                                this.f2106i = interfaceC5301c2;
                                this.f2107j = orientation;
                                this.f2108k = interfaceC8428d;
                                this.f2109l = z10;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: a */
                            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2104g, this.f2105h, this.f2106i, this.f2107j, this.f2108k, this.f2109l, interfaceC9968c);
                                anonymousClass1.f2103f = obj;
                                return anonymousClass1;
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                                return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                            }

                            /* JADX WARN: Code duplicated, block: B:24:0x005c  */
                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) throws Throwable {
                                InterfaceC7882z interfaceC7882z;
                                CancellationException e10;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i10 = this.f2102e;
                                if (i10 == 0) {
                                    C7499b.m14977z0(obj);
                                    InterfaceC7882z interfaceC7882z2 = (InterfaceC7882z) this.f2103f;
                                    try {
                                        InterfaceC5035v interfaceC5035v = this.f2104g;
                                        C105851 c105851 = new C105851(interfaceC7882z2, this.f2105h, this.f2106i, this.f2107j, this.f2108k, this.f2109l, null);
                                        this.f2103f = interfaceC7882z2;
                                        this.f2102e = 1;
                                        if (interfaceC5035v.mo2020D0(c105851, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } catch (CancellationException e11) {
                                        interfaceC7882z = interfaceC7882z2;
                                        e10 = e11;
                                        if (!C7499b.m14923U(interfaceC7882z)) {
                                            throw e10;
                                        }
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    interfaceC7882z = (InterfaceC7882z) this.f2103f;
                                    try {
                                        C7499b.m14977z0(obj);
                                    } catch (CancellationException e12) {
                                        e10 = e12;
                                        if (!C7499b.m14923U(interfaceC7882z)) {
                                            throw e10;
                                        }
                                    }
                                }
                                return C9072e.f47360a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C04043(boolean z10, InterfaceC5301c1<? extends InterfaceC2052l<? super C5028o, Boolean>> interfaceC5301c1, InterfaceC5301c1<? extends InterfaceC2041a<Boolean>> interfaceC5301c2, Orientation orientation, InterfaceC8428d<AbstractC0414c> interfaceC8428d, boolean z11, InterfaceC9968c<? super C04043> interfaceC9968c) {
                            super(2, interfaceC9968c);
                            this.f2096g = z10;
                            this.f2097h = interfaceC5301c1;
                            this.f2098i = interfaceC5301c2;
                            this.f2099j = orientation;
                            this.f2100k = interfaceC8428d;
                            this.f2101l = z11;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: a */
                        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                            C04043 c04043 = new C04043(this.f2096g, this.f2097h, this.f2098i, this.f2099j, this.f2100k, this.f2101l, interfaceC9968c);
                            c04043.f2095f = obj;
                            return c04043;
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final Object mo1337m0(InterfaceC5035v interfaceC5035v, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                            return ((C04043) mo1336a(interfaceC5035v, interfaceC9968c)).mo1338x(C9072e.f47360a);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) throws Throwable {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i10 = this.f2094e;
                            if (i10 == 0) {
                                C7499b.m14977z0(obj);
                                InterfaceC5035v interfaceC5035v = (InterfaceC5035v) this.f2095f;
                                if (!this.f2096g) {
                                    return C9072e.f47360a;
                                }
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC5035v, this.f2097h, this.f2098i, this.f2099j, this.f2100k, this.f2101l, null);
                                this.f2094e = 1;
                                if (C7499b.m14963s(anonymousClass1, this) == coroutineSingletons) {
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
                    {
                        super(3);
                    }

                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a3, Integer num2) {
                        InterfaceC0476a interfaceC0476a4 = interfaceC0476a3;
                        C0204c.m861u(num2, interfaceC0500b2, "$this$composed", interfaceC0476a4, 597193710);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                        interfaceC0476a4.mo1622c(-492369756);
                        Object objMo1624d10 = interfaceC0476a4.mo1624d();
                        InterfaceC0476a.a.C10586a c10586a2 = InterfaceC0476a.a.f3122a;
                        if (objMo1624d10 == c10586a2) {
                            objMo1624d10 = C8573r0.m16684L0(null);
                            interfaceC0476a4.mo1655t(objMo1624d10);
                        }
                        interfaceC0476a4.mo1661w();
                        final InterfaceC5312g0 interfaceC5312g1 = (InterfaceC5312g0) objMo1624d10;
                        interfaceC0476a4.mo1622c(511388516);
                        boolean zMo1665y7 = interfaceC0476a4.mo1665y(interfaceC5312g1);
                        final InterfaceC9612j interfaceC9612j2 = interfaceC9612j;
                        boolean zMo1665y8 = zMo1665y7 | interfaceC0476a4.mo1665y(interfaceC9612j2);
                        Object objMo1624d11 = interfaceC0476a4.mo1624d();
                        if (zMo1665y8 || objMo1624d11 == c10586a2) {
                            objMo1624d11 = new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final InterfaceC5327o mo528n(C5329p c5329p) {
                                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                                    return new C9349b(interfaceC5312g1, interfaceC9612j2);
                                }
                            };
                            interfaceC0476a4.mo1655t(objMo1624d11);
                        }
                        interfaceC0476a4.mo1661w();
                        C5333r.m11459a(interfaceC9612j2, (InterfaceC2052l) objMo1624d11, interfaceC0476a4);
                        interfaceC0476a4.mo1622c(-492369756);
                        Object objMo1624d12 = interfaceC0476a4.mo1624d();
                        if (objMo1624d12 == c10586a2) {
                            objMo1624d12 = C8573r0.m16738m(Integer.MAX_VALUE, null, 6);
                            interfaceC0476a4.mo1655t(objMo1624d12);
                        }
                        interfaceC0476a4.mo1661w();
                        InterfaceC8428d interfaceC8428d = (InterfaceC8428d) objMo1624d12;
                        InterfaceC5312g0 interfaceC5312g0M16704V1 = C8573r0.m16704V0(interfaceC2041a, interfaceC0476a4);
                        InterfaceC5312g0 interfaceC5312g0M16704V2 = C8573r0.m16704V0(scrollableKt$pointerScrollable$1, interfaceC0476a4);
                        InterfaceC5312g0 interfaceC5312g0M16704V3 = C8573r0.m16704V0(new DragLogic(draggableKt$draggable$6, interfaceC2057q3, interfaceC5312g1, interfaceC9612j2), interfaceC0476a4);
                        InterfaceC9350c interfaceC9350c = scrollDraggableState;
                        C5333r.m11460b(interfaceC9350c, new C04032(interfaceC8428d, interfaceC9350c, interfaceC5312g0M16704V3, orientation3, null), interfaceC0476a4);
                        InterfaceC0500b interfaceC0500bM2034c = SuspendingPointerInputFilterKt.m2034c(new Object[]{orientation3, Boolean.valueOf(z14), Boolean.valueOf(z15)}, new C04043(z14, interfaceC5312g0M16704V2, interfaceC5312g0M16704V1, orientation3, interfaceC8428d, z15, null));
                        interfaceC0476a4.mo1661w();
                        return interfaceC0500bM2034c;
                    }
                }), interfaceC5312g0M16704V0, c8584v, new ScrollableKt$mouseWheelScroll$1(c8584v, interfaceC5312g0M16704V0, null)), interfaceC1657a, (NestedScrollDispatcher) interfaceC5312g0.getValue());
                interfaceC0476a2.mo1661w();
                InterfaceC0500b interfaceC0500bMo1929K2 = interfaceC0500bM2016a.mo1929K(z10 ? C9352e.f48091a : aVar2);
                interfaceC0476a2.mo1661w();
                return interfaceC0500bMo1929K2;
            }
        });
    }
}
