package p000;

import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.io.File;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krt {

    /* JADX INFO: renamed from: a */
    public final krm f37085a;

    /* JADX INFO: renamed from: b */
    public final String f37086b;

    /* JADX INFO: renamed from: c */
    public final String f37087c;

    /* JADX INFO: renamed from: d */
    public final String f37088d;

    /* JADX INFO: renamed from: e */
    public final String f37089e;

    public krt(krm krmVar, String str, String str2, String str3, String str4) {
        if (krmVar == null) {
            throw new NullPointerException(DNTdN.KQradkDw);
        }
        this.f37085a = krmVar;
        if (str == null) {
            throw new NullPointerException("Null subpath");
        }
        this.f37086b = str;
        this.f37087c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null extension");
        }
        this.f37088d = str3;
        this.f37089e = str4;
    }

    /* JADX INFO: renamed from: a */
    public static krt m14783a(krm krmVar, String str, String str2, String str3, String str4) {
        String strM15011d;
        boolean z = true;
        if (!mro.m16832b(str4) && !"text/plain".equals(str4) && !"application/octet-stream".equals(str4) && ((strM15011d = kxk.m15011d(str3)) == null || !strM15011d.equals(str4))) {
            z = false;
        }
        lku.m15669w(z);
        lku.m15610E(krmVar.m14773c(str4), "Cannot publish %s to %s", str4, krmVar);
        return new krt(krmVar, str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: b */
    final File m14784b(krj krjVar) {
        File fileM14771a = this.f37085a.m14771a(krjVar.f37051a);
        if (!mro.m16832b(this.f37086b)) {
            fileM14771a = new File(fileM14771a, this.f37086b);
        }
        return new File(fileM14771a, this.f37087c + "." + this.f37088d);
    }

    /* JADX INFO: renamed from: c */
    public final String m14785c() {
        return (mro.m16832b(this.f37086b) ? "" : this.f37086b.concat("/")) + this.f37087c + "." + this.f37088d;
    }

    /* JADX INFO: renamed from: d */
    final boolean m14786d() {
        return this.f37085a.m14772b() && this.f37085a.m14773c(this.f37089e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof krt) {
            krt krtVar = (krt) obj;
            if (this.f37085a.equals(krtVar.f37085a) && this.f37086b.equals(krtVar.f37086b) && this.f37087c.equals(krtVar.f37087c) && this.f37088d.equals(krtVar.f37088d) && this.f37089e.equals(krtVar.f37089e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f37085a.hashCode() ^ 1000003) * 1000003) ^ this.f37086b.hashCode()) * 1000003) ^ this.f37087c.hashCode()) * 1000003) ^ this.f37088d.hashCode()) * 1000003) ^ this.f37089e.hashCode();
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[5];
        objArr[0] = this.f37085a.toString();
        objArr[1] = mro.m16832b(this.f37086b) ? "" : this.f37086b.concat("/");
        objArr[2] = this.f37087c;
        objArr[3] = this.f37088d;
        objArr[4] = this.f37089e;
        return String.format(locale, "%s/%s%s.%s (%s)", objArr);
    }

    public krt() {
    }
}
