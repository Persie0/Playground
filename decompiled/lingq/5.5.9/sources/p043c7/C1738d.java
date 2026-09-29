package p043c7;

import android.util.Log;
import androidx.activity.result.C0204c;
import com.clevertap.android.sdk.CleverTapAPI;
import java.util.concurrent.Executor;
import p402u0.C9371n;

/* JADX INFO: renamed from: c7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1738d<TResult> extends AbstractC1737c<TResult> {

    /* JADX INFO: renamed from: b */
    public final C9371n f9587b;

    /* JADX INFO: renamed from: c7.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f9588a;

        public a(Object obj) {
            this.f9588a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = (String) C1738d.this.f9587b.f48145b;
            Exception exc = (Exception) this.f9588a;
            String strM852k = C0204c.m852k("Failed to update message read state for id:", str);
            if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.INFO.intValue()) {
                Log.d("CleverTap", strM852k, exc);
            }
        }
    }

    public C1738d(Executor executor, C9371n c9371n) {
        super(executor);
        this.f9587b = c9371n;
    }

    @Override // p043c7.AbstractC1737c
    /* JADX INFO: renamed from: a */
    public final void mo5477a(TResult tresult) {
        this.f9586a.execute(new a(tresult));
    }
}
