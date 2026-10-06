package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olr implements Serializable, oly {

    /* JADX INFO: renamed from: a */
    private final oly f46266a;

    /* JADX INFO: renamed from: b */
    private final olv f46267b;

    public olr(oly olyVar, olv olvVar) {
        olyVar.getClass();
        this.f46266a = olyVar;
        this.f46267b = olvVar;
    }

    /* JADX INFO: renamed from: a */
    private final int m18637a() {
        int i = 2;
        olr olrVar = this;
        while (true) {
            oly olyVar = olrVar.f46266a;
            olrVar = olyVar instanceof olr ? (olr) olyVar : null;
            if (olrVar == null) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    private final boolean m18638b(olv olvVar) {
        return ooc.m18737c(get(olvVar.getKey()), olvVar);
    }

    private final Object writeReplace() {
        int iM18637a = m18637a();
        oly[] olyVarArr = new oly[iM18637a];
        ooh oohVar = new ooh();
        fold(oki.f46196a, new olq(olyVarArr, oohVar));
        if (oohVar.f46350a == iM18637a) {
            return new olp(olyVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof olr) {
            olr olrVar = (olr) obj;
            if (olrVar.m18637a() == m18637a()) {
                olr olrVar2 = this;
                while (olrVar.m18638b(olrVar2.f46267b)) {
                    oly olyVar = olrVar2.f46266a;
                    if (olyVar instanceof olr) {
                        olrVar2 = (olr) olyVar;
                    } else if (olrVar.m18638b((olv) olyVar)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override // p000.oly
    public final Object fold(Object obj, onm onmVar) {
        return onmVar.mo560a(this.f46266a.fold(obj, onmVar), this.f46267b);
    }

    @Override // p000.oly
    public final olv get(olw olwVar) {
        olwVar.getClass();
        olr olrVar = this;
        while (true) {
            olv olvVar = olrVar.f46267b.get(olwVar);
            if (olvVar != null) {
                return olvVar;
            }
            oly olyVar = olrVar.f46266a;
            if (!(olyVar instanceof olr)) {
                return olyVar.get(olwVar);
            }
            olrVar = (olr) olyVar;
        }
    }

    public final int hashCode() {
        return this.f46266a.hashCode() + this.f46267b.hashCode();
    }

    @Override // p000.oly
    public final oly minusKey(olw olwVar) {
        olwVar.getClass();
        if (this.f46267b.get(olwVar) != null) {
            return this.f46266a;
        }
        oly olyVarMinusKey = this.f46266a.minusKey(olwVar);
        if (olyVarMinusKey != this.f46266a) {
            return olyVarMinusKey == olz.f46282a ? this.f46267b : new olr(olyVarMinusKey, this.f46267b);
        }
        return this;
    }

    @Override // p000.oly
    public final oly plus(oly olyVar) {
        return omn.m18710o(this, olyVar);
    }

    public final String toString() {
        return '[' + ((String) fold("", olx.f46273b)) + ']';
    }
}
