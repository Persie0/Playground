package p000;

import android.content.Context;
import android.os.CountDownTimer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdl extends icz implements kba {

    /* JADX INFO: renamed from: a */
    public final jvd f21442a;

    /* JADX INFO: renamed from: b */
    public final List f21443b;

    /* JADX INFO: renamed from: c */
    public idb f21444c;

    /* JADX INFO: renamed from: d */
    public idb f21445d;

    /* JADX INFO: renamed from: e */
    public idb f21446e;

    /* JADX INFO: renamed from: f */
    public idb f21447f;

    /* JADX INFO: renamed from: g */
    public final nps f21448g;

    /* JADX INFO: renamed from: k */
    private final hsk f21449k;

    /* JADX INFO: renamed from: l */
    private CountDownTimer f21450l;

    public fdl(Context context, jvd jvdVar, nps npsVar, hsk hskVar) {
        super(context);
        this.f21443b = new ArrayList();
        this.f21442a = jvdVar;
        this.f21448g = npsVar;
        this.f21449k = hskVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m8271a() {
        CountDownTimer countDownTimer = this.f21450l;
        if (countDownTimer != null) {
            countDownTimer.onFinish();
            this.f21450l.cancel();
        }
        m11104f();
    }

    /* JADX INFO: renamed from: b */
    public final void m8272b(float f) {
        if (f == 0.0f) {
            m11105g(this.f21446e);
        } else if (f == 1.0f) {
            m11104f();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8273c() {
        cet cetVar = (cet) jvh.m13560h(this.f21448g);
        if (cetVar != null) {
            cetVar.mo3576b();
        }
        hsk hskVar = this.f21449k;
        if (!hskVar.f29411b.get() || hskVar.f29410a.get() || !hskVar.f29413d.get() || hskVar.f29412c.get()) {
            this.f21449k.m10698c();
        }
        fdk fdkVar = new fdk(this);
        this.f21450l = fdkVar;
        fdkVar.start();
    }
}
