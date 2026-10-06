package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p021j$.util.Collection$EL;
import p021j$.util.Optional;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbr implements dcj, jwn {

    /* JADX INFO: renamed from: f */
    private static final nbh f10417f = nbh.m17259h("com/google/android/apps/camera/camerafacing/CameraFacingController");

    /* JADX INFO: renamed from: a */
    public kmq f10418a;

    /* JADX INFO: renamed from: b */
    public final jww f10419b;

    /* JADX INFO: renamed from: c */
    public final List f10420c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final dhv f10421d;

    /* JADX INFO: renamed from: e */
    public final jwn f10422e;

    /* JADX INFO: renamed from: g */
    private final jvd f10423g;

    /* JADX INFO: renamed from: h */
    private final jwn f10424h;

    /* JADX INFO: renamed from: i */
    private boolean f10425i;

    /* JADX INFO: renamed from: j */
    private boolean f10426j;

    /* JADX INFO: renamed from: k */
    private final Intent f10427k;

    /* JADX INFO: renamed from: l */
    private final ddq f10428l;

    /* JADX INFO: renamed from: m */
    private final dcl f10429m;

    /* JADX INFO: renamed from: n */
    private final doe f10430n;

    /* JADX INFO: renamed from: o */
    private final List f10431o;

    /* JADX INFO: renamed from: p */
    private fvu f10432p;

    /* JADX INFO: renamed from: q */
    private fvu f10433q;

    /* JADX INFO: renamed from: r */
    private final kms f10434r;

    /* JADX INFO: renamed from: s */
    private final dfn f10435s;

    /* JADX INFO: renamed from: t */
    private final cwd f10436t;

    public dbr(kms kmsVar, jvd jvdVar, dfn dfnVar, dcl dclVar, ddq ddqVar, cwd cwdVar, doe doeVar, Intent intent, dhv dhvVar, jwn jwnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10418a = kmq.BACK;
        ArrayList arrayList = new ArrayList();
        this.f10431o = arrayList;
        this.f10434r = kmsVar;
        this.f10423g = jvdVar;
        this.f10425i = false;
        this.f10426j = false;
        this.f10427k = intent;
        this.f10435s = dfnVar;
        this.f10429m = dclVar;
        this.f10428l = ddqVar;
        this.f10436t = cwdVar;
        this.f10430n = doeVar;
        this.f10421d = dhvVar;
        this.f10422e = jwnVar;
        arrayList.add(new dbq(kmq.BACK, m5891o() != null));
        arrayList.add(new dbq(kmq.f36557a, m5892p() != null));
        this.f10418a = m5891o() != null ? kmq.BACK : kmq.f36557a;
        jwf jwfVar = new jwf(this.f10418a);
        this.f10419b = jwfVar;
        this.f10424h = new cjy(jwr.m13640j(jwj.m13624c(jwfVar), new ceg(this, 12)));
        if (m5889m()) {
            ddqVar.mo5945e(kmq.f36557a, kmq.BACK);
        } else if (!m5890n(kmq.f36557a)) {
            ddqVar.mo5945e(kmq.BACK);
        } else if (!m5890n(kmq.BACK)) {
            ddqVar.mo5945e(kmq.f36557a);
        }
        kmq kmqVar = cds.m3511j(intent) ? kmq.f36557a : kmq.BACK;
        m5888l(kmqVar);
        if (m5889m() || kmqVar == jwfVar.f34942d) {
            return;
        }
        if (cwdVar.m5672t()) {
            m5888l((kmq) jwfVar.f34942d);
            ddqVar.mo5946f(kmqVar);
            dfnVar.m6066a(kmqVar, 2, 2);
        } else {
            doeVar.mo6457e(new doc("No " + kmqVar.name() + " camera present", kcl.CAMERAS_NOT_ENUMERATED, kmqVar));
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m5888l(kmq kmqVar) {
        dbq dbqVar = (dbq) Collection$EL.stream(this.f10431o).filter(new dam(kmqVar, 4)).findFirst().orElse(null);
        if (dbqVar != null) {
            dbqVar.f10416d = true;
        }
    }

    /* JADX INFO: renamed from: m */
    private final boolean m5889m() {
        return Collection$EL.stream(this.f10431o).filter(cdy.f5378g).count() == 2;
    }

    /* JADX INFO: renamed from: n */
    private final boolean m5890n(kmq kmqVar) {
        return Collection$EL.stream(this.f10431o).anyMatch(new dam(kmqVar, 6));
    }

    /* JADX INFO: renamed from: o */
    private final synchronized fvu m5891o() {
        if (!this.f10425i) {
            this.f10432p = m5893q(this.f10434r, kmq.BACK);
            this.f10425i = true;
        }
        return this.f10432p;
    }

    /* JADX INFO: renamed from: p */
    private final synchronized fvu m5892p() {
        if (!this.f10426j) {
            this.f10433q = m5893q(this.f10434r, kmq.f36557a);
            this.f10426j = true;
        }
        return this.f10433q;
    }

    /* JADX INFO: renamed from: q */
    private static fvu m5893q(kms kmsVar, kmq kmqVar) {
        kmg kmgVarMo13858e = kmsVar.mo13858e(kmqVar);
        if (kmgVarMo13858e == null) {
            return null;
        }
        return kmsVar.m14581f(kmgVarMo13858e);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f10424h.mo3830a(kbgVar, executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dci mo3831be() {
        return (dci) this.f10424h.mo3831be();
    }

    @Override // p000.dcj
    /* JADX INFO: renamed from: d */
    public final kmq mo5895d() {
        return (kmq) ((jwf) this.f10419b).f34942d;
    }

    /* JADX INFO: renamed from: e */
    public final mrm m5896e() {
        return mrm.m16828h(m5902k(mo5895d()));
    }

    /* JADX INFO: renamed from: f */
    public final void m5897f(kmq kmqVar) {
        dbq dbqVar = (dbq) Collection$EL.stream(this.f10431o).filter(new dam(kmqVar, 5)).findFirst().orElse(null);
        if (dbqVar != null) {
            dbqVar.f10415c = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5898g(kmq kmqVar) {
        if (m5889m()) {
            this.f10419b.mo3415bf(kmqVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5899h(Runnable runnable) {
        dbq dbqVar;
        kmq kmqVarMo5895d = mo5895d();
        kmq kmqVar = kmqVarMo5895d == kmq.BACK ? kmq.f36557a : kmq.BACK;
        int i = 2;
        if (m5890n(kmqVar)) {
            m5898g(m5900i() ? kmq.f36557a : kmq.BACK);
            mo5895d();
            jvh.m13562j(kxk.m14961G((Iterable) Collection$EL.stream(this.f10420c).map(new cwp(this, i)).collect(Collectors.toList())), new cis(runnable, 4), this.f10423g);
        } else if (!this.f10436t.m5672t()) {
            this.f10430n.mo6457e(new doc("No " + kmqVar.name() + " camera present", kcl.CAMERAS_NOT_ENUMERATED, kmqVar));
        }
        if (m5890n(kmqVarMo5895d) && !m5890n(kmqVar) && this.f10436t.m5672t()) {
            Optional optionalFindFirst = Collection$EL.stream(this.f10431o).filter(new dam(kmqVar, 3)).findFirst();
            int i2 = (optionalFindFirst.isPresent() && ((dbq) optionalFindFirst.get()).f10414b) ? 3 : 2;
            if (i2 == 2 && ((dbqVar = (dbq) Collection$EL.stream(this.f10431o).filter(new dam(kmqVar, i)).findFirst().orElse(null)) == null || !dbqVar.f10416d)) {
                this.f10428l.mo5946f(kmqVar);
            }
            this.f10435s.m6066a(kmqVar, 3, i2);
        } else if (!m5890n(kmqVarMo5895d) && !m5890n(kmqVar) && this.f10436t.m5672t()) {
            this.f10429m.mo5910c();
        }
        m5888l(kmqVar);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5900i() {
        return mo5895d() == kmq.BACK;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5901j() {
        return mo5895d() == kmq.f36557a;
    }

    /* JADX INFO: renamed from: k */
    public final fvu m5902k(kmq kmqVar) {
        if (kmqVar == kmq.BACK && m5891o() != null) {
            return m5891o();
        }
        if (kmqVar == kmq.f36557a && m5892p() != null) {
            return m5892p();
        }
        ((nbe) ((nbe) f10417f.m17252c()).mo17276G((char) 828)).mo17293r("No OneCameraCharacteristics found for: %s", mo5895d());
        return null;
    }

    public final String toString() {
        return true != m5900i() ? "Front Camera" : "Back Camera";
    }
}
