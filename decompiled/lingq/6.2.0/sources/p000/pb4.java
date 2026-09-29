package p000;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pb4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qb4 f55928a;

    public pb4(qb4 qb4Var) {
        this.f55928a = qb4Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m19057a(String str, JSONObject jSONObject) throws Exception {
        ArrayList<km5> arrayList = this.f55928a.f57539c;
        str.getClass();
        if (!str.equalsIgnoreCase("SUBSCRIPTION_INACTIVE") && !str.equalsIgnoreCase("Invalid API Key")) {
            eh0.m11135p("IterableEmbeddedManager", "Error while fetching embedded messages: ".concat(str));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((km5) it.next()).getClass();
            }
            return;
        }
        eh0.m11135p("IterableEmbeddedManager", "Subscription is inactive. Stopping sync");
        for (km5 km5Var : arrayList) {
            eh0.m11133m("IterableEmbeddedManager", "Broadcasting subscription inactive to the views");
            km5Var.f47512a.mo0a();
        }
    }
}
