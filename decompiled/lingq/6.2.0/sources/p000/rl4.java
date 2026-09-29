package p000;

import com.lingq.core.database.entity.LanguageCardsTagsEntity;
import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.domain.model.language.LanguageContextNotification;

/* JADX INFO: loaded from: classes.dex */
public final class rl4 extends r46 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ ul4 f59470A;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f59471z;

    public /* synthetic */ rl4(ul4 ul4Var, int i) {
        this.f59471z = i;
        this.f59470A = ul4Var;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo17164l(ik8 ik8Var, Object obj) {
        int i = this.f59471z;
        ul4 ul4Var = this.f59470A;
        switch (i) {
            case 0:
                LanguageContextEntity languageContextEntity = (LanguageContextEntity) obj;
                ik8Var.getClass();
                languageContextEntity.getClass();
                ik8Var.mo2874C(1, languageContextEntity.f17149a);
                ik8Var.mo2878j(2, languageContextEntity.f17150b);
                String str = languageContextEntity.f17151c;
                if (str == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, str);
                }
                ik8Var.mo2878j(4, languageContextEntity.f17152d);
                qn3 qn3Var = ul4Var.f64044M;
                String strM20079y = qn3Var.m20079y(languageContextEntity.f17153e);
                if (strM20079y == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM20079y);
                }
                Boolean bool = languageContextEntity.f17156h;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2878j(6, numValueOf.intValue());
                }
                String str2 = languageContextEntity.f17157i;
                if (str2 == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, str2);
                }
                Integer num = languageContextEntity.f17158j;
                if (num == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2878j(8, num.intValue());
                }
                ik8Var.mo2878j(9, languageContextEntity.f17159k);
                String strM20079y2 = qn3Var.m20079y(languageContextEntity.f17160l);
                if (strM20079y2 == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, strM20079y2);
                }
                Boolean bool2 = languageContextEntity.f17161m;
                Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    ik8Var.mo2880m(11);
                } else {
                    ik8Var.mo2878j(11, numValueOf2.intValue());
                }
                String str3 = languageContextEntity.f17162n;
                if (str3 == null) {
                    ik8Var.mo2880m(12);
                } else {
                    ik8Var.mo2874C(12, str3);
                }
                String str4 = languageContextEntity.f17163o;
                if (str4 == null) {
                    ik8Var.mo2880m(13);
                } else {
                    ik8Var.mo2874C(13, str4);
                }
                Integer num2 = languageContextEntity.f17164p;
                if (num2 == null) {
                    ik8Var.mo2880m(14);
                } else {
                    ik8Var.mo2878j(14, num2.intValue());
                }
                String str5 = languageContextEntity.f17165q;
                if (str5 == null) {
                    ik8Var.mo2880m(15);
                } else {
                    ik8Var.mo2874C(15, str5);
                }
                String strM20079y3 = qn3Var.m20079y(languageContextEntity.f17166r);
                if (strM20079y3 == null) {
                    ik8Var.mo2880m(16);
                } else {
                    ik8Var.mo2874C(16, strM20079y3);
                }
                Boolean bool3 = languageContextEntity.f17167s;
                Integer numValueOf3 = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
                if (numValueOf3 == null) {
                    ik8Var.mo2880m(17);
                } else {
                    ik8Var.mo2878j(17, numValueOf3.intValue());
                }
                LanguageContextNotification languageContextNotification = languageContextEntity.f17154f;
                if (languageContextNotification != null) {
                    ik8Var.mo2874C(18, languageContextNotification.f19044a);
                    ik8Var.mo2874C(19, languageContextNotification.f19045b);
                } else {
                    ik8Var.mo2880m(18);
                    ik8Var.mo2880m(19);
                }
                LanguageContextNotification languageContextNotification2 = languageContextEntity.f17155g;
                if (languageContextNotification2 == null) {
                    ik8Var.mo2880m(20);
                    ik8Var.mo2880m(21);
                } else {
                    ik8Var.mo2874C(20, languageContextNotification2.f19044a);
                    ik8Var.mo2874C(21, languageContextNotification2.f19045b);
                }
                break;
            default:
                LanguageCardsTagsEntity languageCardsTagsEntity = (LanguageCardsTagsEntity) obj;
                ik8Var.getClass();
                languageCardsTagsEntity.getClass();
                ik8Var.mo2874C(1, languageCardsTagsEntity.m7593a());
                String strM20079y4 = ul4Var.f64044M.m20079y(languageCardsTagsEntity.m7594b());
                if (strM20079y4 != null) {
                    ik8Var.mo2874C(2, strM20079y4);
                } else {
                    ik8Var.mo2880m(2);
                }
                break;
        }
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: s */
    public final String mo17165s() {
        switch (this.f59471z) {
            case 0:
                return "INSERT INTO `LanguageContextEntity` (`code`,`pk`,`url`,`repetitionLingQs`,`lotdDates`,`isUseFeed`,`intense`,`streakGoal`,`streakDays`,`tags`,`supported`,`title`,`lastUsed`,`knownWords`,`grammarResourceSlug`,`feedLevels`,`scheduledForDeletion`,`email_lotd`,`email_weekly`,`site_lotd`,`site_weekly`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT INTO `LanguageCardsTagsEntity` (`code`,`tags`) VALUES (?,?)";
        }
    }
}
