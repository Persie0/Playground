package androidx.compose.material.ripple;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.material.ripple.RippleAnimation", m19206f = "RippleAnimation.kt", m19207l = {80, 82, 83}, m19208m = "animate")
public final class RippleAnimation$animate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public RippleAnimation f2602d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2603e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RippleAnimation f2604f;

    /* JADX INFO: renamed from: g */
    public int f2605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$animate$1(RippleAnimation rippleAnimation, InterfaceC9968c<? super RippleAnimation$animate$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2604f = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2603e = obj;
        this.f2605g |= Integer.MIN_VALUE;
        return this.f2604f.m1550a(this);
    }
}
