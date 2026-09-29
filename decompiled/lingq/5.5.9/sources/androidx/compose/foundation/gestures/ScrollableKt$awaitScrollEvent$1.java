package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p060d1.InterfaceC5016c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollableKt", m19206f = "Scrollable.kt", m19207l = {313}, m19208m = "awaitScrollEvent")
final class ScrollableKt$awaitScrollEvent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public InterfaceC5016c f2170d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2171e;

    /* JADX INFO: renamed from: f */
    public int f2172f;

    public ScrollableKt$awaitScrollEvent$1(InterfaceC9968c<? super ScrollableKt$awaitScrollEvent$1> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2171e = obj;
        this.f2172f |= Integer.MIN_VALUE;
        return ScrollableKt.m1469a(null, this);
    }
}
