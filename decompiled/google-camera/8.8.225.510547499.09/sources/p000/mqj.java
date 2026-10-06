package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqj extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final mqj f41383a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f41384b;

    static {
        mqj mqjVar = new mqj();
        f41383a = mqjVar;
        nxq.m18130aa(mqj.class, mqjVar);
    }

    private mqj() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return m18129X(f41383a, "\u0000\u0000", null);
            case 3:
                return new mqj();
            case 4:
                return new nxl(f41383a);
            case 5:
                return f41383a;
            case 6:
                nzd nxmVar = f41384b;
                if (nxmVar == null) {
                    synchronized (mqj.class) {
                        nxmVar = f41384b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f41383a);
                            f41384b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
