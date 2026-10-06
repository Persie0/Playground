package p000;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjw {

    /* JADX INFO: renamed from: a */
    public String f34190a;

    /* JADX INFO: renamed from: b */
    public String f34191b;

    /* JADX INFO: renamed from: c */
    public boolean f34192c;

    /* JADX INFO: renamed from: e */
    private final Bundle f34194e = new Bundle();

    /* JADX INFO: renamed from: f */
    private final List f34195f = new ArrayList();

    /* JADX INFO: renamed from: d */
    public ApplicationErrorReport f34193d = new ApplicationErrorReport();

    /* JADX INFO: renamed from: g */
    private final String f34196g = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());

    @Deprecated
    public jjw() {
    }

    /* JADX INFO: renamed from: a */
    public final jjx m13321a() {
        jjx jjxVar = new jjx(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false);
        jjxVar.f34209m = null;
        jjxVar.f34202f = null;
        jjxVar.f34197a = null;
        jjxVar.f34199c = this.f34190a;
        jjxVar.f34198b = this.f34194e;
        jjxVar.f34201e = this.f34191b;
        jjxVar.f34204h = this.f34195f;
        jjxVar.f34205i = this.f34192c;
        jjxVar.f34206j = null;
        jjxVar.f34207k = null;
        jjxVar.f34208l = false;
        jjxVar.f34210n = this.f34196g;
        jjxVar.f34211o = false;
        jjxVar.f34212p = 0L;
        jjxVar.f34213q = false;
        return jjxVar;
    }
}
