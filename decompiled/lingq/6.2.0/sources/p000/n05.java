package p000;

import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.LessonSentenceEntity;
import com.lingq.core.database.entity.TranslationSentenceEntity;
import com.lingq.core.domain.model.lesson.LessonMetadata;
import com.lingq.core.domain.model.lesson.LessonPromotedCourse;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.core.domain.model.lesson.LessonSentencesTranslation;
import com.lingq.core.domain.model.lesson.LessonSimplifiedOf;
import com.lingq.core.domain.model.lesson.LessonUserCompleted;
import com.lingq.core.domain.model.lesson.LessonUserLiked;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n05 extends r46 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ q05 f52119A;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f52120z;

    public /* synthetic */ n05(q05 q05Var, int i) {
        this.f52120z = i;
        this.f52119A = q05Var;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo17164l(ik8 ik8Var, Object obj) {
        int i = this.f52120z;
        q05 q05Var = this.f52119A;
        switch (i) {
            case 0:
                TranslationSentenceEntity translationSentenceEntity = (TranslationSentenceEntity) obj;
                qn3 qn3Var = q05Var.f57073M;
                ik8Var.getClass();
                translationSentenceEntity.getClass();
                ik8Var.mo2878j(1, translationSentenceEntity.m7816d());
                ik8Var.mo2878j(2, translationSentenceEntity.m7817e());
                Double dM7814b = translationSentenceEntity.m7814b();
                if (dM7814b == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2877g(3, dM7814b.doubleValue());
                }
                Double dM7815c = translationSentenceEntity.m7815c();
                if (dM7815c == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2877g(4, dM7815c.doubleValue());
                }
                ik8Var.mo2874C(5, translationSentenceEntity.m7819g());
                ik8Var.mo2874C(6, qn3Var.m20068W(translationSentenceEntity.m7820h()));
                ik8Var.mo2874C(7, qn3Var.m20048A(translationSentenceEntity.m7818f()));
                break;
            case 1:
                LessonSentenceEntity lessonSentenceEntity = (LessonSentenceEntity) obj;
                ik8Var.getClass();
                lessonSentenceEntity.getClass();
                ik8Var.mo2878j(1, lessonSentenceEntity.m7739c());
                qn3 qn3Var2 = q05Var.f57073M;
                ik8Var.mo2874C(2, qn3Var2.m20066U(lessonSentenceEntity.m7745i()));
                String strM7743g = lessonSentenceEntity.m7743g();
                if (strM7743g == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, strM7743g);
                }
                String strM7740d = lessonSentenceEntity.m7740d();
                if (strM7740d == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM7740d);
                }
                ik8Var.mo2878j(5, lessonSentenceEntity.m7738b());
                List listM7744h = lessonSentenceEntity.m7744h();
                String strM20072p = listM7744h != null ? qn3Var2.m20072p(listM7744h) : null;
                if (strM20072p == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM20072p);
                }
                ik8Var.mo2878j(7, lessonSentenceEntity.m7742f() ? 1L : 0L);
                String strM7746j = lessonSentenceEntity.m7746j();
                if (strM7746j == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM7746j);
                }
                String strM7741e = lessonSentenceEntity.m7741e();
                if (strM7741e != null) {
                    ik8Var.mo2874C(9, strM7741e);
                } else {
                    ik8Var.mo2880m(9);
                }
                break;
            default:
                LessonEntity lessonEntity = (LessonEntity) obj;
                ik8Var.getClass();
                lessonEntity.getClass();
                ik8Var.mo2878j(1, lessonEntity.m7711r());
                ik8Var.mo2874C(2, lessonEntity.m7718u0());
                String strM7722w0 = lessonEntity.m7722w0();
                if (strM7722w0 == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, strM7722w0);
                }
                ik8Var.mo2878j(4, lessonEntity.m7667P());
                String strM7710q0 = lessonEntity.m7710q0();
                if (strM7710q0 == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM7710q0);
                }
                String strM7699l = lessonEntity.m7699l();
                if (strM7699l == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM7699l);
                }
                String strM7680b0 = lessonEntity.m7680b0();
                if (strM7680b0 == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM7680b0);
                }
                String strM7713s = lessonEntity.m7713s();
                if (strM7713s == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM7713s);
                }
                String strM7685e = lessonEntity.m7685e();
                if (strM7685e == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2874C(9, strM7685e);
                }
                ik8Var.mo2878j(10, lessonEntity.m7703n());
                String strM7706o0 = lessonEntity.m7706o0();
                if (strM7706o0 == null) {
                    ik8Var.mo2880m(11);
                } else {
                    ik8Var.mo2874C(11, strM7706o0);
                }
                String strM7694i0 = lessonEntity.m7694i0();
                if (strM7694i0 == null) {
                    ik8Var.mo2880m(12);
                } else {
                    ik8Var.mo2874C(12, strM7694i0);
                }
                String strM7665N = lessonEntity.m7665N();
                if (strM7665N == null) {
                    ik8Var.mo2880m(13);
                } else {
                    ik8Var.mo2874C(13, strM7665N);
                }
                ik8Var.mo2878j(14, lessonEntity.m7728z0());
                ik8Var.mo2878j(15, lessonEntity.m7720v0());
                ik8Var.mo2878j(16, lessonEntity.m7684d0());
                ik8Var.mo2877g(17, lessonEntity.m7727z());
                ik8Var.mo2877g(18, lessonEntity.m7683d());
                ik8Var.mo2878j(19, lessonEntity.m7695j());
                String strM7697k = lessonEntity.m7697k();
                if (strM7697k == null) {
                    ik8Var.mo2880m(20);
                } else {
                    ik8Var.mo2874C(20, strM7697k);
                }
                qn3 qn3Var3 = q05Var.f57073M;
                ik8Var.mo2874C(21, qn3Var3.m20078x(lessonEntity.m7716t0()));
                ik8Var.mo2874C(22, qn3Var3.m20078x(lessonEntity.m7679b()));
                String strM7693i = lessonEntity.m7693i();
                if (strM7693i == null) {
                    ik8Var.mo2880m(23);
                } else {
                    ik8Var.mo2874C(23, strM7693i);
                }
                String strM7702m0 = lessonEntity.m7702m0();
                if (strM7702m0 == null) {
                    ik8Var.mo2880m(24);
                } else {
                    ik8Var.mo2874C(24, strM7702m0);
                }
                String strM7700l0 = lessonEntity.m7700l0();
                if (strM7700l0 == null) {
                    ik8Var.mo2880m(25);
                } else {
                    ik8Var.mo2874C(25, strM7700l0);
                }
                String strM7704n0 = lessonEntity.m7704n0();
                if (strM7704n0 == null) {
                    ik8Var.mo2880m(26);
                } else {
                    ik8Var.mo2874C(26, strM7704n0);
                }
                Integer numM7669R = lessonEntity.m7669R();
                if (numM7669R == null) {
                    ik8Var.mo2880m(27);
                } else {
                    ik8Var.mo2878j(27, numM7669R.intValue());
                }
                Integer numM7661J = lessonEntity.m7661J();
                if (numM7661J == null) {
                    ik8Var.mo2880m(28);
                } else {
                    ik8Var.mo2878j(28, numM7661J.intValue());
                }
                ik8Var.mo2877g(29, lessonEntity.m7682c0());
                ik8Var.mo2877g(30, lessonEntity.m7647C());
                ik8Var.mo2878j(31, lessonEntity.m7646B0() ? 1L : 0L);
                ik8Var.mo2878j(32, lessonEntity.m7657H());
                ik8Var.mo2878j(33, lessonEntity.m7691h());
                ik8Var.mo2878j(34, lessonEntity.m7656G0() ? 1L : 0L);
                String strM7709q = lessonEntity.m7709q();
                if (strM7709q == null) {
                    ik8Var.mo2880m(35);
                } else {
                    ik8Var.mo2874C(35, strM7709q);
                }
                ik8Var.mo2878j(36, lessonEntity.m7670S());
                ik8Var.mo2878j(37, lessonEntity.m7663L() ? 1L : 0L);
                ik8Var.mo2877g(38, lessonEntity.m7666O());
                String strM7717u = lessonEntity.m7717u();
                if (strM7717u == null) {
                    ik8Var.mo2880m(39);
                } else {
                    ik8Var.mo2874C(39, strM7717u);
                }
                ik8Var.mo2878j(40, lessonEntity.m7648C0() ? 1L : 0L);
                String strM7671T = lessonEntity.m7671T();
                if (strM7671T == null) {
                    ik8Var.mo2880m(41);
                } else {
                    ik8Var.mo2874C(41, strM7671T);
                }
                String strM7724x0 = lessonEntity.m7724x0();
                if (strM7724x0 == null) {
                    ik8Var.mo2880m(42);
                } else {
                    ik8Var.mo2874C(42, strM7724x0);
                }
                String strM7705o = lessonEntity.m7705o();
                if (strM7705o == null) {
                    ik8Var.mo2880m(43);
                } else {
                    ik8Var.mo2874C(43, strM7705o);
                }
                String strM7662K = lessonEntity.m7662K();
                if (strM7662K == null) {
                    ik8Var.mo2880m(44);
                } else {
                    ik8Var.mo2874C(44, strM7662K);
                }
                ik8Var.mo2878j(45, lessonEntity.m7726y0());
                Integer numM7675X = lessonEntity.m7675X();
                if (numM7675X == null) {
                    ik8Var.mo2880m(46);
                } else {
                    ik8Var.mo2878j(46, numM7675X.intValue());
                }
                String strM7677Z = lessonEntity.m7677Z();
                if (strM7677Z == null) {
                    ik8Var.mo2880m(47);
                } else {
                    ik8Var.mo2874C(47, strM7677Z);
                }
                String strM7674W = lessonEntity.m7674W();
                if (strM7674W == null) {
                    ik8Var.mo2880m(48);
                } else {
                    ik8Var.mo2874C(48, strM7674W);
                }
                String strM7664M = lessonEntity.m7664M();
                if (strM7664M == null) {
                    ik8Var.mo2880m(49);
                } else {
                    ik8Var.mo2874C(49, strM7664M);
                }
                String strM7676Y = lessonEntity.m7676Y();
                if (strM7676Y == null) {
                    ik8Var.mo2880m(50);
                } else {
                    ik8Var.mo2874C(50, strM7676Y);
                }
                String strM7686e0 = lessonEntity.m7686e0();
                if (strM7686e0 == null) {
                    ik8Var.mo2880m(51);
                } else {
                    ik8Var.mo2874C(51, strM7686e0);
                }
                String strM7690g0 = lessonEntity.m7690g0();
                if (strM7690g0 == null) {
                    ik8Var.mo2880m(52);
                } else {
                    ik8Var.mo2874C(52, strM7690g0);
                }
                String strM7688f0 = lessonEntity.m7688f0();
                if (strM7688f0 == null) {
                    ik8Var.mo2880m(53);
                } else {
                    ik8Var.mo2874C(53, strM7688f0);
                }
                String strM7692h0 = lessonEntity.m7692h0();
                if (strM7692h0 == null) {
                    ik8Var.mo2880m(54);
                } else {
                    ik8Var.mo2874C(54, strM7692h0);
                }
                ik8Var.mo2878j(55, lessonEntity.m7658H0() ? 1L : 0L);
                ik8Var.mo2878j(56, lessonEntity.m7644A0() ? 1L : 0L);
                ik8Var.mo2878j(57, lessonEntity.m7689g() ? 1L : 0L);
                ik8Var.mo2878j(58, lessonEntity.m7654F0() ? 1L : 0L);
                ik8Var.mo2878j(59, lessonEntity.m7643A());
                ik8Var.mo2878j(60, lessonEntity.m7687f());
                String strM7645B = lessonEntity.m7645B();
                if (strM7645B == null) {
                    ik8Var.mo2880m(61);
                } else {
                    ik8Var.mo2874C(61, strM7645B);
                }
                String strM20079y = qn3Var3.m20079y(lessonEntity.m7708p0());
                if (strM20079y == null) {
                    ik8Var.mo2880m(62);
                } else {
                    ik8Var.mo2874C(62, strM20079y);
                }
                ik8Var.mo2878j(63, lessonEntity.m7673V());
                Float fM7672U = lessonEntity.m7672U();
                if (fM7672U == null) {
                    ik8Var.mo2880m(64);
                } else {
                    ik8Var.mo2877g(64, fM7672U.floatValue());
                }
                List listM7714s0 = lessonEntity.m7714s0();
                listM7714s0.getClass();
                yf4 yf4Var = (yf4) qn3Var3.f57974a;
                yf4Var.getClass();
                ik8Var.mo2874C(65, yf4Var.m10322b(new C2978ev(thb.m22059r(TranslationSentenceEntity.Companion.serializer())), listM7714s0));
                String strM7649D = lessonEntity.m7649D();
                if (strM7649D == null) {
                    ik8Var.mo2880m(66);
                } else {
                    ik8Var.mo2874C(66, strM7649D);
                }
                String strM7651E = lessonEntity.m7651E();
                if (strM7651E == null) {
                    ik8Var.mo2880m(67);
                } else {
                    ik8Var.mo2874C(67, strM7651E);
                }
                String strM7678a0 = lessonEntity.m7678a0();
                if (strM7678a0 == null) {
                    ik8Var.mo2880m(68);
                } else {
                    ik8Var.mo2874C(68, strM7678a0);
                }
                Boolean boolM7652E0 = lessonEntity.m7652E0();
                Integer numValueOf = boolM7652E0 != null ? Integer.valueOf(boolM7652E0.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ik8Var.mo2880m(69);
                } else {
                    ik8Var.mo2878j(69, numValueOf.intValue());
                }
                ik8Var.mo2877g(70, lessonEntity.m7701m());
                ik8Var.mo2878j(71, lessonEntity.m7655G());
                ik8Var.mo2874C(72, lessonEntity.m7723x());
                Boolean boolM7660I0 = lessonEntity.m7660I0();
                Integer numValueOf2 = boolM7660I0 != null ? Integer.valueOf(boolM7660I0.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    ik8Var.mo2880m(73);
                } else {
                    ik8Var.mo2878j(73, numValueOf2.intValue());
                }
                String strM20079y2 = qn3Var3.m20079y(lessonEntity.m7707p());
                if (strM20079y2 == null) {
                    ik8Var.mo2880m(74);
                } else {
                    ik8Var.mo2874C(74, strM20079y2);
                }
                Boolean boolM7681c = lessonEntity.m7681c();
                Integer numValueOf3 = boolM7681c != null ? Integer.valueOf(boolM7681c.booleanValue() ? 1 : 0) : null;
                if (numValueOf3 == null) {
                    ik8Var.mo2880m(75);
                } else {
                    ik8Var.mo2878j(75, numValueOf3.intValue());
                }
                String strM7650D0 = lessonEntity.m7650D0();
                if (strM7650D0 == null) {
                    ik8Var.mo2880m(76);
                } else {
                    ik8Var.mo2874C(76, strM7650D0);
                }
                String strM7715t = lessonEntity.m7715t();
                if (strM7715t == null) {
                    ik8Var.mo2880m(77);
                } else {
                    ik8Var.mo2874C(77, strM7715t);
                }
                LessonUserLiked lessonUserLikedM7721w = lessonEntity.m7721w();
                if (lessonUserLikedM7721w != null) {
                    String strM8072b = lessonUserLikedM7721w.m8072b();
                    if (strM8072b == null) {
                        ik8Var.mo2880m(78);
                    } else {
                        ik8Var.mo2874C(78, strM8072b);
                    }
                    Long lM20046n = qn3.m20046n(lessonUserLikedM7721w.m8071a());
                    if (lM20046n == null) {
                        ik8Var.mo2880m(79);
                    } else {
                        ik8Var.mo2878j(79, lM20046n.longValue());
                    }
                } else {
                    ik8Var.mo2880m(78);
                    ik8Var.mo2880m(79);
                }
                LessonUserCompleted lessonUserCompletedM7719v = lessonEntity.m7719v();
                if (lessonUserCompletedM7719v != null) {
                    String strM8070b = lessonUserCompletedM7719v.m8070b();
                    if (strM8070b == null) {
                        ik8Var.mo2880m(80);
                    } else {
                        ik8Var.mo2874C(80, strM8070b);
                    }
                    Long lM20046n2 = qn3.m20046n(lessonUserCompletedM7719v.m8069a());
                    if (lM20046n2 == null) {
                        ik8Var.mo2880m(81);
                    } else {
                        ik8Var.mo2878j(81, lM20046n2.longValue());
                    }
                } else {
                    ik8Var.mo2880m(80);
                    ik8Var.mo2880m(81);
                }
                LessonSentencesTranslation lessonSentencesTranslationM7712r0 = lessonEntity.m7712r0();
                if (lessonSentencesTranslationM7712r0 != null) {
                    String strM8060a = lessonSentencesTranslationM7712r0.m8060a();
                    if (strM8060a == null) {
                        ik8Var.mo2880m(82);
                    } else {
                        ik8Var.mo2874C(82, strM8060a);
                    }
                    String strM20049B = qn3Var3.m20049B(lessonSentencesTranslationM7712r0.m8061b());
                    if (strM20049B == null) {
                        ik8Var.mo2880m(83);
                    } else {
                        ik8Var.mo2874C(83, strM20049B);
                    }
                } else {
                    ik8Var.mo2880m(82);
                    ik8Var.mo2880m(83);
                }
                LessonReference lessonReferenceM7659I = lessonEntity.m7659I();
                if (lessonReferenceM7659I != null) {
                    ik8Var.mo2878j(84, lessonReferenceM7659I.m8051c());
                    ik8Var.mo2878j(85, lessonReferenceM7659I.m8053e());
                    String strM8049a = lessonReferenceM7659I.m8049a();
                    if (strM8049a == null) {
                        ik8Var.mo2880m(86);
                    } else {
                        ik8Var.mo2874C(86, strM8049a);
                    }
                    ik8Var.mo2878j(87, lessonReferenceM7659I.m8059k() ? 1L : 0L);
                    Integer numM8054f = lessonReferenceM7659I.m8054f();
                    if (numM8054f == null) {
                        ik8Var.mo2880m(88);
                    } else {
                        ik8Var.mo2878j(88, numM8054f.intValue());
                    }
                    String strM8056h = lessonReferenceM7659I.m8056h();
                    if (strM8056h == null) {
                        ik8Var.mo2880m(89);
                    } else {
                        ik8Var.mo2874C(89, strM8056h);
                    }
                    String strM8057i = lessonReferenceM7659I.m8057i();
                    if (strM8057i == null) {
                        ik8Var.mo2880m(90);
                    } else {
                        ik8Var.mo2874C(90, strM8057i);
                    }
                    String strM8052d = lessonReferenceM7659I.m8052d();
                    if (strM8052d == null) {
                        ik8Var.mo2880m(91);
                    } else {
                        ik8Var.mo2874C(91, strM8052d);
                    }
                    Integer numM8050b = lessonReferenceM7659I.m8050b();
                    if (numM8050b == null) {
                        ik8Var.mo2880m(92);
                    } else {
                        ik8Var.mo2878j(92, numM8050b.intValue());
                    }
                    String strM8055g = lessonReferenceM7659I.m8055g();
                    if (strM8055g == null) {
                        ik8Var.mo2880m(93);
                    } else {
                        ik8Var.mo2874C(93, strM8055g);
                    }
                    String strM8058j = lessonReferenceM7659I.m8058j();
                    if (strM8058j == null) {
                        ik8Var.mo2880m(94);
                    } else {
                        ik8Var.mo2874C(94, strM8058j);
                    }
                } else {
                    ik8Var.mo2880m(84);
                    ik8Var.mo2880m(85);
                    ik8Var.mo2880m(86);
                    ik8Var.mo2880m(87);
                    ik8Var.mo2880m(88);
                    ik8Var.mo2880m(89);
                    ik8Var.mo2880m(90);
                    ik8Var.mo2880m(91);
                    hn1.m13362l(ik8Var, 92, 93, 94);
                }
                LessonReference lessonReferenceM7668Q = lessonEntity.m7668Q();
                if (lessonReferenceM7668Q != null) {
                    ik8Var.mo2878j(95, lessonReferenceM7668Q.m8051c());
                    ik8Var.mo2878j(96, lessonReferenceM7668Q.m8053e());
                    String strM8049a2 = lessonReferenceM7668Q.m8049a();
                    if (strM8049a2 == null) {
                        ik8Var.mo2880m(97);
                    } else {
                        ik8Var.mo2874C(97, strM8049a2);
                    }
                    ik8Var.mo2878j(98, lessonReferenceM7668Q.m8059k() ? 1L : 0L);
                    Integer numM8054f2 = lessonReferenceM7668Q.m8054f();
                    if (numM8054f2 == null) {
                        ik8Var.mo2880m(99);
                    } else {
                        ik8Var.mo2878j(99, numM8054f2.intValue());
                    }
                    String strM8056h2 = lessonReferenceM7668Q.m8056h();
                    if (strM8056h2 == null) {
                        ik8Var.mo2880m(100);
                    } else {
                        ik8Var.mo2874C(100, strM8056h2);
                    }
                    String strM8057i2 = lessonReferenceM7668Q.m8057i();
                    if (strM8057i2 == null) {
                        ik8Var.mo2880m(101);
                    } else {
                        ik8Var.mo2874C(101, strM8057i2);
                    }
                    String strM8052d2 = lessonReferenceM7668Q.m8052d();
                    if (strM8052d2 == null) {
                        ik8Var.mo2880m(102);
                    } else {
                        ik8Var.mo2874C(102, strM8052d2);
                    }
                    Integer numM8050b2 = lessonReferenceM7668Q.m8050b();
                    if (numM8050b2 == null) {
                        ik8Var.mo2880m(103);
                    } else {
                        ik8Var.mo2878j(103, numM8050b2.intValue());
                    }
                    String strM8055g2 = lessonReferenceM7668Q.m8055g();
                    if (strM8055g2 == null) {
                        ik8Var.mo2880m(104);
                    } else {
                        ik8Var.mo2874C(104, strM8055g2);
                    }
                    String strM8058j2 = lessonReferenceM7668Q.m8058j();
                    if (strM8058j2 == null) {
                        ik8Var.mo2880m(105);
                    } else {
                        ik8Var.mo2874C(105, strM8058j2);
                    }
                } else {
                    ik8Var.mo2880m(95);
                    ik8Var.mo2880m(96);
                    ik8Var.mo2880m(97);
                    ik8Var.mo2880m(98);
                    ik8Var.mo2880m(99);
                    ik8Var.mo2880m(100);
                    ik8Var.mo2880m(101);
                    ik8Var.mo2880m(102);
                    hn1.m13362l(ik8Var, 103, 104, 105);
                }
                LessonPromotedCourse lessonPromotedCourseM7725y = lessonEntity.m7725y();
                if (lessonPromotedCourseM7725y != null) {
                    String strM8046a = lessonPromotedCourseM7725y.m8046a();
                    if (strM8046a == null) {
                        ik8Var.mo2880m(106);
                    } else {
                        ik8Var.mo2874C(106, strM8046a);
                    }
                    String strM8048c = lessonPromotedCourseM7725y.m8048c();
                    if (strM8048c == null) {
                        ik8Var.mo2880m(107);
                    } else {
                        ik8Var.mo2874C(107, strM8048c);
                    }
                    String strM8047b = lessonPromotedCourseM7725y.m8047b();
                    if (strM8047b == null) {
                        ik8Var.mo2880m(108);
                    } else {
                        ik8Var.mo2874C(108, strM8047b);
                    }
                } else {
                    hn1.m13362l(ik8Var, 106, 107, 108);
                }
                LessonSimplifiedOf lessonSimplifiedOfM7698k0 = lessonEntity.m7698k0();
                if (lessonSimplifiedOfM7698k0 != null) {
                    String strM8063b = lessonSimplifiedOfM7698k0.m8063b();
                    if (strM8063b == null) {
                        ik8Var.mo2880m(109);
                    } else {
                        ik8Var.mo2874C(109, strM8063b);
                    }
                    String strM8064c = lessonSimplifiedOfM7698k0.m8064c();
                    if (strM8064c == null) {
                        ik8Var.mo2880m(110);
                    } else {
                        ik8Var.mo2874C(110, strM8064c);
                    }
                    ik8Var.mo2878j(111, lessonSimplifiedOfM7698k0.m8062a());
                } else {
                    hn1.m13362l(ik8Var, 109, 110, 111);
                }
                LessonSimplifiedOf lessonSimplifiedOfM7696j0 = lessonEntity.m7696j0();
                if (lessonSimplifiedOfM7696j0 != null) {
                    String strM8063b2 = lessonSimplifiedOfM7696j0.m8063b();
                    if (strM8063b2 == null) {
                        ik8Var.mo2880m(112);
                    } else {
                        ik8Var.mo2874C(112, strM8063b2);
                    }
                    String strM8064c2 = lessonSimplifiedOfM7696j0.m8064c();
                    if (strM8064c2 == null) {
                        ik8Var.mo2880m(113);
                    } else {
                        ik8Var.mo2874C(113, strM8064c2);
                    }
                    ik8Var.mo2878j(114, lessonSimplifiedOfM7696j0.m8062a());
                } else {
                    hn1.m13362l(ik8Var, 112, 113, 114);
                }
                LessonMetadata lessonMetadataM7653F = lessonEntity.m7653F();
                if (lessonMetadataM7653F == null) {
                    hn1.m13362l(ik8Var, 115, 116, 117);
                } else {
                    String strM8043a = lessonMetadataM7653F.m8043a();
                    if (strM8043a == null) {
                        ik8Var.mo2880m(115);
                    } else {
                        ik8Var.mo2874C(115, strM8043a);
                    }
                    String strM8044b = lessonMetadataM7653F.m8044b();
                    if (strM8044b == null) {
                        ik8Var.mo2880m(116);
                    } else {
                        ik8Var.mo2874C(116, strM8044b);
                    }
                    String strM8045c = lessonMetadataM7653F.m8045c();
                    if (strM8045c != null) {
                        ik8Var.mo2874C(117, strM8045c);
                    } else {
                        ik8Var.mo2880m(117);
                    }
                }
                break;
        }
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: s */
    public final String mo17165s() {
        switch (this.f52120z) {
            case 0:
                return "INSERT INTO `TranslationSentenceEntity` (`index`,`lessonId`,`audio`,`audioEnd`,`text`,`translations`,`notes`) VALUES (?,?,?,?,?,?,?)";
            case 1:
                return "INSERT INTO `LessonSentenceEntity` (`lessonId`,`tokens`,`text`,`normalizedText`,`index`,`timestamp`,`startParagraph`,`url`,`opentag`) VALUES (?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT INTO `LessonEntity` (`id`,`type`,`url`,`pos`,`title`,`description`,`pubDate`,`imageUrl`,`audioUrl`,`duration`,`status`,`sharedDate`,`originalUrl`,`wordCount`,`uniqueWordCount`,`rosesCount`,`lessonRating`,`audioRating`,`collectionId`,`collectionTitle`,`transliteration`,`altScript`,`classicUrl`,`sourceType`,`sourceName`,`sourceUrl`,`previousLessonId`,`nextLessonId`,`readTimes`,`listenTimes`,`isCompleted`,`newWordsCount`,`cardsCount`,`isRoseGiven`,`giveRoseUrl`,`price`,`opened`,`percentCompleted`,`lastRoseReceived`,`isFavorite`,`printUrl`,`videoUrl`,`exercises`,`notes`,`viewsCount`,`providerId`,`providerName`,`providerDescription`,`originalImageUrl`,`providerImageUrl`,`sharedById`,`sharedByName`,`sharedByImageUrl`,`sharedByRole`,`isSharedByIsFriend`,`isCanEdit`,`canEditSentence`,`isProtected`,`lessonVotes`,`audioVotes`,`level`,`tags`,`progressDownloaded`,`progress`,`translationSentence`,`mediaImageUrl`,`mediaTitle`,`ptime`,`isPinned`,`difficulty`,`newWords`,`lessonPreview`,`isTaken`,`folders`,`audioPending`,`isLocked`,`lastOpenTime`,`userLiked_username`,`userLiked_liked`,`userCompleted_username`,`userCompleted_completed`,`translation_language`,`translation_sentences`,`nextLesson_id`,`nextLesson_price`,`nextLesson_collectionTitle`,`nextLesson_isTaken`,`nextLesson_sharedById`,`nextLesson_status`,`nextLesson_title`,`nextLesson_image`,`nextLesson_duration`,`nextLesson_source`,`nextLesson_url`,`previousLesson_id`,`previousLesson_price`,`previousLesson_collectionTitle`,`previousLesson_isTaken`,`previousLesson_sharedById`,`previousLesson_status`,`previousLesson_title`,`previousLesson_image`,`previousLesson_duration`,`previousLesson_source`,`previousLesson_url`,`promoted_course_ctaText`,`promoted_course_description`,`promoted_course_ctaUrl`,`simplified_to_status`,`simplified_to_isLocked`,`simplified_to_id`,`simplified_by_status`,`simplified_by_isLocked`,`simplified_by_id`,`metadata_importLesson`,`metadata_importMethod`,`metadata_splittingMethod`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
