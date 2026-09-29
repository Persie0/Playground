package p000;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rc1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f59059c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f59060d;

    public /* synthetic */ rc1(Object obj, int i, int i2, Object obj2) {
        this.f59057a = i2;
        this.f59058b = obj;
        this.f59059c = i;
        this.f59060d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f59057a;
        Object obj = this.f59060d;
        int i2 = this.f59059c;
        Object obj2 = this.f59058b;
        switch (i) {
            case 0:
                sc1 sc1Var = (sc1) obj2;
                Serializable serializable = (Serializable) ((hi8) obj).f42410b;
                String str = (String) sc1Var.f60657a.get(Integer.valueOf(i2));
                if (str != null) {
                    C3325m7 c3325m7 = (C3325m7) sc1Var.f60661e.get(str);
                    if ((c3325m7 != null ? c3325m7.f50691a : null) != null) {
                        InterfaceC2991f7 interfaceC2991f7 = c3325m7.f50691a;
                        if (sc1Var.f60660d.remove(str)) {
                            interfaceC2991f7.mo2125c(serializable);
                        }
                    } else {
                        sc1Var.f60663g.remove(str);
                        sc1Var.f60662f.put(str, serializable);
                    }
                    break;
                }
                break;
            case 1:
                ((sc1) obj2).m21214a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((cc4) obj2).mo3878j(i2, obj);
                break;
        }
    }
}
