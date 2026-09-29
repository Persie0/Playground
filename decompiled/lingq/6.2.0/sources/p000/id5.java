package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class id5 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public String f43969a;

    /* JADX INFO: renamed from: b */
    public boolean f43970b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jd5 f43971c;

    public id5(jd5 jd5Var) {
        this.f43971c = jd5Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f43969a == null && !this.f43970b) {
            String line = ((BufferedReader) this.f43971c.f45441b).readLine();
            this.f43969a = line;
            if (line == null) {
                this.f43970b = true;
            }
        }
        return this.f43969a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        String str = this.f43969a;
        this.f43969a = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
