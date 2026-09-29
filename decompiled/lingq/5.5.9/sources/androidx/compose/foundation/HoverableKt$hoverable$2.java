package androidx.compose.foundation;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import no.InterfaceC7882z;
import p060d1.InterfaceC5016c;
import p060d1.InterfaceC5035v;
import p081e0.C5319k;
import p081e0.C5329p;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p081e0.InterfaceC5336s0;
import p260m8.C7499b;
import p338qd.C8573r0;
import p386t.C9125q;
import p423v.C9608f;
import p423v.C9609g;
import p423v.InterfaceC9610h;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m13365d2 = {"Landroidx/compose/ui/b;", "invoke", "(Landroidx/compose/ui/b;Landroidx/compose/runtime/a;I)Landroidx/compose/ui/b;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class HoverableKt$hoverable$2 extends Lambda implements InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC9612j f1843b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f1844c;

    /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3 */
    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", m19206f = "Hoverable.kt", m19207l = {102}, m19208m = "invokeSuspend")
    final class C03873 extends SuspendLambda implements InterfaceC2056p<InterfaceC5035v, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f1851e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f1852f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC7882z f1853g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC9612j f1854h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC5312g0<C9608f> f1855i;

        /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1, reason: invalid class name */
        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
        @InterfaceC10224c(m19205c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", m19206f = "Hoverable.kt", m19207l = {104}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC2056p<InterfaceC5016c, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: c */
            public int f1856c;

            /* JADX INFO: renamed from: d */
            public /* synthetic */ Object f1857d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CoroutineContext f1858e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ InterfaceC7882z f1859f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ InterfaceC9612j f1860g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ InterfaceC5312g0<C9608f> f1861h;

            /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
            @InterfaceC10224c(m19205c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", m19206f = "Hoverable.kt", m19207l = {106}, m19208m = "invokeSuspend")
            public static final class C105841 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f1862e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ InterfaceC9612j f1863f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC5312g0<C9608f> f1864g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C105841(InterfaceC9612j interfaceC9612j, InterfaceC5312g0<C9608f> interfaceC5312g0, InterfaceC9968c<? super C105841> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f1863f = interfaceC9612j;
                    this.f1864g = interfaceC5312g0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new C105841(this.f1863f, this.f1864g, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((C105841) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f1862e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        this.f1862e = 1;
                        if (HoverableKt$hoverable$2.m1413a(this.f1863f, this.f1864g, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2, reason: invalid class name */
            @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
            @InterfaceC10224c(m19205c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", m19206f = "Hoverable.kt", m19207l = {107}, m19208m = "invokeSuspend")
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f1865e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ InterfaceC5312g0<C9608f> f1866f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC9612j f1867g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC9612j interfaceC9612j, InterfaceC5312g0 interfaceC5312g0, InterfaceC9968c interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f1866f = interfaceC5312g0;
                    this.f1867g = interfaceC9612j;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass2(this.f1867g, this.f1866f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f1865e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        this.f1865e = 1;
                        if (HoverableKt$hoverable$2.m1414b(this.f1867g, this.f1866f, this) == coroutineSingletons) {
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
            public AnonymousClass1(CoroutineContext coroutineContext, InterfaceC7882z interfaceC7882z, InterfaceC9612j interfaceC9612j, InterfaceC5312g0<C9608f> interfaceC5312g0, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(interfaceC9968c);
                this.f1858e = coroutineContext;
                this.f1859f = interfaceC7882z;
                this.f1860g = interfaceC9612j;
                this.f1861h = interfaceC5312g0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1858e, this.f1859f, this.f1860g, this.f1861h, interfaceC9968c);
                anonymousClass1.f1857d = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC5016c interfaceC5016c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(interfaceC5016c, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0034  */
            /* JADX WARN: Code duplicated, block: B:14:0x003e  */
            /* JADX WARN: Code duplicated, block: B:16:0x0040  */
            /* JADX WARN: Code duplicated, block: B:19:0x0050  */
            /* JADX WARN: Code duplicated, block: B:20:0x0052  */
            /* JADX WARN: Code duplicated, block: B:23:0x0060  */
            /* JADX WARN: Code duplicated, block: B:24:0x006a  */
            /* JADX WARN: Code duplicated, block: B:26:0x006f  */
            /* JADX WARN: Code duplicated, block: B:28:0x0073  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:17:0x0045). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final java.lang.Object mo1338x(java.lang.Object r15) {
                /*
                    r14 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r14.f1856c
                    r13 = 7
                    r12 = 1
                    r2 = r12
                    if (r1 == 0) goto L20
                    r13 = 4
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r14.f1857d
                    d1.c r1 = (p060d1.InterfaceC5016c) r1
                    p260m8.C7499b.m14977z0(r15)
                    r3 = r1
                    r1 = r0
                    r0 = r14
                    goto L45
                L17:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r0 = r12
                    r15.<init>(r0)
                    throw r15
                L20:
                    r13 = 3
                    p260m8.C7499b.m14977z0(r15)
                    java.lang.Object r15 = r14.f1857d
                    r13 = 2
                    d1.c r15 = (p060d1.InterfaceC5016c) r15
                    r1 = r15
                    r15 = r14
                L2b:
                    kotlin.coroutines.CoroutineContext r3 = r15.f1858e
                    boolean r12 = ae.C0062b.m394s1(r3)
                    r3 = r12
                    if (r3 == 0) goto L83
                    r15.f1857d = r1
                    r15.f1856c = r2
                    java.lang.Object r3 = p060d1.InterfaceC5016c.m10698O(r1, r15)
                    if (r3 != r0) goto L40
                    r13 = 5
                    return r0
                L40:
                    r11 = r0
                    r0 = r15
                    r15 = r3
                    r3 = r1
                    r1 = r11
                L45:
                    d1.k r15 = (p060d1.C5024k) r15
                    r13 = 4
                    int r15 = r15.f32833b
                    r13 = 2
                    r4 = 4
                    r12 = 0
                    r5 = r12
                    if (r15 != r4) goto L52
                    r4 = r2
                    goto L53
                L52:
                    r4 = r5
                L53:
                    r12 = 3
                    r6 = r12
                    r7 = 0
                    r13 = 6
                    no.z r8 = r0.f1859f
                    e0.g0<v.f> r9 = r0.f1861h
                    v.j r10 = r0.f1860g
                    r13 = 5
                    if (r4 == 0) goto L6a
                    androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1 r15 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1
                    r15.<init>(r10, r9, r7)
                    r13 = 4
                    no.C7828f.m15570d(r8, r7, r7, r15, r6)
                    goto L7f
                L6a:
                    r13 = 4
                    r12 = 5
                    r4 = r12
                    if (r15 != r4) goto L71
                    r13 = 7
                    r5 = r2
                L71:
                    if (r5 == 0) goto L7e
                    r13 = 7
                    androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2 r15 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2
                    r13 = 3
                    r15.<init>(r10, r9, r7)
                    r13 = 2
                    no.C7828f.m15570d(r8, r7, r7, r15, r6)
                L7e:
                    r13 = 1
                L7f:
                    r15 = r0
                    r0 = r1
                    r1 = r3
                    goto L2b
                L83:
                    sl.e r15 = sl.C9072e.f47360a
                    r13 = 3
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt$hoverable$2.C03873.AnonymousClass1.mo1338x(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03873(InterfaceC7882z interfaceC7882z, InterfaceC9612j interfaceC9612j, InterfaceC5312g0<C9608f> interfaceC5312g0, InterfaceC9968c<? super C03873> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f1853g = interfaceC7882z;
            this.f1854h = interfaceC9612j;
            this.f1855i = interfaceC5312g0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C03873 c03873 = new C03873(this.f1853g, this.f1854h, this.f1855i, interfaceC9968c);
            c03873.f1852f = obj;
            return c03873;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC5035v interfaceC5035v, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C03873) mo1336a(interfaceC5035v, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1851e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC5035v interfaceC5035v = (InterfaceC5035v) this.f1852f;
                CoroutineContext coroutineContext = this.f38105b;
                C5207g.m11108c(coroutineContext);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineContext, this.f1853g, this.f1854h, this.f1855i, null);
                this.f1851e = 1;
                if (interfaceC5035v.mo2020D0(anonymousClass1, this) == coroutineSingletons) {
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
    public HoverableKt$hoverable$2(InterfaceC9612j interfaceC9612j, boolean z10) {
        super(3);
        this.f1843b = interfaceC9612j;
        this.f1844c = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m1413a(InterfaceC9612j interfaceC9612j, InterfaceC5312g0 interfaceC5312g0, InterfaceC9968c interfaceC9968c) throws Throwable {
        HoverableKt$hoverable$2$invoke$emitEnter$1 hoverableKt$hoverable$2$invoke$emitEnter$1;
        C9608f c9608f;
        if (interfaceC9968c instanceof HoverableKt$hoverable$2$invoke$emitEnter$1) {
            hoverableKt$hoverable$2$invoke$emitEnter$1 = (HoverableKt$hoverable$2$invoke$emitEnter$1) interfaceC9968c;
            int i10 = hoverableKt$hoverable$2$invoke$emitEnter$1.f1871g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hoverableKt$hoverable$2$invoke$emitEnter$1.f1871g = i10 - Integer.MIN_VALUE;
            } else {
                hoverableKt$hoverable$2$invoke$emitEnter$1 = new HoverableKt$hoverable$2$invoke$emitEnter$1(interfaceC9968c);
            }
        } else {
            hoverableKt$hoverable$2$invoke$emitEnter$1 = new HoverableKt$hoverable$2$invoke$emitEnter$1(interfaceC9968c);
        }
        Object obj = hoverableKt$hoverable$2$invoke$emitEnter$1.f1870f;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = hoverableKt$hoverable$2$invoke$emitEnter$1.f1871g;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            if (((C9608f) interfaceC5312g0.getValue()) == null) {
                C9608f c9608f2 = new C9608f();
                hoverableKt$hoverable$2$invoke$emitEnter$1.f1868d = interfaceC5312g0;
                hoverableKt$hoverable$2$invoke$emitEnter$1.f1869e = c9608f2;
                hoverableKt$hoverable$2$invoke$emitEnter$1.f1871g = 1;
                if (interfaceC9612j.mo18074c(c9608f2, hoverableKt$hoverable$2$invoke$emitEnter$1) == obj2) {
                    return obj2;
                }
                c9608f = c9608f2;
            }
            return C9072e.f47360a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c9608f = hoverableKt$hoverable$2$invoke$emitEnter$1.f1869e;
        interfaceC5312g0 = hoverableKt$hoverable$2$invoke$emitEnter$1.f1868d;
        C7499b.m14977z0(obj);
        interfaceC5312g0.setValue(c9608f);
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final Object m1414b(InterfaceC9612j interfaceC9612j, InterfaceC5312g0 interfaceC5312g0, InterfaceC9968c interfaceC9968c) throws Throwable {
        HoverableKt$hoverable$2$invoke$emitExit$1 hoverableKt$hoverable$2$invoke$emitExit$1;
        if (interfaceC9968c instanceof HoverableKt$hoverable$2$invoke$emitExit$1) {
            hoverableKt$hoverable$2$invoke$emitExit$1 = (HoverableKt$hoverable$2$invoke$emitExit$1) interfaceC9968c;
            int i10 = hoverableKt$hoverable$2$invoke$emitExit$1.f1874f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hoverableKt$hoverable$2$invoke$emitExit$1.f1874f = i10 - Integer.MIN_VALUE;
            } else {
                hoverableKt$hoverable$2$invoke$emitExit$1 = new HoverableKt$hoverable$2$invoke$emitExit$1(interfaceC9968c);
            }
        } else {
            hoverableKt$hoverable$2$invoke$emitExit$1 = new HoverableKt$hoverable$2$invoke$emitExit$1(interfaceC9968c);
        }
        Object obj = hoverableKt$hoverable$2$invoke$emitExit$1.f1873e;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = hoverableKt$hoverable$2$invoke$emitExit$1.f1874f;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            C9608f c9608f = (C9608f) interfaceC5312g0.getValue();
            if (c9608f != null) {
                InterfaceC9610h c9609g = new C9609g(c9608f);
                hoverableKt$hoverable$2$invoke$emitExit$1.f1872d = interfaceC5312g0;
                hoverableKt$hoverable$2$invoke$emitExit$1.f1874f = 1;
                if (interfaceC9612j.mo18074c(c9609g, hoverableKt$hoverable$2$invoke$emitExit$1) == obj2) {
                    return obj2;
                }
            }
            return C9072e.f47360a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC5312g0 = hoverableKt$hoverable$2$invoke$emitExit$1.f1872d;
        C7499b.m14977z0(obj);
        interfaceC5312g0.setValue(null);
        return C9072e.f47360a;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a, Integer num) {
        InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
        C0204c.m861u(num, interfaceC0500b, "$this$composed", interfaceC0476a2, 1294013553);
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
        interfaceC0476a2.mo1622c(-492369756);
        Object objMo1624d2 = interfaceC0476a2.mo1624d();
        if (objMo1624d2 == c10586a) {
            objMo1624d2 = C8573r0.m16684L0(null);
            interfaceC0476a2.mo1655t(objMo1624d2);
        }
        interfaceC0476a2.mo1661w();
        final InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d2;
        interfaceC0476a2.mo1622c(511388516);
        boolean zMo1665y = interfaceC0476a2.mo1665y(interfaceC5312g0);
        final InterfaceC9612j interfaceC9612j = this.f1843b;
        boolean zMo1665y2 = zMo1665y | interfaceC0476a2.mo1665y(interfaceC9612j);
        Object objMo1624d3 = interfaceC0476a2.mo1624d();
        if (zMo1665y2 || objMo1624d3 == c10586a) {
            objMo1624d3 = new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    return new C9125q(interfaceC5312g0, interfaceC9612j);
                }
            };
            interfaceC0476a2.mo1655t(objMo1624d3);
        }
        interfaceC0476a2.mo1661w();
        C5333r.m11459a(interfaceC9612j, (InterfaceC2052l) objMo1624d3, interfaceC0476a2);
        boolean z10 = this.f1844c;
        Boolean boolValueOf = Boolean.valueOf(z10);
        Boolean boolValueOf2 = Boolean.valueOf(z10);
        interfaceC0476a2.mo1622c(1618982084);
        boolean zMo1665y3 = interfaceC0476a2.mo1665y(boolValueOf2) | interfaceC0476a2.mo1665y(interfaceC5312g0) | interfaceC0476a2.mo1665y(interfaceC9612j);
        Object objMo1624d4 = interfaceC0476a2.mo1624d();
        if (zMo1665y3 || objMo1624d4 == c10586a) {
            objMo1624d4 = new HoverableKt$hoverable$2$2$1(z10, interfaceC5312g0, interfaceC9612j, null);
            interfaceC0476a2.mo1655t(objMo1624d4);
        }
        interfaceC0476a2.mo1661w();
        C5333r.m11460b(boolValueOf, (InterfaceC2056p) objMo1624d4, interfaceC0476a2);
        InterfaceC0500b interfaceC0500bM2032a = InterfaceC0500b.a.f3325a;
        if (z10) {
            interfaceC0500bM2032a = SuspendingPointerInputFilterKt.m2032a(interfaceC0500bM2032a, interfaceC9612j, new C03873(interfaceC7882z, interfaceC9612j, interfaceC5312g0, null));
        }
        interfaceC0476a2.mo1661w();
        return interfaceC0500bM2032a;
    }
}
