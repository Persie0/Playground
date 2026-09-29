package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2056p f40097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC7116c f40098b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 */
    @Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m19206f = "Emitters.kt", m19207l = {116, 120}, m19208m = "collect")
    public static final class C70971 extends ContinuationImpl {

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f40099d;

        /* JADX INFO: renamed from: e */
        public int f40100e;

        /* JADX INFO: renamed from: g */
        public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 f40102g;

        /* JADX INFO: renamed from: h */
        public InterfaceC7117d f40103h;

        /* JADX INFO: renamed from: i */
        public SafeCollector f40104i;

        public C70971(InterfaceC9968c interfaceC9968c) {
            super(interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) {
            this.f40099d = obj;
            this.f40100e |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.mo9539a(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(InterfaceC2056p interfaceC2056p, InterfaceC7116c interfaceC7116c) {
        this.f40097a = interfaceC2056p;
        this.f40098b = interfaceC7116c;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        C70971 c70971;
        Throwable th2;
        SafeCollector safeCollector;
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        InterfaceC7117d<? super Object> interfaceC7117d2;
        InterfaceC7116c interfaceC7116c;
        if (interfaceC9968c instanceof C70971) {
            c70971 = (C70971) interfaceC9968c;
            int i10 = c70971.f40100e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c70971.f40100e = i10 - Integer.MIN_VALUE;
            } else {
                c70971 = new C70971(interfaceC9968c);
            }
        } else {
            c70971 = new C70971(interfaceC9968c);
        }
        Object obj = c70971.f40099d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = c70971.f40100e;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            CoroutineContext coroutineContext = c70971.f38105b;
            C5207g.m11108c(coroutineContext);
            SafeCollector safeCollector2 = new SafeCollector(interfaceC7117d, coroutineContext);
            try {
                InterfaceC2056p interfaceC2056p = this.f40097a;
                c70971.f40102g = this;
                c70971.f40103h = interfaceC7117d;
                c70971.f40104i = safeCollector2;
                c70971.f40100e = 1;
                if (interfaceC2056p.mo1337m0(safeCollector2, c70971) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this;
                interfaceC7117d2 = interfaceC7117d;
                safeCollector = safeCollector2;
                safeCollector.mo13475z();
                interfaceC7116c = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f40098b;
                c70971.f40102g = null;
                c70971.f40103h = null;
                c70971.f40104i = null;
                c70971.f40100e = 2;
                if (interfaceC7116c.mo9539a(interfaceC7117d2, c70971) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th3) {
                th2 = th3;
                safeCollector = safeCollector2;
                safeCollector.mo13475z();
                throw th2;
            }
        } else if (i11 == 1) {
            safeCollector = c70971.f40104i;
            interfaceC7117d2 = c70971.f40103h;
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = c70971.f40102g;
            try {
                C7499b.m14977z0(obj);
                safeCollector.mo13475z();
                interfaceC7116c = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f40098b;
                c70971.f40102g = null;
                c70971.f40103h = null;
                c70971.f40104i = null;
                c70971.f40100e = 2;
                if (interfaceC7116c.mo9539a(interfaceC7117d2, c70971) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th4) {
                th2 = th4;
                safeCollector.mo13475z();
                throw th2;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
