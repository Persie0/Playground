package p199jd;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;

/* JADX INFO: renamed from: jd.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6459d implements InterfaceC10060r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f37029a;

    public C6459d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f37029a = baseTransientBottomBar;
    }

    @Override // p471x2.InterfaceC10060r
    /* JADX INFO: renamed from: c */
    public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
        int iM18865b = c10063s0.m18865b();
        BaseTransientBottomBar baseTransientBottomBar = this.f37029a;
        baseTransientBottomBar.f15557m = iM18865b;
        baseTransientBottomBar.f15558n = c10063s0.m18866c();
        baseTransientBottomBar.f15559o = c10063s0.m18867d();
        baseTransientBottomBar.m8838f();
        return c10063s0;
    }
}
