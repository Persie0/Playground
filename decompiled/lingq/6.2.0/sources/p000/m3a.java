package p000;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.TokenPopupData;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;

/* JADX INFO: loaded from: classes2.dex */
public final class m3a implements l3a {

    /* JADX INFO: renamed from: a */
    public final C3211a f50525a;

    /* JADX INFO: renamed from: b */
    public final du0 f50526b;

    /* JADX INFO: renamed from: c */
    public final C3211a f50527c;

    /* JADX INFO: renamed from: d */
    public final du0 f50528d;

    /* JADX INFO: renamed from: e */
    public final C3211a f50529e;

    /* JADX INFO: renamed from: f */
    public final du0 f50530f;

    /* JADX INFO: renamed from: g */
    public final C3211a f50531g;

    /* JADX INFO: renamed from: h */
    public final du0 f50532h;

    /* JADX INFO: renamed from: i */
    public final C3211a f50533i;

    /* JADX INFO: renamed from: j */
    public final du0 f50534j;

    /* JADX INFO: renamed from: k */
    public final du0 f50535k;

    /* JADX INFO: renamed from: l */
    public final C3211a f50536l;

    /* JADX INFO: renamed from: m */
    public final du0 f50537m;

    /* JADX INFO: renamed from: n */
    public final C3211a f50538n;

    /* JADX INFO: renamed from: o */
    public final du0 f50539o;

    /* JADX INFO: renamed from: p */
    public final C3211a f50540p;

    /* JADX INFO: renamed from: q */
    public final du0 f50541q;

    /* JADX INFO: renamed from: r */
    public final C3211a f50542r;

    /* JADX INFO: renamed from: s */
    public final du0 f50543s;

    /* JADX INFO: renamed from: t */
    public final du0 f50544t;

    /* JADX INFO: renamed from: u */
    public final C3211a f50545u;

    /* JADX INFO: renamed from: v */
    public final du0 f50546v;

    /* JADX INFO: renamed from: w */
    public final C3211a f50547w;

    /* JADX INFO: renamed from: x */
    public final C3211a f50548x;

    public m3a() {
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f50525a = c3211aM7042a;
        this.f50526b = AbstractC3224d.m15519A(c3211aM7042a);
        C3211a c3211aM7042a2 = AbstractC1261a.m7042a();
        this.f50527c = c3211aM7042a2;
        this.f50528d = AbstractC3224d.m15519A(c3211aM7042a2);
        C3211a c3211aM7042a3 = AbstractC1261a.m7042a();
        this.f50529e = c3211aM7042a3;
        this.f50530f = AbstractC3224d.m15519A(c3211aM7042a3);
        C3211a c3211aM10525a = do7.m10525a(0, 6, null);
        this.f50531g = c3211aM10525a;
        this.f50532h = AbstractC3224d.m15519A(c3211aM10525a);
        C3211a c3211aM7042a4 = AbstractC1261a.m7042a();
        this.f50533i = c3211aM7042a4;
        this.f50534j = AbstractC3224d.m15519A(c3211aM7042a4);
        this.f50535k = AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        C3211a c3211aM7042a5 = AbstractC1261a.m7042a();
        this.f50536l = c3211aM7042a5;
        this.f50537m = AbstractC3224d.m15519A(c3211aM7042a5);
        C3211a c3211aM7042a6 = AbstractC1261a.m7042a();
        this.f50538n = c3211aM7042a6;
        this.f50539o = AbstractC3224d.m15519A(c3211aM7042a6);
        C3211a c3211aM7042a7 = AbstractC1261a.m7042a();
        this.f50540p = c3211aM7042a7;
        this.f50541q = AbstractC3224d.m15519A(c3211aM7042a7);
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        C3211a c3211aM7042a8 = AbstractC1261a.m7042a();
        this.f50542r = c3211aM7042a8;
        this.f50543s = AbstractC3224d.m15519A(c3211aM7042a8);
        this.f50544t = AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        AbstractC3224d.m15519A(do7.m10525a(-1, 6, null));
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        C3211a c3211aM7042a9 = AbstractC1261a.m7042a();
        this.f50545u = c3211aM7042a9;
        this.f50546v = AbstractC3224d.m15519A(c3211aM7042a9);
        C3211a c3211aM7042a10 = AbstractC1261a.m7042a();
        this.f50547w = c3211aM7042a10;
        AbstractC3224d.m15519A(c3211aM7042a10);
        C3211a c3211aM7042a11 = AbstractC1261a.m7042a();
        this.f50548x = c3211aM7042a11;
        AbstractC3224d.m15519A(c3211aM7042a11);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f50530f;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f50542r.mo4677k(xfa.f68157a);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f50547w.mo4677k(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f50525a.mo4677k(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f50544t;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f50539o;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f50546v;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f50534j;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f50531g.mo4677k(Boolean.TRUE);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f50537m;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        mo8761f();
        this.f50536l.mo4677k(new Pair(tokenRelatedPhrase, Boolean.FALSE));
        String str = tokenRelatedPhrase.f19613b;
        this.f50527c.mo4677k(new TokenPopupData(str, str, TokenType.NewWordOrPhraseType, i, i2, new TokenFragmentData(), null, null, tokenRelatedPhrase.f19614c, i5, null, true, 0, 0, AbstractC3194a.m15360M(), i3, i4, 0, 0, false, null, null, false, 8258752, null));
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f50526b;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f50540p.mo4677k(xfa.f68157a);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f50538n.mo4677k(xfa.f68157a);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f50541q;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f50543s;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f50545u.mo4677k(xfa.f68157a);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f50532h;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f50548x.mo4677k(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f50528d;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f50533i.mo4677k(Integer.valueOf(i));
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        C3211a c3211a = this.f50529e;
        xfa xfaVar = xfa.f68157a;
        c3211a.mo4677k(xfaVar);
        if (z2) {
            mo8761f();
        }
        if (z) {
            this.f50542r.mo4677k(xfaVar);
        }
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f50535k;
    }
}
