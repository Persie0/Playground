package p000;

import android.view.View;

/* JADX INFO: renamed from: ln */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0801ln extends AbstractC0803lp {
    public C0801ln(AbstractC0812ly abstractC0812ly) {
        super(abstractC0812ly);
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: a */
    public final int mo15746a(View view) {
        return AbstractC0812ly.m16142bq(view) + ((C0813lz) view.getLayoutParams()).rightMargin;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: b */
    public final int mo15747b(View view) {
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        return AbstractC0812ly.m16134bc(view) + c0813lz.leftMargin + c0813lz.rightMargin;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: c */
    public final int mo15748c(View view) {
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        return AbstractC0812ly.m16133bb(view) + c0813lz.topMargin + c0813lz.bottomMargin;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: d */
    public final int mo15749d(View view) {
        return AbstractC0812ly.m16141bp(view) - ((C0813lz) view.getLayoutParams()).leftMargin;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: e */
    public final int mo15750e() {
        return this.f38877a.f39543A;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: f */
    public final int mo15751f() {
        AbstractC0812ly abstractC0812ly = this.f38877a;
        return abstractC0812ly.f39543A - abstractC0812ly.m16171ar();
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: g */
    public final int mo15752g() {
        return this.f38877a.m16171ar();
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: h */
    public final int mo15753h() {
        return this.f38877a.f39558y;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: i */
    public final int mo15754i() {
        return this.f38877a.f39559z;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: j */
    public final int mo15755j() {
        return this.f38877a.m16170aq();
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: k */
    public final int mo15756k() {
        AbstractC0812ly abstractC0812ly = this.f38877a;
        return (abstractC0812ly.f39543A - abstractC0812ly.m16170aq()) - this.f38877a.m16171ar();
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: l */
    public final int mo15757l(View view) {
        this.f38877a.m16179bi(view, this.f38879c);
        return this.f38879c.right;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: m */
    public final int mo15758m(View view) {
        this.f38877a.m16179bi(view, this.f38879c);
        return this.f38879c.left;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: n */
    public final void mo15759n(int i) {
        this.f38877a.mo1295aF(i);
    }
}
