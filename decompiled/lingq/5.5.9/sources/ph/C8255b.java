package ph;

import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8255b implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f44594a;

    /* JADX INFO: renamed from: b */
    public final LinearProgressIndicator f44595b;

    /* JADX INFO: renamed from: c */
    public final MaterialToolbar f44596c;

    /* JADX INFO: renamed from: d */
    public final WebView f44597d;

    public C8255b(CoordinatorLayout coordinatorLayout, LinearProgressIndicator linearProgressIndicator, MaterialToolbar materialToolbar, WebView webView) {
        this.f44594a = coordinatorLayout;
        this.f44595b = linearProgressIndicator;
        this.f44596c = materialToolbar;
        this.f44597d = webView;
    }
}
