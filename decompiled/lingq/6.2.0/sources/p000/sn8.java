package p000;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class sn8 {

    /* JADX INFO: renamed from: a */
    public final rn8 f61066a;

    public sn8(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f61066a = new qn8(nestedScrollView);
        } else {
            this.f61066a = new n58(11);
        }
    }
}
