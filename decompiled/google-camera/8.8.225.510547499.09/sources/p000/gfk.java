package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import p021j$.util.function.BiPredicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfk extends get {

    /* JADX INFO: renamed from: a */
    private final gev f24565a;

    /* JADX INFO: renamed from: b */
    private final mws f24566b;

    /* JADX INFO: renamed from: c */
    private final int f24567c;

    /* JADX INFO: renamed from: d */
    private final int f24568d;

    /* JADX INFO: renamed from: e */
    private final jww f24569e;

    /* JADX INFO: renamed from: f */
    private final mws f24570f;

    /* JADX INFO: renamed from: g */
    private final mws f24571g;

    /* JADX INFO: renamed from: h */
    private final mws f24572h;

    /* JADX INFO: renamed from: i */
    private final Predicate f24573i;

    /* JADX INFO: renamed from: j */
    private final Predicate f24574j;

    /* JADX INFO: renamed from: k */
    private final BiPredicate f24575k;

    /* JADX INFO: renamed from: l */
    private final Consumer f24576l;

    /* JADX INFO: renamed from: m */
    private final gfd f24577m;

    /* JADX INFO: renamed from: n */
    private final BiConsumer f24578n;

    /* JADX INFO: renamed from: o */
    private final gff f24579o;

    public gfk() {
    }

    public gfk(gev gevVar, mws mwsVar, int i, int i2, jww jwwVar, mws mwsVar2, mws mwsVar3, mws mwsVar4, Predicate predicate, Predicate predicate2, BiPredicate biPredicate, Consumer consumer, gfd gfdVar, BiConsumer biConsumer, gff gffVar) {
        this.f24565a = gevVar;
        this.f24566b = mwsVar;
        this.f24567c = i;
        this.f24568d = i2;
        this.f24569e = jwwVar;
        this.f24570f = mwsVar2;
        this.f24571g = mwsVar3;
        this.f24572h = mwsVar4;
        this.f24573i = predicate;
        this.f24574j = predicate2;
        this.f24575k = biPredicate;
        this.f24576l = consumer;
        this.f24577m = gfdVar;
        this.f24578n = biConsumer;
        this.f24579o = gffVar;
    }

    /* JADX INFO: renamed from: o */
    public static gfj m9181o() {
        gfj gfjVar = new gfj();
        gfjVar.m9175o(fjv.f22312f);
        gfjVar.m9176p(new BiPredicate() { // from class: gfh
            public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$and(this, biPredicate);
            }

            public final /* synthetic */ BiPredicate negate() {
                return BiPredicate$CC.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public final /* synthetic */ BiPredicate m9160or(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return true;
            }
        });
        gfjVar.m9172l(fax.f21153f);
        gfjVar.m9171k(new gfd() { // from class: gfi
            @Override // p000.gfd
            /* JADX INFO: renamed from: u */
            public final boolean mo5833u(gev gevVar, gfc gfcVar, boolean z) {
                return false;
            }
        });
        gfjVar.m9177q(gnv.f25809b);
        return gfjVar;
    }

    /* JADX INFO: renamed from: p */
    private final int m9182p(gfc gfcVar, mws mwsVar) {
        int iIndexOf = this.f24566b.indexOf(gfcVar);
        if (iIndexOf < 0 || iIndexOf >= ((mzr) mwsVar).f41859c) {
            return 0;
        }
        return ((Integer) mwsVar.get(iIndexOf)).intValue();
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: a */
    public final int mo5765a() {
        return this.f24568d;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: b */
    protected final int mo5766b(gfc gfcVar) {
        return m9182p(gfcVar, this.f24571g);
    }

    @Override // p000.get
    /* JADX INFO: renamed from: d */
    public final int mo5768d(gfc gfcVar) {
        return m9182p(gfcVar, this.f24572h);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: e */
    public final int mo5769e() {
        return this.f24567c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfk) {
            gfk gfkVar = (gfk) obj;
            if (this.f24565a.equals(gfkVar.f24565a) && mkv.m16505M(this.f24566b, gfkVar.f24566b) && this.f24567c == gfkVar.f24567c && this.f24568d == gfkVar.f24568d && this.f24569e.equals(gfkVar.f24569e) && mkv.m16505M(this.f24570f, gfkVar.f24570f) && mkv.m16505M(this.f24571g, gfkVar.f24571g) && mkv.m16505M(this.f24572h, gfkVar.f24572h) && this.f24573i.equals(gfkVar.f24573i) && this.f24574j.equals(gfkVar.f24574j) && this.f24575k.equals(gfkVar.f24575k) && this.f24576l.equals(gfkVar.f24576l) && this.f24577m.equals(gfkVar.f24577m) && this.f24578n.equals(gfkVar.f24578n)) {
                gff gffVar = this.f24579o;
                gff gffVar2 = gfkVar.f24579o;
                if (gffVar != null ? gffVar.equals(gffVar2) : gffVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: f */
    protected final int mo5770f(gfc gfcVar) {
        return m9182p(gfcVar, this.f24570f);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: g */
    public final gev mo5771g() {
        return this.f24565a;
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: h */
    public final gff mo5772h() {
        return this.f24579o;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.f24565a.hashCode() ^ 1000003) * 1000003) ^ this.f24566b.hashCode()) * 1000003) ^ this.f24567c) * 1000003) ^ this.f24568d) * 1000003) ^ this.f24569e.hashCode()) * 1000003) ^ this.f24570f.hashCode()) * 1000003) ^ this.f24571g.hashCode()) * 1000003) ^ this.f24572h.hashCode()) * 1000003) ^ this.f24573i.hashCode()) * 1000003) ^ this.f24574j.hashCode()) * 1000003) ^ this.f24575k.hashCode()) * 1000003) ^ this.f24576l.hashCode()) * 1000003) ^ this.f24577m.hashCode()) * 1000003) ^ this.f24578n.hashCode();
        gff gffVar = this.f24579o;
        return (iHashCode * 1000003) ^ (gffVar == null ? 0 : gffVar.hashCode());
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: i */
    public final jww mo5773i() {
        return this.f24569e;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: j */
    public final mws mo5774j() {
        return this.f24566b;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: k */
    public final void mo5775k(gfa gfaVar) {
        this.f24576l.accept(gfaVar);
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: m */
    public final boolean mo5777m(gfa gfaVar) {
        return this.f24574j.test(gfaVar);
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: n */
    public final boolean mo5778n(gfa gfaVar) {
        return this.f24573i.test(gfaVar);
    }

    public final String toString() {
        return "SimpleMenuItemImpl{category=" + String.valueOf(this.f24565a) + ", optionList=" + String.valueOf(this.f24566b) + ", labelId=" + this.f24567c + ", contentDescId=" + this.f24568d + ", property=" + String.valueOf(this.f24569e) + ", labelIdList=" + String.valueOf(this.f24570f) + WIxTIdUIdfb.Lnk + String.valueOf(this.f24571g) + ", iconIdList=" + String.valueOf(this.f24572h) + ", shouldBeVisiblePredicate=" + String.valueOf(this.f24573i) + ", shouldBeEnabledPredicate=" + String.valueOf(this.f24574j) + ", shouldOptionBeEnabledBiPredicate=" + String.valueOf(this.f24575k) + ", onMenuControllerReadyConsumer=" + String.valueOf(this.f24576l) + ", menuOptionBlockSelectionListener=" + String.valueOf(this.f24577m) + ", showOrHideIconInMinibarBiConsumer=" + String.valueOf(this.f24578n) + ", onHelpClickListener=" + String.valueOf(this.f24579o) + "}";
    }

    @Override // p000.get, p000.gfd
    /* JADX INFO: renamed from: u */
    public final boolean mo5833u(gev gevVar, gfc gfcVar, boolean z) {
        return this.f24577m.mo5833u(gevVar, gfcVar, z);
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: v */
    public final boolean mo5834v(gfa gfaVar, gfc gfcVar) {
        return this.f24575k.test(gfaVar, gfcVar);
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: z */
    public final void mo5840z(gfa gfaVar, boolean z) {
        this.f24578n.accept(gfaVar, Boolean.valueOf(z));
    }
}
