package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class te3 implements op6, hj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f62191b;

    public /* synthetic */ te3(vi3 vi3Var, int i) {
        this.f62190a = i;
        this.f62191b = vi3Var;
    }

    @Override // p000.op6
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo14457a(Object obj) throws Exception {
        int i = this.f62190a;
        vi3 vi3Var = this.f62191b;
        switch (i) {
            case 0:
                ((bb0) vi3Var).invoke(obj);
                break;
            default:
                ((C0011a9) vi3Var).invoke(obj);
                break;
        }
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: b */
    public final xi3 mo13293b() {
        int i = this.f62190a;
        vi3 vi3Var = this.f62191b;
        switch (i) {
            case 0:
                return (bb0) vi3Var;
            default:
                return (C0011a9) vi3Var;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.f62190a;
        vi3 vi3Var = this.f62191b;
        switch (i) {
            case 0:
                return (obj instanceof op6) && (obj instanceof hj3) && ((bb0) vi3Var) == ((hj3) obj).mo13293b();
            default:
                return (obj instanceof op6) && (obj instanceof hj3) && ((C0011a9) vi3Var) == ((hj3) obj).mo13293b();
        }
    }

    public final int hashCode() {
        int i = this.f62190a;
        vi3 vi3Var = this.f62191b;
        switch (i) {
            case 0:
                return ((bb0) vi3Var).hashCode();
            default:
                return ((C0011a9) vi3Var).hashCode();
        }
    }
}
