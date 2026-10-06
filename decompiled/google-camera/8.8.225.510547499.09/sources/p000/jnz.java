package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnz {

    /* JADX INFO: renamed from: a */
    public static final StringBuilder f34436a;

    static {
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ROOT);
        new SimpleDateFormat("MM-dd HH:mm:ss", Locale.ROOT);
        f34436a = new StringBuilder(33);
    }

    /* JADX INFO: renamed from: a */
    public static void m13398a(long j, StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append(hiCTUJiAxf.CNatT);
            j %= 86400000;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append("h");
            j %= 3600000;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append("m");
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append("s");
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
    }
}
