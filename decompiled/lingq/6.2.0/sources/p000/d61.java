package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d61 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f35030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f71 f35031c;

    public /* synthetic */ d61(f71 f71Var, vi3 vi3Var) {
        this.f35029a = 2;
        this.f35031c = f71Var;
        this.f35030b = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f35029a;
        xfa xfaVar = xfa.f68157a;
        f71 f71Var = this.f35031c;
        vi3 vi3Var = this.f35030b;
        switch (i) {
            case 0:
                vi3Var.invoke(new y51(true ^ f71Var.f38546g));
                break;
            case 1:
                vi3Var.invoke(new h51(f71Var.f38540a));
                break;
            case 2:
                h81 h81Var = f71Var.f38548i;
                if (h81Var != null) {
                    vi3Var.invoke(new u81(h81Var));
                }
                break;
            case 3:
                vi3Var.invoke(new i51(f71Var.f38540a.f19426a));
                break;
            case 4:
                String str = f71Var.f38540a.f19448t;
                vi3Var.invoke(new s81(str != null ? str : ""));
                break;
            case 5:
                vi3Var.invoke(new k51(f71Var.f38540a.f19426a));
                break;
            case 6:
                LibraryItem libraryItem = f71Var.f38540a;
                int i2 = libraryItem.f19426a;
                String str2 = libraryItem.f19430c;
                vi3Var.invoke(new k81(str2 != null ? str2 : "", i2, libraryItem.f19423X > 0 && !f71Var.f38541b.f19467m));
                break;
            case 7:
                vi3Var.invoke(new h51(f71Var.f38540a));
                break;
            default:
                String str3 = f71Var.f38540a.f19448t;
                vi3Var.invoke(new o81(str3 != null ? str3 : ""));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ d61(vi3 vi3Var, f71 f71Var, int i) {
        this.f35029a = i;
        this.f35030b = vi3Var;
        this.f35031c = f71Var;
    }
}
