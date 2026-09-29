package androidx.compose.foundation.relocation;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p375s0.C8942d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", m19206f = "BringIntoViewRequester.kt", m19207l = {126}, m19208m = "bringIntoView")
public final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public C8942d f2440d;

    /* JADX INFO: renamed from: e */
    public Object[] f2441e;

    /* JADX INFO: renamed from: f */
    public int f2442f;

    /* JADX INFO: renamed from: g */
    public int f2443g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f2444h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ BringIntoViewRequesterImpl f2445i;

    /* JADX INFO: renamed from: j */
    public int f2446j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, InterfaceC9968c<? super BringIntoViewRequesterImpl$bringIntoView$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2445i = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2444h = obj;
        this.f2446j |= Integer.MIN_VALUE;
        return this.f2445i.mo1525a(null, this);
    }
}
