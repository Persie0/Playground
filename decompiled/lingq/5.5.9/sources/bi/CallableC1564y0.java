package bi;

import android.database.Cursor;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1564y0 implements Callable<List<LanguageToLearn>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1543v0 f8994b;

    public CallableC1564y0(C1543v0 c1543v0, C6595o c6595o) {
        this.f8994b = c1543v0;
        this.f8993a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<LanguageToLearn> call() throws Exception {
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f8994b.f8879a, this.f8993a);
        try {
            ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
            while (cursorM16698S0.moveToNext()) {
                arrayList.add(new LanguageToLearn(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0), cursorM16698S0.getInt(1) != 0, cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), cursorM16698S0.getInt(4), cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5), cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3)));
            }
            return arrayList;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8993a.m13198q();
    }
}
