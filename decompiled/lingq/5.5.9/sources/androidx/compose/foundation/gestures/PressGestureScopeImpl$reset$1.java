package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m19206f = "TapGestureDetector.kt", m19207l = {357}, m19208m = "reset")
public final class PressGestureScopeImpl$reset$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PressGestureScopeImpl f2142d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2143e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PressGestureScopeImpl f2144f;

    /* JADX INFO: renamed from: g */
    public int f2145g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$reset$1(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9968c<? super PressGestureScopeImpl$reset$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2144f = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2143e = obj;
        this.f2145g |= Integer.MIN_VALUE;
        return this.f2144f.m1461a(this);
    }
}
