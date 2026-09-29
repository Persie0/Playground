package p000;

import android.os.Build;
import com.lingq.core.token.C1909e;
import com.lingq.feature.reader.video.C2583a;
import java.util.Set;

/* JADX INFO: renamed from: s4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3560s4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f60254b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f60255c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f60256d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f60257e;

    public /* synthetic */ C3560s4(vi3 vi3Var, String str, vi3 vi3Var2, boolean z) {
        this.f60253a = 1;
        this.f60255c = vi3Var;
        this.f60256d = str;
        this.f60257e = vi3Var2;
        this.f60254b = z;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f60253a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f60257e;
        Object obj2 = this.f60256d;
        Object obj3 = this.f60255c;
        boolean z = this.f60254b;
        switch (i) {
            case 0:
                ui3 ui3Var = (ui3) obj3;
                g77 g77Var = (g77) obj2;
                t66 t66Var = (t66) obj;
                if (Build.VERSION.SDK_INT >= 33 && !z) {
                    t66Var.setValue(Boolean.TRUE);
                    g77Var.mo12409o();
                } else {
                    ui3Var.mo0a();
                }
                break;
            case 1:
                String str = (String) obj2;
                vi3 vi3Var = (vi3) obj;
                ((vi3) obj3).invoke(ab7.f464a);
                if (str != null) {
                    vi3Var.invoke(z ? jbb.f45386a : lbb.f49418a);
                }
                break;
            case 2:
                C2583a c2583a = (C2583a) obj3;
                C1909e c1909e = (C1909e) obj2;
                ud6 ud6Var = (ud6) obj;
                if (!z) {
                    c2583a.m9509V2(yqa.f70302a);
                    c1909e.m8760d3(n2a.f52243a);
                    ud6Var.m22689f();
                } else {
                    c2583a.m9509V2(oqa.f54761a);
                }
                break;
            case 3:
                Set set = (Set) obj3;
                vi3 vi3Var2 = (vi3) obj;
                String str2 = ((m99) obj2).f50816a;
                vi3Var2.invoke(z ? AbstractC3489q9.m19793w(set, str2) : AbstractC3489q9.m19765B(set, str2));
                break;
            default:
                Set set2 = (Set) obj3;
                String str3 = (String) obj2;
                ((vi3) obj).invoke(z ? AbstractC3489q9.m19793w(set2, str3) : AbstractC3489q9.m19765B(set2, str3));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3560s4(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.f60253a = i;
        this.f60254b = z;
        this.f60255c = obj;
        this.f60256d = obj2;
        this.f60257e = obj3;
    }
}
