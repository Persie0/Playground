package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class old extends olf implements Iterator {
    public old(olh olhVar) {
        super(olhVar);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f46240b;
        olh olhVar = this.f46239a;
        if (i >= olhVar.f46246d) {
            throw new NoSuchElementException();
        }
        this.f46240b = i + 1;
        this.f46241c = i;
        ole oleVar = new ole(olhVar, i);
        m18617a();
        return oleVar;
    }
}
