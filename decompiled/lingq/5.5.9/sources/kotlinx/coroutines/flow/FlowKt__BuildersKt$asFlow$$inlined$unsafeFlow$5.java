package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p249lo.InterfaceC7415h;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9329q;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5 implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7415h f40049a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 */
    @Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", m19206f = "Builders.kt", m19207l = {115}, m19208m = "collect")
    public static final class C70941 extends ContinuationImpl {

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f40050d;

        /* JADX INFO: renamed from: e */
        public int f40051e;

        /* JADX INFO: renamed from: g */
        public InterfaceC7117d f40053g;

        /* JADX INFO: renamed from: h */
        public Iterator f40054h;

        public C70941(InterfaceC9968c interfaceC9968c) {
            super(interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) {
            this.f40050d = obj;
            this.f40051e |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5.this.mo9539a(null, this);
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(C9329q c9329q) {
        this.f40049a = c9329q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        C70941 c70941;
        InterfaceC7117d interfaceC7117d2;
        Iterator it;
        if (interfaceC9968c instanceof C70941) {
            c70941 = (C70941) interfaceC9968c;
            int i10 = c70941.f40051e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c70941.f40051e = i10 - Integer.MIN_VALUE;
            } else {
                c70941 = new C70941(interfaceC9968c);
            }
        } else {
            c70941 = new C70941(interfaceC9968c);
        }
        Object obj = c70941.f40050d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = c70941.f40051e;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            interfaceC7117d2 = interfaceC7117d;
            it = this.f40049a.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c70941.f40054h;
            interfaceC7117d2 = c70941.f40053g;
            C7499b.m14977z0(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            c70941.f40053g = interfaceC7117d2;
            c70941.f40054h = it;
            c70941.f40051e = 1;
            if (interfaceC7117d2.mo1339r(next, c70941) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
