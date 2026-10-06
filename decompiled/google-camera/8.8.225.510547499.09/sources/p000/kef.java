package p000;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kef {

    /* JADX INFO: renamed from: b */
    public byte[] f35719b;

    /* JADX INFO: renamed from: d */
    public final ByteOrder f35721d;

    /* JADX INFO: renamed from: a */
    public final keq[] f35718a = new keq[5];

    /* JADX INFO: renamed from: c */
    public final ArrayList f35720c = new ArrayList();

    public kef(ByteOrder byteOrder) {
        this.f35721d = byteOrder;
    }

    /* JADX INFO: renamed from: a */
    protected final int m14022a() {
        return this.f35720c.size();
    }

    /* JADX INFO: renamed from: b */
    public final keq m14023b(int i) {
        if (ken.m14045f(i)) {
            return this.f35718a[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    protected final List m14024c() {
        ArrayList arrayList = new ArrayList();
        keq[] keqVarArr = this.f35718a;
        for (int i = 0; i < 5; i++) {
            keq keqVar = keqVarArr[i];
            if (keqVar != null) {
                for (ken kenVar : keqVar.m14077d()) {
                    if (kenVar != null) {
                        arrayList.add(kenVar);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m14025d(keq keqVar) {
        this.f35718a[keqVar.f35785b] = keqVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m14026e() {
        this.f35719b = null;
        this.f35720c.clear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof kef)) {
            kef kefVar = (kef) obj;
            if (kefVar.f35721d == this.f35721d && kefVar.f35720c.size() == this.f35720c.size() && Arrays.equals(kefVar.f35719b, this.f35719b)) {
                for (int i = 0; i < this.f35720c.size(); i++) {
                    if (!Arrays.equals((byte[]) kefVar.f35720c.get(i), (byte[]) this.f35720c.get(i))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < 5; i2++) {
                    keq keqVarM14023b = kefVar.m14023b(i2);
                    keq keqVarM14023b2 = m14023b(i2);
                    if (keqVarM14023b != null && !keqVarM14023b.equals(keqVarM14023b2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m14027f() {
        return this.f35719b != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m14028g() {
        return !this.f35720c.isEmpty();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14029h(short s, int i) {
        keq keqVar = this.f35718a[i];
        if (keqVar == null) {
            return false;
        }
        keqVar.m14076c(s);
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f35718a)), Integer.valueOf(Arrays.hashCode(this.f35719b)), this.f35720c, this.f35721d});
    }

    /* JADX INFO: renamed from: i */
    protected final byte[] m14030i(int i) {
        return (byte[]) this.f35720c.get(i);
    }

    /* JADX INFO: renamed from: j */
    public final void m14031j(ken kenVar) {
        if (kenVar != null) {
            int i = kenVar.f35769e;
            if (ken.m14045f(i)) {
                keq keqVar = this.f35718a[i];
                if (keqVar == null) {
                    keqVar = new keq(i);
                    this.f35718a[i] = keqVar;
                }
                keqVar.m14078e(kenVar);
            }
        }
    }
}
