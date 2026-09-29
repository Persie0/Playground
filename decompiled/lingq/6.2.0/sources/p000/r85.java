package p000;

import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.entity.LibraryShelfEntity;
import com.lingq.core.domain.model.library.LibraryTab;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r85 extends r46 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ C1321i f58877A;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f58878z;

    public /* synthetic */ r85(C1321i c1321i, int i) {
        this.f58878z = i;
        this.f58877A = c1321i;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo17164l(ik8 ik8Var, Object obj) {
        Integer numValueOf;
        int i = this.f58878z;
        C1321i c1321i = this.f58877A;
        switch (i) {
            case 0:
                u85 u85Var = (u85) obj;
                qn3 qn3Var = c1321i.f17038O;
                ik8Var.getClass();
                u85Var.getClass();
                ik8Var.mo2878j(1, u85Var.f63562a);
                ik8Var.mo2874C(2, u85Var.f63563b);
                String str = u85Var.f63564c;
                if (str == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, str);
                }
                String str2 = u85Var.f63565d;
                if (str2 == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, str2);
                }
                ik8Var.mo2878j(5, u85Var.f63566e);
                String str3 = u85Var.f63567f;
                if (str3 == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, str3);
                }
                String str4 = u85Var.f63568g;
                if (str4 == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, str4);
                }
                String str5 = u85Var.f63569h;
                if (str5 == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, str5);
                }
                String str6 = u85Var.f63570i;
                if (str6 == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2874C(9, str6);
                }
                String str7 = u85Var.f63571j;
                if (str7 == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, str7);
                }
                Integer num = u85Var.f63572k;
                if (num == null) {
                    ik8Var.mo2880m(11);
                } else {
                    ik8Var.mo2878j(11, num.intValue());
                }
                String str8 = u85Var.f63573l;
                if (str8 == null) {
                    ik8Var.mo2880m(12);
                } else {
                    ik8Var.mo2874C(12, str8);
                }
                String str9 = u85Var.f63574m;
                if (str9 == null) {
                    ik8Var.mo2880m(13);
                } else {
                    ik8Var.mo2874C(13, str9);
                }
                String str10 = u85Var.f63575n;
                if (str10 == null) {
                    ik8Var.mo2880m(14);
                } else {
                    ik8Var.mo2874C(14, str10);
                }
                String str11 = u85Var.f63576o;
                if (str11 == null) {
                    ik8Var.mo2880m(15);
                } else {
                    ik8Var.mo2874C(15, str11);
                }
                String str12 = u85Var.f63577p;
                if (str12 == null) {
                    ik8Var.mo2880m(16);
                } else {
                    ik8Var.mo2874C(16, str12);
                }
                String str13 = u85Var.f63578q;
                if (str13 == null) {
                    ik8Var.mo2880m(17);
                } else {
                    ik8Var.mo2874C(17, str13);
                }
                String str14 = u85Var.f63579r;
                if (str14 == null) {
                    ik8Var.mo2880m(18);
                } else {
                    ik8Var.mo2874C(18, str14);
                }
                String str15 = u85Var.f63580s;
                if (str15 == null) {
                    ik8Var.mo2880m(19);
                } else {
                    ik8Var.mo2874C(19, str15);
                }
                String str16 = u85Var.f63581t;
                if (str16 == null) {
                    ik8Var.mo2880m(20);
                } else {
                    ik8Var.mo2874C(20, str16);
                }
                ik8Var.mo2878j(21, u85Var.f63582u);
                ik8Var.mo2878j(22, u85Var.f63583v);
                String str17 = u85Var.f63584w;
                if (str17 == null) {
                    ik8Var.mo2880m(23);
                } else {
                    ik8Var.mo2874C(23, str17);
                }
                ik8Var.mo2878j(24, u85Var.f63585x);
                ik8Var.mo2878j(25, u85Var.f63586y);
                ik8Var.mo2878j(26, u85Var.f63587z);
                Integer num2 = u85Var.f63539A;
                if (num2 == null) {
                    ik8Var.mo2880m(27);
                } else {
                    ik8Var.mo2878j(27, num2.intValue());
                }
                Integer num3 = u85Var.f63540B;
                if (num3 == null) {
                    ik8Var.mo2880m(28);
                } else {
                    ik8Var.mo2878j(28, num3.intValue());
                }
                String str18 = u85Var.f63541C;
                if (str18 == null) {
                    ik8Var.mo2880m(29);
                } else {
                    ik8Var.mo2874C(29, str18);
                }
                ik8Var.mo2877g(30, u85Var.f63542D);
                ik8Var.mo2878j(31, u85Var.f63543E ? 1L : 0L);
                String strM20079y = qn3Var.m20079y(u85Var.f63544F);
                if (strM20079y == null) {
                    ik8Var.mo2880m(32);
                } else {
                    ik8Var.mo2874C(32, strM20079y);
                }
                String str19 = u85Var.f63545G;
                if (str19 == null) {
                    ik8Var.mo2880m(33);
                } else {
                    ik8Var.mo2874C(33, str19);
                }
                String strM20079y2 = qn3Var.m20079y(u85Var.f63546H);
                if (strM20079y2 == null) {
                    ik8Var.mo2880m(34);
                } else {
                    ik8Var.mo2874C(34, strM20079y2);
                }
                Float f = u85Var.f63547I;
                if (f == null) {
                    ik8Var.mo2880m(35);
                } else {
                    ik8Var.mo2877g(35, f.floatValue());
                }
                Boolean bool = u85Var.f63548J;
                Integer numValueOf2 = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    ik8Var.mo2880m(36);
                } else {
                    ik8Var.mo2878j(36, numValueOf2.intValue());
                }
                ik8Var.mo2874C(37, u85Var.f63549K);
                String str20 = u85Var.f63550L;
                if (str20 == null) {
                    ik8Var.mo2880m(38);
                } else {
                    ik8Var.mo2874C(38, str20);
                }
                String str21 = u85Var.f63551M;
                if (str21 == null) {
                    ik8Var.mo2880m(39);
                } else {
                    ik8Var.mo2874C(39, str21);
                }
                ik8Var.mo2877g(40, u85Var.f63552N);
                ik8Var.mo2877g(41, u85Var.f63553O);
                ik8Var.mo2878j(42, u85Var.f63554P ? 1L : 0L);
                ik8Var.mo2878j(43, u85Var.f63555Q ? 1L : 0L);
                String str22 = u85Var.f63556R;
                if (str22 == null) {
                    ik8Var.mo2880m(44);
                } else {
                    ik8Var.mo2874C(44, str22);
                }
                String str23 = u85Var.f63557S;
                if (str23 == null) {
                    ik8Var.mo2880m(45);
                } else {
                    ik8Var.mo2874C(45, str23);
                }
                String str24 = u85Var.f63558T;
                if (str24 == null) {
                    ik8Var.mo2880m(46);
                } else {
                    ik8Var.mo2874C(46, str24);
                }
                Boolean bool2 = u85Var.f63559U;
                numValueOf = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ik8Var.mo2880m(47);
                } else {
                    ik8Var.mo2878j(47, numValueOf.intValue());
                }
                String str25 = u85Var.f63560V;
                if (str25 == null) {
                    ik8Var.mo2880m(48);
                } else {
                    ik8Var.mo2874C(48, str25);
                }
                ik8Var.mo2878j(49, u85Var.f63561W ? 1L : 0L);
                break;
            default:
                LibraryShelfEntity libraryShelfEntity = (LibraryShelfEntity) obj;
                ik8Var.getClass();
                libraryShelfEntity.getClass();
                ik8Var.mo2874C(1, libraryShelfEntity.f17381a);
                ik8Var.mo2874C(2, libraryShelfEntity.f17382b);
                Boolean bool3 = libraryShelfEntity.f17383c;
                Integer numValueOf3 = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
                if (numValueOf3 == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2878j(3, numValueOf3.intValue());
                }
                Boolean bool4 = libraryShelfEntity.f17384d;
                numValueOf = bool4 != null ? Integer.valueOf(bool4.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2878j(4, numValueOf.intValue());
                }
                qn3 qn3Var2 = c1321i.f17038O;
                List list = libraryShelfEntity.f17385e;
                qn3Var2.getClass();
                list.getClass();
                yf4 yf4Var = (yf4) qn3Var2.f57974a;
                yf4Var.getClass();
                ik8Var.mo2874C(5, yf4Var.m10322b(new C2978ev(LibraryTab.Companion.serializer()), list));
                ik8Var.mo2874C(6, libraryShelfEntity.f17386f);
                ik8Var.mo2878j(7, libraryShelfEntity.f17387g);
                ik8Var.mo2874C(8, libraryShelfEntity.f17388h);
                ik8Var.mo2878j(9, libraryShelfEntity.f17389i);
                ik8Var.mo2874C(10, libraryShelfEntity.f17390j);
                ik8Var.mo2874C(11, libraryShelfEntity.f17391k);
                break;
        }
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: s */
    public final String mo17165s() {
        switch (this.f58878z) {
            case 0:
                return "INSERT INTO `LibraryDataEntity` (`id`,`type`,`title`,`description`,`pos`,`url`,`sourceType`,`sourceName`,`sourceUrl`,`imageUrl`,`providerId`,`providerName`,`providerDescription`,`originalImageUrl`,`providerImageUrl`,`sharedById`,`sharedByName`,`sharedByImageUrl`,`sharedByRole`,`level`,`newWordsCount`,`lessonsCount`,`owner`,`price`,`cardsCount`,`rosesCount`,`duration`,`collectionId`,`collectionTitle`,`difficulty`,`isAvailable`,`tags`,`status`,`folders`,`progress`,`isTaken`,`lessonPreview`,`accent`,`audioUrl`,`listenTimes`,`readTimes`,`isCompleted`,`isFavorite`,`videoUrl`,`isLocked`,`lessonsSortBy`,`isSubscribed`,`originalUrl`,`isArchived`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT INTO `LibraryShelfEntity` (`codeWithLanguage`,`language`,`pinned`,`pinnedHard`,`tabs`,`code`,`id`,`title`,`order`,`levels`,`originalTitle`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
