package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;
import p000.InterfaceC2991f7;
import p000.le3;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0636d implements InterfaceC2991f7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0638f f5719b;

    public /* synthetic */ C0636d(le3 le3Var, int i) {
        this.f5718a = i;
        this.f5719b = le3Var;
    }

    @Override // p000.InterfaceC2991f7
    /* JADX INFO: renamed from: c */
    public final void mo2125c(Object obj) {
        int i = this.f5718a;
        AbstractC0638f abstractC0638f = this.f5719b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) abstractC0638f.f5729G.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = fragmentManager$LaunchedFragmentInfo.f5629a;
                    if (abstractC0638f.f5742c.m17703w(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) abstractC0638f.f5729G.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = fragmentManager$LaunchedFragmentInfo2.f5629a;
                    int i3 = fragmentManager$LaunchedFragmentInfo2.f5630b;
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM17703w = abstractC0638f.f5742c.m17703w(str2);
                    if (abstractComponentCallbacksC0635cM17703w == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC0635cM17703w.mo2121w(i3, activityResult.f1007a, activityResult.f1008b);
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) abstractC0638f.f5729G.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = fragmentManager$LaunchedFragmentInfo3.f5629a;
                    int i4 = fragmentManager$LaunchedFragmentInfo3.f5630b;
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM17703w2 = abstractC0638f.f5742c.m17703w(str3);
                    if (abstractComponentCallbacksC0635cM17703w2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC0635cM17703w2.mo2121w(i4, activityResult2.f1007a, activityResult2.f1008b);
                    }
                }
                break;
        }
    }
}
