package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", m19206f = "Scrollable.kt", m19207l = {516}, m19208m = "onPostFling-RZ2iAVY")
public final class ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ScrollableKt$scrollableNestedScrollConnection$1 f2198d;

    /* JADX INFO: renamed from: e */
    public long f2199e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2200f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ScrollableKt$scrollableNestedScrollConnection$1 f2201g;

    /* JADX INFO: renamed from: h */
    public int f2202h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1, InterfaceC9968c<? super ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2201g = scrollableKt$scrollableNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2200f = obj;
        this.f2202h |= Integer.MIN_VALUE;
        return this.f2201g.mo1476c(0L, 0L, this);
    }
}
