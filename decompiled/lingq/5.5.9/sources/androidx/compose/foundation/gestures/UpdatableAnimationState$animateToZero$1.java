package androidx.compose.foundation.gestures;

import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.InterfaceC9068a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.UpdatableAnimationState", m19206f = "UpdatableAnimationState.kt", m19207l = {100, 146}, m19208m = "animateToZero")
public final class UpdatableAnimationState$animateToZero$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public UpdatableAnimationState f2273d;

    /* JADX INFO: renamed from: e */
    public InterfaceC9068a f2274e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2041a f2275f;

    /* JADX INFO: renamed from: g */
    public float f2276g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f2277h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ UpdatableAnimationState f2278i;

    /* JADX INFO: renamed from: j */
    public int f2279j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, InterfaceC9968c<? super UpdatableAnimationState$animateToZero$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2278i = updatableAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2277h = obj;
        this.f2279j |= Integer.MIN_VALUE;
        return this.f2278i.m1488a(null, null, this);
    }
}
