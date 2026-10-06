package p000;

import android.media.SoundPool;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hia implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f27872a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int[] f27873b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ float f27874c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ hic f27875d;

    public hia(hic hicVar, int i, int[] iArr, float f) {
        this.f27875d = hicVar;
        this.f27872a = i;
        this.f27873b = iArr;
        this.f27874c = f;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        ((nbe) ((nbe) hic.f27879a.m17251b()).mo17276G(3626)).mo17296u("Sound resource %d failed to load: %s", this.f27872a, th);
        this.f27875d.m10332h(this.f27872a);
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3811b(Object obj) {
        hib hibVar;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            ((nbe) ((nbe) hic.f27879a.m17251b()).mo17276G(3627)).mo17291p("Sound resource %d failed to load.", this.f27872a);
            this.f27875d.m10332h(this.f27872a);
            return;
        }
        synchronized (this.f27875d.f27880b) {
            hic hicVar = this.f27875d;
            if (!hicVar.f27882d && (hibVar = (hib) hicVar.f27881c.get(this.f27872a)) != null) {
                int[] iArr = this.f27873b;
                SoundPool soundPoolM10331g = this.f27875d.m10331g();
                int i = hibVar.f27877b;
                float f = this.f27874c;
                iArr[0] = soundPoolM10331g.play(i, f, f, 0, 0, 1.0f);
                this.f27875d.f27883e.add(new Pair(Integer.valueOf(this.f27873b[0]), Integer.valueOf(this.f27872a)));
            }
        }
    }
}
