package p000;

import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fi3 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f39140b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39141c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f39142d;

    public /* synthetic */ fi3(zc8 zc8Var, String str, boolean z) {
        this.f39139a = 1;
        this.f39141c = zc8Var;
        this.f39142d = str;
        this.f39140b = z;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f39139a;
        bd8 bd8Var = null;
        int i2 = 0;
        xfa xfaVar = xfa.f68157a;
        boolean z = this.f39140b;
        Object obj2 = this.f39141c;
        Object obj3 = this.f39142d;
        switch (i) {
            case 0:
                li3 li3Var = (li3) obj2;
                vi3 vi3Var = (vi3) obj3;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                int i3 = 1;
                if (z) {
                    vu4.m23545g(vu4Var, null, new C0282a(1829968281, true, new gi3(li3Var, vi3Var, i2)), 3);
                    vu4.m23545g(vu4Var, null, hqb.f42804e, 3);
                }
                Integer num = li3Var.f49716s;
                boolean z2 = li3Var.f49706i;
                String str = li3Var.f49715r;
                if (num != null || str.length() > 0) {
                    vu4.m23545g(vu4Var, null, new C0282a(1629183298, true, new ci3(li3Var, i3)), 3);
                    vu4.m23545g(vu4Var, null, hqb.f42805f, 3);
                }
                if (z2 && li3Var.f49716s == null && str.length() == 0) {
                    vu4.m23545g(vu4Var, null, hqb.f42806g, 3);
                    vu4.m23545g(vu4Var, null, hqb.f42807h, 3);
                }
                if (z2 || z) {
                    vu4.m23545g(vu4Var, null, hqb.f42808i, 3);
                    vu4.m23545g(vu4Var, null, hqb.f42809j, 3);
                } else {
                    vu4.m23545g(vu4Var, null, hqb.f42810k, 3);
                }
                vu4.m23545g(vu4Var, null, new C0282a(-2011114668, true, new ci3(li3Var, 2)), 3);
                vu4.m23545g(vu4Var, null, hqb.f42811l, 3);
                return xfaVar;
            case 1:
                String str2 = (String) obj3;
                hg8 hg8Var = (hg8) obj;
                hg8Var.getClass();
                ug8 ug8Var = ((zc8) obj2).f71366a;
                String str3 = ug8Var.f63892a;
                String str4 = ug8Var.f63893b;
                boolean z3 = ug8Var.f63896e;
                int i4 = ug8Var.f63897f;
                str4.getClass();
                str2.getClass();
                boolean z4 = this.f39140b;
                zc8 zc8Var = new zc8(new ug8(i4, str3, str4, str2, z4, z3));
                cd8 cd8Var = hg8Var.f42328c;
                bd8 bd8Var2 = cd8Var.f9938c;
                if (bd8Var2 != null) {
                    int i5 = bd8Var2.f8388a;
                    cb8 cb8Var = bd8Var2.f8389b;
                    boolean z5 = bd8Var2.f8391d;
                    cb8Var.getClass();
                    bd8Var = new bd8(i5, cb8Var, z4, z5);
                }
                return hg8.m13232a(hg8Var, null, new cd8(cd8Var.f9936a, cd8Var.f9937b, bd8Var, cd8Var.f9939d), zc8Var, false, null, null, null, null, 499);
            case 2:
                String str5 = (String) obj2;
                sb9 sb9Var = (sb9) obj3;
                tv8 tv8Var = (tv8) obj;
                if (z) {
                    bh4[] bh4VarArr = AbstractC0426f.f5022a;
                    C0427g c0427g = AbstractC0424d.f5004k;
                    bh4 bh4Var = AbstractC0426f.f5022a[3];
                    tv8Var.mo3709d(c0427g, new ch5(0));
                }
                tb9 tb9Var = new tb9(sb9Var, 0);
                bh4[] bh4VarArr2 = AbstractC0426f.f5022a;
                tv8Var.mo3709d(AbstractC0421a.f4966v, new C3024g3(null, tb9Var));
                AbstractC0426f.m1861e(tv8Var, str5);
                return xfaVar;
            default:
                vi3 vi3Var2 = (vi3) obj3;
                String str6 = (String) obj2;
                ((Boolean) obj).booleanValue();
                if (z) {
                    vi3Var2.invoke(str6);
                }
                return xfaVar;
        }
    }

    public /* synthetic */ fi3(boolean z, vi3 vi3Var, String str) {
        this.f39139a = 3;
        this.f39140b = z;
        this.f39142d = vi3Var;
        this.f39141c = str;
    }

    public /* synthetic */ fi3(boolean z, Object obj, Object obj2, int i) {
        this.f39139a = i;
        this.f39140b = z;
        this.f39141c = obj;
        this.f39142d = obj2;
    }
}
