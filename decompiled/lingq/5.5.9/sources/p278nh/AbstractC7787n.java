package p278nh;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: renamed from: nh.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7787n {

    /* JADX INFO: renamed from: nh.n$a */
    public static final class a extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final long f42743a;

        /* JADX INFO: renamed from: b */
        public final String f42744b;

        /* JADX INFO: renamed from: c */
        public final int f42745c;

        public a(String str, int i10, long j10) {
            this.f42743a = j10;
            this.f42744b = str;
            this.f42745c = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f42743a == aVar.f42743a && C5207g.m11106a(this.f42744b, aVar.f42744b) && this.f42745c == aVar.f42745c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42745c) + C0166e.m758d(this.f42744b, Long.hashCode(this.f42743a) * 31, 31);
        }

        public final String toString() {
            return "About(versionCode=" + this.f42743a + ", versionName=" + this.f42744b + ", key=" + this.f42745c + ")";
        }
    }

    /* JADX INFO: renamed from: nh.n$b */
    public static final class b extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final int f42746a;

        public b(int i10) {
            this.f42746a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f42746a == ((b) obj).f42746a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42746a);
        }

        public final String toString() {
            return C0166e.m768o(new StringBuilder("CategoryTitle(title="), this.f42746a, ")");
        }
    }

    /* JADX INFO: renamed from: nh.n$c */
    public static final class c extends AbstractC7787n {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return C5207g.m11106a(null, null);
        }

        public final int hashCode() {
            return (Integer.hashCode(0) * 31) + 0;
        }

        public final String toString() {
            return "Description(value=0, key=null)";
        }
    }

    /* JADX INFO: renamed from: nh.n$d */
    public static final class d extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public static final d f42747a = new d();
    }

    /* JADX INFO: renamed from: nh.n$e */
    public static final class e extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final String f42748a;

        /* JADX INFO: renamed from: b */
        public final Integer f42749b;

        /* JADX INFO: renamed from: c */
        public final List<Integer> f42750c;

        /* JADX INFO: renamed from: d */
        public final int f42751d;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public e() {
            throw null;
        }

        public e(String str, Integer num, ArrayList arrayList, int i10, int i11) {
            str = (i11 & 1) != 0 ? null : str;
            num = (i11 & 2) != 0 ? null : num;
            arrayList = (i11 & 4) != 0 ? null : arrayList;
            this.f42748a = str;
            this.f42749b = num;
            this.f42750c = arrayList;
            this.f42751d = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (C5207g.m11106a(this.f42748a, eVar.f42748a) && C5207g.m11106a(this.f42749b, eVar.f42749b) && C5207g.m11106a(this.f42750c, eVar.f42750c) && this.f42751d == eVar.f42751d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = 0;
            String str = this.f42748a;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f42749b;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            List<Integer> list = this.f42750c;
            if (list != null) {
                iHashCode = list.hashCode();
            }
            return Integer.hashCode(this.f42751d) + ((iHashCode3 + iHashCode) * 31);
        }

        public final String toString() {
            return "HintSelection(value=" + this.f42748a + ", hint=" + this.f42749b + ", hints=" + this.f42750c + ", key=" + this.f42751d + ")";
        }
    }

    /* JADX INFO: renamed from: nh.n$f */
    public static final class f extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final List<Integer> f42752a;

        /* JADX INFO: renamed from: b */
        public final int f42753b;

        /* JADX INFO: renamed from: c */
        public final int f42754c;

        public f(int i10, int i11, ArrayList arrayList) {
            this.f42752a = arrayList;
            this.f42753b = i10;
            this.f42754c = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C5207g.m11106a(this.f42752a, fVar.f42752a) && this.f42753b == fVar.f42753b && this.f42754c == fVar.f42754c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42754c) + C0009a.m16d(this.f42753b, this.f42752a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Options(options=");
            sb2.append(this.f42752a);
            sb2.append(", selectedIndex=");
            sb2.append(this.f42753b);
            sb2.append(", key=");
            return C0166e.m768o(sb2, this.f42754c, ")");
        }
    }

    /* JADX INFO: renamed from: nh.n$g */
    public static final class g extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final List<Integer> f42755a;

        /* JADX INFO: renamed from: b */
        public final List<Integer> f42756b;

        /* JADX INFO: renamed from: c */
        public final float f42757c;

        /* JADX INFO: renamed from: d */
        public final float f42758d;

        /* JADX INFO: renamed from: e */
        public final int f42759e;

        /* JADX INFO: renamed from: f */
        public final String f42760f;

        /* JADX INFO: renamed from: g */
        public final boolean f42761g;

        public /* synthetic */ g(List list, List list2, float f3, float f10, int i10) {
            this(list, list2, f3, f10, i10, "", true);
        }

        public g(List<Integer> list, List<Integer> list2, float f3, float f10, int i10, String str, boolean z10) {
            C5207g.m11111f(list, "rangeValues");
            C5207g.m11111f(list2, "labels");
            C5207g.m11111f(str, "languageCode");
            this.f42755a = list;
            this.f42756b = list2;
            this.f42757c = f3;
            this.f42758d = f10;
            this.f42759e = i10;
            this.f42760f = str;
            this.f42761g = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C5207g.m11106a(this.f42755a, gVar.f42755a) && C5207g.m11106a(this.f42756b, gVar.f42756b) && Float.compare(this.f42757c, gVar.f42757c) == 0 && Float.compare(this.f42758d, gVar.f42758d) == 0 && this.f42759e == gVar.f42759e && C5207g.m11106a(this.f42760f, gVar.f42760f) && this.f42761g == gVar.f42761g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        public final int hashCode() {
            int iM758d = C0166e.m758d(this.f42760f, C0009a.m16d(this.f42759e, C0204c.m846e(this.f42758d, C0204c.m846e(this.f42757c, C0204c.m848g(this.f42756b, this.f42755a.hashCode() * 31, 31), 31), 31), 31), 31);
            boolean z10 = this.f42761g;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iM758d + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Range(rangeValues=");
            sb2.append(this.f42755a);
            sb2.append(", labels=");
            sb2.append(this.f42756b);
            sb2.append(", min=");
            sb2.append(this.f42757c);
            sb2.append(", max=");
            sb2.append(this.f42758d);
            sb2.append(", key=");
            sb2.append(this.f42759e);
            sb2.append(", languageCode=");
            sb2.append(this.f42760f);
            sb2.append(", detectDragFinished=");
            return C0166e.m769p(sb2, this.f42761g, ")");
        }
    }

    /* JADX INFO: renamed from: nh.n$h */
    public static final class h extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final Integer f42762a;

        /* JADX INFO: renamed from: b */
        public final String f42763b;

        /* JADX INFO: renamed from: c */
        public final int f42764c;

        public h(Integer num, String str, int i10, int i11) {
            num = (i11 & 1) != 0 ? null : num;
            str = (i11 & 2) != 0 ? null : str;
            this.f42762a = num;
            this.f42763b = str;
            this.f42764c = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (C5207g.m11106a(this.f42762a, hVar.f42762a) && C5207g.m11106a(this.f42763b, hVar.f42763b) && this.f42764c == hVar.f42764c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = 0;
            Integer num = this.f42762a;
            int iHashCode2 = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f42763b;
            if (str != null) {
                iHashCode = str.hashCode();
            }
            return Integer.hashCode(this.f42764c) + ((iHashCode2 + iHashCode) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Selection(title=");
            sb2.append(this.f42762a);
            sb2.append(", dynamicTitle=");
            sb2.append(this.f42763b);
            sb2.append(", key=");
            return C0166e.m768o(sb2, this.f42764c, ")");
        }
    }

    /* JADX INFO: renamed from: nh.n$i */
    public static final class i extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final String f42765a;

        /* JADX INFO: renamed from: b */
        public final String f42766b;

        /* JADX INFO: renamed from: c */
        public final String f42767c;

        /* JADX INFO: renamed from: d */
        public final int f42768d;

        public i(String str, int i10, String str2, String str3) {
            this.f42765a = str;
            this.f42766b = str2;
            this.f42767c = str3;
            this.f42768d = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (C5207g.m11106a(this.f42765a, iVar.f42765a) && C5207g.m11106a(this.f42766b, iVar.f42766b) && C5207g.m11106a(this.f42767c, iVar.f42767c) && this.f42768d == iVar.f42768d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f42765a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f42766b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f42767c;
            return Integer.hashCode(this.f42768d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SharedBy(name=");
            sb2.append(this.f42765a);
            sb2.append(", photo=");
            sb2.append(this.f42766b);
            sb2.append(", role=");
            sb2.append(this.f42767c);
            sb2.append(", key=");
            return C0166e.m768o(sb2, this.f42768d, ")");
        }
    }

    /* JADX INFO: renamed from: nh.n$j */
    public static final class j extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final int f42769a;

        /* JADX INFO: renamed from: b */
        public final int f42770b;

        /* JADX INFO: renamed from: c */
        public final float f42771c;

        /* JADX INFO: renamed from: d */
        public final int f42772d;

        /* JADX INFO: renamed from: e */
        public final int f42773e;

        /* JADX INFO: renamed from: f */
        public final boolean f42774f;

        /* JADX INFO: renamed from: g */
        public final String f42775g;

        /* JADX INFO: renamed from: h */
        public final int f42776h;

        public j(int i10, int i11, float f3, int i12, int i13, boolean z10, String str, int i14) {
            this.f42769a = i10;
            this.f42770b = i11;
            this.f42771c = f3;
            this.f42772d = i12;
            this.f42773e = i13;
            this.f42774f = z10;
            this.f42775g = str;
            this.f42776h = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (this.f42769a == jVar.f42769a && this.f42770b == jVar.f42770b && Float.compare(this.f42771c, jVar.f42771c) == 0 && this.f42772d == jVar.f42772d && this.f42773e == jVar.f42773e && this.f42774f == jVar.f42774f && C5207g.m11106a(this.f42775g, jVar.f42775g) && this.f42776h == jVar.f42776h) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        public final int hashCode() {
            int iM16d = C0009a.m16d(this.f42773e, C0009a.m16d(this.f42772d, C0204c.m846e(this.f42771c, C0009a.m16d(this.f42770b, Integer.hashCode(this.f42769a) * 31, 31), 31), 31), 31);
            boolean z10 = this.f42774f;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return Integer.hashCode(this.f42776h) + C0166e.m758d(this.f42775g, (iM16d + r10) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Step(title=");
            sb2.append(this.f42769a);
            sb2.append(", description=");
            sb2.append(this.f42770b);
            sb2.append(", size=");
            sb2.append(this.f42771c);
            sb2.append(", maxStep=");
            sb2.append(this.f42772d);
            sb2.append(", currentIndex=");
            sb2.append(this.f42773e);
            sb2.append(", withSample=");
            sb2.append(this.f42774f);
            sb2.append(", value=");
            sb2.append(this.f42775g);
            sb2.append(", key=");
            return C0166e.m768o(sb2, this.f42776h, ")");
        }
    }

    /* JADX INFO: renamed from: nh.n$k */
    public static final class k extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final int f42777a;

        /* JADX INFO: renamed from: b */
        public final int f42778b = R.string.placeholder;

        /* JADX INFO: renamed from: c */
        public final boolean f42779c;

        /* JADX INFO: renamed from: d */
        public final int f42780d;

        /* JADX INFO: renamed from: e */
        public final boolean f42781e;

        public k(int i10, int i11, boolean z10, boolean z11) {
            this.f42777a = i10;
            this.f42779c = z10;
            this.f42780d = i11;
            this.f42781e = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f42777a == kVar.f42777a && this.f42778b == kVar.f42778b && this.f42779c == kVar.f42779c && this.f42780d == kVar.f42780d && this.f42781e == kVar.f42781e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        public final int hashCode() {
            int iM16d = C0009a.m16d(this.f42778b, Integer.hashCode(this.f42777a) * 31, 31);
            boolean z10 = this.f42779c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int iM16d2 = C0009a.m16d(this.f42780d, (iM16d + r10) * 31, 31);
            boolean z11 = this.f42781e;
            return iM16d2 + (z11 ? 1 : z11);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Switch(title=");
            sb2.append(this.f42777a);
            sb2.append(", description=");
            sb2.append(this.f42778b);
            sb2.append(", switchState=");
            sb2.append(this.f42779c);
            sb2.append(", key=");
            sb2.append(this.f42780d);
            sb2.append(", manualSwitch=");
            return C0166e.m769p(sb2, this.f42781e, ")");
        }
    }

    /* JADX INFO: renamed from: nh.n$l */
    public static final class l extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final String f42782a;

        /* JADX INFO: renamed from: b */
        public final String f42783b;

        /* JADX INFO: renamed from: c */
        public final int f42784c;

        /* JADX INFO: renamed from: d */
        public final int f42785d;

        public l(String str, int i10, String str2) {
            C5207g.m11111f(str, "title");
            this.f42782a = str;
            this.f42783b = str2;
            this.f42784c = R.drawable.ic_trash;
            this.f42785d = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return C5207g.m11106a(this.f42782a, lVar.f42782a) && C5207g.m11106a(this.f42783b, lVar.f42783b) && this.f42784c == lVar.f42784c && this.f42785d == lVar.f42785d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42785d) + C0009a.m16d(this.f42784c, C0166e.m758d(this.f42783b, this.f42782a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextIcon(title=");
            sb2.append(this.f42782a);
            sb2.append(", value=");
            sb2.append(this.f42783b);
            sb2.append(", icon=");
            sb2.append(this.f42784c);
            sb2.append(", key=");
            return C0166e.m768o(sb2, this.f42785d, ")");
        }
    }

    /* JADX INFO: renamed from: nh.n$m */
    public static final class m extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final int f42786a;

        /* JADX INFO: renamed from: b */
        public final Integer f42787b = null;

        public m(int i10) {
            this.f42786a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.f42786a == mVar.f42786a && C5207g.m11106a(this.f42787b, mVar.f42787b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f42786a) * 31;
            Integer num = this.f42787b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "Title(value=" + this.f42786a + ", key=" + this.f42787b + ")";
        }
    }

    /* JADX INFO: renamed from: nh.n$n */
    public static final class n extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final int f42788a;

        /* JADX INFO: renamed from: b */
        public final int f42789b;

        /* JADX INFO: renamed from: c */
        public final int f42790c;

        /* JADX INFO: renamed from: d */
        public final String f42791d;

        /* JADX INFO: renamed from: e */
        public final String f42792e;

        /* JADX INFO: renamed from: f */
        public final String f42793f;

        public n(int i10, int i11, int i12, String str, String str2, int i13) {
            str = (i13 & 16) != 0 ? null : str;
            str2 = (i13 & 32) != 0 ? "" : str2;
            C5207g.m11111f(str2, "value");
            this.f42788a = i10;
            this.f42789b = i11;
            this.f42790c = i12;
            this.f42791d = null;
            this.f42792e = str;
            this.f42793f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f42788a == nVar.f42788a && this.f42789b == nVar.f42789b && this.f42790c == nVar.f42790c && C5207g.m11106a(this.f42791d, nVar.f42791d) && C5207g.m11106a(this.f42792e, nVar.f42792e) && C5207g.m11106a(this.f42793f, nVar.f42793f);
        }

        public final int hashCode() {
            int iM16d = C0009a.m16d(this.f42790c, C0009a.m16d(this.f42789b, Integer.hashCode(this.f42788a) * 31, 31), 31);
            int iHashCode = 0;
            String str = this.f42791d;
            int iHashCode2 = (iM16d + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f42792e;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            return this.f42793f.hashCode() + ((iHashCode2 + iHashCode) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TitleDescription(title=");
            sb2.append(this.f42788a);
            sb2.append(", description=");
            sb2.append(this.f42789b);
            sb2.append(", key=");
            sb2.append(this.f42790c);
            sb2.append(", dynamicTitle=");
            sb2.append(this.f42791d);
            sb2.append(", dynamicDescription=");
            sb2.append(this.f42792e);
            sb2.append(", value=");
            return C0009a.m23l(sb2, this.f42793f, ")");
        }
    }

    /* JADX INFO: renamed from: nh.n$o */
    public static final class o extends AbstractC7787n {

        /* JADX INFO: renamed from: a */
        public final String f42794a;

        /* JADX INFO: renamed from: b */
        public final int f42795b;

        public o(String str, int i10) {
            C5207g.m11111f(str, "username");
            this.f42794a = str;
            this.f42795b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return C5207g.m11106a(this.f42794a, oVar.f42794a) && this.f42795b == oVar.f42795b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42795b) + (this.f42794a.hashCode() * 31);
        }

        public final String toString() {
            return "UserLogout(username=" + this.f42794a + ", key=" + this.f42795b + ")";
        }
    }
}
