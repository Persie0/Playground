package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqn {
    /* JADX INFO: renamed from: a */
    public static final oly m18911a(oly olyVar, oly olyVar2, boolean z) {
        boolean zM18914d = m18914d(olyVar);
        boolean zM18914d2 = m18914d(olyVar2);
        if (!zM18914d && !zM18914d2) {
            return olyVar.plus(olyVar2);
        }
        ooi ooiVar = new ooi();
        ooiVar.f46351a = olyVar2;
        oly olyVar3 = (oly) olyVar.fold(olz.f46282a, new oqm(ooiVar, z));
        if (zM18914d2) {
            ooiVar.f46351a = ((oly) ooiVar.f46351a).fold(olz.f46282a, olx.f46274c);
        }
        return olyVar3.plus((oly) ooiVar.f46351a);
    }

    /* JADX INFO: renamed from: b */
    public static final oly m18912b(oqs oqsVar, oly olyVar) {
        olyVar.getClass();
        oly olyVarM18911a = m18911a(oqsVar.mo18859cS(), olyVar, true);
        oly olyVarPlus = oqu.f46432a ? olyVarM18911a.plus(new oqq(oqu.f46434c.incrementAndGet())) : olyVarM18911a;
        return (olyVarM18911a == ord.f46446a || olyVarM18911a.get(olu.f46271a) != null) ? olyVarPlus : olyVarPlus.plus(ord.f46446a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ols] */
    /* JADX WARN: Type inference failed for: r2v1, types: [omg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [omg] */
    /* JADX INFO: renamed from: c */
    public static final osx m18913c(ols olsVar, oly olyVar, Object obj) {
        olsVar.getClass();
        olyVar.getClass();
        osx osxVar = null;
        if (olyVar.get(osy.f46507a) == null) {
            return null;
        }
        while (!(olsVar instanceof ora) && (olsVar = olsVar.mo18653g()) != 0) {
            if (olsVar instanceof osx) {
                osxVar = (osx) olsVar;
                break;
            }
        }
        if (osxVar != null) {
            osxVar.m19022L(olyVar, obj);
        }
        return osxVar;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m18914d(oly olyVar) {
        return ((Boolean) olyVar.fold(false, olx.f46275d)).booleanValue();
    }
}
