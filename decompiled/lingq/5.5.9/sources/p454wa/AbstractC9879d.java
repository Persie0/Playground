package p454wa;

import java.util.ArrayList;
import p479xa.C10134c0;

/* JADX INFO: renamed from: wa.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9879d implements InterfaceC9882g {

    /* JADX INFO: renamed from: a */
    public final boolean f50422a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<InterfaceC9894s> f50423b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c */
    public int f50424c;

    /* JADX INFO: renamed from: d */
    public C9884i f50425d;

    public AbstractC9879d(boolean z10) {
        this.f50422a = z10;
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: g */
    public final void mo7274g(InterfaceC9894s interfaceC9894s) {
        interfaceC9894s.getClass();
        ArrayList<InterfaceC9894s> arrayList = this.f50423b;
        if (arrayList.contains(interfaceC9894s)) {
            return;
        }
        arrayList.add(interfaceC9894s);
        this.f50424c++;
    }

    /* JADX INFO: renamed from: n */
    public final void m18376n(int i10) {
        C9884i c9884i = this.f50425d;
        int i11 = C10134c0.f51354a;
        for (int i12 = 0; i12 < this.f50424c; i12++) {
            this.f50423b.get(i12).mo18385d(c9884i, this.f50422a, i10);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m18377o() {
        C9884i c9884i = this.f50425d;
        int i10 = C10134c0.f51354a;
        for (int i11 = 0; i11 < this.f50424c; i11++) {
            this.f50423b.get(i11).mo18386f(c9884i, this.f50422a);
        }
        this.f50425d = null;
    }

    /* JADX INFO: renamed from: p */
    public final void m18378p(C9884i c9884i) {
        for (int i10 = 0; i10 < this.f50424c; i10++) {
            this.f50423b.get(i10).mo18384c();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m18379q(C9884i c9884i) {
        this.f50425d = c9884i;
        for (int i10 = 0; i10 < this.f50424c; i10++) {
            this.f50423b.get(i10).mo18383b(c9884i, this.f50422a);
        }
    }
}
