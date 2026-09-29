package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import no.InterfaceC7882z;
import p423v.C9604b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DragLogic", m19206f = "Draggable.kt", m19207l = {404, 407, 409}, m19208m = "processDragStart")
public final class DragLogic$processDragStart$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public DragLogic f2039d;

    /* JADX INFO: renamed from: e */
    public InterfaceC7882z f2040e;

    /* JADX INFO: renamed from: f */
    public AbstractC0414c.c f2041f;

    /* JADX INFO: renamed from: g */
    public C9604b f2042g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f2043h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DragLogic f2044i;

    /* JADX INFO: renamed from: j */
    public int f2045j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragStart$1(DragLogic dragLogic, InterfaceC9968c<? super DragLogic$processDragStart$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2044i = dragLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2043h = obj;
        this.f2045j |= Integer.MIN_VALUE;
        return this.f2044i.m1452b(null, null, this);
    }
}
