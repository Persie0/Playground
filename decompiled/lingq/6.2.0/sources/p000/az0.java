package p000;

import com.lingq.feature.reader.rating.p016ui.RatingContentType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class az0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f7680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f7681c;

    public /* synthetic */ az0(vi3 vi3Var, t66 t66Var) {
        this.f7679a = 8;
        this.f7681c = t66Var;
        this.f7680b = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f7679a;
        wc7 wc7Var = wc7.f66618a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f7681c;
        vi3 vi3Var = this.f7680b;
        switch (i) {
            case 0:
                t66Var.setValue("");
                vi3Var.invoke("");
                break;
            case 1:
                t66Var.setValue(Boolean.TRUE);
                vi3Var.invoke(wc7Var);
                break;
            case 2:
                vi3Var.invoke((String) t66Var.getValue());
                break;
            case 3:
                vi3Var.invoke((String) t66Var.getValue());
                break;
            case 4:
                t66Var.setValue(Boolean.TRUE);
                vi3Var.invoke(nn6.f52999a);
                break;
            case 5:
                t66Var.setValue(Boolean.TRUE);
                vi3Var.invoke(wc7Var);
                break;
            case 6:
                vi3Var.invoke((RatingContentType) t66Var.getValue());
                break;
            case 7:
                vi3Var.invoke(((vv9) t66Var.getValue()).f65990a.f54604b);
                break;
            case 8:
                Integer numM4844a0 = cl9.m4844a0((String) t66Var.getValue());
                if (numM4844a0 != null) {
                    vi3Var.invoke(Integer.valueOf(numM4844a0.intValue()));
                }
                break;
            case 9:
                vi3Var.invoke(new cs8((String) t66Var.getValue()));
                break;
            default:
                t66Var.setValue(Boolean.TRUE);
                vi3Var.invoke(new ora(cb7.f9841e));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ az0(vi3 vi3Var, t66 t66Var, int i) {
        this.f7679a = i;
        this.f7680b = vi3Var;
        this.f7681c = t66Var;
    }
}
