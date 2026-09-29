package androidx.compose.p017ui.text.font;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p328q1.InterfaceC8468e;
import p328q1.InterfaceC8479p;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", m19206f = "FontListFontFamilyTypefaceAdapter.kt", m19207l = {301}, m19208m = "invokeSuspend")
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super Object>, Object> {

    /* JADX INFO: renamed from: e */
    public int f4605e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AsyncFontListLoader f4606f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC8468e f4607g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, InterfaceC8468e interfaceC8468e, InterfaceC9968c<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f4606f = asyncFontListLoader;
        this.f4607g = interfaceC8468e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.f4606f, this.f4607g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super Object> interfaceC9968c) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4605e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC8479p interfaceC8479p = this.f4606f.f4587e;
            this.f4605e = 1;
            obj = interfaceC8479p.mo2589b(this.f4607g, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return obj;
    }
}
