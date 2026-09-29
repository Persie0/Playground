package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xa6 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public int f67996a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f67997b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sg3 f67998c;

    public xa6(sg3 sg3Var) {
        this.f67998c = sg3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67996a + 1 < ((pe9) this.f67998c.f60818d).m19081e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        this.f67997b = true;
        pe9 pe9Var = (pe9) this.f67998c.f60818d;
        int i = this.f67996a + 1;
        this.f67996a = i;
        return (r86) pe9Var.m19082f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f67997b) {
            C3386nv.m17633t("You must call next() before you can remove an element");
            return;
        }
        pe9 pe9Var = (pe9) this.f67998c.f60818d;
        ((r86) pe9Var.m19082f(this.f67996a)).f58882c = null;
        int i = this.f67996a;
        Object[] objArr = pe9Var.f56015c;
        Object obj = objArr[i];
        Object obj2 = AbstractC3122is.f44471d;
        if (obj != obj2) {
            objArr[i] = obj2;
            pe9Var.f56013a = true;
        }
        this.f67996a = i - 1;
        this.f67997b = false;
    }
}
