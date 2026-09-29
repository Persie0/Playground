package p000;

import androidx.compose.p002ui.node.TraversableNode$Companion$TraverseDescendantsAction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n64 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o64 f52396b;

    public /* synthetic */ n64(o64 o64Var, int i) {
        this.f52395a = i;
        this.f52396b = o64Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f52395a;
        o64 o64Var = this.f52396b;
        pba pbaVar = (pba) obj;
        switch (i) {
            case 0:
                pbaVar.getClass();
                o64 o64Var2 = (o64) pbaVar;
                e5b e5bVar = o64Var.f53892K;
                if (!fa4.m11650l(o64Var2.f53891J, e5bVar)) {
                    o64Var2.f53891J = e5bVar;
                    o64Var2.mo4502a1();
                }
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            default:
                pbaVar.getClass();
                o64Var.f53891J = ((o64) pbaVar).f53892K;
                return Boolean.FALSE;
        }
    }
}
