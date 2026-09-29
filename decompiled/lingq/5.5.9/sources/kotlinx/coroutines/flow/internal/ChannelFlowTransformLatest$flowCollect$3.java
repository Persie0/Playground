package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m13365d2 = {"T", "R", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m19206f = "Merge.kt", m19207l = {27}, m19208m = "invokeSuspend")
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40299e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f40300f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ChannelFlowTransformLatest<T, R> f40301g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC7117d<R> f40302h;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 */
    public static final class C71231<T> implements InterfaceC7117d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref$ObjectRef<InterfaceC7875v0> f40303a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7882z f40304b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ChannelFlowTransformLatest<T, R> f40305c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC7117d<R> f40306d;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m13365d2 = {"T", "R", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m19206f = "Merge.kt", m19207l = {34}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f40307e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ChannelFlowTransformLatest<T, R> f40308f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ InterfaceC7117d<R> f40309g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ T f40310h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, InterfaceC7117d<? super R> interfaceC7117d, T t10, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f40308f = channelFlowTransformLatest;
                this.f40309g = interfaceC7117d;
                this.f40310h = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass2(this.f40308f, this.f40309g, this.f40310h, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

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
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f40307e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    InterfaceC2057q<InterfaceC7117d<? super R>, T, InterfaceC9968c<? super C9072e>, Object> interfaceC2057q = this.f40308f.f40298e;
                    this.f40307e = 1;
                    if (interfaceC2057q.mo1343M(this.f40309g, this.f40310h, this) == obj2) {
                        return obj2;
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

        /* JADX WARN: Multi-variable type inference failed */
        public C71231(Ref$ObjectRef<InterfaceC7875v0> ref$ObjectRef, InterfaceC7882z interfaceC7882z, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, InterfaceC7117d<? super R> interfaceC7117d) {
            this.f40303a = ref$ObjectRef;
            this.f40304b = interfaceC7882z;
            this.f40305c = channelFlowTransformLatest;
            this.f40306d = interfaceC7117d;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
            ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            C71231<T> c71231;
            if (interfaceC9968c instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) interfaceC9968c;
                int i10 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f40316i;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f40316i = i10 - Integer.MIN_VALUE;
                } else {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, interfaceC9968c);
                }
            } else {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, interfaceC9968c);
            }
            Object obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.f40314g;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f40316i;
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC7875v0 interfaceC7875v0 = this.f40303a.f38127a;
                if (interfaceC7875v0 != null) {
                    interfaceC7875v0.mo15618a(new ChildCancelledException());
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f40311d = this;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f40312e = t10;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f40313f = interfaceC7875v0;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f40316i = 1;
                    if (interfaceC7875v0.mo15615E(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                c71231 = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t10 = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.f40312e;
                c71231 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f40311d;
                C7499b.m14977z0(obj);
            }
            c71231.f40303a.f38127a = (T) C7828f.m15570d(c71231.f40304b, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(c71231.f40305c, c71231.f40306d, t10, null), 1);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, InterfaceC7117d<? super R> interfaceC7117d, InterfaceC9968c<? super ChannelFlowTransformLatest$flowCollect$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f40301g = channelFlowTransformLatest;
        this.f40302h = interfaceC7117d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.f40301g, this.f40302h, interfaceC9968c);
        channelFlowTransformLatest$flowCollect$3.f40300f = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChannelFlowTransformLatest$flowCollect$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 for r11v1 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r12) {
        /*
            r11 = this;
            r7 = r11
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r9 = 4
            int r1 = r7.f40299e
            r9 = 4
            r9 = 1
            r2 = r9
            if (r1 == 0) goto L1d
            r9 = 6
            if (r1 != r2) goto L13
            p260m8.C7499b.m14977z0(r12)
            r9 = 4
            goto L44
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r10 = 5
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
            r9 = 4
        L1d:
            p260m8.C7499b.m14977z0(r12)
            java.lang.Object r12 = r7.f40300f
            no.z r12 = (no.InterfaceC7882z) r12
            r9 = 7
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r9 = 3
            r1.<init>()
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r3 = r7.f40301g
            kotlinx.coroutines.flow.c<S> r4 = r3.f40359d
            r10 = 6
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r5 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1
            kotlinx.coroutines.flow.d<R> r6 = r7.f40302h
            r9 = 3
            r5.<init>(r1, r12, r3, r6)
            r9 = 6
            r7.f40299e = r2
            java.lang.Object r9 = r4.mo9539a(r5, r7)
            r12 = r9
            if (r12 != r0) goto L44
            r10 = 2
            return r0
        L44:
            sl.e r12 = sl.C9072e.f47360a
            r9 = 3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.mo1338x(java.lang.Object):java.lang.Object");
    }
}
