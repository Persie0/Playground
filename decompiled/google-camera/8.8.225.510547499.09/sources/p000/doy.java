package p000;

import java.util.Set;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class doy implements oju {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12171a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12172b;

    public /* synthetic */ doy(dpc dpcVar, int i) {
        this.f12172b = i;
        this.f12171a = dpcVar;
    }

    public /* synthetic */ doy(erz erzVar, int i) {
        this.f12172b = i;
        this.f12171a = erzVar;
    }

    public /* synthetic */ doy(fcg fcgVar, int i) {
        this.f12172b = i;
        this.f12171a = fcgVar;
    }

    public /* synthetic */ doy(ioa ioaVar, int i) {
        this.f12172b = i;
        this.f12171a = ioaVar;
    }

    public /* synthetic */ doy(oju ojuVar, int i) {
        this.f12172b = i;
        this.f12171a = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final Object get() {
        switch (this.f12172b) {
            case 0:
                return ((dpc) this.f12171a).m6531u();
            case 1:
                return (Runnable) this.f12171a.get();
            case 2:
                final erz erzVar = (erz) this.f12171a;
                return new ciw() { // from class: ery
                    @Override // p000.ciw
                    /* JADX INFO: renamed from: bd */
                    public final nps mo3538bd() {
                        return nod.m17553i(erzVar.f15283a, ddu.f10598o, not.INSTANCE);
                    }

                    @Override // p000.ciw
                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ String mo3539c() {
                        return dez.m6039i(this);
                    }
                };
            case 3:
                return new esb(this.f12171a);
            case 4:
                Object obj = this.f12171a;
                kba kbaVarM6062g = dfm.m6062g();
                try {
                    Set set = (Set) Collection$EL.stream(((ohm) obj).get()).map(egh.f13940f).collect(muc.f41627b);
                    kbaVarM6062g.close();
                    return set;
                } catch (Throwable th) {
                    try {
                        kbaVarM6062g.close();
                        break;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            break;
                        } catch (Exception e) {
                        }
                    }
                    throw th;
                }
            case 5:
                return lle.m15695o(((fcg) this.f12171a).f21245b.mo12963h());
            case 6:
                return ((ioa) this.f12171a).f31625a;
            case 7:
                fjp fjpVar = (fjp) this.f12171a;
                if (!fjpVar.m8495b().mo16813g() || ((liy) fjpVar.m8495b().mo16809c()).m15507b() == null) {
                    return null;
                }
                oju ojuVarM15507b = ((liy) fjpVar.m8495b().mo16809c()).m15507b();
                ojuVarM15507b.getClass();
                return (ozk) ojuVarM15507b.get();
            default:
                return (lnf) this.f12171a.get();
        }
    }
}
