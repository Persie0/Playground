package p000;

import android.view.Window;
import androidx.activity.compose.C0033a;

/* JADX INFO: loaded from: classes2.dex */
public final class j91 implements zh2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45231b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f45232c;

    public /* synthetic */ j91(int i, Object obj, Object obj2) {
        this.f45230a = i;
        this.f45231b = obj;
        this.f45232c = obj2;
    }

    @Override // p000.zh2
    /* JADX INFO: renamed from: a */
    public final void mo1799a() {
        int i = this.f45230a;
        Object obj = this.f45232c;
        Object obj2 = this.f45231b;
        switch (i) {
            case 0:
                ((ub5) obj2).mo256K().mo21331x((e91) obj);
                break;
            case 1:
                ((ub5) obj2).mo256K().mo21331x((q03) obj);
                break;
            case 2:
                ((ub5) obj2).mo256K().mo21331x((pb5) obj);
                break;
            case 3:
                ((AbstractC3572sf) obj2).mo21331x((rb5) obj);
                break;
            case 4:
                ((y60) obj2).m24952b((C0033a) obj);
                break;
            case 5:
                ((ub5) obj2).mo256K().mo21331x((q03) obj);
                break;
            case 6:
                ((ub5) obj2).mo256K().mo21331x((q03) obj);
                break;
            case 7:
                Integer num = (Integer) obj2;
                if (num != null) {
                    ((Window) obj).setNavigationBarColor(num.intValue());
                }
                break;
            default:
                ((ub5) obj2).mo256K().mo21331x((pb5) obj);
                break;
        }
    }
}
