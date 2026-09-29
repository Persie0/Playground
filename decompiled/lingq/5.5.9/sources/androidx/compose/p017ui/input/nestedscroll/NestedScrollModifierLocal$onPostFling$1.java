package androidx.compose.p017ui.input.nestedscroll;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", m19206f = "NestedScrollModifierLocal.kt", m19207l = {94, 96}, m19208m = "onPostFling-RZ2iAVY")
public final class NestedScrollModifierLocal$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public NestedScrollModifierLocal f3594d;

    /* JADX INFO: renamed from: e */
    public long f3595e;

    /* JADX INFO: renamed from: f */
    public long f3596f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f3597g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ NestedScrollModifierLocal f3598h;

    /* JADX INFO: renamed from: i */
    public int f3599i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierLocal$onPostFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, InterfaceC9968c<? super NestedScrollModifierLocal$onPostFling$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f3598h = nestedScrollModifierLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f3597g = obj;
        this.f3599i |= Integer.MIN_VALUE;
        return this.f3598h.mo1476c(0L, 0L, this);
    }
}
