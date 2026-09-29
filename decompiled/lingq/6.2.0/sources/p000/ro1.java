package p000;

import com.lingq.feature.playlist.MenuPlaylistItem;

/* JADX INFO: loaded from: classes3.dex */
public final class ro1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59648a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f59649b;

    public /* synthetic */ ro1(vi3 vi3Var, int i) {
        this.f59648a = i;
        this.f59649b = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f59648a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f59649b;
        switch (i) {
            case 0:
                MenuPlaylistItem menuPlaylistItem = (MenuPlaylistItem) obj;
                l55 l55Var = (l55) obj2;
                menuPlaylistItem.getClass();
                l55Var.getClass();
                vi3Var.invoke(new tc7(menuPlaylistItem, l55Var.f49081a));
                break;
            case 1:
                MenuPlaylistItem menuPlaylistItem2 = (MenuPlaylistItem) obj;
                l55 l55Var2 = (l55) obj2;
                menuPlaylistItem2.getClass();
                l55Var2.getClass();
                vi3Var.invoke(new tc7(menuPlaylistItem2, l55Var2.f49081a));
                break;
            case 2:
                MenuPlaylistItem menuPlaylistItem3 = (MenuPlaylistItem) obj;
                ud7 ud7Var = (ud7) obj2;
                menuPlaylistItem3.getClass();
                ud7Var.getClass();
                vi3Var.invoke(new tc7(menuPlaylistItem3, ud7Var));
                break;
            case 3:
                vi3Var.invoke(new rp8(((Number) obj).intValue(), ((Number) obj2).intValue()));
                break;
            case 4:
                vi3Var.invoke(new lya(((Number) obj).intValue(), ((Number) obj2).intValue()));
                break;
            default:
                vi3Var.invoke(new lza(((Number) obj).intValue(), ((Number) obj2).intValue()));
                break;
        }
        return xfaVar;
    }
}
