package p000;

import androidx.glance.appwidget.AbstractC0661i;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jn3 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0661i f45860b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int[] f45861c;

    public /* synthetic */ jn3(AbstractC0661i abstractC0661i, int[] iArr, int i) {
        this.f45859a = i;
        this.f45860b = abstractC0661i;
        this.f45861c = iArr;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f45859a;
        xfa xfaVar = xfa.f68157a;
        int[] iArr = this.f45861c;
        AbstractC0661i abstractC0661i = this.f45860b;
        br4 br4Var = (br4) obj;
        switch (i) {
            case 0:
                cr4 cr4VarM10607s = dr4.m10607s();
                String canonicalName = abstractC0661i.getClass().getCanonicalName();
                cr4VarM10607s.m23361c();
                dr4.m10604n((dr4) cr4VarM10607s.f65532b, canonicalName);
                List listM20850r0 = AbstractC3550rv.m20850r0(iArr);
                cr4VarM10607s.m23361c();
                dr4.m10605o((dr4) cr4VarM10607s.f65532b, listM20850r0);
                dr4 dr4Var = (dr4) cr4VarM10607s.m23359a();
                br4Var.m23361c();
                or4.m18315p((or4) br4Var.f65532b, dr4Var);
                break;
            default:
                mr4 mr4VarM17601s = nr4.m17601s();
                String canonicalName2 = abstractC0661i.getClass().getCanonicalName();
                mr4VarM17601s.m23361c();
                nr4.m17598n((nr4) mr4VarM17601s.f65532b, canonicalName2);
                List listM20850r1 = AbstractC3550rv.m20850r0(iArr);
                mr4VarM17601s.m23361c();
                nr4.m17599o((nr4) mr4VarM17601s.f65532b, listM20850r1);
                nr4 nr4Var = (nr4) mr4VarM17601s.m23359a();
                br4Var.m23361c();
                or4.m18313n((or4) br4Var.f65532b, nr4Var);
                break;
        }
        return xfaVar;
    }
}
