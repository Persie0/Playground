package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iij implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f31090a;

    /* JADX INFO: renamed from: b */
    private final oju f31091b;

    /* JADX INFO: renamed from: c */
    private final oju f31092c;

    /* JADX INFO: renamed from: d */
    private final oju f31093d;

    /* JADX INFO: renamed from: e */
    private final oju f31094e;

    /* JADX INFO: renamed from: f */
    private final oju f31095f;

    /* JADX INFO: renamed from: g */
    private final oju f31096g;

    /* JADX INFO: renamed from: h */
    private final oju f31097h;

    /* JADX INFO: renamed from: i */
    private final oju f31098i;

    /* JADX INFO: renamed from: j */
    private final oju f31099j;

    /* JADX INFO: renamed from: k */
    private final oju f31100k;

    /* JADX INFO: renamed from: l */
    private final oju f31101l;

    /* JADX INFO: renamed from: m */
    private final oju f31102m;

    /* JADX INFO: renamed from: n */
    private final oju f31103n;

    /* JADX INFO: renamed from: o */
    private final oju f31104o;

    /* JADX INFO: renamed from: p */
    private final oju f31105p;

    /* JADX INFO: renamed from: q */
    private final /* synthetic */ int f31106q;

    /* JADX INFO: renamed from: r */
    private final Object f31107r;

    public iij(iif iifVar, oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, int i) {
        this.f31106q = i;
        this.f31107r = iifVar;
        this.f31090a = ojuVar;
        this.f31091b = ojuVar2;
        this.f31092c = ojuVar3;
        this.f31093d = ojuVar4;
        this.f31094e = ojuVar5;
        this.f31095f = ojuVar6;
        this.f31096g = ojuVar7;
        this.f31097h = ojuVar8;
        this.f31098i = ojuVar9;
        this.f31099j = ojuVar10;
        this.f31100k = ojuVar11;
        this.f31101l = ojuVar12;
        this.f31102m = ojuVar13;
        this.f31103n = ojuVar14;
        this.f31104o = ojuVar15;
        this.f31105p = ojuVar16;
    }

    public iij(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, int i) {
        this.f31106q = i;
        this.f31107r = ojuVar;
        this.f31094e = ojuVar2;
        this.f31092c = ojuVar3;
        this.f31097h = ojuVar4;
        this.f31101l = ojuVar5;
        this.f31090a = ojuVar6;
        this.f31104o = ojuVar7;
        this.f31103n = ojuVar8;
        this.f31102m = ojuVar9;
        this.f31100k = ojuVar10;
        this.f31091b = ojuVar11;
        this.f31099j = ojuVar12;
        this.f31095f = ojuVar13;
        this.f31105p = ojuVar14;
        this.f31093d = ojuVar15;
        this.f31096g = ojuVar16;
        this.f31098i = ojuVar17;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f31106q) {
            case 0:
                Object obj = this.f31107r;
                Context contextM6830a = ((dws) this.f31090a).m6830a();
                cdu cduVar = ((err) this.f31091b).get();
                fan fanVar = ((erq) this.f31092c).get();
                Map map = ((ohk) this.f31093d).get();
                boolean zBooleanValue = ((ino) this.f31094e).get().booleanValue();
                dhv dhvVar = (dhv) this.f31095f.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f31096g);
                ohb ohbVarM18485a2 = ohh.m18485a(this.f31097h);
                oju ojuVar = this.f31098i;
                igb igbVar = (igb) this.f31099j.get();
                jvd jvdVar = (jvd) this.f31100k.get();
                kbz kbzVar = (kbz) this.f31101l.get();
                elx elxVar = (elx) this.f31102m.get();
                jfs jfsVar = (jfs) this.f31103n.get();
                jwn jwnVar = (jwn) this.f31104o.get();
                jwn jwnVar2 = (jwn) this.f31105p.get();
                jvb jvbVarM3529i = cduVar.m3529i();
                Map mapEmptyMap = zBooleanValue ? Collections.emptyMap() : map;
                iid iidVar = ((iif) obj).f31086b;
                icr icrVar = new icr(contextM6830a, jvbVarM3529i, mapEmptyMap, iidVar.f31073j, iidVar.f31076m, igbVar, dhvVar, ohbVarM18485a, ohbVarM18485a2, ojuVar, jvdVar, kbzVar, elxVar, jfsVar, jwnVar, jwnVar2, null, null, null);
                fdh.m8265e(jvdVar, fanVar, icrVar);
                return icrVar;
            default:
                return new hvi((cwd) this.f31107r.get(), (eoq) this.f31094e.get(), (BottomBarController) this.f31092c.get(), (gfa) this.f31097h.get(), ((ity) this.f31101l).get(), (hxp) this.f31090a.get(), this.f31104o, (igb) this.f31103n.get(), (ebw) this.f31102m.get(), (icx) this.f31100k.get(), (dbr) this.f31091b.get(), (hai) this.f31099j.get(), (jww) this.f31095f.get(), (elx) this.f31105p.get(), (htv) this.f31093d.get(), (huu) this.f31096g.get(), (huy) this.f31098i.get(), null, null, null);
        }
    }
}
