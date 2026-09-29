package p176ib;

import android.R;
import android.content.Context;
import android.widget.Button;

/* JADX INFO: renamed from: ib.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6278l extends Button {
    public C6278l(Context context) {
        super(context, null, R.attr.buttonStyle);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final int m12922a(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("Unknown color scheme: ");
        sb2.append(i10);
        throw new IllegalStateException(sb2.toString());
    }
}
