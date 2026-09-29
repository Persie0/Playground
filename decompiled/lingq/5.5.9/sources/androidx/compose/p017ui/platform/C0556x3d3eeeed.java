package androidx.compose.p017ui.platform;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p325po.InterfaceC8430f;
import p326q.C8448d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", m19206f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", m19207l = {2024, 2054}, m19208m = "boundsUpdatesEventLoop")
public final class C0556x3d3eeeed extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public AndroidComposeViewAccessibilityDelegateCompat f4047d;

    /* JADX INFO: renamed from: e */
    public C8448d f4048e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8430f f4049f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f4050g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f4051h;

    /* JADX INFO: renamed from: i */
    public int f4052i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0556x3d3eeeed(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, InterfaceC9968c<? super C0556x3d3eeeed> interfaceC9968c) {
        super(interfaceC9968c);
        this.f4051h = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f4050g = obj;
        this.f4052i |= Integer.MIN_VALUE;
        return this.f4051h.m2289k(this);
    }
}
