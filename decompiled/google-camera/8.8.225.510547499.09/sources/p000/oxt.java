package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class oxt {

    /* JADX INFO: renamed from: a */
    private final opn f46795a;

    public oxt(byte[] bArr) {
        this.f46795a = ook.m18796j(owx.f46746a);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo18990a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract void mo19135b(Object obj, Object obj2);

    /* JADX INFO: renamed from: c */
    public final Object m19151c(Object obj) {
        Object objMo18990a = this.f46795a.f46397a;
        if (objMo18990a == owx.f46746a) {
            objMo18990a = mo18990a(obj);
            boolean z = oqu.f46432a;
            Object obj2 = this.f46795a.f46397a;
            Object obj3 = owx.f46746a;
            if (obj2 != obj3) {
                objMo18990a = obj2;
            } else if (!this.f46795a.m18856d(obj3, objMo18990a)) {
                objMo18990a = this.f46795a.f46397a;
            }
        }
        mo19135b(obj, objMo18990a);
        return objMo18990a;
    }

    public final String toString() {
        return oqv.m18920a(this) + "@" + oqv.m18921b(this);
    }

    public oxt() {
    }
}
