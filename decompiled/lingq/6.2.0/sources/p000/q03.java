package p000;

import androidx.lifecycle.Lifecycle$Event;
import com.lingq.feature.reader.reader.AbstractC2500f;
import com.lingq.feature.reader.reader.C2493a;
import com.lingq.feature.reader.video.AbstractC2591g;
import com.lingq.feature.reader.video.C2583a;
import com.lingq.feature.search.fastsearch.C2768b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q03 implements rb5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57067a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wta f57068b;

    public /* synthetic */ q03(wta wtaVar, int i) {
        this.f57067a = i;
        this.f57068b = wtaVar;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        int i = this.f57067a;
        wta wtaVar = this.f57068b;
        switch (i) {
            case 0:
                C2768b c2768b = (C2768b) wtaVar;
                if (lifecycle$Event == Lifecycle$Event.ON_STOP) {
                    c2768b.f32891o.m17490d(((vz2) c2768b.f32892p.getValue()).f66118a, "query");
                }
                break;
            case 1:
                C2493a c2493a = (C2493a) wtaVar;
                int i2 = AbstractC2500f.f30281a[lifecycle$Event.ordinal()];
                if (i2 == 1) {
                    c2493a.m9389V2(fs7.f39592a);
                    break;
                } else if (i2 == 2) {
                    c2493a.m9389V2(es7.f37777a);
                    break;
                }
                break;
            default:
                C2583a c2583a = (C2583a) wtaVar;
                int i3 = AbstractC2591g.f31453a[lifecycle$Event.ordinal()];
                if (i3 == 1) {
                    c2583a.m9509V2(wqa.f67194a);
                    break;
                } else if (i3 == 2) {
                    c2583a.m9509V2(vqa.f65799a);
                    break;
                }
                break;
        }
    }
}
