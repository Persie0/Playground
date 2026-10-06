package p000;

import com.google.android.apps.camera.p014ui.gridlines.GridLinesUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnw implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f22811a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22812b;

    public fnw(GridLinesUi gridLinesUi, int i) {
        this.f22812b = i;
        this.f22811a = gridLinesUi;
    }

    public fnw(foc focVar, int i) {
        this.f22812b = i;
        this.f22811a = focVar;
    }

    public fnw(gqm gqmVar, int i) {
        this.f22812b = i;
        this.f22811a = gqmVar;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* synthetic */ void mo3415bf(Object obj) {
        switch (this.f22812b) {
            case 0:
                ((foc) this.f22811a).m8613D((String) obj);
                return;
            case 1:
                foc focVar = (foc) this.f22811a;
                if (focVar.f22885p == 1 && focVar.f22837P == 0) {
                    focVar.f22823B.post(new fit(this, 19, null));
                    return;
                }
                return;
            case 2:
                synchronized (((gqm) this.f22811a).f26070d) {
                    Object obj2 = this.f22811a;
                    if (!((gqm) obj2).f26071e && ((Boolean) ((jwf) ((gqm) obj2).f26069c).f34942d).booleanValue()) {
                        ((gqm) this.f22811a).m9648c();
                    }
                    break;
                }
                return;
            default:
                Object obj3 = this.f22811a;
                hyn hynVarM10873a = hyn.m10873a(((Integer) obj).intValue());
                GridLinesUi gridLinesUi = (GridLinesUi) obj3;
                hyj hyjVar = gridLinesUi.f7026b;
                hyk hykVar = (hyk) gridLinesUi.f7025a.get(hynVarM10873a);
                lku.m15662p(hykVar);
                hyjVar.m10871a(hykVar);
                return;
        }
    }
}
