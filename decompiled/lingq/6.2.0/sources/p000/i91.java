package p000;

import com.lingq.core.p012ui.UpgradeReason;

/* JADX INFO: loaded from: classes2.dex */
public final class i91 implements uf7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f43724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bia f43725c;

    public /* synthetic */ i91(t66 t66Var, bia biaVar, int i) {
        this.f43723a = i;
        this.f43724b = t66Var;
        this.f43725c = biaVar;
    }

    @Override // p000.uf7
    /* JADX INFO: renamed from: e */
    public final void mo3849e() {
        int i = this.f43723a;
        bia biaVar = this.f43725c;
        t66 t66Var = this.f43724b;
        switch (i) {
            case 0:
                t66Var.setValue(Boolean.FALSE);
                biaVar.mo3737M1(UpgradeReason.PLAYLISTS);
                break;
            case 1:
                t66Var.setValue(Boolean.FALSE);
                biaVar.mo3737M1(UpgradeReason.PLAYLISTS);
                break;
            case 2:
                t66Var.setValue(Boolean.FALSE);
                biaVar.mo3737M1(UpgradeReason.PLAYLISTS);
                break;
            default:
                t66Var.setValue(Boolean.FALSE);
                biaVar.mo3737M1(UpgradeReason.PLAYLISTS);
                break;
        }
    }

    @Override // p000.uf7
    public final void onDismiss() {
        int i = this.f43723a;
        t66 t66Var = this.f43724b;
        switch (i) {
            case 0:
                t66Var.setValue(Boolean.FALSE);
                break;
            case 1:
                t66Var.setValue(Boolean.FALSE);
                break;
            case 2:
                t66Var.setValue(Boolean.FALSE);
                break;
            default:
                t66Var.setValue(Boolean.FALSE);
                break;
        }
    }
}
