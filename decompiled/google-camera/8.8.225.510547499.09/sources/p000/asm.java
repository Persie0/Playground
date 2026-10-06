package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asm extends asf {

    /* JADX INFO: renamed from: n */
    int f2255n;

    /* JADX INFO: renamed from: o */
    boolean f2256o;

    /* JADX INFO: renamed from: p */
    private ArrayList f2257p;

    /* JADX INFO: renamed from: q */
    private boolean f2258q;

    /* JADX INFO: renamed from: r */
    private int f2259r;

    public asm(byte[] bArr) {
        this();
        m1961I();
        m1960H(new arv(2));
        m1960H(new ars());
        m1960H(new arv(1));
    }

    /* JADX INFO: renamed from: J */
    private final void m1959J(asf asfVar) {
        this.f2257p.add(asfVar);
        asfVar.f2232e = this;
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: A */
    public final /* bridge */ /* synthetic */ void mo1931A() {
        this.f2259r |= 1;
        ArrayList arrayList = this.f2257p;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((asf) this.f2257p.get(i)).mo1931A();
            }
        }
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: B */
    public final void mo1932B() {
        this.f2259r |= 2;
        int size = this.f2257p.size();
        for (int i = 0; i < size; i++) {
            ((asf) this.f2257p.get(i)).mo1932B();
        }
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void mo1933C(long j) {
        this.f2228a = j;
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: D */
    public final /* bridge */ /* synthetic */ void mo1934D() {
        ArrayList arrayList;
        this.f2229b = 0L;
        if (this.f2229b < 0 || (arrayList = this.f2257p) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((asf) this.f2257p.get(i)).mo1934D();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    @Override // p000.asf
    /* JADX INFO: renamed from: E */
    public final void mo1935E(ViewGroup viewGroup, bbo bboVar, bbo bboVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j;
        long j2 = this.f2228a;
        int size = this.f2257p.size();
        int i = 0;
        while (i < size) {
            asf asfVar = (asf) this.f2257p.get(i);
            if (j2 > 0) {
                if (this.f2258q) {
                    j = asfVar.f2228a;
                    if (j > 0) {
                        asfVar.mo1933C(j + j2);
                    } else {
                        asfVar.mo1933C(j2);
                    }
                } else if (i == 0) {
                    i = 0;
                    j = asfVar.f2228a;
                    if (j > 0) {
                        asfVar.mo1933C(j + j2);
                    } else {
                        asfVar.mo1933C(j2);
                    }
                }
            }
            asfVar.mo1935E(viewGroup, bboVar, bboVar2, arrayList, arrayList2);
            i++;
        }
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: F */
    public final void mo1936F(asn asnVar) {
        this.f2239l = asnVar;
        this.f2259r |= 8;
        int size = this.f2257p.size();
        for (int i = 0; i < size; i++) {
            ((asf) this.f2257p.get(i)).mo1936F(asnVar);
        }
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: G */
    public final void mo1937G(ari ariVar) {
        super.mo1937G(ariVar);
        this.f2259r |= 4;
        if (this.f2257p != null) {
            for (int i = 0; i < this.f2257p.size(); i++) {
                ((asf) this.f2257p.get(i)).mo1937G(ariVar);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m1960H(asf asfVar) {
        m1959J(asfVar);
        if (this.f2229b >= 0) {
            asfVar.mo1934D();
        }
        if ((this.f2259r & 1) != 0) {
            asfVar.mo1931A();
        }
        if ((this.f2259r & 2) != 0) {
            asfVar.mo1932B();
        }
        if ((this.f2259r & 4) != 0) {
            asfVar.mo1937G(this.f2240m);
        }
        if ((this.f2259r & 8) != 0) {
            asfVar.mo1936F(this.f2239l);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1961I() {
        this.f2258q = false;
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: b */
    public final void mo1900b(asq asqVar) {
        if (m1952v(asqVar.f2261b)) {
            ArrayList arrayList = this.f2257p;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                asf asfVar = (asf) arrayList.get(i);
                if (asfVar.m1952v(asqVar.f2261b)) {
                    asfVar.mo1900b(asqVar);
                    asqVar.f2262c.add(asfVar);
                }
            }
        }
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: c */
    public final void mo1901c(asq asqVar) {
        if (m1952v(asqVar.f2261b)) {
            ArrayList arrayList = this.f2257p;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                asf asfVar = (asf) arrayList.get(i);
                if (asfVar.m1952v(asqVar.f2261b)) {
                    asfVar.mo1901c(asqVar);
                    asqVar.f2262c.add(asfVar);
                }
            }
        }
    }

    @Override // p000.asf
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    /* JADX INFO: renamed from: e */
    public final int m1962e() {
        return this.f2257p.size();
    }

    /* JADX INFO: renamed from: f */
    public final asf m1963f(int i) {
        if (i < 0 || i >= this.f2257p.size()) {
            return null;
        }
        return (asf) this.f2257p.get(i);
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: h */
    public final asf clone() {
        asm asmVar = (asm) super.clone();
        asmVar.f2257p = new ArrayList();
        int size = this.f2257p.size();
        for (int i = 0; i < size; i++) {
            asmVar.m1959J(((asf) this.f2257p.get(i)).clone());
        }
        return asmVar;
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: k */
    public final String mo1941k(String str) {
        String strMo1941k = super.mo1941k(str);
        for (int i = 0; i < this.f2257p.size(); i++) {
            strMo1941k = strMo1941k + "\n" + ((asf) this.f2257p.get(i)).mo1941k(str.concat("  "));
        }
        return strMo1941k;
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: l */
    protected final void mo1942l() {
        super.mo1942l();
        int size = this.f2257p.size();
        for (int i = 0; i < size; i++) {
            ((asf) this.f2257p.get(i)).mo1942l();
        }
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: m */
    public final void mo1943m(asq asqVar) {
        int size = this.f2257p.size();
        for (int i = 0; i < size; i++) {
            ((asf) this.f2257p.get(i)).mo1943m(asqVar);
        }
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: q */
    public final void mo1947q(View view) {
        super.mo1947q(view);
        int size = this.f2257p.size();
        for (int i = 0; i < size; i++) {
            ((asf) this.f2257p.get(i)).mo1947q(view);
        }
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: r */
    public final void mo1948r(View view) {
        super.mo1948r(view);
        int size = this.f2257p.size();
        for (int i = 0; i < size; i++) {
            ((asf) this.f2257p.get(i)).mo1948r(view);
        }
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: s */
    protected final void mo1949s() {
        if (this.f2257p.isEmpty()) {
            m1950t();
            m1946p();
            return;
        }
        asl aslVar = new asl(this);
        ArrayList arrayList = this.f2257p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((asf) arrayList.get(i)).m1953w(aslVar);
        }
        this.f2255n = this.f2257p.size();
        if (this.f2258q) {
            ArrayList arrayList2 = this.f2257p;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((asf) arrayList2.get(i2)).mo1949s();
            }
            return;
        }
        for (int i3 = 1; i3 < this.f2257p.size(); i3++) {
            ((asf) this.f2257p.get(i3 - 1)).m1953w(new ask((asf) this.f2257p.get(i3)));
        }
        asf asfVar = (asf) this.f2257p.get(0);
        if (asfVar != null) {
            asfVar.mo1949s();
        }
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: x */
    public final /* bridge */ /* synthetic */ void mo1954x(View view) {
        for (int i = 0; i < this.f2257p.size(); i++) {
            ((asf) this.f2257p.get(i)).mo1954x(view);
        }
        super.mo1954x(view);
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: z */
    public final /* bridge */ /* synthetic */ void mo1956z(View view) {
        for (int i = 0; i < this.f2257p.size(); i++) {
            ((asf) this.f2257p.get(i)).mo1956z(view);
        }
        super.mo1956z(view);
    }

    public asm() {
        this.f2257p = new ArrayList();
        this.f2258q = true;
        this.f2256o = false;
        this.f2259r = 0;
    }
}
