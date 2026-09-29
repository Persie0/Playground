package bm;

import dm.C5207g;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;
import p249lo.InterfaceC7415h;

/* JADX INFO: renamed from: bm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1616b implements InterfaceC7415h<String> {

    /* JADX INFO: renamed from: a */
    public final BufferedReader f9134a;

    /* JADX INFO: renamed from: bm.b$a */
    public static final class a implements Iterator<String>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public String f9135a;

        /* JADX INFO: renamed from: b */
        public boolean f9136b;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() throws IOException {
            if (this.f9135a == null && !this.f9136b) {
                String line = C1616b.this.f9134a.readLine();
                this.f9135a = line;
                if (line == null) {
                    this.f9136b = true;
                }
            }
            return this.f9135a != null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f9135a;
            this.f9135a = null;
            C5207g.m11108c(str);
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1616b(BufferedReader bufferedReader) {
        this.f9134a = bufferedReader;
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<String> iterator() {
        return new a();
    }
}
