package p000;

import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hig implements kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f27896a = nbh.m17259h("com/google/android/apps/camera/speechenhancer/SpeechEnhancerAudioProcessor");

    /* JADX INFO: renamed from: b */
    public final crx f27897b;

    /* JADX INFO: renamed from: c */
    public final hiw f27898c;

    /* JADX INFO: renamed from: d */
    public final int f27899d;

    /* JADX INFO: renamed from: e */
    public final int f27900e;

    /* JADX INFO: renamed from: f */
    public AmbientMode.AmbientController f27901f;

    /* JADX INFO: renamed from: g */
    private final jvb f27902g;

    public hig(hiw hiwVar, int i, int i2, crx crxVar) {
        this.f27898c = hiwVar;
        this.f27900e = i;
        this.f27899d = i2;
        this.f27897b = crxVar;
        jvb jvbVar = new jvb();
        this.f27902g = jvbVar;
        jvbVar.m13537d(hiwVar.mo10345a(new hif(this)));
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f27902g.close();
    }
}
