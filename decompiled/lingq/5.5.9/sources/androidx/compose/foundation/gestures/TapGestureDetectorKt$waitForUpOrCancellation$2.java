package androidx.compose.foundation.gestures;

import androidx.compose.p017ui.input.pointer.PointerEventPass;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p060d1.InterfaceC5016c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m19206f = "TapGestureDetector.kt", m19207l = {305, 320}, m19208m = "waitForUpOrCancellation")
public final class TapGestureDetectorKt$waitForUpOrCancellation$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public InterfaceC5016c f2263d;

    /* JADX INFO: renamed from: e */
    public PointerEventPass f2264e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2265f;

    /* JADX INFO: renamed from: g */
    public int f2266g;

    public TapGestureDetectorKt$waitForUpOrCancellation$2(InterfaceC9968c<? super TapGestureDetectorKt$waitForUpOrCancellation$2> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2265f = obj;
        this.f2266g |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.m1487d(null, null, this);
    }
}
