package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aee implements aed {

    /* JADX INFO: renamed from: a */
    private final Object[] f249a;

    /* JADX INFO: renamed from: b */
    private int f250b;

    public aee(int i) {
        this.f249a = new Object[i];
    }

    @Override // p000.aed
    /* JADX INFO: renamed from: a */
    public Object mo320a() {
        int i = this.f250b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f249a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f250b = i2;
        return obj;
    }

    @Override // p000.aed
    /* JADX INFO: renamed from: b */
    public boolean mo321b(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.f250b;
            if (i >= i2) {
                Object[] objArr = this.f249a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.f250b = i2 + 1;
                return true;
            }
            if (this.f249a[i] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i++;
        }
    }
}
