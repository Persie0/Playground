package androidx.view;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import kotlinx.coroutines.sync.InterfaceC7198b;
import kotlinx.coroutines.sync.MutexImpl;
import no.AbstractC7821c1;
import no.C7828f;
import no.C7832g0;
import no.C7843k;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m19206f = "RepeatOnLifecycle.kt", m19207l = {84}, m19208m = "invokeSuspend")
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f6556e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f6557f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle f6558g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Lifecycle.State f6559h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> f6560i;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m19206f = "RepeatOnLifecycle.kt", m19207l = {166}, m19208m = "invokeSuspend")
    public static final class C10131 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> f6561H;

        /* JADX INFO: renamed from: e */
        public Ref$ObjectRef f6562e;

        /* JADX INFO: renamed from: f */
        public Ref$ObjectRef f6563f;

        /* JADX INFO: renamed from: g */
        public InterfaceC7882z f6564g;

        /* JADX INFO: renamed from: h */
        public InterfaceC2056p f6565h;

        /* JADX INFO: renamed from: i */
        public int f6566i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Lifecycle f6567j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Lifecycle.State f6568k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ InterfaceC7882z f6569l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10131(Lifecycle lifecycle, Lifecycle.State state, InterfaceC7882z interfaceC7882z, InterfaceC2056p<? super InterfaceC7882z, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C10131> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f6567j = lifecycle;
            this.f6568k = state;
            this.f6569l = interfaceC7882z;
            this.f6561H = interfaceC2056p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C10131(this.f6567j, this.f6568k, this.f6569l, this.f6561H, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C10131) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0086  */
        /* JADX WARN: Code duplicated, block: B:26:0x008f  */
        /* JADX WARN: Code duplicated, block: B:33:0x009e  */
        /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, androidx.lifecycle.p] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Ref$ObjectRef ref$ObjectRef;
            Ref$ObjectRef ref$ObjectRef2;
            InterfaceC7875v0 interfaceC7875v0;
            InterfaceC1049o interfaceC1049o;
            InterfaceC7875v0 interfaceC7875v1;
            InterfaceC1049o interfaceC1049o2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f6566i;
            Lifecycle lifecycle = this.f6567j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef2 = this.f6563f;
                ref$ObjectRef = this.f6562e;
                try {
                    C7499b.m14977z0(obj);
                    interfaceC7875v1 = (InterfaceC7875v0) ref$ObjectRef.f38127a;
                    if (interfaceC7875v1 != null) {
                        interfaceC7875v1.mo15618a(null);
                    }
                    interfaceC1049o2 = (InterfaceC1049o) ref$ObjectRef2.f38127a;
                    if (interfaceC1049o2 != null) {
                        lifecycle.mo3885c(interfaceC1049o2);
                    }
                    return C9072e.f47360a;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC7875v0 = (InterfaceC7875v0) ref$ObjectRef.f38127a;
                    if (interfaceC7875v0 != null) {
                        interfaceC7875v0.mo15618a(null);
                    }
                    interfaceC1049o = (InterfaceC1049o) ref$ObjectRef2.f38127a;
                    if (interfaceC1049o != null) {
                        lifecycle.mo3885c(interfaceC1049o);
                    }
                    throw th;
                }
            }
            C7499b.m14977z0(obj);
            if (lifecycle.mo3884b() == Lifecycle.State.DESTROYED) {
                return C9072e.f47360a;
            }
            final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
            try {
                Lifecycle.State state = this.f6568k;
                final InterfaceC7882z interfaceC7882z = this.f6569l;
                final InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> interfaceC2056p = this.f6561H;
                this.f6562e = ref$ObjectRef3;
                this.f6563f = ref$ObjectRef4;
                this.f6564g = interfaceC7882z;
                this.f6565h = interfaceC2056p;
                this.f6566i = 1;
                final C7843k c7843k = new C7843k(1, C8656b.m16874A(this));
                c7843k.m15594r();
                Lifecycle.Event.INSTANCE.getClass();
                final Lifecycle.Event eventM3888c = Lifecycle.Event.Companion.m3888c(state);
                final Lifecycle.Event eventM3886a = Lifecycle.Event.Companion.m3886a(state);
                final MutexImpl mutexImpl = new MutexImpl(false);
                ?? r15 = new InterfaceC1049o() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 */
                    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                    @InterfaceC10224c(m19205c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", m19206f = "RepeatOnLifecycle.kt", m19207l = {171, 110}, m19208m = "invokeSuspend")
                    public static final class C10141 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                        /* JADX INFO: renamed from: e */
                        public InterfaceC7198b f6577e;

                        /* JADX INFO: renamed from: f */
                        public InterfaceC2056p f6578f;

                        /* JADX INFO: renamed from: g */
                        public int f6579g;

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ InterfaceC7198b f6580h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> f6581i;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C10141(InterfaceC7198b interfaceC7198b, InterfaceC2056p<? super InterfaceC7882z, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C10141> interfaceC9968c) {
                            super(2, interfaceC9968c);
                            this.f6580h = interfaceC7198b;
                            this.f6581i = interfaceC2056p;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: a */
                        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                            return new C10141(this.f6580h, this.f6581i, interfaceC9968c);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                            return ((C10141) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) throws Throwable {
                            InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> interfaceC2056p;
                            InterfaceC7198b interfaceC7198b;
                            InterfaceC7198b interfaceC7198b2;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i10 = this.f6579g;
                            try {
                                if (i10 == 0) {
                                    C7499b.m14977z0(obj);
                                    InterfaceC7198b interfaceC7198b3 = this.f6580h;
                                    this.f6577e = interfaceC7198b3;
                                    interfaceC2056p = this.f6581i;
                                    this.f6578f = interfaceC2056p;
                                    this.f6579g = 1;
                                    if (interfaceC7198b3.mo14510a(null, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    interfaceC7198b = interfaceC7198b3;
                                } else {
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        interfaceC7198b2 = this.f6577e;
                                        try {
                                            C7499b.m14977z0(obj);
                                            C9072e c9072e = C9072e.f47360a;
                                            interfaceC7198b2.mo14511b(null);
                                            return C9072e.f47360a;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            interfaceC7198b = interfaceC7198b2;
                                            interfaceC7198b.mo14511b(null);
                                            throw th;
                                        }
                                    }
                                    interfaceC2056p = this.f6578f;
                                    interfaceC7198b = this.f6577e;
                                    C7499b.m14977z0(obj);
                                }
                                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(interfaceC2056p, null);
                                this.f6577e = interfaceC7198b;
                                this.f6578f = null;
                                this.f6579g = 2;
                                if (C7499b.m14963s(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                interfaceC7198b2 = interfaceC7198b;
                                C9072e c9072e2 = C9072e.f47360a;
                                interfaceC7198b2.mo14511b(null);
                                return C9072e.f47360a;
                            } catch (Throwable th3) {
                                th = th3;
                                interfaceC7198b.mo14511b(null);
                                throw th;
                            }
                        }
                    }

                    /* JADX WARN: Type inference failed for: r3v2, types: [T, no.l1] */
                    @Override // androidx.view.InterfaceC1049o
                    /* JADX INFO: renamed from: e */
                    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                        Lifecycle.Event event2 = eventM3888c;
                        Ref$ObjectRef<InterfaceC7875v0> ref$ObjectRef5 = ref$ObjectRef3;
                        if (event == event2) {
                            ref$ObjectRef5.f38127a = C7828f.m15570d(interfaceC7882z, null, null, new C10141(mutexImpl, interfaceC2056p, null), 3);
                            return;
                        }
                        if (event == eventM3886a) {
                            InterfaceC7875v0 interfaceC7875v2 = ref$ObjectRef5.f38127a;
                            if (interfaceC7875v2 != null) {
                                interfaceC7875v2.mo15618a(null);
                            }
                            ref$ObjectRef5.f38127a = null;
                        }
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            c7843k.mo2031y(C9072e.f47360a);
                        }
                    }
                };
                ref$ObjectRef4.f38127a = r15;
                lifecycle.mo3883a(r15);
                if (c7843k.m15593p() == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef3;
                ref$ObjectRef2 = ref$ObjectRef4;
                interfaceC7875v1 = (InterfaceC7875v0) ref$ObjectRef.f38127a;
                if (interfaceC7875v1 != null) {
                    interfaceC7875v1.mo15618a(null);
                }
                interfaceC1049o2 = (InterfaceC1049o) ref$ObjectRef2.f38127a;
                if (interfaceC1049o2 != null) {
                    lifecycle.mo3885c(interfaceC1049o2);
                }
                return C9072e.f47360a;
            } catch (Throwable th3) {
                th = th3;
                ref$ObjectRef = ref$ObjectRef3;
                ref$ObjectRef2 = ref$ObjectRef4;
                interfaceC7875v0 = (InterfaceC7875v0) ref$ObjectRef.f38127a;
                if (interfaceC7875v0 != null) {
                    interfaceC7875v0.mo15618a(null);
                }
                interfaceC1049o = (InterfaceC1049o) ref$ObjectRef2.f38127a;
                if (interfaceC1049o != null) {
                    lifecycle.mo3885c(interfaceC1049o);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2056p<? super InterfaceC7882z, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f6558g = lifecycle;
        this.f6559h = state;
        this.f6560i = interfaceC2056p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f6558g, this.f6559h, this.f6560i, interfaceC9968c);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f6557f = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f6556e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f6557f;
            C7178b c7178b = C7832g0.f42930a;
            AbstractC7821c1 abstractC7821c1Mo14316C1 = C7162l.f40438a.mo14316C1();
            C10131 c10131 = new C10131(this.f6558g, this.f6559h, interfaceC7882z, this.f6560i, null);
            this.f6556e = 1;
            if (C7828f.m15574h(this, abstractC7821c1Mo14316C1, c10131) == coroutineSingletons) {
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
