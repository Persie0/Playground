package androidx.view.compose;

import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7882z;
import p081e0.InterfaceC5322l0;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1", m19206f = "FlowExt.kt", m19207l = {171}, m19208m = "invokeSuspend")
final class FlowExtKt$collectAsStateWithLifecycle$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC5322l0<Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f6621e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f6622f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle f6623g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Lifecycle.State f6624h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CoroutineContext f6625i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7116c<Object> f6626j;

    /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1 */
    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", m19206f = "FlowExt.kt", m19207l = {173, 174}, m19208m = "invokeSuspend")
    public static final class C10251 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f6627e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CoroutineContext f6628f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC7116c<Object> f6629g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC5322l0<Object> f6630h;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2, reason: invalid class name */
        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
        @InterfaceC10224c(m19205c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2", m19206f = "FlowExt.kt", m19207l = {175}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f6631e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ InterfaceC7116c<Object> f6632f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ InterfaceC5322l0<Object> f6633g;

            /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2$a */
            public static final class a implements InterfaceC7117d<Object> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC5322l0<Object> f6634a;

                public a(InterfaceC5322l0<Object> interfaceC5322l0) {
                    this.f6634a = interfaceC5322l0;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    this.f6634a.setValue(obj);
                    return C9072e.f47360a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC7116c<Object> interfaceC7116c, InterfaceC5322l0<Object> interfaceC5322l0, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f6632f = interfaceC7116c;
                this.f6633g = interfaceC5322l0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass2(this.f6632f, this.f6633g, interfaceC9968c);
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
                int i10 = this.f6631e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    a aVar = new a(this.f6633g);
                    this.f6631e = 1;
                    if (this.f6632f.mo9539a(aVar, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$a */
        public static final class a implements InterfaceC7117d<Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC5322l0<Object> f6635a;

            public a(InterfaceC5322l0<Object> interfaceC5322l0) {
                this.f6635a = interfaceC5322l0;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7117d
            /* JADX INFO: renamed from: r */
            public final Object mo1339r(Object obj, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                this.f6635a.setValue(obj);
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10251(CoroutineContext coroutineContext, InterfaceC7116c<Object> interfaceC7116c, InterfaceC5322l0<Object> interfaceC5322l0, InterfaceC9968c<? super C10251> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f6628f = coroutineContext;
            this.f6629g = interfaceC7116c;
            this.f6630h = interfaceC5322l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C10251(this.f6628f, this.f6629g, this.f6630h, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C10251) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f6627e;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            } else {
                C7499b.m14977z0(obj);
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f38093a;
                CoroutineContext coroutineContext = this.f6628f;
                boolean zM11106a = C5207g.m11106a(coroutineContext, emptyCoroutineContext);
                InterfaceC5322l0<Object> interfaceC5322l0 = this.f6630h;
                InterfaceC7116c<Object> interfaceC7116c = this.f6629g;
                if (zM11106a) {
                    a aVar = new a(interfaceC5322l0);
                    this.f6627e = 1;
                    if (interfaceC7116c.mo9539a(aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC7116c, interfaceC5322l0, null);
                    this.f6627e = 2;
                    if (C7828f.m15574h(this, coroutineContext, anonymousClass2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectAsStateWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, InterfaceC7116c<Object> interfaceC7116c, InterfaceC9968c<? super FlowExtKt$collectAsStateWithLifecycle$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f6623g = lifecycle;
        this.f6624h = state;
        this.f6625i = coroutineContext;
        this.f6626j = interfaceC7116c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        FlowExtKt$collectAsStateWithLifecycle$1 flowExtKt$collectAsStateWithLifecycle$1 = new FlowExtKt$collectAsStateWithLifecycle$1(this.f6623g, this.f6624h, this.f6625i, this.f6626j, interfaceC9968c);
        flowExtKt$collectAsStateWithLifecycle$1.f6622f = obj;
        return flowExtKt$collectAsStateWithLifecycle$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC5322l0<Object> interfaceC5322l0, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1) mo1336a(interfaceC5322l0, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f6621e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC5322l0 interfaceC5322l0 = (InterfaceC5322l0) this.f6622f;
            C10251 c10251 = new C10251(this.f6625i, this.f6626j, interfaceC5322l0, null);
            this.f6621e = 1;
            if (RepeatOnLifecycleKt.m3906b(this.f6623g, this.f6624h, c10251, this) == coroutineSingletons) {
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
