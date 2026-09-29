package androidx.compose.p017ui.text.font;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p328q1.InterfaceC8468e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.text.font.AndroidFontLoader", m19206f = "AndroidFontLoader.android.kt", m19207l = {61, 62}, m19208m = "awaitLoad")
public final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public AndroidFontLoader f4576d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8468e f4577e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f4578f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AndroidFontLoader f4579g;

    /* JADX INFO: renamed from: h */
    public int f4580h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, InterfaceC9968c<? super AndroidFontLoader$awaitLoad$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f4579g = androidFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f4578f = obj;
        this.f4580h |= Integer.MIN_VALUE;
        return this.f4579g.mo2589b(null, this);
    }
}
