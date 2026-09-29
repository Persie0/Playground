package androidx.compose.foundation;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p081e0.InterfaceC5312g0;
import p260m8.C7499b;
import p423v.C9608f;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", m19206f = "Hoverable.kt", m19207l = {ModuleDescriptor.MODULE_VERSION}, m19208m = "invokeSuspend")
final class HoverableKt$hoverable$2$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f1847e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f1848f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC5312g0<C9608f> f1849g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC9612j f1850h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableKt$hoverable$2$2$1(boolean z10, InterfaceC5312g0<C9608f> interfaceC5312g0, InterfaceC9612j interfaceC9612j, InterfaceC9968c<? super HoverableKt$hoverable$2$2$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1848f = z10;
        this.f1849g = interfaceC5312g0;
        this.f1850h = interfaceC9612j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HoverableKt$hoverable$2$2$1(this.f1848f, this.f1849g, this.f1850h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HoverableKt$hoverable$2$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1847e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            if (!this.f1848f) {
                this.f1847e = 1;
                if (HoverableKt$hoverable$2.m1414b(this.f1850h, this.f1849g, this) == coroutineSingletons) {
                    return coroutineSingletons;
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
