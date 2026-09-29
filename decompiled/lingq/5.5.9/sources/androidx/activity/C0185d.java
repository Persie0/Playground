package androidx.activity;

import android.os.Bundle;
import androidx.p544savedstate.C1189a;
import androidx.view.C1024c0;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.activity.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0185d implements C1189a.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f479b;

    public /* synthetic */ C0185d(int i10, Object obj) {
        this.f478a = i10;
        this.f479b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.p544savedstate.C1189a.b
    /* JADX INFO: renamed from: a */
    public final Bundle mo811a() {
        int i10 = this.f478a;
        Object obj = this.f479b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                ComponentActivity.C0174b c0174b = componentActivity.f447k;
                c0174b.getClass();
                HashMap map = c0174b.f523c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0174b.f525e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0174b.f528h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", c0174b.f521a);
                return bundle;
            default:
                return C1024c0.m3928a((C1024c0) obj);
        }
    }
}
