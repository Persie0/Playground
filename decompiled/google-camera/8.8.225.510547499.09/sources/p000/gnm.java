package p000;

import com.google.googlex.gcam.BurstSpec;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnm implements ech, edi {

    /* JADX INFO: renamed from: a */
    public static final nbh f25752a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/OnDemandPreviewProcessor");

    /* JADX INFO: renamed from: b */
    public final ohb f25753b;

    /* JADX INFO: renamed from: c */
    public final kbc f25754c;

    /* JADX INFO: renamed from: d */
    public final inm f25755d;

    /* JADX INFO: renamed from: e */
    public final dhv f25756e;

    /* JADX INFO: renamed from: f */
    public final jwn f25757f;

    /* JADX INFO: renamed from: g */
    public long f25758g;

    /* JADX INFO: renamed from: h */
    public int f25759h;

    /* JADX INFO: renamed from: i */
    public int f25760i;

    /* JADX INFO: renamed from: j */
    public boolean f25761j;

    /* JADX INFO: renamed from: k */
    public final fvu f25762k;

    /* JADX INFO: renamed from: l */
    public ebn f25763l;

    /* JADX INFO: renamed from: m */
    public final gva f25764m;

    /* JADX INFO: renamed from: n */
    private final Executor f25765n;

    /* JADX INFO: renamed from: o */
    private boolean f25766o;

    /* JADX INFO: renamed from: p */
    private final gkz f25767p;

    /* JADX INFO: renamed from: q */
    private final bko f25768q;

    public gnm(ohb ohbVar, kbc kbcVar, gkz gkzVar, gva gvaVar, fvu fvuVar, Executor executor, bko bkoVar, inm inmVar, dhv dhvVar, jwn jwnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25753b = ohbVar;
        this.f25754c = kbcVar;
        this.f25767p = gkzVar;
        this.f25764m = gvaVar;
        this.f25762k = fvuVar;
        this.f25765n = executor;
        this.f25768q = bkoVar;
        this.f25755d = inmVar;
        this.f25756e = dhvVar;
        this.f25757f = jwnVar;
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7057b(eem eemVar, hkc hkcVar, ebp ebpVar) {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [gyh, java.lang.Object] */
    @Override // p000.edi
    /* JADX INFO: renamed from: c */
    public final void mo7058c(eem eemVar, edc edcVar) {
        mo7111d(eemVar.f13675v.f25502c.mo9902h());
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: d */
    public final synchronized void mo7111d(gyu gyuVar) {
        this.f25761j = false;
        this.f25766o = false;
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: f */
    public final void mo7113f(eem eemVar, BurstSpec burstSpec, kpp kppVar) {
        this.f25763l = this.f25767p.m9396a();
        if (burstSpec != null) {
            this.f25759h = (int) burstSpec.m4911b().m4967a();
            this.f25760i = 0;
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: g */
    public final void mo7114g(gyu gyuVar) {
        this.f25768q.m2622p(gyuVar).m7226f(this);
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: h */
    public final synchronized void mo7115h(eem eemVar) {
        this.f25761j = false;
        this.f25766o = false;
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo7116i(eem eemVar) {
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m9559j(long j) {
        this.f25761j = true;
        this.f25758g = j;
        if (j >= 30000) {
            this.f25766o = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m9560k(eem eemVar) {
        if (this.f25761j) {
            this.f25765n.execute(new fro(this, eemVar, 20));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [gyh, java.lang.Object] */
    @Override // p000.edi
    /* JADX INFO: renamed from: p */
    public final void mo7059p(eem eemVar) {
        mo7111d(eemVar.f13675v.f25502c.mo9902h());
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: e */
    public final synchronized void mo7112e(eem eemVar, key keyVar) {
        this.f25760i++;
        if (this.f25761j && this.f25766o) {
            this.f25765n.execute(new ghc(this, eemVar, keyVar, 4));
        } else {
            keyVar.close();
        }
    }
}
