package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mmd extends q80 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f51542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mmd(int i) {
        super(3);
        this.f51542c = i;
    }

    @Override // p000.q80
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object mo16925g() {
        switch (this.f51542c) {
            case 0:
                return new nmd();
            case 1:
                return new pmd();
            case 2:
                return new hnd();
            default:
                return new jnd();
        }
    }
}
