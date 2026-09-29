package p000;

import androidx.compose.p002ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n31 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52258a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f52259b;

    public /* synthetic */ n31(int i, Ref$ObjectRef ref$ObjectRef) {
        this.f52258a = i;
        this.f52259b = ref$ObjectRef;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f52258a;
        Ref$ObjectRef ref$ObjectRef = this.f52259b;
        switch (i) {
            case 0:
                il3 il3Var = (il3) obj;
                if (fa4.m11650l(il3Var.mo790S(), "waiting")) {
                    ref$ObjectRef.f47718a = il3Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                pba pbaVar = (pba) obj;
                pbaVar.getClass();
                lu4 lu4Var = ((sba) pbaVar).f60628J;
                List listM23608N = (List) ref$ObjectRef.f47718a;
                if (listM23608N != null) {
                    listM23608N.add(lu4Var);
                } else {
                    listM23608N = vz1.m23608N(lu4Var);
                }
                ref$ObjectRef.f47718a = listM23608N;
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
    }
}
