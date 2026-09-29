package td;

/* JADX INFO: renamed from: td.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9270r implements InterfaceC9271s, InterfaceC9268p {

    /* JADX INFO: renamed from: c */
    public static final Object f47971c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC9271s f47972a;

    /* JADX INFO: renamed from: b */
    public volatile Object f47973b = f47971c;

    public C9270r(InterfaceC9271s interfaceC9271s) {
        this.f47972a = interfaceC9271s;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC9268p m17630a(InterfaceC9271s interfaceC9271s) {
        if (interfaceC9271s instanceof InterfaceC9268p) {
            return (InterfaceC9268p) interfaceC9271s;
        }
        interfaceC9271s.getClass();
        return new C9270r(interfaceC9271s);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC9271s m17631b(InterfaceC9271s interfaceC9271s) {
        return interfaceC9271s instanceof C9270r ? interfaceC9271s : new C9270r(interfaceC9271s);
    }

    @Override // td.InterfaceC9271s
    public final Object zza() {
        Object objZza = this.f47973b;
        Object obj = f47971c;
        if (objZza == obj) {
            synchronized (this) {
                objZza = this.f47973b;
                if (objZza == obj) {
                    objZza = this.f47972a.zza();
                    Object obj2 = this.f47973b;
                    if (obj2 != obj && obj2 != objZza) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(objZza);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(strValueOf);
                        sb2.append(" & ");
                        sb2.append(strValueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.f47973b = objZza;
                    this.f47972a = null;
                }
            }
        }
        return objZza;
    }
}
