package p000;

import android.view.View;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inw {

    /* JADX INFO: renamed from: b */
    private static final Duration f31617b = Duration.ofMillis(200);

    /* JADX INFO: renamed from: c */
    private static final Duration f31618c = Duration.ofMillis(100);

    /* JADX INFO: renamed from: a */
    public static final Duration f31616a = Duration.ofMillis(150);

    /* JADX INFO: renamed from: a */
    public static void m11549a(int i, View view) {
        view.animate().cancel();
        view.setClickable(false);
        boolean z = i == 0;
        if (z) {
            view.setVisibility(0);
        }
        view.animate().alpha(i == 0 ? 1.0f : 0.0f).setDuration((z ? f31617b : f31616a).toMillis()).setStartDelay(z ? f31618c.toMillis() : 0L).setInterpolator(new akf()).withEndAction(new eyo(view, z, i, 2)).start();
    }
}
