package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wab implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yab f66574b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f66575c;

    public /* synthetic */ wab(yab yabVar, float f, int i) {
        this.f66573a = i;
        this.f66574b = yabVar;
        this.f66575c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f66573a;
        float f = this.f66575c;
        yab yabVar = this.f66574b;
        switch (i) {
            case 0:
                r3b r3bVar = yabVar.f69583a;
                Iterator<T> it = r3bVar.getListeners().iterator();
                while (it.hasNext()) {
                    ((AbstractC2949e2) it.next()).mo8497a(r3bVar.getInstance(), f);
                }
                break;
            default:
                r3b r3bVar2 = yabVar.f69583a;
                Iterator<T> it2 = r3bVar2.getListeners().iterator();
                while (it2.hasNext()) {
                    ((AbstractC2949e2) it2.next()).mo8501f(r3bVar2.getInstance(), f);
                }
                break;
        }
    }
}
