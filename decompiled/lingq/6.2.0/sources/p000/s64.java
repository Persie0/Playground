package p000;

import android.graphics.Path;
import androidx.compose.p002ui.layout.AbstractC0343j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s64 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60403a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f60404b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f60405c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f60406d;

    public /* synthetic */ s64(int i, int i2, l87 l87Var) {
        this.f60403a = 1;
        this.f60404b = i;
        this.f60405c = l87Var;
        this.f60406d = i2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f60403a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f60406d;
        int i3 = this.f60404b;
        Object obj2 = this.f60405c;
        switch (i) {
            case 0:
                ((AbstractC0343j) obj).m1530f((l87) obj2, i3, i2, 0.0f);
                break;
            case 1:
                l87 l87Var = (l87) obj2;
                ((AbstractC0343j) obj).m1530f(l87Var, ss5.m21693T((i3 - l87Var.f49301a) / 2.0f), ss5.m21693T((i2 - l87Var.f49302b) / 2.0f), 0.0f);
                break;
            case 2:
                ((AbstractC0343j) obj).m1530f((l87) obj2, i3, i2, 0.0f);
                break;
            default:
                C3500qj c3500qj = (C3500qj) obj2;
                f37 f37Var = (f37) obj;
                C3300lj c3300lj = f37Var.f38358a;
                int iM11527d = f37Var.m11527d(i3);
                int iM11527d2 = f37Var.m11527d(i2);
                CharSequence charSequence = c3300lj.f49729e;
                if (iM11527d < 0 || iM11527d > iM11527d2 || iM11527d2 > charSequence.length()) {
                    StringBuilder sbM22994q = ux5.m22994q(iM11527d, iM11527d2, "start(", ") or end(", ") is out of range [0..");
                    sbM22994q.append(charSequence.length());
                    sbM22994q.append("], or start > end!");
                    j54.m14288a(sbM22994q.toString());
                }
                Path path = new Path();
                pw9 pw9Var = c3300lj.f49728d;
                pw9Var.f56919f.getSelectionPath(iM11527d, iM11527d2, path);
                int i4 = pw9Var.f56921h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                C3500qj c3500qj2 = new C3500qj(path);
                c3500qj2.m19994k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f37Var.f38363f)) & 4294967295L));
                C3500qj.m19984a(c3500qj, c3500qj2);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ s64(Object obj, int i, int i2, int i3) {
        this.f60403a = i3;
        this.f60405c = obj;
        this.f60404b = i;
        this.f60406d = i2;
    }
}
