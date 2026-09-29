package p000;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class ls9 {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f50082a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f50083b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (fa4.m11650l(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (fa4.m11650l(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f50082a = alignment;
        f50083b = alignment2;
    }
}
