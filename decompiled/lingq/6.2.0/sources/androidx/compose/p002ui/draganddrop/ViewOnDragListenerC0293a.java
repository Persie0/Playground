package androidx.compose.p002ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.p002ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.Ref$BooleanRef;
import p000.C3052gv;
import p000.C3437ov;
import p000.C3796yh;
import p000.hi8;
import p000.hk2;
import p000.i54;
import p000.ik2;
import p000.jbd;
import p000.vi3;

/* JADX INFO: renamed from: androidx.compose.ui.draganddrop.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC0293a implements View.OnDragListener, hk2 {

    /* JADX INFO: renamed from: a */
    public final ik2 f3851a;

    /* JADX INFO: renamed from: b */
    public final C3437ov f3852b;

    /* JADX INFO: renamed from: c */
    public final C3796yh f3853c;

    public ViewOnDragListenerC0293a() {
        ik2 ik2Var = new ik2();
        ik2Var.f44220L = 0L;
        this.f3851a = ik2Var;
        this.f3852b = new C3437ov(0);
        this.f3853c = new C3796yh(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        final hi8 hi8Var = new hi8(dragEvent, 13);
        int action = dragEvent.getAction();
        C3437ov c3437ov = this.f3852b;
        final ik2 ik2Var = this.f3851a;
        switch (action) {
            case 1:
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                jbd.m14381c(ik2Var, new vi3(hi8Var, ik2Var, ref$BooleanRef) { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Ref$BooleanRef f3846b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.f3846b = ref$BooleanRef;
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        ik2 ik2Var2 = (ik2) obj;
                        if (!ik2Var2.f34836I) {
                            return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                        }
                        if (ik2Var2.f44219K != null) {
                            i54.m13663b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                        }
                        ik2Var2.f44219K = null;
                        Ref$BooleanRef ref$BooleanRef2 = this.f3846b;
                        ref$BooleanRef2.f47713a = ref$BooleanRef2.f47713a;
                        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                    }
                });
                boolean z = ref$BooleanRef.f47713a;
                c3437ov.getClass();
                C3052gv c3052gv = new C3052gv(c3437ov);
                while (c3052gv.hasNext()) {
                    ((ik2) c3052gv.next()).m13990d1(hi8Var);
                }
                return z;
            case 2:
                ik2Var.m13989c1(hi8Var);
                return false;
            case 3:
                return ik2Var.m13986Z0(hi8Var);
            case 4:
                jbd.m14381c(ik2Var, new DragAndDropNode$onEnded$1(hi8Var));
                c3437ov.clear();
                return false;
            case 5:
                ik2Var.m13987a1(hi8Var);
                return false;
            case 6:
                ik2Var.m13988b1(hi8Var);
                return false;
            default:
                return false;
        }
    }
}
