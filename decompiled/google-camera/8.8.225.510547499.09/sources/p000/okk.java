package p000;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class okk implements Iterator {

    /* JADX INFO: renamed from: a */
    public Object f46197a;

    /* JADX INFO: renamed from: b */
    public int f46198b = 2;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ooz f46199c;

    /* JADX INFO: renamed from: d */
    private final ArrayDeque f46200d;

    public okk() {
    }

    /* JADX INFO: renamed from: b */
    private static final omt m18592b(File file) {
        return new omt(file);
    }

    /* JADX INFO: renamed from: a */
    protected final void m18593a() {
        this.f46198b = 3;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f46198b = 2;
        return this.f46197a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public okk(ooz oozVar, byte[] bArr) {
        this.f46199c = oozVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f46200d = arrayDeque;
        if (((File) oozVar.f46361a).isDirectory()) {
            arrayDeque.push(m18592b((File) oozVar.f46361a));
        } else if (((File) oozVar.f46361a).isFile()) {
            arrayDeque.push(new omu((File) oozVar.f46361a));
        } else {
            m18593a();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f46198b;
        if (i == 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = i - 1;
        File file = null;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return true;
            case 1:
            default:
                this.f46198b = 4;
                while (true) {
                    omv omvVar = (omv) this.f46200d.peek();
                    if (omvVar != null) {
                        File fileMo18724a = omvVar.mo18724a();
                        if (fileMo18724a == null) {
                            this.f46200d.pop();
                        } else if (ooc.m18737c(fileMo18724a, omvVar.f46326a) || !fileMo18724a.isDirectory() || this.f46200d.size() >= Integer.MAX_VALUE) {
                            file = fileMo18724a;
                        } else {
                            this.f46200d.push(m18592b(fileMo18724a));
                        }
                    }
                }
                if (file != null) {
                    this.f46197a = file;
                    this.f46198b = 1;
                } else {
                    m18593a();
                }
                return this.f46198b == 1;
            case 2:
                return false;
        }
    }
}
