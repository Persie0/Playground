package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.sequences.AbstractC3204c;

/* JADX INFO: loaded from: classes.dex */
public final class sc1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f60657a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f60658b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f60659c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayList f60660d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient LinkedHashMap f60661e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f60662f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f60663g = new Bundle();

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ uc1 f60664h;

    public sc1(uc1 uc1Var) {
        this.f60664h = uc1Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21214a(int i, int i2, Intent intent) {
        String str = (String) this.f60657a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C3325m7 c3325m7 = (C3325m7) this.f60661e.get(str);
        if ((c3325m7 != null ? c3325m7.f50691a : null) != null) {
            ArrayList arrayList = this.f60660d;
            if (arrayList.contains(str)) {
                c3325m7.f50691a.mo2125c(c3325m7.f50692b.mo5256u(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f60662f.remove(str);
        this.f60663g.putParcelable(str, new ActivityResult(intent, i2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m21215b(int i, pk9 pk9Var, Object obj) {
        Bundle bundleExtra;
        int i2;
        uc1 uc1Var = this.f60664h;
        hi8 hi8VarMo12391q = pk9Var.mo12391q(uc1Var, obj);
        int i3 = 0;
        if (hi8VarMo12391q != null) {
            new Handler(Looper.getMainLooper()).post(new rc1(this, i, i3, hi8VarMo12391q));
            return;
        }
        Intent intentMo5255f = pk9Var.mo5255f(uc1Var, obj);
        if (intentMo5255f.getExtras() != null) {
            Bundle extras = intentMo5255f.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentMo5255f.setExtrasClassLoader(uc1Var.getClassLoader());
            }
        }
        if (intentMo5255f.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentMo5255f.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo5255f.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo5255f.getAction())) {
            String[] stringArrayExtra = intentMo5255f.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            do7.m10515B(uc1Var, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo5255f.getAction())) {
            uc1Var.startActivityForResult(intentMo5255f, i, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo5255f.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            intentSenderRequest.getClass();
            i2 = i;
            try {
                uc1Var.startIntentSenderForResult(intentSenderRequest.m639d(), i2, intentSenderRequest.m636a(), intentSenderRequest.m637b(), intentSenderRequest.m638c(), 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new rc1(this, i2, 1, e));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C3399o7 m21216c(final String str, ub5 ub5Var, final pk9 pk9Var, final InterfaceC2991f7 interfaceC2991f7) {
        AbstractC3572sf abstractC3572sfMo256K = ub5Var.mo256K();
        if (abstractC3572sfMo256K.mo21327q().isAtLeast(Lifecycle$State.STARTED)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(ub5Var);
            Lifecycle$State lifecycle$StateMo21327q = abstractC3572sfMo256K.mo21327q();
            sb.append(" is attempting to register while current state is ");
            sb.append(lifecycle$StateMo21327q);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        m21218e(str);
        LinkedHashMap linkedHashMap = this.f60659c;
        C3362n7 c3362n7 = (C3362n7) linkedHashMap.get(str);
        if (c3362n7 == null) {
            c3362n7 = new C3362n7(abstractC3572sfMo256K);
        }
        rb5 rb5Var = new rb5() { // from class: k7
            @Override // p000.rb5
            /* JADX INFO: renamed from: c */
            public final void mo399c(ub5 ub5Var2, Lifecycle$Event lifecycle$Event) {
                sc1 sc1Var = this.f46797a;
                LinkedHashMap linkedHashMap2 = sc1Var.f60661e;
                Lifecycle$Event lifecycle$Event2 = Lifecycle$Event.ON_START;
                String str2 = str;
                if (lifecycle$Event2 != lifecycle$Event) {
                    if (Lifecycle$Event.ON_STOP == lifecycle$Event) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (Lifecycle$Event.ON_DESTROY == lifecycle$Event) {
                            sc1Var.m21219f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = sc1Var.f60663g;
                LinkedHashMap linkedHashMap3 = sc1Var.f60662f;
                InterfaceC2991f7 interfaceC2991f8 = interfaceC2991f7;
                pk9 pk9Var2 = pk9Var;
                linkedHashMap2.put(str2, new C3325m7(interfaceC2991f8, pk9Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC2991f8.mo2125c(obj);
                }
                ActivityResult activityResult = (ActivityResult) xwc.m24730C(bundle, str2, ActivityResult.class);
                if (activityResult != null) {
                    bundle.remove(str2);
                    interfaceC2991f8.mo2125c(pk9Var2.mo5256u(activityResult.f1008b, activityResult.f1007a));
                }
            }
        };
        c3362n7.f52423a.mo21323g(rb5Var);
        c3362n7.f52424b.add(rb5Var);
        linkedHashMap.put(str, c3362n7);
        return new C3399o7(this, str, pk9Var, 0);
    }

    /* JADX INFO: renamed from: d */
    public final C3399o7 m21217d(String str, pk9 pk9Var, InterfaceC2991f7 interfaceC2991f7) {
        str.getClass();
        m21218e(str);
        this.f60661e.put(str, new C3325m7(interfaceC2991f7, pk9Var));
        LinkedHashMap linkedHashMap = this.f60662f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC2991f7.mo2125c(obj);
        }
        Bundle bundle = this.f60663g;
        ActivityResult activityResult = (ActivityResult) xwc.m24730C(bundle, str, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            interfaceC2991f7.mo2125c(pk9Var.mo5256u(activityResult.f1008b, activityResult.f1007a));
        }
        return new C3399o7(this, str, pk9Var, 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m21218e(String str) {
        LinkedHashMap linkedHashMap = this.f60658b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (aj1) AbstractC3204c.m15417m0(new C3288l7(0))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f60657a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        uk9.m22775i("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: f */
    public final void m21219f(String str) {
        Integer num;
        str.getClass();
        if (!this.f60660d.contains(str) && (num = (Integer) this.f60658b.remove(str)) != null) {
            this.f60657a.remove(num);
        }
        this.f60661e.remove(str);
        LinkedHashMap linkedHashMap = this.f60662f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("Dropping pending result for request ", str, ": ");
            sbM17742q.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbM17742q.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f60663g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) xwc.m24730C(bundle, str, ActivityResult.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f60659c;
        C3362n7 c3362n7 = (C3362n7) linkedHashMap2.get(str);
        if (c3362n7 != null) {
            ArrayList arrayList = c3362n7.f52424b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c3362n7.f52423a.mo21331x((rb5) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
