package androidx.activity;

import p000.AbstractC0909pn;
import p000.C0913pr;
import p000.InterfaceC0903ph;
import p000.akq;
import p000.aks;
import p000.akt;
import p000.akv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements akt, InterfaceC0903ph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0913pr f1429a;

    /* JADX INFO: renamed from: b */
    private final aks f1430b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0909pn f1431c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0903ph f1432d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0913pr c0913pr, aks aksVar, AbstractC0909pn abstractC0909pn) {
        this.f1429a = c0913pr;
        this.f1430b = aksVar;
        this.f1431c = abstractC0909pn;
        aksVar.m879a(this);
    }

    @Override // p000.akt
    /* JADX INFO: renamed from: a */
    public final void mo883a(akv akvVar, akq akqVar) {
        if (akqVar == akq.ON_START) {
            this.f1432d = this.f1429a.m19328a(this.f1431c);
            return;
        }
        if (akqVar != akq.ON_STOP) {
            if (akqVar == akq.ON_DESTROY) {
                mo1401b();
            }
        } else {
            InterfaceC0903ph interfaceC0903ph = this.f1432d;
            if (interfaceC0903ph != null) {
                interfaceC0903ph.mo1401b();
            }
        }
    }

    @Override // p000.InterfaceC0903ph
    /* JADX INFO: renamed from: b */
    public final void mo1401b() {
        this.f1430b.m881c(this);
        this.f1431c.m19323c(this);
        InterfaceC0903ph interfaceC0903ph = this.f1432d;
        if (interfaceC0903ph != null) {
            interfaceC0903ph.mo1401b();
        }
        this.f1432d = null;
    }
}
