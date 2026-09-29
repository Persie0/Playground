package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gb0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f40482b;

    public /* synthetic */ gb0(int i, t66 t66Var) {
        this.f40481a = i;
        this.f40482b = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f40481a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f40482b;
        switch (i) {
            case 0:
                ps9 ps9Var = (ps9) obj;
                t66Var.setValue(ps9Var.f56769c ? ps9Var.f56768b : ps9Var.f56767a);
                return xfaVar;
            case 1:
                List list = (List) obj;
                if (t66Var != null) {
                    t66Var.setValue(list);
                }
                return xfaVar;
            case 2:
                Float f = (Float) obj;
                f.getClass();
                ((vi3) t66Var.getValue()).invoke(f);
                return xfaVar;
            case 3:
                vv9 vv9Var = (vv9) obj;
                vv9Var.getClass();
                t66Var.setValue(vv9Var);
                return xfaVar;
            case 4:
                vv9 vv9Var2 = (vv9) obj;
                vv9Var2.getClass();
                t66Var.setValue(vv9Var2);
                return xfaVar;
            case 5:
                t66Var.setValue((aq4) obj);
                return xfaVar;
            case 6:
                Float f2 = (Float) obj;
                f2.getClass();
                return Float.valueOf(((Number) ((vi3) t66Var.getValue()).invoke(f2)).floatValue());
            case 7:
                r48 r48Var = (r48) obj;
                r48Var.getClass();
                long j = r48Var.f58696a;
                long j2 = r48Var.f58697b;
                t66Var.setValue(new n84((((long) (((int) j2) - ((int) j))) & 4294967295L) | (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32)));
                return xfaVar;
            default:
                ((vi3) t66Var.getValue()).invoke((gq6) obj);
                return xfaVar;
        }
    }
}
