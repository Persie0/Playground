package p000;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class og6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dg0 f54319a;

    public og6(dg0 dg0Var) {
        this.f54319a = dg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mw5 itemData = ((kg6) view).getItemData();
        dg0 dg0Var = this.f54319a;
        mg6 mg6Var = dg0Var.f56174k0;
        boolean zM13534q = mg6Var.f51286a.m13534q(itemData, dg0Var.f56172j0, 0);
        if (itemData == null || !itemData.isCheckable()) {
            return;
        }
        if (!zM13534q || itemData.isChecked()) {
            dg0Var.setCheckedItem(itemData);
        }
    }
}
