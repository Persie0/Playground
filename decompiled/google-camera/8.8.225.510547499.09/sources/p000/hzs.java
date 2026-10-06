package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class hzs {

    /* JADX INFO: renamed from: a */
    protected final hzp f30080a;

    /* JADX INFO: renamed from: b */
    protected final hzm f30081b;

    /* JADX INFO: renamed from: c */
    protected final C1190zy f30082c;

    /* JADX INFO: renamed from: d */
    protected final Resources f30083d;

    /* JADX INFO: renamed from: e */
    protected final ikw f30084e;

    /* JADX INFO: renamed from: f */
    protected final ilk f30085f;

    /* JADX INFO: renamed from: g */
    public final Size f30086g;

    /* JADX INFO: renamed from: h */
    public final Size f30087h;

    public hzs(hzp hzpVar, C1190zy c1190zy, Resources resources) {
        hzo hzoVar = hzpVar.f30074a;
        this.f30080a = hzpVar;
        this.f30081b = hzpVar.f30075b;
        this.f30084e = hzoVar.f30072h;
        this.f30085f = hzoVar.f30071g;
        this.f30086g = hzoVar.f30068d;
        this.f30087h = hzoVar.f30066b;
        this.f30082c = c1190zy;
        this.f30083d = resources;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo10890a(View view);

    /* JADX INFO: renamed from: b */
    public abstract void mo10891b(View view);

    /* JADX INFO: renamed from: c */
    public void mo10892c(View view) {
        if (this.f30087h == null) {
            return;
        }
        m10954v(view.getId(), this.f30087h.getWidth(), this.f30087h.getHeight(), 0, 0);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo10893d(View view);

    /* JADX INFO: renamed from: e */
    public abstract void mo10894e(View view);

    /* JADX INFO: renamed from: f */
    public abstract void mo10895f(View view);

    /* JADX INFO: renamed from: g */
    public abstract void mo10896g(View view);

    /* JADX INFO: renamed from: h */
    public abstract void mo10897h(View view);

    /* JADX INFO: renamed from: i */
    public abstract void mo10898i(View view);

    /* JADX INFO: renamed from: j */
    public abstract void mo10899j(View view);

    /* JADX INFO: renamed from: k */
    public abstract void mo10900k(View view);

    /* JADX INFO: renamed from: l */
    public abstract void mo10901l(View view);

    /* JADX INFO: renamed from: m */
    public abstract void mo10902m(View view);

    /* JADX INFO: renamed from: n */
    public abstract void mo10903n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo10904o(View view);

    /* JADX INFO: renamed from: p */
    public abstract void mo10905p(View view);

    /* JADX INFO: renamed from: q */
    public abstract void mo10906q(View view);

    /* JADX INFO: renamed from: r */
    public Rect mo10909r(Size size, Size size2) {
        int height;
        int width;
        int i;
        int i2 = 0;
        if (size == null || size2 == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (size.getWidth() / size.getHeight() < size2.getWidth() / size2.getHeight()) {
            width = size.getWidth();
            height = (int) ((size2.getHeight() / size2.getWidth()) * width);
        } else {
            height = size.getHeight();
            width = (int) ((size2.getWidth() / size2.getHeight()) * height);
        }
        if (size.getWidth() / size.getHeight() < size2.getWidth() / size2.getHeight()) {
            double height2 = size.getHeight() - height;
            Double.isNaN(height2);
            i = (int) (height2 / 2.0d);
        } else {
            double width2 = size.getWidth() - width;
            Double.isNaN(width2);
            i2 = (int) (width2 / 2.0d);
            i = 0;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    /* JADX INFO: renamed from: s */
    protected final void m10951s(int i, int i2, int i3, int i4) {
        this.f30082c.m19823h(i, 6, i2, 6, i3);
        this.f30082c.m19823h(i, 7, i2, 7, i4);
    }

    /* JADX INFO: renamed from: t */
    protected final void m10952t(int i) {
        this.f30082c.m19824i(i, 0);
        this.f30082c.m19825j(i, 0);
    }

    /* JADX INFO: renamed from: u */
    protected final void m10953u(int i, int i2, int i3, int i4, int i5) {
        this.f30082c.m19824i(i, i3);
        this.f30082c.m19825j(i, i2);
        this.f30082c.m19823h(i, 4, i4, 3, i5);
        m10951s(i, i4, 0, 0);
    }

    /* JADX INFO: renamed from: v */
    protected final void m10954v(int i, int i2, int i3, int i4, int i5) {
        this.f30082c.m19824i(i, i3);
        this.f30082c.m19825j(i, i2);
        this.f30082c.m19823h(i, 3, 0, 3, i5);
        this.f30082c.m19823h(i, 6, 0, 6, i4);
    }

    /* JADX INFO: renamed from: w */
    protected final void m10955w(int i, int i2, int i3, int i4, int i5) {
        m10951s(i, 0, i2, i3);
        m10958z(i, i4, i5);
        m10952t(i);
    }

    /* JADX INFO: renamed from: x */
    protected final void m10956x(int i, Rect rect) {
        m10957y(i, rect, true);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    /* JADX INFO: renamed from: y */
    protected final void m10957y(int i, Rect rect, boolean z) {
        int iWidth;
        int iHeight;
        int i2;
        int i3;
        int iWidth2 = rect.width();
        int iHeight2 = rect.height();
        int i4 = rect.left;
        int i5 = rect.top;
        if (z) {
            ilk ilkVar = ilk.PORTRAIT;
            switch (this.f30085f) {
                case PORTRAIT:
                case REVERSE_PORTRAIT:
                    iWidth = rect.width();
                    iHeight = rect.height();
                    i2 = rect.left;
                    i3 = i5;
                    break;
                case LANDSCAPE:
                    int iHeight3 = rect.height();
                    iWidth = iHeight3;
                    iHeight = rect.width();
                    i2 = rect.left;
                    i3 = rect.top + iHeight3;
                    break;
                case REVERSE_LANDSCAPE:
                    int iHeight4 = rect.height();
                    int iWidth3 = rect.width();
                    iWidth = iHeight4;
                    iHeight = iWidth3;
                    i2 = rect.left + iWidth3;
                    i3 = i5;
                    break;
                default:
                    iWidth = iWidth2;
                    iHeight = iHeight2;
                    i2 = i4;
                    i3 = i5;
                    break;
            }
        } else {
            iWidth = iWidth2;
            iHeight = iHeight2;
            i2 = i4;
            i3 = i5;
        }
        m10954v(i, iWidth, iHeight, i2, i3);
    }

    /* JADX INFO: renamed from: z */
    protected final void m10958z(int i, int i2, int i3) {
        this.f30082c.m19823h(i, 3, 0, 3, i2);
        this.f30082c.m19823h(i, 4, 0, 4, i3);
    }
}
