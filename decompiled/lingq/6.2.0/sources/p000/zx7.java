package p000;

import android.view.View;
import android.widget.TextView;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.feature.reader.old.ReaderPageFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class zx7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72344a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f72345b;

    public /* synthetic */ zx7(ReaderPageFragment readerPageFragment, int i) {
        this.f72344a = i;
        this.f72345b = readerPageFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f72344a;
        ReaderPageFragment readerPageFragment = this.f72345b;
        switch (i) {
            case 0:
                vx7 vx7Var = ReaderPageFragment.Companion;
                if (readerPageFragment.m9297V0().f69721l.getVisibility() != 0) {
                    hm5 hm5Var = readerPageFragment.f28448J0;
                    if (hm5Var == null) {
                        fa4.m11636J("analytics");
                        throw null;
                    }
                    ((C1240a) hm5Var).m7025f("Viewed Sentence Notes", null);
                }
                TextView textView = readerPageFragment.m9297V0().f69721l;
                textView.setVisibility(textView.getVisibility() == 0 ? 8 : 0);
                return;
            case 1:
                vx7 vx7Var2 = ReaderPageFragment.Companion;
                readerPageFragment.m9298W0().m9339s3(ReviewType.Integrated);
                return;
            case 2:
                vx7 vx7Var3 = ReaderPageFragment.Companion;
                readerPageFragment.m9298W0().mo8774r2(1);
                return;
            case 3:
                vx7 vx7Var4 = ReaderPageFragment.Companion;
                readerPageFragment.m9298W0().f29405s1.mo4677k(ix7.f44740d);
                return;
            default:
                vx7 vx7Var5 = ReaderPageFragment.Companion;
                readerPageFragment.m9298W0().m9322c3();
                return;
        }
    }
}
