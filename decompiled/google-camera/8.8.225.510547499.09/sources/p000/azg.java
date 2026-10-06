package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azg extends C0158ej {

    /* JADX INFO: renamed from: g */
    private static final String f2763g = ayc.m2100b("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    public final azp f2764a;

    /* JADX INFO: renamed from: b */
    public final String f2765b;

    /* JADX INFO: renamed from: c */
    public final List f2766c;

    /* JADX INFO: renamed from: d */
    public final List f2767d;

    /* JADX INFO: renamed from: e */
    public boolean f2768e;

    /* JADX INFO: renamed from: f */
    public final int f2769f;

    /* JADX INFO: renamed from: h */
    private final List f2770h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private ayg f2771i;

    public azg(azp azpVar, String str, int i, List list) {
        this.f2764a = azpVar;
        this.f2765b = str;
        this.f2769f = i;
        this.f2766c = list;
        this.f2767d = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            String strM19476d = ((C1058va) list.get(i2)).m19476d();
            this.f2767d.add(strM19476d);
            this.f2770h.add(strM19476d);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Set m2121i() {
        return new HashSet();
    }

    /* JADX INFO: renamed from: h */
    public final ayg m2122h() {
        if (this.f2768e) {
            ayc.m2099a();
            Log.w(f2763g, "Already enqueued work ids (" + TextUtils.join(", ", this.f2767d) + ")");
        } else {
            bdt bdtVar = new bdt(this);
            bdx.m2257b(this.f2764a.f2789k, bdtVar);
            this.f2771i = bdtVar.f3008a;
        }
        return this.f2771i;
    }
}
