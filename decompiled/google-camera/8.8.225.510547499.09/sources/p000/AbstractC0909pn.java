package p000;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: pn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0909pn {

    /* JADX INFO: renamed from: b */
    public boolean f47439b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f47440c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public omx f47441d;

    public AbstractC0909pn(boolean z) {
        this.f47439b = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3794a();

    /* JADX INFO: renamed from: b */
    public final void m19322b(InterfaceC0903ph interfaceC0903ph) {
        this.f47440c.add(interfaceC0903ph);
    }

    /* JADX INFO: renamed from: c */
    public final void m19323c(InterfaceC0903ph interfaceC0903ph) {
        this.f47440c.remove(interfaceC0903ph);
    }

    /* JADX INFO: renamed from: d */
    public final void m19324d(boolean z) {
        this.f47439b = z;
        omx omxVar = this.f47441d;
        if (omxVar != null) {
            omxVar.mo2077a();
        }
    }
}
