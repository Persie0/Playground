package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fna {

    /* JADX INFO: renamed from: a */
    public int f22764a;

    /* JADX INFO: renamed from: b */
    public int f22765b;

    /* JADX INFO: renamed from: c */
    public int f22766c;

    /* JADX INFO: renamed from: d */
    public boolean f22767d;

    /* JADX INFO: renamed from: e */
    public hyd f22768e;

    /* JADX INFO: renamed from: f */
    private final boolean f22769f;

    /* JADX INFO: renamed from: g */
    private final iid f22770g;

    /* JADX INFO: renamed from: h */
    private final hah f22771h;

    /* JADX INFO: renamed from: i */
    private final jvd f22772i;

    /* JADX INFO: renamed from: j */
    private final jwn f22773j;

    /* JADX INFO: renamed from: k */
    private final jwn f22774k;

    public fna(dhv dhvVar, hah hahVar, iid iidVar, jvd jvdVar, jwn jwnVar, jwn jwnVar2) {
        this.f22769f = dhvVar.mo6184l(dib.f11311bR);
        this.f22771h = hahVar;
        this.f22770g = iidVar;
        this.f22772i = jvdVar;
        this.f22764a = ((Integer) hahVar.mo10031c(gzy.f27046e)).intValue();
        this.f22765b = ((Integer) hahVar.mo10031c(gzy.f27047f)).intValue();
        this.f22766c = ((Integer) hahVar.mo10031c(gzy.f27048g)).intValue();
        this.f22768e = (hyd) jwnVar.mo3831be();
        this.f22773j = jwnVar;
        this.f22774k = jwnVar2;
        this.f22767d = ((Boolean) ((jwf) jwnVar2).f34942d).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m8601a(chw chwVar, ikw ikwVar) {
        if (chwVar.f5764a) {
            this.f22770g.f31068e.m4501m(ikwVar, new fit(chwVar, 13));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8602b(chw chwVar, ikw ikwVar, jvb jvbVar) {
        boolean z = true;
        if (ikwVar != ikw.VIDEO && ikwVar != ikw.VIDEO_INTENT && ikwVar != ikw.SLOW_MOTION && ikwVar != ikw.TIME_LAPSE && ikwVar != ikw.AMBER) {
            z = false;
        }
        if (!this.f22769f) {
            if (z) {
                return;
            }
            jvbVar.m13537d(this.f22771h.mo10029a(gzy.f27046e).mo3830a(new ctz(this, chwVar, ikwVar, 5), this.f22772i));
            return;
        }
        jvbVar.m13537d(this.f22773j.mo3830a(new ctz(this, chwVar, ikwVar, 6), this.f22772i));
        jvbVar.m13537d(this.f22774k.mo3830a(new ctz(this, chwVar, ikwVar, 7), this.f22772i));
        if (z) {
            jvbVar.m13537d(this.f22771h.mo10029a(gzy.f27047f).mo3830a(new ctz(this, chwVar, ikwVar, 8), this.f22772i));
        } else {
            jvbVar.m13537d(this.f22771h.mo10029a(gzy.f27048g).mo3830a(new ctz(this, chwVar, ikwVar, 9), this.f22772i));
            jvbVar.m13537d(this.f22771h.mo10029a(gzy.f27046e).mo3830a(new ctz(this, chwVar, ikwVar, 10), this.f22772i));
        }
    }
}
