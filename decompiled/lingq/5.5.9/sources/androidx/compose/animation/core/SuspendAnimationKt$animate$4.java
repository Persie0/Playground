package androidx.compose.animation.core;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p374s.AbstractC8911i;
import p374s.C8903e;
import p374s.InterfaceC8895a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.animation.core.SuspendAnimationKt", m19206f = "SuspendAnimation.kt", m19207l = {239, 278}, m19208m = "animate")
public final class SuspendAnimationKt$animate$4<T, V extends AbstractC8911i> extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public C8903e f1552d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8895a f1553e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2052l f1554f;

    /* JADX INFO: renamed from: g */
    public Ref$ObjectRef f1555g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f1556h;

    /* JADX INFO: renamed from: i */
    public int f1557i;

    public SuspendAnimationKt$animate$4(InterfaceC9968c<? super SuspendAnimationKt$animate$4> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f1556h = obj;
        this.f1557i |= Integer.MIN_VALUE;
        return SuspendAnimationKt.m1354a(null, null, 0L, null, this);
    }
}
