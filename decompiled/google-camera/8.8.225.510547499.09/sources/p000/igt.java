package p000;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igt implements igu, igv, igw {

    /* JADX INFO: renamed from: A */
    private int f30865A;

    /* JADX INFO: renamed from: a */
    public final List f30866a;

    /* JADX INFO: renamed from: b */
    public volatile int f30867b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f30868c;

    /* JADX INFO: renamed from: d */
    public volatile int f30869d;

    /* JADX INFO: renamed from: e */
    public volatile int f30870e;

    /* JADX INFO: renamed from: f */
    public boolean f30871f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f30872g;

    /* JADX INFO: renamed from: h */
    public boolean f30873h;

    /* JADX INFO: renamed from: i */
    public elx f30874i;

    /* JADX INFO: renamed from: j */
    public Optional f30875j;

    /* JADX INFO: renamed from: k */
    public boolean f30876k;

    /* JADX INFO: renamed from: l */
    public final Object f30877l;

    /* JADX INFO: renamed from: m */
    public int f30878m;

    /* JADX INFO: renamed from: n */
    private final igs f30879n;

    /* JADX INFO: renamed from: o */
    private final List f30880o;

    /* JADX INFO: renamed from: p */
    private final List f30881p;

    /* JADX INFO: renamed from: q */
    private final List f30882q;

    /* JADX INFO: renamed from: r */
    private volatile View f30883r;

    /* JADX INFO: renamed from: s */
    private volatile int f30884s;

    /* JADX INFO: renamed from: t */
    private volatile int f30885t;

    /* JADX INFO: renamed from: u */
    private volatile int f30886u;

    /* JADX INFO: renamed from: v */
    private boolean f30887v;

    /* JADX INFO: renamed from: w */
    private boolean f30888w;

    /* JADX INFO: renamed from: x */
    private boolean f30889x;

    /* JADX INFO: renamed from: y */
    private int f30890y;

    /* JADX INFO: renamed from: z */
    private int f30891z;

    public igt(igs igsVar) {
        this.f30885t = 500;
        this.f30886u = 500;
        this.f30871f = false;
        this.f30873h = true;
        this.f30889x = false;
        this.f30875j = Optional.empty();
        this.f30876k = false;
        this.f30877l = new Object();
        this.f30879n = igsVar;
        this.f30880o = Collections.synchronizedList(new ArrayList());
        this.f30866a = Collections.synchronizedList(new ArrayList());
        this.f30881p = Collections.synchronizedList(new ArrayList());
        this.f30882q = Collections.synchronizedList(new ArrayList());
        this.f30870e = 0;
        this.f30869d = 0;
        this.f30872g = true;
        this.f30868c = false;
        this.f30865A = 0;
    }

    @Override // p000.igw
    /* JADX INFO: renamed from: a */
    public final kba mo11297a() {
        this.f30874i.getClass();
        View viewMo11072a = this.f30879n.mo11072a(this.f30883r.getContext());
        igz igzVar = new igz(this.f30883r);
        igq igqVar = new igq(igzVar, viewMo11072a, this.f30884s, this.f30883r, this.f30867b, this.f30890y, this.f30891z, this.f30870e, this.f30878m, this.f30887v, this.f30871f);
        igqVar.f30852a.f30936s = this.f30885t;
        igqVar.f30852a.f30937t = this.f30886u;
        igqVar.f30852a.f30935r = this.f30869d;
        boolean z = this.f30872g;
        iha ihaVar = igqVar.f30852a;
        ihaVar.f30924g = z;
        hri hriVar = new hri(this, igqVar, 12);
        igqVar.f30854c = hriVar;
        ihaVar.f30925h = hriVar;
        int i = this.f30865A;
        ihaVar.f30919b.setColor(i);
        ihaVar.f30920c.setColor(i);
        this.f30875j.ifPresent(new idi(igqVar, 3));
        igqVar.f30853b = this.f30866a;
        igqVar.f30852a.f30938u = this.f30880o;
        synchronized (igzVar.f30899e) {
            View view = (View) igzVar.f30895a.get();
            if (!igzVar.f30900f && view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(igzVar);
                viewTreeObserver.addOnScrollChangedListener(igzVar);
                igzVar.f30900f = true;
                igzVar.f30901g = new igy(igzVar, viewTreeObserver, 1);
                igzVar.f30902h = new igy(igzVar, viewTreeObserver, 0);
            }
        }
        igzVar.f30898d.add(new hri(this, igqVar, 13));
        List list = this.f30881p;
        iha ihaVar2 = igqVar.f30852a;
        ihaVar2.f30921d.clear();
        ihaVar2.f30921d.addAll(list);
        boolean z2 = this.f30873h;
        if (z2 && this.f30889x) {
            throw new IllegalArgumentException("Both allowDelayUntilVisible and allowDelayUntilVileWithinScrollView cannot be true.");
        }
        if (this.f30888w) {
            m11298b(igqVar);
        } else if (z2) {
            igzVar.f30896b.add(new hri(this, igqVar, 14));
        } else if (!this.f30889x) {
            View view2 = (View) igzVar.f30895a.get();
            if (view2 != null && view2.getVisibility() == 0) {
                m11298b(igqVar);
            }
        } else if (igzVar.mo11316b()) {
            m11298b(igqVar);
        } else {
            igzVar.f30897c.add(new hri(this, igqVar, 15));
        }
        return new fjl(this, igqVar, igzVar, 2);
    }

    /* JADX INFO: renamed from: b */
    public final void m11298b(igq igqVar) {
        synchronized (this.f30877l) {
            if (!this.f30876k) {
                Iterator it = this.f30882q.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) ((Supplier) it.next()).get()).booleanValue()) {
                    }
                }
                this.f30874i.mo7482d(igqVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11299c(View view, int i) {
        this.f30883r = view;
        this.f30884s = 1;
        this.f30891z = i;
    }

    @Override // p000.igw
    /* JADX INFO: renamed from: d */
    public final void mo11300d(Supplier supplier) {
        this.f30882q.add(supplier);
    }

    @Override // p000.igw
    /* JADX INFO: renamed from: e */
    public final void mo11301e(Runnable runnable) {
        this.f30881p.add(runnable);
    }

    @Override // p000.igw
    /* JADX INFO: renamed from: f */
    public final void mo11302f(Runnable runnable, Executor executor) {
        this.f30880o.add(Pair.create(runnable, executor));
    }

    @Override // p000.igw
    /* JADX INFO: renamed from: g */
    public final void mo11303g(Runnable runnable, Executor executor) {
        this.f30866a.add(new igp(runnable, executor, 0L));
    }

    /* JADX INFO: renamed from: h */
    public final void m11304h(View view, int i) {
        this.f30883r = view;
        this.f30884s = 4;
        this.f30890y = i;
    }

    @Override // p000.igu
    /* JADX INFO: renamed from: i */
    public final void mo11305i() {
        this.f30867b = 2;
    }

    /* JADX INFO: renamed from: j */
    public final void m11306j(View view, int i) {
        this.f30883r = view;
        this.f30884s = 3;
        this.f30890y = i;
    }

    @Override // p000.igv
    /* JADX INFO: renamed from: k */
    public final void mo11307k() {
        this.f30865A = kxk.m15024q(this.f30883r, C0100R.attr.colorTertiaryContainer);
    }

    @Override // p000.igw
    /* JADX INFO: renamed from: l */
    public final void mo11308l() {
        this.f30887v = true;
    }

    @Override // p000.igw
    /* JADX INFO: renamed from: m */
    public final void mo11309m() {
        this.f30885t = 400;
    }

    @Override // p000.igw
    /* JADX INFO: renamed from: n */
    public final void mo11310n() {
        this.f30886u = 300;
    }

    @Override // p000.igw
    /* JADX INFO: renamed from: o */
    public final void mo11311o() {
        this.f30888w = true;
    }

    @Override // p000.igw
    /* JADX INFO: renamed from: p */
    public final void mo11312p() {
        this.f30889x = true;
    }

    /* JADX INFO: renamed from: q */
    public final void m11313q(View view) {
        m11299c(view, 0);
    }

    /* JADX INFO: renamed from: r */
    public final void m11314r(View view) {
        this.f30883r = view;
        this.f30884s = 2;
        this.f30891z = 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public igt(String str) {
        final SpannableString spannableStringValueOf = SpannableString.valueOf(str);
        this(new igs() { // from class: igr
            @Override // p000.igs
            /* JADX INFO: renamed from: a */
            public final View mo11072a(Context context) {
                Spannable spannable = spannableStringValueOf;
                TextView textView = new TextView(context);
                textView.setTextAppearance(C0100R.style.Tooltip);
                textView.setText(spannable);
                return textView;
            }
        });
    }
}
