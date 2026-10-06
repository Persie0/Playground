package p000;

import android.os.SystemClock;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kqi implements kqg {

    /* JADX INFO: renamed from: a */
    private final kro f36841a;

    /* JADX INFO: renamed from: b */
    private final kqv f36842b;

    /* JADX INFO: renamed from: c */
    private final kqq f36843c;

    /* JADX INFO: renamed from: d */
    private final ksc f36844d;

    /* JADX INFO: renamed from: e */
    private final kbo f36845e;

    /* JADX INFO: renamed from: f */
    private final kbz f36846f;

    /* JADX INFO: renamed from: g */
    private final String f36847g;

    /* JADX INFO: renamed from: h */
    private final krj f36848h;

    /* JADX INFO: renamed from: i */
    private final Set f36849i = new HashSet();

    /* JADX INFO: renamed from: j */
    private final Set f36850j = new HashSet();

    /* JADX INFO: renamed from: k */
    private final Set f36851k = new HashSet();

    /* JADX INFO: renamed from: l */
    private final mwn f36852l = mws.m17090e();

    /* JADX INFO: renamed from: m */
    private final kql f36853m;

    /* JADX INFO: renamed from: n */
    private final kqh f36854n;

    /* JADX INFO: renamed from: o */
    private final long f36855o;

    /* JADX INFO: renamed from: p */
    private final long f36856p;

    /* JADX INFO: renamed from: q */
    private kqc f36857q;

    /* JADX INFO: renamed from: r */
    private boolean f36858r;

    /* JADX INFO: renamed from: s */
    private final lhz f36859s;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public kqi(kro kroVar, kqv kqvVar, lhz lhzVar, ksc kscVar, kbo kboVar, kbz kbzVar, kqj kqjVar, krj krjVar, kqq kqqVar, String str, long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        kql kqlVar = new kql();
        kqlVar.f36876d = "";
        kqlVar.m14710a(mzr.f41857a);
        kqlVar.m14711b(1);
        this.f36853m = kqlVar;
        this.f36841a = kroVar;
        this.f36842b = kqvVar;
        this.f36859s = lhzVar;
        this.f36844d = kscVar;
        this.f36845e = kboVar.mo6314a("MediaGroup");
        this.f36846f = kbzVar;
        this.f36847g = str;
        this.f36848h = krjVar;
        this.f36843c = kqqVar;
        this.f36855o = j;
        this.f36856p = j2;
        kqh kqhVar = new kqh(kqh.f36839a.getAndIncrement());
        this.f36854n = kqhVar;
        synchronized (kqjVar.f36864e) {
            kqjVar.f36860a.put(kqhVar, false);
        }
        kqlVar.f36873a = kqhVar;
        kqlVar.f36876d = str;
        kqlVar.f36874b = j;
        kqlVar.f36882j = krjVar;
        kqlVar.f36875c = j2;
        kqlVar.f36883k = (byte) 3;
    }

    @Override // p000.kqg
    /* JADX INFO: renamed from: a */
    public final kqc mo14690a(String str) {
        String strM15011d = kxk.m15011d(str);
        boolean z = false;
        if (!mro.m16832b(strM15011d) && krm.DCIM.m14773c(strM15011d)) {
            z = true;
        }
        return mo14695f(1, z ? krm.DCIM : krm.APP_DATA, z ? this.f36842b.f36970o : this.f36842b.f36969n, str);
    }

    @Override // p000.kqg
    /* JADX INFO: renamed from: b */
    public final synchronized void mo14691b() {
        lku.m15616K(!this.f36858r, "Cannot modify the group after publish() or abandon(): %s", this.f36854n);
        this.f36858r = true;
        this.f36845e.mo13944f(toString().concat(" Abandoned"));
        this.f36846f.mo13961e(toString().concat("#abandon"));
        kqq kqqVar = this.f36843c;
        kqo kqoVarM14714a = kqp.m14714a();
        kqoVarM14714a.f36904e = this.f36853m;
        kqoVarM14714a.f36901b = this.f36849i;
        kqoVarM14714a.f36902c = this.f36850j;
        kqoVarM14714a.f36903d = this.f36851k;
        kqoVarM14714a.m14713b(this.f36852l.m17081f());
        kqqVar.mo14715a(kqoVarM14714a.m14712a());
        this.f36846f.mo13962f();
    }

    @Override // p000.kqg
    /* JADX INFO: renamed from: c */
    public final void mo14692c(kqf kqfVar) {
        lku.m15614I(!this.f36858r, DNTdN.wuVZECoDPN);
        kqfVar.getClass();
        this.f36852l.m17082g(kqfVar);
    }

    @Override // p000.kqg
    /* JADX INFO: renamed from: d */
    public final synchronized void mo14693d() {
        lku.m15616K(!this.f36858r, "Cannot modify the group after publish() or abandon(): %s", this.f36854n);
        this.f36858r = true;
        this.f36845e.mo13944f(toString().concat(" Closed"));
        this.f36846f.mo13961e(toString().concat("#close"));
        kqo kqoVarM14714a = kqp.m14714a();
        kqoVarM14714a.f36904e = this.f36853m;
        kqoVarM14714a.f36901b = this.f36849i;
        kqoVarM14714a.f36902c = this.f36850j;
        kqoVarM14714a.f36903d = this.f36851k;
        kqoVarM14714a.m14713b(this.f36852l.m17081f());
        kqc kqcVar = this.f36857q;
        if (kqcVar != null) {
            kqoVarM14714a.f36900a = kqcVar;
        }
        this.f36843c.mo14716b(kqoVarM14714a.m14712a());
        this.f36846f.mo13962f();
    }

    @Override // p000.kqg
    /* JADX INFO: renamed from: e */
    public final synchronized void mo14694e(kqc kqcVar) {
        lku.m15616K(!this.f36858r, "Cannot modify the group after publish() or abandon(): %s", this.f36854n);
        this.f36845e.mo13944f("Set " + kqcVar.toString() + " as the primary item for " + toString());
        this.f36857q = kqcVar;
    }

    @Override // p000.kqg
    /* JADX INFO: renamed from: f */
    public final kqc mo14695f(int i, krm krmVar, String str, String str2) {
        krc krcVar;
        lku.m15614I(!this.f36858r, "Cannot create files after publish() or abandon()");
        this.f36846f.mo13961e("MediaGroup#create");
        krc krcVar2 = new krc(this.f36841a, this.f36859s, this.f36848h, this.f36843c, this.f36855o, this.f36856p, SystemClock.elapsedRealtimeNanos(), this.f36847g, i, krmVar, str, str2, this.f36846f, this.f36845e, null, null, null);
        switch (i - 1) {
            case 1:
                krcVar = krcVar2;
                this.f36845e.mo13944f("Created " + krcVar.toString() + " from " + toString());
                this.f36850j.add(krcVar);
                break;
            case 2:
                this.f36845e.mo13944f("Created " + krcVar2.toString() + " from " + toString());
                krcVar = krcVar2;
                this.f36851k.add(krcVar);
                break;
            default:
                krcVar = krcVar2;
                this.f36845e.mo13944f("Created " + krcVar.toString() + " from " + toString());
                this.f36849i.add(krcVar);
                break;
        }
        this.f36846f.mo13962f();
        return krcVar;
    }

    @Override // p000.kqg
    /* JADX INFO: renamed from: g */
    public final kqc mo14696g() {
        return mo14695f(3, krm.f37067e, this.f36842b.f36968m, "mp4");
    }

    public final String toString() {
        return this.f36854n.toString();
    }
}
