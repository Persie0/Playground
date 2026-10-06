package p000;

import android.location.Location;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnt implements jfw {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f34417a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34418b;

    public jnt(Location location, int i) {
        this.f34418b = i;
        this.f34417a = location;
    }

    public jnt(jnb jnbVar, int i) {
        this.f34418b = i;
        this.f34417a = jnbVar;
    }

    public jnt(jtk jtkVar, int i) {
        this.f34418b = i;
        this.f34417a = jtkVar;
    }

    @Override // p000.jfw
    /* JADX INFO: renamed from: b */
    public final void mo13121b() {
        int i = this.f34418b;
    }

    @Override // p000.jfw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo13120a(Object obj) {
        jfv jfvVar;
        switch (this.f34418b) {
            case 0:
                jno jnoVar = ((jnb) this.f34417a).f34393a;
                synchronized (jnoVar) {
                    jnoVar.f34408b = false;
                    jfvVar = jnoVar.f34407a.f33922b;
                    break;
                }
                if (jfvVar != null) {
                    jnoVar.f34409c.m12961f(jfvVar, 2441);
                    return;
                }
                return;
            case 1:
                ((jne) obj).mo8112b((Location) this.f34417a);
                return;
            default:
                ((jqv) obj).mo4518a((jtk) this.f34417a);
                return;
        }
    }
}
