package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzf extends hzs {
    public hzf(hzp hzpVar, C1190zy c1190zy, Resources resources) {
        super(hzpVar, c1190zy, resources);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: a */
    public final void mo10890a(View view) {
        m10956x(view.getId(), this.f30081b.f30045i);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: b */
    public final void mo10891b(View view) {
        m10956x(view.getId(), this.f30081b.f30050n);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: c */
    public final void mo10892c(View view) {
        m10957y(view.getId(), this.f30081b.f30047k, false);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: d */
    public final void mo10893d(View view) {
        m10956x(view.getId(), this.f30081b.f30046j);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: e */
    public final void mo10894e(View view) {
        m10956x(view.getId(), this.f30081b.f30051o);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: f */
    public final void mo10895f(View view) {
        m10956x(view.getId(), this.f30081b.f30048l);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: g */
    public final void mo10896g(View view) {
        m10956x(view.getId(), this.f30081b.f30053q);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: h */
    public final void mo10897h(View view) {
        m10956x(view.getId(), this.f30081b.f30040d);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: i */
    public final void mo10898i(View view) {
        m10957y(view.getId(), this.f30081b.f30041e, false);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: j */
    public final void mo10899j(View view) {
        m10957y(view.getId(), this.f30081b.f30039c, false);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: k */
    public final void mo10900k(View view) {
        m10956x(view.getId(), this.f30081b.f30052p);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: l */
    public final void mo10901l(View view) {
        m10956x(view.getId(), this.f30081b.f30042f);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: m */
    public final void mo10902m(View view) {
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: n */
    public final void mo10903n(View view) {
        m10957y(view.getId(), this.f30081b.f30042f, false);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: o */
    public final void mo10904o(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        hzt hztVar = this.f30080a.f30076c;
        if (hztVar == null) {
            Rect rect = this.f30081b.f30042f;
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i5 = rect.left;
            i = rect.top;
            i2 = i5;
            i3 = iHeight;
            i4 = iWidth;
        } else {
            int width = hztVar.f30088a.getWidth();
            int height = hztVar.f30088a.getHeight();
            int i6 = hztVar.f30090c.left;
            int i7 = hztVar.f30090c.top;
            this.f30082c.m19823h(view.getId(), 7, 0, 7, hztVar.f30090c.right);
            this.f30082c.m19823h(view.getId(), 4, 0, 4, hztVar.f30090c.bottom);
            view.setPadding(hztVar.f30089b.left, hztVar.f30089b.top, hztVar.f30089b.right, hztVar.f30089b.bottom);
            i = i7;
            i2 = i6;
            i3 = height;
            i4 = width;
        }
        m10954v(view.getId(), i4, i3, i2, i);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: p */
    public final void mo10905p(View view) {
        m10957y(view.getId(), this.f30081b.f30043g, false);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: q */
    public final void mo10906q(View view) {
        m10956x(view.getId(), this.f30081b.f30044h);
    }
}
