package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i75 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f43622b;

    public /* synthetic */ i75(vi3 vi3Var, int i) {
        this.f43621a = i;
        this.f43622b = vi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f43621a;
        tg6 tg6Var = tg6.f62255a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f43622b;
        switch (i) {
            case 0:
                w65 w65Var = (w65) obj;
                w65Var.getClass();
                vi3Var.invoke(new nt7(w65Var));
                return xfaVar;
            case 1:
                vi3Var.invoke(new xn5(((Boolean) obj).booleanValue()));
                return xfaVar;
            case 2:
                vi3Var.invoke(new wn5(((Boolean) obj).booleanValue()));
                return xfaVar;
            case 3:
                vi3Var.invoke(new yn5(((Boolean) obj).booleanValue()));
                return xfaVar;
            case 4:
                vi3Var.invoke(new ao5(((Boolean) obj).booleanValue()));
                return xfaVar;
            case 5:
                vi3Var.invoke(new zn5(((Boolean) obj).booleanValue()));
                return xfaVar;
            case 6:
                PlayerConstants$PlayerState playerConstants$PlayerState = (PlayerConstants$PlayerState) obj;
                playerConstants$PlayerState.getClass();
                int i2 = b06.f7727a[playerConstants$PlayerState.ordinal()];
                if (i2 == 1) {
                    vi3Var.invoke(na7.f52539a);
                } else if (i2 == 2) {
                    vi3Var.invoke(wa7.f66565a);
                } else if (i2 == 3) {
                    vi3Var.invoke(ta7.f62054a);
                }
                return xfaVar;
            case 7:
                vi3Var.invoke(new ha7(((Float) obj).floatValue()));
                return xfaVar;
            case 8:
                vi3Var.invoke(new ka7(((Float) obj).floatValue()));
                return xfaVar;
            case 9:
                uu8 uu8Var = (uu8) obj;
                uu8Var.getClass();
                if (uu8Var instanceof su8) {
                    Integer numM4844a0 = cl9.m4844a0(((su8) uu8Var).f61446a.f9425c);
                    if (numM4844a0 != null) {
                        vi3Var.invoke(new sn6(numM4844a0.intValue()));
                    }
                } else if (uu8Var instanceof ru8) {
                    vi3Var.invoke(rn6.f59590a);
                }
                return xfaVar;
            case 10:
                vi3Var.invoke(new tn6(((Boolean) obj).booleanValue()));
                return xfaVar;
            case 11:
                vi3Var.invoke(new un6(((Boolean) obj).booleanValue()));
                return xfaVar;
            case 12:
                do6 do6Var = (do6) obj;
                do6Var.getClass();
                if (do6Var.equals(co6.f10357a)) {
                    vi3Var.invoke(xh6.f68209a);
                } else if (do6Var instanceof bo6) {
                    vi3Var.invoke(new yh6(((bo6) do6Var).f8772a));
                } else {
                    if (!do6Var.equals(ao6.f7291a)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(tg6Var);
                }
                return xfaVar;
            case 13:
                rf6 rf6Var = (rf6) obj;
                rf6Var.getClass();
                if (rf6Var.equals(rf6.f59205a)) {
                    vi3Var.invoke(tg6Var);
                    return xfaVar;
                }
                gm5.m12750e();
                return null;
            case 14:
                ag6 ag6Var = (ag6) obj;
                ag6Var.getClass();
                if (ag6Var.equals(yf6.f69770a)) {
                    vi3Var.invoke(ai6.f698e);
                } else {
                    if (!ag6Var.equals(if6.f44050a)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(tg6Var);
                }
                return xfaVar;
            case 15:
                bg6 bg6Var = (bg6) obj;
                bg6Var.getClass();
                if (bg6Var.equals(sf6.f60793a)) {
                    vi3Var.invoke(di6.f35688a);
                } else {
                    if (!bg6Var.equals(jf6.f45506a)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(tg6Var);
                }
                return xfaVar;
            case 16:
                cg6 cg6Var = (cg6) obj;
                cg6Var.getClass();
                if (cg6Var.equals(tf6.f62223a)) {
                    vi3Var.invoke(hi6.f42405a);
                } else {
                    if (!cg6Var.equals(lf6.f49601a)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(tg6Var);
                }
                return xfaVar;
            case 17:
                String str = (String) obj;
                str.getClass();
                vi3Var.invoke(new ug6(str));
                return xfaVar;
            case 18:
                Set set = (Set) obj;
                set.getClass();
                vi3Var.invoke(new ov6(set));
                return xfaVar;
            case 19:
                String str2 = (String) obj;
                str2.getClass();
                vi3Var.invoke(new pv6(str2));
                return xfaVar;
            case 20:
                Set set2 = (Set) obj;
                set2.getClass();
                vi3Var.invoke(new sv6(set2));
                return xfaVar;
            case 21:
                String str3 = (String) obj;
                str3.getClass();
                vi3Var.invoke(new tu6(str3));
                return xfaVar;
            case 22:
                String str4 = (String) obj;
                str4.getClass();
                vi3Var.invoke(new cv6(str4));
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                vi3Var.invoke(new rv6(((Integer) obj).intValue()));
                return xfaVar;
            case 24:
                vi3Var.invoke(new qc7(((Boolean) obj).booleanValue()));
                return xfaVar;
            case 25:
                TokenMeaning tokenMeaning = (TokenMeaning) obj;
                tokenMeaning.getClass();
                vi3Var.invoke(new d2a(tokenMeaning));
                return xfaVar;
            case 26:
                TokenMeaning tokenMeaning2 = (TokenMeaning) obj;
                tokenMeaning2.getClass();
                String str5 = tokenMeaning2.f19595b;
                if (str5 == null) {
                    str5 = "";
                }
                vi3Var.invoke(new w2a(tokenMeaning2, str5));
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                TokenMeaning tokenMeaning3 = (TokenMeaning) obj;
                tokenMeaning3.getClass();
                vi3Var.invoke(new q2a(tokenMeaning3));
                return xfaVar;
            case 28:
                vi3Var.invoke(new zqa(((Integer) obj).intValue() + 1));
                return xfaVar;
            default:
                vi3Var.invoke(new ara(((Integer) obj).intValue() + 1));
                return xfaVar;
        }
    }
}
