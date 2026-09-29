package p290o6;

import com.clevertap.android.sdk.C2181a;
import org.json.JSONObject;

/* JADX INFO: renamed from: o6.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7961i0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f43341a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7963j0 f43342b;

    public RunnableC7961i0(C7963j0 c7963j0, String str) {
        this.f43342b = c7963j0;
        this.f43341a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f43342b.f43348b) {
            long jM6475l = this.f43342b.f43351e.m6475l(this.f43341a, new JSONObject(this.f43342b.f43348b));
            C2181a c2181aM15784d = this.f43342b.m15784d();
            String str = this.f43342b.f43349c.f10995a;
            String str2 = "Persist Local Profile complete with status " + jM6475l + " for id " + this.f43341a;
            c2181aM15784d.getClass();
            C2181a.m6460m(str, str2);
        }
    }
}
