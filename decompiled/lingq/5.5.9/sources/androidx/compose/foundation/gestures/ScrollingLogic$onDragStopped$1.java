package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollingLogic", m19206f = "Scrollable.kt", m19207l = {419, 421}, m19208m = "onDragStopped-sF-c-tU")
public final class ScrollingLogic$onDragStopped$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ScrollingLogic f2229d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2230e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ScrollingLogic f2231f;

    /* JADX INFO: renamed from: g */
    public int f2232g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$1(ScrollingLogic scrollingLogic, InterfaceC9968c<? super ScrollingLogic$onDragStopped$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2231f = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2230e = obj;
        this.f2232g |= Integer.MIN_VALUE;
        return this.f2231f.m1481c(0L, this);
    }
}
