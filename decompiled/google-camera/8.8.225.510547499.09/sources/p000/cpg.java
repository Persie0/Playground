package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cpg extends igg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cpj f8568a;

    public cpg(cpj cpjVar) {
        this.f8568a = cpjVar;
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonClick() {
        if (!this.f8568a.f8614z.m13078M()) {
            dhv dhvVar = this.f8568a.f8598j;
            dhx dhxVar = dib.f11240a;
            dhvVar.mo6177e();
        } else {
            Iterator it = this.f8568a.f8592d.iterator();
            while (it.hasNext()) {
                ((cre) it.next()).mo5267i(false);
            }
            this.f8568a.f8594f.mo11254z(false);
        }
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonDown() {
        if (this.f8568a.f8614z.m13078M()) {
            return;
        }
        Iterator it = this.f8568a.f8592d.iterator();
        while (it.hasNext()) {
            ((cre) it.next()).mo5267i(false);
        }
    }
}
