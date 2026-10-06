package p000;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hrj implements gfg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f29294a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f29295b;

    public hrj(View view, int i) {
        this.f29295b = i;
        this.f29294a = view;
    }

    public hrj(geo geoVar, int i) {
        this.f29295b = i;
        this.f29294a = geoVar;
    }

    public hrj(hrk hrkVar, int i) {
        this.f29295b = i;
        this.f29294a = hrkVar;
    }

    public hrj(ika ikaVar, int i) {
        this.f29295b = i;
        this.f29294a = ikaVar;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5760b() {
        int i = this.f29295b;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo5761c() {
        int i = this.f29295b;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: a */
    public final void mo5759a() {
        switch (this.f29295b) {
            case 0:
                hrk hrkVar = (hrk) this.f29294a;
                if (hrkVar.f29303h != null) {
                    hrkVar.m10654c();
                }
                break;
            case 1:
                ((geo) this.f29294a).f24409m.mo3415bf(false);
                break;
            case 2:
                if (!((ika) this.f29294a).f31298u.mo11746aa()) {
                    ika ikaVar = (ika) this.f29294a;
                    if (ikaVar.f31298u.mo11745Z((ikw) ikaVar.f31295r.mo3831be())) {
                    }
                }
                ((ika) this.f29294a).f31298u.mo11765p();
                break;
            default:
                ((View) this.f29294a).setFocusable(true);
                break;
        }
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: d */
    public final void mo5762d() {
        switch (this.f29295b) {
            case 0:
                DialogInterfaceC0155eg dialogInterfaceC0155eg = ((hrk) this.f29294a).f29303h;
                if (dialogInterfaceC0155eg != null) {
                    dialogInterfaceC0155eg.hide();
                }
                break;
            case 1:
                ((geo) this.f29294a).f24409m.mo3415bf(true);
                break;
            case 2:
                ((ika) this.f29294a).f31296s.m10697b(true);
                if (!((ika) this.f29294a).f31288k.mo6184l(dib.f11276aj)) {
                    ((ika) this.f29294a).f31298u.mo11763n();
                }
                if (!((ika) this.f29294a).f31297t.mo10046m("perf_has_shown_options_bar")) {
                    ((ika) this.f29294a).f31297t.mo10045l("perf_has_shown_options_bar", true);
                }
                break;
            default:
                ((View) this.f29294a).setFocusable(false);
                break;
        }
    }
}
