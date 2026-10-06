package p000;

import android.util.Log;

/* JADX INFO: renamed from: cl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0093cl implements InterfaceC0918pw {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0111cq f6089a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f6090b;

    public C0093cl(C0111cq c0111cq, int i) {
        this.f6090b = i;
        this.f6089a = c0111cq;
    }

    @Override // p000.InterfaceC0918pw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3666a(Object obj) {
        switch (this.f6090b) {
            case 0:
                C0917pv c0917pv = (C0917pv) obj;
                C0095cn c0095cn = (C0095cn) this.f6089a.f8796p.pollFirst();
                if (c0095cn != null) {
                    String str = c0095cn.f6333a;
                    int i = c0095cn.f6334b;
                    ComponentCallbacksC0077bw componentCallbacksC0077bwM5547c = this.f6089a.f8781a.m5547c(str);
                    if (componentCallbacksC0077bwM5547c != null) {
                        componentCallbacksC0077bwM5547c.onActivityResult(i, c0917pv.f47455a, c0917pv.f47456b);
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str)));
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No IntentSenders were started for ");
                    sb.append(this);
                    Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                }
                break;
            default:
                C0917pv c0917pv2 = (C0917pv) obj;
                C0095cn c0095cn2 = (C0095cn) this.f6089a.f8796p.pollFirst();
                if (c0095cn2 != null) {
                    String str2 = c0095cn2.f6333a;
                    int i2 = c0095cn2.f6334b;
                    ComponentCallbacksC0077bw componentCallbacksC0077bwM5547c2 = this.f6089a.f8781a.m5547c(str2);
                    if (componentCallbacksC0077bwM5547c2 != null) {
                        componentCallbacksC0077bwM5547c2.onActivityResult(i2, c0917pv2.f47455a, c0917pv2.f47456b);
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No Activities were started for result for ");
                    sb2.append(this);
                    Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                }
                break;
        }
    }
}
