package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khq implements klb {

    /* JADX INFO: renamed from: a */
    public final Set f36077a;

    /* JADX INFO: renamed from: c */
    public final kho f36079c;

    /* JADX INFO: renamed from: f */
    private int f36082f;

    /* JADX INFO: renamed from: g */
    private boolean f36083g;

    /* JADX INFO: renamed from: i */
    private final ihk f36085i;

    /* JADX INFO: renamed from: e */
    private kpp f36081e = null;

    /* JADX INFO: renamed from: h */
    private boolean f36084h = false;

    /* JADX INFO: renamed from: b */
    public kfd f36078b = null;

    /* JADX INFO: renamed from: d */
    private final List f36080d = new ArrayList();

    public khq(ihk ihkVar, kho khoVar, Set set, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f36079c = khoVar;
        this.f36077a = set;
        this.f36085i = ihkVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: p */
    public static khq m14274p(khb khbVar, kho khoVar, Set set) {
        mxk<klc> mxkVarM17134F = mxk.m17134F(set);
        lku.m15657k(mxkVarM17134F.size() == khoVar.f36067c.size());
        for (klc klcVar : mxkVarM17134F) {
            lku.m15660n(khoVar.f36067c.contains(klcVar.mo14461d()), "%s is not present in %s", klcVar.mo14461d(), khoVar);
        }
        ihk ihkVar = (ihk) khbVar.f36008a.get();
        ihkVar.getClass();
        khoVar.getClass();
        mxkVarM17134F.getClass();
        khq khqVar = new khq(ihkVar, khoVar, mxkVarM17134F, null, null, null);
        Iterator it = mxkVarM17134F.iterator();
        while (it.hasNext()) {
            ((klc) it.next()).mo14463i(khqVar);
        }
        return khqVar;
    }

    /* JADX INFO: renamed from: q */
    private final boolean m14275q() {
        return this.f36078b != null && this.f36083g && this.f36082f == this.f36077a.size();
    }

    /* JADX INFO: renamed from: r */
    private final void m14276r(kfv kfvVar) {
        if (this.f36078b == null) {
            this.f36085i.m11354v(kfvVar, true, false, null, false, null, false, false);
        } else {
            this.f36085i.m11354v(kfvVar, false, false, null, !this.f36083g, null, this.f36082f != this.f36077a.size(), !m14275q());
        }
    }

    /* JADX INFO: renamed from: a */
    public final kba m14277a(boolean z) {
        if (this.f36077a.isEmpty()) {
            return null;
        }
        if (this.f36077a.size() == 1) {
            klc klcVar = (klc) this.f36077a.iterator().next();
            return z ? klcVar.mo14459b() : klcVar.mo14458a();
        }
        jvb jvbVar = new jvb();
        boolean z2 = false;
        for (klc klcVar2 : this.f36077a) {
            kba kbaVarMo14459b = z ? klcVar2.mo14459b() : klcVar2.mo14458a();
            z2 |= kbaVarMo14459b != null;
            if (kbaVarMo14459b != null) {
                jvbVar.m13537d(kbaVarMo14459b);
            }
        }
        if (z2) {
            return jvbVar;
        }
        jvbVar.close();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final kba m14278b() {
        return m14277a(true);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized klc m14279c(kgg kggVar) {
        for (klc klcVar : this.f36077a) {
            if (klcVar.mo14461d().equals(kggVar)) {
            }
        }
        throw new IllegalArgumentException("Unknown stream " + String.valueOf(kggVar) + " requested for " + toString());
        return klcVar;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized kpp m14280d() {
        return this.f36081e;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized kpw m14281e(kgg kggVar) {
        synchronized (this) {
            if (this.f36082f >= this.f36077a.size() && !this.f36084h) {
                return m14279c(kggVar).mo14462h();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m14282f() {
        if (!this.f36084h && !m14275q()) {
            this.f36084h = true;
            Iterator it = this.f36080d.iterator();
            while (it.hasNext()) {
                m14276r((kfv) it.next());
            }
            this.f36080d.clear();
        }
    }

    /* JADX INFO: renamed from: g */
    final void m14283g() {
        kba kbaVarM14277a = m14277a(false);
        if (kbaVarM14277a != null) {
            kbaVarM14277a.close();
        }
    }

    @Override // p000.klb
    /* JADX INFO: renamed from: h */
    public final synchronized void mo14284h() {
        boolean z = true;
        int i = this.f36082f + 1;
        this.f36082f = i;
        if (i > this.f36077a.size()) {
            z = false;
        }
        lku.m15657k(z);
        if (this.f36082f == this.f36077a.size()) {
            boolean zM14275q = m14275q();
            Iterator it = this.f36080d.iterator();
            while (it.hasNext()) {
                this.f36085i.m11354v((kfv) it.next(), false, false, null, false, null, true, zM14275q);
            }
            if (zM14275q) {
                this.f36080d.clear();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m14285i(kfd kfdVar) {
        if (this.f36084h) {
            return;
        }
        lku.m15657k(true);
        lku.m15659m(this.f36078b == null, "FrameId should only be set once", new Object[0]);
        lku.m15659m(this.f36081e == null, "setFrameId must ALWAYS come before setMetadata.", new Object[0]);
        lku.m15658l(true ^ this.f36083g, "Metadata was already set for frame %s!", kfdVar);
        this.f36078b = kfdVar;
        Iterator it = this.f36077a.iterator();
        while (it.hasNext()) {
            ((klc) it.next()).mo14464j(kfdVar);
        }
        boolean zM14275q = m14275q();
        Iterator it2 = this.f36080d.iterator();
        while (it2.hasNext()) {
            this.f36085i.m11354v((kfv) it2.next(), false, true, this.f36078b, false, null, false, zM14275q);
        }
        if (zM14275q) {
            this.f36080d.clear();
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m14286j(kpp kppVar) {
        if (this.f36084h) {
            return;
        }
        boolean z = kppVar == null || this.f36078b != null;
        lku.m15659m(z, "setFrameId must ALWAYS come before setMetadata.", new Object[0]);
        lku.m15658l(!this.f36083g, "Metadata was already set for frame %s!", this.f36078b);
        this.f36083g = true;
        this.f36081e = kppVar;
        boolean zM14275q = m14275q();
        Iterator it = this.f36080d.iterator();
        while (it.hasNext()) {
            this.f36085i.m11354v((kfv) it.next(), false, false, null, true, this.f36081e, false, zM14275q);
        }
        if (zM14275q) {
            this.f36080d.clear();
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized boolean m14287k() {
        return m14275q() || this.f36084h;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized boolean m14288l() {
        return this.f36078b != null || m14287k();
    }

    /* JADX INFO: renamed from: m */
    public final synchronized boolean m14289m() {
        return this.f36082f == this.f36077a.size() || m14287k();
    }

    /* JADX INFO: renamed from: n */
    public final synchronized boolean m14290n() {
        return this.f36083g || m14287k();
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m14291o(kfv kfvVar) {
        boolean zM14275q = m14275q();
        if (this.f36084h && !zM14275q) {
            m14276r(kfvVar);
            return;
        }
        if (!zM14275q) {
            this.f36080d.add(kfvVar);
        }
        ihk ihkVar = this.f36085i;
        kfd kfdVar = this.f36078b;
        ihkVar.m11354v(kfvVar, false, kfdVar != null, kfdVar, this.f36083g, this.f36081e, this.f36082f == this.f36077a.size(), zM14275q);
    }

    public final synchronized String toString() {
        Long lValueOf;
        kfd kfdVar = this.f36078b;
        lValueOf = kfdVar == null ? null : Long.valueOf(kfdVar.f35812c);
        StringBuilder sb = new StringBuilder();
        sb.append("Frame-");
        sb.append(lValueOf);
        return "Frame-".concat(String.valueOf(lValueOf));
    }
}
