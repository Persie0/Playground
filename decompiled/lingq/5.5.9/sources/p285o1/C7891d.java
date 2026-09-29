package p285o1;

import android.graphics.Paint;
import android.text.Layout;
import dm.C5207g;
import p253m1.C7471r;

/* JADX INFO: renamed from: o1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7891d {

    /* JADX INFO: renamed from: o1.d$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43005a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f43005a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final float m15658a(Layout layout, int i10, Paint paint) {
        float fAbs;
        float width;
        C5207g.m11111f(layout, "<this>");
        C5207g.m11111f(paint, "paint");
        float lineLeft = layout.getLineLeft(i10);
        if (!C7471r.m14840b(layout, i10) || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : a.f43005a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX INFO: renamed from: b */
    public static final float m15659b(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        C5207g.m11111f(layout, "<this>");
        C5207g.m11111f(paint, "paint");
        if (C7471r.m14840b(layout, i10)) {
            int i11 = -1;
            if (layout.getParagraphDirection(i10) == -1 && layout.getWidth() < layout.getLineRight(i10)) {
                float fMeasureText = paint.measureText("…") + (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)));
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
                if (paragraphAlignment != null) {
                    i11 = a.f43005a[paragraphAlignment.ordinal()];
                }
                if (i11 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i10);
                    width2 = (layout.getWidth() - fMeasureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i10);
                    width2 = layout.getWidth() - fMeasureText;
                }
                return width - width2;
            }
        }
        return 0.0f;
    }
}
