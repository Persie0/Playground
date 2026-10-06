package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.display.DisplayManager;
import android.transition.Fade;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igq implements AutoCloseable, elw {

    /* JADX INFO: renamed from: a */
    public final iha f30852a;

    /* JADX INFO: renamed from: d */
    private final int f30855d;

    /* JADX INFO: renamed from: e */
    private final View f30856e;

    /* JADX INFO: renamed from: f */
    private final boolean f30857f;

    /* JADX INFO: renamed from: g */
    private final boolean f30858g;

    /* JADX INFO: renamed from: i */
    private final igx f30860i;

    /* JADX INFO: renamed from: j */
    private Date f30861j;

    /* JADX INFO: renamed from: l */
    private final int f30863l;

    /* JADX INFO: renamed from: b */
    public List f30853b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f30859h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public Runnable f30854c = hde.f27307i;

    /* JADX INFO: renamed from: k */
    private boolean f30862k = false;

    /* JADX WARN: Code duplicated, block: B:22:0x00ca  */
    public igq(igx igxVar, View view, int i, View view2, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        view.getClass();
        view2.getClass();
        Context context = view2.getContext();
        iha ihaVar = new iha(context);
        ihaVar.setWillNotDraw(false);
        ihaVar.setLayerType(1, ihaVar.f30919b);
        ihaVar.setLayerType(1, ihaVar.f30920c);
        ihaVar.setOnClickListener(new iec(ihaVar, 4));
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(ihaVar.f30940w, jvh.m13557e(context.getMainLooper()));
        ihaVar.f30939v.add(new hri(displayManager, ihaVar, 18));
        this.f30852a = ihaVar;
        ihaVar.f30926i = view;
        ihaVar.f30923f = new PopupWindow(ihaVar);
        ihaVar.addView(view);
        int i7 = 2;
        if (m11294s(i)) {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int i8 = view2.getResources().getDisplayMetrics().heightPixels;
            int iM11295t = m11295t(view2);
            int i9 = iArr[1];
            if ((i9 > (i8 - i9) - iM11295t ? 1 : 2) == i) {
                i7 = i;
            } else if (i != 1) {
                i7 = 1;
            }
        } else {
            int iM11293r = m11293r(i, view2);
            int[] iArr2 = new int[2];
            view2.getLocationInWindow(iArr2);
            int i10 = view2.getResources().getDisplayMetrics().widthPixels;
            int iM11296u = m11296u(view2);
            int i11 = iArr2[0];
            if ((i11 > (i10 - i11) - iM11296u ? 5 : 6) != iM11293r) {
                i7 = i == 3 ? 4 : 3;
            } else {
                i7 = i;
            }
        }
        this.f30855d = i5;
        this.f30863l = i6;
        this.f30856e = view2;
        this.f30857f = z;
        this.f30858g = z2;
        this.f30860i = igxVar;
        ihaVar.f30928k = view2;
        View view3 = ihaVar.f30928k;
        if (view3 != null) {
            int[] iArr3 = ihaVar.f30918a;
            view3.getLocationOnScreen(iArr3);
            int i12 = iArr3[0];
            ihaVar.f30929l = new Rect(i12, iArr3[1], m11296u(view3) + i12, iArr3[1] + m11295t(view3));
        }
        ihaVar.f30927j = i7;
        ihaVar.f30930m = i2;
        ihaVar.f30931n = i3;
        ihaVar.f30932o = i4;
        ihaVar.m11320a();
    }

    /* JADX INFO: renamed from: r */
    static int m11293r(int i, View view) {
        int iM442c = afc.m442c(view);
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return iM442c != 1 ? 5 : 6;
            case 4:
                return iM442c != 1 ? 6 : 5;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: s */
    static boolean m11294s(int i) {
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: t */
    private static int m11295t(View view) {
        int height = view.getHeight();
        if (height != 0) {
            return height;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: u */
    private static int m11296u(View view) {
        int width = view.getWidth();
        if (width != 0) {
            return width;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return view.getMeasuredWidth();
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: a */
    public final int mo7492a() {
        return this.f30855d;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: b */
    public final ely mo7493b() {
        return ely.TOOLTIP;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo7494c() {
        return gmz.m9541i();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f30862k) {
            return;
        }
        this.f30862k = true;
        this.f30854c.run();
        this.f30852a.m11321b(false);
        this.f30852a.close();
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Runnable mo7495d() {
        return null;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: e */
    public final Date mo7496e() {
        return this.f30861j;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: f */
    public final void mo7497f(Runnable runnable) {
        throw new UnsupportedOperationException("Unsupported Operation delayedHide(Runnable) in: ".concat(String.valueOf(getClass().getName())));
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: g */
    public final void mo7498g() {
        this.f30852a.m11321b(true);
        if (this.f30859h.get()) {
            this.f30860i.mo11315a();
        }
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo7499h() {
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: i */
    public final void mo7500i(Date date) {
        this.f30861j = date;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // p000.elw
    /* JADX INFO: renamed from: j */
    public final void mo7501j() {
        Rect rect = new Rect();
        this.f30856e.getGlobalVisibleRect(rect);
        iha ihaVar = this.f30852a;
        ihaVar.f30929l = rect;
        ihaVar.setVisibility(0);
        PopupWindow popupWindow = ihaVar.f30923f;
        View view = ihaVar.f30928k;
        if (popupWindow != null && view != null) {
            popupWindow.setClippingEnabled(false);
            Fade fade = new Fade();
            fade.setDuration(ihaVar.f30936s);
            fade.setInterpolator(new akf());
            fade.setStartDelay(ihaVar.f30935r);
            popupWindow.setEnterTransition(fade);
            popupWindow.setBackgroundDrawable(new BitmapDrawable(view.getResources(), ""));
            popupWindow.setOutsideTouchable(ihaVar.f30924g);
            popupWindow.setTouchInterceptor(new cln(ihaVar, 18));
            popupWindow.setOnDismissListener(new dbd(ihaVar, 2));
            WeakReference weakReference = new WeakReference((Activity) view.getContext());
            view.post(new hri(ihaVar, weakReference, 16));
            view.postDelayed(new hri(ihaVar, weakReference, 17), ihaVar.f30935r);
        }
        List<igp> list = this.f30853b;
        iha ihaVar2 = this.f30852a;
        for (igp igpVar : list) {
            long j = igpVar.f30849a;
            if (j == 0) {
                igpVar.f30851c.execute(igpVar.f30850b);
            } else {
                ihaVar2.postDelayed(new hri(ihaVar2, igpVar, 11), j);
            }
        }
        this.f30859h.set(true);
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean mo7502k() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: l */
    public final boolean mo7503l() {
        return true;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: m */
    public final boolean mo7504m() {
        return this.f30858g;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: n */
    public final boolean mo7505n() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: o */
    public final boolean mo7506o() {
        return !this.f30857f;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: p */
    public final int mo7507p() {
        return this.f30863l;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo7508q(int i, boolean z, boolean z2, ilk ilkVar, hzj hzjVar) {
    }
}
