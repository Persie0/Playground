package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import kotlin.jvm.internal.Lambda;
import p000.pq4;
import p000.q98;
import p000.ui3;
import p000.xfa;
import p000.ym0;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final class NodeCoordinator$drawBlock$1 extends Lambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0362l f4257b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f4258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$1(ui3 ui3Var, AbstractC0362l abstractC0362l) {
        super(2);
        this.f4257b = abstractC0362l;
        this.f4258c = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        ym0 ym0Var = (ym0) obj;
        C0312a c0312a = (C0312a) obj2;
        AbstractC0362l abstractC0362l = this.f4257b;
        C0357g c0357g = abstractC0362l.f4432J;
        if (c0357g.m1570M()) {
            abstractC0362l.f4451c0 = ym0Var;
            abstractC0362l.f4450b0 = c0312a;
            C0364n snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getSnapshotObserver();
            q98 q98Var = AbstractC0362l.f4427i0;
            snapshotObserver.f4460a.m11067c(abstractC0362l, NodeCoordinator$Companion$onCommitAffectingLayer$1.f4255b, this.f4258c);
            abstractC0362l.f4454f0 = false;
        } else {
            abstractC0362l.f4454f0 = true;
        }
        return xfa.f68157a;
    }
}
