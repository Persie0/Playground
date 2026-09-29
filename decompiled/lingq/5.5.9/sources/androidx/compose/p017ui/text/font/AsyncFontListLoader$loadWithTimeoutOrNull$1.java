package androidx.compose.p017ui.text.font;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p328q1.InterfaceC8468e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.text.font.AsyncFontListLoader", m19206f = "FontListFontFamilyTypefaceAdapter.kt", m19207l = {300}, m19208m = "loadWithTimeoutOrNull$ui_text_release")
public final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public InterfaceC8468e f4601d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f4602e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AsyncFontListLoader f4603f;

    /* JADX INFO: renamed from: g */
    public int f4604g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, InterfaceC9968c<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f4603f = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f4602e = obj;
        this.f4604g |= Integer.MIN_VALUE;
        return this.f4603f.m2592f(null, this);
    }
}
