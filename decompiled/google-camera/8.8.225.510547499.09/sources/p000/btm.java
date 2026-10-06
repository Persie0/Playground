package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btm implements btf {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4434a;

    public btm(int i) {
        this.f4434a = i;
    }

    @Override // p000.btf
    /* JADX INFO: renamed from: b */
    public final int mo3032b() {
        switch (this.f4434a) {
            case 0:
                return 4;
            default:
                return 1;
        }
    }

    @Override // p000.btf
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo3033c(int i) {
        switch (this.f4434a) {
            case 0:
                return new int[i];
            default:
                return new byte[i];
        }
    }

    @Override // p000.btf
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo3031a(Object obj) {
        switch (this.f4434a) {
            case 0:
                return ((int[]) obj).length;
            default:
                return ((byte[]) obj).length;
        }
    }
}
