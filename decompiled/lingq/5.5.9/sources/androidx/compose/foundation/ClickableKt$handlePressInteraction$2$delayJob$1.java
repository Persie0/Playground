package androidx.compose.foundation;

import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p260m8.C7499b;
import p386t.C9114f;
import p423v.C9615m;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", m19206f = "Clickable.kt", m19207l = {439, 442}, m19208m = "invokeSuspend")
public final class ClickableKt$handlePressInteraction$2$delayJob$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public C9615m f1794e;

    /* JADX INFO: renamed from: f */
    public int f1795f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC5301c1<InterfaceC2041a<Boolean>> f1796g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f1797h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC9612j f1798i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC5312g0<C9615m> f1799j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableKt$handlePressInteraction$2$delayJob$1(InterfaceC5301c1<? extends InterfaceC2041a<Boolean>> interfaceC5301c1, long j10, InterfaceC9612j interfaceC9612j, InterfaceC5312g0<C9615m> interfaceC5312g0, InterfaceC9968c<? super ClickableKt$handlePressInteraction$2$delayJob$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1796g = interfaceC5301c1;
        this.f1797h = j10;
        this.f1798i = interfaceC9612j;
        this.f1799j = interfaceC5312g0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.f1796g, this.f1797h, this.f1798i, this.f1799j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        C9615m c9615m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1795f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c9615m = this.f1794e;
                C7499b.m14977z0(obj);
            }
            this.f1799j.setValue(c9615m);
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        if (this.f1796g.getValue().mo807E().booleanValue()) {
            long j10 = C9114f.f47613a;
            this.f1795f = 1;
            if (C7828f.m15567a(j10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        C9615m c9615m2 = new C9615m(this.f1797h);
        this.f1794e = c9615m2;
        this.f1795f = 2;
        if (this.f1798i.mo18074c(c9615m2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        c9615m = c9615m2;
        this.f1799j.setValue(c9615m);
        return C9072e.f47360a;
    }
}
