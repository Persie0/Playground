package androidx.compose.runtime;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.runtime.PausableMonotonicFrameClock", m19206f = "PausableMonotonicFrameClock.kt", m19207l = {62, 63}, m19208m = "withFrameNanos")
public final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PausableMonotonicFrameClock f3041d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2052l f3042e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f3043f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PausableMonotonicFrameClock f3044g;

    /* JADX INFO: renamed from: h */
    public int f3045h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, InterfaceC9968c<? super PausableMonotonicFrameClock$withFrameNanos$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f3044g = pausableMonotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f3043f = obj;
        this.f3045h |= Integer.MIN_VALUE;
        return this.f3044g.mo1581U(null, this);
    }
}
