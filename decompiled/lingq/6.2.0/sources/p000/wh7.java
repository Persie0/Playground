package p000;

import android.content.Context;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import com.lingq.feature.review.views.speaking.MatchPairView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wh7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f66832b;

    public /* synthetic */ wh7(vi3 vi3Var, int i) {
        this.f66831a = i;
        this.f66832b = vi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f66831a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f66832b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                vi3Var.invoke(new zu6(str));
                return xfaVar;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                vi3Var.invoke(new uu6(str2));
                return xfaVar;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                vi3Var.invoke(new iv6(str3));
                return xfaVar;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                vi3Var.invoke(new ev6(str4));
                return xfaVar;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                vi3Var.invoke(new tv6(str5));
                return xfaVar;
            case 5:
                List list = (List) obj;
                list.getClass();
                vi3Var.invoke(new is7(list));
                return xfaVar;
            case 6:
                vi3Var.invoke(new ws7(((Float) obj).floatValue()));
                return xfaVar;
            case 7:
                zu8 zu8Var = (zu8) obj;
                zu8Var.getClass();
                vi3Var.invoke(new bt7(zu8Var));
                return xfaVar;
            case 8:
                ia4 ia4Var = (ia4) obj;
                ia4Var.getClass();
                vi3Var.invoke(new cs7(ia4Var.f43855a, ia4Var.f43856b));
                return xfaVar;
            case 9:
                ThemeSettingsTab themeSettingsTab = (ThemeSettingsTab) obj;
                themeSettingsTab.getClass();
                vi3Var.invoke(new ht7(themeSettingsTab));
                return xfaVar;
            case 10:
                vi3Var.invoke(new wr7(((Integer) obj).intValue()));
                return xfaVar;
            case 11:
                String str6 = (String) obj;
                str6.getClass();
                vi3Var.invoke(new uu7(str6));
                return xfaVar;
            case 12:
                e28 e28Var = (e28) obj;
                e28Var.getClass();
                vi3Var.invoke(new ks7(e28Var));
                return xfaVar;
            case 13:
                e28 e28Var2 = (e28) obj;
                e28Var2.getClass();
                vi3Var.invoke(new us7(e28Var2));
                return xfaVar;
            case 14:
                e28 e28Var3 = (e28) obj;
                e28Var3.getClass();
                vi3Var.invoke(new ss7(e28Var3));
                return xfaVar;
            case 15:
                uu8 uu8Var = (uu8) obj;
                uu8Var.getClass();
                if (uu8Var instanceof su8) {
                    c39 c39Var = ((su8) uu8Var).f61446a;
                    vi3Var.invoke(new hz7(c39Var.f9423a, c39Var.f9425c));
                } else if (uu8Var instanceof ru8) {
                    vi3Var.invoke(cz7.f34738a);
                }
                return xfaVar;
            case 16:
                vi3Var.invoke(Integer.valueOf(((Integer) obj).intValue() - 1));
                return xfaVar;
            case 17:
                vi3Var.invoke(Integer.valueOf(((Integer) obj).intValue() - 1));
                return xfaVar;
            case 18:
                TokenStatus tokenStatus = (TokenStatus) obj;
                tokenStatus.getClass();
                vi3Var.invoke(Integer.valueOf(y7d.m24986e(tokenStatus)));
                return xfaVar;
            case 19:
                vi3Var.invoke(new w98(((Integer) obj).intValue()));
                return xfaVar;
            case 20:
                vi3Var.invoke(new w98(((Integer) obj).intValue()));
                return xfaVar;
            case 21:
                Context context = (Context) obj;
                context.getClass();
                MatchPairView matchPairView = new MatchPairView(context, null, 2, null);
                matchPairView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                matchPairView.setListener(new vqb(vi3Var, 27));
                return matchPairView;
            case 22:
                vi3Var.invoke(new ef8(((Integer) obj).intValue()));
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                sp8 sp8Var = (sp8) obj;
                sp8Var.getClass();
                vi3Var.invoke(new at8(sp8Var));
                return xfaVar;
            case 24:
                dq8 dq8Var = (dq8) obj;
                dq8Var.getClass();
                vi3Var.invoke(new bt8(dq8Var));
                return xfaVar;
            case 25:
                ct8 ct8Var = (ct8) obj;
                ct8Var.getClass();
                vi3Var.invoke(new kr8(ct8Var));
                return xfaVar;
            case 26:
                dt8 dt8Var = (dt8) obj;
                dt8Var.getClass();
                if (dt8Var.equals(dt8.f36216a)) {
                    vi3Var.invoke(jr8.f46043a);
                    return xfaVar;
                }
                gm5.m12750e();
                return null;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                String str7 = (String) obj;
                str7.getClass();
                vi3Var.invoke(new y05(str7));
                return xfaVar;
            case 28:
                String str8 = (String) obj;
                str8.getClass();
                vi3Var.invoke(new l15(str8));
                return xfaVar;
            default:
                String str9 = (String) obj;
                str9.getClass();
                vi3Var.invoke(new x05(str9));
                return xfaVar;
        }
    }
}
