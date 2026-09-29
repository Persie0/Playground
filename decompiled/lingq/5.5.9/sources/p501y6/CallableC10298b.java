package p501y6;

import com.clevertap.android.sdk.C2181a;
import java.util.concurrent.Callable;
import p066d7.C5050b;
import p260m8.C7499b;

/* JADX INFO: renamed from: y6.b */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC10298b implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5050b f51807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C10299c f51808b;

    public CallableC10298b(C10299c c10299c, C5050b c5050b) {
        this.f51808b = c10299c;
        this.f51807a = c5050b;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        synchronized (this) {
            try {
                String str = this.f51808b.m19286a() + "/config_settings.json";
                this.f51807a.m10727a(str);
                C2181a c2181aM6433b = this.f51808b.f51809a.m6433b();
                c2181aM6433b.getClass();
                C2181a.m6460m(C7499b.m14908I(this.f51808b.f51809a), "Deleted settings file" + str);
            } catch (Exception e10) {
                e10.printStackTrace();
                C2181a c2181aM6433b2 = this.f51808b.f51809a.m6433b();
                String strM14908I = C7499b.m14908I(this.f51808b.f51809a);
                String str2 = "Error while resetting settings" + e10.getLocalizedMessage();
                c2181aM6433b2.getClass();
                C2181a.m6460m(strM14908I, str2);
            }
        }
        return null;
    }
}
