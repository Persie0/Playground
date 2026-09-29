package p000;

/* JADX INFO: loaded from: classes.dex */
public class jh7 {

    /* JADX INFO: renamed from: a */
    public final Object[] f45549a;

    /* JADX INFO: renamed from: b */
    public int f45550b;

    public jh7(int i) {
        if (i > 0) {
            this.f45549a = new Object[i];
        } else {
            C3386nv.m17626m("The max pool size must be > 0");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Object mo14458a() {
        int i = this.f45550b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f45549a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.f45550b--;
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public void m14459b(C3349mv c3349mv) {
        int i = this.f45550b;
        Object[] objArr = this.f45549a;
        if (i < objArr.length) {
            objArr[i] = c3349mv;
            this.f45550b = i + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo14460c(Object obj) {
        obj.getClass();
        int i = this.f45550b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f45549a;
            if (i2 >= i) {
                int i3 = this.f45550b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.f45550b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                C3386nv.m17633t("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public jh7() {
        this.f45549a = new Object[256];
    }
}
