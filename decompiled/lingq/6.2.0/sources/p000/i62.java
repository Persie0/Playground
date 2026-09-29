package p000;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i62 {

    /* JADX INFO: renamed from: d */
    public static final int[] f43579d = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: e */
    public static final b64 f43580e = new b64(new C3386nv(25));

    /* JADX INFO: renamed from: f */
    public static final b64 f43581f = new b64(new C3386nv(26));

    /* JADX INFO: renamed from: a */
    public int f43582a;

    /* JADX INFO: renamed from: b */
    public ImmutableList f43583b;

    /* JADX INFO: renamed from: c */
    public final a3d f43584c = new a3d();

    /* JADX INFO: renamed from: a */
    public final void m13681a(int i, ArrayList arrayList) {
        a3d a3dVar = this.f43584c;
        switch (i) {
            case 0:
                arrayList.add(new C3060h2());
                break;
            case 1:
                arrayList.add(new C3132j2());
                break;
            case 2:
                arrayList.add(new C3290l9());
                break;
            case 3:
                arrayList.add(new C2962ef());
                break;
            case 4:
                hy2 hy2VarM3361n = f43580e.m3361n(0);
                if (hy2VarM3361n == null) {
                    arrayList.add(new m63());
                } else {
                    arrayList.add(hy2VarM3361n);
                }
                break;
            case 5:
                arrayList.add(new l93());
                break;
            case 6:
                arrayList.add(new zs5(a3dVar, 0));
                break;
            case 7:
                arrayList.add(new a46(this.f43582a));
                break;
            case 8:
                arrayList.add(new pg3(a3dVar, 192));
                arrayList.add(new i46(a3dVar, 160));
                break;
            case 9:
                arrayList.add(new rq6());
                break;
            case 10:
                arrayList.add(new zo7());
                break;
            case 11:
                if (this.f43583b == null) {
                    this.f43583b = ImmutableList.m6289v();
                }
                arrayList.add(new kca(0, a3dVar, new g1a(0L), new d40(this.f43583b)));
                break;
            case 12:
                arrayList.add(new k2b());
                break;
            case 14:
                arrayList.add(new ae0(2));
                break;
            case 15:
                hy2 hy2VarM3361n2 = f43581f.m3361n(new Object[0]);
                if (hy2VarM3361n2 != null) {
                    arrayList.add(hy2VarM3361n2);
                }
                break;
            case 16:
                arrayList.add(new i60(a3dVar));
                break;
            case 17:
                arrayList.add(new ae0(1));
                break;
            case 18:
                arrayList.add(new l60(1));
                break;
            case 19:
                arrayList.add(new ae0(0));
                break;
            case 20:
                arrayList.add(new yr3());
                break;
            case 21:
                arrayList.add(new l60(0));
                break;
        }
    }
}
