package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import no.InterfaceC7882z;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DragLogic", m19206f = "Draggable.kt", m19207l = {414, 417}, m19208m = "processDragStop")
public final class DragLogic$processDragStop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public DragLogic f2046d;

    /* JADX INFO: renamed from: e */
    public InterfaceC7882z f2047e;

    /* JADX INFO: renamed from: f */
    public AbstractC0414c.d f2048f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f2049g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DragLogic f2050h;

    /* JADX INFO: renamed from: i */
    public int f2051i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragStop$1(DragLogic dragLogic, InterfaceC9968c<? super DragLogic$processDragStop$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2050h = dragLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2049g = obj;
        this.f2051i |= Integer.MIN_VALUE;
        return this.f2050h.m1453c(null, null, this);
    }
}
