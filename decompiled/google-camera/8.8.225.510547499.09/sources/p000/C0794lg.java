package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.lens.sdk.LensApi;

/* JADX INFO: renamed from: lg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0794lg implements InterfaceC0243hn {

    /* JADX INFO: renamed from: a */
    private Context f38172a;

    /* JADX INFO: renamed from: b */
    private ListAdapter f38173b;

    /* JADX INFO: renamed from: c */
    private int f38174c;

    /* JADX INFO: renamed from: d */
    private int f38175d;

    /* JADX INFO: renamed from: e */
    public C0773km f38176e;

    /* JADX INFO: renamed from: f */
    public int f38177f;

    /* JADX INFO: renamed from: g */
    public int f38178g;

    /* JADX INFO: renamed from: h */
    public boolean f38179h;

    /* JADX INFO: renamed from: i */
    public boolean f38180i;

    /* JADX INFO: renamed from: j */
    public int f38181j;

    /* JADX INFO: renamed from: k */
    public int f38182k;

    /* JADX INFO: renamed from: l */
    public View f38183l;

    /* JADX INFO: renamed from: m */
    public AdapterView.OnItemClickListener f38184m;

    /* JADX INFO: renamed from: n */
    public AdapterView.OnItemSelectedListener f38185n;

    /* JADX INFO: renamed from: o */
    public final Handler f38186o;

    /* JADX INFO: renamed from: p */
    public boolean f38187p;

    /* JADX INFO: renamed from: q */
    public PopupWindow f38188q;

    /* JADX INFO: renamed from: r */
    public final RunnableC0059be f38189r;

    /* JADX INFO: renamed from: s */
    private int f38190s;

    /* JADX INFO: renamed from: t */
    private boolean f38191t;

    /* JADX INFO: renamed from: u */
    private DataSetObserver f38192u;

    /* JADX INFO: renamed from: v */
    private final C0793lf f38193v;

    /* JADX INFO: renamed from: w */
    private final Rect f38194w;

    /* JADX INFO: renamed from: x */
    private Rect f38195x;

    /* JADX INFO: renamed from: y */
    private final cln f38196y;

    /* JADX INFO: renamed from: z */
    private final RunnableC0059be f38197z;

    public C0794lg(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m15297a() {
        return this.f38178g;
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: aP */
    public final ListView mo9624aP() {
        return this.f38176e;
    }

    /* JADX INFO: renamed from: b */
    public final int m15298b() {
        if (this.f38191t) {
            return this.f38175d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m15299c() {
        return this.f38188q.getBackground();
    }

    /* JADX INFO: renamed from: e */
    public void mo12909e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f38192u;
        if (dataSetObserver == null) {
            this.f38192u = new C0792le(this);
        } else {
            ListAdapter listAdapter2 = this.f38173b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f38173b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f38192u);
        }
        C0773km c0773km = this.f38176e;
        if (c0773km != null) {
            c0773km.setAdapter(this.f38173b);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15300f(Drawable drawable) {
        this.f38188q.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: g */
    public final void m15301g(int i) {
        this.f38178g = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m15302j(int i) {
        this.f38175d = i;
        this.f38191t = true;
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: k */
    public final void mo9626k() {
        this.f38188q.dismiss();
        this.f38188q.setContentView(null);
        this.f38176e = null;
        this.f38186o.removeCallbacks(this.f38189r);
    }

    /* JADX INFO: renamed from: o */
    public final int m15303o() {
        if (mo9636u()) {
            return this.f38176e.getSelectedItemPosition();
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public C0773km mo15304p(Context context, boolean z) {
        return new C0773km(context, z);
    }

    /* JADX INFO: renamed from: q */
    public final void m15305q() {
        C0773km c0773km = this.f38176e;
        if (c0773km != null) {
            c0773km.f36511a = true;
            c0773km.requestLayout();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m15306r(int i) {
        Drawable background = this.f38188q.getBackground();
        if (background == null) {
            this.f38177f = i;
        } else {
            background.getPadding(this.f38194w);
            this.f38177f = this.f38194w.left + this.f38194w.right + i;
        }
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: s */
    public final void mo9634s() {
        int i;
        int iMakeMeasureSpec;
        int paddingTop;
        if (this.f38176e == null) {
            C0773km c0773kmMo15304p = mo15304p(this.f38172a, !this.f38187p);
            this.f38176e = c0773kmMo15304p;
            c0773kmMo15304p.setAdapter(this.f38173b);
            this.f38176e.setOnItemClickListener(this.f38184m);
            this.f38176e.setFocusable(true);
            this.f38176e.setFocusableInTouchMode(true);
            this.f38176e.setOnItemSelectedListener(new anh(this, 1));
            this.f38176e.setOnScrollListener(this.f38193v);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f38185n;
            if (onItemSelectedListener != null) {
                this.f38176e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.f38188q.setContentView(this.f38176e);
        }
        Drawable background = this.f38188q.getBackground();
        if (background != null) {
            background.getPadding(this.f38194w);
            i = this.f38194w.top + this.f38194w.bottom;
            if (!this.f38191t) {
                this.f38175d = -this.f38194w.top;
            }
        } else {
            this.f38194w.setEmpty();
            i = 0;
        }
        int iM15158a = C0790lc.m15158a(this.f38188q, this.f38183l, this.f38175d, this.f38188q.getInputMethodMode() == 2);
        if (this.f38174c == -1) {
            paddingTop = iM15158a + i;
        } else {
            int i2 = this.f38177f;
            switch (i2) {
                case -2:
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f38172a.getResources().getDisplayMetrics().widthPixels - (this.f38194w.left + this.f38194w.right), Integer.MIN_VALUE);
                    break;
                case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f38172a.getResources().getDisplayMetrics().widthPixels - (this.f38194w.left + this.f38194w.right), 1073741824);
                    break;
                default:
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                    break;
            }
            int iM14530b = this.f38176e.m14530b(iMakeMeasureSpec, iM15158a);
            paddingTop = iM14530b + (iM14530b > 0 ? i + this.f38176e.getPaddingTop() + this.f38176e.getPaddingBottom() : 0);
        }
        boolean zM15309w = m15309w();
        ahp.m683c(this.f38188q, this.f38190s);
        if (this.f38188q.isShowing()) {
            if (afe.m461e(this.f38183l)) {
                int width = this.f38177f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f38183l.getWidth();
                }
                int i3 = this.f38174c;
                if (i3 == -1) {
                    if (true != zM15309w) {
                        paddingTop = -1;
                    }
                    if (zM15309w) {
                        this.f38188q.setWidth(this.f38177f == -1 ? -1 : 0);
                        this.f38188q.setHeight(0);
                    } else {
                        this.f38188q.setWidth(this.f38177f == -1 ? -1 : 0);
                        this.f38188q.setHeight(-1);
                    }
                } else if (i3 != -2) {
                    paddingTop = i3;
                }
                this.f38188q.setOutsideTouchable(true);
                this.f38188q.update(this.f38183l, this.f38178g, this.f38175d, width < 0 ? -1 : width, paddingTop < 0 ? -1 : paddingTop);
                return;
            }
            return;
        }
        int width2 = this.f38177f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f38183l.getWidth();
        }
        int i4 = this.f38174c;
        if (i4 == -1) {
            paddingTop = -1;
        } else if (i4 != -2) {
            paddingTop = i4;
        }
        this.f38188q.setWidth(width2);
        this.f38188q.setHeight(paddingTop);
        C0791ld.m15196b(this.f38188q, true);
        this.f38188q.setOutsideTouchable(true);
        this.f38188q.setTouchInterceptor(this.f38196y);
        if (this.f38180i) {
            ahp.m682b(this.f38188q, this.f38179h);
        }
        C0791ld.m15195a(this.f38188q, this.f38195x);
        aho.m680a(this.f38188q, this.f38183l, this.f38178g, this.f38175d, this.f38181j);
        this.f38176e.setSelection(-1);
        if (!this.f38187p || this.f38176e.isInTouchMode()) {
            m15305q();
        }
        if (this.f38187p) {
            return;
        }
        this.f38186o.post(this.f38197z);
    }

    /* JADX INFO: renamed from: t */
    public final void m15307t(Rect rect) {
        this.f38195x = rect != null ? new Rect(rect) : null;
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: u */
    public final boolean mo9636u() {
        return this.f38188q.isShowing();
    }

    /* JADX INFO: renamed from: v */
    public final void m15308v(PopupWindow.OnDismissListener onDismissListener) {
        this.f38188q.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m15309w() {
        return this.f38188q.getInputMethodMode() == 2;
    }

    /* JADX INFO: renamed from: x */
    public final void m15310x() {
        this.f38188q.setInputMethodMode(2);
    }

    /* JADX INFO: renamed from: y */
    public final void m15311y() {
        this.f38187p = true;
        this.f38188q.setFocusable(true);
    }

    public C0794lg(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        this.f38174c = -2;
        this.f38177f = -2;
        this.f38190s = 1002;
        this.f38181j = 0;
        this.f38182k = Integer.MAX_VALUE;
        this.f38189r = new RunnableC0059be(this, 18);
        this.f38196y = new cln(this, 1);
        this.f38193v = new C0793lf(this);
        this.f38197z = new RunnableC0059be(this, 17);
        this.f38194w = new Rect();
        this.f38172a = context;
        this.f38186o = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0193fr.f23271o, i, 0);
        this.f38178g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f38175d = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f38191t = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0276it c0276it = new C0276it(context, attributeSet, i);
        this.f38188q = c0276it;
        c0276it.setInputMethodMode(1);
    }
}
