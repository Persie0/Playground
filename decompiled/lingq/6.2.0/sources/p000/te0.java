package p000;

import androidx.compose.material3.C0253l;
import androidx.compose.material3.DrawerValue;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class te0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62175a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f62176b;

    public /* synthetic */ te0(vi3 vi3Var, int i) {
        this.f62175a = i;
        this.f62176b = vi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f62175a;
        tg6 tg6Var = tg6.f62255a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f62176b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                vi3Var.invoke(new me0(str));
                return xfaVar;
            case 1:
                zu8 zu8Var = (zu8) obj;
                zu8Var.getClass();
                vi3Var.invoke(new ira(zu8Var));
                return xfaVar;
            case 2:
                Integer num = (Integer) obj;
                num.intValue();
                vi3Var.invoke(new cr0(num));
                return xfaVar;
            case 3:
                vi3Var.invoke(new nq0(((Integer) obj).intValue()));
                return xfaVar;
            case 4:
                de0 de0Var = (de0) obj;
                de0Var.getClass();
                int i2 = de0Var.f35485a;
                String str2 = de0Var.f35488d;
                if (str2 == null) {
                    str2 = "";
                }
                vi3Var.invoke(new dr0(i2, str2));
                return xfaVar;
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                vi3Var.invoke(new pq0(str3));
                return xfaVar;
            case 6:
                Integer num2 = (Integer) obj;
                num2.intValue();
                vi3Var.invoke(new cr0(num2));
                return xfaVar;
            case 7:
                lc5 lc5Var = (lc5) obj;
                lc5Var.getClass();
                vi3Var.invoke(lc5Var);
                return xfaVar;
            case 8:
                String str4 = (String) obj;
                str4.getClass();
                vi3Var.invoke(new yg6(str4));
                return xfaVar;
            case 9:
                String str5 = (String) obj;
                str5.getClass();
                vi3Var.invoke(new yg6(str5));
                return xfaVar;
            case 10:
                String str6 = (String) obj;
                str6.getClass();
                vi3Var.invoke(new yg6(str6));
                return xfaVar;
            case 11:
                String str7 = (String) obj;
                str7.getClass();
                vi3Var.invoke(new yg6(str7));
                return xfaVar;
            case 12:
                String str8 = (String) obj;
                str8.getClass();
                vi3Var.invoke(new yg6(str8));
                return xfaVar;
            case 13:
                String str9 = (String) obj;
                str9.getClass();
                vi3Var.invoke(new yg6(str9));
                return xfaVar;
            case 14:
                CupLeaderboardTab cupLeaderboardTab = (CupLeaderboardTab) obj;
                cupLeaderboardTab.getClass();
                vi3Var.invoke(new iw1(cupLeaderboardTab));
                return xfaVar;
            case 15:
                String str10 = (String) obj;
                str10.getClass();
                vi3Var.invoke(new yg6(str10));
                return xfaVar;
            case 16:
                String str11 = (String) obj;
                str11.getClass();
                vi3Var.invoke(new q09(str11));
                return xfaVar;
            case 17:
                return new C0253l((DrawerValue) obj, vi3Var);
            case 18:
                kf6 kf6Var = (kf6) obj;
                kf6Var.getClass();
                if (kf6Var.equals(kf6.f47145a)) {
                    vi3Var.invoke(tg6Var);
                    return xfaVar;
                }
                gm5.m12750e();
                return null;
            case 19:
                aq4 aq4Var = (aq4) obj;
                aq4Var.getClass();
                aq4 aq4VarMo1662D = aq4Var.mo1662D();
                vi3Var.invoke(Float.valueOf((((int) (aq4Var.mo1687j() & 4294967295L)) / 2.0f) + Float.intBitsToFloat((int) ((aq4VarMo1662D != null ? aq4VarMo1662D.mo1667K(aq4Var, 0L) : 0L) & 4294967295L))));
                return xfaVar;
            case 20:
                hs3 hs3Var = (hs3) obj;
                hs3Var.getClass();
                if (hs3Var.equals(ds3.f36156a)) {
                    vi3Var.invoke(tg6Var);
                } else if (hs3Var.equals(fs3.f39554a)) {
                    vi3Var.invoke(dh6.f35655a);
                } else if (hs3Var.equals(es3.f37772a)) {
                    vi3Var.invoke(ch6.f10092a);
                } else {
                    if (!(hs3Var instanceof gs3)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(new eh6(((gs3) hs3Var).f41263a));
                }
                return xfaVar;
            case 21:
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4.m23545g(vu4Var, null, mqb.f51750c, 3);
                vu4.m23545g(vu4Var, null, new C0282a(439793751, true, new qe0(vi3Var, 17)), 3);
                vu4.m23545g(vu4Var, null, new C0282a(12524022, true, new qe0(vi3Var, 18)), 3);
                vu4.m23545g(vu4Var, null, mqb.f51751d, 3);
                Iterator it = ls3.f50071a.iterator();
                while (it.hasNext()) {
                    vu4.m23545g(vu4Var, null, new C0282a(1592311768, true, new C3180kd(21, (ns3) it.next(), vi3Var)), 3);
                }
                return xfaVar;
            case 22:
                PlayerConstants$PlayerState playerConstants$PlayerState = (PlayerConstants$PlayerState) obj;
                playerConstants$PlayerState.getClass();
                int i3 = mh4.f51323a[playerConstants$PlayerState.ordinal()];
                if (i3 == 1) {
                    vi3Var.invoke(oa7.f54102a);
                } else if (i3 == 2) {
                    vi3Var.invoke(ya7.f69552a);
                } else if (i3 == 3) {
                    vi3Var.invoke(va7.f65143a);
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                vi3Var.invoke(new ja7(((Float) obj).floatValue()));
                return xfaVar;
            case 24:
                vi3Var.invoke(new ma7(((Float) obj).floatValue()));
                return xfaVar;
            case 25:
                Integer num3 = (Integer) obj;
                num3.intValue();
                vi3Var.invoke(num3);
                return xfaVar;
            case 26:
                vi3Var.invoke(new ora(new ia7(((Float) obj).floatValue())));
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                vi3Var.invoke(new ora(new la7(((Float) obj).floatValue())));
                return xfaVar;
            case 28:
                w65 w65Var = (w65) obj;
                w65Var.getClass();
                vi3Var.invoke(new mt7(w65Var));
                return xfaVar;
            default:
                LessonWord lessonWord = (LessonWord) obj;
                lessonWord.getClass();
                vi3Var.invoke(new ot7(lessonWord));
                return xfaVar;
        }
    }
}
