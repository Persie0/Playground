package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0357g;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p4d {
    /* JADX INFO: renamed from: a */
    public static final void m18885a(final LessonWord lessonWord, final zi3 zi3Var, ye1 ye1Var, int i) {
        int i2;
        lessonWord.getClass();
        zi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1684778817);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(lessonWord) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(zi3Var) ? 32 : 16;
        }
        final int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            gc0 gc0Var = nj0.f52812g;
            b16 b16Var = b16.f7762a;
            e16 e16VarM4430w = c99.m4430w(b16Var, gc0Var, 2);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            int i4 = i2 & 112;
            boolean zM22124i = (i4 == 32) | tj3Var.m22124i(lessonWord);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new ui3() { // from class: qi9
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i5 = i3;
                        xfa xfaVar = xfa.f68157a;
                        LessonWord lessonWord2 = lessonWord;
                        zi3 zi3Var2 = zi3Var;
                        switch (i5) {
                            case 0:
                                zi3Var2.invoke(lessonWord2.f19314a, WordStatus.Ignored.getValue());
                                break;
                            default:
                                zi3Var2.invoke(lessonWord2.f19314a, WordStatus.Known.getValue());
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            omd.m18141c((ui3) objM22097O, c99.m4430w(b16Var, null, 3), false, null, null, gpc.f41168a, tj3Var, 1572912, 60);
            pb1.m19037g(1.0f, 54, 0, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55816A, tj3Var, c99.m4426s(c99.m4414g(b16Var, 24.0f), 1.0f));
            tj3Var = tj3Var;
            boolean zM22124i2 = tj3Var.m22124i(lessonWord) | (i4 == 32);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                final int i5 = 1;
                objM22097O2 = new ui3() { // from class: qi9
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i6 = i5;
                        xfa xfaVar = xfa.f68157a;
                        LessonWord lessonWord2 = lessonWord;
                        zi3 zi3Var2 = zi3Var;
                        switch (i6) {
                            case 0:
                                zi3Var2.invoke(lessonWord2.f19314a, WordStatus.Ignored.getValue());
                                break;
                            default:
                                zi3Var2.invoke(lessonWord2.f19314a, WordStatus.Known.getValue());
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O2);
            }
            omd.m18141c((ui3) objM22097O2, c99.m4430w(b16Var, null, 3), false, null, null, gpc.f41169b, tj3Var, 1572912, 60);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(lessonWord, i, 28, zi3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[PHI: r0
      0x00a5: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00a3, B:57:0x00a8, B:60:0x00ac, B:63:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public static final Object m18886b(C0302d c0302d, int i, vi3 vi3Var) {
        int i2;
        int i3;
        Object objInvoke;
        d16 d16VarM21992f;
        ot4 ot4VarM1372d1;
        k40 k40Var;
        if (!c0302d.f34837a.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var = c0302d.f34837a.f34841e;
        C0357g c0357gM21979L = te1.m21979L(c0302d);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objInvoke = null;
            if (c0357gM21979L == null) {
                d16VarM21992f = null;
                break;
            }
            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 1024) != 0) {
                while (d16Var != null) {
                    if ((d16Var.f34839c & 1024) != 0) {
                        d16VarM21992f = d16Var;
                        x66 x66Var = null;
                        while (d16VarM21992f != null) {
                            if (d16VarM21992f instanceof C0302d) {
                                break loop0;
                            }
                            if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                int i4 = 0;
                                for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                    if ((d16Var2.f34839c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            d16VarM21992f = d16Var2;
                                        } else {
                                            if (x66Var == null) {
                                                x66Var = new x66(new d16[16]);
                                            }
                                            if (d16VarM21992f != null) {
                                                x66Var.m24305c(d16VarM21992f);
                                                d16VarM21992f = null;
                                            }
                                            x66Var.m24305c(d16Var2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            d16VarM21992f = te1.m21992f(x66Var);
                        }
                    }
                    d16Var = d16Var.f34841e;
                }
            }
            c0357gM21979L = c0357gM21979L.m1610w();
            d16Var = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
        }
        C0302d c0302d2 = (C0302d) d16VarM21992f;
        if ((c0302d2 == null || !fa4.m11650l(c0302d2.m1372d1(), c0302d.m1372d1())) && (ot4VarM1372d1 = c0302d.m1372d1()) != null) {
            int i5 = 5;
            if (i == 5) {
                i3 = i5;
            } else {
                i5 = 6;
                if (i == 6) {
                    i3 = i5;
                } else {
                    i5 = 3;
                    if (i == 3) {
                        i3 = i5;
                    } else {
                        i5 = 4;
                        if (i == 4) {
                            i3 = i5;
                        } else if (i == 1) {
                            i3 = 2;
                        } else if (i != 2) {
                            C3386nv.m17633t("Unsupported direction for beyond bounds layout");
                        }
                    }
                }
            }
            if (ot4VarM1372d1.f54962J.mo11505a() <= 0 || !ot4VarM1372d1.f54962J.mo11508d() || !ot4VarM1372d1.f34836I) {
                return vi3Var.invoke(ot4.f54961N);
            }
            boolean zM18477a1 = ot4VarM1372d1.m18477a1(i3);
            pt4 pt4Var = ot4VarM1372d1.f54962J;
            int iMo11506b = zM18477a1 ? pt4Var.mo11506b() : pt4Var.mo11509e();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ii0 ii0Var = ot4VarM1372d1.f54963K;
            ii0Var.getClass();
            jt4 jt4Var = new jt4(iMo11506b, iMo11506b);
            ii0Var.f44131a.m24305c(jt4Var);
            ref$ObjectRef.f47718a = jt4Var;
            int iMo11507c = ot4VarM1372d1.f54962J.mo11507c() * 2;
            int iMo11505a = ot4VarM1372d1.f54962J.mo11505a();
            if (iMo11507c > iMo11505a) {
                iMo11507c = iMo11505a;
            }
            while (objInvoke == null && ot4VarM1372d1.m18476Z0((jt4) ref$ObjectRef.f47718a, i3) && i2 < iMo11507c) {
                jt4 jt4Var2 = (jt4) ref$ObjectRef.f47718a;
                int i6 = jt4Var2.f46127a;
                int i7 = jt4Var2.f46128b;
                if (ot4VarM1372d1.m18477a1(i3)) {
                    i7++;
                } else {
                    i6--;
                }
                ii0 ii0Var2 = ot4VarM1372d1.f54963K;
                ii0Var2.getClass();
                jt4 jt4Var3 = new jt4(i6, i7);
                ii0Var2.f44131a.m24305c(jt4Var3);
                ot4VarM1372d1.f54963K.f44131a.m24313k((jt4) ref$ObjectRef.f47718a);
                ref$ObjectRef.f47718a = jt4Var3;
                i2++;
                te1.m21979L(ot4VarM1372d1).m1598l();
                objInvoke = vi3Var.invoke(new nt4(ot4VarM1372d1, ref$ObjectRef, i3));
            }
            ot4VarM1372d1.f54963K.f44131a.m24313k((jt4) ref$ObjectRef.f47718a);
            te1.m21979L(ot4VarM1372d1).m1598l();
            return objInvoke;
        }
        return null;
    }
}
