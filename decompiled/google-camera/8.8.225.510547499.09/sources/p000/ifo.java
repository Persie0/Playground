package p000;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.p014ui.captureframe.CaptureFrameUi;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ifo implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30670a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f30671b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f30672c;

    public /* synthetic */ ifo(AppBarLayout appBarLayout, mkx mkxVar, int i) {
        this.f30672c = i;
        this.f30670a = appBarLayout;
        this.f30671b = mkxVar;
    }

    public /* synthetic */ ifo(htb htbVar, CaptureFrameUi captureFrameUi, int i) {
        this.f30672c = i;
        this.f30671b = htbVar;
        this.f30670a = captureFrameUi;
    }

    public /* synthetic */ ifo(iga igaVar, BiFunction biFunction, int i) {
        this.f30672c = i;
        this.f30670a = igaVar;
        this.f30671b = biFunction;
    }

    public /* synthetic */ ifo(itx itxVar, FrameLayout.LayoutParams layoutParams, int i) {
        this.f30672c = i;
        this.f30671b = itxVar;
        this.f30670a = layoutParams;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.function.BiFunction] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iArgb;
        switch (this.f30672c) {
            case 0:
                return;
            case 1:
                Object obj = this.f30671b;
                Object obj2 = this.f30670a;
                synchronized (((htb) obj).f29485a) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int iM10732a = ((htd) ((htb) obj).f29487c).m10732a();
                    Object obj3 = ((htb) obj).f29487c;
                    int iArgb2 = Color.argb(iM10732a, ((htd) obj3).f29495e, ((htd) obj3).f29496f, ((htd) obj3).f29497g);
                    if (((htd) ((htb) obj).f29488d).equals(htd.HIDDEN)) {
                        int iM10732a2 = ((htd) ((htb) obj).f29488d).m10732a();
                        Object obj4 = ((htb) obj).f29487c;
                        iArgb = Color.argb(iM10732a2, ((htd) obj4).f29495e, ((htd) obj4).f29496f, ((htd) obj4).f29497g);
                    } else {
                        int iM10732a3 = ((htd) ((htb) obj).f29488d).m10732a();
                        Object obj5 = ((htb) obj).f29488d;
                        iArgb = Color.argb(iM10732a3, ((htd) obj5).f29495e, ((htd) obj5).f29496f, ((htd) obj5).f29497g);
                    }
                    float f = 1.0f - fFloatValue;
                    ((CaptureFrameUi) obj2).f6994b.setColor(Color.argb((int) ((Color.alpha(iArgb2) * f) + (Color.alpha(iArgb) * fFloatValue)), (int) ((Color.red(iArgb2) * f) + (Color.red(iArgb) * fFloatValue)), (int) ((Color.green(iArgb2) * f) + (Color.green(iArgb) * fFloatValue)), (int) ((Color.blue(iArgb2) * f) + (Color.blue(iArgb) * fFloatValue))));
                    ((CaptureFrameUi) obj2).invalidate();
                    break;
                }
                return;
            case 2:
                Object obj6 = this.f30671b;
                Object obj7 = this.f30670a;
                ((FrameLayout.LayoutParams) obj7).leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((itx) obj6).f32207s.m4566n().setLayoutParams((ViewGroup.LayoutParams) obj7);
                return;
            case 3:
                Object obj8 = this.f30670a;
                Object obj9 = this.f30671b;
                int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mkx mkxVar = (mkx) obj9;
                mkxVar.setAlpha(iFloatValue);
                for (mge mgeVar : ((AppBarLayout) obj8).f8004f) {
                    if (mkxVar.m16575e() != null) {
                        mkxVar.m16575e().withAlpha(iFloatValue).getDefaultColor();
                        mgeVar.m16350a();
                    }
                }
                return;
            default:
                Object obj10 = this.f30670a;
                Object obj11 = this.f30671b;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((mkx) obj11).m16578h(fFloatValue2);
                AppBarLayout appBarLayout = (AppBarLayout) obj10;
                Drawable drawable = appBarLayout.f8005g;
                if (drawable instanceof mkx) {
                    ((mkx) drawable).m16578h(fFloatValue2);
                }
                Iterator it = appBarLayout.f8004f.iterator();
                while (it.hasNext()) {
                    ((mge) it.next()).m16350a();
                }
                return;
        }
    }
}
