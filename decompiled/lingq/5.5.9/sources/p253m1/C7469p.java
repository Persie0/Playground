package p253m1;

import android.text.Layout;
import dm.C5207g;

/* JADX INFO: renamed from: m1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7469p {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f41317a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f41318b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (C5207g.m11106a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (C5207g.m11106a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f41317a = alignment;
        f41318b = alignment2;
    }
}
