package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollingLogic", m19206f = "Scrollable.kt", m19207l = {430}, m19208m = "doFlingAnimation-QWom1Mo")
public final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Ref$LongRef f2213d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2214e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ScrollingLogic f2215f;

    /* JADX INFO: renamed from: g */
    public int f2216g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, InterfaceC9968c<? super ScrollingLogic$doFlingAnimation$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2215f = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2214e = obj;
        this.f2216g |= Integer.MIN_VALUE;
        return this.f2215f.m1480b(0L, this);
    }
}
