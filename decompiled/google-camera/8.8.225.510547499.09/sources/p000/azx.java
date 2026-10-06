package p000;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azx implements ayo {

    /* JADX INFO: renamed from: a */
    public static final String f2825a = ayc.m2100b("CommandHandler");

    /* JADX INFO: renamed from: b */
    public final Context f2826b;

    /* JADX INFO: renamed from: c */
    public final Map f2827c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Object f2828d = new Object();

    /* JADX INFO: renamed from: e */
    public final bck f2829e;

    public azx(Context context, bck bckVar, byte[] bArr) {
        this.f2826b = context;
        this.f2829e = bckVar;
    }

    /* JADX INFO: renamed from: b */
    static Intent m2145b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: renamed from: c */
    static Intent m2146c(Context context, bcj bcjVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        m2149f(intent, bcjVar);
        return intent;
    }

    /* JADX INFO: renamed from: d */
    static Intent m2147d(Context context, bcj bcjVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        m2149f(intent, bcjVar);
        return intent;
    }

    /* JADX INFO: renamed from: e */
    static bcj m2148e(Intent intent) {
        return new bcj(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* JADX INFO: renamed from: f */
    public static void m2149f(Intent intent, bcj bcjVar) {
        intent.putExtra("KEY_WORKSPEC_ID", bcjVar.f2946a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", bcjVar.f2947b);
    }

    @Override // p000.ayo
    /* JADX INFO: renamed from: a */
    public final void mo1714a(bcj bcjVar, boolean z) {
        synchronized (this.f2828d) {
            bab babVar = (bab) this.f2827c.remove(bcjVar);
            this.f2829e.m2205E(bcjVar);
            if (babVar != null) {
                ayc.m2099a();
                StringBuilder sb = new StringBuilder();
                sb.append("onExecuted ");
                sb.append(babVar.f2841c);
                sb.append(", ");
                sb.append(z);
                babVar.m2151a();
                if (z) {
                    babVar.f2846h.execute(new bad(babVar.f2842d, m2147d(babVar.f2839a, babVar.f2841c), babVar.f2840b));
                }
                if (babVar.f2848j) {
                    babVar.f2846h.execute(new bad(babVar.f2842d, m2145b(babVar.f2839a), babVar.f2840b));
                }
            }
        }
    }
}
