package p000;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ot3 extends lfa {

    /* JADX INFO: renamed from: a */
    public final Map f54960a;

    public ot3(Map map) {
        this.f54960a = map;
    }

    @Override // p000.lfa
    /* JADX INFO: renamed from: a */
    public final pg5 mo16162a(Context context, String str, WorkerParameters workerParameters) {
        so7 so7Var = (so7) this.f54960a.get(str);
        if (so7Var == null) {
            return null;
        }
        return ((z8b) so7Var.get()).mo13550a(context, workerParameters);
    }
}
