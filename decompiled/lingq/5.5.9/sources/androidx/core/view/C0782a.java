package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.p017ui.platform.AbstractComposeView;
import dm.C5207g;
import java.util.WeakHashMap;
import kotlin.sequences.SequencesKt__SequencesKt;
import p249lo.C7418k;
import p249lo.InterfaceC7415h;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.core.view.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0782a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static Bitmap m2979a(LinearLayout linearLayout) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        C5207g.m11111f(config, "config");
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (!C10029b0.g.m18699c(linearLayout)) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(linearLayout.getWidth(), linearLayout.getHeight(), config);
        C5207g.m11110e(bitmapCreateBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-linearLayout.getScrollX(), -linearLayout.getScrollY());
        linearLayout.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static final C7418k m2980b(View view) {
        C5207g.m11111f(view, "<this>");
        return new C7418k(new ViewKt$allViews$1(view, null));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC7415h m2981c(AbstractComposeView abstractComposeView) {
        return SequencesKt__SequencesKt.m14252M2(abstractComposeView.getParent(), ViewKt$ancestors$1.f5602j);
    }
}
