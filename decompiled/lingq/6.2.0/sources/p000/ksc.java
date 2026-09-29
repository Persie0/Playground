package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ksc implements qtc {

    /* JADX INFO: renamed from: a */
    public qtc[] f48394a;

    @Override // p000.qtc
    /* JADX INFO: renamed from: a */
    public final awc mo2961a(Class cls) {
        for (qtc qtcVar : this.f48394a) {
            if (qtcVar.mo2962b(cls)) {
                return qtcVar.mo2961a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // p000.qtc
    /* JADX INFO: renamed from: b */
    public final boolean mo2962b(Class cls) {
        for (qtc qtcVar : this.f48394a) {
            if (qtcVar.mo2962b(cls)) {
                return true;
            }
        }
        return false;
    }
}
