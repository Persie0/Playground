package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fkx implements flf {

    /* JADX INFO: renamed from: c */
    public mrm f22430c;

    /* JADX INFO: renamed from: d */
    public boolean f22431d;

    /* JADX INFO: renamed from: e */
    public mrm f22432e;

    /* JADX INFO: renamed from: f */
    public long f22433f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ gtd f22434g;

    /* JADX INFO: renamed from: h */
    private final flf f22435h;

    /* JADX INFO: renamed from: j */
    private boolean f22437j;

    /* JADX INFO: renamed from: k */
    private boolean f22438k;

    /* JADX INFO: renamed from: l */
    private boolean f22439l;

    /* JADX INFO: renamed from: m */
    private long f22440m;

    /* JADX INFO: renamed from: n */
    private fle f22441n;

    /* JADX INFO: renamed from: a */
    public final fkw f22428a = new fkw(this);

    /* JADX INFO: renamed from: i */
    private boolean f22436i = false;

    /* JADX INFO: renamed from: b */
    public boolean f22429b = false;

    public fkx(gtd gtdVar, flf flfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f22434g = gtdVar;
        mqu mquVar = mqu.f41450a;
        this.f22430c = mquVar;
        this.f22431d = false;
        this.f22432e = mquVar;
        this.f22437j = false;
        this.f22438k = false;
        this.f22439l = false;
        this.f22440m = 0L;
        this.f22433f = 0L;
        this.f22435h = flfVar;
    }

    @Override // p000.flf
    /* JADX INFO: renamed from: a */
    public final synchronized long mo8530a() {
        this.f22436i = true;
        m8532c();
        return this.f22440m;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: b */
    public final synchronized void m8531b() {
        this.f22434g.f26335b.mo13940b("Ending still pending microvideo sessions");
        this.f22439l = true;
        m8532c();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m8532c() {
        fle fleVar;
        if (this.f22436i && !this.f22437j && !this.f22439l) {
            long jMo8530a = this.f22435h.mo8530a();
            this.f22440m = jMo8530a;
            this.f22434g.f26335b.mo13940b(EArqVBjecl.aCVubWqOjkWGNQ + jMo8530a);
            this.f22437j = true;
        }
        if (this.f22439l && (fleVar = this.f22441n) != null) {
            if (this.f22437j) {
                fleVar.mo8369b(this.f22440m + 3000000, fli.MAX_LENGTH_AFTER_SHUTDOWN);
                this.f22434g.f26335b.mo13940b("... ending max length later");
            } else {
                this.f22434g.f26335b.mo13940b("... canceling since no start timestamp was requested");
                fle fleVar2 = this.f22441n;
                fleVar2.getClass();
                fleVar2.mo8368a(fkv.CANCEL_AFTER_SHUTDOWN);
            }
            this.f22441n = null;
            this.f22428a.m8529a();
        }
        if (this.f22441n != null && !this.f22438k && !this.f22439l) {
            this.f22434g.f26335b.mo13940b("Asking delegate muxer for trimming decision");
            this.f22435h.mo8533d(new fla(this, 1));
            this.f22438k = true;
        }
        if (this.f22429b && this.f22441n != null) {
            lku.m15613H(!this.f22439l);
            this.f22434g.f26335b.mo13940b("Ending normally at " + this.f22433f);
            fle fleVar3 = this.f22441n;
            fleVar3.getClass();
            fleVar3.mo8369b(this.f22433f, (fli) this.f22430c.mo16809c());
            this.f22441n = null;
            this.f22428a.m8529a();
            this.f22434g.f26335b.mo13940b(hiCTUJiAxf.DOgwpjJOeq);
        }
        if (this.f22431d && this.f22441n != null) {
            lku.m15613H(!this.f22439l);
            fle fleVar4 = this.f22441n;
            fleVar4.getClass();
            fleVar4.mo8368a((fkv) this.f22432e.mo16809c());
            this.f22441n = null;
            this.f22428a.m8529a();
            this.f22434g.f26335b.mo13940b("Cancelled normally.");
        }
    }

    @Override // p000.flf
    /* JADX INFO: renamed from: d */
    public final synchronized void mo8533d(fle fleVar) {
        this.f22441n = fleVar;
        this.f22428a.f22427a.set(this);
        m8532c();
    }
}
