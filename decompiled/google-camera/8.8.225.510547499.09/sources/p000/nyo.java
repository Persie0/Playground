package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nyo implements nyu {

    /* JADX INFO: renamed from: a */
    public static final nyo f45028a = new nyo(1);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f45029b;

    public nyo(int i) {
        this.f45029b = i;
    }

    @Override // p000.nyu
    /* JADX INFO: renamed from: b */
    public final boolean mo18188b(Class cls) {
        switch (this.f45029b) {
            case 0:
                return false;
            default:
                return nxq.class.isAssignableFrom(cls);
        }
    }

    @Override // p000.nyu
    /* JADX INFO: renamed from: a */
    public final nyt mo18187a(Class cls) {
        switch (this.f45029b) {
            case 0:
                throw new IllegalStateException("This should never be called.");
            default:
                if (!nxq.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
                }
                try {
                    Class clsAsSubclass = cls.asSubclass(nxq.class);
                    nxq nxqVar = (nxq) nxq.f44979aH.get(clsAsSubclass);
                    if (nxqVar == null) {
                        try {
                            Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                            nxqVar = (nxq) nxq.f44979aH.get(clsAsSubclass);
                        } catch (ClassNotFoundException e) {
                            throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
                    if (nxqVar == null) {
                        nxqVar = (nxq) ((nxq) oag.m18359g(clsAsSubclass)).m18143ad(6);
                        if (nxqVar == null) {
                            throw new IllegalStateException();
                        }
                        nxq.f44979aH.put(clsAsSubclass, nxqVar);
                    }
                    return (nyt) nxqVar.m18143ad(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
                }
        }
    }
}
