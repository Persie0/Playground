package p000;

import android.content.Context;
import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuView;
import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuViewContainer;
import java.util.ArrayList;
import java.util.List;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbe implements dbg {

    /* JADX INFO: renamed from: a */
    public final Context f10366a;

    /* JADX INFO: renamed from: b */
    public final dhv f10367b;

    /* JADX INFO: renamed from: c */
    public PopupMenuView f10368c;

    /* JADX INFO: renamed from: d */
    public PopupMenuViewContainer f10369d;

    /* JADX INFO: renamed from: e */
    public final List f10370e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public idu f10371f;

    /* JADX INFO: renamed from: g */
    public final idq f10372g;

    public dbe(Context context, dhv dhvVar, idq idqVar) {
        this.f10366a = context;
        this.f10367b = dhvVar;
        this.f10372g = idqVar;
    }

    @Override // p000.dbg
    /* JADX INFO: renamed from: a */
    public final kba mo5870a(dbi dbiVar) {
        this.f10370e.add(dbiVar);
        return new cic(this, dbiVar, 10);
    }

    @Override // p000.dbg
    /* JADX INFO: renamed from: b */
    public final void mo5871b() {
        if (this.f10367b.mo6184l(dib.f11361co)) {
            this.f10371f.dismiss();
        } else {
            this.f10368c.m4406b();
            Collection$EL.stream(this.f10370e).forEach(cpf.f8554f);
        }
    }

    @Override // p000.dbg
    /* JADX INFO: renamed from: c */
    public final boolean mo5872c() {
        if (this.f10367b.mo6184l(dib.f11361co)) {
            return this.f10371f.isShowing();
        }
        return this.f10368c.getVisibility() == 0;
    }
}
