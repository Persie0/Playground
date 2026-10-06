package p000;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: cg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0088cg implements aql {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5553a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5554b;

    public /* synthetic */ C0088cg(ActivityC0080bz activityC0080bz, int i) {
        this.f5554b = i;
        this.f5553a = activityC0080bz;
    }

    public /* synthetic */ C0088cg(C0111cq c0111cq, int i) {
        this.f5554b = i;
        this.f5553a = c0111cq;
    }

    public C0088cg(ActivityC0157ei activityC0157ei, int i) {
        this.f5554b = i;
        this.f5553a = activityC0157ei;
    }

    public /* synthetic */ C0088cg(ActivityC0907pl activityC0907pl, int i) {
        this.f5554b = i;
        this.f5553a = activityC0907pl;
    }

    @Override // p000.aql
    /* JADX INFO: renamed from: a */
    public final Bundle mo910a() {
        switch (this.f5554b) {
            case 0:
                return ((C0111cq) this.f5553a).m5322b();
            case 1:
                ActivityC0080bz activityC0080bz = (ActivityC0080bz) this.f5553a;
                activityC0080bz.m3208e();
                activityC0080bz.f4795d.m880b(akq.ON_STOP);
                return new Bundle();
            case 2:
                Bundle bundle = new Bundle();
                ((ActivityC0157ei) this.f5553a).m7343j();
                return bundle;
            default:
                Object obj = this.f5553a;
                Bundle bundle2 = new Bundle();
                C0923qa c0923qa = ((ActivityC0907pl) obj).f47427h;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(c0923qa.f47464c.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(c0923qa.f47464c.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0923qa.f47466e));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0923qa.f47469h.clone());
                bundle2.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", c0923qa.f47462a);
                return bundle2;
        }
    }
}
