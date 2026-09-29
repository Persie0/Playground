package androidx.compose.p017ui.node;

import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m13365d2 = {"Lsl/e;", "invoke", "()V", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class NodeCoordinator$invalidateParentLayer$1 extends Lambda implements InterfaceC2041a<C9072e> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NodeCoordinator f3867b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$invalidateParentLayer$1(NodeCoordinator nodeCoordinator) {
        super(0);
        this.f3867b = nodeCoordinator;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final C9072e mo807E() {
        NodeCoordinator nodeCoordinator = this.f3867b.f3846i;
        if (nodeCoordinator != null) {
            nodeCoordinator.m2184k1();
        }
        return C9072e.f47360a;
    }
}
