package p000;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractC0638f;
import androidx.lifecycle.Lifecycle$Event;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ee3 implements rb5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f37101a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sd3 f37102b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC3572sf f37103c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0638f f37104d;

    public ee3(AbstractC0638f abstractC0638f, String str, sd3 sd3Var, AbstractC3572sf abstractC3572sf) {
        this.f37104d = abstractC0638f;
        this.f37101a = str;
        this.f37102b = sd3Var;
        this.f37103c = abstractC3572sf;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        Bundle bundle;
        AbstractC0638f abstractC0638f = this.f37104d;
        Map map = abstractC0638f.f5752m;
        Lifecycle$Event lifecycle$Event2 = Lifecycle$Event.ON_START;
        String str = this.f37101a;
        if (lifecycle$Event == lifecycle$Event2 && (bundle = (Bundle) map.get(str)) != null) {
            this.f37102b.m21250b(str, bundle);
            map.remove(str);
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
            }
        }
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.f37103c.mo21331x(this);
            abstractC0638f.f5753n.remove(str);
        }
    }
}
