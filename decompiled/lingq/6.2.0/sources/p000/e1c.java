package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class e1c implements s8c {

    /* JADX INFO: renamed from: b */
    public static final e1c f36584b = new e1c(0);

    /* JADX INFO: renamed from: c */
    public static final e1c f36585c = new e1c(1);

    /* JADX INFO: renamed from: d */
    public static final e1c f36586d = new e1c(2);

    /* JADX INFO: renamed from: e */
    public static final e1c f36587e = new e1c(3);

    /* JADX INFO: renamed from: f */
    public static final e1c f36588f = new e1c(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36589a;

    public /* synthetic */ e1c(int i) {
        this.f36589a = i;
    }

    @Override // p000.s8c
    /* JADX INFO: renamed from: a */
    public final boolean mo10793a(int i) {
        switch (this.f36589a) {
            case 0:
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
                        return true;
                    default:
                        return false;
                }
            case 1:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case 2:
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
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 3:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                return i == 0 || i == 1;
        }
    }
}
