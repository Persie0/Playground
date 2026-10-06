package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: za */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1166za extends C1164yz {

    /* JADX INFO: renamed from: m */
    public int f48325m;

    public C1166za(AbstractC1174zi abstractC1174zi) {
        super(abstractC1174zi);
        this.f48316l = abstractC1174zi instanceof C1170ze ? 2 : 3;
    }

    @Override // p000.C1164yz
    /* JADX INFO: renamed from: c */
    public final void mo19740c(int i) {
        if (this.f48313i) {
            return;
        }
        this.f48313i = true;
        this.f48310f = i;
        Iterator it = this.f48314j.iterator();
        while (it.hasNext()) {
            ((InterfaceC1162yx) it.next()).mo19730f();
        }
    }
}
