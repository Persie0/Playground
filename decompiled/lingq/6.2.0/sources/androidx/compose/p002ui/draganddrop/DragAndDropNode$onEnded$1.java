package androidx.compose.p002ui.draganddrop;

import androidx.compose.p002ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.Lambda;
import p000.hi8;
import p000.ik2;
import p000.jbd;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
final class DragAndDropNode$onEnded$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hi8 f3847b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onEnded$1(hi8 hi8Var) {
        super(1);
        this.f3847b = hi8Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        ik2 ik2Var = (ik2) obj;
        if (!ik2Var.f34837a.f34836I) {
            return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        ik2 ik2Var2 = ik2Var.f44219K;
        if (ik2Var2 != null) {
            jbd.m14381c(ik2Var2, new DragAndDropNode$onEnded$1(this.f3847b));
        }
        ik2Var.f44219K = null;
        ik2Var.f44218J = null;
        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
    }
}
