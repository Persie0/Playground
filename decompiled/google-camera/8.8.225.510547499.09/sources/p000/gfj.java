package p000;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfj {

    /* JADX INFO: renamed from: a */
    public jww f24545a;

    /* JADX INFO: renamed from: b */
    public gff f24546b;

    /* JADX INFO: renamed from: c */
    private final mwn f24547c = new mwn();

    /* JADX INFO: renamed from: d */
    private final mwn f24548d = new mwn();

    /* JADX INFO: renamed from: e */
    private final mwn f24549e = new mwn();

    /* JADX INFO: renamed from: f */
    private final mwn f24550f = new mwn();

    /* JADX INFO: renamed from: g */
    private gev f24551g;

    /* JADX INFO: renamed from: h */
    private mws f24552h;

    /* JADX INFO: renamed from: i */
    private int f24553i;

    /* JADX INFO: renamed from: j */
    private int f24554j;

    /* JADX INFO: renamed from: k */
    private mws f24555k;

    /* JADX INFO: renamed from: l */
    private mws f24556l;

    /* JADX INFO: renamed from: m */
    private mws f24557m;

    /* JADX INFO: renamed from: n */
    private Predicate f24558n;

    /* JADX INFO: renamed from: o */
    private Predicate f24559o;

    /* JADX INFO: renamed from: p */
    private BiPredicate f24560p;

    /* JADX INFO: renamed from: q */
    private Consumer f24561q;

    /* JADX INFO: renamed from: r */
    private gfd f24562r;

    /* JADX INFO: renamed from: s */
    private BiConsumer f24563s;

    /* JADX INFO: renamed from: t */
    private byte f24564t;

    /* JADX INFO: renamed from: b */
    public final void m9162b(gfc gfcVar, int i, int i2, int i3) {
        this.f24547c.m17082g(gfcVar);
        this.f24548d.m17082g(Integer.valueOf(i));
        this.f24549e.m17082g(Integer.valueOf(i2));
        this.f24550f.m17082g(Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: c */
    public final void m9163c(int i) {
        this.f24554j = i;
        this.f24564t = (byte) (this.f24564t | 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m9164d(mws mwsVar) {
        if (mwsVar == null) {
            throw new NullPointerException("Null contentDescIdList");
        }
        this.f24556l = mwsVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m9165e(Integer... numArr) {
        m9164d(mws.m17096k(numArr));
    }

    /* JADX INFO: renamed from: f */
    public final void m9166f(mws mwsVar) {
        if (mwsVar == null) {
            throw new NullPointerException("Null iconIdList");
        }
        this.f24557m = mwsVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m9167g(Integer... numArr) {
        m9166f(mws.m17096k(numArr));
    }

    /* JADX INFO: renamed from: h */
    public final void m9168h(int i) {
        this.f24553i = i;
        this.f24564t = (byte) (this.f24564t | 1);
    }

    /* JADX INFO: renamed from: i */
    public final void m9169i(mws mwsVar) {
        if (mwsVar == null) {
            throw new NullPointerException("Null labelIdList");
        }
        this.f24555k = mwsVar;
    }

    /* JADX INFO: renamed from: j */
    public final void m9170j(Integer... numArr) {
        m9169i(mws.m17096k(numArr));
    }

    /* JADX INFO: renamed from: k */
    public final void m9171k(gfd gfdVar) {
        if (gfdVar == null) {
            throw new NullPointerException("Null menuOptionBlockSelectionListener");
        }
        this.f24562r = gfdVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m9172l(Consumer consumer) {
        if (consumer == null) {
            throw new NullPointerException("Null onMenuControllerReadyConsumer");
        }
        this.f24561q = consumer;
    }

    /* JADX INFO: renamed from: m */
    public final void m9173m(mws mwsVar) {
        if (mwsVar == null) {
            throw new NullPointerException("Null optionList");
        }
        this.f24552h = mwsVar;
    }

    /* JADX INFO: renamed from: n */
    public final void m9174n(gfc... gfcVarArr) {
        m9173m(mws.m17096k(gfcVarArr));
    }

    /* JADX INFO: renamed from: o */
    public final void m9175o(Predicate predicate) {
        if (predicate == null) {
            throw new NullPointerException("Null shouldBeEnabledPredicate");
        }
        this.f24559o = predicate;
    }

    /* JADX INFO: renamed from: p */
    public final void m9176p(BiPredicate biPredicate) {
        if (biPredicate == null) {
            throw new NullPointerException("Null shouldOptionBeEnabledBiPredicate");
        }
        this.f24560p = biPredicate;
    }

    /* JADX INFO: renamed from: q */
    public final void m9177q(BiConsumer biConsumer) {
        if (biConsumer == null) {
            throw new NullPointerException("Null showOrHideIconInMinibarBiConsumer");
        }
        this.f24563s = biConsumer;
    }

    /* JADX INFO: renamed from: r */
    public final void m9178r(gev gevVar) {
        if (gevVar == null) {
            throw new NullPointerException("Null category");
        }
        this.f24551g = gevVar;
    }

    /* JADX INFO: renamed from: s */
    public final void m9179s(Predicate predicate) {
        if (predicate == null) {
            throw new NullPointerException("Null shouldBeVisiblePredicate");
        }
        this.f24558n = predicate;
    }

    /* JADX INFO: renamed from: t */
    public final void m9180t(ikw ikwVar) {
        m9179s(new dam(ikwVar, 17));
    }

    /* JADX INFO: renamed from: a */
    public final gfk m9161a() {
        gev gevVar;
        mws mwsVar;
        jww jwwVar;
        mws mwsVar2;
        mws mwsVar3;
        mws mwsVar4;
        Predicate predicate;
        Predicate predicate2;
        BiPredicate biPredicate;
        Consumer consumer;
        gfd gfdVar;
        BiConsumer biConsumer;
        mws mwsVar5 = this.f24552h;
        if (!(mwsVar5 == null ? mqu.f41450a : mrm.m16829i(mwsVar5)).mo16813g()) {
            m9173m(this.f24547c.m17081f());
            m9166f(this.f24548d.m17081f());
            m9169i(this.f24549e.m17081f());
            m9164d(this.f24550f.m17081f());
        }
        if (this.f24564t == 3 && (gevVar = this.f24551g) != null && (mwsVar = this.f24552h) != null && (jwwVar = this.f24545a) != null && (mwsVar2 = this.f24555k) != null && (mwsVar3 = this.f24556l) != null && (mwsVar4 = this.f24557m) != null && (predicate = this.f24558n) != null && (predicate2 = this.f24559o) != null && (biPredicate = this.f24560p) != null && (consumer = this.f24561q) != null && (gfdVar = this.f24562r) != null && (biConsumer = this.f24563s) != null) {
            return new gfk(gevVar, mwsVar, this.f24553i, this.f24554j, jwwVar, mwsVar2, mwsVar3, mwsVar4, predicate, predicate2, biPredicate, consumer, gfdVar, biConsumer, this.f24546b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f24551g == null) {
            sb.append(" category");
        }
        if (this.f24552h == null) {
            sb.append(" optionList");
        }
        if ((this.f24564t & 1) == 0) {
            sb.append(" labelId");
        }
        if ((this.f24564t & 2) == 0) {
            sb.append(" contentDescId");
        }
        if (this.f24545a == null) {
            sb.append(" property");
        }
        if (this.f24555k == null) {
            sb.append(" labelIdList");
        }
        if (this.f24556l == null) {
            sb.append(" contentDescIdList");
        }
        if (this.f24557m == null) {
            sb.append(" iconIdList");
        }
        if (this.f24558n == null) {
            sb.append(" shouldBeVisiblePredicate");
        }
        if (this.f24559o == null) {
            sb.append(" shouldBeEnabledPredicate");
        }
        if (this.f24560p == null) {
            sb.append(" shouldOptionBeEnabledBiPredicate");
        }
        if (this.f24561q == null) {
            sb.append(" onMenuControllerReadyConsumer");
        }
        if (this.f24562r == null) {
            sb.append(" menuOptionBlockSelectionListener");
        }
        if (this.f24563s == null) {
            sb.append(" showOrHideIconInMinibarBiConsumer");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
