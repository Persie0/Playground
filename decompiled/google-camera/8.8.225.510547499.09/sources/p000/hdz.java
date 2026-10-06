package p000;

import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdz {

    /* JADX INFO: renamed from: a */
    public final hes f27410a;

    /* JADX INFO: renamed from: b */
    public final het f27411b;

    /* JADX INFO: renamed from: c */
    public hew f27412c;

    /* JADX INFO: renamed from: d */
    public boolean f27413d = false;

    /* JADX INFO: renamed from: e */
    public boolean f27414e = false;

    /* JADX INFO: renamed from: f */
    public final jvb f27415f;

    /* JADX INFO: renamed from: g */
    private final EnumSet f27416g;

    public hdz(hes hesVar, het hetVar) {
        this.f27410a = hesVar;
        this.f27411b = hetVar;
        EnumSet enumSetAllOf = EnumSet.allOf(hdy.class);
        this.f27416g = enumSetAllOf;
        if (!hetVar.f27486d) {
            enumSetAllOf.remove(hdy.POST_CAPTURE_COOLDOWN);
        }
        if (!hetVar.f27487e) {
            enumSetAllOf.remove(hdy.TIMER_ACTIVE);
        }
        if (((Boolean) hetVar.f27488f.mo3831be()).booleanValue()) {
            enumSetAllOf.remove(hdy.f27406e);
        }
        this.f27415f = new jvb();
    }

    /* JADX INFO: renamed from: a */
    public final void m10133a(kmd kmdVar) {
        lku.m15613H(this.f27413d);
        hes hesVar = this.f27410a;
        if (hesVar instanceof her) {
            ((her) hesVar).mo3952c(kmdVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10134b(hdy hdyVar, boolean z) {
        if (z != this.f27416g.contains(hdyVar)) {
            if (z) {
                this.f27416g.add(hdyVar);
            } else {
                this.f27416g.remove(hdyVar);
            }
            lku.m15613H(this.f27413d);
            boolean zIsEmpty = this.f27416g.isEmpty();
            if (this.f27414e != zIsEmpty) {
                this.f27414e = zIsEmpty;
                if (zIsEmpty) {
                    this.f27410a.mo3970w();
                } else {
                    this.f27410a.mo3969v();
                    this.f27412c.mo10130a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10135c(boolean z) {
        lku.m15613H(this.f27413d);
        m10134b(hdy.APPLICATION_LIFECYCLE, !z);
    }

    /* JADX INFO: renamed from: d */
    public final void m10136d(ikw ikwVar) {
        lku.m15613H(this.f27413d);
        m10134b(hdy.APPLICATION_MODE, !this.f27411b.f27484b.contains(ikwVar));
    }

    /* JADX INFO: renamed from: e */
    public final void m10137e(kmq kmqVar) {
        lku.m15613H(this.f27413d);
        m10134b(hdy.CAMERA_FACING, !this.f27411b.f27485c.contains(kmqVar));
    }

    /* JADX INFO: renamed from: f */
    public final void m10138f(boolean z) {
        lku.m15613H(this.f27413d);
        hdy hdyVar = hdy.POST_CAPTURE_COOLDOWN;
        boolean z2 = false;
        if (z && this.f27411b.f27486d) {
            z2 = true;
        }
        m10134b(hdyVar, z2);
    }

    /* JADX INFO: renamed from: g */
    public final void m10139g(boolean z) {
        hdy hdyVar = hdy.TIMER_ACTIVE;
        boolean z2 = false;
        if (z && this.f27411b.f27487e) {
            z2 = true;
        }
        m10134b(hdyVar, z2);
    }

    /* JADX INFO: renamed from: h */
    public final void m10140h(boolean z) {
        m10134b(hdy.UI_CONFLICT, z);
    }
}
