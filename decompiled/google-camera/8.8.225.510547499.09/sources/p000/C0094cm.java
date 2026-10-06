package p000;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: cm */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0094cm extends AbstractC0927qe {
    @Override // p000.AbstractC0927qe
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3937a(int i, Intent intent) {
        return new C0917pv(i, intent);
    }

    @Override // p000.AbstractC0927qe
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Intent mo3938b(Object obj) {
        Bundle bundleExtra;
        C0926qd c0926qdM19338a = (C0926qd) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = c0926qdM19338a.f47476b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                C0925qc c0925qc = new C0925qc(c0926qdM19338a.f47475a);
                c0925qc.f47471a = null;
                c0925qc.m19339b(c0926qdM19338a.f47478d, c0926qdM19338a.f47477c);
                c0926qdM19338a = c0925qc.m19338a();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0926qdM19338a);
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CreateIntent created the following intent: ");
            sb.append(intent);
        }
        return intent;
    }
}
