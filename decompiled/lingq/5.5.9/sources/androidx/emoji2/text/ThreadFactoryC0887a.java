package androidx.emoji2.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ThreadFactory;
import p479xa.C10134c0;

/* JADX INFO: renamed from: androidx.emoji2.text.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0887a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5978a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f5979b;

    public /* synthetic */ ThreadFactoryC0887a(String str, int i10) {
        this.f5978a = i10;
        this.f5979b = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.f5978a;
        String str = this.f5979b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                int i11 = C10134c0.f51354a;
                return new Thread(runnable, str);
        }
    }
}
