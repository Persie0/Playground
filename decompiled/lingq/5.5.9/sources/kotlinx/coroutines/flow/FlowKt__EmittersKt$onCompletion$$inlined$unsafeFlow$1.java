package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7116c f40090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2057q f40091b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 */
    @Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m19206f = "Emitters.kt", m19207l = {114, 121, BuildConfig.SDK_TRUNCATE_LENGTH}, m19208m = "collect")
    public static final class C70961 extends ContinuationImpl {

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f40092d;

        /* JADX INFO: renamed from: e */
        public int f40093e;

        /* JADX INFO: renamed from: g */
        public Object f40095g;

        /* JADX INFO: renamed from: h */
        public InterfaceC7117d f40096h;

        public C70961(InterfaceC9968c interfaceC9968c) {
            super(interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) {
            this.f40092d = obj;
            this.f40093e |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.mo9539a(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, InterfaceC2057q interfaceC2057q) {
        this.f40090a = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
        this.f40091b = interfaceC2057q;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        C70961 c70961;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        C7145z c7145z;
        InterfaceC2057q interfaceC2057q;
        SafeCollector safeCollector;
        Throwable th2;
        SafeCollector safeCollector2;
        InterfaceC2057q interfaceC2057q2;
        if (interfaceC9968c instanceof C70961) {
            c70961 = (C70961) interfaceC9968c;
            int i10 = c70961.f40093e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c70961.f40093e = i10 - Integer.MIN_VALUE;
            } else {
                c70961 = new C70961(interfaceC9968c);
            }
        } else {
            c70961 = new C70961(interfaceC9968c);
        }
        Object obj = c70961.f40092d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = c70961.f40093e;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            try {
                InterfaceC7116c interfaceC7116c = this.f40090a;
                c70961.f40095g = this;
                c70961.f40096h = interfaceC7117d;
                c70961.f40093e = 1;
                if (interfaceC7116c.mo9539a(interfaceC7117d, c70961) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                CoroutineContext coroutineContext = c70961.f38105b;
                C5207g.m11108c(coroutineContext);
                safeCollector = new SafeCollector(interfaceC7117d, coroutineContext);
                interfaceC2057q2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f40091b;
                c70961.f40095g = safeCollector;
                c70961.f40096h = null;
                c70961.f40093e = 3;
                if (interfaceC2057q2.mo1343M(safeCollector, null, c70961) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                safeCollector2 = safeCollector;
                safeCollector2.mo13475z();
                return C9072e.f47360a;
            } catch (Throwable th3) {
                th = th3;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                c7145z = new C7145z(th);
                interfaceC2057q = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f40091b;
                c70961.f40095g = th;
                c70961.f40096h = null;
                c70961.f40093e = 2;
                if (C7120g.m14380b(c7145z, interfaceC2057q, th, c70961) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                throw th;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                Throwable th4 = (Throwable) c70961.f40095g;
                C7499b.m14977z0(obj);
                throw th4;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector2 = (SafeCollector) c70961.f40095g;
            try {
                C7499b.m14977z0(obj);
                safeCollector2.mo13475z();
                return C9072e.f47360a;
            } catch (Throwable th5) {
                th2 = th5;
                safeCollector2.mo13475z();
                throw th2;
            }
        }
        interfaceC7117d = c70961.f40096h;
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) c70961.f40095g;
        try {
            C7499b.m14977z0(obj);
            CoroutineContext coroutineContext2 = c70961.f38105b;
            C5207g.m11108c(coroutineContext2);
            safeCollector = new SafeCollector(interfaceC7117d, coroutineContext2);
            try {
                interfaceC2057q2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f40091b;
                c70961.f40095g = safeCollector;
                c70961.f40096h = null;
                c70961.f40093e = 3;
                if (interfaceC2057q2.mo1343M(safeCollector, null, c70961) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                safeCollector2 = safeCollector;
                safeCollector2.mo13475z();
                return C9072e.f47360a;
            } catch (Throwable th6) {
                th2 = th6;
                safeCollector2 = safeCollector;
                safeCollector2.mo13475z();
                throw th2;
            }
        } catch (Throwable th7) {
            th = th7;
            c7145z = new C7145z(th);
            interfaceC2057q = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f40091b;
            c70961.f40095g = th;
            c70961.f40096h = null;
            c70961.f40093e = 2;
            if (C7120g.m14380b(c7145z, interfaceC2057q, th, c70961) == coroutineSingletons) {
                return coroutineSingletons;
            }
            throw th;
        }
    }
}
