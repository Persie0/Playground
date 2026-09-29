package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m19206f = "ScrollExtensions.kt", m19207l = {40}, m19208m = "animateScrollBy")
final class ScrollExtensionsKt$animateScrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Ref$FloatRef f2156d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2157e;

    /* JADX INFO: renamed from: f */
    public int f2158f;

    public ScrollExtensionsKt$animateScrollBy$1(InterfaceC9968c<? super ScrollExtensionsKt$animateScrollBy$1> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2157e = obj;
        this.f2158f |= Integer.MIN_VALUE;
        return C0415d.m1492a(null, 0.0f, null, this);
    }
}
