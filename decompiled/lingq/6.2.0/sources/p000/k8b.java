package p000;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k8b {

    /* JADX INFO: renamed from: a */
    public boolean f46871a;

    /* JADX INFO: renamed from: b */
    public UUID f46872b;

    /* JADX INFO: renamed from: c */
    public p8b f46873c;

    /* JADX INFO: renamed from: d */
    public final Set f46874d;

    public k8b(Class cls) {
        cls.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.f46872b = uuidRandomUUID;
        String string = this.f46872b.toString();
        string.getClass();
        this.f46873c = new p8b(string, (WorkInfo$State) null, cls.getName(), (String) null, (sz1) null, (sz1) null, 0L, 0L, 0L, (ak1) null, 0, (BackoffPolicy) null, 0L, 0L, 0L, 0L, false, (OutOfQuotaPolicy) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3194a.m15363P(1));
        AbstractC3550rv.m20848p0(strArr, linkedHashSet);
        this.f46874d = linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    public final l8b m15004a() {
        l8b l8bVarMo10910b = mo10910b();
        ak1 ak1Var = this.f46873c.f55781j;
        boolean z = ak1Var.m519g() || ak1Var.f756e || ak1Var.f754c || ak1Var.f755d;
        p8b p8bVar = this.f46873c;
        if (p8bVar.f55788q) {
            if (z) {
                C3386nv.m17626m("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (p8bVar.f55778g > 0) {
                C3386nv.m17626m("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = p8bVar.f55795x;
        if (str == null) {
            List listM23365A0 = vk9.m23365A0(p8bVar.f55774c, new String[]{"."}, 0, 6);
            String strM23375K0 = listM23365A0.size() == 1 ? (String) listM23365A0.get(0) : (String) u91.m22597O0(listM23365A0);
            if (strM23375K0.length() > 127) {
                strM23375K0 = vk9.m23375K0(127, strM23375K0);
            }
            p8bVar.f55795x = strM23375K0;
        } else if (str.length() > 127) {
            this.f46873c.f55795x = vk9.m23375K0(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.f46872b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        p8b p8bVar2 = this.f46873c;
        p8bVar2.getClass();
        this.f46873c = new p8b(string, p8bVar2.f55773b, p8bVar2.f55774c, p8bVar2.f55775d, new sz1(p8bVar2.f55776e), new sz1(p8bVar2.f55777f), p8bVar2.f55778g, p8bVar2.f55779h, p8bVar2.f55780i, new ak1(p8bVar2.f55781j), p8bVar2.f55782k, p8bVar2.f55783l, p8bVar2.f55784m, p8bVar2.f55785n, p8bVar2.f55786o, p8bVar2.f55787p, p8bVar2.f55788q, p8bVar2.f55789r, p8bVar2.f55790s, p8bVar2.f55792u, p8bVar2.f55793v, p8bVar2.f55794w, p8bVar2.f55795x, p8bVar2.f55796y, 524288);
        return l8bVarMo10910b;
    }

    /* JADX INFO: renamed from: b */
    public abstract l8b mo10910b();

    /* JADX INFO: renamed from: c */
    public abstract k8b mo10911c();

    /* JADX INFO: renamed from: d */
    public final k8b m15005d(BackoffPolicy backoffPolicy, long j, TimeUnit timeUnit) {
        backoffPolicy.getClass();
        timeUnit.getClass();
        this.f46871a = true;
        p8b p8bVar = this.f46873c;
        p8bVar.f55783l = backoffPolicy;
        long millis = timeUnit.toMillis(j);
        String str = p8b.f55771z;
        if (millis > 18000000) {
            oj5.m18040f().m18046j(str, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            oj5.m18040f().m18046j(str, "Backoff delay duration less than minimum value");
        }
        p8bVar.f55784m = l70.m15947j(millis, 10000L, 18000000L);
        return mo10911c();
    }

    /* JADX INFO: renamed from: e */
    public final k8b m15006e(ak1 ak1Var) {
        this.f46873c.f55781j = ak1Var;
        return mo10911c();
    }

    /* JADX INFO: renamed from: f */
    public final k8b m15007f() {
        TimeUnit.DAYS.getClass();
        this.f46873c.f55778g = 315360000000L;
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.f46873c.f55778g) {
            return (tx6) this;
        }
        C3386nv.m17626m("The given initial delay is too large and will cause an overflow!");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final k8b m15008g(sz1 sz1Var) {
        sz1Var.getClass();
        this.f46873c.f55776e = sz1Var;
        return mo10911c();
    }
}
