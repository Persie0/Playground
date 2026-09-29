package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p64 extends m80 implements Runnable, gr6, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c */
    public boolean f55644c;

    /* JADX INFO: renamed from: d */
    public int f55645d;

    /* JADX INFO: renamed from: e */
    public f6b f55646e;

    /* JADX INFO: renamed from: f */
    public final n66 f55647f;

    /* JADX INFO: renamed from: g */
    public final sc9 f55648g;

    /* JADX INFO: renamed from: h */
    public final h66 f55649h;

    /* JADX INFO: renamed from: i */
    public final SnapshotStateList f55650i;

    public p64() {
        super(1);
        n66 n66Var = new n66(9);
        n6b.f52420a.getClass();
        n66Var.m17261m(m6b.f50674b, new c7b("caption bar"));
        n66Var.m17261m(m6b.f50675c, new c7b("display cutout"));
        n66Var.m17261m(m6b.f50676d, new c7b("ime"));
        n66Var.m17261m(m6b.f50677e, new c7b("mandatory system gestures"));
        n66Var.m17261m(m6b.f50678f, new c7b("navigation bars"));
        n66Var.m17261m(m6b.f50679g, new c7b("status bars"));
        n66Var.m17261m(m6b.f50680h, new c7b("system gestures"));
        n66Var.m17261m(m6b.f50681i, new c7b("tappable element"));
        n66Var.m17261m(m6b.f50682j, new c7b("waterfall"));
        this.f55647f = n66Var;
        this.f55648g = AbstractC0278f.m1257g(0);
        this.f55649h = new h66(4);
        this.f55650i = new SnapshotStateList();
    }

    /* JADX INFO: renamed from: G */
    public final void m18921G(f6b f6bVar) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        t56 t56Var = p6b.f55667a;
        int[] iArr2 = t56Var.f35144b;
        Object[] objArr3 = t56Var.f35145c;
        long[] jArr2 = t56Var.f35143a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            n6b n6bVar = (n6b) objArr3[i6];
                            l64 l64VarMo136i = f6bVar.f38536a.mo136i(i7);
                            long j3 = (((long) l64VarMo136i.f49116a) << 48) | (((long) l64VarMo136i.f49117b) << 32) | (((long) l64VarMo136i.f49118c) << 16) | ((long) l64VarMo136i.f49119d);
                            Object objM17255g = this.f55647f.m17255g(n6bVar);
                            objM17255g.getClass();
                            c7b c7bVar = (c7b) objM17255g;
                            if (!nda.m17377a(j3, c7bVar.f9676h)) {
                                c7bVar.f9676h = j3;
                                z2 = true;
                                if (!nda.m17377a(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                l64 l64VarMo137j = f6bVar.f38536a.mo137j(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) l64VarMo137j.f49117b) << 32) | (((long) l64VarMo137j.f49116a) << 48) | (((long) l64VarMo137j.f49118c) << 16) | ((long) l64VarMo137j.f49119d);
                                if (!nda.m17377a(c7bVar.f9677i, j4)) {
                                    c7bVar.f9677i = j4;
                                    z2 = true;
                                    if (!nda.m17377a(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            ((xc9) c7bVar.f9669a).setValue(Boolean.valueOf(f6bVar.f38536a.mo139u(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        rh2 rh2VarMo4365h = f6bVar.f38536a.mo4365h();
        if (rh2VarMo4365h == null) {
            j = 0;
        } else {
            l64 l64VarM20660a = rh2VarMo4365h.m20660a();
            j = (((long) l64VarM20660a.f49116a) << c3) | (((long) l64VarM20660a.f49117b) << c2) | (((long) l64VarM20660a.f49118c) << c) | ((long) l64VarM20660a.f49119d);
        }
        n66 n66Var = this.f55647f;
        n6b.f52420a.getClass();
        Object objM17255g2 = n66Var.m17255g(m6b.f50682j);
        objM17255g2.getClass();
        c7b c7bVar2 = (c7b) objM17255g2;
        ((xc9) c7bVar2.f9669a).setValue(Boolean.valueOf(!nda.m17377a(j, 0L)));
        if (!nda.m17377a(c7bVar2.f9676h, j)) {
            c7bVar2.f9676h = j;
            c7bVar2.f9677i = j;
            z2 = z;
            if (!nda.m17377a(j, 0L)) {
                z3 = z2;
            }
        }
        if (rh2VarMo4365h == null) {
            h66 h66Var = this.f55649h;
            if (h66Var.f1294b > 0) {
                h66Var.m13093j();
                this.f55650i.clear();
                z2 = z;
            }
        } else {
            List listM11021f = ebd.m11021f(rh2VarMo4365h.f59262a);
            int size = listM11021f.size();
            h66 h66Var2 = this.f55649h;
            if (size < h66Var2.f1294b) {
                h66Var2.m13096m(listM11021f.size(), this.f55649h.f1294b);
                this.f55650i.m1312h(listM11021f.size(), this.f55650i.size());
                z2 = z;
            } else {
                int size2 = listM11021f.size() - this.f55649h.f1294b;
                int i8 = 0;
                while (i8 < size2) {
                    h66 h66Var3 = this.f55649h;
                    h66Var3.m13090g(AbstractC0278f.m1260j(listM11021f.get(h66Var3.f1294b)));
                    this.f55650i.add(new i28("display cutout rect " + this.f55649h.f1294b));
                    i8++;
                    z2 = z;
                }
            }
            List list = listM11021f;
            int size3 = list.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listM11021f.get(i9);
                t66 t66Var = (t66) this.f55649h.m717b(i9);
                if (!fa4.m11650l(t66Var.getValue(), rect)) {
                    t66Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!list.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.f55648g.m21222h() != 0) && z2) {
            sc9 sc9Var = this.f55648g;
            sc9Var.m21223i(sc9Var.m21222h() + 1);
            synchronized (nc9.f52602c) {
                o66 o66Var = nc9.f52609j.f60422h;
                z4 = (o66Var == null || o66Var.m725c() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                nc9.m17349a();
            }
        }
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: g */
    public final void mo14068g(m5b m5bVar) {
        boolean z = false;
        this.f55644c = false;
        int iMo14859d = m5bVar.f50624a.mo14859d();
        this.f55645d &= ~iMo14859d;
        this.f55646e = null;
        n6b n6bVar = (n6b) p6b.f55667a.m10152b(iMo14859d);
        if (n6bVar != null) {
            Object objM17255g = this.f55647f.m17255g(n6bVar);
            objM17255g.getClass();
            c7b c7bVar = (c7b) objM17255g;
            c7bVar.f9671c.m19862i(0.0f);
            c7bVar.f9673e.m19862i(1.0f);
            c7bVar.f9672d.m22674i(0L);
            c7bVar.f9671c.m19862i(0.0f);
            ((xc9) c7bVar.f9670b).setValue(Boolean.FALSE);
            c7bVar.f9678j = -1L;
            c7bVar.f9679k = -1L;
            sc9 sc9Var = this.f55648g;
            sc9Var.m21223i(sc9Var.m21222h() + 1);
            synchronized (nc9.f52602c) {
                o66 o66Var = nc9.f52609j.f60422h;
                if (o66Var != null && o66Var.m725c()) {
                    z = true;
                }
            }
            if (z) {
                nc9.m17349a();
            }
        }
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: h */
    public final void mo14069h(m5b m5bVar) {
        this.f55644c = true;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: i */
    public final f6b mo14070i(f6b f6bVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m5b m5bVar = (m5b) list.get(i);
            n6b n6bVar = (n6b) p6b.f55667a.m10152b(m5bVar.f50624a.mo14859d());
            if (n6bVar != null) {
                Object objM17255g = this.f55647f.m17255g(n6bVar);
                objM17255g.getClass();
                c7b c7bVar = (c7b) objM17255g;
                if (((Boolean) ((xc9) c7bVar.f9670b).getValue()).booleanValue()) {
                    l5b l5bVar = m5bVar.f50624a;
                    c7bVar.f9671c.m19862i(l5bVar.mo14858c());
                    c7bVar.f9673e.m19862i(l5bVar.mo14856a());
                    c7bVar.f9672d.m22674i(l5bVar.mo14857b());
                }
            }
        }
        m18921G(f6bVar);
        return f6bVar;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: j */
    public final p33 mo14071j(m5b m5bVar, p33 p33Var) {
        f6b f6bVar = this.f55646e;
        boolean z = false;
        this.f55644c = false;
        this.f55646e = null;
        if (m5bVar.f50624a.mo14857b() > 0 && f6bVar != null) {
            int iMo14859d = m5bVar.f50624a.mo14859d();
            this.f55645d |= iMo14859d;
            n6b n6bVar = (n6b) p6b.f55667a.m10152b(iMo14859d);
            if (n6bVar != null) {
                Object objM17255g = this.f55647f.m17255g(n6bVar);
                objM17255g.getClass();
                c7b c7bVar = (c7b) objM17255g;
                l64 l64VarMo136i = f6bVar.f38536a.mo136i(iMo14859d);
                long j = (((long) l64VarMo136i.f49116a) << 48) | (((long) l64VarMo136i.f49117b) << 32) | (((long) l64VarMo136i.f49118c) << 16) | ((long) l64VarMo136i.f49119d);
                long j2 = c7bVar.f9676h;
                if (!nda.m17377a(j, j2)) {
                    c7bVar.f9678j = j2;
                    c7bVar.f9679k = j;
                    ((xc9) c7bVar.f9670b).setValue(Boolean.TRUE);
                    l5b l5bVar = m5bVar.f50624a;
                    c7bVar.f9671c.m19862i(l5bVar.mo14858c());
                    c7bVar.f9673e.m19862i(l5bVar.mo14856a());
                    c7bVar.f9672d.m22674i(l5bVar.mo14857b());
                    sc9 sc9Var = this.f55648g;
                    sc9Var.m21223i(sc9Var.m21222h() + 1);
                    synchronized (nc9.f52602c) {
                        o66 o66Var = nc9.f52609j.f60422h;
                        if (o66Var != null && o66Var.m725c()) {
                            z = true;
                        }
                    }
                    if (z) {
                        nc9.m17349a();
                        return p33Var;
                    }
                }
            }
        }
        return p33Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, this);
        dta.m10642m(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, null);
        dta.m10642m(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f55644c) {
            this.f55645d = 0;
            this.f55644c = false;
            f6b f6bVar = this.f55646e;
            if (f6bVar != null) {
                m18921G(f6bVar);
                this.f55646e = null;
            }
        }
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public final f6b mo1889s(View view, f6b f6bVar) {
        if (this.f55644c) {
            this.f55646e = f6bVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return f6bVar;
            }
        } else if (this.f55645d == 0) {
            m18921G(f6bVar);
        }
        return f6bVar;
    }
}
