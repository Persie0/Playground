package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p325po.InterfaceC8428d;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9331s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m13365d2 = {"R", "T", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m19206f = "Combine.kt", m19207l = {57, 79, 82}, m19208m = "invokeSuspend")
final class CombineKt$combineInternal$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC2057q<InterfaceC7117d<Object>, Object[], InterfaceC9968c<? super C9072e>, Object> f40317H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC7117d<Object> f40318I;

    /* JADX INFO: renamed from: e */
    public InterfaceC8428d f40319e;

    /* JADX INFO: renamed from: f */
    public byte[] f40320f;

    /* JADX INFO: renamed from: g */
    public int f40321g;

    /* JADX INFO: renamed from: h */
    public int f40322h;

    /* JADX INFO: renamed from: i */
    public int f40323i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f40324j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC7116c<Object>[] f40325k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC2041a<Object[]> f40326l;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m13365d2 = {"R", "T", "Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m19206f = "Combine.kt", m19207l = {34}, m19208m = "invokeSuspend")
    public static final class C71241 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f40327e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC7116c<Object>[] f40328f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f40329g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ AtomicInteger f40330h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC8428d<C9331s<Object>> f40331i;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC7117d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC8428d<C9331s<Object>> f40332a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f40333b;

            public AnonymousClass1(InterfaceC8428d<C9331s<Object>> interfaceC8428d, int i10) {
                this.f40332a = interfaceC8428d;
                this.f40333b = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlinx.coroutines.flow.InterfaceC7117d
            /* JADX INFO: renamed from: r */
            public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
                CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                if (interfaceC9968c instanceof CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) interfaceC9968c;
                    int i10 = combineKt$combineInternal$2$1$1$emit$1.f40336f;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.f40336f = i10 - Integer.MIN_VALUE;
                    } else {
                        combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, interfaceC9968c);
                    }
                } else {
                    combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, interfaceC9968c);
                }
                Object obj = combineKt$combineInternal$2$1$1$emit$1.f40334d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = combineKt$combineInternal$2$1$1$emit$1.f40336f;
                if (i11 != 0) {
                    if (i11 == 1) {
                        C7499b.m14977z0(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj);
                    }
                }
                C7499b.m14977z0(obj);
                C9331s<Object> c9331s = new C9331s<>(this.f40333b, t10);
                combineKt$combineInternal$2$1$1$emit$1.f40336f = 1;
                if (this.f40332a.mo16480k(c9331s, combineKt$combineInternal$2$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                combineKt$combineInternal$2$1$1$emit$1.f40336f = 2;
                return C8573r0.m16740m1(combineKt$combineInternal$2$1$1$emit$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C71241(InterfaceC7116c<Object>[] interfaceC7116cArr, int i10, AtomicInteger atomicInteger, InterfaceC8428d<C9331s<Object>> interfaceC8428d, InterfaceC9968c<? super C71241> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f40328f = interfaceC7116cArr;
            this.f40329g = i10;
            this.f40330h = atomicInteger;
            this.f40331i = interfaceC8428d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C71241(this.f40328f, this.f40329g, this.f40330h, this.f40331i, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C71241) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f40327e;
            AtomicInteger atomicInteger = this.f40330h;
            InterfaceC8428d<C9331s<Object>> interfaceC8428d = this.f40331i;
            try {
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    InterfaceC7116c<Object>[] interfaceC7116cArr = this.f40328f;
                    int i11 = this.f40329g;
                    InterfaceC7116c<Object> interfaceC7116c = interfaceC7116cArr[i11];
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC8428d, i11);
                    this.f40327e = 1;
                    if (interfaceC7116c.mo9539a(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    interfaceC8428d.mo16477h(null);
                }
                return C9072e.f47360a;
            } catch (Throwable th2) {
                if (atomicInteger.decrementAndGet() == 0) {
                    interfaceC8428d.mo16477h(null);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(InterfaceC9968c interfaceC9968c, InterfaceC2041a interfaceC2041a, InterfaceC2057q interfaceC2057q, InterfaceC7117d interfaceC7117d, InterfaceC7116c[] interfaceC7116cArr) {
        super(2, interfaceC9968c);
        this.f40325k = interfaceC7116cArr;
        this.f40326l = interfaceC2041a;
        this.f40317H = interfaceC2057q;
        this.f40318I = interfaceC7117d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(interfaceC9968c, this.f40326l, this.f40317H, this.f40318I, this.f40325k);
        combineKt$combineInternal$2.f40324j = obj;
        return combineKt$combineInternal$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CombineKt$combineInternal$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5 A[LOOP:0: B:32:0x00c5->B:57:?, LOOP_START, PHI: r8 r12
      0x00c5: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:29:0x00c0, B:57:?] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r12v4 tl.s) = (r12v3 tl.s), (r12v14 tl.s) binds: [B:29:0x00c0, B:57:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x014d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0158  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7 A[EDGE_INSN: B:55:0x00e7->B:43:0x00e7 BREAK  A[LOOP:0: B:32:0x00c5->B:57:?], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010c -> B:53:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x014b -> B:53:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0158 -> B:53:0x014e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:37:0x00d5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.mo1338x(java.lang.Object):java.lang.Object");
    }
}
