package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class je0 implements oe0 {

    /* JADX INFO: renamed from: a */
    public final pya f45453a;

    public je0(pya pyaVar) {
        pyaVar.getClass();
        this.f45453a = pyaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je0) && fa4.m11650l(this.f45453a, ((je0) obj).f45453a);
    }

    public final int hashCode() {
        return this.f45453a.hashCode();
    }

    public final String toString() {
        return "BookSelected(book=" + this.f45453a + ")";
    }
}
