package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a66 extends sp5 implements wg4 {

    /* JADX INFO: renamed from: d */
    public final r77 f291d;

    /* JADX INFO: renamed from: e */
    public Object f292e;

    public a66(r77 r77Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f291d = r77Var;
        this.f292e = obj2;
    }

    @Override // p000.sp5, java.util.Map.Entry
    public final Object getValue() {
        return this.f292e;
    }

    @Override // p000.sp5, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f292e;
        this.f292e = obj;
        p77 p77Var = (p77) this.f291d.f58858b;
        o77 o77Var = p77Var.f55696d;
        Object obj3 = this.f61204b;
        if (!o77Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = p77Var.f52444c;
        if (!z) {
            o77Var.put(obj3, obj);
        } else {
            if (!z) {
                uk9.m22784s();
                return null;
            }
            zba zbaVar = p77Var.f52442a[p77Var.f52443b];
            Object obj4 = zbaVar.f71319a[zbaVar.f71321c];
            o77Var.put(obj3, obj);
            p77Var.m18936c(obj4 != null ? obj4.hashCode() : 0, o77Var.f53938c, obj4, 0);
        }
        p77Var.f55699g = o77Var.f53940e;
        return obj2;
    }
}
