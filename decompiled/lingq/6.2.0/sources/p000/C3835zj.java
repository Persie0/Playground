package p000;

import androidx.compose.p002ui.node.C0357g;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: zj */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3835zj implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71630a;

    public /* synthetic */ C3835zj(int i) {
        this.f71630a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f71630a) {
            case 0:
                return fa4.m11651m(((nk7) obj2).f52886a, ((nk7) obj).f52886a);
            case 1:
                r74 r74Var = (r74) obj2;
                r74Var.getClass();
                return ((r74) obj).m20431b(r74Var);
            case 2:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 3:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 4:
                String name = ((File) obj).getName();
                int i = zq1.f71957f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 5:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 6:
                return fa4.m11651m(((ja4) obj).f45334b, ((ja4) obj2).f45334b);
            case 7:
                i84 i84Var = (i84) obj;
                i84 i84Var2 = (i84) obj2;
                return (i84Var.f40380b - i84Var.f40379a) - (i84Var2.f40380b - i84Var2.f40379a);
            case 8:
                C0357g c0357g = (C0357g) obj;
                C0357g c0357g2 = (C0357g) obj2;
                float f = c0357g.f4337b0.f58070p.f4412a0;
                float f2 = c0357g2.f4337b0.f58070p.f4412a0;
                return f == f2 ? fa4.m11651m(c0357g.m1612y(), c0357g2.m1612y()) : Float.compare(f, f2);
            case 9:
                return fa4.m11651m(((du4) obj).getIndex(), ((du4) obj2).getIndex());
            case 10:
                return ((c30) ((yp1) obj)).f9383a.compareTo(((c30) ((yp1) obj2)).f9383a);
            case 11:
                return ((za9) obj).f71291a - ((za9) obj2).f71291a;
            default:
                return Float.compare(((za9) obj).f71293c, ((za9) obj2).f71293c);
        }
    }
}
