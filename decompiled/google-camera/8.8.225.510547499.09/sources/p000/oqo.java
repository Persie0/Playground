package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class oqo extends oln implements olu {

    /* JADX INFO: renamed from: b */
    public static final olo f46426b = new olo(olu.f46271a, axf.f2644h);

    public oqo() {
        super(olu.f46271a);
    }

    @Override // p000.olu
    /* JADX INFO: renamed from: b */
    public final void mo18641b(ols olsVar) {
        oxf oxfVar = (oxf) olsVar;
        while (oxfVar.f46769e.f46397a == oxg.f46771b) {
        }
        Object obj = oxfVar.f46769e.f46397a;
        opy opyVar = obj instanceof opy ? (opy) obj : null;
        if (opyVar != null) {
            opyVar.m18896v();
        }
    }

    @Override // p000.olu
    /* JADX INFO: renamed from: cD */
    public final ols mo18642cD(ols olsVar) {
        return new oxf(this, olsVar);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo18915d(oly olyVar, Runnable runnable);

    /* JADX INFO: renamed from: e */
    public boolean mo18916e(oly olyVar) {
        olyVar.getClass();
        return true;
    }

    @Override // p000.oln, p000.olv, p000.oly
    public final olv get(olw olwVar) {
        olwVar.getClass();
        if (!(olwVar instanceof olo)) {
            if (olu.f46271a == olwVar) {
                return this;
            }
            return null;
        }
        olo oloVar = (olo) olwVar;
        if (!oloVar.m18636b(getKey())) {
            return null;
        }
        olv olvVarM18635a = oloVar.m18635a(this);
        if (olvVarM18635a instanceof olv) {
            return olvVarM18635a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (p000.olu.f46271a == r2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r2.m18635a(r1) != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return p000.olz.f46282a;
     */
    @Override // p000.oln, p000.oly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oly minusKey(olw olwVar) {
        olwVar.getClass();
        if (olwVar instanceof olo) {
            olo oloVar = (olo) olwVar;
            if (oloVar.m18636b(getKey())) {
            }
            return this;
        }
    }

    public String toString() {
        return oqv.m18920a(this) + "@" + oqv.m18921b(this);
    }
}
