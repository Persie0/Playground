package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import no.InterfaceC7882z;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DragLogic", m19206f = "Draggable.kt", m19207l = {422, 425}, m19208m = "processDragCancel")
public final class DragLogic$processDragCancel$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public DragLogic f2034d;

    /* JADX INFO: renamed from: e */
    public InterfaceC7882z f2035e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2036f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DragLogic f2037g;

    /* JADX INFO: renamed from: h */
    public int f2038h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragCancel$1(DragLogic dragLogic, InterfaceC9968c<? super DragLogic$processDragCancel$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2037g = dragLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2036f = obj;
        this.f2038h |= Integer.MIN_VALUE;
        return this.f2037g.m1451a(null, this);
    }
}
