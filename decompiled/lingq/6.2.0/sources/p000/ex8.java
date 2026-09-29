package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.status.TokenStatus;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ex8 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f38054b;

    public /* synthetic */ ex8(vi3 vi3Var, int i) {
        this.f38053a = i;
        this.f38054b = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f38053a;
        t09 t09Var = t09.f61726a;
        rra rraVar = rra.f59744a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f38054b;
        switch (i) {
            case 0:
                vi3Var.invoke(f15.f38239a);
                break;
            case 1:
                vi3Var.invoke(ur7.f64248a);
                break;
            case 2:
                vi3Var.invoke(kr7.f48367a);
                break;
            case 3:
                vi3Var.invoke(t09Var);
                break;
            case 4:
                vi3Var.invoke(b19.f7765a);
                break;
            case 5:
                vi3Var.invoke(t09Var);
                break;
            case 6:
                vi3Var.invoke(m09.f50404a);
                break;
            case 7:
                vi3Var.invoke(t09Var);
                break;
            case 8:
                vi3Var.invoke(r09.f58463a);
                break;
            case 9:
                vi3Var.invoke(s09.f60143a);
                break;
            case 10:
                vi3Var.invoke(o09.f53562a);
                break;
            case 11:
                vi3Var.invoke(z09.f70733a);
                break;
            case 12:
                vi3Var.invoke(tg6.f62255a);
                break;
            case 13:
                vi3Var.invoke("https://www.lingq.com/terms/");
                break;
            case 14:
                vi3Var.invoke("https://www.lingq.com/privacy/");
                break;
            case 15:
                vi3Var.invoke(TokenStatus.Known);
                break;
            case 16:
                vi3Var.invoke(TokenStatus.Ignored);
                break;
            case 17:
                vi3Var.invoke(Boolean.FALSE);
                break;
            case 18:
                vi3Var.invoke(rraVar);
                break;
            case 19:
                vi3Var.invoke(rraVar);
                break;
            case 20:
                vi3Var.invoke(hra.f42848a);
                break;
            case 21:
                vi3Var.invoke(fra.f39534a);
                break;
            case 22:
                vi3Var.invoke(bra.f8903a);
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                vi3Var.invoke(rraVar);
                break;
            case 24:
                vi3Var.invoke(Boolean.TRUE);
                break;
            case 25:
                vi3Var.invoke(Boolean.FALSE);
                break;
            case 26:
                vi3Var.invoke(x2a.f67684a);
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                vi3Var.invoke(o2a.f53656a);
                break;
            case 28:
                vi3Var.invoke(j2a.f44972a);
                break;
            default:
                vi3Var.invoke(g2a.f40083a);
                break;
        }
        return xfaVar;
    }
}
