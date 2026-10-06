package p000;

import android.view.View;

/* JADX INFO: renamed from: lo */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0802lo extends AbstractC0803lp {
    public C0802lo(AbstractC0812ly abstractC0812ly) {
        super(abstractC0812ly);
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: a */
    public final int mo15746a(View view) {
        return AbstractC0812ly.m16140bo(view) + ((C0813lz) view.getLayoutParams()).bottomMargin;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: b */
    public final int mo15747b(View view) {
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        return AbstractC0812ly.m16133bb(view) + c0813lz.topMargin + c0813lz.bottomMargin;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: c */
    public final int mo15748c(View view) {
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        return AbstractC0812ly.m16134bc(view) + c0813lz.leftMargin + c0813lz.rightMargin;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: d */
    public final int mo15749d(View view) {
        return AbstractC0812ly.m16143br(view) - ((C0813lz) view.getLayoutParams()).topMargin;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: e */
    public final int mo15750e() {
        return this.f38877a.f39544B;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: f */
    public final int mo15751f() {
        AbstractC0812ly abstractC0812ly = this.f38877a;
        return abstractC0812ly.f39544B - abstractC0812ly.m16169ap();
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: g */
    public final int mo15752g() {
        return this.f38877a.m16169ap();
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: h */
    public final int mo15753h() {
        return this.f38877a.f39559z;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: i */
    public final int mo15754i() {
        return this.f38877a.f39558y;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: j */
    public final int mo15755j() {
        return this.f38877a.m16172as();
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: k */
    public final int mo15756k() {
        AbstractC0812ly abstractC0812ly = this.f38877a;
        return (abstractC0812ly.f39544B - abstractC0812ly.m16172as()) - this.f38877a.m16169ap();
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: l */
    public final int mo15757l(View view) {
        this.f38877a.m16179bi(view, this.f38879c);
        return this.f38879c.bottom;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: m */
    public final int mo15758m(View view) {
        this.f38877a.m16179bi(view, this.f38879c);
        return this.f38879c.top;
    }

    @Override // p000.AbstractC0803lp
    /* JADX INFO: renamed from: n */
    public final void mo15759n(int i) {
        this.f38877a.mo1296aG(i);
    }
}
