package androidx.compose.p017ui.text.font;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p328q1.InterfaceC8468e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.text.font.AsyncFontListLoader", m19206f = "FontListFontFamilyTypefaceAdapter.kt", m19207l = {268, 281}, m19208m = "load")
public final class AsyncFontListLoader$load$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public AsyncFontListLoader f4590d;

    /* JADX INFO: renamed from: e */
    public List f4591e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8468e f4592f;

    /* JADX INFO: renamed from: g */
    public int f4593g;

    /* JADX INFO: renamed from: h */
    public int f4594h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f4595i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AsyncFontListLoader f4596j;

    /* JADX INFO: renamed from: k */
    public int f4597k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, InterfaceC9968c<? super AsyncFontListLoader$load$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f4596j = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f4595i = obj;
        this.f4597k |= Integer.MIN_VALUE;
        return this.f4596j.m2591e(this);
    }
}
