package p000;

import android.os.CountDownTimer;
import java.util.concurrent.TimeUnit;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eur extends fug {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eus f20135a;

    /* JADX INFO: renamed from: b */
    private final boolean f20136b;

    public eur(eus eusVar, boolean z) {
        this.f20135a = eusVar;
        this.f20136b = z;
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: a */
    public final void mo7883a() {
        this.f20135a.f20140B.m6078b();
        this.f20135a.m7913w(false);
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: b */
    public final void mo7884b(long j) {
        nbh nbhVar = eus.f20137b;
        if (this.f20135a.f20205w.m7101l() || this.f20136b) {
            eus eusVar = this.f20135a;
            jvd jvdVar = eusVar.f20188f;
            fek fekVar = eusVar.f20198p;
            fekVar.getClass();
            jvdVar.execute(new euj(fekVar, 9));
        }
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: d */
    public final void mo7886d(float f) {
        if (f == 0.0f) {
            this.f20135a.m7916z(false, this.f20136b);
        }
        this.f20135a.f20152N.m8272b(f);
        this.f20135a.f20201s.mo11195C((int) (100.0f * f));
        this.f20135a.f20190h.mo8588a();
        if (f == 1.0f) {
            this.f20135a.m7909B(false);
            this.f20135a.f20201s.mo11240l();
            CountDownTimer countDownTimer = this.f20135a.f20150L;
            if (countDownTimer != null) {
                countDownTimer.onFinish();
            }
        }
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: e */
    public final void mo7887e(float f, int i) {
        if (f == 0.0f) {
            this.f20135a.m7916z(true, true);
            this.f20135a.f20152N.m8273c();
        }
        fmi fmiVar = this.f20135a.f20196n;
        iiu iiuVar = fmiVar.f22559b;
        iiuVar.f31137i = i;
        int i2 = (int) (100.0f * f);
        iiuVar.m11389b(i2);
        if (i2 >= 100) {
            fmiVar.f22558a.f7299c = true;
        } else {
            fmiVar.f22558a.f7299c = false;
        }
        this.f20135a.f20201s.mo11195C(i2);
        this.f20135a.f20190h.mo8588a();
        if (f == 1.0f) {
            this.f20135a.f20152N.m8271a();
            this.f20135a.m7909B(true);
        }
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: f */
    public final void mo7888f(float f, long j) {
        boolean zM7101l = this.f20135a.f20205w.m7101l();
        if (f == 0.0f) {
            this.f20135a.m7916z(zM7101l, this.f20136b);
            if (zM7101l) {
                this.f20135a.f20140B.m6077a();
                this.f20135a.f20152N.m8273c();
                j += 500;
                this.f20135a.f20150L = new euq(this, j, TimeUnit.SECONDS.toMillis(1L), f);
                this.f20135a.f20150L.start();
            } else {
                this.f20135a.f20139A.m6093f(new eup(this, 0));
            }
        }
        int i = (int) (100.0f * f);
        this.f20135a.f20201s.mo11196D(i, j, zM7101l);
        if (zM7101l) {
            this.f20135a.f20196n.m8585f(i);
        } else {
            if (this.f20135a.f20139A.m6096k()) {
                this.f20135a.f20152N.m8272b(f);
            }
            if (this.f20135a.f20143E.mo16813g()) {
                eus eusVar = this.f20135a;
                if (eusVar.f20141C.f13306h) {
                    ((clc) eusVar.f20143E.mo16809c()).mo3893x(Duration.ofMillis(j), i);
                }
            }
        }
        this.f20135a.f20190h.mo8588a();
        if (f == 1.0f) {
            this.f20135a.m7909B(zM7101l);
            if (zM7101l) {
                this.f20135a.f20140B.m6078b();
                this.f20135a.f20152N.m8271a();
            } else {
                this.f20135a.f20159U.m9747l(j);
                this.f20135a.f20201s.mo11240l();
                this.f20135a.f20139A.m6092e();
            }
            CountDownTimer countDownTimer = this.f20135a.f20150L;
            if (countDownTimer != null) {
                countDownTimer.onFinish();
            }
        }
    }
}
