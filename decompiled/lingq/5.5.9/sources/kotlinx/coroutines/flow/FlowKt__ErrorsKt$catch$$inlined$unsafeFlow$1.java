package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7116c f40105a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2057q f40106b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 */
    @Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m19206f = "Errors.kt", m19207l = {113, 114}, m19208m = "collect")
    public static final class C70981 extends ContinuationImpl {

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f40107d;

        /* JADX INFO: renamed from: e */
        public int f40108e;

        /* JADX INFO: renamed from: g */
        public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 f40110g;

        /* JADX INFO: renamed from: h */
        public InterfaceC7117d f40111h;

        public C70981(InterfaceC9968c interfaceC9968c) {
            super(interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) {
            this.f40107d = obj;
            this.f40108e |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.this.mo9539a(null, this);
        }
    }

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(InterfaceC7116c interfaceC7116c, InterfaceC2057q interfaceC2057q) {
        this.f40105a = interfaceC7116c;
        this.f40106b = interfaceC2057q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        C70981 c70981;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        if (interfaceC9968c instanceof C70981) {
            c70981 = (C70981) interfaceC9968c;
            int i10 = c70981.f40108e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c70981.f40108e = i10 - Integer.MIN_VALUE;
            } else {
                c70981 = new C70981(interfaceC9968c);
            }
        } else {
            c70981 = new C70981(interfaceC9968c);
        }
        Object objM14383a = c70981.f40107d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = c70981.f40108e;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC7117d = c70981.f40111h;
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = c70981.f40110g;
                C7499b.m14977z0(objM14383a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM14383a);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM14383a);
        c70981.f40110g = this;
        c70981.f40111h = interfaceC7117d;
        c70981.f40108e = 1;
        objM14383a = C7121h.m14383a(c70981, this.f40105a, interfaceC7117d);
        if (objM14383a == obj) {
            return obj;
        }
        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = this;
        Throwable th2 = (Throwable) objM14383a;
        if (th2 != null) {
            InterfaceC2057q interfaceC2057q = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.f40106b;
            c70981.f40110g = null;
            c70981.f40111h = null;
            c70981.f40108e = 2;
            if (interfaceC2057q.mo1343M(interfaceC7117d, th2, c70981) == obj) {
                return obj;
            }
        }
        return C9072e.f47360a;
    }
}
