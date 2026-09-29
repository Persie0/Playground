package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.core.p012ui.challenges.LeaderboardMetric;
import com.lingq.feature.challenges.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cq0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34367a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fr0 f34368b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f34369c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f34370d;

    public /* synthetic */ cq0(fr0 fr0Var, vi3 vi3Var, Context context) {
        this.f34368b = fr0Var;
        this.f34369c = vi3Var;
        this.f34370d = context;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        p84 p84Var;
        int i = this.f34367a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var2 = we1.f66679a;
        Context context = this.f34370d;
        final vi3 vi3Var = this.f34369c;
        final fr0 fr0Var = this.f34368b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ls0 ls0Var = fr0Var.f39505c;
                    ChallengeType challengeType = fr0Var.f39503a;
                    if (fa4.m11650l(ls0Var, is0.f44478a)) {
                        tj3Var.m22111b0(-902062541);
                        tj3Var.m22139q(false);
                    } else if (fa4.m11650l(ls0Var, js0.f46054a)) {
                        tj3Var.m22111b0(-902008260);
                        q5d.m19672f(null, challengeType, tj3Var, 0);
                        tj3Var.m22139q(false);
                    } else {
                        if (!(ls0Var instanceof ks0)) {
                            throw ux5.m23001x(tj3Var, -1414571372, false);
                        }
                        tj3Var.m22111b0(-901751301);
                        int i2 = kq0.f48312a[challengeType.ordinal()];
                        if (i2 == 1) {
                            z = false;
                            tj3Var.m22111b0(-901749410);
                            ks0 ks0Var = (ks0) ls0Var;
                            b6d.m3387g(null, e6d.m10900e(ks0Var.f48374a, challengeType, context), ks0Var.f48375b, tj3Var, 0);
                            tj3Var.m22139q(false);
                        } else if (i2 == 2) {
                            z = false;
                            tj3Var.m22111b0(-901288998);
                            ks0 ks0Var2 = (ks0) ls0Var;
                            b6d.m3391k(null, (hr0) u91.m22589G0(e6d.m10900e(ks0Var2.f48374a, challengeType, context)), ks0Var2.f48375b, tj3Var, 0);
                            tj3Var.m22139q(false);
                        } else if (i2 == 3) {
                            z = false;
                            tj3Var.m22111b0(-900824091);
                            ks0 ks0Var3 = (ks0) ls0Var;
                            b6d.m3385e(null, e6d.m10900e(ks0Var3.f48374a, challengeType, context), ks0Var3.f48375b, tj3Var, 0);
                            tj3Var.m22139q(false);
                        } else if (i2 == 4) {
                            z = false;
                            tj3Var.m22111b0(-900370592);
                            ks0 ks0Var4 = (ks0) ls0Var;
                            b6d.m3386f(null, e6d.m10900e(ks0Var4.f48374a, challengeType, context), ks0Var4.f48375b, tj3Var, 0);
                            tj3Var.m22139q(false);
                        } else if (i2 != 5) {
                            tj3Var.m22111b0(-898822855);
                            z = false;
                            tj3Var.m22139q(false);
                        } else {
                            z = false;
                            tj3Var.m22111b0(-899891487);
                            ef0 ef0Var = fr0Var.f39508f;
                            if (ef0Var == null || !ef0Var.f37160b) {
                                tj3Var.m22111b0(-899809647);
                                jr0 jr0Var = (jr0) u91.m22589G0(((ks0) ls0Var).f48374a);
                                boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22124i(fr0Var);
                                Object objM22097O = tj3Var.m22097O();
                                if (zM22120g || objM22097O == p84Var2) {
                                    final int i3 = 0;
                                    objM22097O = new vi3() { // from class: gq0
                                        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
                                        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 java.lang.Object, still in use, count: 2, list:
                                              (r2v11 java.lang.Object) from 0x0030: PHI (r2 I:??) = (r2v8 java.lang.Object), (r2v11 java.lang.Object) binds: [B:10:0x002f, B:23:0x0030] A[DONT_GENERATE, DONT_INLINE]
                                              (r2v11 java.lang.Object) from 0x0024: CHECK_CAST (kotlin.Pair) (r2v11 java.lang.Object)
                                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                                            */
                                        @Override // p000.vi3
                                        public final java.lang.Object invoke(java.lang.Object r6) {
                                            /*
                                                r5 = this;
                                                int r0 = r3
                                                xfa r1 = p000.xfa.f68157a
                                                fr0 r2 = r2
                                                vi3 r5 = r1
                                                switch(r0) {
                                                    case 0: goto L50;
                                                    default: goto Lb;
                                                }
                                            Lb:
                                                java.lang.String r6 = (java.lang.String) r6
                                                r6.getClass()
                                                java.util.List r0 = r2.f39512j
                                                java.lang.Iterable r0 = (java.lang.Iterable) r0
                                                java.util.Iterator r0 = r0.iterator()
                                            L18:
                                                boolean r2 = r0.hasNext()
                                                r3 = 0
                                                if (r2 == 0) goto L2f
                                                java.lang.Object r2 = r0.next()
                                                r4 = r2
                                                kotlin.Pair r4 = (kotlin.Pair) r4
                                                java.lang.Object r4 = r4.f47624b
                                                boolean r4 = p000.fa4.m11650l(r4, r6)
                                                if (r4 == 0) goto L18
                                                goto L30
                                            L2f:
                                                r2 = r3
                                            L30:
                                                kotlin.Pair r2 = (kotlin.Pair) r2
                                                if (r2 == 0) goto L43
                                                java.lang.Object r6 = r2.f47623a
                                                java.lang.String r6 = (java.lang.String) r6
                                                if (r6 == 0) goto L43
                                                java.util.Locale r0 = java.util.Locale.ROOT
                                                java.lang.String r3 = r6.toLowerCase(r0)
                                                r3.getClass()
                                            L43:
                                                if (r3 != 0) goto L47
                                                java.lang.String r3 = ""
                                            L47:
                                                lq0 r6 = new lq0
                                                r6.<init>(r3)
                                                r5.invoke(r6)
                                                return r1
                                            L50:
                                                java.lang.Integer r6 = (java.lang.Integer) r6
                                                int r6 = r6.intValue()
                                                dr0 r0 = new dr0
                                                ls0 r2 = r2.f39505c
                                                ks0 r2 = (p000.ks0) r2
                                                java.util.List r2 = r2.f48374a
                                                java.lang.Object r2 = p000.u91.m22589G0(r2)
                                                jr0 r2 = (p000.jr0) r2
                                                java.lang.String r2 = r2.f46029i
                                                r0.<init>(r6, r2)
                                                r5.invoke(r0)
                                                return r1
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: p000.gq0.invoke(java.lang.Object):java.lang.Object");
                                        }
                                    };
                                    tj3Var.m22131l0(objM22097O);
                                }
                                vi3 vi3Var2 = (vi3) objM22097O;
                                boolean zM22120g2 = tj3Var.m22120g(vi3Var);
                                Object objM22097O2 = tj3Var.m22097O();
                                if (zM22120g2 || objM22097O2 == p84Var2) {
                                    objM22097O2 = new te0(vi3Var, 6);
                                    tj3Var.m22131l0(objM22097O2);
                                }
                                b6d.m3381a(null, jr0Var, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
                                z = false;
                                tj3Var.m22139q(false);
                            } else {
                                tj3Var.m22111b0(-898883243);
                                tj3Var.m22139q(false);
                            }
                            tj3Var.m22139q(z);
                        }
                        tj3Var.m22139q(z);
                    }
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                    return xfaVar;
                }
                b16 b16Var = b16.f7762a;
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                vi3 vi3Var3 = C0352b.f4305h;
                oha.m18000f(tj3Var2, vi3Var3);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.challenges_leaderboard), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71403g, tj3Var2, 1572864, 0, 131006);
                tj3 tj3Var3 = tj3Var2;
                e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var3.m22128k(ge9.f40637a)).f38952a, true, new C3487q7(nj0.f52793L, 3)), nj0.f52817l, tj3Var3, 0);
                int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m2 = tj3Var3.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e2);
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var3);
                oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                if (fr0Var.f39514l == LeaderboardMetric.Country) {
                    tj3Var3.m22111b0(801627569);
                    e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
                    List list = fr0Var.f39512j;
                    ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Pair) it.next()).f47624b);
                    }
                    String str = fr0Var.f39513k;
                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var) | tj3Var3.m22124i(fr0Var);
                    Object objM22097O3 = tj3Var3.m22097O();
                    if (zM22120g3) {
                        p84Var = p84Var2;
                    } else {
                        p84Var = p84Var2;
                        if (objM22097O3 == p84Var) {
                        }
                        q5d.m19674h(e16VarM4430w, arrayList, str, (vi3) objM22097O3, tj3Var3, 6);
                        tj3Var3 = tj3Var3;
                        tj3Var3.m22139q(false);
                    }
                    final int i4 = 1;
                    objM22097O3 = new vi3() { // from class: gq0
                        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 java.lang.Object, still in use, count: 2, list:
                              (r2v11 java.lang.Object) from 0x0030: PHI (r2 I:??) = (r2v8 java.lang.Object), (r2v11 java.lang.Object) binds: [B:10:0x002f, B:23:0x0030] A[DONT_GENERATE, DONT_INLINE]
                              (r2v11 java.lang.Object) from 0x0024: CHECK_CAST (kotlin.Pair) (r2v11 java.lang.Object)
                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                            */
                        @Override // p000.vi3
                        public final java.lang.Object invoke(java.lang.Object r6) {
                            /*
                                r5 = this;
                                int r0 = r3
                                xfa r1 = p000.xfa.f68157a
                                fr0 r2 = r2
                                vi3 r5 = r1
                                switch(r0) {
                                    case 0: goto L50;
                                    default: goto Lb;
                                }
                            Lb:
                                java.lang.String r6 = (java.lang.String) r6
                                r6.getClass()
                                java.util.List r0 = r2.f39512j
                                java.lang.Iterable r0 = (java.lang.Iterable) r0
                                java.util.Iterator r0 = r0.iterator()
                            L18:
                                boolean r2 = r0.hasNext()
                                r3 = 0
                                if (r2 == 0) goto L2f
                                java.lang.Object r2 = r0.next()
                                r4 = r2
                                kotlin.Pair r4 = (kotlin.Pair) r4
                                java.lang.Object r4 = r4.f47624b
                                boolean r4 = p000.fa4.m11650l(r4, r6)
                                if (r4 == 0) goto L18
                                goto L30
                            L2f:
                                r2 = r3
                            L30:
                                kotlin.Pair r2 = (kotlin.Pair) r2
                                if (r2 == 0) goto L43
                                java.lang.Object r6 = r2.f47623a
                                java.lang.String r6 = (java.lang.String) r6
                                if (r6 == 0) goto L43
                                java.util.Locale r0 = java.util.Locale.ROOT
                                java.lang.String r3 = r6.toLowerCase(r0)
                                r3.getClass()
                            L43:
                                if (r3 != 0) goto L47
                                java.lang.String r3 = ""
                            L47:
                                lq0 r6 = new lq0
                                r6.<init>(r3)
                                r5.invoke(r6)
                                return r1
                            L50:
                                java.lang.Integer r6 = (java.lang.Integer) r6
                                int r6 = r6.intValue()
                                dr0 r0 = new dr0
                                ls0 r2 = r2.f39505c
                                ks0 r2 = (p000.ks0) r2
                                java.util.List r2 = r2.f48374a
                                java.lang.Object r2 = p000.u91.m22589G0(r2)
                                jr0 r2 = (p000.jr0) r2
                                java.lang.String r2 = r2.f46029i
                                r0.<init>(r6, r2)
                                r5.invoke(r0)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p000.gq0.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    tj3Var3.m22131l0(objM22097O3);
                    q5d.m19674h(e16VarM4430w, arrayList, str, (vi3) objM22097O3, tj3Var3, 6);
                    tj3Var3 = tj3Var3;
                    tj3Var3.m22139q(false);
                } else {
                    p84Var = p84Var2;
                    tj3Var3.m22111b0(802305074);
                    tj3Var3.m22139q(false);
                }
                e16 e16VarM4430w2 = c99.m4430w(b16Var, null, 3);
                tj3Var3.m22111b0(-805396176);
                List<LeaderboardMetric> sorts = ChallengeType.BookChallenge.getSorts();
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(sorts, 10));
                Iterator<T> it2 = sorts.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(vz1.m23620a0(tj3Var3, ((LeaderboardMetric) it2.next()).getValue()));
                }
                tj3Var3.m22139q(false);
                String strM23620a0 = vz1.m23620a0(tj3Var3, fr0Var.f39514l.getValue());
                boolean zM22124i = tj3Var3.m22124i(context) | tj3Var3.m22120g(vi3Var);
                Object objM22097O4 = tj3Var3.m22097O();
                if (zM22124i || objM22097O4 == p84Var) {
                    objM22097O4 = new hq0(context, vi3Var);
                    tj3Var3.m22131l0(objM22097O4);
                }
                tj3 tj3Var4 = tj3Var3;
                q5d.m19674h(e16VarM4430w2, arrayList2, strM23620a0, (vi3) objM22097O4, tj3Var4, 6);
                tj3Var4.m22139q(true);
                tj3Var4.m22139q(true);
                return xfaVar;
        }
    }

    public /* synthetic */ cq0(fr0 fr0Var, Context context, vi3 vi3Var) {
        this.f34368b = fr0Var;
        this.f34370d = context;
        this.f34369c = vi3Var;
    }
}
