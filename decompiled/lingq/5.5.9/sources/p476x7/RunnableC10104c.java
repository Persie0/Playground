package p476x7;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.audio.InterfaceC2368b;
import dm.C5207g;
import p291o7.C8004n;
import p479xa.C10134c0;
import sl.C9072e;

/* JADX INFO: renamed from: x7.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10104c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51246a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f51247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f51248c;

    public /* synthetic */ RunnableC10104c(InterfaceC2368b.a aVar, long j10) {
        this.f51248c = aVar;
        this.f51247b = j10;
    }

    public /* synthetic */ RunnableC10104c(String str, long j10) {
        this.f51247b = j10;
        this.f51248c = str;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f51246a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                long j10 = this.f51247b;
                String str = (String) this.f51248c;
                C5207g.m11111f(str, "$activityName");
                if (C10105d.f51255g == null) {
                    C10105d.f51255g = new C10111j(Long.valueOf(j10), null);
                }
                if (C10105d.f51254f.get() <= 0) {
                    C10112k c10112k = C10112k.f51284a;
                    C10112k.m18971c(str, C10105d.f51255g, C10105d.f51257i);
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C8004n.m15871a()).edit();
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    editorEdit.apply();
                    SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(C8004n.m15871a()).edit();
                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    editorEdit2.apply();
                    C10105d.f51255g = null;
                }
                synchronized (C10105d.f51253e) {
                    try {
                        C10105d.f51252d = null;
                        C9072e c9072e = C9072e.f47360a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                InterfaceC2368b.a aVar = (InterfaceC2368b.a) this.f51248c;
                aVar.getClass();
                int i10 = C10134c0.f51354a;
                aVar.f11946b.mo6846m(this.f51247b);
                return;
        }
    }
}
