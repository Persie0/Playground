package p000;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class idr implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f30495b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f30496c;

    public /* synthetic */ idr(PopupMenuView popupMenuView, idq idqVar, int i) {
        this.f30496c = i;
        this.f30494a = popupMenuView;
        this.f30495b = idqVar;
    }

    public idr(C0150eb c0150eb, C0153ee c0153ee, int i) {
        this.f30496c = i;
        this.f30495b = c0150eb;
        this.f30494a = c0153ee;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f30496c) {
            case 0:
                Object obj = this.f30494a;
                idq idqVar = (idq) this.f30495b;
                idqVar.m11126b(i);
                if (idqVar.getItem(i).f30535f) {
                    PopupMenuView popupMenuView = (PopupMenuView) obj;
                    npk.m17603e(popupMenuView.getContext());
                    popupMenuView.announceForAccessibility(popupMenuView.getResources().getString(C0100R.string.menu_selected_accessibility_announce, idqVar.getItem(i).f30531b));
                    break;
                }
                break;
            default:
                ((C0150eb) this.f30495b).f13178p.onClick(((C0153ee) this.f30494a).f13559b, i);
                if (!((C0150eb) this.f30495b).f13183u) {
                    ((C0153ee) this.f30494a).f13559b.dismiss();
                }
                break;
        }
    }
}
