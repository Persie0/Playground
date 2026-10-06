package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pab implements nxu {

    /* JADX INFO: renamed from: i */
    private final /* synthetic */ int f47156i;

    /* JADX INFO: renamed from: h */
    public static final nxu f47155h = new pab(7);

    /* JADX INFO: renamed from: g */
    static final nxu f47154g = new pab(6);

    /* JADX INFO: renamed from: f */
    static final nxu f47153f = new pab(5);

    /* JADX INFO: renamed from: e */
    static final nxu f47152e = new pab(4);

    /* JADX INFO: renamed from: d */
    static final nxu f47151d = new pab(3);

    /* JADX INFO: renamed from: c */
    static final nxu f47150c = new pab(2);

    /* JADX INFO: renamed from: b */
    static final nxu f47149b = new pab(1);

    /* JADX INFO: renamed from: a */
    static final nxu f47148a = new pab(0);

    private pab(int i) {
        this.f47156i = i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0044 A[RETURN] */
    @Override // p000.nxu
    /* JADX INFO: renamed from: a */
    public final boolean mo11803a(int i) {
        pam pamVar;
        switch (this.f47156i) {
            case 0:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return true;
                    default:
                        return false;
                }
            case 1:
                return lku.m15632aa(i) != 0;
            case 2:
                return lku.m15630Z(i) != 0;
            case 3:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return true;
                    default:
                        return false;
                }
            case 4:
                pam pamVar2 = pam.UNKNOWN;
                switch (i) {
                    case 0:
                        pamVar = pam.UNKNOWN;
                        break;
                    case 1:
                        pamVar = pam.CREDENTIAL_ENCRYPTED;
                        break;
                    case 2:
                        pamVar = pam.DEVICE_ENCRYPTED;
                        break;
                    default:
                        pamVar = null;
                        break;
                }
                return pamVar != null;
            case 5:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 6:
                return lku.m15629Y(i) != 0;
            default:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
