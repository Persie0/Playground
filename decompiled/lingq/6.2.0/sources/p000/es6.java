package p000;

import androidx.compose.p002ui.node.C0357g;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class es6 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final es6 f37775b = new es6(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37776a;

    public /* synthetic */ es6(int i) {
        this.f37776a = i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007d A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f37776a) {
            case 0:
                C0357g c0357g = (C0357g) obj;
                C0357g c0357g2 = (C0357g) obj2;
                int iM11651m = fa4.m11651m(c0357g2.f4318K, c0357g.f4318K);
                return iM11651m != 0 ? iM11651m : fa4.m11651m(c0357g.hashCode(), c0357g2.hashCode());
            case 1:
                return ss5.m21718o(Integer.valueOf(((C3378nn) obj).f52980b), Integer.valueOf(((C3378nn) obj2).f52980b));
            case 2:
                return ss5.m21718o(Integer.valueOf(((C3378nn) obj).f52980b), Integer.valueOf(((C3378nn) obj2).f52980b));
            case 3:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin = Math.min(str.length(), str2.length());
                for (int i = 4; i < iMin; i++) {
                    char cCharAt = str.charAt(i);
                    char cCharAt2 = str2.charAt(i);
                    if (cCharAt != cCharAt2) {
                        if (fa4.m11651m(cCharAt, cCharAt2) < 0) {
                            return -1;
                        }
                        return 1;
                    }
                }
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length < length2) {
                    return -1;
                }
                return 1;
            case 4:
                C0357g c0357g3 = (C0357g) obj;
                C0357g c0357g4 = (C0357g) obj2;
                int iM11651m2 = fa4.m11651m(c0357g3.f4318K, c0357g4.f4318K);
                return iM11651m2 != 0 ? iM11651m2 : fa4.m11651m(c0357g3.hashCode(), c0357g4.hashCode());
            case 5:
                String str3 = (String) obj2;
                str3.getClass();
                return ((String) obj).compareTo(str3);
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
