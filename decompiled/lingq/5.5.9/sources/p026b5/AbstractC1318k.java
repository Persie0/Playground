package p026b5;

import ae.C0062b;
import androidx.work.AbstractC1246d;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.WorkInfo$State;
import dm.C5207g;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p214k5.C6617s;
import p260m8.C7499b;

/* JADX INFO: renamed from: b5.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1318k {

    /* JADX INFO: renamed from: a */
    public final UUID f8066a;

    /* JADX INFO: renamed from: b */
    public final C6617s f8067b;

    /* JADX INFO: renamed from: c */
    public final Set<String> f8068c;

    /* JADX INFO: renamed from: b5.k$a */
    public static abstract class a<B extends a<B, ?>, W extends AbstractC1318k> {

        /* JADX INFO: renamed from: a */
        public boolean f8069a;

        /* JADX INFO: renamed from: b */
        public UUID f8070b;

        /* JADX INFO: renamed from: c */
        public C6617s f8071c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f8072d;

        public a(Class<? extends AbstractC1246d> cls) {
            UUID uuidRandomUUID = UUID.randomUUID();
            C5207g.m11110e(uuidRandomUUID, "randomUUID()");
            this.f8070b = uuidRandomUUID;
            String string = this.f8070b.toString();
            C5207g.m11110e(string, "id.toString()");
            this.f8071c = new C6617s(string, null, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 1048570, 0);
            this.f8072d = C7499b.m14946j0(cls.getName());
        }

        /* JADX INFO: renamed from: a */
        public final W m4879a() {
            C1315h c1315hMo4874b = mo4874b();
            C1309b c1309b = this.f8071c.f37533j;
            boolean z10 = (c1309b.f8053h.isEmpty() ^ true) || c1309b.f8049d || c1309b.f8047b || c1309b.f8048c;
            C6617s c6617s = this.f8071c;
            if (c6617s.f37540q) {
                if (!(!z10)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (!(c6617s.f37530g <= 0)) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            C5207g.m11110e(uuidRandomUUID, "randomUUID()");
            this.f8070b = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            C5207g.m11110e(string, "id.toString()");
            C6617s c6617s2 = this.f8071c;
            C5207g.m11111f(c6617s2, "other");
            String str = c6617s2.f37526c;
            WorkInfo$State workInfo$State = c6617s2.f37525b;
            String str2 = c6617s2.f37527d;
            C1244b c1244b = new C1244b(c6617s2.f37528e);
            C1244b c1244b2 = new C1244b(c6617s2.f37529f);
            long j10 = c6617s2.f37530g;
            long j11 = c6617s2.f37531h;
            long j12 = c6617s2.f37532i;
            C1309b c1309b2 = c6617s2.f37533j;
            C5207g.m11111f(c1309b2, "other");
            this.f8071c = new C6617s(string, workInfo$State, str, str2, c1244b, c1244b2, j10, j11, j12, new C1309b(c1309b2.f8046a, c1309b2.f8047b, c1309b2.f8048c, c1309b2.f8049d, c1309b2.f8050e, c1309b2.f8051f, c1309b2.f8052g, c1309b2.f8053h), c6617s2.f37534k, c6617s2.f37535l, c6617s2.f37536m, c6617s2.f37537n, c6617s2.f37538o, c6617s2.f37539p, c6617s2.f37540q, c6617s2.f37541r, c6617s2.f37542s, 524288, 0);
            mo4875c();
            return c1315hMo4874b;
        }

        /* JADX INFO: renamed from: b */
        public abstract C1315h mo4874b();

        /* JADX INFO: renamed from: c */
        public abstract C1315h.a mo4875c();

        /* JADX INFO: renamed from: d */
        public final a m4880d(BackoffPolicy backoffPolicy, TimeUnit timeUnit) {
            C5207g.m11111f(backoffPolicy, "backoffPolicy");
            C5207g.m11111f(timeUnit, "timeUnit");
            this.f8069a = true;
            C6617s c6617s = this.f8071c;
            c6617s.f37535l = backoffPolicy;
            long millis = timeUnit.toMillis(10000L);
            String str = C6617s.f37523u;
            if (millis > 18000000) {
                AbstractC1314g.m4867d().mo4873g(str, "Backoff delay duration exceeds maximum value");
            }
            if (millis < 10000) {
                AbstractC1314g.m4867d().mo4873g(str, "Backoff delay duration less than minimum value");
            }
            c6617s.f37536m = C0062b.m365l0(millis, 10000L, 18000000L);
            return (C1315h.a) this;
        }
    }

    public AbstractC1318k(UUID uuid, C6617s c6617s, Set<String> set) {
        C5207g.m11111f(uuid, "id");
        C5207g.m11111f(c6617s, "workSpec");
        C5207g.m11111f(set, "tags");
        this.f8066a = uuid;
        this.f8067b = c6617s;
        this.f8068c = set;
    }
}
