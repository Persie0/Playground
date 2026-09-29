package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lk8 extends ok8 implements Iterator {

    /* JADX INFO: renamed from: a */
    public mk8 f49777a;

    /* JADX INFO: renamed from: b */
    public mk8 f49778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f49779c;

    public lk8(mk8 mk8Var, mk8 mk8Var2, int i) {
        this.f49779c = i;
        this.f49777a = mk8Var2;
        this.f49778b = mk8Var;
    }

    @Override // p000.ok8
    /* JADX INFO: renamed from: a */
    public final void mo16330a(mk8 mk8Var) {
        mk8 mk8Var2;
        mk8 mk8VarM16331b = null;
        if (this.f49777a == mk8Var && mk8Var == this.f49778b) {
            this.f49778b = null;
            this.f49777a = null;
        }
        mk8 mk8Var3 = this.f49777a;
        if (mk8Var3 == mk8Var) {
            switch (this.f49779c) {
                case 0:
                    mk8Var2 = mk8Var3.f51444d;
                    break;
                default:
                    mk8Var2 = mk8Var3.f51443c;
                    break;
            }
            this.f49777a = mk8Var2;
        }
        mk8 mk8Var4 = this.f49778b;
        if (mk8Var4 == mk8Var) {
            mk8 mk8Var5 = this.f49777a;
            if (mk8Var4 != mk8Var5 && mk8Var5 != null) {
                mk8VarM16331b = m16331b(mk8Var4);
            }
            this.f49778b = mk8VarM16331b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final mk8 m16331b(mk8 mk8Var) {
        switch (this.f49779c) {
            case 0:
                return mk8Var.f51443c;
            default:
                return mk8Var.f51444d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49778b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        mk8 mk8Var = this.f49778b;
        mk8 mk8Var2 = this.f49777a;
        this.f49778b = (mk8Var == mk8Var2 || mk8Var2 == null) ? null : m16331b(mk8Var);
        return mk8Var;
    }
}
