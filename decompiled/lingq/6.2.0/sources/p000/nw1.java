package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.settings.ViewKeys;
import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nw1 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f53310b;

    public /* synthetic */ nw1(vi3 vi3Var, int i) {
        this.f53309a = i;
        this.f53310b = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f53309a;
        ep2 ep2Var = ep2.f37658a;
        sh3 sh3Var = sh3.f60862a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f53310b;
        switch (i) {
            case 0:
                vi3Var.invoke(CupLeaderboardTab.Teams);
                break;
            case 1:
                vi3Var.invoke(CupLeaderboardTab.Global);
                break;
            case 2:
                vi3Var.invoke(new u09(ViewKeys.DailyStreakTarget));
                break;
            case 3:
                vi3Var.invoke(y2a.f69193a);
                break;
            case 4:
                vi3Var.invoke(null);
                break;
            case 5:
                vi3Var.invoke(kf6.f47145a);
                break;
            case 6:
                vi3Var.invoke(ep2Var);
                break;
            case 7:
                vi3Var.invoke(ep2Var);
                break;
            case 8:
                vi3Var.invoke(s03.f60129a);
                break;
            case 9:
                vi3Var.invoke(gh3.f40818a);
                break;
            case 10:
                vi3Var.invoke(hh3.f42361a);
                break;
            case 11:
                vi3Var.invoke(mh3.f51322a);
                break;
            case 12:
                vi3Var.invoke(sh3Var);
                break;
            case 13:
                vi3Var.invoke(sh3Var);
                break;
            case 14:
                vi3Var.invoke(lh3.f49654a);
                break;
            case 15:
                vi3Var.invoke(db7.f35359a);
                break;
            case 16:
                vi3Var.invoke(sa7.f60595a);
                break;
            case 17:
                vi3Var.invoke(lb7.f49414a);
                break;
            case 18:
                vi3Var.invoke(hb7.f42136a);
                break;
            case 19:
                vi3Var.invoke(jb7.f45380a);
                break;
            case 20:
                vi3Var.invoke(bb7.f8280a);
                break;
            case 21:
                vi3Var.invoke(ds3.f36156a);
                break;
            case 22:
                vi3Var.invoke(fs3.f39554a);
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                vi3Var.invoke(es3.f37772a);
                break;
            case 24:
                vi3Var.invoke(la4.f49365a);
                break;
            case 25:
                vi3Var.invoke(ma4.f50834a);
                break;
            case 26:
                vi3Var.invoke(ka4.f46937a);
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                vi3Var.invoke(tg6.f62255a);
                break;
            case 28:
                vi3Var.invoke(mb7.f50880a);
                break;
            default:
                vi3Var.invoke(new ora(cb7.f9841e));
                break;
        }
        return xfaVar;
    }
}
