package p000;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.cuttlefish.CountdownSliderUi;
import com.google.android.apps.camera.p014ui.views.CountdownSnapSlider;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxk implements hxn {

    /* JADX INFO: renamed from: c */
    public CountdownSliderUi f29805c;

    /* JADX INFO: renamed from: d */
    public CountdownSnapSlider f29806d;

    /* JADX INFO: renamed from: h */
    private final hah f29810h;

    /* JADX INFO: renamed from: i */
    private String f29811i;

    /* JADX INFO: renamed from: j */
    private String f29812j;

    /* JADX INFO: renamed from: k */
    private String f29813k;

    /* JADX INFO: renamed from: l */
    private Resources f29814l;

    /* JADX INFO: renamed from: m */
    private ValueAnimator f29815m;

    /* JADX INFO: renamed from: n */
    private CountDownTimer f29816n;

    /* JADX INFO: renamed from: o */
    private final npk f29817o;

    /* JADX INFO: renamed from: g */
    private final jvb f29809g = new jvb();

    /* JADX INFO: renamed from: e */
    public boolean f29807e = false;

    /* JADX INFO: renamed from: f */
    public Duration f29808f = Duration.ZERO;

    /* JADX INFO: renamed from: a */
    public final Set f29803a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final ilb f29804b = new ilb();

    public hxk(hah hahVar, npk npkVar, byte[] bArr) {
        this.f29817o = npkVar;
        this.f29810h = hahVar;
    }

    /* JADX INFO: renamed from: A */
    private final void m10806A(final View view) {
        final int i;
        if (view.equals(this.f29805c.m4345e())) {
            i = 2;
        } else {
            i = view.equals(this.f29805c.m4346f()) ? 0 : 1;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: hxe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hxk hxkVar = this.f29786a;
                View view3 = view;
                int i2 = i;
                double d = hxkVar.f29806d.f7205f;
                if (hxkVar.f29805c.f7009i.contains(view3)) {
                    return;
                }
                double d2 = i2;
                if (d != d2) {
                    hxkVar.m10818g();
                    hxkVar.f29806d.setEnabled(false);
                    hxkVar.m10828q(d, d2, 200L, new akf(), hxkVar.m10827p(d2, 2), 0L, 2);
                }
            }
        });
    }

    /* JADX INFO: renamed from: B */
    private final void m10807B(Duration duration, String str, boolean z) {
        if (z || this.f29806d.isEnabled()) {
            this.f29808f = duration;
            m10824m(true);
            this.f29805c.m4351k(str);
        }
    }

    /* JADX INFO: renamed from: C */
    private static final long m10808C(Duration duration) {
        return (long) Math.ceil(duration.isZero() ? 0.0f : duration.toMillis() / 1000.0f);
    }

    /* JADX INFO: renamed from: D */
    private static final int m10809D(int i) {
        switch (i - 1) {
            case 0:
                return 0;
            case 1:
            default:
                return 1;
            case 2:
                return 2;
        }
    }

    /* JADX INFO: renamed from: E */
    private final View m10810E() {
        return this.f29805c.m4346f();
    }

    /* JADX INFO: renamed from: u */
    public static final int m10811u(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            default:
                return 2;
            case 2:
                return 3;
        }
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: a */
    public final ilk mo10812a() {
        return this.f29805c.f7002b;
    }

    /* JADX INFO: renamed from: b */
    public final String m10813b(Duration duration) {
        long jM10808C = m10808C(duration);
        if (jM10808C >= 0) {
            return this.f29805c.getResources().getString(C0100R.string.time_remaining, Long.valueOf(jM10808C));
        }
        throw new IllegalArgumentException(rgoX.oMHEXx);
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: c */
    public final void mo10814c(Duration duration) {
        m10807B(duration, m10813b(duration), true);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f29809g.close();
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: d */
    public final void mo10815d(boolean z) {
        CountdownSliderUi countdownSliderUi = this.f29805c;
        AnimatorSet animatorSet = countdownSliderUi.f7006f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            countdownSliderUi.m4348h(false);
        } else {
            countdownSliderUi.setAlpha(0.0f);
            countdownSliderUi.setVisibility(4);
        }
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: e */
    public final void mo10816e(View view, Context context) {
        this.f29805c = (CountdownSliderUi) view;
        this.f29814l = context.getResources();
        CountdownSnapSlider countdownSnapSliderM4347g = this.f29805c.m4347g();
        this.f29806d = countdownSnapSliderM4347g;
        countdownSnapSliderM4347g.m4448i();
        this.f29806d.setAccessibilityDelegate(new hxj());
        TextView textViewM4346f = this.f29805c.m4346f();
        TextView textViewM4345e = this.f29805c.m4345e();
        textViewM4346f.setTextColor(jzn.m13800C(this.f29805c));
        textViewM4345e.setTextColor(jzn.m13800C(this.f29805c));
        m10806A(textViewM4346f);
        m10806A(this.f29805c.m4343c());
        m10806A(textViewM4345e);
        this.f29806d.f7206g = new hxf(this);
        this.f29809g.m13537d(new hcu(this, 10));
        this.f29806d.setOnSeekBarChangeListener(new hxg(this, 0));
        this.f29811i = this.f29814l.getString(C0100R.string.off_pos_desc);
        this.f29812j = this.f29814l.getString(C0100R.string.auto_pos_desc);
        this.f29813k = this.f29814l.getString(C0100R.string.max_pos_desc);
        m10824m(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m10817f() {
        Iterator it = this.f29803a.iterator();
        while (it.hasNext()) {
            ((ckw) ((AmbientMode.AmbientController) it.next()).f1697a).m3888s();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10818g() {
        Iterator it = this.f29803a.iterator();
        while (it.hasNext()) {
            ((ckw) ((AmbientMode.AmbientController) it.next()).f1697a).m3872c();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10819h() {
        this.f29817o.m17610g(VibrationEffect.startComposition().addPrimitive(1, 0.5f).compose());
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: i */
    public final void mo10820i(boolean z) {
        this.f29806d.setEnabled(z);
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: j */
    public final void mo10821j() {
        this.f29807e = true;
        m10818g();
        this.f29806d.setEnabled(false);
        this.f29805c.m4352l(false, true);
        this.f29805c.m4358s(true, 0L);
        double dM4442c = this.f29806d.m4442c();
        long millis = this.f29808f.toMillis();
        hxh hxhVar = new hxh(this, millis, millis, dM4442c);
        this.f29816n = hxhVar;
        hxhVar.start();
        this.f29805c.announceForAccessibility(this.f29814l.getString(C0100R.string.start_countdown_announce_desc, Long.valueOf(m10808C(this.f29808f))));
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: k */
    public final void mo10822k(Duration duration) {
        mo10823l(duration, m10813b(duration));
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: l */
    public final void mo10823l(Duration duration, String str) {
        m10807B(duration, str, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m10824m(boolean z) {
        String string;
        int progress = this.f29806d.getProgress();
        if (!z) {
            switch (progress) {
                case 0:
                    string = this.f29811i;
                    break;
                case 1:
                default:
                    string = this.f29812j;
                    break;
                case 2:
                    string = this.f29813k;
                    break;
            }
        } else {
            long jM10808C = m10808C(this.f29808f);
            switch (progress) {
                case 0:
                    string = this.f29814l.getString(C0100R.string.off_pos_desc_full, Long.valueOf(jM10808C));
                    break;
                case 1:
                default:
                    string = this.f29814l.getString(C0100R.string.auto_pos_desc_full, Long.valueOf(jM10808C));
                    break;
                case 2:
                    string = this.f29814l.getString(C0100R.string.max_pos_desc_full, Long.valueOf(jM10808C));
                    break;
            }
        }
        if (string.equals(String.valueOf(this.f29806d.getContentDescription()))) {
            return;
        }
        this.f29806d.setContentDescription(string);
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: n */
    public final boolean mo10825n() {
        return this.f29807e;
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: o */
    public final boolean mo10826o() {
        return this.f29805c.getVisibility() == 0;
    }

    @Override // p000.hze
    public final void onLayoutUpdated(hzj hzjVar, ilk ilkVar) {
        this.f29805c.m4349i(hzjVar, ilkVar);
    }

    @Override // p000.hze
    public final /* synthetic */ void onLayoutUpdated(ilk ilkVar) {
    }

    /* JADX INFO: renamed from: p */
    public final AnimatorListenerAdapter m10827p(double d, int i) {
        return new hxi(this, d, i);
    }

    /* JADX INFO: renamed from: q */
    public final void m10828q(double d, double d2, long j, TimeInterpolator timeInterpolator, AnimatorListenerAdapter animatorListenerAdapter, long j2, int i) {
        ValueAnimator valueAnimator = this.f29815m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((float) d, (float) d2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setStartDelay(j2);
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ibn(this, i, 1));
        valueAnimatorOfFloat.addListener(animatorListenerAdapter);
        valueAnimatorOfFloat.start();
        this.f29815m = valueAnimatorOfFloat;
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: r */
    public final void mo10829r(int i, boolean z, boolean z2) {
        CountDownTimer countDownTimer = this.f29816n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            double dM10809D = m10809D(i);
            if (z) {
                AnimatorListenerAdapter animatorListenerAdapterM10827p = m10827p(dM10809D, 1);
                this.f29805c.m4358s(false, 200L);
                if (z2) {
                    this.f29805c.m4351k(m10813b(Duration.ZERO));
                }
                m10828q(this.f29806d.f7205f, dM10809D, 250L, new akf(), animatorListenerAdapterM10827p, 200L, 1);
                return;
            }
            this.f29806d.m4444e(dM10809D);
            this.f29806d.setEnabled(true);
            this.f29805c.m4352l(true, false);
            this.f29807e = false;
            m10817f();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m10830s(int i) {
        for (AmbientMode.AmbientController ambientController : this.f29803a) {
            boolean zBooleanValue = ((Boolean) ((jwf) ((ckw) ambientController.f1697a).f6045d).f34942d).booleanValue();
            ilk ilkVar = ilk.PORTRAIT;
            int i2 = i - 1;
            ikw ikwVar = ikw.UNINITIALIZED;
            int i3 = 2;
            switch (i2) {
                case 0:
                    if (((ckw) ambientController.f1697a).f6060s.equals(ikw.LONG_EXPOSURE)) {
                        throw new IllegalArgumentException("OFF option should never be selected for long exposure.");
                    }
                    ((ckw) ambientController.f1697a).f6045d.mo3415bf(false);
                    break;
                    break;
                default:
                    ((ckw) ambientController.f1697a).f6045d.mo3415bf(true);
                    ((ckw) ambientController.f1697a).f6054m.mo3415bf(i == 2 ? cle.AUTO : cle.MAX);
                    break;
            }
            ckw ckwVar = (ckw) ambientController.f1697a;
            fcp fcpVar = ckwVar.f6047f;
            if (fcpVar != null) {
                switch (i2) {
                    case 0:
                        break;
                    case 1:
                        i3 = 3;
                        break;
                    default:
                        i3 = 4;
                        break;
                }
                fcpVar.mo8168am(i3, ((Float) ckwVar.f6048g.mo3831be()).floatValue(), ckwVar.f6060s);
            }
            if (zBooleanValue != ((Boolean) ((jwf) ((ckw) ambientController.f1697a).f6045d).f34942d).booleanValue()) {
                ckw ckwVar2 = (ckw) ambientController.f1697a;
                ckwVar2.m3869G(((Boolean) ((jwf) ckwVar2.f6045d).f34942d).booleanValue(), 4);
            }
        }
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: t */
    public final void mo10831t(int i) {
        if (this.f29806d.isEnabled()) {
            double dM10809D = m10809D(i);
            this.f29806d.m4444e(dM10809D);
            this.f29806d.setProgress((int) dM10809D);
            CountdownSliderUi countdownSliderUi = this.f29805c;
            CountdownSnapSlider countdownSnapSlider = this.f29806d;
            countdownSliderUi.m4354n(countdownSnapSlider.m4440a(countdownSnapSlider.m4442c()));
        }
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: v */
    public final void mo10832v(boolean z) {
        ImageView imageViewM4341a;
        ImageView imageViewM4342b;
        if (this.f29805c.m4357q()) {
            imageViewM4341a = this.f29805c.m4342b();
            imageViewM4342b = this.f29805c.m4341a();
        } else {
            imageViewM4341a = this.f29805c.m4341a();
            imageViewM4342b = this.f29805c.m4342b();
        }
        CountdownSliderUi countdownSliderUi = this.f29805c;
        FrameLayout frameLayout = (FrameLayout) countdownSliderUi.getRootView().findViewById(C0100R.id.viewfinder_frame);
        int[] iArrM11435f = ill.m11435f(countdownSliderUi.f7001a);
        int i = (jvh.m13571s(new PointF((float) iArrM11435f[0], (float) iArrM11435f[1]), frameLayout) || ((Boolean) this.f29810h.mo10031c(gzy.f27062u)).booleanValue()) ? 0 : 8;
        imageViewM4341a.setVisibility(i);
        imageViewM4341a.setAlpha(1.0f);
        imageViewM4342b.setVisibility(8);
        imageViewM4342b.setAlpha(0.0f);
        CountdownSliderUi countdownSliderUi2 = this.f29805c;
        AnimatorSet animatorSet = countdownSliderUi2.f7006f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        countdownSliderUi2.m4356p();
        countdownSliderUi2.m4348h(true);
        if (!z) {
            countdownSliderUi2.m4352l(false, false);
        } else {
            CountdownSnapSlider countdownSnapSlider = countdownSliderUi2.f7001a;
            countdownSliderUi2.m4354n(countdownSnapSlider.m4440a(countdownSnapSlider.m4442c()));
        }
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: x */
    public final void mo10834x() {
        CountdownSnapSlider countdownSnapSlider = this.f29806d;
        Set set = countdownSnapSlider.f7200a;
        int iM10809D = m10809D(1);
        set.remove(Integer.valueOf(iM10809D));
        double dM4442c = countdownSnapSlider.m4442c();
        countdownSnapSlider.f7205f = dM4442c;
        countdownSnapSlider.setProgress((int) dM4442c);
        if (iM10809D == 0) {
            countdownSnapSlider.f7202c = 0.0d;
        } else if (iM10809D == countdownSnapSlider.m4443d()) {
            countdownSnapSlider.f7203d = countdownSnapSlider.m4443d();
        }
        this.f29805c.f7009i.remove(m10810E());
        CountdownSliderUi countdownSliderUi = this.f29805c;
        CountdownSnapSlider countdownSnapSlider2 = this.f29806d;
        countdownSliderUi.m4355o(countdownSnapSlider2.m4440a(countdownSnapSlider2.m4442c()), 1.0f);
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: y */
    public final void mo10835y(AmbientMode.AmbientController ambientController) {
        this.f29803a.add(ambientController);
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: z */
    public final void mo10836z(AmbientMode.AmbientController ambientController) {
        this.f29803a.remove(ambientController);
    }

    @Override // p000.hxn
    /* JADX INFO: renamed from: w */
    public final void mo10833w() {
        ImageView imageViewM4342b;
        float f;
        CountdownSnapSlider countdownSnapSlider = this.f29806d;
        int i = countdownSnapSlider.f7201b;
        int iM10809D = m10809D(1);
        if (iM10809D >= i) {
            throw new IllegalArgumentException("Not a valid primary tick.");
        }
        countdownSnapSlider.f7200a.add(Integer.valueOf(iM10809D));
        double dM4442c = countdownSnapSlider.m4442c();
        countdownSnapSlider.f7205f = dM4442c;
        countdownSnapSlider.setProgress((int) dM4442c);
        if (iM10809D == 0) {
            countdownSnapSlider.f7202c = 1.0d;
        } else if (iM10809D == countdownSnapSlider.m4443d()) {
            countdownSnapSlider.f7203d = countdownSnapSlider.m4443d() - 1;
        }
        CountdownSliderUi countdownSliderUi = this.f29805c;
        View viewM10810E = m10810E();
        countdownSliderUi.f7009i.add(viewM10810E);
        if (viewM10810E != countdownSliderUi.m4346f()) {
            if (viewM10810E == countdownSliderUi.m4345e()) {
                imageViewM4342b = countdownSliderUi.m4342b();
                f = -countdownSliderUi.f7008h;
            }
            CountdownSliderUi countdownSliderUi2 = this.f29805c;
            CountdownSnapSlider countdownSnapSlider2 = this.f29806d;
            countdownSliderUi2.m4354n(countdownSnapSlider2.m4440a(countdownSnapSlider2.m4442c()));
        }
        imageViewM4342b = countdownSliderUi.m4342b();
        f = countdownSliderUi.f7008h;
        CountdownSliderUi.m4333r(imageViewM4342b, (int) (f / 2.0f));
        CountdownSliderUi countdownSliderUi3 = this.f29805c;
        CountdownSnapSlider countdownSnapSlider3 = this.f29806d;
        countdownSliderUi3.m4354n(countdownSnapSlider3.m4440a(countdownSnapSlider3.m4442c()));
    }
}
