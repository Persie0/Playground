package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asn {
    /* JADX INFO: renamed from: a */
    static ViewGroupOverlay m1964a(ViewGroup viewGroup, View view) {
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        overlay.add(view);
        return overlay;
    }

    /* JADX INFO: renamed from: b */
    static ViewGroupOverlay m1965b(ViewGroup viewGroup, View view) {
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        overlay.remove(view);
        return overlay;
    }
}
