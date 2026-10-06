package p000;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lui implements lty {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f39223a;

    public lui(int i) {
        this.f39223a = i;
    }

    @Override // p000.lty
    /* JADX INFO: renamed from: a */
    public final void mo15980a(lul lulVar, View view) {
        ComponentCallbacksC0077bw componentCallbacksC0077bwM5291f;
        String strValueOf;
        String str;
        switch (this.f39223a) {
            case 0:
                ViewOutlineProvider outlineProvider = view.getOutlineProvider();
                Outline outline = new Outline();
                if (outlineProvider != null) {
                    outlineProvider.getOutline(view, outline);
                }
                char c = outline.isEmpty() ? (char) 1 : outline.getRadius() >= 0.0f ? (char) 3 : (char) 4;
                lulVar.m16008b("clipToOutline", view.getClipToOutline());
                if (outlineProvider == ViewOutlineProvider.BACKGROUND) {
                    strValueOf = "BACKGROUND";
                } else if (outlineProvider == ViewOutlineProvider.BOUNDS) {
                    strValueOf = "BOUNDS";
                } else {
                    strValueOf = outlineProvider == ViewOutlineProvider.PADDED_BOUNDS ? "PADDED_BOUNDS" : String.valueOf(outlineProvider);
                }
                lulVar.m16007a("outlineProvider", strValueOf);
                switch (c) {
                    case 1:
                        str = "EMPTY";
                        break;
                    case 2:
                        str = "NOT_EMPTY";
                        break;
                    case 3:
                        str = "ROUNDED_RECT";
                        break;
                    default:
                        str = "PATH";
                        break;
                }
                lulVar.m16007a("outline_mode", str);
                lulVar.m16009c("outline_alpha", outline.getAlpha());
                if (c == 3) {
                    Rect rect = new Rect();
                    outline.getRect(rect);
                    lulVar.m16009c("outline_radius", outline.getRadius());
                    lulVar.m16007a("outline_rect", rect.toShortString());
                }
                break;
            default:
                try {
                    componentCallbacksC0077bwM5291f = C0111cq.m5291f(view);
                    if (componentCallbacksC0077bwM5291f == null) {
                        throw new IllegalStateException(xRFdVyfdeve.ryfsJSifspdyjeg + view + " does not have a Fragment set");
                    }
                } catch (IllegalStateException e) {
                    componentCallbacksC0077bwM5291f = null;
                }
                if (componentCallbacksC0077bwM5291f != null && componentCallbacksC0077bwM5291f.f4586N == view) {
                    lulVar.m16007a("fragment", componentCallbacksC0077bwM5291f.getClass().getName());
                    String str2 = componentCallbacksC0077bwM5291f.f4577E;
                    if (str2 != null) {
                        lulVar.m16007a("fragment_tag", str2);
                    }
                    break;
                }
                break;
        }
    }
}
