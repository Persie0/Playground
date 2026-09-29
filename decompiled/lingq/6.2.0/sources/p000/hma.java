package p000;

import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.C3258c;

/* JADX INFO: loaded from: classes3.dex */
public final class hma implements InterfaceC2984f0, j12 {

    /* JADX INFO: renamed from: a */
    public final vqb f42640a;

    public hma(vqb vqbVar) {
        this.f42640a = vqbVar;
    }

    /* JADX INFO: renamed from: i */
    public static void m13335i(hma hmaVar) {
        Padding padding = Padding.ZERO;
        hmaVar.getClass();
        padding.getClass();
        hmaVar.f42640a.m23473o(new C3258c(new ta0(new pma(padding))));
    }

    /* JADX INFO: renamed from: j */
    public static void m13336j(hma hmaVar) {
        Padding padding = Padding.ZERO;
        hmaVar.getClass();
        padding.getClass();
        hmaVar.f42640a.m23473o(new ta0(new mma(padding)));
    }

    /* JADX INFO: renamed from: k */
    public static void m13337k(hma hmaVar) {
        Padding padding = Padding.ZERO;
        hmaVar.getClass();
        padding.getClass();
        hmaVar.f42640a.m23473o(new ta0(new nma(padding)));
    }

    @Override // p000.InterfaceC2984f0
    /* JADX INFO: renamed from: b */
    public final vqb mo3730b() {
        return this.f42640a;
    }

    @Override // p000.InterfaceC2984f0
    /* JADX INFO: renamed from: h */
    public final InterfaceC2984f0 mo3732h() {
        return new hma(new vqb(3));
    }
}
