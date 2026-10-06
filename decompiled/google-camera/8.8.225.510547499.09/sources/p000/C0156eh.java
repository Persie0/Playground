package p000;

import android.os.Bundle;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: renamed from: eh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0156eh implements InterfaceC0916pu {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ActivityC0907pl f14025a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f14026b;

    public /* synthetic */ C0156eh(ActivityC0080bz activityC0080bz, int i) {
        this.f14026b = i;
        this.f14025a = activityC0080bz;
    }

    public C0156eh(ActivityC0157ei activityC0157ei, int i) {
        this.f14026b = i;
        this.f14025a = activityC0157ei;
    }

    public /* synthetic */ C0156eh(ActivityC0907pl activityC0907pl, int i) {
        this.f14026b = i;
        this.f14025a = activityC0907pl;
    }

    @Override // p000.InterfaceC0916pu
    /* JADX INFO: renamed from: a */
    public final void mo7319a() {
        switch (this.f14026b) {
            case 0:
                AbstractC0160el abstractC0160elM7343j = ((ActivityC0157ei) this.f14025a).m7343j();
                abstractC0160elM7343j.mo7436e();
                this.f14025a.getSavedStateRegistry().m1858a(xRFdVyfdeve.HHucYiJdg);
                abstractC0160elM7343j.mo7444o();
                break;
            case 1:
                Object obj = ((ActivityC0080bz) this.f14025a).f4796e.f3651a;
                C0086ce c0086ce = (C0086ce) obj;
                c0086ce.f5401e.m5329k(c0086ce, (AbstractC0083cb) obj, null);
                break;
            default:
                ActivityC0907pl activityC0907pl = this.f14025a;
                Bundle bundleM1858a = activityC0907pl.getSavedStateRegistry().m1858a("android:support:activity-result");
                if (bundleM1858a != null) {
                    C0923qa c0923qa = activityC0907pl.f47427h;
                    ArrayList<Integer> integerArrayList = bundleM1858a.getIntegerArrayList(NptsKnlVczSZ.BJYL);
                    ArrayList<String> stringArrayList = bundleM1858a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c0923qa.f47466e = bundleM1858a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        c0923qa.f47462a = (Random) bundleM1858a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        c0923qa.f47469h.putAll(bundleM1858a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            String str = stringArrayList.get(i);
                            if (c0923qa.f47464c.containsKey(str)) {
                                Integer num = (Integer) c0923qa.f47464c.remove(str);
                                if (!c0923qa.f47469h.containsKey(str)) {
                                    c0923qa.f47463b.remove(num);
                                }
                            }
                            c0923qa.m19333b(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                        }
                        break;
                    }
                }
                break;
        }
    }
}
