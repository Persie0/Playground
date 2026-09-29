package p000;

import java.io.File;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class d57 implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final String f35013b;

    /* JADX INFO: renamed from: a */
    public final ByteString f35014a;

    static {
        String str = File.separator;
        str.getClass();
        f35013b = str;
    }

    public d57(ByteString byteString) {
        byteString.getClass();
        this.f35014a = byteString;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m10103a() {
        ArrayList arrayList = new ArrayList();
        int iM9949a = AbstractC2909d.m9949a(this);
        ByteString byteString = this.f35014a;
        if (iM9949a == -1) {
            iM9949a = 0;
        } else if (iM9949a < byteString.mo18078d() && byteString.mo18082i(iM9949a) == 92) {
            iM9949a++;
        }
        int iMo18078d = byteString.mo18078d();
        int i = iM9949a;
        while (iM9949a < iMo18078d) {
            if (byteString.mo18082i(iM9949a) == 47 || byteString.mo18082i(iM9949a) == 92) {
                arrayList.add(byteString.mo18087o(i, iM9949a));
                i = iM9949a + 1;
            }
            iM9949a++;
        }
        if (i < byteString.mo18078d()) {
            arrayList.add(byteString.mo18087o(i, byteString.mo18078d()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final String m10104b() {
        ByteString byteString = AbstractC2909d.f34749a;
        ByteString byteStringM18074p = this.f35014a;
        int iM18073k = ByteString.m18073k(byteStringM18074p, byteString);
        if (iM18073k == -1) {
            iM18073k = ByteString.m18073k(byteStringM18074p, AbstractC2909d.f34750b);
        }
        if (iM18073k != -1) {
            byteStringM18074p = ByteString.m18074p(byteStringM18074p, iM18073k + 1, 0, 2);
        } else if (m10108f() != null && byteStringM18074p.mo18078d() == 2) {
            byteStringM18074p = ByteString.f54513d;
        }
        return byteStringM18074p.m18089r();
    }

    /* JADX INFO: renamed from: c */
    public final d57 m10105c() {
        ByteString byteString = AbstractC2909d.f34752d;
        ByteString byteString2 = this.f35014a;
        if (fa4.m11650l(byteString2, byteString)) {
            return null;
        }
        ByteString byteString3 = AbstractC2909d.f34749a;
        if (fa4.m11650l(byteString2, byteString3)) {
            return null;
        }
        ByteString byteString4 = AbstractC2909d.f34750b;
        if (fa4.m11650l(byteString2, byteString4)) {
            return null;
        }
        ByteString byteString5 = AbstractC2909d.f34753e;
        byteString2.getClass();
        byteString5.getClass();
        int iMo18078d = byteString2.mo18078d();
        byte[] bArr = byteString5.f54514a;
        if (byteString2.mo18084l(iMo18078d - bArr.length, byteString5, bArr.length) && (byteString2.mo18078d() == 2 || byteString2.mo18084l(byteString2.mo18078d() - 3, byteString3, 1) || byteString2.mo18084l(byteString2.mo18078d() - 3, byteString4, 1))) {
            return null;
        }
        int iM18073k = ByteString.m18073k(byteString2, byteString3);
        if (iM18073k == -1) {
            iM18073k = ByteString.m18073k(byteString2, byteString4);
        }
        if (iM18073k == 2 && m10108f() != null) {
            if (byteString2.mo18078d() == 3) {
                return null;
            }
            return new d57(ByteString.m18074p(byteString2, 0, 3, 1));
        }
        if (iM18073k == 1) {
            byteString4.getClass();
            if (byteString2.mo18084l(0, byteString4, byteString4.mo18078d())) {
                return null;
            }
        }
        if (iM18073k != -1 || m10108f() == null) {
            if (iM18073k == -1) {
                return new d57(byteString);
            }
            return iM18073k == 0 ? new d57(ByteString.m18074p(byteString2, 0, 1, 1)) : new d57(ByteString.m18074p(byteString2, 0, iM18073k, 1));
        }
        if (byteString2.mo18078d() == 2) {
            return null;
        }
        return new d57(ByteString.m18074p(byteString2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d57 d57Var = (d57) obj;
        d57Var.getClass();
        return this.f35014a.compareTo(d57Var.f35014a);
    }

    /* JADX INFO: renamed from: d */
    public final d57 m10106d(d57 d57Var) {
        d57Var.getClass();
        ByteString byteString = d57Var.f35014a;
        int iM9949a = AbstractC2909d.m9949a(this);
        ByteString byteString2 = this.f35014a;
        d57 d57Var2 = iM9949a == -1 ? null : new d57(byteString2.mo18087o(0, iM9949a));
        int iM9949a2 = AbstractC2909d.m9949a(d57Var);
        if (!fa4.m11650l(d57Var2, iM9949a2 == -1 ? null : new d57(byteString.mo18087o(0, iM9949a2)))) {
            ij6.m13963u("Paths of different roots cannot be relative to each other: ", this, " and ", d57Var);
            return null;
        }
        ArrayList arrayListM10103a = m10103a();
        ArrayList arrayListM10103a2 = d57Var.m10103a();
        int iMin = Math.min(arrayListM10103a.size(), arrayListM10103a2.size());
        int i = 0;
        while (i < iMin && fa4.m11650l(arrayListM10103a.get(i), arrayListM10103a2.get(i))) {
            i++;
        }
        if (i == iMin && byteString2.mo18078d() == byteString.mo18078d()) {
            return gz8.m12976h(".", false);
        }
        if (arrayListM10103a2.subList(i, arrayListM10103a2.size()).indexOf(AbstractC2909d.f34753e) != -1) {
            ij6.m13963u("Impossible relative path to resolve: ", this, " and ", d57Var);
            return null;
        }
        if (fa4.m11650l(byteString, AbstractC2909d.f34752d)) {
            return this;
        }
        aj0 aj0Var = new aj0();
        ByteString byteStringM9951c = AbstractC2909d.m9951c(d57Var);
        if (byteStringM9951c == null && (byteStringM9951c = AbstractC2909d.m9951c(this)) == null) {
            byteStringM9951c = AbstractC2909d.m9954f(f35013b);
        }
        int size = arrayListM10103a2.size();
        for (int i2 = i; i2 < size; i2++) {
            aj0Var.m486j0(AbstractC2909d.f34753e);
            aj0Var.m486j0(byteStringM9951c);
        }
        int size2 = arrayListM10103a.size();
        while (i < size2) {
            aj0Var.m486j0((ByteString) arrayListM10103a.get(i));
            aj0Var.m486j0(byteStringM9951c);
            i++;
        }
        return AbstractC2909d.m9952d(aj0Var, false);
    }

    /* JADX INFO: renamed from: e */
    public final d57 m10107e(String str) {
        str.getClass();
        aj0 aj0Var = new aj0();
        aj0Var.m495q0(str);
        return AbstractC2909d.m9950b(this, AbstractC2909d.m9952d(aj0Var, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d57) && fa4.m11650l(((d57) obj).f35014a, this.f35014a);
    }

    /* JADX INFO: renamed from: f */
    public final Character m10108f() {
        ByteString byteString = AbstractC2909d.f34749a;
        ByteString byteString2 = this.f35014a;
        if (ByteString.m18072g(byteString2, byteString) != -1 || byteString2.mo18078d() < 2 || byteString2.mo18082i(1) != 58) {
            return null;
        }
        char cMo18082i = (char) byteString2.mo18082i(0);
        if (('a' > cMo18082i || cMo18082i >= '{') && ('A' > cMo18082i || cMo18082i >= '[')) {
            return null;
        }
        return Character.valueOf(cMo18082i);
    }

    public final int hashCode() {
        return this.f35014a.hashCode();
    }

    public final File toFile() {
        return new File(this.f35014a.m18089r());
    }

    public final String toString() {
        return this.f35014a.m18089r();
    }
}
