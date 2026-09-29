package androidx.compose.foundation;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p423v.C9615m;
import p423v.C9616n;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", m19206f = "Clickable.kt", m19207l = {549}, m19208m = "invokeSuspend")
final class C0382x8f00ca0b extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f1783e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC9612j f1784f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C9615m f1785g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0382x8f00ca0b(InterfaceC9612j interfaceC9612j, C9615m c9615m, InterfaceC9968c<? super C0382x8f00ca0b> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1784f = interfaceC9612j;
        this.f1785g = c9615m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C0382x8f00ca0b(this.f1784f, this.f1785g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C0382x8f00ca0b) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1783e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C9616n c9616n = new C9616n(this.f1785g);
            this.f1783e = 1;
            if (this.f1784f.mo18074c(c9616n, this) == coroutineSingletons) {
                return coroutineSingletons;
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
