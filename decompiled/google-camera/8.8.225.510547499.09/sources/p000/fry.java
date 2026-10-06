package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fry implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23403a;

    /* JADX INFO: renamed from: b */
    private final oju f23404b;

    /* JADX INFO: renamed from: c */
    private final oju f23405c;

    /* JADX INFO: renamed from: d */
    private final oju f23406d;

    /* JADX INFO: renamed from: e */
    private final oju f23407e;

    /* JADX INFO: renamed from: f */
    private final oju f23408f;

    /* JADX INFO: renamed from: g */
    private final oju f23409g;

    /* JADX INFO: renamed from: h */
    private final oju f23410h;

    /* JADX INFO: renamed from: i */
    private final oju f23411i;

    /* JADX INFO: renamed from: j */
    private final oju f23412j;

    /* JADX INFO: renamed from: k */
    private final oju f23413k;

    /* JADX INFO: renamed from: l */
    private final oju f23414l;

    /* JADX INFO: renamed from: m */
    private final oju f23415m;

    /* JADX INFO: renamed from: n */
    private final oju f23416n;

    /* JADX INFO: renamed from: o */
    private final oju f23417o;

    /* JADX INFO: renamed from: p */
    private final /* synthetic */ int f23418p;

    public fry(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, int i) {
        this.f23418p = i;
        this.f23403a = ojuVar;
        this.f23404b = ojuVar2;
        this.f23405c = ojuVar3;
        this.f23406d = ojuVar4;
        this.f23407e = ojuVar5;
        this.f23408f = ojuVar6;
        this.f23409g = ojuVar7;
        this.f23410h = ojuVar8;
        this.f23411i = ojuVar9;
        this.f23412j = ojuVar10;
        this.f23413k = ojuVar11;
        this.f23414l = ojuVar12;
        this.f23415m = ojuVar13;
        this.f23416n = ojuVar14;
        this.f23417o = ojuVar15;
    }

    public fry(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, int i, byte[] bArr) {
        this.f23418p = i;
        this.f23417o = ojuVar;
        this.f23412j = ojuVar2;
        this.f23406d = ojuVar3;
        this.f23415m = ojuVar4;
        this.f23409g = ojuVar5;
        this.f23414l = ojuVar6;
        this.f23411i = ojuVar7;
        this.f23413k = ojuVar8;
        this.f23408f = ojuVar9;
        this.f23403a = ojuVar10;
        this.f23404b = ojuVar11;
        this.f23407e = ojuVar12;
        this.f23416n = ojuVar13;
        this.f23410h = ojuVar14;
        this.f23405c = ojuVar15;
    }

    public fry(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, int i, char[] cArr) {
        this.f23418p = i;
        this.f23412j = ojuVar;
        this.f23403a = ojuVar2;
        this.f23404b = ojuVar3;
        this.f23414l = ojuVar4;
        this.f23417o = ojuVar5;
        this.f23405c = ojuVar6;
        this.f23406d = ojuVar7;
        this.f23408f = ojuVar8;
        this.f23411i = ojuVar9;
        this.f23416n = ojuVar10;
        this.f23415m = ojuVar11;
        this.f23410h = ojuVar12;
        this.f23409g = ojuVar13;
        this.f23413k = ojuVar14;
        this.f23407e = ojuVar15;
    }

    /* JADX INFO: renamed from: a */
    public static fry m8749a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15) {
        return new fry(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, ojuVar12, ojuVar13, ojuVar14, ojuVar15, 0);
    }

    /* JADX INFO: renamed from: b */
    public static fry m8750b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15) {
        return new fry(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, ojuVar12, ojuVar13, ojuVar14, ojuVar15, 2, (char[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f23418p) {
            case 0:
                return new frx(((ftk) this.f23403a).get(), (fpy) this.f23404b.get(), (fsd) this.f23405c.get(), (fsd) this.f23406d.get(), ohh.m18485a(this.f23407e), this.f23408f, (fky) this.f23409g.get(), (fti) this.f23410h.get(), ((frc) this.f23411i).get(), (dhv) this.f23412j.get(), ((ebo) this.f23413k).get(), ((kbm) this.f23414l).get(), (Handler) this.f23415m.get(), ((gtb) this.f23416n).get(), (fqi) this.f23417o.get(), null, null);
            case 1:
                Executor executor = (Executor) this.f23417o.get();
                dhv dhvVar = (dhv) this.f23412j.get();
                ((gic) this.f23406d).get();
                return new ehi(executor, dhvVar, (jww) this.f23415m.get(), ((hog) this.f23409g).m10532a(), ((hog) this.f23414l).m10532a(), (hai) this.f23411i.get(), (idg) this.f23413k.get(), (dbr) this.f23408f.get(), ((err) this.f23403a).get(), (jww) this.f23404b.get(), (jvd) this.f23407e.get(), ((erq) this.f23416n).get(), (gfa) this.f23410h.get(), (hnw) this.f23405c.get());
            default:
                return new gkf((ecq) this.f23412j.get(), (kfk) this.f23403a.get(), (gmo) this.f23404b.get(), (gjt) this.f23414l.get(), (gva) this.f23417o.get(), (gof) this.f23405c.get(), ((gkt) this.f23406d).get(), (ebz) this.f23408f.get(), (kbz) this.f23411i.get(), (gir) this.f23416n.get(), (goo) this.f23415m.get(), ((gok) this.f23410h).get(), ((ntb) this.f23409g).get(), (Executor) this.f23413k.get(), (Executor) this.f23407e.get(), null);
        }
    }
}
