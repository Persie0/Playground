package androidx.compose.foundation.gestures;

import androidx.compose.p017ui.input.pointer.PointerEventPass;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p060d1.C5028o;
import p060d1.InterfaceC5016c;
import p060d1.InterfaceC5035v;
import p260m8.C7499b;
import p375s0.C8941c;
import p401u.InterfaceC9354g;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m19206f = "TapGestureDetector.kt", m19207l = {232}, m19208m = "invokeSuspend")
public final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2243e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2244f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC5035v f2245g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2057q<InterfaceC9354g, C8941c, InterfaceC9968c<? super C9072e>, Object> f2246h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC2052l<C8941c, C9072e> f2247i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ PressGestureScopeImpl f2248j;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Ld1/c;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m19206f = "TapGestureDetector.kt", m19207l = {237, 245}, m19208m = "invokeSuspend")
    public static final class C04111 extends RestrictedSuspendLambda implements InterfaceC2056p<InterfaceC5016c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: c */
        public int f2249c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f2250d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC7882z f2251e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC2057q<InterfaceC9354g, C8941c, InterfaceC9968c<? super C9072e>, Object> f2252f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC2052l<C8941c, C9072e> f2253g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ PressGestureScopeImpl f2254h;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m19206f = "TapGestureDetector.kt", m19207l = {234}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f2255e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ PressGestureScopeImpl f2256f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f2256f = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f2256f, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f2255e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    this.f2255e = 1;
                    if (this.f2256f.m1461a(this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", m19206f = "TapGestureDetector.kt", m19207l = {241}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f2257e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ InterfaceC2057q<InterfaceC9354g, C8941c, InterfaceC9968c<? super C9072e>, Object> f2258f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ PressGestureScopeImpl f2259g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C5028o f2260h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(InterfaceC2057q<? super InterfaceC9354g, ? super C8941c, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2057q, PressGestureScopeImpl pressGestureScopeImpl, C5028o c5028o, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f2258f = interfaceC2057q;
                this.f2259g = pressGestureScopeImpl;
                this.f2260h = c5028o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass2(this.f2258f, this.f2259g, this.f2260h, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f2257e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    C8941c c8941c = new C8941c(this.f2260h.f32837c);
                    this.f2257e = 1;
                    if (this.f2258f.mo1343M(this.f2259g, c8941c, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", m19206f = "TapGestureDetector.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PressGestureScopeImpl f2261e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9968c<? super AnonymousClass3> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f2261e = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass3(this.f2261e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PressGestureScopeImpl pressGestureScopeImpl = this.f2261e;
                pressGestureScopeImpl.f2140c = true;
                pressGestureScopeImpl.f2141d.mo14511b(null);
                return C9072e.f47360a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", m19206f = "TapGestureDetector.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PressGestureScopeImpl f2262e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9968c<? super AnonymousClass4> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f2262e = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass4(this.f2262e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PressGestureScopeImpl pressGestureScopeImpl = this.f2262e;
                pressGestureScopeImpl.f2139b = true;
                pressGestureScopeImpl.f2141d.mo14511b(null);
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04111(InterfaceC7882z interfaceC7882z, InterfaceC2057q<? super InterfaceC9354g, ? super C8941c, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2057q, InterfaceC2052l<? super C8941c, C9072e> interfaceC2052l, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9968c<? super C04111> interfaceC9968c) {
            super(interfaceC9968c);
            this.f2251e = interfaceC7882z;
            this.f2252f = interfaceC2057q;
            this.f2253g = interfaceC2052l;
            this.f2254h = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C04111 c04111 = new C04111(this.f2251e, this.f2252f, this.f2253g, this.f2254h, interfaceC9968c);
            c04111.f2250d = obj;
            return c04111;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC5016c interfaceC5016c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04111) mo1336a(interfaceC5016c, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0087  */
        /* JADX WARN: Code duplicated, block: B:27:0x009a  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC5016c interfaceC5016c;
            C5028o c5028o;
            InterfaceC2052l<C8941c, C9072e> interfaceC2052l;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2249c;
            InterfaceC7882z interfaceC7882z = this.f2251e;
            PressGestureScopeImpl pressGestureScopeImpl = this.f2254h;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC5016c = (InterfaceC5016c) this.f2250d;
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                c5028o = (C5028o) obj;
                if (c5028o == null) {
                    C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass3(pressGestureScopeImpl, null), 3);
                } else {
                    c5028o.m10713a();
                    C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass4(pressGestureScopeImpl, null), 3);
                    interfaceC2052l = this.f2253g;
                    if (interfaceC2052l != null) {
                        interfaceC2052l.mo528n(new C8941c(c5028o.f32837c));
                    }
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            interfaceC5016c = (InterfaceC5016c) this.f2250d;
            C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass1(pressGestureScopeImpl, null), 3);
            this.f2250d = interfaceC5016c;
            this.f2249c = 1;
            obj = TapGestureDetectorKt.m1484a(interfaceC5016c, (2 & 1) != 0, (2 & 2) != 0 ? PointerEventPass.Main : null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            C5028o c5028o2 = (C5028o) obj;
            c5028o2.m10713a();
            InterfaceC2057q<InterfaceC9354g, C8941c, InterfaceC9968c<? super C9072e>, Object> interfaceC2057q = TapGestureDetectorKt.f2237a;
            InterfaceC2057q<InterfaceC9354g, C8941c, InterfaceC9968c<? super C9072e>, Object> interfaceC2057q2 = this.f2252f;
            if (interfaceC2057q2 != interfaceC2057q) {
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass2(interfaceC2057q2, pressGestureScopeImpl, c5028o2, null), 3);
            }
            this.f2250d = null;
            this.f2249c = 2;
            obj = TapGestureDetectorKt.m1487d(interfaceC5016c, PointerEventPass.Main, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            c5028o = (C5028o) obj;
            if (c5028o == null) {
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass3(pressGestureScopeImpl, null), 3);
            } else {
                c5028o.m10713a();
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass4(pressGestureScopeImpl, null), 3);
                interfaceC2052l = this.f2253g;
                if (interfaceC2052l != null) {
                    interfaceC2052l.mo528n(new C8941c(c5028o.f32837c));
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$detectTapAndPress$2(InterfaceC5035v interfaceC5035v, InterfaceC2057q<? super InterfaceC9354g, ? super C8941c, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2057q, InterfaceC2052l<? super C8941c, C9072e> interfaceC2052l, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9968c<? super TapGestureDetectorKt$detectTapAndPress$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2245g = interfaceC5035v;
        this.f2246h = interfaceC2057q;
        this.f2247i = interfaceC2052l;
        this.f2248j = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.f2245g, this.f2246h, this.f2247i, this.f2248j, interfaceC9968c);
        tapGestureDetectorKt$detectTapAndPress$2.f2244f = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2243e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C04111 c04111 = new C04111((InterfaceC7882z) this.f2244f, this.f2246h, this.f2247i, this.f2248j, null);
            this.f2243e = 1;
            if (ForEachGestureKt.m1458b(this.f2245g, c04111, this) == coroutineSingletons) {
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
