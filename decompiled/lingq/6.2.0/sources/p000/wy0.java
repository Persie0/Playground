package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wy0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f67504b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f67505c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f67506d;

    public /* synthetic */ wy0(t66 t66Var, vi3 vi3Var, t66 t66Var2) {
        this.f67503a = 0;
        this.f67505c = t66Var;
        this.f67504b = vi3Var;
        this.f67506d = t66Var2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f67503a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f67506d;
        t66 t66Var2 = this.f67505c;
        vi3 vi3Var = this.f67504b;
        switch (i) {
            case 0:
                hw0 hw0Var = (hw0) t66Var2.getValue();
                if (hw0Var != null) {
                    vi3Var.invoke(Integer.valueOf(hw0Var.f43028a));
                }
                t66Var.setValue(Boolean.FALSE);
                t66Var2.setValue(null);
                break;
            case 1:
                if (((Bitmap) t66Var2.getValue()) != null) {
                    vi3Var.invoke((Bitmap) t66Var2.getValue());
                } else {
                    t66Var.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                if (((Bitmap) t66Var2.getValue()) != null) {
                    vi3Var.invoke((Bitmap) t66Var2.getValue());
                } else {
                    t66Var.setValue(Boolean.TRUE);
                }
                break;
            case 3:
                vi3Var.invoke(za7.f71289a);
                t66Var.setValue(((Boolean) t66Var2.getValue()).booleanValue() ? jbb.f45386a : lbb.f49418a);
                break;
            default:
                vi3Var.invoke(new ora(new fb7((int) ((Number) t66Var2.getValue()).longValue())));
                t66Var.setValue(Boolean.FALSE);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ wy0(vi3 vi3Var, t66 t66Var, t66 t66Var2, int i) {
        this.f67503a = i;
        this.f67504b = vi3Var;
        this.f67505c = t66Var;
        this.f67506d = t66Var2;
    }
}
