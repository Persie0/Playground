package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseArray;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avm {

    /* JADX INFO: renamed from: a */
    public final avf f2527a;

    /* JADX INFO: renamed from: b */
    public final int f2528b;

    /* JADX INFO: renamed from: c */
    public final View f2529c;

    /* JADX INFO: renamed from: d */
    public final boolean f2530d;

    /* JADX INFO: renamed from: f */
    public VelocityTracker f2532f;

    /* JADX INFO: renamed from: g */
    public boolean f2533g;

    /* JADX INFO: renamed from: h */
    public float f2534h;

    /* JADX INFO: renamed from: i */
    public float f2535i;

    /* JADX INFO: renamed from: j */
    public float f2536j;

    /* JADX INFO: renamed from: k */
    public float f2537k;

    /* JADX INFO: renamed from: l */
    public aiv f2538l;

    /* JADX INFO: renamed from: m */
    public aiv f2539m;

    /* JADX INFO: renamed from: n */
    private final SparseArray f2540n = new SparseArray();

    /* JADX INFO: renamed from: e */
    public final Paint f2531e = new Paint();

    public avm(Context context, avf avfVar) {
        this.f2527a = avfVar;
        boolean zIsScreenRound = avfVar.getResources().getConfiguration().isScreenRound();
        this.f2530d = zIsScreenRound;
        this.f2528b = Resources.getSystem().getDisplayMetrics().widthPixels;
        View view = new View(context);
        this.f2529c = view;
        m2056b(view, zIsScreenRound);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setBackgroundColor(-16777216);
    }

    /* JADX INFO: renamed from: b */
    public static void m2056b(View view, boolean z) {
        view.setOutlineProvider(new avl(z));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: a */
    public final aiv m2057a(float f, float f2, float f3, aiq aiqVar, aip aipVar) {
        aiv aivVar = new aiv(new gtx(), (byte[]) null);
        aivVar.m785i(f);
        aivVar.f456p = 0.5f;
        aiw aiwVar = new aiw();
        aiwVar.m792d(f2);
        aiwVar.m791c(1.0f);
        aiwVar.m793e(600.0f);
        aivVar.m784h();
        aivVar.f454n = this.f2528b;
        aivVar.f448h = f3;
        aivVar.f461q = aiwVar;
        aivVar.m783g(aiqVar);
        aivVar.m782f(aipVar);
        aivVar.mo780d();
        return aivVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m2058c(float f) {
        int width = this.f2527a.getWidth();
        this.f2534h = f;
        float f2 = 1.0f - ((f + f) / width);
        this.f2535i = f2;
        float fMax = Math.max(0.7f, Math.min(f2, 1.0f));
        this.f2535i = fMax;
        float f3 = (fMax - 1.0f) / (-0.3f);
        float f4 = this.f2536j;
        if (f3 > f4) {
            this.f2536j = f3;
        } else {
            f3 = f4;
        }
        this.f2537k = Math.min(0.3f, f3 / 2.0f);
        m2060e();
    }

    /* JADX INFO: renamed from: d */
    public final void m2059d() {
        this.f2533g = false;
        this.f2534h = 0.0f;
        this.f2536j = 0.0f;
        this.f2535i = 1.0f;
        this.f2527a.setTranslationX(0.0f);
        this.f2527a.setScaleX(1.0f);
        this.f2527a.setScaleY(1.0f);
        this.f2527a.setAlpha(1.0f);
        this.f2529c.setAlpha(0.0f);
        this.f2531e.setColorFilter(null);
        this.f2527a.setLayerType(0, null);
        this.f2527a.setClipToOutline(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m2060e() {
        this.f2527a.setScaleX(this.f2535i);
        this.f2527a.setScaleY(this.f2535i);
        this.f2527a.setTranslationX(this.f2534h);
        Paint paint = this.f2531e;
        int iMax = (int) (Math.max(0.0f, Math.min(1.0f, this.f2537k)) * 255.0f);
        int iArgb = Color.argb(iMax, 0, 0, 0);
        ColorFilter porterDuffColorFilter = (ColorFilter) this.f2540n.get(iMax);
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(iArgb, PorterDuff.Mode.SRC_ATOP);
            this.f2540n.put(iMax, porterDuffColorFilter);
        }
        paint.setColorFilter(porterDuffColorFilter);
        this.f2527a.setLayerPaint(this.f2531e);
        this.f2529c.setAlpha((1.0f - this.f2536j) * 0.5f);
    }
}
