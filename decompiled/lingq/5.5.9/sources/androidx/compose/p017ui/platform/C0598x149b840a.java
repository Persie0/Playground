package androidx.compose.p017ui.platform;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.view.InterfaceC1051q;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.InterfaceC7142w;
import no.C7828f;
import no.C7848l1;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", m19206f = "WindowRecomposer.android.kt", m19207l = {392}, m19208m = "invokeSuspend")
public final class C0598x149b840a extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f4243e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f4244f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Ref$ObjectRef<C0670v0> f4245g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Recomposer f4246h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1051q f4247i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0597xff837ba9 f4248j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f4249k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0598x149b840a(Ref$ObjectRef<C0670v0> ref$ObjectRef, Recomposer recomposer, InterfaceC1051q interfaceC1051q, C0597xff837ba9 c0597xff837ba9, View view, InterfaceC9968c<? super C0598x149b840a> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f4245g = ref$ObjectRef;
        this.f4246h = recomposer;
        this.f4247i = interfaceC1051q;
        this.f4248j = c0597xff837ba9;
        this.f4249k = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        C0598x149b840a c0598x149b840a = new C0598x149b840a(this.f4245g, this.f4246h, this.f4247i, this.f4248j, this.f4249k, interfaceC9968c);
        c0598x149b840a.f4244f = obj;
        return c0598x149b840a;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C0598x149b840a) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7875v0 interfaceC7875v0;
        C7848l1 c7848l1M15570d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4243e;
        C0597xff837ba9 c0597xff837ba9 = this.f4248j;
        InterfaceC1051q interfaceC1051q = this.f4247i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC7875v0 = (InterfaceC7875v0) this.f4244f;
            try {
                C7499b.m14977z0(obj);
                if (interfaceC7875v0 != null) {
                    interfaceC7875v0.mo15618a(null);
                }
                interfaceC1051q.mo786G().mo3885c(c0597xff837ba9);
                return C9072e.f47360a;
            } catch (Throwable th2) {
                th = th2;
                if (interfaceC7875v0 != null) {
                    interfaceC7875v0.mo15618a(null);
                }
                interfaceC1051q.mo786G().mo3885c(c0597xff837ba9);
                throw th;
            }
        }
        C7499b.m14977z0(obj);
        InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f4244f;
        try {
            C0670v0 c0670v0 = this.f4245g.f38127a;
            if (c0670v0 != null) {
                Context applicationContext = this.f4249k.getContext().getApplicationContext();
                C5207g.m11110e(applicationContext, "context.applicationContext");
                InterfaceC7142w interfaceC7142wM2329a = C0604a2.m2329a(applicationContext);
                c0670v0.f4356a.setValue(Float.valueOf(((Number) interfaceC7142wM2329a.getValue()).floatValue()));
                c7848l1M15570d = C7828f.m15570d(interfaceC7882z, null, null, new C0599x93d788e4(interfaceC7142wM2329a, c0670v0, null), 3);
            } else {
                c7848l1M15570d = null;
            }
            try {
                Recomposer recomposer = this.f4246h;
                this.f4244f = c7848l1M15570d;
                this.f4243e = 1;
                if (recomposer.m1709B(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC7875v0 = c7848l1M15570d;
                if (interfaceC7875v0 != null) {
                    interfaceC7875v0.mo15618a(null);
                }
                interfaceC1051q.mo786G().mo3885c(c0597xff837ba9);
                return C9072e.f47360a;
            } catch (Throwable th3) {
                interfaceC7875v0 = c7848l1M15570d;
                th = th3;
                if (interfaceC7875v0 != null) {
                    interfaceC7875v0.mo15618a(null);
                }
                interfaceC1051q.mo786G().mo3885c(c0597xff837ba9);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            interfaceC7875v0 = null;
        }
    }
}
