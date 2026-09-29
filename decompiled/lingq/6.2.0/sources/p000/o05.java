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
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o05 extends ss5 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f53521p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ q05 f53522q;

    public /* synthetic */ o05(q05 q05Var, int i) {
        this.f53521p = i;
        this.f53522q = q05Var;
    }

    /* JADX INFO: renamed from: f0 */
    private final void m17722f0(ik8 ik8Var, Object obj) {
        r45 r45Var = (r45) obj;
        ik8Var.getClass();
        r45Var.getClass();
        ik8Var.mo2878j(1, r45Var.m20343n());
        String strM20332h0 = r45Var.m20332h0();
        if (strM20332h0 == null) {
            ik8Var.mo2880m(2);
        } else {
            ik8Var.mo2874C(2, strM20332h0);
        }
        ik8Var.mo2878j(3, r45Var.m20298H());
        String strM20326e0 = r45Var.m20326e0();
        if (strM20326e0 == null) {
            ik8Var.mo2880m(4);
        } else {
            ik8Var.mo2874C(4, strM20326e0);
        }
        String strM20335j = r45Var.m20335j();
        if (strM20335j == null) {
            ik8Var.mo2880m(5);
        } else {
            ik8Var.mo2874C(5, strM20335j);
        }
        String strM20306P = r45Var.m20306P();
        if (strM20306P == null) {
            ik8Var.mo2880m(6);
        } else {
            ik8Var.mo2874C(6, strM20306P);
        }
        String strM20345o = r45Var.m20345o();
        if (strM20345o == null) {
            ik8Var.mo2880m(7);
        } else {
            ik8Var.mo2874C(7, strM20345o);
        }
        String strM20321c = r45Var.m20321c();
        if (strM20321c == null) {
            ik8Var.mo2880m(8);
        } else {
            ik8Var.mo2874C(8, strM20321c);
        }
        ik8Var.mo2878j(9, r45Var.m20337k());
        String strM20322c0 = r45Var.m20322c0();
        if (strM20322c0 == null) {
            ik8Var.mo2880m(10);
        } else {
            ik8Var.mo2874C(10, strM20322c0);
        }
        String strM20313W = r45Var.m20313W();
        if (strM20313W == null) {
            ik8Var.mo2880m(11);
        } else {
            ik8Var.mo2874C(11, strM20313W);
        }
        String strM20296F = r45Var.m20296F();
        if (strM20296F == null) {
            ik8Var.mo2880m(12);
        } else {
            ik8Var.mo2874C(12, strM20296F);
        }
        ik8Var.mo2878j(13, r45Var.m20338k0());
        ik8Var.mo2878j(14, r45Var.m20330g0());
        ik8Var.mo2878j(15, r45Var.m20308R());
        ik8Var.mo2877g(16, r45Var.m20354u());
        ik8Var.mo2877g(17, r45Var.m20319b());
        ik8Var.mo2878j(18, r45Var.m20331h());
        String strM20333i = r45Var.m20333i();
        if (strM20333i == null) {
            ik8Var.mo2880m(19);
        } else {
            ik8Var.mo2874C(19, strM20333i);
        }
        String strM20329g = r45Var.m20329g();
        if (strM20329g == null) {
            ik8Var.mo2880m(20);
        } else {
            ik8Var.mo2874C(20, strM20329g);
        }
        String strM20318a0 = r45Var.m20318a0();
        if (strM20318a0 == null) {
            ik8Var.mo2880m(21);
        } else {
            ik8Var.mo2874C(21, strM20318a0);
        }
        String strM20316Z = r45Var.m20316Z();
        if (strM20316Z == null) {
            ik8Var.mo2880m(22);
        } else {
            ik8Var.mo2874C(22, strM20316Z);
        }
        String strM20320b0 = r45Var.m20320b0();
        if (strM20320b0 == null) {
            ik8Var.mo2880m(23);
        } else {
            ik8Var.mo2874C(23, strM20320b0);
        }
        Integer numM20300J = r45Var.m20300J();
        if (numM20300J == null) {
            ik8Var.mo2880m(24);
        } else {
            ik8Var.mo2878j(24, numM20300J.intValue());
        }
        Integer numM20292B = r45Var.m20292B();
        if (numM20292B == null) {
            ik8Var.mo2880m(25);
        } else {
            ik8Var.mo2878j(25, numM20292B.intValue());
        }
        ik8Var.mo2877g(26, r45Var.m20307Q());
        ik8Var.mo2877g(27, r45Var.m20357x());
        ik8Var.mo2878j(28, r45Var.m20342m0() ? 1L : 0L);
        ik8Var.mo2878j(29, r45Var.m20359z());
        ik8Var.mo2878j(30, r45Var.m20327f());
        ik8Var.mo2878j(31, r45Var.m20348p0() ? 1L : 0L);
        String strM20341m = r45Var.m20341m();
        if (strM20341m == null) {
            ik8Var.mo2880m(32);
        } else {
            ik8Var.mo2874C(32, strM20341m);
        }
        ik8Var.mo2878j(33, r45Var.m20301K());
        ik8Var.mo2878j(34, r45Var.m20294D() ? 1L : 0L);
        ik8Var.mo2877g(35, r45Var.m20297G());
        String strM20349q = r45Var.m20349q();
        if (strM20349q == null) {
            ik8Var.mo2880m(36);
        } else {
            ik8Var.mo2874C(36, strM20349q);
        }
        ik8Var.mo2878j(37, r45Var.m20344n0() ? 1L : 0L);
        String strM20302L = r45Var.m20302L();
        if (strM20302L == null) {
            ik8Var.mo2880m(38);
        } else {
            ik8Var.mo2874C(38, strM20302L);
        }
        String strM20334i0 = r45Var.m20334i0();
        if (strM20334i0 == null) {
            ik8Var.mo2880m(39);
        } else {
            ik8Var.mo2874C(39, strM20334i0);
        }
        String strM20339l = r45Var.m20339l();
        if (strM20339l == null) {
            ik8Var.mo2880m(40);
        } else {
            ik8Var.mo2874C(40, strM20339l);
        }
        String strM20293C = r45Var.m20293C();
        if (strM20293C == null) {
            ik8Var.mo2880m(41);
        } else {
            ik8Var.mo2874C(41, strM20293C);
        }
        ik8Var.mo2878j(42, r45Var.m20336j0());
        String strM20305O = r45Var.m20305O();
        if (strM20305O == null) {
            ik8Var.mo2880m(43);
        } else {
            ik8Var.mo2874C(43, strM20305O);
        }
        String strM20303M = r45Var.m20303M();
        if (strM20303M == null) {
            ik8Var.mo2880m(44);
        } else {
            ik8Var.mo2874C(44, strM20303M);
        }
        String strM20295E = r45Var.m20295E();
        if (strM20295E == null) {
            ik8Var.mo2880m(45);
        } else {
            ik8Var.mo2874C(45, strM20295E);
        }
        String strM20304N = r45Var.m20304N();
        if (strM20304N == null) {
            ik8Var.mo2880m(46);
        } else {
            ik8Var.mo2874C(46, strM20304N);
        }
        String strM20309S = r45Var.m20309S();
        if (strM20309S == null) {
            ik8Var.mo2880m(47);
        } else {
            ik8Var.mo2874C(47, strM20309S);
        }
        String strM20311U = r45Var.m20311U();
        if (strM20311U == null) {
            ik8Var.mo2880m(48);
        } else {
            ik8Var.mo2874C(48, strM20311U);
        }
        String strM20310T = r45Var.m20310T();
        if (strM20310T == null) {
            ik8Var.mo2880m(49);
        } else {
            ik8Var.mo2874C(49, strM20310T);
        }
        String strM20312V = r45Var.m20312V();
        if (strM20312V == null) {
            ik8Var.mo2880m(50);
        } else {
            ik8Var.mo2874C(50, strM20312V);
        }
        ik8Var.mo2878j(51, r45Var.m20350q0() ? 1L : 0L);
        ik8Var.mo2878j(52, r45Var.m20340l0() ? 1L : 0L);
        ik8Var.mo2878j(53, r45Var.m20325e() ? 1L : 0L);
        ik8Var.mo2878j(54, r45Var.m20355v());
        ik8Var.mo2878j(55, r45Var.m20323d());
        String strM20356w = r45Var.m20356w();
        if (strM20356w == null) {
            ik8Var.mo2880m(56);
        } else {
            ik8Var.mo2874C(56, strM20356w);
        }
        List listM20324d0 = r45Var.m20324d0();
        qn3 qn3Var = this.f53522q.f57073M;
        String strM20079y = qn3Var.m20079y(listM20324d0);
        if (strM20079y == null) {
            ik8Var.mo2880m(57);
        } else {
            ik8Var.mo2874C(57, strM20079y);
        }
        ik8Var.mo2878j(58, Integer.valueOf(r45Var.m20317a().booleanValue() ? 1 : 0).intValue());
        String strM20346o0 = r45Var.m20346o0();
        if (strM20346o0 == null) {
            ik8Var.mo2880m(59);
        } else {
            ik8Var.mo2874C(59, strM20346o0);
        }
        String strM20347p = r45Var.m20347p();
        if (strM20347p == null) {
            ik8Var.mo2880m(60);
        } else {
            ik8Var.mo2874C(60, strM20347p);
        }
        LessonUserLiked lessonUserLikedM20352s = r45Var.m20352s();
        if (lessonUserLikedM20352s != null) {
            String strM8072b = lessonUserLikedM20352s.m8072b();
            if (strM8072b == null) {
                ik8Var.mo2880m(61);
            } else {
                ik8Var.mo2874C(61, strM8072b);
            }
            Date dateM8071a = lessonUserLikedM20352s.m8071a();
            qn3Var.getClass();
            Long lM20046n = qn3.m20046n(dateM8071a);
            if (lM20046n == null) {
                ik8Var.mo2880m(62);
            } else {
                ik8Var.mo2878j(62, lM20046n.longValue());
            }
        } else {
            ik8Var.mo2880m(61);
            ik8Var.mo2880m(62);
        }
        LessonUserCompleted lessonUserCompletedM20351r = r45Var.m20351r();
        if (lessonUserCompletedM20351r != null) {
            String strM8070b = lessonUserCompletedM20351r.m8070b();
            if (strM8070b == null) {
                ik8Var.mo2880m(63);
            } else {
                ik8Var.mo2874C(63, strM8070b);
            }
            Date dateM8069a = lessonUserCompletedM20351r.m8069a();
            qn3Var.getClass();
            Long lM20046n2 = qn3.m20046n(dateM8069a);
            if (lM20046n2 == null) {
                ik8Var.mo2880m(64);
            } else {
                ik8Var.mo2878j(64, lM20046n2.longValue());
            }
        } else {
            ik8Var.mo2880m(63);
            ik8Var.mo2880m(64);
        }
        LessonSentencesTranslation lessonSentencesTranslationM20328f0 = r45Var.m20328f0();
        if (lessonSentencesTranslationM20328f0 != null) {
            String strM8060a = lessonSentencesTranslationM20328f0.m8060a();
            if (strM8060a == null) {
                ik8Var.mo2880m(65);
            } else {
                ik8Var.mo2874C(65, strM8060a);
            }
            String strM20049B = qn3Var.m20049B(lessonSentencesTranslationM20328f0.m8061b());
            if (strM20049B == null) {
                ik8Var.mo2880m(66);
            } else {
                ik8Var.mo2874C(66, strM20049B);
            }
        } else {
            ik8Var.mo2880m(65);
            ik8Var.mo2880m(66);
        }
        LessonReference lessonReferenceM20291A = r45Var.m20291A();
        if (lessonReferenceM20291A != null) {
            ik8Var.mo2878j(67, lessonReferenceM20291A.m8051c());
            ik8Var.mo2878j(68, lessonReferenceM20291A.m8053e());
            String strM8049a = lessonReferenceM20291A.m8049a();
            if (strM8049a == null) {
                ik8Var.mo2880m(69);
            } else {
                ik8Var.mo2874C(69, strM8049a);
            }
            ik8Var.mo2878j(70, lessonReferenceM20291A.m8059k() ? 1L : 0L);
            Integer numM8054f = lessonReferenceM20291A.m8054f();
            if (numM8054f == null) {
                ik8Var.mo2880m(71);
            } else {
                ik8Var.mo2878j(71, numM8054f.intValue());
            }
            String strM8056h = lessonReferenceM20291A.m8056h();
            if (strM8056h == null) {
                ik8Var.mo2880m(72);
            } else {
                ik8Var.mo2874C(72, strM8056h);
            }
            String strM8057i = lessonReferenceM20291A.m8057i();
            if (strM8057i == null) {
                ik8Var.mo2880m(73);
            } else {
                ik8Var.mo2874C(73, strM8057i);
            }
            String strM8052d = lessonReferenceM20291A.m8052d();
            if (strM8052d == null) {
                ik8Var.mo2880m(74);
            } else {
                ik8Var.mo2874C(74, strM8052d);
            }
            Integer numM8050b = lessonReferenceM20291A.m8050b();
            if (numM8050b == null) {
                ik8Var.mo2880m(75);
            } else {
                ik8Var.mo2878j(75, numM8050b.intValue());
            }
            String strM8055g = lessonReferenceM20291A.m8055g();
            if (strM8055g == null) {
                ik8Var.mo2880m(76);
            } else {
                ik8Var.mo2874C(76, strM8055g);
            }
            String strM8058j = lessonReferenceM20291A.m8058j();
            if (strM8058j == null) {
                ik8Var.mo2880m(77);
            } else {
                ik8Var.mo2874C(77, strM8058j);
            }
        } else {
            ik8Var.mo2880m(67);
            ik8Var.mo2880m(68);
            ik8Var.mo2880m(69);
            ik8Var.mo2880m(70);
            ik8Var.mo2880m(71);
            ik8Var.mo2880m(72);
            ik8Var.mo2880m(73);
            ik8Var.mo2880m(74);
            hn1.m13362l(ik8Var, 75, 76, 77);
        }
        LessonReference lessonReferenceM20299I = r45Var.m20299I();
        if (lessonReferenceM20299I != null) {
            ik8Var.mo2878j(78, lessonReferenceM20299I.m8051c());
            ik8Var.mo2878j(79, lessonReferenceM20299I.m8053e());
            String strM8049a2 = lessonReferenceM20299I.m8049a();
            if (strM8049a2 == null) {
                ik8Var.mo2880m(80);
            } else {
                ik8Var.mo2874C(80, strM8049a2);
            }
            ik8Var.mo2878j(81, lessonReferenceM20299I.m8059k() ? 1L : 0L);
            Integer numM8054f2 = lessonReferenceM20299I.m8054f();
            if (numM8054f2 == null) {
                ik8Var.mo2880m(82);
            } else {
                ik8Var.mo2878j(82, numM8054f2.intValue());
            }
            String strM8056h2 = lessonReferenceM20299I.m8056h();
            if (strM8056h2 == null) {
                ik8Var.mo2880m(83);
            } else {
                ik8Var.mo2874C(83, strM8056h2);
            }
            String strM8057i2 = lessonReferenceM20299I.m8057i();
            if (strM8057i2 == null) {
                ik8Var.mo2880m(84);
            } else {
                ik8Var.mo2874C(84, strM8057i2);
            }
            String strM8052d2 = lessonReferenceM20299I.m8052d();
            if (strM8052d2 == null) {
                ik8Var.mo2880m(85);
            } else {
                ik8Var.mo2874C(85, strM8052d2);
            }
            Integer numM8050b2 = lessonReferenceM20299I.m8050b();
            if (numM8050b2 == null) {
                ik8Var.mo2880m(86);
            } else {
                ik8Var.mo2878j(86, numM8050b2.intValue());
            }
            String strM8055g2 = lessonReferenceM20299I.m8055g();
            if (strM8055g2 == null) {
                ik8Var.mo2880m(87);
            } else {
                ik8Var.mo2874C(87, strM8055g2);
            }
            String strM8058j2 = lessonReferenceM20299I.m8058j();
            if (strM8058j2 == null) {
                ik8Var.mo2880m(88);
            } else {
                ik8Var.mo2874C(88, strM8058j2);
            }
        } else {
            ik8Var.mo2880m(78);
            ik8Var.mo2880m(79);
            ik8Var.mo2880m(80);
            ik8Var.mo2880m(81);
            ik8Var.mo2880m(82);
            ik8Var.mo2880m(83);
            ik8Var.mo2880m(84);
            ik8Var.mo2880m(85);
            hn1.m13362l(ik8Var, 86, 87, 88);
        }
        LessonPromotedCourse lessonPromotedCourseM20353t = r45Var.m20353t();
        if (lessonPromotedCourseM20353t != null) {
            String strM8046a = lessonPromotedCourseM20353t.m8046a();
            if (strM8046a == null) {
                ik8Var.mo2880m(89);
            } else {
                ik8Var.mo2874C(89, strM8046a);
            }
            String strM8048c = lessonPromotedCourseM20353t.m8048c();
            if (strM8048c == null) {
                ik8Var.mo2880m(90);
            } else {
                ik8Var.mo2874C(90, strM8048c);
            }
            String strM8047b = lessonPromotedCourseM20353t.m8047b();
            if (strM8047b == null) {
                ik8Var.mo2880m(91);
            } else {
                ik8Var.mo2874C(91, strM8047b);
            }
        } else {
            hn1.m13362l(ik8Var, 89, 90, 91);
        }
        LessonSimplifiedOf lessonSimplifiedOfM20315Y = r45Var.m20315Y();
        if (lessonSimplifiedOfM20315Y != null) {
            String strM8063b = lessonSimplifiedOfM20315Y.m8063b();
            if (strM8063b == null) {
                ik8Var.mo2880m(92);
            } else {
                ik8Var.mo2874C(92, strM8063b);
            }
            String strM8064c = lessonSimplifiedOfM20315Y.m8064c();
            if (strM8064c == null) {
                ik8Var.mo2880m(93);
            } else {
                ik8Var.mo2874C(93, strM8064c);
            }
            ik8Var.mo2878j(94, lessonSimplifiedOfM20315Y.m8062a());
        } else {
            hn1.m13362l(ik8Var, 92, 93, 94);
        }
        LessonSimplifiedOf lessonSimplifiedOfM20314X = r45Var.m20314X();
        if (lessonSimplifiedOfM20314X != null) {
            String strM8063b2 = lessonSimplifiedOfM20314X.m8063b();
            if (strM8063b2 == null) {
                ik8Var.mo2880m(95);
            } else {
                ik8Var.mo2874C(95, strM8063b2);
            }
            String strM8064c2 = lessonSimplifiedOfM20314X.m8064c();
            if (strM8064c2 == null) {
                ik8Var.mo2880m(96);
            } else {
                ik8Var.mo2874C(96, strM8064c2);
            }
            ik8Var.mo2878j(97, lessonSimplifiedOfM20314X.m8062a());
        } else {
            hn1.m13362l(ik8Var, 95, 96, 97);
        }
        LessonMetadata lessonMetadataM20358y = r45Var.m20358y();
        if (lessonMetadataM20358y != null) {
            String strM8043a = lessonMetadataM20358y.m8043a();
            if (strM8043a == null) {
                ik8Var.mo2880m(98);
            } else {
                ik8Var.mo2874C(98, strM8043a);
            }
            String strM8044b = lessonMetadataM20358y.m8044b();
            if (strM8044b == null) {
                ik8Var.mo2880m(99);
            } else {
                ik8Var.mo2874C(99, strM8044b);
            }
            String strM8045c = lessonMetadataM20358y.m8045c();
            if (strM8045c == null) {
                ik8Var.mo2880m(100);
            } else {
                ik8Var.mo2874C(100, strM8045c);
            }
        } else {
            hn1.m13362l(ik8Var, 98, 99, 100);
        }
        ik8Var.mo2878j(101, r45Var.m20343n());
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: m */
    public final void mo16668m(ik8 ik8Var, Object obj) {
        int i = this.f53521p;
        q05 q05Var = this.f53522q;
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
                ik8Var.mo2878j(8, translationSentenceEntity.m7816d());
                ik8Var.mo2878j(9, translationSentenceEntity.m7817e());
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
                String strM20072p = listM7744h == null ? null : qn3Var2.m20072p(listM7744h);
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
                if (strM7741e == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2874C(9, strM7741e);
                }
                ik8Var.mo2878j(10, lessonSentenceEntity.m7739c());
                ik8Var.mo2878j(11, lessonSentenceEntity.m7738b());
                break;
            case 2:
                m17722f0(ik8Var, obj);
                break;
            case 3:
                qn3 qn3Var3 = q05Var.f57073M;
                l65 l65Var = (l65) obj;
                ik8Var.getClass();
                l65Var.getClass();
                ik8Var.mo2878j(1, l65Var.m15885o());
                String strM15862b0 = l65Var.m15862b0();
                if (strM15862b0 == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2874C(2, strM15862b0);
                }
                ik8Var.mo2878j(3, l65Var.m15836D());
                String strM15858Z = l65Var.m15858Z();
                if (strM15858Z == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM15858Z);
                }
                String strM15875i = l65Var.m15875i();
                if (strM15875i == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM15875i);
                }
                String strM15843K = l65Var.m15843K();
                if (strM15843K == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM15843K);
                }
                String strM15886p = l65Var.m15886p();
                if (strM15886p == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM15886p);
                }
                String strM15863c = l65Var.m15863c();
                if (strM15863c == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM15863c);
                }
                ik8Var.mo2878j(9, l65Var.m15879k());
                String strM15856X = l65Var.m15856X();
                if (strM15856X == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, strM15856X);
                }
                String strM15850R = l65Var.m15850R();
                if (strM15850R == null) {
                    ik8Var.mo2880m(11);
                } else {
                    ik8Var.mo2874C(11, strM15850R);
                }
                String strM15834B = l65Var.m15834B();
                if (strM15834B == null) {
                    ik8Var.mo2880m(12);
                } else {
                    ik8Var.mo2874C(12, strM15834B);
                }
                ik8Var.mo2878j(13, l65Var.m15868e0());
                ik8Var.mo2878j(14, l65Var.m15860a0());
                ik8Var.mo2878j(15, l65Var.m15845M());
                ik8Var.mo2877g(16, l65Var.m15889s());
                ik8Var.mo2877g(17, l65Var.m15861b());
                ik8Var.mo2878j(18, l65Var.m15871g());
                String strM15873h = l65Var.m15873h();
                if (strM15873h == null) {
                    ik8Var.mo2880m(19);
                } else {
                    ik8Var.mo2874C(19, strM15873h);
                }
                String strM15869f = l65Var.m15869f();
                if (strM15869f == null) {
                    ik8Var.mo2880m(20);
                } else {
                    ik8Var.mo2874C(20, strM15869f);
                }
                String strM15854V = l65Var.m15854V();
                if (strM15854V == null) {
                    ik8Var.mo2880m(21);
                } else {
                    ik8Var.mo2874C(21, strM15854V);
                }
                String strM15853U = l65Var.m15853U();
                if (strM15853U == null) {
                    ik8Var.mo2880m(22);
                } else {
                    ik8Var.mo2874C(22, strM15853U);
                }
                String strM15855W = l65Var.m15855W();
                if (strM15855W == null) {
                    ik8Var.mo2880m(23);
                } else {
                    ik8Var.mo2874C(23, strM15855W);
                }
                Integer numM15837E = l65Var.m15837E();
                if (numM15837E == null) {
                    ik8Var.mo2880m(24);
                } else {
                    ik8Var.mo2878j(24, numM15837E.intValue());
                }
                Integer numM15894x = l65Var.m15894x();
                if (numM15894x == null) {
                    ik8Var.mo2880m(25);
                } else {
                    ik8Var.mo2878j(25, numM15894x.intValue());
                }
                ik8Var.mo2877g(26, l65Var.m15844L());
                ik8Var.mo2877g(27, l65Var.m15892v());
                ik8Var.mo2878j(28, l65Var.m15872g0() ? 1L : 0L);
                ik8Var.mo2878j(29, l65Var.m15893w());
                ik8Var.mo2878j(30, l65Var.m15867e());
                ik8Var.mo2878j(31, l65Var.m15878j0() ? 1L : 0L);
                String strM15884n = l65Var.m15884n();
                if (strM15884n == null) {
                    ik8Var.mo2880m(32);
                } else {
                    ik8Var.mo2874C(32, strM15884n);
                }
                ik8Var.mo2878j(33, l65Var.m15838F());
                ik8Var.mo2878j(34, l65Var.m15896z() ? 1L : 0L);
                ik8Var.mo2877g(35, l65Var.m15835C());
                String strM15887q = l65Var.m15887q();
                if (strM15887q == null) {
                    ik8Var.mo2880m(36);
                } else {
                    ik8Var.mo2874C(36, strM15887q);
                }
                ik8Var.mo2878j(37, l65Var.m15874h0() ? 1L : 0L);
                String strM15839G = l65Var.m15839G();
                if (strM15839G == null) {
                    ik8Var.mo2880m(38);
                } else {
                    ik8Var.mo2874C(38, strM15839G);
                }
                String strM15864c0 = l65Var.m15864c0();
                if (strM15864c0 == null) {
                    ik8Var.mo2880m(39);
                } else {
                    ik8Var.mo2874C(39, strM15864c0);
                }
                String strM15881l = l65Var.m15881l();
                if (strM15881l == null) {
                    ik8Var.mo2880m(40);
                } else {
                    ik8Var.mo2874C(40, strM15881l);
                }
                String strM15895y = l65Var.m15895y();
                if (strM15895y == null) {
                    ik8Var.mo2880m(41);
                } else {
                    ik8Var.mo2874C(41, strM15895y);
                }
                ik8Var.mo2878j(42, l65Var.m15866d0());
                String strM15842J = l65Var.m15842J();
                if (strM15842J == null) {
                    ik8Var.mo2880m(43);
                } else {
                    ik8Var.mo2874C(43, strM15842J);
                }
                String strM15840H = l65Var.m15840H();
                if (strM15840H == null) {
                    ik8Var.mo2880m(44);
                } else {
                    ik8Var.mo2874C(44, strM15840H);
                }
                String strM15833A = l65Var.m15833A();
                if (strM15833A == null) {
                    ik8Var.mo2880m(45);
                } else {
                    ik8Var.mo2874C(45, strM15833A);
                }
                String strM15841I = l65Var.m15841I();
                if (strM15841I == null) {
                    ik8Var.mo2880m(46);
                } else {
                    ik8Var.mo2874C(46, strM15841I);
                }
                String strM15846N = l65Var.m15846N();
                if (strM15846N == null) {
                    ik8Var.mo2880m(47);
                } else {
                    ik8Var.mo2874C(47, strM15846N);
                }
                String strM15848P = l65Var.m15848P();
                if (strM15848P == null) {
                    ik8Var.mo2880m(48);
                } else {
                    ik8Var.mo2874C(48, strM15848P);
                }
                String strM15847O = l65Var.m15847O();
                if (strM15847O == null) {
                    ik8Var.mo2880m(49);
                } else {
                    ik8Var.mo2874C(49, strM15847O);
                }
                String strM15849Q = l65Var.m15849Q();
                if (strM15849Q == null) {
                    ik8Var.mo2880m(50);
                } else {
                    ik8Var.mo2874C(50, strM15849Q);
                }
                ik8Var.mo2878j(51, l65Var.m15880k0() ? 1L : 0L);
                ik8Var.mo2878j(52, l65Var.m15870f0() ? 1L : 0L);
                ik8Var.mo2878j(53, l65Var.m15890t());
                ik8Var.mo2878j(54, l65Var.m15865d());
                String strM15891u = l65Var.m15891u();
                if (strM15891u == null) {
                    ik8Var.mo2880m(55);
                } else {
                    ik8Var.mo2874C(55, strM15891u);
                }
                String strM20079y = qn3Var3.m20079y(l65Var.m15857Y());
                if (strM20079y == null) {
                    ik8Var.mo2880m(56);
                } else {
                    ik8Var.mo2874C(56, strM20079y);
                }
                ik8Var.mo2877g(57, l65Var.m15877j());
                Boolean boolM15882l0 = l65Var.m15882l0();
                Integer numValueOf = boolM15882l0 != null ? Integer.valueOf(boolM15882l0.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ik8Var.mo2880m(58);
                } else {
                    ik8Var.mo2878j(58, numValueOf.intValue());
                }
                String strM20079y2 = qn3Var3.m20079y(l65Var.m15883m());
                if (strM20079y2 == null) {
                    ik8Var.mo2880m(59);
                } else {
                    ik8Var.mo2874C(59, strM20079y2);
                }
                ik8Var.mo2878j(60, Integer.valueOf(l65Var.m15859a().booleanValue() ? 1 : 0).intValue());
                String strM15876i0 = l65Var.m15876i0();
                if (strM15876i0 == null) {
                    ik8Var.mo2880m(61);
                } else {
                    ik8Var.mo2874C(61, strM15876i0);
                }
                LessonPromotedCourse lessonPromotedCourseM15888r = l65Var.m15888r();
                if (lessonPromotedCourseM15888r != null) {
                    String strM8046a = lessonPromotedCourseM15888r.m8046a();
                    if (strM8046a == null) {
                        ik8Var.mo2880m(62);
                    } else {
                        ik8Var.mo2874C(62, strM8046a);
                    }
                    String strM8048c = lessonPromotedCourseM15888r.m8048c();
                    if (strM8048c == null) {
                        ik8Var.mo2880m(63);
                    } else {
                        ik8Var.mo2874C(63, strM8048c);
                    }
                    String strM8047b = lessonPromotedCourseM15888r.m8047b();
                    if (strM8047b == null) {
                        ik8Var.mo2880m(64);
                    } else {
                        ik8Var.mo2874C(64, strM8047b);
                    }
                } else {
                    hn1.m13362l(ik8Var, 62, 63, 64);
                }
                LessonSimplifiedOf lessonSimplifiedOfM15852T = l65Var.m15852T();
                if (lessonSimplifiedOfM15852T != null) {
                    String strM8063b = lessonSimplifiedOfM15852T.m8063b();
                    if (strM8063b == null) {
                        ik8Var.mo2880m(65);
                    } else {
                        ik8Var.mo2874C(65, strM8063b);
                    }
                    String strM8064c = lessonSimplifiedOfM15852T.m8064c();
                    if (strM8064c == null) {
                        ik8Var.mo2880m(66);
                    } else {
                        ik8Var.mo2874C(66, strM8064c);
                    }
                    ik8Var.mo2878j(67, lessonSimplifiedOfM15852T.m8062a());
                } else {
                    hn1.m13362l(ik8Var, 65, 66, 67);
                }
                LessonSimplifiedOf lessonSimplifiedOfM15851S = l65Var.m15851S();
                if (lessonSimplifiedOfM15851S != null) {
                    String strM8063b2 = lessonSimplifiedOfM15851S.m8063b();
                    if (strM8063b2 == null) {
                        ik8Var.mo2880m(68);
                    } else {
                        ik8Var.mo2874C(68, strM8063b2);
                    }
                    String strM8064c2 = lessonSimplifiedOfM15851S.m8064c();
                    if (strM8064c2 == null) {
                        ik8Var.mo2880m(69);
                    } else {
                        ik8Var.mo2874C(69, strM8064c2);
                    }
                    ik8Var.mo2878j(70, lessonSimplifiedOfM15851S.m8062a());
                } else {
                    hn1.m13362l(ik8Var, 68, 69, 70);
                }
                ik8Var.mo2878j(71, l65Var.m15885o());
                break;
            case 4:
                TranslationSentenceEntity translationSentenceEntity2 = (TranslationSentenceEntity) obj;
                qn3 qn3Var4 = q05Var.f57073M;
                ik8Var.getClass();
                translationSentenceEntity2.getClass();
                ik8Var.mo2878j(1, translationSentenceEntity2.m7816d());
                ik8Var.mo2878j(2, translationSentenceEntity2.m7817e());
                Double dM7814b2 = translationSentenceEntity2.m7814b();
                if (dM7814b2 == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2877g(3, dM7814b2.doubleValue());
                }
                Double dM7815c2 = translationSentenceEntity2.m7815c();
                if (dM7815c2 == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2877g(4, dM7815c2.doubleValue());
                }
                ik8Var.mo2874C(5, translationSentenceEntity2.m7819g());
                ik8Var.mo2874C(6, qn3Var4.m20068W(translationSentenceEntity2.m7820h()));
                ik8Var.mo2874C(7, qn3Var4.m20048A(translationSentenceEntity2.m7818f()));
                ik8Var.mo2878j(8, translationSentenceEntity2.m7816d());
                ik8Var.mo2878j(9, translationSentenceEntity2.m7817e());
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
                qn3 qn3Var5 = q05Var.f57073M;
                ik8Var.mo2874C(21, qn3Var5.m20078x(lessonEntity.m7716t0()));
                ik8Var.mo2874C(22, qn3Var5.m20078x(lessonEntity.m7679b()));
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
                String strM20079y3 = qn3Var5.m20079y(lessonEntity.m7708p0());
                if (strM20079y3 == null) {
                    ik8Var.mo2880m(62);
                } else {
                    ik8Var.mo2874C(62, strM20079y3);
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
                yf4 yf4Var = (yf4) qn3Var5.f57974a;
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
                Integer numValueOf2 = boolM7652E0 != null ? Integer.valueOf(boolM7652E0.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    ik8Var.mo2880m(69);
                } else {
                    ik8Var.mo2878j(69, numValueOf2.intValue());
                }
                ik8Var.mo2877g(70, lessonEntity.m7701m());
                ik8Var.mo2878j(71, lessonEntity.m7655G());
                ik8Var.mo2874C(72, lessonEntity.m7723x());
                Boolean boolM7660I0 = lessonEntity.m7660I0();
                Integer numValueOf3 = boolM7660I0 != null ? Integer.valueOf(boolM7660I0.booleanValue() ? 1 : 0) : null;
                if (numValueOf3 == null) {
                    ik8Var.mo2880m(73);
                } else {
                    ik8Var.mo2878j(73, numValueOf3.intValue());
                }
                String strM20079y4 = qn3Var5.m20079y(lessonEntity.m7707p());
                if (strM20079y4 == null) {
                    ik8Var.mo2880m(74);
                } else {
                    ik8Var.mo2874C(74, strM20079y4);
                }
                Boolean boolM7681c = lessonEntity.m7681c();
                Integer numValueOf4 = boolM7681c != null ? Integer.valueOf(boolM7681c.booleanValue() ? 1 : 0) : null;
                if (numValueOf4 == null) {
                    ik8Var.mo2880m(75);
                } else {
                    ik8Var.mo2878j(75, numValueOf4.intValue());
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
                    String strM20049B = qn3Var5.m20049B(lessonSentencesTranslationM7712r0.m8061b());
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
                    String strM8046a2 = lessonPromotedCourseM7725y.m8046a();
                    if (strM8046a2 == null) {
                        ik8Var.mo2880m(106);
                    } else {
                        ik8Var.mo2874C(106, strM8046a2);
                    }
                    String strM8048c2 = lessonPromotedCourseM7725y.m8048c();
                    if (strM8048c2 == null) {
                        ik8Var.mo2880m(107);
                    } else {
                        ik8Var.mo2874C(107, strM8048c2);
                    }
                    String strM8047b2 = lessonPromotedCourseM7725y.m8047b();
                    if (strM8047b2 == null) {
                        ik8Var.mo2880m(108);
                    } else {
                        ik8Var.mo2874C(108, strM8047b2);
                    }
                } else {
                    hn1.m13362l(ik8Var, 106, 107, 108);
                }
                LessonSimplifiedOf lessonSimplifiedOfM7698k0 = lessonEntity.m7698k0();
                if (lessonSimplifiedOfM7698k0 != null) {
                    String strM8063b3 = lessonSimplifiedOfM7698k0.m8063b();
                    if (strM8063b3 == null) {
                        ik8Var.mo2880m(109);
                    } else {
                        ik8Var.mo2874C(109, strM8063b3);
                    }
                    String strM8064c3 = lessonSimplifiedOfM7698k0.m8064c();
                    if (strM8064c3 == null) {
                        ik8Var.mo2880m(110);
                    } else {
                        ik8Var.mo2874C(110, strM8064c3);
                    }
                    ik8Var.mo2878j(111, lessonSimplifiedOfM7698k0.m8062a());
                } else {
                    hn1.m13362l(ik8Var, 109, 110, 111);
                }
                LessonSimplifiedOf lessonSimplifiedOfM7696j0 = lessonEntity.m7696j0();
                if (lessonSimplifiedOfM7696j0 != null) {
                    String strM8063b4 = lessonSimplifiedOfM7696j0.m8063b();
                    if (strM8063b4 == null) {
                        ik8Var.mo2880m(112);
                    } else {
                        ik8Var.mo2874C(112, strM8063b4);
                    }
                    String strM8064c4 = lessonSimplifiedOfM7696j0.m8064c();
                    if (strM8064c4 == null) {
                        ik8Var.mo2880m(113);
                    } else {
                        ik8Var.mo2874C(113, strM8064c4);
                    }
                    ik8Var.mo2878j(114, lessonSimplifiedOfM7696j0.m8062a());
                } else {
                    hn1.m13362l(ik8Var, 112, 113, 114);
                }
                LessonMetadata lessonMetadataM7653F = lessonEntity.m7653F();
                if (lessonMetadataM7653F != null) {
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
                    if (strM8045c == null) {
                        ik8Var.mo2880m(117);
                    } else {
                        ik8Var.mo2874C(117, strM8045c);
                    }
                } else {
                    hn1.m13362l(ik8Var, 115, 116, 117);
                }
                ik8Var.mo2878j(118, lessonEntity.m7711r());
                break;
        }
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: s */
    public final String mo16669s() {
        switch (this.f53521p) {
            case 0:
                return "UPDATE `TranslationSentenceEntity` SET `index` = ?,`lessonId` = ?,`audio` = ?,`audioEnd` = ?,`text` = ?,`translations` = ?,`notes` = ? WHERE `index` = ? AND `lessonId` = ?";
            case 1:
                return "UPDATE `LessonSentenceEntity` SET `lessonId` = ?,`tokens` = ?,`text` = ?,`normalizedText` = ?,`index` = ?,`timestamp` = ?,`startParagraph` = ?,`url` = ?,`opentag` = ? WHERE `lessonId` = ? AND `index` = ?";
            case 2:
                return "UPDATE OR ABORT `LessonEntity` SET `id` = ?,`url` = ?,`pos` = ?,`title` = ?,`description` = ?,`pubDate` = ?,`imageUrl` = ?,`audioUrl` = ?,`duration` = ?,`status` = ?,`sharedDate` = ?,`originalUrl` = ?,`wordCount` = ?,`uniqueWordCount` = ?,`rosesCount` = ?,`lessonRating` = ?,`audioRating` = ?,`collectionId` = ?,`collectionTitle` = ?,`classicUrl` = ?,`sourceType` = ?,`sourceName` = ?,`sourceUrl` = ?,`previousLessonId` = ?,`nextLessonId` = ?,`readTimes` = ?,`listenTimes` = ?,`isCompleted` = ?,`newWordsCount` = ?,`cardsCount` = ?,`isRoseGiven` = ?,`giveRoseUrl` = ?,`price` = ?,`opened` = ?,`percentCompleted` = ?,`lastRoseReceived` = ?,`isFavorite` = ?,`printUrl` = ?,`videoUrl` = ?,`exercises` = ?,`notes` = ?,`viewsCount` = ?,`providerName` = ?,`providerDescription` = ?,`originalImageUrl` = ?,`providerImageUrl` = ?,`sharedById` = ?,`sharedByName` = ?,`sharedByImageUrl` = ?,`sharedByRole` = ?,`isSharedByIsFriend` = ?,`isCanEdit` = ?,`canEditSentence` = ?,`lessonVotes` = ?,`audioVotes` = ?,`level` = ?,`tags` = ?,`audioPending` = ?,`isLocked` = ?,`lastOpenTime` = ?,`userLiked_username` = ?,`userLiked_liked` = ?,`userCompleted_username` = ?,`userCompleted_completed` = ?,`translation_language` = ?,`translation_sentences` = ?,`nextLesson_id` = ?,`nextLesson_price` = ?,`nextLesson_collectionTitle` = ?,`nextLesson_isTaken` = ?,`nextLesson_sharedById` = ?,`nextLesson_status` = ?,`nextLesson_title` = ?,`nextLesson_image` = ?,`nextLesson_duration` = ?,`nextLesson_source` = ?,`nextLesson_url` = ?,`previousLesson_id` = ?,`previousLesson_price` = ?,`previousLesson_collectionTitle` = ?,`previousLesson_isTaken` = ?,`previousLesson_sharedById` = ?,`previousLesson_status` = ?,`previousLesson_title` = ?,`previousLesson_image` = ?,`previousLesson_duration` = ?,`previousLesson_source` = ?,`previousLesson_url` = ?,`promoted_course_ctaText` = ?,`promoted_course_description` = ?,`promoted_course_ctaUrl` = ?,`simplified_to_status` = ?,`simplified_to_isLocked` = ?,`simplified_to_id` = ?,`simplified_by_status` = ?,`simplified_by_isLocked` = ?,`simplified_by_id` = ?,`metadata_importLesson` = ?,`metadata_importMethod` = ?,`metadata_splittingMethod` = ? WHERE `id` = ?";
            case 3:
                return "UPDATE OR ABORT `LessonEntity` SET `id` = ?,`url` = ?,`pos` = ?,`title` = ?,`description` = ?,`pubDate` = ?,`imageUrl` = ?,`audioUrl` = ?,`duration` = ?,`status` = ?,`sharedDate` = ?,`originalUrl` = ?,`wordCount` = ?,`uniqueWordCount` = ?,`rosesCount` = ?,`lessonRating` = ?,`audioRating` = ?,`collectionId` = ?,`collectionTitle` = ?,`classicUrl` = ?,`sourceType` = ?,`sourceName` = ?,`sourceUrl` = ?,`previousLessonId` = ?,`nextLessonId` = ?,`readTimes` = ?,`listenTimes` = ?,`isCompleted` = ?,`newWordsCount` = ?,`cardsCount` = ?,`isRoseGiven` = ?,`giveRoseUrl` = ?,`price` = ?,`opened` = ?,`percentCompleted` = ?,`lastRoseReceived` = ?,`isFavorite` = ?,`printUrl` = ?,`videoUrl` = ?,`exercises` = ?,`notes` = ?,`viewsCount` = ?,`providerName` = ?,`providerDescription` = ?,`originalImageUrl` = ?,`providerImageUrl` = ?,`sharedById` = ?,`sharedByName` = ?,`sharedByImageUrl` = ?,`sharedByRole` = ?,`isSharedByIsFriend` = ?,`isCanEdit` = ?,`lessonVotes` = ?,`audioVotes` = ?,`level` = ?,`tags` = ?,`difficulty` = ?,`isTaken` = ?,`folders` = ?,`audioPending` = ?,`isLocked` = ?,`promoted_course_ctaText` = ?,`promoted_course_description` = ?,`promoted_course_ctaUrl` = ?,`simplified_to_status` = ?,`simplified_to_isLocked` = ?,`simplified_to_id` = ?,`simplified_by_status` = ?,`simplified_by_isLocked` = ?,`simplified_by_id` = ? WHERE `id` = ?";
            case 4:
                return "UPDATE OR ABORT `TranslationSentenceEntity` SET `index` = ?,`lessonId` = ?,`audio` = ?,`audioEnd` = ?,`text` = ?,`translations` = ?,`notes` = ? WHERE `index` = ? AND `lessonId` = ?";
            default:
                return "UPDATE `LessonEntity` SET `id` = ?,`type` = ?,`url` = ?,`pos` = ?,`title` = ?,`description` = ?,`pubDate` = ?,`imageUrl` = ?,`audioUrl` = ?,`duration` = ?,`status` = ?,`sharedDate` = ?,`originalUrl` = ?,`wordCount` = ?,`uniqueWordCount` = ?,`rosesCount` = ?,`lessonRating` = ?,`audioRating` = ?,`collectionId` = ?,`collectionTitle` = ?,`transliteration` = ?,`altScript` = ?,`classicUrl` = ?,`sourceType` = ?,`sourceName` = ?,`sourceUrl` = ?,`previousLessonId` = ?,`nextLessonId` = ?,`readTimes` = ?,`listenTimes` = ?,`isCompleted` = ?,`newWordsCount` = ?,`cardsCount` = ?,`isRoseGiven` = ?,`giveRoseUrl` = ?,`price` = ?,`opened` = ?,`percentCompleted` = ?,`lastRoseReceived` = ?,`isFavorite` = ?,`printUrl` = ?,`videoUrl` = ?,`exercises` = ?,`notes` = ?,`viewsCount` = ?,`providerId` = ?,`providerName` = ?,`providerDescription` = ?,`originalImageUrl` = ?,`providerImageUrl` = ?,`sharedById` = ?,`sharedByName` = ?,`sharedByImageUrl` = ?,`sharedByRole` = ?,`isSharedByIsFriend` = ?,`isCanEdit` = ?,`canEditSentence` = ?,`isProtected` = ?,`lessonVotes` = ?,`audioVotes` = ?,`level` = ?,`tags` = ?,`progressDownloaded` = ?,`progress` = ?,`translationSentence` = ?,`mediaImageUrl` = ?,`mediaTitle` = ?,`ptime` = ?,`isPinned` = ?,`difficulty` = ?,`newWords` = ?,`lessonPreview` = ?,`isTaken` = ?,`folders` = ?,`audioPending` = ?,`isLocked` = ?,`lastOpenTime` = ?,`userLiked_username` = ?,`userLiked_liked` = ?,`userCompleted_username` = ?,`userCompleted_completed` = ?,`translation_language` = ?,`translation_sentences` = ?,`nextLesson_id` = ?,`nextLesson_price` = ?,`nextLesson_collectionTitle` = ?,`nextLesson_isTaken` = ?,`nextLesson_sharedById` = ?,`nextLesson_status` = ?,`nextLesson_title` = ?,`nextLesson_image` = ?,`nextLesson_duration` = ?,`nextLesson_source` = ?,`nextLesson_url` = ?,`previousLesson_id` = ?,`previousLesson_price` = ?,`previousLesson_collectionTitle` = ?,`previousLesson_isTaken` = ?,`previousLesson_sharedById` = ?,`previousLesson_status` = ?,`previousLesson_title` = ?,`previousLesson_image` = ?,`previousLesson_duration` = ?,`previousLesson_source` = ?,`previousLesson_url` = ?,`promoted_course_ctaText` = ?,`promoted_course_description` = ?,`promoted_course_ctaUrl` = ?,`simplified_to_status` = ?,`simplified_to_isLocked` = ?,`simplified_to_id` = ?,`simplified_by_status` = ?,`simplified_by_isLocked` = ?,`simplified_by_id` = ?,`metadata_importLesson` = ?,`metadata_importMethod` = ?,`metadata_splittingMethod` = ? WHERE `id` = ?";
        }
    }
}
