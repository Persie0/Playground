package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p024b3.C1302i;
import p024b3.C1303j;
import p058d.C4999a;
import p185j.InterfaceC6396f;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.appcompat.widget.l0 */
/* JADX INFO: loaded from: classes.dex */
public class C0327l0 implements InterfaceC6396f {

    /* JADX INFO: renamed from: V */
    public static final Method f1261V;

    /* JADX INFO: renamed from: W */
    public static final Method f1262W;

    /* JADX INFO: renamed from: I */
    public d f1264I;

    /* JADX INFO: renamed from: J */
    public View f1265J;

    /* JADX INFO: renamed from: K */
    public AdapterView.OnItemClickListener f1266K;

    /* JADX INFO: renamed from: L */
    public AdapterView.OnItemSelectedListener f1267L;

    /* JADX INFO: renamed from: Q */
    public final Handler f1272Q;

    /* JADX INFO: renamed from: S */
    public Rect f1274S;

    /* JADX INFO: renamed from: T */
    public boolean f1275T;

    /* JADX INFO: renamed from: U */
    public final C0332o f1276U;

    /* JADX INFO: renamed from: a */
    public final Context f1277a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f1278b;

    /* JADX INFO: renamed from: c */
    public C0314g0 f1279c;

    /* JADX INFO: renamed from: f */
    public int f1282f;

    /* JADX INFO: renamed from: g */
    public int f1283g;

    /* JADX INFO: renamed from: i */
    public boolean f1285i;

    /* JADX INFO: renamed from: j */
    public boolean f1286j;

    /* JADX INFO: renamed from: k */
    public boolean f1287k;

    /* JADX INFO: renamed from: d */
    public final int f1280d = -2;

    /* JADX INFO: renamed from: e */
    public int f1281e = -2;

    /* JADX INFO: renamed from: h */
    public final int f1284h = 1002;

    /* JADX INFO: renamed from: l */
    public int f1288l = 0;

    /* JADX INFO: renamed from: H */
    public final int f1263H = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: M */
    public final g f1268M = new g();

    /* JADX INFO: renamed from: N */
    public final f f1269N = new f();

    /* JADX INFO: renamed from: O */
    public final e f1270O = new e();

    /* JADX INFO: renamed from: P */
    public final c f1271P = new c();

    /* JADX INFO: renamed from: R */
    public final Rect f1273R = new Rect();

    /* JADX INFO: renamed from: androidx.appcompat.widget.l0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m1244a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.l0$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m1245a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* JADX INFO: renamed from: b */
        public static void m1246b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.l0$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0314g0 c0314g0 = C0327l0.this.f1279c;
            if (c0314g0 != null) {
                c0314g0.setListSelectionHidden(true);
                c0314g0.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.l0$d */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            C0327l0 c0327l0 = C0327l0.this;
            if (c0327l0.mo893a()) {
                c0327l0.mo894b();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            C0327l0.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.l0$e */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z10 = true;
            if (i10 == 1) {
                C0327l0 c0327l0 = C0327l0.this;
                if (c0327l0.f1276U.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (z10 || c0327l0.f1276U.getContentView() == null) {
                    return;
                }
                Handler handler = c0327l0.f1272Q;
                g gVar = c0327l0.f1268M;
                handler.removeCallbacks(gVar);
                gVar.run();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.l0$f */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C0332o c0332o;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            C0327l0 c0327l0 = C0327l0.this;
            if (action == 0 && (c0332o = c0327l0.f1276U) != null && c0332o.isShowing() && x10 >= 0) {
                C0332o c0332o2 = c0327l0.f1276U;
                if (x10 < c0332o2.getWidth() && y10 >= 0 && y10 < c0332o2.getHeight()) {
                    c0327l0.f1272Q.postDelayed(c0327l0.f1268M, 250L);
                    return false;
                }
            }
            if (action != 1) {
                return false;
            }
            c0327l0.f1272Q.removeCallbacks(c0327l0.f1268M);
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.l0$g */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0327l0 c0327l0 = C0327l0.this;
            C0314g0 c0314g0 = c0327l0.f1279c;
            if (c0314g0 != null) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (C10029b0.g.m18698b(c0314g0) && c0327l0.f1279c.getCount() > c0327l0.f1279c.getChildCount() && c0327l0.f1279c.getChildCount() <= c0327l0.f1263H) {
                    c0327l0.f1276U.setInputMethodMode(2);
                    c0327l0.mo894b();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1261V = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1262W = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0327l0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1277a = context;
        this.f1272Q = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4999a.f32601o, i10, i11);
        this.f1282f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1283g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1285i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0332o c0332o = new C0332o(context, attributeSet, i10, i11);
        this.f1276U = c0332o;
        c0332o.setInputMethodMode(1);
    }

    @Override // p185j.InterfaceC6396f
    /* JADX INFO: renamed from: a */
    public final boolean mo893a() {
        return this.f1276U.isShowing();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:107:0x0206  */
    /* JADX WARN: Code duplicated, block: B:113:0x022f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0235  */
    /* JADX WARN: Code duplicated, block: B:118:0x023f  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x008e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:33:0x0103  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x012a  */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0132  */
    /* JADX WARN: Code duplicated, block: B:49:0x0135  */
    /* JADX WARN: Code duplicated, block: B:51:0x013d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:70:0x017a  */
    /* JADX WARN: Code duplicated, block: B:73:0x017e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:78:0x018d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:83:0x019e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e0  */
    @Override // p185j.InterfaceC6396f
    /* JADX INFO: renamed from: b */
    public final void mo894b() {
        int i10;
        boolean z10;
        int iM1244a;
        int i11;
        int i12;
        int iMakeMeasureSpec;
        int iM1193a;
        int paddingBottom;
        int i13;
        boolean z11;
        int width;
        C0314g0 c0314g0;
        Method method;
        Method method2;
        View view;
        int width2;
        int i14;
        int i15;
        C0314g0 c0314g1 = this.f1279c;
        C0332o c0332o = this.f1276U;
        Context context = this.f1277a;
        if (c0314g1 == null) {
            C0314g0 c0314g0Mo1242q = mo1242q(context, !this.f1275T);
            this.f1279c = c0314g0Mo1242q;
            c0314g0Mo1242q.setAdapter(this.f1278b);
            this.f1279c.setOnItemClickListener(this.f1266K);
            this.f1279c.setFocusable(true);
            this.f1279c.setFocusableInTouchMode(true);
            this.f1279c.setOnItemSelectedListener(new C0325k0(this));
            this.f1279c.setOnScrollListener(this.f1270O);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1267L;
            if (onItemSelectedListener != null) {
                this.f1279c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0332o.setContentView(this.f1279c);
        }
        Drawable background = c0332o.getBackground();
        Rect rect = this.f1273R;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.f1285i) {
                this.f1283g = -i16;
            }
            if (c0332o.getInputMethodMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            iM1244a = a.m1244a(c0332o, this.f1265J, this.f1283g, z10);
            i11 = this.f1280d;
            if (i11 == -1) {
                i13 = iM1244a + i10;
            } else {
                i12 = this.f1281e;
                if (i12 != -2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
                } else if (i12 != -1) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
                iM1193a = this.f1279c.m1193a(iMakeMeasureSpec, iM1244a + 0);
                if (iM1193a > 0) {
                    paddingBottom = this.f1279c.getPaddingBottom() + this.f1279c.getPaddingTop() + i10 + 0;
                } else {
                    paddingBottom = 0;
                }
                i13 = iM1193a + paddingBottom;
            }
            if (c0332o.getInputMethodMode() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            C1303j.m4825d(c0332o, this.f1284h);
            if (c0332o.isShowing()) {
                view = this.f1265J;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (C10029b0.g.m18698b(view)) {
                    width2 = this.f1281e;
                    if (width2 == -1) {
                        width2 = -1;
                    } else if (width2 == -2) {
                        width2 = this.f1265J.getWidth();
                    }
                    if (i11 == -1) {
                        if (z11) {
                            i11 = i13;
                        } else {
                            i11 = -1;
                        }
                        if (z11) {
                            if (this.f1281e == -1) {
                                i15 = -1;
                            } else {
                                i15 = 0;
                            }
                            c0332o.setWidth(i15);
                            c0332o.setHeight(0);
                        } else {
                            c0332o.setWidth(this.f1281e == -1 ? -1 : 0);
                            c0332o.setHeight(-1);
                        }
                    } else if (i11 == -2) {
                        i11 = i13;
                    }
                    c0332o.setOutsideTouchable(true);
                    View view2 = this.f1265J;
                    int i17 = this.f1282f;
                    int i18 = this.f1283g;
                    if (width2 < 0) {
                        width2 = -1;
                    }
                    if (i11 < 0) {
                        i14 = -1;
                    } else {
                        i14 = i11;
                    }
                    c0332o.update(view2, i17, i18, width2, i14);
                    return;
                }
                return;
            }
            width = this.f1281e;
            if (width == -1) {
                width = -1;
            } else if (width == -2) {
                width = this.f1265J.getWidth();
            }
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = i13;
            }
            c0332o.setWidth(width);
            c0332o.setHeight(i11);
            if (Build.VERSION.SDK_INT <= 28) {
                method2 = f1261V;
                if (method2 != null) {
                    try {
                        method2.invoke(c0332o, Boolean.TRUE);
                    } catch (Exception unused) {
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            } else {
                b.m1246b(c0332o, true);
            }
            c0332o.setOutsideTouchable(true);
            c0332o.setTouchInterceptor(this.f1269N);
            if (this.f1287k) {
                C1303j.m4824c(c0332o, this.f1286j);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                method = f1262W;
                if (method != null) {
                    try {
                        method.invoke(c0332o, this.f1274S);
                    } catch (Exception e10) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                    }
                }
            } else {
                b.m1245a(c0332o, this.f1274S);
            }
            C1302i.m4821a(c0332o, this.f1265J, this.f1282f, this.f1283g, this.f1288l);
            this.f1279c.setSelection(-1);
            if (this.f1275T || this.f1279c.isInTouchMode()) {
                c0314g0 = this.f1279c;
                if (c0314g0 != null) {
                    c0314g0.setListSelectionHidden(true);
                    c0314g0.requestLayout();
                }
            }
            if (this.f1275T) {
            }
            this.f1272Q.post(this.f1271P);
        }
        rect.setEmpty();
        i10 = 0;
        if (c0332o.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        iM1244a = a.m1244a(c0332o, this.f1265J, this.f1283g, z10);
        i11 = this.f1280d;
        if (i11 == -1) {
            i13 = iM1244a + i10;
        } else {
            i12 = this.f1281e;
            if (i12 != -2) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            } else if (i12 != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            }
            iM1193a = this.f1279c.m1193a(iMakeMeasureSpec, iM1244a + 0);
            if (iM1193a > 0) {
                paddingBottom = this.f1279c.getPaddingBottom() + this.f1279c.getPaddingTop() + i10 + 0;
            } else {
                paddingBottom = 0;
            }
            i13 = iM1193a + paddingBottom;
        }
        if (c0332o.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        C1303j.m4825d(c0332o, this.f1284h);
        if (c0332o.isShowing()) {
            view = this.f1265J;
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            if (C10029b0.g.m18698b(view)) {
                return;
            }
            width2 = this.f1281e;
            if (width2 == -1) {
                width2 = -1;
            } else if (width2 == -2) {
                width2 = this.f1265J.getWidth();
            }
            if (i11 == -1) {
                if (z11) {
                    i11 = i13;
                } else {
                    i11 = -1;
                }
                if (z11) {
                    if (this.f1281e == -1) {
                        i15 = -1;
                    } else {
                        i15 = 0;
                    }
                    c0332o.setWidth(i15);
                    c0332o.setHeight(0);
                } else {
                    c0332o.setWidth(this.f1281e == -1 ? -1 : 0);
                    c0332o.setHeight(-1);
                }
            } else if (i11 == -2) {
                i11 = i13;
            }
            c0332o.setOutsideTouchable(true);
            View view3 = this.f1265J;
            int i19 = this.f1282f;
            int i110 = this.f1283g;
            if (width2 < 0) {
                width2 = -1;
            }
            if (i11 < 0) {
                i14 = -1;
            } else {
                i14 = i11;
            }
            c0332o.update(view3, i19, i110, width2, i14);
            return;
        }
        width = this.f1281e;
        if (width == -1) {
            width = -1;
        } else if (width == -2) {
            width = this.f1265J.getWidth();
        }
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = i13;
        }
        c0332o.setWidth(width);
        c0332o.setHeight(i11);
        if (Build.VERSION.SDK_INT <= 28) {
            method2 = f1261V;
            if (method2 != null) {
                method2.invoke(c0332o, Boolean.TRUE);
            }
        } else {
            b.m1246b(c0332o, true);
        }
        c0332o.setOutsideTouchable(true);
        c0332o.setTouchInterceptor(this.f1269N);
        if (this.f1287k) {
            C1303j.m4824c(c0332o, this.f1286j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            method = f1262W;
            if (method != null) {
                method.invoke(c0332o, this.f1274S);
            }
        } else {
            b.m1245a(c0332o, this.f1274S);
        }
        C1302i.m4821a(c0332o, this.f1265J, this.f1282f, this.f1283g, this.f1288l);
        this.f1279c.setSelection(-1);
        if (this.f1275T) {
            c0314g0 = this.f1279c;
            if (c0314g0 != null) {
                c0314g0.setListSelectionHidden(true);
                c0314g0.requestLayout();
            }
        } else {
            c0314g0 = this.f1279c;
            if (c0314g0 != null) {
                c0314g0.setListSelectionHidden(true);
                c0314g0.requestLayout();
            }
        }
        if (this.f1275T) {
            this.f1272Q.post(this.f1271P);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m1236c() {
        return this.f1282f;
    }

    @Override // p185j.InterfaceC6396f
    public final void dismiss() {
        C0332o c0332o = this.f1276U;
        c0332o.dismiss();
        c0332o.setContentView(null);
        this.f1279c = null;
        this.f1272Q.removeCallbacks(this.f1268M);
    }

    /* JADX INFO: renamed from: e */
    public final void m1237e(int i10) {
        this.f1282f = i10;
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m1238h() {
        return this.f1276U.getBackground();
    }

    @Override // p185j.InterfaceC6396f
    /* JADX INFO: renamed from: j */
    public final C0314g0 mo899j() {
        return this.f1279c;
    }

    /* JADX INFO: renamed from: k */
    public final void m1239k(Drawable drawable) {
        this.f1276U.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: l */
    public final void m1240l(int i10) {
        this.f1283g = i10;
        this.f1285i = true;
    }

    /* JADX INFO: renamed from: o */
    public final int m1241o() {
        if (this.f1285i) {
            return this.f1283g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void mo1009p(ListAdapter listAdapter) {
        d dVar = this.f1264I;
        if (dVar == null) {
            this.f1264I = new d();
        } else {
            ListAdapter listAdapter2 = this.f1278b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f1278b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1264I);
        }
        C0314g0 c0314g0 = this.f1279c;
        if (c0314g0 != null) {
            c0314g0.setAdapter(this.f1278b);
        }
    }

    /* JADX INFO: renamed from: q */
    public C0314g0 mo1242q(Context context, boolean z10) {
        return new C0314g0(context, z10);
    }

    /* JADX INFO: renamed from: r */
    public final void m1243r(int i10) {
        Drawable background = this.f1276U.getBackground();
        if (background == null) {
            this.f1281e = i10;
            return;
        }
        Rect rect = this.f1273R;
        background.getPadding(rect);
        this.f1281e = rect.left + rect.right + i10;
    }
}
