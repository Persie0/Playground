package p000;

import com.google.android.apps.camera.smarts.SmartsChipView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdx implements hew {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hew f27400a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ hdz f27401b;

    public hdx(hdz hdzVar, hew hewVar) {
        this.f27401b = hdzVar;
        this.f27400a = hewVar;
    }

    @Override // p000.hew
    /* JADX INFO: renamed from: a */
    public final void mo10130a() {
        heb hebVar = (heb) this.f27400a;
        hebVar.f27424c.f27428d.mo7486h(hebVar.f27423b);
        hebVar.f27424c.f27429e.remove(hebVar.f27423b);
    }

    @Override // p000.hew
    /* JADX INFO: renamed from: b */
    public final void mo10131b(hev hevVar) {
        if (this.f27401b.f27414e) {
            heb hebVar = (heb) this.f27400a;
            het hetVar = hebVar.f27422a;
            hes hesVar = hebVar.f27423b;
            hec hecVar = hebVar.f27424c;
            SmartsChipView smartsChipView = hecVar.f27425a;
            smartsChipView.getClass();
            hdl hdlVar = new hdl(hetVar, hesVar, hevVar, smartsChipView, hecVar.f27431g, hecVar.f27434j, hecVar.f27427c, hecVar.f27433i, hecVar.f27435k, hecVar.f27432h, null, null, null, null, null);
            hecVar.f27428d.mo7482d(hdlVar);
            hebVar.f27424c.f27429e.put(hebVar.f27423b, hdlVar);
        }
    }

    @Override // p000.hew
    /* JADX INFO: renamed from: c */
    public final void mo10132c(hev hevVar) {
        if (this.f27401b.f27414e) {
            heb hebVar = (heb) this.f27400a;
            heo heoVar = (heo) hebVar.f27424c.f27429e.get(hebVar.f27423b);
            if (heoVar != null) {
                hebVar.f27424c.f27430f.m13541c(new hea(heoVar, hevVar, 0));
            }
        }
    }
}
