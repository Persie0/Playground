package p000;

import androidx.compose.foundation.text.contextmenu.internal.C0170a;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: pk */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3463pk implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0170a f56327b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dt9 f56328c;

    public /* synthetic */ C3463pk(C0170a c0170a, dt9 dt9Var, int i) {
        this.f56326a = i;
        this.f56327b = c0170a;
        this.f56328c = dt9Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f56326a;
        int i2 = 0;
        dt9 dt9Var = this.f56328c;
        C0170a c0170a = this.f56327b;
        switch (i) {
            case 0:
                C3412ok c3412ok = c0170a.f2865f;
                C3539rk c3539rk = new C3539rk(dt9Var, i2);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                c0170a.f2864e.m11067c("dataBuilder", c3412ok, new C3577sk(i2, ref$ObjectRef, c3539rk));
                Object obj = ref$ObjectRef.f47718a;
                if (obj != null) {
                    return (ct9) obj;
                }
                fa4.m11636J("result");
                throw null;
            case 1:
                C3412ok c3412ok2 = c0170a.f2866g;
                C3463pk c3463pk = new C3463pk(c0170a, dt9Var, 2);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                c0170a.f2864e.m11067c("positioner", c3412ok2, new C3577sk(i2, ref$ObjectRef2, c3463pk));
                Object obj2 = ref$ObjectRef2.f47718a;
                if (obj2 != null) {
                    return (e28) obj2;
                }
                fa4.m11636J("result");
                throw null;
            default:
                Object objMo0a = c0170a.f2862c.mo0a();
                aq4 aq4Var = (aq4) (((aq4) objMo0a).mo1691n() ? objMo0a : null);
                return aq4Var == null ? e28.f36619e : dt9Var.mo10629p(aq4Var).m10810k(aq4Var.mo1671R(0L));
        }
    }
}
