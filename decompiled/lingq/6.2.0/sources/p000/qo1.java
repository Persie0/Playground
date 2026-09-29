package p000;

import com.lingq.core.domain.model.library.LibraryTab;

/* JADX INFO: loaded from: classes3.dex */
public final class qo1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f58013b;

    public /* synthetic */ qo1(vi3 vi3Var, int i) {
        this.f58012a = i;
        this.f58013b = vi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f58012a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f58013b;
        switch (i) {
            case 0:
                l55 l55Var = (l55) obj;
                l55Var.getClass();
                ud7 ud7Var = l55Var.f49081a;
                vd7 vd7Var = l55Var.f49082b;
                boolean z = false;
                if (vd7Var != null && vd7Var.f65237b) {
                    z = true;
                }
                vi3Var.invoke(new vc7(ud7Var, z));
                break;
            case 1:
                l55 l55Var2 = (l55) obj;
                l55Var2.getClass();
                vi3Var.invoke(new pc7(l55Var2.f49081a));
                break;
            case 2:
                l55 l55Var3 = (l55) obj;
                l55Var3.getClass();
                vi3Var.invoke(new pc7(l55Var3.f49081a));
                break;
            case 3:
                vi3Var.invoke(new pp8(((Number) obj).intValue()));
                break;
            case 4:
                String str = (String) obj;
                str.getClass();
                vi3Var.invoke(new cq8(str));
                break;
            case 5:
                LibraryTab libraryTab = (LibraryTab) obj;
                libraryTab.getClass();
                vi3Var.invoke(new es8(libraryTab));
                break;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                vi3Var.invoke(new bza(str2));
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                vi3Var.invoke(new pza(str3));
                break;
        }
        return xfaVar;
    }
}
