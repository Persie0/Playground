package p000;

import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class erz implements ciw {

    /* JADX INFO: renamed from: a */
    public final nps f15283a;

    /* JADX INFO: renamed from: b */
    private final oju f15284b;

    /* JADX INFO: renamed from: c */
    private final oju f15285c;

    /* JADX INFO: renamed from: d */
    private final oju f15286d;

    /* JADX INFO: renamed from: e */
    private final oju f15287e;

    /* JADX INFO: renamed from: f */
    private final oju f15288f;

    /* JADX INFO: renamed from: g */
    private final ohb f15289g;

    /* JADX INFO: renamed from: h */
    private final jvd f15290h;

    /* JADX INFO: renamed from: i */
    private final Executor f15291i;

    /* JADX INFO: renamed from: j */
    private final AtomicBoolean f15292j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    private final kbz f15293k;

    /* JADX INFO: renamed from: l */
    private final kbo f15294l;

    /* JADX INFO: renamed from: m */
    private final htf f15295m;

    /* JADX INFO: renamed from: n */
    private nps f15296n;

    /* JADX INFO: renamed from: o */
    private final khb f15297o;

    /* JADX INFO: renamed from: p */
    private final cwd f15298p;

    public erz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, ohb ohbVar, jvd jvdVar, Executor executor, nps npsVar, kbn kbnVar, khb khbVar, cwd cwdVar, kbz kbzVar, htf htfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f15284b = ojuVar;
        this.f15285c = ojuVar2;
        this.f15289g = ohbVar;
        this.f15290h = jvdVar;
        this.f15291i = executor;
        this.f15283a = npsVar;
        this.f15297o = khbVar;
        this.f15298p = cwdVar;
        this.f15293k = kbzVar;
        this.f15295m = htfVar;
        this.f15286d = ojuVar3;
        this.f15287e = ojuVar4;
        this.f15288f = ojuVar5;
        this.f15294l = kbnVar.mo6314a("ActivityUiStartup");
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() {
        if (this.f15292j.getAndSet(true)) {
            return this.f15296n;
        }
        this.f15293k.mo13961e("ActivityUiStartup");
        jvd jvdVar = this.f15290h;
        ohb ohbVar = this.f15289g;
        ohbVar.getClass();
        jvdVar.execute(new elu(ohbVar, 20));
        this.f15295m.mo10735c();
        doy doyVar = new doy(this, 2);
        civ civVarM3812a = civ.m3812a(this.f15291i);
        civVarM3812a.f5903d = this.f15297o;
        civVarM3812a.f5901b = this.f15293k;
        civVarM3812a.f5902c = this.f15294l;
        civVarM3812a.m3814c(cwd.m5637A(this.f15284b), aJFPpVSaoDO.qVCAYcz);
        civVarM3812a.m3815d(cwd.m5644z(this.f15286d), "WiringStartup");
        civVarM3812a.m3814c(cwd.m5637A(this.f15285c), "CameraActivityController");
        civVarM3812a.m3814c(doyVar, "Interactivity");
        civVarM3812a.m3815d(this.f15298p.m5645B(this.f15287e), "ShotStartup");
        civVarM3812a.m3815d(this.f15298p.m5645B(this.f15288f), "SmartsStartup");
        this.f15296n = civVarM3812a.m3813b();
        this.f15293k.mo13964h();
        this.f15293k.mo13962f();
        return this.f15296n;
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3539c() {
        return dez.m6039i(this);
    }
}
