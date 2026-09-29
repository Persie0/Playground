package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: renamed from: uq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3657uq implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64203a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f64204b;

    public /* synthetic */ C3657uq(Object obj, int i) {
        this.f64203a = i;
        this.f64204b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.f64203a;
        Object obj = this.f64204b;
        switch (i2) {
            case 0:
                C3731wq c3731wq = (C3731wq) obj;
                AppCompatSpinner appCompatSpinner = c3731wq.f67167Z;
                appCompatSpinner.setSelection(i);
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i, c3731wq.f67164W.getItemId(i));
                }
                c3731wq.dismiss();
                break;
            default:
                hr5 hr5Var = (hr5) obj;
                dg5 dg5Var = hr5Var.f42830e;
                if (i < 0) {
                    item = !dg5Var.f35607U.isShowing() ? null : dg5Var.f35610c.getSelectedItem();
                } else {
                    item = hr5Var.getAdapter().getItem(i);
                }
                hr5Var.setText(hr5Var.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = hr5Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !dg5Var.f35607U.isShowing() ? null : dg5Var.f35610c.getSelectedView();
                        i = !dg5Var.f35607U.isShowing() ? -1 : dg5Var.f35610c.getSelectedItemPosition();
                        j = !dg5Var.f35607U.isShowing() ? Long.MIN_VALUE : dg5Var.f35610c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(dg5Var.f35610c, view, i, j);
                }
                dg5Var.dismiss();
                break;
        }
    }
}
