package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: renamed from: qa */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0923qa {

    /* JADX INFO: renamed from: a */
    public Random f47462a = new Random();

    /* JADX INFO: renamed from: b */
    public final Map f47463b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map f47464c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map f47465d = new HashMap();

    /* JADX INFO: renamed from: e */
    public ArrayList f47466e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final transient Map f47467f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Map f47468g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Bundle f47469h = new Bundle();

    /* JADX INFO: renamed from: i */
    final /* synthetic */ ActivityC0907pl f47470i;

    public C0923qa(ActivityC0907pl activityC0907pl) {
        this.f47470i = activityC0907pl;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0919px m19332a(String str, AbstractC0927qe abstractC0927qe, InterfaceC0918pw interfaceC0918pw) {
        m19334c(str);
        this.f47467f.put(str, new aie(interfaceC0918pw, abstractC0927qe));
        if (this.f47468g.containsKey(str)) {
            Object obj = this.f47468g.get(str);
            this.f47468g.remove(str);
            interfaceC0918pw.mo3666a(obj);
        }
        C0917pv c0917pv = (C0917pv) this.f47469h.getParcelable(str);
        if (c0917pv != null) {
            this.f47469h.remove(str);
            interfaceC0918pw.mo3666a(abstractC0927qe.mo3937a(c0917pv.f47455a, c0917pv.f47456b));
        }
        return new C0921pz(this, str, abstractC0927qe);
    }

    /* JADX INFO: renamed from: b */
    public final void m19333b(int i, String str) {
        Map map = this.f47463b;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str);
        this.f47464c.put(str, numValueOf);
    }

    /* JADX INFO: renamed from: c */
    public final void m19334c(String str) {
        if (((Integer) this.f47464c.get(str)) != null) {
            return;
        }
        int iNextInt = this.f47462a.nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            if (!this.f47463b.containsKey(Integer.valueOf(i))) {
                m19333b(i, str);
                return;
            }
            iNextInt = this.f47462a.nextInt(2147418112);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public final void m19335d(String str) {
        Integer num;
        if (!this.f47466e.contains(str) && (num = (Integer) this.f47464c.remove(str)) != null) {
            this.f47463b.remove(num);
        }
        this.f47467f.remove(str);
        boolean zContainsKey = this.f47468g.containsKey(str);
        String str2 = WIxTIdUIdfb.OpcdTdp;
        if (zContainsKey) {
            Log.w("ActivityResultRegistry", str2 + str + ": " + this.f47468g.get(str));
            this.f47468g.remove(str);
        }
        if (this.f47469h.containsKey(str)) {
            Log.w("ActivityResultRegistry", str2 + str + ": " + this.f47469h.getParcelable(str));
            this.f47469h.remove(str);
        }
        bck bckVar = (bck) this.f47465d.get(str);
        if (bckVar != null) {
            ?? r1 = bckVar.f2949b;
            int size = r1.size();
            for (int i = 0; i < size; i++) {
                ((aks) bckVar.f2948a).m881c((akt) r1.get(i));
            }
            ((ArrayList) bckVar.f2949b).clear();
            this.f47465d.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, pw] */
    /* JADX INFO: renamed from: e */
    public final boolean m19336e(int i, int i2, Intent intent) {
        String str = (String) this.f47463b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        aie aieVar = (aie) this.f47467f.get(str);
        if (aieVar == null || aieVar.f426a == null || !this.f47466e.contains(str)) {
            this.f47468g.remove(str);
            this.f47469h.putParcelable(str, new C0917pv(i2, intent));
            return true;
        }
        aieVar.f426a.mo3666a(((AbstractC0927qe) aieVar.f427b).mo3937a(i2, intent));
        this.f47466e.remove(str);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m19337f(int i, AbstractC0927qe abstractC0927qe, Object obj) {
        Bundle bundle;
        ActivityC0907pl activityC0907pl = this.f47470i;
        bkn bknVarMo19340c = abstractC0927qe.mo19340c(activityC0907pl, obj);
        if (bknVarMo19340c != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0904pi(this, i, bknVarMo19340c, 0, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
            return;
        }
        Intent intentMo3938b = abstractC0927qe.mo3938b(obj);
        if (intentMo3938b.getExtras() != null && intentMo3938b.getExtras().getClassLoader() == null) {
            intentMo3938b.setExtrasClassLoader(activityC0907pl.getClassLoader());
        }
        if (intentMo3938b.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentMo3938b.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo3938b.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo3938b.getAction())) {
            String[] stringArrayExtra = intentMo3938b.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            aat.m51a(activityC0907pl, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo3938b.getAction())) {
            aap.m30b(activityC0907pl, intentMo3938b, i, bundle);
            return;
        }
        C0926qd c0926qd = (C0926qd) intentMo3938b.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            aap.m31c(activityC0907pl, c0926qd.f47475a, i, c0926qd.f47476b, c0926qd.f47477c, c0926qd.f47478d, 0, bundle);
        } catch (IntentSender.SendIntentException e) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0904pi(this, i, e, 2));
        }
    }

    public C0923qa() {
    }
}
