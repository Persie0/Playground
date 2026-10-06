package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olg extends olf implements Iterator {

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f46242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olg(olh olhVar, int i, byte[] bArr) {
        super(olhVar);
        this.f46242d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olg(olh olhVar, int i) {
        super(olhVar);
        this.f46242d = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f46242d) {
            case 0:
                int i = this.f46240b;
                olh olhVar = this.f46239a;
                if (i >= olhVar.f46246d) {
                    throw new NoSuchElementException();
                }
                this.f46240b = i + 1;
                this.f46241c = i;
                Object[] objArr = olhVar.f46244b;
                objArr.getClass();
                Object obj = objArr[i];
                m18617a();
                return obj;
            default:
                int i2 = this.f46240b;
                olh olhVar2 = this.f46239a;
                if (i2 >= olhVar2.f46246d) {
                    throw new NoSuchElementException();
                }
                this.f46240b = i2 + 1;
                this.f46241c = i2;
                Object obj2 = olhVar2.f46243a[i2];
                m18617a();
                return obj2;
        }
    }
}
