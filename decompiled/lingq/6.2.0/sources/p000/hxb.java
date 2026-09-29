package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hxb implements jyb {

    /* JADX INFO: renamed from: a */
    public jyb[] f43135a;

    @Override // p000.jyb
    /* JADX INFO: renamed from: a */
    public final z0c mo13548a(Class cls) {
        for (jyb jybVar : this.f43135a) {
            if (jybVar.mo13549b(cls)) {
                return jybVar.mo13548a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // p000.jyb
    /* JADX INFO: renamed from: b */
    public final boolean mo13549b(Class cls) {
        for (jyb jybVar : this.f43135a) {
            if (jybVar.mo13549b(cls)) {
                return true;
            }
        }
        return false;
    }
}
