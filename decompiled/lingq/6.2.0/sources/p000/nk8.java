package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nk8 extends ok8 implements Iterator {

    /* JADX INFO: renamed from: a */
    public mk8 f52888a;

    /* JADX INFO: renamed from: b */
    public boolean f52889b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pk8 f52890c;

    public nk8(pk8 pk8Var) {
        this.f52890c = pk8Var;
    }

    @Override // p000.ok8
    /* JADX INFO: renamed from: a */
    public final void mo16330a(mk8 mk8Var) {
        mk8 mk8Var2 = this.f52888a;
        if (mk8Var == mk8Var2) {
            mk8 mk8Var3 = mk8Var2.f51444d;
            this.f52888a = mk8Var3;
            this.f52889b = mk8Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f52889b) {
            return this.f52890c.f56352a != null;
        }
        mk8 mk8Var = this.f52888a;
        return (mk8Var == null || mk8Var.f51443c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f52889b) {
            this.f52889b = false;
            this.f52888a = this.f52890c.f56352a;
        } else {
            mk8 mk8Var = this.f52888a;
            this.f52888a = mk8Var != null ? mk8Var.f51443c : null;
        }
        return this.f52888a;
    }
}
