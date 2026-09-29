package p198jc;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import p446w2.C9804b;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;

/* JADX INFO: renamed from: jc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6448c implements InterfaceC10060r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppBarLayout f36998a;

    public C6448c(AppBarLayout appBarLayout) {
        this.f36998a = appBarLayout;
    }

    @Override // p471x2.InterfaceC10060r
    /* JADX INFO: renamed from: c */
    public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
        AppBarLayout appBarLayout = this.f36998a;
        appBarLayout.getClass();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10063s0 c10063s1 = C10029b0.d.m18665b(appBarLayout) ? c10063s0 : null;
        if (!C9804b.m18286a(appBarLayout.f14680g, c10063s1)) {
            appBarLayout.f14680g = c10063s1;
            appBarLayout.setWillNotDraw(!(appBarLayout.f14671Q != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return c10063s0;
    }
}
