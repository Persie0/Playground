package p000;

import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.token.TokenPopupAnchor;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class we9 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f66736b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f66737c;

    public /* synthetic */ we9(int i, vi3 vi3Var, List list) {
        this.f66735a = i;
        this.f66736b = vi3Var;
        this.f66737c = list;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f66735a;
        xfa xfaVar = xfa.f68157a;
        List list = this.f66737c;
        vi3 vi3Var = this.f66736b;
        switch (i) {
            case 0:
                vi3Var.invoke(((jg1) list.get(0)).f45512a);
                break;
            case 1:
                vi3Var.invoke(((jg1) list.get(1)).f45512a);
                break;
            case 2:
                vi3Var.invoke(((jg1) list.get(2)).f45512a);
                break;
            case 3:
                vi3Var.invoke(((jg1) list.get(3)).f45512a);
                break;
            default:
                vi3Var.invoke(new d3a((TokenMeaning) u91.m22589G0(list), TokenPopupAnchor.Expanded));
                break;
        }
        return xfaVar;
    }
}
