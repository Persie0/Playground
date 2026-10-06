package p000;

import android.os.CountDownTimer;
import com.google.android.apps.camera.p014ui.views.CountdownSnapSlider;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hxh extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    long f29795a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f29796b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ double f29797c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ hxk f29798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxh(hxk hxkVar, long j, long j2, double d) {
        super(j, 25L);
        this.f29798d = hxkVar;
        this.f29796b = j2;
        this.f29797c = d;
        double d2 = j2;
        Double.isNaN(d2);
        this.f29795a = (long) Math.ceil(d2 / 1000.0d);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        hxk hxkVar = this.f29798d;
        hxkVar.f29805c.m4351k(hxkVar.m10813b(Duration.ZERO));
        this.f29798d.f29805c.m4358s(false, 200L);
        hxk hxkVar2 = this.f29798d;
        hxkVar2.m10828q(hxkVar2.f29806d.m4442c(), this.f29797c, 250L, new akf(), this.f29798d.m10827p(this.f29797c, 1), 200L, 1);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        double d = j;
        Double.isNaN(d);
        long jCeil = (long) Math.ceil(d / 1000.0d);
        if (jCeil != this.f29795a) {
            hxk hxkVar = this.f29798d;
            hxkVar.f29805c.m4351k(hxkVar.m10813b(Duration.ofSeconds(jCeil)));
            this.f29798d.f29805c.announceForAccessibility(Long.toString(jCeil));
            this.f29795a = jCeil;
        }
        hxk hxkVar2 = this.f29798d;
        long j2 = this.f29796b;
        double d2 = this.f29797c;
        double d3 = j2;
        ilb ilbVar = hxkVar2.f29804b;
        Double.isNaN(d);
        Double.isNaN(d3);
        double d4 = d / d3;
        double interpolation = ilbVar.getInterpolation((float) (1.0d - d4));
        Double.isNaN(interpolation);
        double dMin = Math.min(d4 * d2, (1.0d - interpolation) * d2);
        hxk hxkVar3 = this.f29798d;
        hxkVar3.f29805c.m4353m(hxkVar3.f29806d.m4440a(dMin));
        double d5 = this.f29796b - j;
        Double.isNaN(d5);
        double dMin2 = Math.min(d5 / 200.0d, 1.0d);
        CountdownSnapSlider countdownSnapSlider = this.f29798d.f29806d;
        countdownSnapSlider.f7204e = dMin2;
        countdownSnapSlider.m4444e(dMin);
    }
}
