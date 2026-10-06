package p000;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nay extends mtx implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient naw header;
    public final transient mvu range;
    public final transient nax rootReference;

    public nay(nax naxVar, mvu mvuVar, naw nawVar) {
        super(mvuVar.f41685a);
        this.rootReference = naxVar;
        this.range = mvuVar;
        this.header = nawVar;
    }

    /* JADX INFO: renamed from: A */
    private final long m17239A(int i) {
        naw nawVar = (naw) this.rootReference.f41919a;
        long jM16777p = mpw.m16777p(i, nawVar);
        if (this.range.f41686b) {
            jM16777p -= m17244z(i, nawVar);
        }
        return this.range.f41688d ? jM16777p - m17243y(i, nawVar) : jM16777p;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        mpw.m16760L(mtx.class, "comparator").m16213b(this, comparator);
        mpw.m16760L(nay.class, "range").m16213b(this, mvu.m17033a(comparator));
        mpw.m16760L(nay.class, "rootReference").m16213b(this, new nax());
        naw nawVar = new naw();
        mpw.m16760L(nay.class, "header").m16213b(this, nawVar);
        m17241v(nawVar, nawVar);
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            mo16922h(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* JADX INFO: renamed from: t */
    static int m17240t(naw nawVar) {
        if (nawVar == null) {
            return 0;
        }
        return nawVar.f41912c;
    }

    /* JADX INFO: renamed from: v */
    public static void m17241v(naw nawVar, naw nawVar2) {
        nawVar.f41917h = nawVar2;
        nawVar2.f41916g = nawVar;
    }

    /* JADX INFO: renamed from: w */
    public static void m17242w(naw nawVar, naw nawVar2, naw nawVar3) {
        m17241v(nawVar, nawVar2);
        m17241v(nawVar2, nawVar3);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(mo16920f().comparator());
        objectOutputStream.writeInt(mo16921g().size());
        for (myx myxVar : mo16921g()) {
            objectOutputStream.writeObject(myxVar.mo17162b());
            objectOutputStream.writeInt(myxVar.mo17161a());
        }
    }

    /* JADX INFO: renamed from: y */
    private final long m17243y(int i, naw nawVar) {
        if (nawVar == null) {
            return 0L;
        }
        int iCompare = this.comparator.compare(this.range.f41689e, nawVar.f41910a);
        if (iCompare > 0) {
            return m17243y(i, nawVar.f41915f);
        }
        if (iCompare != 0) {
            return mpw.m16777p(i, nawVar.f41915f) + ((long) mpw.m16776o(i, nawVar)) + m17243y(i, nawVar.f41914e);
        }
        switch (this.range.f41691g - 1) {
            case 0:
                return ((long) mpw.m16776o(i, nawVar)) + mpw.m16777p(i, nawVar.f41915f);
            default:
                return mpw.m16777p(i, nawVar.f41915f);
        }
    }

    /* JADX INFO: renamed from: z */
    private final long m17244z(int i, naw nawVar) {
        if (nawVar == null) {
            return 0L;
        }
        int iCompare = this.comparator.compare(this.range.f41687c, nawVar.f41910a);
        if (iCompare < 0) {
            return m17244z(i, nawVar.f41914e);
        }
        if (iCompare != 0) {
            return mpw.m16777p(i, nawVar.f41914e) + ((long) mpw.m16776o(i, nawVar)) + m17244z(i, nawVar.f41915f);
        }
        switch (this.range.f41690f - 1) {
            case 0:
                return ((long) mpw.m16776o(i, nawVar)) + mpw.m16777p(i, nawVar.f41914e);
            default:
                return mpw.m16777p(i, nawVar.f41914e);
        }
    }

    @Override // p000.mts
    /* JADX INFO: renamed from: b */
    public final int mo16909b() {
        return kxk.m14984ab(m17239A(2));
    }

    @Override // p000.mts
    /* JADX INFO: renamed from: c */
    public final Iterator mo16910c() {
        return new nav(this, 1, null);
    }

    @Override // p000.myy
    /* JADX INFO: renamed from: co */
    public final int mo16911co(Object obj) {
        try {
            Object obj2 = this.rootReference.f41919a;
            if (!this.range.m17035c(obj) || obj2 == null) {
                return 0;
            }
            return ((naw) obj2).m17221a(this.comparator, obj);
        } catch (ClassCastException | NullPointerException e) {
            return 0;
        }
    }

    @Override // p000.mts, p000.myy
    /* JADX INFO: renamed from: d */
    public final int mo16918d(Object obj, int i) {
        lku.m15655i(i, "occurrences");
        Object obj2 = this.rootReference.f41919a;
        int[] iArr = new int[1];
        try {
            if (!this.range.m17035c(obj) || obj2 == null) {
                return 0;
            }
            this.rootReference.m17233a(obj2, ((naw) obj2).m17226f(this.comparator, obj, i, iArr));
            return iArr[0];
        } catch (ClassCastException | NullPointerException e) {
            return 0;
        }
    }

    @Override // p000.mts, p000.myy
    /* JADX INFO: renamed from: h */
    public final void mo16922h(Object obj, int i) {
        lku.m15655i(i, "occurrences");
        if (i == 0) {
            mo16911co(obj);
            return;
        }
        lku.m15669w(this.range.m17035c(obj));
        Object obj2 = this.rootReference.f41919a;
        if (obj2 != null) {
            naw nawVar = (naw) obj2;
            this.rootReference.m17233a(obj2, nawVar.m17222b(this.comparator, obj, i, new int[1]));
            return;
        }
        this.comparator.compare(obj, obj);
        naw nawVar2 = new naw(obj, i);
        naw nawVar3 = this.header;
        m17242w(nawVar3, nawVar2, nawVar3);
        this.rootReference.m17233a(null, nawVar2);
    }

    @Override // p000.mts, p000.myy
    /* JADX INFO: renamed from: i */
    public final boolean mo16923i(Object obj, int i) {
        lku.m15655i(0, BEeWZPor.CBFJK);
        lku.m15655i(i, "oldCount");
        lku.m15669w(this.range.m17035c(obj));
        Object obj2 = this.rootReference.f41919a;
        if (obj2 == null) {
            return i == 0;
        }
        int[] iArr = new int[1];
        this.rootReference.m17233a(obj2, ((naw) obj2).m17228h(this.comparator, obj, i, iArr));
        return iArr[0] == i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.myy
    public final Iterator iterator() {
        return mkv.m16556u(this);
    }

    @Override // p000.mtx
    /* JADX INFO: renamed from: o */
    public final Iterator mo16933o() {
        return new nav(this, 0);
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: r */
    public final naf mo17016r(Object obj, int i) {
        return new nay(this.rootReference, this.range.m17034b(new mvu(this.comparator, false, null, 1, true, obj, i)), this.header);
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: s */
    public final naf mo17017s(Object obj, int i) {
        return new nay(this.rootReference, this.range.m17034b(new mvu(this.comparator, true, obj, i, false, null, 1)), this.header);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.myy
    public final int size() {
        return kxk.m14984ab(m17239A(1));
    }

    /* JADX INFO: renamed from: u */
    public final myx m17245u(naw nawVar) {
        return new nau(this, nawVar);
    }

    /* JADX INFO: renamed from: x */
    public final void m17246x(Object obj) {
        lku.m15655i(0, "count");
        if (!this.range.m17035c(obj)) {
            lku.m15669w(true);
            return;
        }
        Object obj2 = this.rootReference.f41919a;
        if (obj2 == null) {
            return;
        }
        naw nawVar = (naw) obj2;
        this.rootReference.m17233a(obj2, nawVar.m17229i(this.comparator, obj, new int[1]));
    }

    public nay(Comparator comparator) {
        super(comparator);
        this.range = mvu.m17033a(comparator);
        naw nawVar = new naw();
        this.header = nawVar;
        m17241v(nawVar, nawVar);
        this.rootReference = new nax();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        mvu mvuVar = this.range;
        if (mvuVar.f41686b || mvuVar.f41688d) {
            mkv.m16511S(mo16910c());
            return;
        }
        naw nawVarM17227g = this.header.m17227g();
        while (true) {
            naw nawVar = this.header;
            if (nawVarM17227g == nawVar) {
                m17241v(nawVar, nawVar);
                this.rootReference.f41919a = null;
                return;
            }
            naw nawVarM17227g2 = nawVarM17227g.m17227g();
            nawVarM17227g.f41911b = 0;
            nawVarM17227g.f41914e = null;
            nawVarM17227g.f41915f = null;
            nawVarM17227g.f41916g = null;
            nawVarM17227g.f41917h = null;
            nawVarM17227g = nawVarM17227g2;
        }
    }
}
