package p000;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;

/* JADX INFO: loaded from: classes2.dex */
public final class ns1 {
    private static final ms1 Companion = new ms1();

    /* JADX INFO: renamed from: a */
    public final hm5 f53179a;

    public ns1(hm5 hm5Var) {
        hm5Var.getClass();
        this.f53179a = hm5Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m17610a(String str) {
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("Challenge", "LingQ Language Cup");
        bundle.putString("team", str);
        ((C1240a) this.f53179a).m7025f("Challenge joined", bundle);
    }

    /* JADX INFO: renamed from: b */
    public final void m17611b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("page", str);
        bundle.putString("challenge page path", "World-Cup");
        ((C1240a) this.f53179a).m7025f("challenge page visited", bundle);
    }
}
