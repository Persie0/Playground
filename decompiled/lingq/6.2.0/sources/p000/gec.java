package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gec {

    /* JADX INFO: renamed from: A */
    public Long f40642A;

    /* JADX INFO: renamed from: B */
    public long f40643B;

    /* JADX INFO: renamed from: C */
    public String f40644C;

    /* JADX INFO: renamed from: D */
    public int f40645D;

    /* JADX INFO: renamed from: E */
    public int f40646E;

    /* JADX INFO: renamed from: F */
    public long f40647F;

    /* JADX INFO: renamed from: G */
    public String f40648G;

    /* JADX INFO: renamed from: H */
    public byte[] f40649H;

    /* JADX INFO: renamed from: I */
    public int f40650I;

    /* JADX INFO: renamed from: J */
    public long f40651J;

    /* JADX INFO: renamed from: K */
    public long f40652K;

    /* JADX INFO: renamed from: L */
    public long f40653L;

    /* JADX INFO: renamed from: M */
    public long f40654M;

    /* JADX INFO: renamed from: N */
    public long f40655N;

    /* JADX INFO: renamed from: O */
    public long f40656O;

    /* JADX INFO: renamed from: P */
    public long f40657P;

    /* JADX INFO: renamed from: Q */
    public String f40658Q;

    /* JADX INFO: renamed from: R */
    public boolean f40659R;

    /* JADX INFO: renamed from: S */
    public long f40660S;

    /* JADX INFO: renamed from: T */
    public long f40661T;

    /* JADX INFO: renamed from: a */
    public final kjc f40662a;

    /* JADX INFO: renamed from: b */
    public final String f40663b;

    /* JADX INFO: renamed from: c */
    public String f40664c;

    /* JADX INFO: renamed from: d */
    public String f40665d;

    /* JADX INFO: renamed from: e */
    public String f40666e;

    /* JADX INFO: renamed from: f */
    public String f40667f;

    /* JADX INFO: renamed from: g */
    public long f40668g;

    /* JADX INFO: renamed from: h */
    public long f40669h;

    /* JADX INFO: renamed from: i */
    public long f40670i;

    /* JADX INFO: renamed from: j */
    public String f40671j;

    /* JADX INFO: renamed from: k */
    public long f40672k;

    /* JADX INFO: renamed from: l */
    public String f40673l;

    /* JADX INFO: renamed from: m */
    public long f40674m;

    /* JADX INFO: renamed from: n */
    public long f40675n;

    /* JADX INFO: renamed from: o */
    public boolean f40676o;

    /* JADX INFO: renamed from: p */
    public boolean f40677p;

    /* JADX INFO: renamed from: q */
    public Boolean f40678q;

    /* JADX INFO: renamed from: r */
    public long f40679r;

    /* JADX INFO: renamed from: s */
    public ArrayList f40680s;

    /* JADX INFO: renamed from: t */
    public String f40681t;

    /* JADX INFO: renamed from: u */
    public boolean f40682u;

    /* JADX INFO: renamed from: v */
    public long f40683v;

    /* JADX INFO: renamed from: w */
    public long f40684w;

    /* JADX INFO: renamed from: x */
    public int f40685x;

    /* JADX INFO: renamed from: y */
    public boolean f40686y;

    /* JADX INFO: renamed from: z */
    public Long f40687z;

    public gec(kjc kjcVar, String str) {
        lda.m16130p(kjcVar);
        lda.m16127m(str);
        this.f40662a = kjcVar;
        this.f40663b = str;
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
    }

    /* JADX INFO: renamed from: A */
    public final void m12518A(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40683v != j;
        this.f40683v = j;
    }

    /* JADX INFO: renamed from: B */
    public final void m12519B(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40684w != j;
        this.f40684w = j;
    }

    /* JADX INFO: renamed from: C */
    public final void m12520C(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40643B != j;
        this.f40643B = j;
    }

    /* JADX INFO: renamed from: D */
    public final String m12521D() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40644C;
    }

    /* JADX INFO: renamed from: E */
    public final String m12522E() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40663b;
    }

    /* JADX INFO: renamed from: F */
    public final String m12523F() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40664c;
    }

    /* JADX INFO: renamed from: G */
    public final void m12524G(String str) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= !Objects.equals(this.f40664c, str);
        this.f40664c = str;
    }

    /* JADX INFO: renamed from: H */
    public final String m12525H() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40665d;
    }

    /* JADX INFO: renamed from: I */
    public final void m12526I(String str) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f40659R |= true ^ Objects.equals(this.f40665d, str);
        this.f40665d = str;
    }

    /* JADX INFO: renamed from: J */
    public final void m12527J(String str) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= !Objects.equals(this.f40666e, str);
        this.f40666e = str;
    }

    /* JADX INFO: renamed from: K */
    public final String m12528K() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40667f;
    }

    /* JADX INFO: renamed from: L */
    public final void m12529L(String str) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= !Objects.equals(this.f40667f, str);
        this.f40667f = str;
    }

    /* JADX INFO: renamed from: M */
    public final void m12530M(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40669h != j;
        this.f40669h = j;
    }

    /* JADX INFO: renamed from: N */
    public final void m12531N(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40670i != j;
        this.f40670i = j;
    }

    /* JADX INFO: renamed from: O */
    public final String m12532O() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40671j;
    }

    /* JADX INFO: renamed from: P */
    public final void m12533P(String str) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= !Objects.equals(this.f40671j, str);
        this.f40671j = str;
    }

    /* JADX INFO: renamed from: Q */
    public final long m12534Q() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40672k;
    }

    /* JADX INFO: renamed from: R */
    public final void m12535R(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40672k != j;
        this.f40672k = j;
    }

    /* JADX INFO: renamed from: S */
    public final void m12536S(String str) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= !Objects.equals(this.f40673l, str);
        this.f40673l = str;
    }

    /* JADX INFO: renamed from: T */
    public final void m12537T(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40674m != j;
        this.f40674m = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m12538a(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40675n != j;
        this.f40675n = j;
    }

    /* JADX INFO: renamed from: b */
    public final long m12539b() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40679r;
    }

    /* JADX INFO: renamed from: c */
    public final void m12540c(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40679r != j;
        this.f40679r = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m12541d(boolean z) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40676o != z;
        this.f40676o = z;
    }

    /* JADX INFO: renamed from: e */
    public final void m12542e(long j) {
        lda.m16125k(j >= 0);
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40668g != j;
        this.f40668g = j;
    }

    /* JADX INFO: renamed from: f */
    public final void m12543f(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40660S != j;
        this.f40660S = j;
    }

    /* JADX INFO: renamed from: g */
    public final void m12544g(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40661T != j;
        this.f40661T = j;
    }

    /* JADX INFO: renamed from: h */
    public final void m12545h(long j) {
        kjc kjcVar = this.f40662a;
        tic ticVar = kjcVar.f47439g;
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        long j2 = this.f40668g + j;
        String str = this.f40663b;
        if (j2 > 2147483647L) {
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(xcc.m24449L(str), "Bundle index overflow. appId");
            j2 = (-1) + j;
        }
        long j3 = this.f40647F + 1;
        if (j3 > 2147483647L) {
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(xcc.m24449L(str), "Delivery index overflow. appId");
            j3 = 0;
        }
        this.f40659R = true;
        this.f40668g = j2;
        this.f40647F = j3;
    }

    /* JADX INFO: renamed from: i */
    public final void m12546i(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40652K != j;
        this.f40652K = j;
    }

    /* JADX INFO: renamed from: j */
    public final void m12547j(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40653L != j;
        this.f40653L = j;
    }

    /* JADX INFO: renamed from: k */
    public final void m12548k(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40654M != j;
        this.f40654M = j;
    }

    /* JADX INFO: renamed from: l */
    public final void m12549l(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40655N != j;
        this.f40655N = j;
    }

    /* JADX INFO: renamed from: m */
    public final void m12550m(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40657P != j;
        this.f40657P = j;
    }

    /* JADX INFO: renamed from: n */
    public final void m12551n(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40656O != j;
        this.f40656O = j;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12552o() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40659R;
    }

    /* JADX INFO: renamed from: p */
    public final void m12553p(int i) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40645D != i;
        this.f40645D = i;
    }

    /* JADX INFO: renamed from: q */
    public final void m12554q(int i) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40646E != i;
        this.f40646E = i;
    }

    /* JADX INFO: renamed from: r */
    public final void m12555r(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40647F != j;
        this.f40647F = j;
    }

    /* JADX INFO: renamed from: s */
    public final String m12556s() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40648G;
    }

    /* JADX INFO: renamed from: t */
    public final int m12557t() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40650I;
    }

    /* JADX INFO: renamed from: u */
    public final void m12558u(long j) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= this.f40651J != j;
        this.f40651J = j;
    }

    /* JADX INFO: renamed from: v */
    public final String m12559v() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        String str = this.f40658Q;
        m12560w(null);
        return str;
    }

    /* JADX INFO: renamed from: w */
    public final void m12560w(String str) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        this.f40659R |= !Objects.equals(this.f40658Q, str);
        this.f40658Q = str;
    }

    /* JADX INFO: renamed from: x */
    public final Boolean m12561x() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40678q;
    }

    /* JADX INFO: renamed from: y */
    public final void m12562y(List list) {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        if (Objects.equals(this.f40680s, list)) {
            return;
        }
        this.f40659R = true;
        this.f40680s = list != null ? new ArrayList(list) : null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m12563z() {
        tic ticVar = this.f40662a.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        return this.f40682u;
    }
}
