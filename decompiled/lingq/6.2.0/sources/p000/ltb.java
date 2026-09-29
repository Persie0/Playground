package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ltb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final pxb f50122a;

    /* JADX INFO: renamed from: b */
    public final vwb f50123b;

    public ltb(pxb pxbVar, vwb vwbVar) {
        this.f50122a = pxbVar;
        this.f50123b = vwbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f50122a.f70458a != this) {
            return;
        }
        vwb vwbVar = this.f50123b;
        if (ytb.f70457g.mo11793f(this.f50122a, this, pxb.m19560h(vwbVar))) {
            pxb.m19561j(this.f50122a);
        }
    }
}
