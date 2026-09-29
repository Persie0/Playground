package kotlinx.coroutines.flow;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.internal.C7168r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m19206f = "Share.kt", m19207l = {214, 218, 219, 225}, m19208m = "invokeSuspend")
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f40161e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC7140u f40162f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7116c<Object> f40163g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC7132m<Object> f40164h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f40165i;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m13365d2 = {"T", "", "it", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m19206f = "Share.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C71021 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f40166e;

        public C71021(InterfaceC9968c<? super C71021> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C71021 c71021 = new C71021(interfaceC9968c);
            c71021.f40166e = ((Number) obj).intValue();
            return c71021;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super Boolean> interfaceC9968c) {
            return ((C71021) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            return Boolean.valueOf(this.f40166e > 0);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Lkotlinx/coroutines/flow/SharingCommand;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m19206f = "Share.kt", m19207l = {227}, m19208m = "invokeSuspend")
    public static final class C71032 extends SuspendLambda implements InterfaceC2056p<SharingCommand, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f40167e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f40168f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC7116c<Object> f40169g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC7132m<Object> f40170h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Object f40171i;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f40172a;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                iArr[SharingCommand.START.ordinal()] = 1;
                iArr[SharingCommand.STOP.ordinal()] = 2;
                iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                f40172a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C71032(InterfaceC7116c<Object> interfaceC7116c, InterfaceC7132m<Object> interfaceC7132m, Object obj, InterfaceC9968c<? super C71032> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f40169g = interfaceC7116c;
            this.f40170h = interfaceC7132m;
            this.f40171i = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C71032 c71032 = new C71032(this.f40169g, this.f40170h, this.f40171i, interfaceC9968c);
            c71032.f40168f = obj;
            return c71032;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(SharingCommand sharingCommand, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C71032) mo1336a(sharingCommand, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f40167e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                int i11 = a.f40172a[((SharingCommand) this.f40168f).ordinal()];
                InterfaceC7132m<Object> interfaceC7132m = this.f40170h;
                if (i11 == 1) {
                    this.f40167e = 1;
                    if (this.f40169g.mo9539a(interfaceC7132m, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i11 == 3) {
                    C7168r c7168r = C0062b.f163j;
                    Object obj2 = this.f40171i;
                    if (obj2 == c7168r) {
                        interfaceC7132m.mo14370j();
                    } else {
                        interfaceC7132m.mo14371k(obj2);
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
    public FlowKt__ShareKt$launchSharing$1(InterfaceC7140u interfaceC7140u, InterfaceC7116c<Object> interfaceC7116c, InterfaceC7132m<Object> interfaceC7132m, Object obj, InterfaceC9968c<? super FlowKt__ShareKt$launchSharing$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f40162f = interfaceC7140u;
        this.f40163g = interfaceC7116c;
        this.f40164h = interfaceC7132m;
        this.f40165i = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new FlowKt__ShareKt$launchSharing$1(this.f40162f, this.f40163g, this.f40164h, this.f40165i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((FlowKt__ShareKt$launchSharing$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1 for r12v2 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r13) {
        /*
            r12 = this;
            r8 = r12
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r11 = 1
            int r1 = r8.f40161e
            r2 = 4
            r10 = 3
            r3 = r10
            r4 = 2
            r11 = 5
            r5 = 1
            r11 = 5
            kotlinx.coroutines.flow.c<java.lang.Object> r6 = r8.f40163g
            kotlinx.coroutines.flow.m<java.lang.Object> r7 = r8.f40164h
            r10 = 2
            if (r1 == 0) goto L34
            r10 = 7
            if (r1 == r5) goto L2f
            r11 = 3
            if (r1 == r4) goto L2a
            r11 = 7
            if (r1 == r3) goto L2f
            r11 = 6
            if (r1 != r2) goto L21
            goto L30
        L21:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            r11 = 4
            throw r13
        L2a:
            r10 = 7
            p260m8.C7499b.m14977z0(r13)
            goto L66
        L2f:
            r10 = 2
        L30:
            p260m8.C7499b.m14977z0(r13)
            goto L94
        L34:
            p260m8.C7499b.m14977z0(r13)
            r10 = 3
            kotlinx.coroutines.flow.v r13 = kotlinx.coroutines.flow.InterfaceC7140u.a.f40387a
            r10 = 1
            kotlinx.coroutines.flow.u r1 = r8.f40162f
            r11 = 2
            if (r1 != r13) goto L4c
            r10 = 7
            r8.f40161e = r5
            r10 = 7
            java.lang.Object r13 = r6.mo9539a(r7, r8)
            if (r13 != r0) goto L93
            r10 = 3
            return r0
        L4c:
            kotlinx.coroutines.flow.StartedLazily r13 = kotlinx.coroutines.flow.InterfaceC7140u.a.f40388b
            r10 = 0
            r5 = r10
            if (r1 != r13) goto L71
            qo.l r13 = r7.m14388l()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r8.f40161e = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt__ReduceKt.m14361b(r13, r1, r8)
            r13 = r10
            if (r13 != r0) goto L66
            r10 = 6
            return r0
        L66:
            r8.f40161e = r3
            r11 = 5
            java.lang.Object r11 = r6.mo9539a(r7, r8)
            r13 = r11
            if (r13 != r0) goto L93
            return r0
        L71:
            r11 = 7
            qo.l r11 = r7.m14388l()
            r13 = r11
            kotlinx.coroutines.flow.c r13 = r1.mo14363a(r13)
            kotlinx.coroutines.flow.c r13 = ae.C0062b.m273H0(r13)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            r11 = 5
            java.lang.Object r3 = r8.f40165i
            r1.<init>(r6, r7, r3, r5)
            r10 = 3
            r8.f40161e = r2
            java.lang.Object r10 = ae.C0062b.m369m0(r13, r1, r8)
            r13 = r10
            if (r13 != r0) goto L93
            r11 = 2
            return r0
        L93:
            r11 = 2
        L94:
            sl.e r13 = sl.C9072e.f47360a
            r10 = 5
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
