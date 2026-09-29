package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class ce0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: c */
    public static ce0 f9960c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9961a;

    /* JADX INFO: renamed from: b */
    public final Object f9962b;

    public ce0(Context context) {
        this.f9961a = 0;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f9962b = applicationContext;
    }

    /* JADX INFO: renamed from: a */
    public static final ce0 m4568a() {
        if (lp1.f49971a.contains(ce0.class)) {
            return null;
        }
        try {
            return f9960c;
        } catch (Throwable th) {
            lp1.m16420a(ce0.class, th);
            return null;
        }
    }

    public void finalize() throws Throwable {
        switch (this.f9961a) {
            case 0:
                Set set = lp1.f49971a;
                if (!set.contains(this)) {
                    try {
                        if (!set.contains(this)) {
                            try {
                                w41 w41VarM23706r = w41.m23706r((Context) this.f9962b);
                                w41VarM23706r.getClass();
                                w41VarM23706r.m23717K(this);
                            } catch (Throwable th) {
                                lp1.m16420a(this, th);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        lp1.m16420a(this, th2);
                        return;
                    }
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.f9961a;
        Object obj = this.f9962b;
        switch (i) {
            case 0:
                if (!lp1.f49971a.contains(this)) {
                    try {
                        C3012fs c3012fs = new C3012fs(context, (String) null);
                        StringBuilder sb = new StringBuilder("bf_");
                        sb.append(intent != null ? intent.getStringExtra("event_name") : null);
                        String string = sb.toString();
                        Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
                        Bundle bundle = new Bundle();
                        Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
                        if (setKeySet != null) {
                            for (String str : setKeySet) {
                                str.getClass();
                                bundle.putString(new Regex("[ -]*$").m15428g(new Regex("^[ -]*").m15428g(new Regex("[^0-9a-zA-Z _-]").m15428g(str, "-"), ""), ""), (String) bundleExtra.get(str));
                            }
                        }
                        sy2 sy2Var = sy2.f61585a;
                        if (ema.m11256c()) {
                            c3012fs.m12038d(string, bundle);
                        }
                    } catch (Throwable th) {
                        lp1.m16420a(this, th);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                context.getClass();
                intent.getClass();
                yb0 yb0Var = (yb0) obj;
                switch (yb0Var.f69593g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            oj5.m18040f().m18042a(zb0.f71297a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        yb0Var.m25025c(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        yb0Var.m25025c(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        yb0Var.m25025c(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        yb0Var.m25025c(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            oj5.m18040f().m18042a(ac0.f480a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        yb0Var.m25025c(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    yb0Var.m25025c(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            oj5.m18040f().m18042a(bj9.f8617a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        yb0Var.m25025c(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    yb0Var.m25025c(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            default:
                ((tk6) obj).f62447a.execute(new RunnableC3470pr(29, this, context));
                break;
        }
    }

    public /* synthetic */ ce0(Object obj, int i) {
        this.f9961a = i;
        this.f9962b = obj;
    }
}
