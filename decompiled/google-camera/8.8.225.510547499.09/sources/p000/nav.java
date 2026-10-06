package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nav implements Iterator {

    /* JADX INFO: renamed from: a */
    naw f41906a;

    /* JADX INFO: renamed from: b */
    myx f41907b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ nay f41908c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f41909d;

    public nav(nay nayVar, int i, byte[] bArr) {
        naw nawVarM17227g;
        this.f41909d = i;
        this.f41908c = nayVar;
        Object obj = nayVar.rootReference.f41919a;
        naw nawVar = null;
        if (obj != null) {
            mvu mvuVar = nayVar.range;
            if (mvuVar.f41686b) {
                Object obj2 = mvuVar.f41687c;
                nawVarM17227g = ((naw) obj).m17223c(nayVar.comparator, obj2);
                if (nawVarM17227g != null) {
                    if (nayVar.range.f41690f == 1 && nayVar.comparator.compare(obj2, nawVarM17227g.f41910a) == 0) {
                        nawVarM17227g = nawVarM17227g.m17227g();
                    }
                }
            } else {
                nawVarM17227g = nayVar.header.m17227g();
            }
            if (nawVarM17227g != nayVar.header && nayVar.range.m17035c(nawVarM17227g.f41910a)) {
                nawVar = nawVarM17227g;
            }
        }
        this.f41906a = nawVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f41909d) {
            case 0:
                naw nawVar = this.f41906a;
                if (nawVar == null) {
                    return false;
                }
                if (!this.f41908c.range.m17037e(nawVar.f41910a)) {
                    return true;
                }
                this.f41906a = null;
                return false;
            default:
                naw nawVar2 = this.f41906a;
                if (nawVar2 == null) {
                    return false;
                }
                if (!this.f41908c.range.m17036d(nawVar2.f41910a)) {
                    return true;
                }
                this.f41906a = null;
                return false;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f41909d) {
            case 0:
                break;
        }
        return m17209a();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f41909d) {
            case 0:
                lku.m15614I(this.f41907b != null, "no calls to next() since the last call to remove()");
                this.f41908c.m17246x(this.f41907b.mo17162b());
                this.f41907b = null;
                break;
            default:
                lku.m15614I(this.f41907b != null, "no calls to next() since the last call to remove()");
                this.f41908c.m17246x(this.f41907b.mo17162b());
                this.f41907b = null;
                break;
        }
    }

    public nav(nay nayVar, int i) {
        naw nawVarM17225e;
        this.f41909d = i;
        this.f41908c = nayVar;
        Object obj = nayVar.rootReference.f41919a;
        if (obj == null) {
            nawVarM17225e = null;
        } else {
            mvu mvuVar = nayVar.range;
            if (mvuVar.f41688d) {
                Object obj2 = mvuVar.f41689e;
                nawVarM17225e = ((naw) obj).m17224d(nayVar.comparator, obj2);
                if (nawVarM17225e == null) {
                    nawVarM17225e = null;
                } else if (nayVar.range.f41691g == 1 && nayVar.comparator.compare(obj2, nawVarM17225e.f41910a) == 0) {
                    nawVarM17225e = nawVarM17225e.m17225e();
                }
            } else {
                nawVarM17225e = nayVar.header.m17225e();
            }
            if (nawVarM17225e == nayVar.header || !nayVar.range.m17035c(nawVarM17225e.f41910a)) {
                nawVarM17225e = null;
            }
        }
        this.f41906a = nawVarM17225e;
        this.f41907b = null;
    }

    /* JADX INFO: renamed from: a */
    public final myx m17209a() {
        switch (this.f41909d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                naw nawVar = this.f41906a;
                nawVar.getClass();
                myx myxVarM17245u = this.f41908c.m17245u(nawVar);
                this.f41907b = myxVarM17245u;
                if (nawVar.m17225e() == this.f41908c.header) {
                    this.f41906a = null;
                } else {
                    this.f41906a = this.f41906a.m17225e();
                }
                return myxVarM17245u;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                nay nayVar = this.f41908c;
                naw nawVar2 = this.f41906a;
                nawVar2.getClass();
                myx myxVarM17245u2 = nayVar.m17245u(nawVar2);
                this.f41907b = myxVarM17245u2;
                if (nawVar2.m17227g() == this.f41908c.header) {
                    this.f41906a = null;
                } else {
                    this.f41906a = this.f41906a.m17227g();
                }
                return myxVarM17245u2;
        }
    }
}
