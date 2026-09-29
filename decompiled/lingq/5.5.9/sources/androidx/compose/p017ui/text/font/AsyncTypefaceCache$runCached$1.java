package androidx.compose.p017ui.text.font;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.text.font.AsyncTypefaceCache", m19206f = "FontListFontFamilyTypefaceAdapter.kt", m19207l = {394}, m19208m = "runCached")
final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public C0695a f4608d;

    /* JADX INFO: renamed from: e */
    public C0695a.b f4609e;

    /* JADX INFO: renamed from: f */
    public boolean f4610f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f4611g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0695a f4612h;

    /* JADX INFO: renamed from: i */
    public int f4613i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(C0695a c0695a, InterfaceC9968c<? super AsyncTypefaceCache$runCached$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f4612h = c0695a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f4611g = obj;
        this.f4613i |= Integer.MIN_VALUE;
        return this.f4612h.m2594b(null, null, null, this);
    }
}
