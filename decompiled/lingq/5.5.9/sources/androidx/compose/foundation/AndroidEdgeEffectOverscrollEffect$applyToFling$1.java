package androidx.compose.foundation;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", m19206f = "AndroidOverscroll.kt", m19207l = {219, 244}, m19208m = "applyToFling-BMRW4eQ")
public final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public AndroidEdgeEffectOverscrollEffect f1687d;

    /* JADX INFO: renamed from: e */
    public long f1688e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f1689f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect f1690g;

    /* JADX INFO: renamed from: h */
    public int f1691h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, InterfaceC9968c<? super AndroidEdgeEffectOverscrollEffect$applyToFling$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f1690g = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f1689f = obj;
        this.f1691h |= Integer.MIN_VALUE;
        return this.f1690g.mo1395b(0L, null, this);
    }
}
