package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class olp implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    private final oly[] f46263a;

    public olp(oly[] olyVarArr) {
        olyVarArr.getClass();
        this.f46263a = olyVarArr;
    }

    private final Object readResolve() {
        oly[] olyVarArr = this.f46263a;
        oly olyVarPlus = olz.f46282a;
        for (oly olyVar : olyVarArr) {
            olyVarPlus = olyVarPlus.plus(olyVar);
        }
        return olyVarPlus;
    }
}
