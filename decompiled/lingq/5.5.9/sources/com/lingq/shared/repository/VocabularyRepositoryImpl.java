package com.lingq.shared.repository;

import ae.C0062b;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.room.RoomDatabaseKt;
import bi.AbstractC1413d0;
import bi.AbstractC1495o1;
import bi.AbstractC1520r5;
import ci.InterfaceC2025r;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.result.ResultVocabularyCard;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.CardExtendedStatus;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.ExportType;
import com.lingq.shared.uimodel.vocabulary.VocabularySearch;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import com.lingq.shared.uimodel.vocabulary.VocabularySort;
import dm.C5207g;
import dm.C5212l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jp.C6553u;
import kotlin.Triple;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import mo.C7661i;
import ni.C7793a;
import org.joda.time.DateTime;
import p003a2.C0009a;
import p076di.InterfaceC5182d;
import p096ei.C5408a;
import p260m8.C7499b;
import p264mi.C7563c;
import p264mi.C7566f;
import p288o4.C7915a;
import p385sf.C9000b;
import p460wh.InterfaceC9933a;
import p464wl.InterfaceC9968c;
import so.AbstractC9107y;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class VocabularyRepositoryImpl implements InterfaceC2025r {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f20617a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1520r5 f20618b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1413d0 f20619c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1495o1 f20620d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9933a f20621e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5182d f20622f;

    public VocabularyRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1520r5 abstractC1520r5, AbstractC1413d0 abstractC1413d0, AbstractC1495o1 abstractC1495o1, InterfaceC9933a interfaceC9933a, InterfaceC5182d interfaceC5182d) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1520r5, "vocabularyCardDao");
        C5207g.m11111f(abstractC1413d0, "courseDao");
        C5207g.m11111f(abstractC1495o1, "lessonDao");
        C5207g.m11111f(interfaceC9933a, "cardService");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        this.f20617a = lingQDatabase;
        this.f20618b = abstractC1520r5;
        this.f20619c = abstractC1413d0;
        this.f20620d = abstractC1495o1;
        this.f20621e = interfaceC9933a;
        this.f20622f = interfaceC5182d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r6v17, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2025r
    /* JADX INFO: renamed from: a */
    public final Serializable mo6179a(String str, ArrayList arrayList, ExportType exportType, InterfaceC9968c interfaceC9968c) throws Throwable {
        VocabularyRepositoryImpl$networkExportCards$1 vocabularyRepositoryImpl$networkExportCards$1;
        if (interfaceC9968c instanceof VocabularyRepositoryImpl$networkExportCards$1) {
            vocabularyRepositoryImpl$networkExportCards$1 = (VocabularyRepositoryImpl$networkExportCards$1) interfaceC9968c;
            int i10 = vocabularyRepositoryImpl$networkExportCards$1.f20652f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$networkExportCards$1.f20652f = i10 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$networkExportCards$1 = new VocabularyRepositoryImpl$networkExportCards$1(this, interfaceC9968c);
            }
        } else {
            vocabularyRepositoryImpl$networkExportCards$1 = new VocabularyRepositoryImpl$networkExportCards$1(this, interfaceC9968c);
        }
        Object objM18420e = vocabularyRepositoryImpl$networkExportCards$1.f20650d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = vocabularyRepositoryImpl$networkExportCards$1.f20652f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(objM18420e);
                InterfaceC9933a interfaceC9933a = this.f20621e;
                String lowerCase = exportType.name().toLowerCase(Locale.ROOT);
                C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                vocabularyRepositoryImpl$networkExportCards$1.f20652f = 1;
                objM18420e = interfaceC9933a.m18420e(str, arrayList, lowerCase, vocabularyRepositoryImpl$networkExportCards$1);
                if (objM18420e == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18420e);
            }
            return ((AbstractC9107y) objM18420e).m17354a();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // ci.InterfaceC2025r
    /* JADX INFO: renamed from: b */
    public final Object mo6180b(String str, List list, InterfaceC9968c interfaceC9968c) {
        return this.f20618b.mo5172q0(list, CardStatus.New.getValue(), CardStatus.Learned.getValue(), str, interfaceC9968c);
    }

    @Override // ci.InterfaceC2025r
    /* JADX INFO: renamed from: c */
    public final Object mo6181c(List<String> list, CardStatus cardStatus, InterfaceC9968c<? super List<C7566f>> interfaceC9968c) {
        return this.f20618b.mo5170o0(list, CardStatus.New.getValue(), cardStatus.getValue(), interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0309  */
    /* JADX WARN: Code duplicated, block: B:110:0x0334  */
    /* JADX WARN: Code duplicated, block: B:114:0x0347  */
    /* JADX WARN: Code duplicated, block: B:116:0x0353  */
    /* JADX WARN: Code duplicated, block: B:117:0x035c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0368  */
    /* JADX WARN: Code duplicated, block: B:120:0x036b  */
    /* JADX WARN: Code duplicated, block: B:124:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0141  */
    /* JADX WARN: Code duplicated, block: B:35:0x0180  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:45:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0201  */
    /* JADX WARN: Code duplicated, block: B:51:0x020f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0222  */
    /* JADX WARN: Code duplicated, block: B:55:0x023d  */
    /* JADX WARN: Code duplicated, block: B:56:0x023f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0242  */
    /* JADX WARN: Code duplicated, block: B:60:0x0250  */
    /* JADX WARN: Code duplicated, block: B:61:0x0257  */
    /* JADX WARN: Code duplicated, block: B:63:0x0263  */
    /* JADX WARN: Code duplicated, block: B:64:0x026a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0278  */
    /* JADX WARN: Code duplicated, block: B:67:0x027d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0289  */
    /* JADX WARN: Code duplicated, block: B:70:0x0290  */
    /* JADX WARN: Code duplicated, block: B:71:0x0295  */
    /* JADX WARN: Code duplicated, block: B:73:0x0299  */
    /* JADX WARN: Code duplicated, block: B:74:0x029c  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:79:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:96:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f7  */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x02aa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x02bd, please report this as an issue */
    @Override // ci.InterfaceC2025r
    /* JADX INFO: renamed from: d */
    public final Object mo6182d(String str, int i10, String str2, boolean z10, boolean z11, String str3, int i11, InterfaceC9968c<? super InterfaceC7116c<? extends List<C7563c>>> interfaceC9968c) throws Throwable {
        VocabularyRepositoryImpl$observableVocabulary$1 vocabularyRepositoryImpl$observableVocabulary$1;
        String str4;
        boolean z12;
        int i12;
        boolean z13;
        String str5;
        VocabularyRepositoryImpl vocabularyRepositoryImpl;
        String string;
        int i13;
        VocabularySearchQuery vocabularySearchQuery;
        VocabularySearchQuery vocabularySearchQuery2;
        boolean z14;
        String str6;
        int i14;
        VocabularyRepositoryImpl vocabularyRepositoryImpl2;
        int i15;
        LinkedHashMap linkedHashMapM13467T0;
        InterfaceC5182d interfaceC5182d;
        int i16;
        boolean z15;
        boolean z16;
        int i17;
        VocabularySearchQuery vocabularySearchQuery3;
        String str7;
        String str8;
        String str9;
        VocabularyRepositoryImpl vocabularyRepositoryImpl3;
        int i18;
        int i19;
        String roomColumnName;
        String columnName;
        Integer num;
        Integer num2;
        List<String> list;
        int i20;
        String strM15254T2;
        ArrayList arrayList;
        String str10;
        String str11;
        CardStatus cardStatus;
        int i21;
        int i22;
        String strM768o;
        int i23;
        boolean z17;
        String strM611g;
        String str12;
        String str13;
        String str14;
        String str15;
        boolean z18;
        boolean zM11106a;
        String str16;
        String strM611g2;
        int i24;
        String str17;
        String str18;
        if (interfaceC9968c instanceof VocabularyRepositoryImpl$observableVocabulary$1) {
            vocabularyRepositoryImpl$observableVocabulary$1 = (VocabularyRepositoryImpl$observableVocabulary$1) interfaceC9968c;
            int i25 = vocabularyRepositoryImpl$observableVocabulary$1.f20684J;
            if ((i25 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$observableVocabulary$1.f20684J = i25 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$observableVocabulary$1 = new VocabularyRepositoryImpl$observableVocabulary$1(this, interfaceC9968c);
            }
        } else {
            vocabularyRepositoryImpl$observableVocabulary$1 = new VocabularyRepositoryImpl$observableVocabulary$1(this, interfaceC9968c);
        }
        Object objM14360a = vocabularyRepositoryImpl$observableVocabulary$1.f20682H;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i26 = vocabularyRepositoryImpl$observableVocabulary$1.f20684J;
        if (i26 != 0) {
            if (i26 == 1) {
                int i27 = vocabularyRepositoryImpl$observableVocabulary$1.f20691j;
                z13 = vocabularyRepositoryImpl$observableVocabulary$1.f20693l;
                boolean z19 = vocabularyRepositoryImpl$observableVocabulary$1.f20692k;
                i13 = vocabularyRepositoryImpl$observableVocabulary$1.f20690i;
                string = vocabularyRepositoryImpl$observableVocabulary$1.f20688g;
                String str19 = vocabularyRepositoryImpl$observableVocabulary$1.f20687f;
                str5 = vocabularyRepositoryImpl$observableVocabulary$1.f20686e;
                VocabularyRepositoryImpl vocabularyRepositoryImpl4 = vocabularyRepositoryImpl$observableVocabulary$1.f20685d;
                C7499b.m14977z0(objM14360a);
                i12 = i27;
                vocabularyRepositoryImpl = vocabularyRepositoryImpl4;
                z12 = z19;
                str4 = str19;
            } else if (i26 == 2) {
                i15 = vocabularyRepositoryImpl$observableVocabulary$1.f20691j;
                z13 = vocabularyRepositoryImpl$observableVocabulary$1.f20693l;
                z14 = vocabularyRepositoryImpl$observableVocabulary$1.f20692k;
                i14 = vocabularyRepositoryImpl$observableVocabulary$1.f20690i;
                vocabularySearchQuery2 = vocabularyRepositoryImpl$observableVocabulary$1.f20689h;
                string = vocabularyRepositoryImpl$observableVocabulary$1.f20688g;
                str6 = vocabularyRepositoryImpl$observableVocabulary$1.f20687f;
                str5 = vocabularyRepositoryImpl$observableVocabulary$1.f20686e;
                vocabularyRepositoryImpl2 = vocabularyRepositoryImpl$observableVocabulary$1.f20685d;
                C7499b.m14977z0(objM14360a);
                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
                linkedHashMapM13467T0.put(str5, vocabularySearchQuery2);
                interfaceC5182d = vocabularyRepositoryImpl2.f20622f;
                vocabularyRepositoryImpl$observableVocabulary$1.f20685d = vocabularyRepositoryImpl2;
                vocabularyRepositoryImpl$observableVocabulary$1.f20686e = str5;
                vocabularyRepositoryImpl$observableVocabulary$1.f20687f = str6;
                vocabularyRepositoryImpl$observableVocabulary$1.f20688g = string;
                vocabularyRepositoryImpl$observableVocabulary$1.f20689h = vocabularySearchQuery2;
                vocabularyRepositoryImpl$observableVocabulary$1.f20690i = i14;
                vocabularyRepositoryImpl$observableVocabulary$1.f20692k = z14;
                vocabularyRepositoryImpl$observableVocabulary$1.f20693l = z13;
                vocabularyRepositoryImpl$observableVocabulary$1.f20691j = i15;
                vocabularyRepositoryImpl$observableVocabulary$1.f20684J = 3;
                if (interfaceC5182d.mo9694r(linkedHashMapM13467T0, vocabularyRepositoryImpl$observableVocabulary$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i16 = i15;
                z15 = z13;
                z16 = z14;
                i17 = i14;
                vocabularySearchQuery3 = vocabularySearchQuery2;
                str7 = string;
                str8 = str6;
                str9 = str5;
                vocabularyRepositoryImpl3 = vocabularyRepositoryImpl2;
            } else {
                if (i26 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i16 = vocabularyRepositoryImpl$observableVocabulary$1.f20691j;
                z15 = vocabularyRepositoryImpl$observableVocabulary$1.f20693l;
                z16 = vocabularyRepositoryImpl$observableVocabulary$1.f20692k;
                i17 = vocabularyRepositoryImpl$observableVocabulary$1.f20690i;
                vocabularySearchQuery3 = vocabularyRepositoryImpl$observableVocabulary$1.f20689h;
                str7 = vocabularyRepositoryImpl$observableVocabulary$1.f20688g;
                str8 = vocabularyRepositoryImpl$observableVocabulary$1.f20687f;
                str9 = vocabularyRepositoryImpl$observableVocabulary$1.f20686e;
                vocabularyRepositoryImpl3 = vocabularyRepositoryImpl$observableVocabulary$1.f20685d;
                C7499b.m14977z0(objM14360a);
            }
            i12 = i16;
            z12 = z16;
            vocabularySearchQuery = vocabularySearchQuery3;
            str5 = str9;
            z13 = z15;
            string = str7;
            str4 = str8;
            vocabularyRepositoryImpl = vocabularyRepositoryImpl3;
            i13 = i17;
            AbstractC1520r5 abstractC1520r5 = vocabularyRepositoryImpl.f20618b;
            String string2 = C7076b.m14277B3(str4).toString();
            i18 = vocabularySearchQuery.f22127a;
            i19 = vocabularySearchQuery.f22128b;
            roomColumnName = vocabularySearchQuery.f22131e.getRoomColumnName();
            columnName = vocabularySearchQuery.f22129c.getColumnName();
            num = vocabularySearchQuery.f22135i.f38013b;
            num2 = vocabularySearchQuery.f22136j.f38013b;
            list = vocabularySearchQuery.f22133g;
            if (i12 == -1) {
                i12 = vocabularySearchQuery.f22130d;
            }
            i20 = i13 - 1;
            abstractC1520r5.getClass();
            C5207g.m11111f(str5, "language");
            C5207g.m11111f(string2, "term");
            C5207g.m11111f(roomColumnName, "orderColumn");
            C5207g.m11111f(columnName, "criteria");
            strM15254T2 = C7661i.m15254T2(string2, "'", "''");
            if (string == null) {
                string = new DateTime().toString();
                C5207g.m11110e(string, "now().toString()");
            }
            arrayList = new ArrayList();
            if (num != null) {
                str10 = ",CourseAndCardsJoin";
            } else {
                str10 = "";
            }
            if (num2 != null) {
                str11 = ",LessonsAndCardsJoin";
            } else {
                str11 = "";
            }
            cardStatus = CardStatus.Known;
            String str20 = str10;
            String str21 = str11;
            if (i18 == cardStatus.getValue()) {
                i21 = i20;
                strM768o = C0009a.m20h("AND (Card.status == ", CardStatus.Learned.getValue(), " AND Card.extendedStatus == ", CardExtendedStatus.Known.getValue(), ")");
                i22 = i12;
            } else {
                i21 = i20;
                i22 = i12;
                if (i19 == cardStatus.getValue()) {
                    strM768o = C0166e.m768o(C0009a.m25n("AND (Card.status BETWEEN ", i18, " AND ", i19, " OR Card.extendedStatus == "), CardExtendedStatus.Known.getValue(), ")");
                } else {
                    strM768o = C0166e.m768o(C0009a.m25n("AND (Card.status BETWEEN ", i18, " AND ", i19, " AND (Card.extendedStatus = "), CardExtendedStatus.NotKnown.getValue(), " OR Card.extendedStatus is null))");
                }
            }
            i23 = 0;
            if (strM15254T2.length() > 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                strM611g = "";
            } else if (C5207g.m11106a(columnName, VocabularySearch.MeaningContaining.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.meaningTerms LIKE '%", strM15254T2, "%'");
            } else if (C5207g.m11106a(columnName, VocabularySearch.StartsWith.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.term LIKE '", strM15254T2, "%'");
            } else if (C5207g.m11106a(columnName, VocabularySearch.EndsWith.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.term LIKE '%", strM15254T2, "'");
            } else if (C5207g.m11106a(columnName, VocabularySearch.PhraseContaining.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.fragment LIKE '%", strM15254T2, "%'");
            } else {
                strM611g = C0141b.m611g("AND Card.term LIKE '%", strM15254T2, "%'");
            }
            if (z13) {
                str12 = "AND Card.isPhrase = 1";
            } else {
                str12 = "";
            }
            if (z12) {
                arrayList.add(string);
                str13 = "AND DATETIME(Card.srsDueDate) <= DATETIME(?)";
            } else {
                str13 = "";
            }
            if (num != null) {
                str14 = "AND Card.termWithLanguage = CourseAndCardsJoin.termWithLanguage AND CourseAndCardsJoin.pk = " + num;
            } else {
                str14 = "";
            }
            if (num2 != null) {
                str15 = "AND Card.termWithLanguage = LessonsAndCardsJoin.termWithLanguage AND LessonsAndCardsJoin.contentId = " + num2;
            } else {
                str15 = "";
            }
            if (list != null || list.isEmpty()) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                zM11106a = true;
                str16 = "";
            } else {
                str16 = "";
                for (Object obj : list) {
                    i24 = i23 + 1;
                    if (i23 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    String str22 = (String) obj;
                    if (i23 == 0) {
                        str17 = "AND (";
                    } else {
                        str17 = "";
                    }
                    if (i23 != C9000b.m17249o(list) || list.size() <= 1) {
                        str18 = ")";
                    } else {
                        str18 = " OR ";
                    }
                    str16 = ((Object) str16) + str17 + " Card.tags LIKE '%" + str22 + "%' " + str18;
                    i23 = i24;
                }
                zM11106a = true;
            }
            if (!C5207g.m11106a(roomColumnName, VocabularySort.Importance.getRoomColumnName())) {
                zM11106a = C5207g.m11106a(roomColumnName, VocabularySort.CreationDate.getRoomColumnName());
            }
            if (zM11106a) {
                strM611g2 = C0141b.m611g("ORDER BY ", roomColumnName, " DESC");
            } else if (C5207g.m11106a(roomColumnName, VocabularySort.Status.getRoomColumnName())) {
                strM611g2 = "ORDER BY Card.status ASC,Card.importance DESC, Card.term";
            } else {
                strM611g2 = C0141b.m611g("ORDER BY Card.", roomColumnName, " ASC");
            }
            StringBuilder sbM855o = C0204c.m855o("\n        SELECT Card.* FROM Card\n        ", str20, "\n        ", str21, "\n        WHERE Card.termWithLanguage LIKE '");
            C0166e.m777x(sbM855o, str5, "' || '\\_%' ESCAPE '\\'\n        ", strM768o, "\n        ");
            C0166e.m777x(sbM855o, strM611g, "\n        ", str12, "\n        ");
            C0166e.m777x(sbM855o, str13, "\n    ", str14, "\n    ");
            C0166e.m777x(sbM855o, str15, "\n    ", str16, "\n        ");
            sbM855o.append(strM611g2);
            sbM855o.append("\n        LIMIT ");
            sbM855o.append(i22);
            sbM855o.append(" OFFSET ");
            return C0062b.m273H0(abstractC1520r5.mo5169n0(new C7915a(C0166e.m768o(sbM855o, i21 * i22, "\n    "), arrayList.toArray())));
        }
        C7499b.m14977z0(objM14360a);
        InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = this.f20622f.mo9685i();
        vocabularyRepositoryImpl$observableVocabulary$1.f20685d = this;
        vocabularyRepositoryImpl$observableVocabulary$1.f20686e = str;
        str4 = str2;
        vocabularyRepositoryImpl$observableVocabulary$1.f20687f = str4;
        vocabularyRepositoryImpl$observableVocabulary$1.f20688g = str3;
        vocabularyRepositoryImpl$observableVocabulary$1.f20690i = i10;
        z12 = z10;
        vocabularyRepositoryImpl$observableVocabulary$1.f20692k = z12;
        vocabularyRepositoryImpl$observableVocabulary$1.f20693l = z11;
        i12 = i11;
        vocabularyRepositoryImpl$observableVocabulary$1.f20691j = i12;
        vocabularyRepositoryImpl$observableVocabulary$1.f20684J = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i, vocabularyRepositoryImpl$observableVocabulary$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        z13 = z11;
        str5 = str;
        vocabularyRepositoryImpl = this;
        string = str3;
        i13 = i10;
        vocabularySearchQuery = (VocabularySearchQuery) ((Map) objM14360a).get(str5);
        if (vocabularySearchQuery == null) {
            VocabularySearchQuery vocabularySearchQuery4 = new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null);
            InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i2 = vocabularyRepositoryImpl.f20622f.mo9685i();
            vocabularyRepositoryImpl$observableVocabulary$1.f20685d = vocabularyRepositoryImpl;
            vocabularyRepositoryImpl$observableVocabulary$1.f20686e = str5;
            vocabularyRepositoryImpl$observableVocabulary$1.f20687f = str4;
            vocabularyRepositoryImpl$observableVocabulary$1.f20688g = string;
            vocabularyRepositoryImpl$observableVocabulary$1.f20689h = vocabularySearchQuery4;
            vocabularyRepositoryImpl$observableVocabulary$1.f20690i = i13;
            vocabularyRepositoryImpl$observableVocabulary$1.f20692k = z12;
            vocabularyRepositoryImpl$observableVocabulary$1.f20693l = z13;
            vocabularyRepositoryImpl$observableVocabulary$1.f20691j = i12;
            vocabularyRepositoryImpl$observableVocabulary$1.f20684J = 2;
            Object objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i2, vocabularyRepositoryImpl$observableVocabulary$1);
            if (objM14360a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            int i28 = i13;
            vocabularySearchQuery2 = vocabularySearchQuery4;
            objM14360a = objM14360a2;
            z14 = z12;
            str6 = str4;
            i14 = i28;
            int i29 = i12;
            vocabularyRepositoryImpl2 = vocabularyRepositoryImpl;
            i15 = i29;
            linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
            linkedHashMapM13467T0.put(str5, vocabularySearchQuery2);
            interfaceC5182d = vocabularyRepositoryImpl2.f20622f;
            vocabularyRepositoryImpl$observableVocabulary$1.f20685d = vocabularyRepositoryImpl2;
            vocabularyRepositoryImpl$observableVocabulary$1.f20686e = str5;
            vocabularyRepositoryImpl$observableVocabulary$1.f20687f = str6;
            vocabularyRepositoryImpl$observableVocabulary$1.f20688g = string;
            vocabularyRepositoryImpl$observableVocabulary$1.f20689h = vocabularySearchQuery2;
            vocabularyRepositoryImpl$observableVocabulary$1.f20690i = i14;
            vocabularyRepositoryImpl$observableVocabulary$1.f20692k = z14;
            vocabularyRepositoryImpl$observableVocabulary$1.f20693l = z13;
            vocabularyRepositoryImpl$observableVocabulary$1.f20691j = i15;
            vocabularyRepositoryImpl$observableVocabulary$1.f20684J = 3;
            if (interfaceC5182d.mo9694r(linkedHashMapM13467T0, vocabularyRepositoryImpl$observableVocabulary$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i16 = i15;
            z15 = z13;
            z16 = z14;
            i17 = i14;
            vocabularySearchQuery3 = vocabularySearchQuery2;
            str7 = string;
            str8 = str6;
            str9 = str5;
            vocabularyRepositoryImpl3 = vocabularyRepositoryImpl2;
            i12 = i16;
            z12 = z16;
            vocabularySearchQuery = vocabularySearchQuery3;
            str5 = str9;
            z13 = z15;
            string = str7;
            str4 = str8;
            vocabularyRepositoryImpl = vocabularyRepositoryImpl3;
            i13 = i17;
        }
        AbstractC1520r5 abstractC1520r6 = vocabularyRepositoryImpl.f20618b;
        String string3 = C7076b.m14277B3(str4).toString();
        i18 = vocabularySearchQuery.f22127a;
        i19 = vocabularySearchQuery.f22128b;
        roomColumnName = vocabularySearchQuery.f22131e.getRoomColumnName();
        columnName = vocabularySearchQuery.f22129c.getColumnName();
        num = vocabularySearchQuery.f22135i.f38013b;
        num2 = vocabularySearchQuery.f22136j.f38013b;
        list = vocabularySearchQuery.f22133g;
        if (i12 == -1) {
            i12 = vocabularySearchQuery.f22130d;
        }
        i20 = i13 - 1;
        abstractC1520r6.getClass();
        C5207g.m11111f(str5, "language");
        C5207g.m11111f(string3, "term");
        C5207g.m11111f(roomColumnName, "orderColumn");
        C5207g.m11111f(columnName, "criteria");
        strM15254T2 = C7661i.m15254T2(string3, "'", "''");
        if (string == null) {
            string = new DateTime().toString();
            C5207g.m11110e(string, "now().toString()");
        }
        arrayList = new ArrayList();
        if (num != null) {
            str10 = ",CourseAndCardsJoin";
        } else {
            str10 = "";
        }
        if (num2 != null) {
            str11 = ",LessonsAndCardsJoin";
        } else {
            str11 = "";
        }
        cardStatus = CardStatus.Known;
        String str23 = str10;
        String str24 = str11;
        if (i18 == cardStatus.getValue()) {
            i21 = i20;
            strM768o = C0009a.m20h("AND (Card.status == ", CardStatus.Learned.getValue(), " AND Card.extendedStatus == ", CardExtendedStatus.Known.getValue(), ")");
            i22 = i12;
        } else {
            i21 = i20;
            i22 = i12;
            if (i19 == cardStatus.getValue()) {
                strM768o = C0166e.m768o(C0009a.m25n("AND (Card.status BETWEEN ", i18, " AND ", i19, " OR Card.extendedStatus == "), CardExtendedStatus.Known.getValue(), ")");
            } else {
                strM768o = C0166e.m768o(C0009a.m25n("AND (Card.status BETWEEN ", i18, " AND ", i19, " AND (Card.extendedStatus = "), CardExtendedStatus.NotKnown.getValue(), " OR Card.extendedStatus is null))");
            }
        }
        i23 = 0;
        if (strM15254T2.length() > 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            strM611g = "";
        } else if (C5207g.m11106a(columnName, VocabularySearch.MeaningContaining.getColumnName())) {
            strM611g = C0141b.m611g("AND Card.meaningTerms LIKE '%", strM15254T2, "%'");
        } else if (C5207g.m11106a(columnName, VocabularySearch.StartsWith.getColumnName())) {
            strM611g = C0141b.m611g("AND Card.term LIKE '", strM15254T2, "%'");
        } else if (C5207g.m11106a(columnName, VocabularySearch.EndsWith.getColumnName())) {
            strM611g = C0141b.m611g("AND Card.term LIKE '%", strM15254T2, "'");
        } else if (C5207g.m11106a(columnName, VocabularySearch.PhraseContaining.getColumnName())) {
            strM611g = C0141b.m611g("AND Card.fragment LIKE '%", strM15254T2, "%'");
        } else {
            strM611g = C0141b.m611g("AND Card.term LIKE '%", strM15254T2, "%'");
        }
        if (z13) {
            str12 = "AND Card.isPhrase = 1";
        } else {
            str12 = "";
        }
        if (z12) {
            arrayList.add(string);
            str13 = "AND DATETIME(Card.srsDueDate) <= DATETIME(?)";
        } else {
            str13 = "";
        }
        if (num != null) {
            str14 = "AND Card.termWithLanguage = CourseAndCardsJoin.termWithLanguage AND CourseAndCardsJoin.pk = " + num;
        } else {
            str14 = "";
        }
        if (num2 != null) {
            str15 = "AND Card.termWithLanguage = LessonsAndCardsJoin.termWithLanguage AND LessonsAndCardsJoin.contentId = " + num2;
        } else {
            str15 = "";
        }
        if (list != null) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (z18) {
            str16 = "";
            while (r8.hasNext()) {
                i24 = i23 + 1;
                if (i23 >= 0) {
                    C9000b.m17257w();
                    throw null;
                }
                String str25 = (String) obj;
                if (i23 == 0) {
                    str17 = "AND (";
                } else {
                    str17 = "";
                }
                if (i23 != C9000b.m17249o(list)) {
                    str18 = ")";
                } else {
                    str18 = ")";
                }
                str16 = ((Object) str16) + str17 + " Card.tags LIKE '%" + str25 + "%' " + str18;
                i23 = i24;
            }
            zM11106a = true;
        } else {
            zM11106a = true;
            str16 = "";
        }
        if (!C5207g.m11106a(roomColumnName, VocabularySort.Importance.getRoomColumnName())) {
            zM11106a = C5207g.m11106a(roomColumnName, VocabularySort.CreationDate.getRoomColumnName());
        }
        if (zM11106a) {
            strM611g2 = C0141b.m611g("ORDER BY ", roomColumnName, " DESC");
        } else if (C5207g.m11106a(roomColumnName, VocabularySort.Status.getRoomColumnName())) {
            strM611g2 = "ORDER BY Card.status ASC,Card.importance DESC, Card.term";
        } else {
            strM611g2 = C0141b.m611g("ORDER BY Card.", roomColumnName, " ASC");
        }
        StringBuilder sbM855o2 = C0204c.m855o("\n        SELECT Card.* FROM Card\n        ", str23, "\n        ", str24, "\n        WHERE Card.termWithLanguage LIKE '");
        C0166e.m777x(sbM855o2, str5, "' || '\\_%' ESCAPE '\\'\n        ", strM768o, "\n        ");
        C0166e.m777x(sbM855o2, strM611g, "\n        ", str12, "\n        ");
        C0166e.m777x(sbM855o2, str13, "\n    ", str14, "\n    ");
        C0166e.m777x(sbM855o2, str15, "\n    ", str16, "\n        ");
        sbM855o2.append(strM611g2);
        sbM855o2.append("\n        LIMIT ");
        sbM855o2.append(i22);
        sbM855o2.append(" OFFSET ");
        return C0062b.m273H0(abstractC1520r6.mo5169n0(new C7915a(C0166e.m768o(sbM855o2, i21 * i22, "\n    "), arrayList.toArray())));
    }

    @Override // ci.InterfaceC2025r
    /* JADX INFO: renamed from: e */
    public final C7136q mo6183e(int i10, String str) {
        return new C7136q(new VocabularyRepositoryImpl$networkClozeTest$2(this, str, i10, null));
    }

    @Override // ci.InterfaceC2025r
    /* JADX INFO: renamed from: f */
    public final InterfaceC7116c<Integer> mo6184f(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f20618b.mo5167l0(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2025r
    /* JADX INFO: renamed from: g */
    public final Object mo6185g(String str, ExportType exportType, InterfaceC9968c<? super Boolean> interfaceC9968c) throws Throwable {
        VocabularyRepositoryImpl$networkExportAllCards$1 vocabularyRepositoryImpl$networkExportAllCards$1;
        if (interfaceC9968c instanceof VocabularyRepositoryImpl$networkExportAllCards$1) {
            vocabularyRepositoryImpl$networkExportAllCards$1 = (VocabularyRepositoryImpl$networkExportAllCards$1) interfaceC9968c;
            int i10 = vocabularyRepositoryImpl$networkExportAllCards$1.f20648f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$networkExportAllCards$1.f20648f = i10 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$networkExportAllCards$1 = new VocabularyRepositoryImpl$networkExportAllCards$1(this, interfaceC9968c);
            }
        } else {
            vocabularyRepositoryImpl$networkExportAllCards$1 = new VocabularyRepositoryImpl$networkExportAllCards$1(this, interfaceC9968c);
        }
        Object objM18421f = vocabularyRepositoryImpl$networkExportAllCards$1.f20646d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = vocabularyRepositoryImpl$networkExportAllCards$1.f20648f;
        boolean z10 = false;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(objM18421f);
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.f38125a = CardStatus.New.getValue();
                List<Integer> listM14266a3 = C7073a.m14266a3(SequencesKt__SequencesKt.m14251L2(new InterfaceC2041a<Integer>() { // from class: com.lingq.shared.repository.VocabularyRepositoryImpl$networkExportAllCards$statuses$1
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Integer mo807E() {
                        Ref$IntRef ref$IntRef2 = ref$IntRef;
                        int i12 = ref$IntRef2.f38125a;
                        ref$IntRef2.f38125a = i12 + 1;
                        Integer numValueOf = Integer.valueOf(i12);
                        if (numValueOf.intValue() <= CardStatus.Known.getValue()) {
                            return numValueOf;
                        }
                        return null;
                    }
                }));
                InterfaceC9933a interfaceC9933a = this.f20621e;
                String lowerCase = exportType.name().toLowerCase(Locale.ROOT);
                C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                vocabularyRepositoryImpl$networkExportAllCards$1.f20648f = 1;
                objM18421f = interfaceC9933a.m18421f(str, listM14266a3, lowerCase, vocabularyRepositoryImpl$networkExportAllCards$1);
                if (objM18421f == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18421f);
            }
            String str2 = (String) ((C6553u) objM18421f).f37339b;
            if (str2 != null && (!C7661i.m15250P2(str2))) {
                z10 = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0113  */
    /* JADX WARN: Code duplicated, block: B:35:0x0157  */
    /* JADX WARN: Code duplicated, block: B:38:0x016e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0171  */
    /* JADX WARN: Code duplicated, block: B:41:0x0174  */
    /* JADX WARN: Code duplicated, block: B:42:0x0179  */
    /* JADX WARN: Code duplicated, block: B:45:0x0188  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01df  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0206  */
    /* JADX WARN: Code duplicated, block: B:61:0x020d  */
    /* JADX WARN: Code duplicated, block: B:63:0x021b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0222  */
    /* JADX WARN: Code duplicated, block: B:66:0x022e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0235  */
    /* JADX WARN: Code duplicated, block: B:68:0x023a  */
    /* JADX WARN: Code duplicated, block: B:70:0x023e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0241  */
    /* JADX WARN: Code duplicated, block: B:73:0x0245  */
    /* JADX WARN: Code duplicated, block: B:74:0x024b  */
    /* JADX WARN: Code duplicated, block: B:76:0x024f  */
    /* JADX WARN: Code duplicated, block: B:77:0x025e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0262  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0271  */
    /* JADX WARN: Code duplicated, block: B:86:0x027e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0282  */
    /* JADX WARN: Code duplicated, block: B:91:0x028e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0296  */
    /* JADX WARN: Code duplicated, block: B:95:0x029a  */
    /* JADX WARN: Code duplicated, block: B:96:0x029d  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x024f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0262, please report this as an issue */
    @Override // ci.InterfaceC2025r
    /* JADX INFO: renamed from: h */
    public final Object mo6186h(String str, String str2, boolean z10, boolean z11, String str3, InterfaceC9968c<? super InterfaceC7116c<Integer>> interfaceC9968c) throws Throwable {
        VocabularyRepositoryImpl$fetchVocabularyPageSize$1 vocabularyRepositoryImpl$fetchVocabularyPageSize$1;
        boolean z12;
        boolean z13;
        String str4;
        VocabularyRepositoryImpl vocabularyRepositoryImpl;
        String str5;
        String string;
        VocabularySearchQuery vocabularySearchQuery;
        VocabularySearchQuery vocabularySearchQuery2;
        VocabularyRepositoryImpl vocabularyRepositoryImpl2;
        boolean z14;
        LinkedHashMap linkedHashMapM13467T0;
        InterfaceC5182d interfaceC5182d;
        boolean z15;
        boolean z16;
        VocabularySearchQuery vocabularySearchQuery3;
        String str6;
        String str7;
        String str8;
        VocabularyRepositoryImpl vocabularyRepositoryImpl3;
        String string2;
        int i10;
        int i11;
        String columnName;
        Integer num;
        Integer num2;
        List<String> list;
        ArrayList arrayList;
        String str9;
        String str10;
        CardStatus cardStatus;
        String str11;
        int value;
        String str12;
        String strM768o;
        int i12;
        boolean z17;
        String strM611g;
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z18;
        String str17;
        String str18;
        int i13;
        String str19;
        String str20;
        if (interfaceC9968c instanceof VocabularyRepositoryImpl$fetchVocabularyPageSize$1) {
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1 = (VocabularyRepositoryImpl$fetchVocabularyPageSize$1) interfaceC9968c;
            int i14 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20623H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20623H = i14 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1 = new VocabularyRepositoryImpl$fetchVocabularyPageSize$1(this, interfaceC9968c);
            }
        } else {
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1 = new VocabularyRepositoryImpl$fetchVocabularyPageSize$1(this, interfaceC9968c);
        }
        Object objM14360a = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20631k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20623H;
        if (i15 != 0) {
            if (i15 == 1) {
                boolean z19 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20630j;
                z13 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20629i;
                string = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20627g;
                str5 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20626f;
                str4 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20625e;
                VocabularyRepositoryImpl vocabularyRepositoryImpl4 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20624d;
                C7499b.m14977z0(objM14360a);
                z12 = z19;
                vocabularyRepositoryImpl = vocabularyRepositoryImpl4;
            } else if (i15 == 2) {
                z14 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20630j;
                z13 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20629i;
                vocabularySearchQuery2 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20628h;
                string = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20627g;
                str5 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20626f;
                str4 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20625e;
                vocabularyRepositoryImpl2 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20624d;
                C7499b.m14977z0(objM14360a);
                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
                linkedHashMapM13467T0.put(str4, vocabularySearchQuery2);
                interfaceC5182d = vocabularyRepositoryImpl2.f20622f;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20624d = vocabularyRepositoryImpl2;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20625e = str4;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20626f = str5;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20627g = string;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20628h = vocabularySearchQuery2;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20629i = z13;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20630j = z14;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20623H = 3;
                if (interfaceC5182d.mo9694r(linkedHashMapM13467T0, vocabularyRepositoryImpl$fetchVocabularyPageSize$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z15 = z14;
                z16 = z13;
                vocabularySearchQuery3 = vocabularySearchQuery2;
                str6 = string;
                str7 = str5;
                str8 = str4;
                vocabularyRepositoryImpl3 = vocabularyRepositoryImpl2;
            } else {
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z15 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20630j;
                z16 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20629i;
                vocabularySearchQuery3 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20628h;
                str6 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20627g;
                str7 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20626f;
                str8 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20625e;
                vocabularyRepositoryImpl3 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20624d;
                C7499b.m14977z0(objM14360a);
            }
            z12 = z15;
            vocabularySearchQuery = vocabularySearchQuery3;
            str5 = str7;
            str4 = str8;
            z13 = z16;
            string = str6;
            vocabularyRepositoryImpl = vocabularyRepositoryImpl3;
            AbstractC1520r5 abstractC1520r5 = vocabularyRepositoryImpl.f20618b;
            string2 = C7076b.m14277B3(str5).toString();
            i10 = vocabularySearchQuery.f22127a;
            i11 = vocabularySearchQuery.f22128b;
            columnName = vocabularySearchQuery.f22129c.getColumnName();
            num = vocabularySearchQuery.f22135i.f38013b;
            num2 = vocabularySearchQuery.f22136j.f38013b;
            list = vocabularySearchQuery.f22133g;
            abstractC1520r5.getClass();
            C5207g.m11111f(str4, "language");
            C5207g.m11111f(string2, "term");
            C5207g.m11111f(columnName, "criteria");
            if (string == null) {
                string = new DateTime().toString();
                C5207g.m11110e(string, "now().toString()");
            }
            arrayList = new ArrayList();
            if (num != null) {
                str9 = ",CourseAndCardsJoin";
            } else {
                str9 = "";
            }
            if (num2 != null) {
                str10 = ",LessonsAndCardsJoin";
            } else {
                str10 = "";
            }
            cardStatus = CardStatus.Known;
            if (i10 == cardStatus.getValue()) {
                str11 = str4;
                strM768o = C0009a.m20h("AND (Card.status == ", CardStatus.Learned.getValue(), " AND Card.extendedStatus == ", CardExtendedStatus.Known.getValue(), ")");
                str12 = str10;
            } else {
                str11 = str4;
                value = cardStatus.getValue();
                str12 = str10;
                if (i11 == value) {
                    strM768o = C0166e.m768o(C0009a.m25n("AND (Card.status BETWEEN ", i10, " AND ", i11, " OR Card.extendedStatus == "), CardExtendedStatus.Known.getValue(), ")");
                } else {
                    strM768o = C0166e.m768o(C0009a.m25n("AND (Card.status BETWEEN ", i10, " AND ", i11, " AND (Card.extendedStatus = "), CardExtendedStatus.NotKnown.getValue(), " OR Card.extendedStatus is null))");
                }
            }
            i12 = 0;
            if (string2.length() > 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                strM611g = "";
            } else if (C5207g.m11106a(columnName, VocabularySearch.MeaningContaining.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.meaningTerms LIKE '%", string2, "%'");
            } else if (C5207g.m11106a(columnName, VocabularySearch.StartsWith.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.term LIKE '", string2, "%'");
            } else if (C5207g.m11106a(columnName, VocabularySearch.EndsWith.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.term LIKE '%", string2, "'");
            } else if (C5207g.m11106a(columnName, VocabularySearch.PhraseContaining.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.fragment LIKE '%", string2, "%'");
            } else {
                strM611g = C0141b.m611g("AND Card.term LIKE '%", string2, "%'");
            }
            if (z12) {
                str13 = "AND Card.isPhrase = 1";
            } else {
                str13 = "";
            }
            if (z13) {
                arrayList.add(string);
                str14 = "AND DATETIME(Card.srsDueDate) <= DATETIME(?)";
            } else {
                str14 = "";
            }
            if (num != null) {
                str15 = "AND Card.termWithLanguage = CourseAndCardsJoin.termWithLanguage AND CourseAndCardsJoin.pk = " + num;
            } else {
                str15 = "";
            }
            if (num2 != null) {
                str16 = "AND Card.termWithLanguage = LessonsAndCardsJoin.termWithLanguage AND LessonsAndCardsJoin.contentId = " + num2;
            } else {
                str16 = "";
            }
            if (list != null || list.isEmpty()) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                str17 = "";
            } else {
                str18 = "";
                for (Object obj : list) {
                    i13 = i12 + 1;
                    if (i12 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    String str21 = (String) obj;
                    if (i12 == 0) {
                        str19 = "AND (";
                    } else {
                        str19 = "";
                    }
                    if (i12 != C9000b.m17249o(list) || list.size() <= 1) {
                        str20 = ")";
                    } else {
                        str20 = " OR ";
                    }
                    str18 = ((Object) str18) + str19 + " Card.tags LIKE '%" + str21 + "%' " + str20;
                    i12 = i13;
                }
                str17 = str18;
            }
            StringBuilder sbM855o = C0204c.m855o("\n        SELECT COUNT(*) as total_cards FROM Card\n        ", str9, "\n        ", str12, "\n        WHERE Card.termWithLanguage LIKE '");
            C0166e.m777x(sbM855o, str11, "' || '\\_%' ESCAPE '\\'\n        ", strM768o, "\n        ");
            C0166e.m777x(sbM855o, strM611g, "\n        ", str13, "\n        ");
            C0166e.m777x(sbM855o, str14, "\n    ", str15, "\n    ");
            sbM855o.append(str16);
            sbM855o.append("\n    ");
            sbM855o.append(str17);
            sbM855o.append("\n    ");
            return C0062b.m273H0(abstractC1520r5.mo5168m0(new C7915a(sbM855o.toString(), arrayList.toArray())));
        }
        C7499b.m14977z0(objM14360a);
        InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = this.f20622f.mo9685i();
        vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20624d = this;
        vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20625e = str;
        vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20626f = str2;
        vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20627g = str3;
        vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20629i = z10;
        z12 = z11;
        vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20630j = z12;
        vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20623H = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i, vocabularyRepositoryImpl$fetchVocabularyPageSize$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        z13 = z10;
        str4 = str;
        vocabularyRepositoryImpl = this;
        str5 = str2;
        string = str3;
        vocabularySearchQuery = (VocabularySearchQuery) ((Map) objM14360a).get(str4);
        if (vocabularySearchQuery == null) {
            VocabularySearchQuery vocabularySearchQuery4 = new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null);
            InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i2 = vocabularyRepositoryImpl.f20622f.mo9685i();
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20624d = vocabularyRepositoryImpl;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20625e = str4;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20626f = str5;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20627g = string;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20628h = vocabularySearchQuery4;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20629i = z13;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20630j = z12;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20623H = 2;
            Object objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i2, vocabularyRepositoryImpl$fetchVocabularyPageSize$1);
            if (objM14360a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            vocabularySearchQuery2 = vocabularySearchQuery4;
            objM14360a = objM14360a2;
            boolean z20 = z12;
            vocabularyRepositoryImpl2 = vocabularyRepositoryImpl;
            z14 = z20;
            linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
            linkedHashMapM13467T0.put(str4, vocabularySearchQuery2);
            interfaceC5182d = vocabularyRepositoryImpl2.f20622f;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20624d = vocabularyRepositoryImpl2;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20625e = str4;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20626f = str5;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20627g = string;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20628h = vocabularySearchQuery2;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20629i = z13;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20630j = z14;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f20623H = 3;
            if (interfaceC5182d.mo9694r(linkedHashMapM13467T0, vocabularyRepositoryImpl$fetchVocabularyPageSize$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            z15 = z14;
            z16 = z13;
            vocabularySearchQuery3 = vocabularySearchQuery2;
            str6 = string;
            str7 = str5;
            str8 = str4;
            vocabularyRepositoryImpl3 = vocabularyRepositoryImpl2;
            z12 = z15;
            vocabularySearchQuery = vocabularySearchQuery3;
            str5 = str7;
            str4 = str8;
            z13 = z16;
            string = str6;
            vocabularyRepositoryImpl = vocabularyRepositoryImpl3;
        }
        AbstractC1520r5 abstractC1520r6 = vocabularyRepositoryImpl.f20618b;
        string2 = C7076b.m14277B3(str5).toString();
        i10 = vocabularySearchQuery.f22127a;
        i11 = vocabularySearchQuery.f22128b;
        columnName = vocabularySearchQuery.f22129c.getColumnName();
        num = vocabularySearchQuery.f22135i.f38013b;
        num2 = vocabularySearchQuery.f22136j.f38013b;
        list = vocabularySearchQuery.f22133g;
        abstractC1520r6.getClass();
        C5207g.m11111f(str4, "language");
        C5207g.m11111f(string2, "term");
        C5207g.m11111f(columnName, "criteria");
        if (string == null) {
            string = new DateTime().toString();
            C5207g.m11110e(string, "now().toString()");
        }
        arrayList = new ArrayList();
        if (num != null) {
            str9 = ",CourseAndCardsJoin";
        } else {
            str9 = "";
        }
        if (num2 != null) {
            str10 = ",LessonsAndCardsJoin";
        } else {
            str10 = "";
        }
        cardStatus = CardStatus.Known;
        if (i10 == cardStatus.getValue()) {
            str11 = str4;
            strM768o = C0009a.m20h("AND (Card.status == ", CardStatus.Learned.getValue(), " AND Card.extendedStatus == ", CardExtendedStatus.Known.getValue(), ")");
            str12 = str10;
        } else {
            str11 = str4;
            value = cardStatus.getValue();
            str12 = str10;
            if (i11 == value) {
                strM768o = C0166e.m768o(C0009a.m25n("AND (Card.status BETWEEN ", i10, " AND ", i11, " OR Card.extendedStatus == "), CardExtendedStatus.Known.getValue(), ")");
            } else {
                strM768o = C0166e.m768o(C0009a.m25n("AND (Card.status BETWEEN ", i10, " AND ", i11, " AND (Card.extendedStatus = "), CardExtendedStatus.NotKnown.getValue(), " OR Card.extendedStatus is null))");
            }
        }
        i12 = 0;
        if (string2.length() > 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            strM611g = "";
        } else if (C5207g.m11106a(columnName, VocabularySearch.MeaningContaining.getColumnName())) {
            strM611g = C0141b.m611g("AND Card.meaningTerms LIKE '%", string2, "%'");
        } else if (C5207g.m11106a(columnName, VocabularySearch.StartsWith.getColumnName())) {
            strM611g = C0141b.m611g("AND Card.term LIKE '", string2, "%'");
        } else if (C5207g.m11106a(columnName, VocabularySearch.EndsWith.getColumnName())) {
            strM611g = C0141b.m611g("AND Card.term LIKE '%", string2, "'");
        } else if (C5207g.m11106a(columnName, VocabularySearch.PhraseContaining.getColumnName())) {
            strM611g = C0141b.m611g("AND Card.fragment LIKE '%", string2, "%'");
        } else {
            strM611g = C0141b.m611g("AND Card.term LIKE '%", string2, "%'");
        }
        if (z12) {
            str13 = "AND Card.isPhrase = 1";
        } else {
            str13 = "";
        }
        if (z13) {
            arrayList.add(string);
            str14 = "AND DATETIME(Card.srsDueDate) <= DATETIME(?)";
        } else {
            str14 = "";
        }
        if (num != null) {
            str15 = "AND Card.termWithLanguage = CourseAndCardsJoin.termWithLanguage AND CourseAndCardsJoin.pk = " + num;
        } else {
            str15 = "";
        }
        if (num2 != null) {
            str16 = "AND Card.termWithLanguage = LessonsAndCardsJoin.termWithLanguage AND LessonsAndCardsJoin.contentId = " + num2;
        } else {
            str16 = "";
        }
        if (list != null) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (z18) {
            str18 = "";
            while (r9.hasNext()) {
                i13 = i12 + 1;
                if (i12 >= 0) {
                    C9000b.m17257w();
                    throw null;
                }
                String str22 = (String) obj;
                if (i12 == 0) {
                    str19 = "AND (";
                } else {
                    str19 = "";
                }
                if (i12 != C9000b.m17249o(list)) {
                    str20 = ")";
                } else {
                    str20 = ")";
                }
                str18 = ((Object) str18) + str19 + " Card.tags LIKE '%" + str22 + "%' " + str20;
                i12 = i13;
            }
            str17 = str18;
        } else {
            str17 = "";
        }
        StringBuilder sbM855o2 = C0204c.m855o("\n        SELECT COUNT(*) as total_cards FROM Card\n        ", str9, "\n        ", str12, "\n        WHERE Card.termWithLanguage LIKE '");
        C0166e.m777x(sbM855o2, str11, "' || '\\_%' ESCAPE '\\'\n        ", strM768o, "\n        ");
        C0166e.m777x(sbM855o2, strM611g, "\n        ", str13, "\n        ");
        C0166e.m777x(sbM855o2, str14, "\n    ", str15, "\n    ");
        sbM855o2.append(str16);
        sbM855o2.append("\n    ");
        sbM855o2.append(str17);
        sbM855o2.append("\n    ");
        return C0062b.m273H0(abstractC1520r6.mo5168m0(new C7915a(sbM855o2.toString(), arrayList.toArray())));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0194 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0195  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a3 A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:74:0x01eb, B:65:0x0199, B:67:0x01a3, B:68:0x01b2, B:70:0x01b8, B:71:0x01db), top: B:97:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01b8 A[Catch: Exception -> 0x01ee, LOOP:0: B:68:0x01b2->B:70:0x01b8, LOOP_END, TryCatch #0 {Exception -> 0x01ee, blocks: (B:74:0x01eb, B:65:0x0199, B:67:0x01a3, B:68:0x01b2, B:70:0x01b8, B:71:0x01db), top: B:97:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x0227 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0228  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0073: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:28:0x0073 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.lingq.shared.repository.VocabularyRepositoryImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18, types: [wh.a] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21, types: [com.lingq.shared.repository.VocabularyRepositoryImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.lingq.shared.repository.VocabularyRepositoryImpl] */
    /* JADX WARN: Type inference failed for: r5v7, types: [bi.r5] */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.lingq.shared.repository.VocabularyRepositoryImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.lingq.shared.repository.VocabularyRepositoryImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [com.lingq.shared.repository.VocabularyRepositoryImpl] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ci.InterfaceC2025r
    /* JADX INFO: renamed from: i */
    public final Object mo6187i(String str, InterfaceC9968c<? super Resource<? extends List<C7566f>>> interfaceC9968c) throws Throwable {
        VocabularyRepositoryImpl$loadCardsForAnswers$1 vocabularyRepositoryImpl$loadCardsForAnswers$1;
        Object obj;
        ?? r10;
        ?? r11;
        CoroutineSingletons coroutineSingletons;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        Resource.C3303a c3303a;
        Object objMo5171p0;
        Resource.C3303a c3303a2;
        String str2;
        Ref$ObjectRef ref$ObjectRef;
        final Ref$ObjectRef ref$ObjectRef2;
        ?? r16;
        Ref$ObjectRef ref$ObjectRef3;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r20;
        LinkedHashMap linkedHashMapM13467T0;
        InterfaceC5182d interfaceC5182d;
        ?? r21;
        ?? r22;
        ?? r23;
        ?? r24;
        ?? r25;
        ?? r26;
        ?? r27;
        ?? r28;
        Locale localeForLanguageTag;
        Collection<ResultVocabularyCard> collection;
        ArrayList arrayList;
        int i10;
        ?? r29;
        if (!(interfaceC9968c instanceof VocabularyRepositoryImpl$loadCardsForAnswers$1) || (r29 = (i10 = (vocabularyRepositoryImpl$loadCardsForAnswers$1 = (VocabularyRepositoryImpl$loadCardsForAnswers$1) interfaceC9968c).f20639j) & Integer.MIN_VALUE) == 0) {
            vocabularyRepositoryImpl$loadCardsForAnswers$1 = new VocabularyRepositoryImpl$loadCardsForAnswers$1(this, interfaceC9968c);
        } else {
            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = i10 - Integer.MIN_VALUE;
        }
        Object objM14360a = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20637h;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r30 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j;
        ?? r31 = 1;
        try {
            try {
                switch (r30) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        C7499b.m14977z0(objM14360a);
                        try {
                            ref$ObjectRef = new Ref$ObjectRef();
                            InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = this.f20622f.mo9685i();
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = this;
                            str2 = str;
                            try {
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = str2;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = ref$ObjectRef;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = ref$ObjectRef;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 1;
                                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                if (objM14360a == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                r10 = this;
                                ref$ObjectRef2 = ref$ObjectRef;
                                r11 = str2;
                                try {
                                    ref$ObjectRef.f38127a = ((Map) objM14360a).get(r11);
                                    if (ref$ObjectRef2.f38127a == null) {
                                        try {
                                            ref$ObjectRef2.f38127a = new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null);
                                            InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i2 = r10.f20622f.mo9685i();
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r10;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r11;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = ref$ObjectRef2;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 2;
                                            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i2, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                            if (objM14360a == coroutineSingletons2) {
                                                return coroutineSingletons2;
                                            }
                                            ref$ObjectRef3 = ref$ObjectRef2;
                                            r17 = r10;
                                            r20 = r11;
                                            linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
                                            linkedHashMapM13467T0.put(r20, ref$ObjectRef3.f38127a);
                                            interfaceC5182d = r17.f20622f;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r17;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r20;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = ref$ObjectRef3;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 3;
                                            r28 = r20;
                                            r27 = r17;
                                            if (interfaceC5182d.mo9694r(linkedHashMapM13467T0, vocabularyRepositoryImpl$loadCardsForAnswers$1) == coroutineSingletons2) {
                                                return coroutineSingletons2;
                                            }
                                            r18 = r28;
                                            r19 = r27;
                                            ref$ObjectRef2 = ref$ObjectRef3;
                                        } catch (Exception e10) {
                                            e = e10;
                                            r16 = r11;
                                            r31 = r10;
                                            r30 = r16;
                                            r11 = r30;
                                            r10 = r31;
                                            coroutineSingletons = coroutineSingletons2;
                                            r13 = r11;
                                            r12 = r10;
                                            e.printStackTrace();
                                            r14 = r13;
                                            r15 = r12;
                                            c3303a = Resource.f17861d;
                                            ?? r32 = r15.f20618b;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = c3303a;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = null;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 6;
                                            objMo5171p0 = r32.mo5171p0(r14, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                            if (objMo5171p0 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            c3303a2 = c3303a;
                                            objM14360a = objMo5171p0;
                                            c3303a2.getClass();
                                            return Resource.C3303a.m9437c(objM14360a);
                                        }
                                    } else {
                                        r18 = r11;
                                        r19 = r10;
                                    }
                                    try {
                                        List listM17255u = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14251L2(new InterfaceC2041a<Integer>() { // from class: com.lingq.shared.repository.VocabularyRepositoryImpl$loadCardsForAnswers$statuses$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // cm.InterfaceC2041a
                                            /* JADX INFO: renamed from: E */
                                            public final Integer mo807E() {
                                                Ref$ObjectRef<VocabularySearchQuery> ref$ObjectRef4 = ref$ObjectRef2;
                                                VocabularySearchQuery vocabularySearchQuery = ref$ObjectRef4.f38127a;
                                                int i11 = vocabularySearchQuery.f22127a;
                                                vocabularySearchQuery.f22127a = i11 + 1;
                                                Integer numValueOf = Integer.valueOf(i11);
                                                if (numValueOf.intValue() < ref$ObjectRef4.f38127a.f22128b) {
                                                    return numValueOf;
                                                }
                                                return null;
                                            }
                                        })));
                                        ?? r33 = r19.f20621e;
                                        Integer num = new Integer(1);
                                        Integer num2 = new Integer(200);
                                        String serverSortName = ((VocabularySearchQuery) ref$ObjectRef2.f38127a).f22131e.getServerSortName();
                                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r19;
                                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r18;
                                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 4;
                                        r23 = r19;
                                        r24 = r18;
                                        try {
                                            objM14360a = r33.m18418c(r18, num, num2, null, null, serverSortName, listM17255u, null, null, null, null, null, null, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                            coroutineSingletons = coroutineSingletons2;
                                            if (objM14360a == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            r25 = r23;
                                            r26 = r24;
                                            try {
                                                localeForLanguageTag = Locale.forLanguageTag(r26);
                                                collection = ((Results) objM14360a).f19136d;
                                                r14 = r26;
                                                r15 = r25;
                                                if (collection != null) {
                                                    arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                                                    for (ResultVocabularyCard resultVocabularyCard : collection) {
                                                        String str3 = resultVocabularyCard.f19050a;
                                                        C5207g.m11110e(localeForLanguageTag, "locale");
                                                        arrayList.add(C5212l.m11175r(resultVocabularyCard, C7793a.m15498b(r26, C7793a.m15502f(str3, localeForLanguageTag)), C5408a.m11573f(resultVocabularyCard.f19050a)));
                                                    }
                                                    AbstractC1520r5 abstractC1520r5 = r25.f20618b;
                                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r25;
                                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r26;
                                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 5;
                                                    objM14360a = abstractC1520r5.mo599i0(arrayList, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                                    r26 = r26;
                                                    r25 = r25;
                                                    if (objM14360a == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    r14 = r26;
                                                    r15 = r25;
                                                }
                                                break;
                                            } catch (Exception e11) {
                                                e = e11;
                                                r12 = r25;
                                                r13 = r26;
                                                e.printStackTrace();
                                                r14 = r13;
                                                r15 = r12;
                                            }
                                            c3303a = Resource.f17861d;
                                            ?? r34 = r15.f20618b;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = c3303a;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = null;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 6;
                                            objMo5171p0 = r34.mo5171p0(r14, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                            if (objMo5171p0 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            c3303a2 = c3303a;
                                            objM14360a = objMo5171p0;
                                            c3303a2.getClass();
                                            return Resource.C3303a.m9437c(objM14360a);
                                        } catch (Exception e12) {
                                            e = e12;
                                            coroutineSingletons = coroutineSingletons2;
                                            r21 = r23;
                                            r22 = r24;
                                            r12 = r21;
                                            r13 = r22;
                                            e.printStackTrace();
                                            r14 = r13;
                                            r15 = r12;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        r21 = r19;
                                        r22 = r18;
                                        coroutineSingletons = coroutineSingletons2;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    coroutineSingletons = coroutineSingletons2;
                                    r13 = r11;
                                    r12 = r10;
                                    e.printStackTrace();
                                    r14 = r13;
                                    r15 = r12;
                                    c3303a = Resource.f17861d;
                                    ?? r35 = r15.f20618b;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = c3303a;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = null;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 6;
                                    objMo5171p0 = r35.mo5171p0(r14, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                    if (objMo5171p0 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    c3303a2 = c3303a;
                                    objM14360a = objMo5171p0;
                                    c3303a2.getClass();
                                    return Resource.C3303a.m9437c(objM14360a);
                                }
                            } catch (Exception e15) {
                                e = e15;
                                coroutineSingletons = coroutineSingletons2;
                                r12 = this;
                                r13 = str2;
                                e.printStackTrace();
                                r14 = r13;
                                r15 = r12;
                                c3303a = Resource.f17861d;
                                ?? r36 = r15.f20618b;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = c3303a;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 6;
                                objMo5171p0 = r36.mo5171p0(r14, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                if (objMo5171p0 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                c3303a2 = c3303a;
                                objM14360a = objMo5171p0;
                                c3303a2.getClass();
                                return Resource.C3303a.m9437c(objM14360a);
                            }
                        } catch (Exception e16) {
                            e = e16;
                            str2 = str;
                        }
                        break;
                    case 1:
                        ref$ObjectRef = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g;
                        Ref$ObjectRef ref$ObjectRef4 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f;
                        r16 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e;
                        r10 = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d;
                        try {
                            C7499b.m14977z0(objM14360a);
                            ref$ObjectRef2 = ref$ObjectRef4;
                            r11 = r16;
                            r10 = r10;
                            ref$ObjectRef.f38127a = ((Map) objM14360a).get(r11);
                            if (ref$ObjectRef2.f38127a == null) {
                                ref$ObjectRef2.f38127a = new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null);
                                InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i3 = r10.f20622f.mo9685i();
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r10;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r11;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = ref$ObjectRef2;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 2;
                                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i3, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                if (objM14360a == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                ref$ObjectRef3 = ref$ObjectRef2;
                                r17 = r10;
                                r20 = r11;
                                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
                                linkedHashMapM13467T0.put(r20, ref$ObjectRef3.f38127a);
                                interfaceC5182d = r17.f20622f;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r17;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r20;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = ref$ObjectRef3;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 3;
                                r28 = r20;
                                r27 = r17;
                                if (interfaceC5182d.mo9694r(linkedHashMapM13467T0, vocabularyRepositoryImpl$loadCardsForAnswers$1) == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                r18 = r28;
                                r19 = r27;
                                ref$ObjectRef2 = ref$ObjectRef3;
                            } else {
                                r18 = r11;
                                r19 = r10;
                            }
                            List listM17255u2 = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14251L2(new InterfaceC2041a<Integer>() { // from class: com.lingq.shared.repository.VocabularyRepositoryImpl$loadCardsForAnswers$statuses$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Integer mo807E() {
                                    Ref$ObjectRef<VocabularySearchQuery> ref$ObjectRef5 = ref$ObjectRef2;
                                    VocabularySearchQuery vocabularySearchQuery = ref$ObjectRef5.f38127a;
                                    int i11 = vocabularySearchQuery.f22127a;
                                    vocabularySearchQuery.f22127a = i11 + 1;
                                    Integer numValueOf = Integer.valueOf(i11);
                                    if (numValueOf.intValue() < ref$ObjectRef5.f38127a.f22128b) {
                                        return numValueOf;
                                    }
                                    return null;
                                }
                            })));
                            ?? r37 = r19.f20621e;
                            Integer num3 = new Integer(1);
                            Integer num4 = new Integer(200);
                            String serverSortName2 = ((VocabularySearchQuery) ref$ObjectRef2.f38127a).f22131e.getServerSortName();
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r19;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r18;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 4;
                            r23 = r19;
                            r24 = r18;
                            objM14360a = r37.m18418c(r18, num3, num4, null, null, serverSortName2, listM17255u2, null, null, null, null, null, null, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                            coroutineSingletons = coroutineSingletons2;
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            r25 = r23;
                            r26 = r24;
                            localeForLanguageTag = Locale.forLanguageTag(r26);
                            collection = ((Results) objM14360a).f19136d;
                            r14 = r26;
                            r15 = r25;
                            if (collection != null) {
                                arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                                while (r0.hasNext()) {
                                    String str4 = resultVocabularyCard.f19050a;
                                    C5207g.m11110e(localeForLanguageTag, "locale");
                                    arrayList.add(C5212l.m11175r(resultVocabularyCard, C7793a.m15498b(r26, C7793a.m15502f(str4, localeForLanguageTag)), C5408a.m11573f(resultVocabularyCard.f19050a)));
                                }
                                AbstractC1520r5 abstractC1520r6 = r25.f20618b;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r25;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r26;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 5;
                                objM14360a = abstractC1520r6.mo599i0(arrayList, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                r26 = r26;
                                r25 = r25;
                                if (objM14360a == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                r14 = r26;
                                r15 = r25;
                                break;
                            }
                            c3303a = Resource.f17861d;
                            ?? r38 = r15.f20618b;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = c3303a;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 6;
                            objMo5171p0 = r38.mo5171p0(r14, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                            if (objMo5171p0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c3303a2 = c3303a;
                            objM14360a = objMo5171p0;
                            c3303a2.getClass();
                            return Resource.C3303a.m9437c(objM14360a);
                        } catch (Exception e17) {
                            e = e17;
                            r31 = r10;
                            r30 = r16;
                            r11 = r30;
                            r10 = r31;
                            coroutineSingletons = coroutineSingletons2;
                            r13 = r11;
                            r12 = r10;
                            e.printStackTrace();
                            r14 = r13;
                            r15 = r12;
                            c3303a = Resource.f17861d;
                            ?? r39 = r15.f20618b;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = c3303a;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 6;
                            objMo5171p0 = r39.mo5171p0(r14, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                            if (objMo5171p0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c3303a2 = c3303a;
                            objM14360a = objMo5171p0;
                            c3303a2.getClass();
                            return Resource.C3303a.m9437c(objM14360a);
                        }
                    case 2:
                        ref$ObjectRef3 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f;
                        String str5 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e;
                        VocabularyRepositoryImpl vocabularyRepositoryImpl = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d;
                        C7499b.m14977z0(objM14360a);
                        r20 = str5;
                        r17 = vocabularyRepositoryImpl;
                        linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
                        linkedHashMapM13467T0.put(r20, ref$ObjectRef3.f38127a);
                        interfaceC5182d = r17.f20622f;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r17;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r20;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = ref$ObjectRef3;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 3;
                        r28 = r20;
                        r27 = r17;
                        if (interfaceC5182d.mo9694r(linkedHashMapM13467T0, vocabularyRepositoryImpl$loadCardsForAnswers$1) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        r18 = r28;
                        r19 = r27;
                        ref$ObjectRef2 = ref$ObjectRef3;
                        List listM17255u3 = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14251L2(new InterfaceC2041a<Integer>() { // from class: com.lingq.shared.repository.VocabularyRepositoryImpl$loadCardsForAnswers$statuses$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Integer mo807E() {
                                Ref$ObjectRef<VocabularySearchQuery> ref$ObjectRef5 = ref$ObjectRef2;
                                VocabularySearchQuery vocabularySearchQuery = ref$ObjectRef5.f38127a;
                                int i11 = vocabularySearchQuery.f22127a;
                                vocabularySearchQuery.f22127a = i11 + 1;
                                Integer numValueOf = Integer.valueOf(i11);
                                if (numValueOf.intValue() < ref$ObjectRef5.f38127a.f22128b) {
                                    return numValueOf;
                                }
                                return null;
                            }
                        })));
                        ?? r310 = r19.f20621e;
                        Integer num5 = new Integer(1);
                        Integer num6 = new Integer(200);
                        String serverSortName3 = ((VocabularySearchQuery) ref$ObjectRef2.f38127a).f22131e.getServerSortName();
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r19;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r18;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 4;
                        r23 = r19;
                        r24 = r18;
                        objM14360a = r310.m18418c(r18, num5, num6, null, null, serverSortName3, listM17255u3, null, null, null, null, null, null, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                        coroutineSingletons = coroutineSingletons2;
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        r25 = r23;
                        r26 = r24;
                        localeForLanguageTag = Locale.forLanguageTag(r26);
                        collection = ((Results) objM14360a).f19136d;
                        r14 = r26;
                        r15 = r25;
                        if (collection != null) {
                            arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                            while (r0.hasNext()) {
                                String str6 = resultVocabularyCard.f19050a;
                                C5207g.m11110e(localeForLanguageTag, "locale");
                                arrayList.add(C5212l.m11175r(resultVocabularyCard, C7793a.m15498b(r26, C7793a.m15502f(str6, localeForLanguageTag)), C5408a.m11573f(resultVocabularyCard.f19050a)));
                            }
                            AbstractC1520r5 abstractC1520r7 = r25.f20618b;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r25;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r26;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 5;
                            objM14360a = abstractC1520r7.mo599i0(arrayList, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                            r26 = r26;
                            r25 = r25;
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            r14 = r26;
                            r15 = r25;
                            break;
                        }
                        c3303a = Resource.f17861d;
                        ?? r311 = r15.f20618b;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = c3303a;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 6;
                        objMo5171p0 = r311.mo5171p0(r14, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                        if (objMo5171p0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c3303a2 = c3303a;
                        objM14360a = objMo5171p0;
                        c3303a2.getClass();
                        return Resource.C3303a.m9437c(objM14360a);
                    case 3:
                        ref$ObjectRef3 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f;
                        String str7 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e;
                        VocabularyRepositoryImpl vocabularyRepositoryImpl2 = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d;
                        C7499b.m14977z0(objM14360a);
                        r28 = str7;
                        r27 = vocabularyRepositoryImpl2;
                        r18 = r28;
                        r19 = r27;
                        ref$ObjectRef2 = ref$ObjectRef3;
                        List listM17255u4 = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14251L2(new InterfaceC2041a<Integer>() { // from class: com.lingq.shared.repository.VocabularyRepositoryImpl$loadCardsForAnswers$statuses$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Integer mo807E() {
                                Ref$ObjectRef<VocabularySearchQuery> ref$ObjectRef5 = ref$ObjectRef2;
                                VocabularySearchQuery vocabularySearchQuery = ref$ObjectRef5.f38127a;
                                int i11 = vocabularySearchQuery.f22127a;
                                vocabularySearchQuery.f22127a = i11 + 1;
                                Integer numValueOf = Integer.valueOf(i11);
                                if (numValueOf.intValue() < ref$ObjectRef5.f38127a.f22128b) {
                                    return numValueOf;
                                }
                                return null;
                            }
                        })));
                        ?? r312 = r19.f20621e;
                        Integer num7 = new Integer(1);
                        Integer num8 = new Integer(200);
                        String serverSortName4 = ((VocabularySearchQuery) ref$ObjectRef2.f38127a).f22131e.getServerSortName();
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r19;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r18;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 4;
                        r23 = r19;
                        r24 = r18;
                        objM14360a = r312.m18418c(r18, num7, num8, null, null, serverSortName4, listM17255u4, null, null, null, null, null, null, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                        coroutineSingletons = coroutineSingletons2;
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        r25 = r23;
                        r26 = r24;
                        localeForLanguageTag = Locale.forLanguageTag(r26);
                        collection = ((Results) objM14360a).f19136d;
                        r14 = r26;
                        r15 = r25;
                        if (collection != null) {
                            arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                            while (r0.hasNext()) {
                                String str8 = resultVocabularyCard.f19050a;
                                C5207g.m11110e(localeForLanguageTag, "locale");
                                arrayList.add(C5212l.m11175r(resultVocabularyCard, C7793a.m15498b(r26, C7793a.m15502f(str8, localeForLanguageTag)), C5408a.m11573f(resultVocabularyCard.f19050a)));
                            }
                            AbstractC1520r5 abstractC1520r8 = r25.f20618b;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r25;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r26;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 5;
                            objM14360a = abstractC1520r8.mo599i0(arrayList, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                            r26 = r26;
                            r25 = r25;
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            r14 = r26;
                            r15 = r25;
                            break;
                        }
                        c3303a = Resource.f17861d;
                        ?? r313 = r15.f20618b;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = c3303a;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 6;
                        objMo5171p0 = r313.mo5171p0(r14, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                        if (objMo5171p0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c3303a2 = c3303a;
                        objM14360a = objMo5171p0;
                        c3303a2.getClass();
                        return Resource.C3303a.m9437c(objM14360a);
                    case 4:
                        String str9 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e;
                        VocabularyRepositoryImpl vocabularyRepositoryImpl3 = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d;
                        C7499b.m14977z0(objM14360a);
                        r25 = vocabularyRepositoryImpl3;
                        r26 = str9;
                        coroutineSingletons = coroutineSingletons2;
                        localeForLanguageTag = Locale.forLanguageTag(r26);
                        collection = ((Results) objM14360a).f19136d;
                        r14 = r26;
                        r15 = r25;
                        if (collection != null) {
                            arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                            while (r0.hasNext()) {
                                String str10 = resultVocabularyCard.f19050a;
                                C5207g.m11110e(localeForLanguageTag, "locale");
                                arrayList.add(C5212l.m11175r(resultVocabularyCard, C7793a.m15498b(r26, C7793a.m15502f(str10, localeForLanguageTag)), C5408a.m11573f(resultVocabularyCard.f19050a)));
                            }
                            AbstractC1520r5 abstractC1520r9 = r25.f20618b;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = r25;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = r26;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 5;
                            objM14360a = abstractC1520r9.mo599i0(arrayList, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                            r26 = r26;
                            r25 = r25;
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            r14 = r26;
                            r15 = r25;
                            break;
                        }
                        c3303a = Resource.f17861d;
                        ?? r314 = r15.f20618b;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = c3303a;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 6;
                        objMo5171p0 = r314.mo5171p0(r14, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                        if (objMo5171p0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c3303a2 = c3303a;
                        objM14360a = objMo5171p0;
                        c3303a2.getClass();
                        return Resource.C3303a.m9437c(objM14360a);
                    case 5:
                        String str11 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e;
                        VocabularyRepositoryImpl vocabularyRepositoryImpl4 = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d;
                        C7499b.m14977z0(objM14360a);
                        r25 = vocabularyRepositoryImpl4;
                        r26 = str11;
                        coroutineSingletons = coroutineSingletons2;
                        r14 = r26;
                        r15 = r25;
                        c3303a = Resource.f17861d;
                        ?? r315 = r15.f20618b;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d = c3303a;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20634e = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20635f = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20636g = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f20639j = 6;
                        objMo5171p0 = r315.mo5171p0(r14, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                        if (objMo5171p0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c3303a2 = c3303a;
                        objM14360a = objMo5171p0;
                        c3303a2.getClass();
                        return Resource.C3303a.m9437c(objM14360a);
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        c3303a2 = (Resource.C3303a) vocabularyRepositoryImpl$loadCardsForAnswers$1.f20633d;
                        C7499b.m14977z0(objM14360a);
                        c3303a2.getClass();
                        return Resource.C3303a.m9437c(objM14360a);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e18) {
                e = e18;
            }
        } catch (Exception e19) {
            e = e19;
            r31 = obj;
            r30 = r29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03a6 A[Catch: Exception -> 0x03e8, TryCatch #0 {Exception -> 0x03e8, blocks: (B:13:0x0033, B:100:0x03a2, B:102:0x03a6, B:104:0x03ad, B:106:0x03bd, B:107:0x03ce, B:109:0x03d4, B:111:0x03e2, B:110:0x03e0, B:16:0x0050, B:91:0x0370, B:95:0x037b, B:19:0x007e, B:87:0x0319, B:22:0x0099, B:81:0x02e7, B:83:0x02ed, B:25:0x00b6, B:49:0x01d7, B:51:0x0200, B:52:0x0206, B:56:0x0225, B:61:0x0230, B:63:0x0239, B:69:0x0256, B:70:0x0260, B:76:0x027c, B:77:0x0288, B:73:0x026f, B:66:0x024b, B:28:0x00cf, B:44:0x0198, B:31:0x00ec, B:38:0x0135, B:40:0x0141, B:34:0x00fa), top: B:115:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:106:0x03bd A[Catch: Exception -> 0x03e8, TryCatch #0 {Exception -> 0x03e8, blocks: (B:13:0x0033, B:100:0x03a2, B:102:0x03a6, B:104:0x03ad, B:106:0x03bd, B:107:0x03ce, B:109:0x03d4, B:111:0x03e2, B:110:0x03e0, B:16:0x0050, B:91:0x0370, B:95:0x037b, B:19:0x007e, B:87:0x0319, B:22:0x0099, B:81:0x02e7, B:83:0x02ed, B:25:0x00b6, B:49:0x01d7, B:51:0x0200, B:52:0x0206, B:56:0x0225, B:61:0x0230, B:63:0x0239, B:69:0x0256, B:70:0x0260, B:76:0x027c, B:77:0x0288, B:73:0x026f, B:66:0x024b, B:28:0x00cf, B:44:0x0198, B:31:0x00ec, B:38:0x0135, B:40:0x0141, B:34:0x00fa), top: B:115:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x03d4 A[Catch: Exception -> 0x03e8, LOOP:0: B:107:0x03ce->B:109:0x03d4, LOOP_END, TryCatch #0 {Exception -> 0x03e8, blocks: (B:13:0x0033, B:100:0x03a2, B:102:0x03a6, B:104:0x03ad, B:106:0x03bd, B:107:0x03ce, B:109:0x03d4, B:111:0x03e2, B:110:0x03e0, B:16:0x0050, B:91:0x0370, B:95:0x037b, B:19:0x007e, B:87:0x0319, B:22:0x0099, B:81:0x02e7, B:83:0x02ed, B:25:0x00b6, B:49:0x01d7, B:51:0x0200, B:52:0x0206, B:56:0x0225, B:61:0x0230, B:63:0x0239, B:69:0x0256, B:70:0x0260, B:76:0x027c, B:77:0x0288, B:73:0x026f, B:66:0x024b, B:28:0x00cf, B:44:0x0198, B:31:0x00ec, B:38:0x0135, B:40:0x0141, B:34:0x00fa), top: B:115:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x03e0 A[Catch: Exception -> 0x03e8, TryCatch #0 {Exception -> 0x03e8, blocks: (B:13:0x0033, B:100:0x03a2, B:102:0x03a6, B:104:0x03ad, B:106:0x03bd, B:107:0x03ce, B:109:0x03d4, B:111:0x03e2, B:110:0x03e0, B:16:0x0050, B:91:0x0370, B:95:0x037b, B:19:0x007e, B:87:0x0319, B:22:0x0099, B:81:0x02e7, B:83:0x02ed, B:25:0x00b6, B:49:0x01d7, B:51:0x0200, B:52:0x0206, B:56:0x0225, B:61:0x0230, B:63:0x0239, B:69:0x0256, B:70:0x0260, B:76:0x027c, B:77:0x0288, B:73:0x026f, B:66:0x024b, B:28:0x00cf, B:44:0x0198, B:31:0x00ec, B:38:0x0135, B:40:0x0141, B:34:0x00fa), top: B:115:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0141 A[Catch: Exception -> 0x03e8, TryCatch #0 {Exception -> 0x03e8, blocks: (B:13:0x0033, B:100:0x03a2, B:102:0x03a6, B:104:0x03ad, B:106:0x03bd, B:107:0x03ce, B:109:0x03d4, B:111:0x03e2, B:110:0x03e0, B:16:0x0050, B:91:0x0370, B:95:0x037b, B:19:0x007e, B:87:0x0319, B:22:0x0099, B:81:0x02e7, B:83:0x02ed, B:25:0x00b6, B:49:0x01d7, B:51:0x0200, B:52:0x0206, B:56:0x0225, B:61:0x0230, B:63:0x0239, B:69:0x0256, B:70:0x0260, B:76:0x027c, B:77:0x0288, B:73:0x026f, B:66:0x024b, B:28:0x00cf, B:44:0x0198, B:31:0x00ec, B:38:0x0135, B:40:0x0141, B:34:0x00fa), top: B:115:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x018d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x018e  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x0200 A[Catch: Exception -> 0x03e8, TryCatch #0 {Exception -> 0x03e8, blocks: (B:13:0x0033, B:100:0x03a2, B:102:0x03a6, B:104:0x03ad, B:106:0x03bd, B:107:0x03ce, B:109:0x03d4, B:111:0x03e2, B:110:0x03e0, B:16:0x0050, B:91:0x0370, B:95:0x037b, B:19:0x007e, B:87:0x0319, B:22:0x0099, B:81:0x02e7, B:83:0x02ed, B:25:0x00b6, B:49:0x01d7, B:51:0x0200, B:52:0x0206, B:56:0x0225, B:61:0x0230, B:63:0x0239, B:69:0x0256, B:70:0x0260, B:76:0x027c, B:77:0x0288, B:73:0x026f, B:66:0x024b, B:28:0x00cf, B:44:0x0198, B:31:0x00ec, B:38:0x0135, B:40:0x0141, B:34:0x00fa), top: B:115:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0221  */
    /* JADX WARN: Code duplicated, block: B:55:0x0224  */
    /* JADX WARN: Code duplicated, block: B:58:0x022b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x022d  */
    /* JADX WARN: Code duplicated, block: B:60:0x022f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0237  */
    /* JADX WARN: Code duplicated, block: B:65:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x024b A[Catch: Exception -> 0x03e8, TryCatch #0 {Exception -> 0x03e8, blocks: (B:13:0x0033, B:100:0x03a2, B:102:0x03a6, B:104:0x03ad, B:106:0x03bd, B:107:0x03ce, B:109:0x03d4, B:111:0x03e2, B:110:0x03e0, B:16:0x0050, B:91:0x0370, B:95:0x037b, B:19:0x007e, B:87:0x0319, B:22:0x0099, B:81:0x02e7, B:83:0x02ed, B:25:0x00b6, B:49:0x01d7, B:51:0x0200, B:52:0x0206, B:56:0x0225, B:61:0x0230, B:63:0x0239, B:69:0x0256, B:70:0x0260, B:76:0x027c, B:77:0x0288, B:73:0x026f, B:66:0x024b, B:28:0x00cf, B:44:0x0198, B:31:0x00ec, B:38:0x0135, B:40:0x0141, B:34:0x00fa), top: B:115:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x026c  */
    /* JADX WARN: Code duplicated, block: B:73:0x026f A[Catch: Exception -> 0x03e8, TryCatch #0 {Exception -> 0x03e8, blocks: (B:13:0x0033, B:100:0x03a2, B:102:0x03a6, B:104:0x03ad, B:106:0x03bd, B:107:0x03ce, B:109:0x03d4, B:111:0x03e2, B:110:0x03e0, B:16:0x0050, B:91:0x0370, B:95:0x037b, B:19:0x007e, B:87:0x0319, B:22:0x0099, B:81:0x02e7, B:83:0x02ed, B:25:0x00b6, B:49:0x01d7, B:51:0x0200, B:52:0x0206, B:56:0x0225, B:61:0x0230, B:63:0x0239, B:69:0x0256, B:70:0x0260, B:76:0x027c, B:77:0x0288, B:73:0x026f, B:66:0x024b, B:28:0x00cf, B:44:0x0198, B:31:0x00ec, B:38:0x0135, B:40:0x0141, B:34:0x00fa), top: B:115:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0279  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ed A[Catch: Exception -> 0x03e8, TryCatch #0 {Exception -> 0x03e8, blocks: (B:13:0x0033, B:100:0x03a2, B:102:0x03a6, B:104:0x03ad, B:106:0x03bd, B:107:0x03ce, B:109:0x03d4, B:111:0x03e2, B:110:0x03e0, B:16:0x0050, B:91:0x0370, B:95:0x037b, B:19:0x007e, B:87:0x0319, B:22:0x0099, B:81:0x02e7, B:83:0x02ed, B:25:0x00b6, B:49:0x01d7, B:51:0x0200, B:52:0x0206, B:56:0x0225, B:61:0x0230, B:63:0x0239, B:69:0x0256, B:70:0x0260, B:76:0x027c, B:77:0x0288, B:73:0x026f, B:66:0x024b, B:28:0x00cf, B:44:0x0198, B:31:0x00ec, B:38:0x0135, B:40:0x0141, B:34:0x00fa), top: B:115:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0311 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0312  */
    /* JADX WARN: Code duplicated, block: B:89:0x0360 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x0361  */
    /* JADX WARN: Code duplicated, block: B:93:0x0376  */
    /* JADX WARN: Code duplicated, block: B:94:0x0379  */
    /* JADX WARN: Code duplicated, block: B:97:0x039f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x03a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    @Override // ci.InterfaceC2025r
    /* JADX INFO: renamed from: j */
    public final Serializable mo6188j(String str, int i10, String str2, boolean z10, boolean z11, String str3, int i11, InterfaceC9968c interfaceC9968c) throws Throwable {
        VocabularyRepositoryImpl$networkVocabularyCards$1 vocabularyRepositoryImpl$networkVocabularyCards$1;
        Ref$ObjectRef ref$ObjectRef;
        String str4;
        int i12;
        boolean z12;
        boolean z13;
        VocabularyRepositoryImpl vocabularyRepositoryImpl;
        String str5;
        int i13;
        String str6;
        Ref$ObjectRef ref$ObjectRef2;
        boolean z14;
        boolean z15;
        String str7;
        String str8;
        VocabularyRepositoryImpl vocabularyRepositoryImpl2;
        final Ref$ObjectRef ref$ObjectRef3;
        String str9;
        int i14;
        Ref$ObjectRef ref$ObjectRef4;
        boolean z16;
        String str10;
        VocabularyRepositoryImpl vocabularyRepositoryImpl3;
        String str11;
        boolean z17;
        LinkedHashMap linkedHashMapM13467T0;
        InterfaceC5182d interfaceC5182d;
        boolean z18;
        Boolean boolValueOf;
        List<String> list;
        Integer num;
        List<String> list2;
        Integer num2;
        VocabularyRepositoryImpl vocabularyRepositoryImpl4;
        String str12;
        String str13;
        String str14;
        Ref$ObjectRef ref$ObjectRef5;
        boolean z19;
        int i15;
        boolean z20;
        boolean z21;
        CoroutineSingletons coroutineSingletons;
        Object objM18418c;
        boolean z22;
        String str15;
        String str16;
        int i16;
        boolean z23;
        VocabularyRepositoryImpl vocabularyRepositoryImpl5;
        String str17;
        Ref$ObjectRef ref$ObjectRef6;
        boolean z24;
        Results results;
        List list3;
        Object objM14360a;
        VocabularyRepositoryImpl vocabularyRepositoryImpl6;
        String str18;
        Ref$ObjectRef ref$ObjectRef7;
        List list4;
        String str19;
        String str20;
        Results results2;
        LinkedHashMap linkedHashMapM13467T1;
        boolean z25;
        boolean z26;
        InterfaceC5182d interfaceC5182d2;
        boolean z27;
        int i17;
        List list5;
        Ref$ObjectRef ref$ObjectRef8;
        String str21;
        String str22;
        String str23;
        boolean z28;
        LingQDatabase lingQDatabase;
        VocabularyRepositoryImpl$networkVocabularyCards$2$1$1 vocabularyRepositoryImpl$networkVocabularyCards$2$1$1;
        boolean z29;
        Results results3;
        List<? extends ResultType> list6;
        int size;
        Collection collection;
        Object arrayList;
        Iterator it;
        if (interfaceC9968c instanceof VocabularyRepositoryImpl$networkVocabularyCards$1) {
            vocabularyRepositoryImpl$networkVocabularyCards$1 = (VocabularyRepositoryImpl$networkVocabularyCards$1) interfaceC9968c;
            int i18 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = i18 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$networkVocabularyCards$1 = new VocabularyRepositoryImpl$networkVocabularyCards$1(this, interfaceC9968c);
            }
        } else {
            vocabularyRepositoryImpl$networkVocabularyCards$1 = new VocabularyRepositoryImpl$networkVocabularyCards$1(this, interfaceC9968c);
        }
        Object objM14360a2 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20655J;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            switch (vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C7499b.m14977z0(objM14360a2);
                    ref$ObjectRef = new Ref$ObjectRef();
                    InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = this.f20622f.mo9685i();
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = this;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str2;
                    str4 = str3;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str4;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = ref$ObjectRef;
                    i12 = i10;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i12;
                    z12 = z10;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z12;
                    z13 = z11;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z13;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20666l = i11;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 1;
                    objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i, vocabularyRepositoryImpl$networkVocabularyCards$1);
                    if (objM14360a2 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    vocabularyRepositoryImpl = this;
                    str5 = str;
                    i13 = i11;
                    str6 = str2;
                    ref$ObjectRef2 = ref$ObjectRef;
                    ref$ObjectRef.f38127a = ((Map) objM14360a2).get(str5);
                    if (ref$ObjectRef2.f38127a == 0) {
                        ref$ObjectRef2.f38127a = new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null);
                        InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i2 = vocabularyRepositoryImpl.f20622f.mo9685i();
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str5;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str4;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i12;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z12;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z13;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20666l = i13;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 2;
                        objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM14360a2 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        ref$ObjectRef4 = ref$ObjectRef2;
                        z16 = z13;
                        str7 = str6;
                        str10 = str5;
                        vocabularyRepositoryImpl3 = vocabularyRepositoryImpl;
                        boolean z30 = z12;
                        str11 = str4;
                        z17 = z30;
                        linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a2);
                        linkedHashMapM13467T0.put(str10, ref$ObjectRef4.f38127a);
                        interfaceC5182d = vocabularyRepositoryImpl3.f20622f;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str10;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str11;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef4;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i12;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z17;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20666l = i13;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 3;
                        if (interfaceC5182d.mo9694r(linkedHashMapM13467T0, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        z15 = z16;
                        z14 = z17;
                        i14 = i12;
                        VocabularyRepositoryImpl vocabularyRepositoryImpl7 = vocabularyRepositoryImpl3;
                        ref$ObjectRef3 = ref$ObjectRef4;
                        vocabularyRepositoryImpl2 = vocabularyRepositoryImpl7;
                        String str24 = str10;
                        str9 = str11;
                        str8 = str24;
                    } else {
                        z14 = z12;
                        z15 = z13;
                        str7 = str6;
                        str8 = str5;
                        vocabularyRepositoryImpl2 = vocabularyRepositoryImpl;
                        ref$ObjectRef3 = ref$ObjectRef2;
                        str9 = str4;
                        i14 = i12;
                    }
                    final Ref$IntRef ref$IntRef = new Ref$IntRef();
                    ref$IntRef.f38125a = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22127a;
                    List<Integer> listM17255u = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14251L2(new InterfaceC2041a<Integer>() { // from class: com.lingq.shared.repository.VocabularyRepositoryImpl$networkVocabularyCards$statuses$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Integer mo807E() {
                            Ref$IntRef ref$IntRef2 = ref$IntRef;
                            int i19 = ref$IntRef2.f38125a;
                            ref$IntRef2.f38125a = i19 + 1;
                            Integer numValueOf = Integer.valueOf(i19);
                            if (numValueOf.intValue() <= ref$ObjectRef3.f38127a.f22128b) {
                                return numValueOf;
                            }
                            return null;
                        }
                    })));
                    InterfaceC9933a interfaceC9933a = vocabularyRepositoryImpl2.f20621e;
                    Integer num3 = new Integer(i14);
                    if (i13 == -1) {
                        i13 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22130d;
                    }
                    Integer num4 = new Integer(i13);
                    String columnName = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22129c.getColumnName();
                    String serverSortName = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22131e.getServerSortName();
                    if (z14) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z18);
                    if (z15) {
                        if (z15) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolValueOf = Boolean.valueOf(z24);
                    } else {
                        boolValueOf = null;
                    }
                    T t10 = ref$ObjectRef3.f38127a;
                    list = ((VocabularySearchQuery) t10).f22133g;
                    Integer num5 = ((VocabularySearchQuery) t10).f22135i.f38013b;
                    Integer num6 = (num5 != null && num5.intValue() == -1) ? null : ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22135i.f38013b;
                    num = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                    if (num != null) {
                        list2 = list;
                        if (num.intValue() == -1) {
                            num2 = null;
                        }
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                        List<String> list7 = list2;
                        vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                        str12 = str8;
                        str13 = str7;
                        str14 = str9;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        z19 = z15;
                        Boolean bool = boolValueOf;
                        i15 = i14;
                        z20 = z14;
                        z21 = true;
                        coroutineSingletons = coroutineSingletons2;
                        objM18418c = interfaceC9933a.m18418c(str8, num3, num4, str7, columnName, serverSortName, listM17255u, boolValueOf2, bool, str14, list7, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM18418c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z22 = z19;
                        str15 = str13;
                        str16 = str14;
                        i16 = i15;
                        z23 = z20;
                        vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                        str17 = str12;
                        ref$ObjectRef6 = ref$ObjectRef5;
                        results = (Results) objM18418c;
                        list3 = results.f19136d;
                        if (list3 != null) {
                            InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j = vocabularyRepositoryImpl5.f20622f.mo9686j();
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j, vocabularyRepositoryImpl$networkVocabularyCards$1);
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                            str18 = str15;
                            ref$ObjectRef7 = ref$ObjectRef6;
                            list4 = list3;
                            str19 = str17;
                            str20 = str16;
                            results2 = results;
                            linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                            z25 = z22;
                            z26 = z23;
                            linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                            interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                            if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z27 = z26;
                            i17 = i16;
                            list5 = list4;
                            ref$ObjectRef8 = ref$ObjectRef7;
                            str21 = str20;
                            str22 = str18;
                            str23 = str19;
                            z28 = z25;
                            lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                            if (z28) {
                                z29 = z21;
                            } else {
                                z29 = false;
                            }
                            vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                            if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            results3 = results2;
                            results = results3;
                        }
                        list6 = results.f19136d;
                        if (list6 != 0) {
                            size = list6.size();
                        } else {
                            size = 0;
                        }
                        Integer num7 = new Integer(size);
                        Integer num8 = new Integer(results.f19133a);
                        collection = results.f19136d;
                        if (collection != null) {
                            arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                            it = collection.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        return new Triple(num7, num8, arrayList);
                    }
                    list2 = list;
                    num2 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                    List<String> list8 = list2;
                    vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                    str12 = str8;
                    str13 = str7;
                    str14 = str9;
                    ref$ObjectRef5 = ref$ObjectRef3;
                    z19 = z15;
                    Boolean bool2 = boolValueOf;
                    i15 = i14;
                    z20 = z14;
                    z21 = true;
                    coroutineSingletons = coroutineSingletons2;
                    objM18418c = interfaceC9933a.m18418c(str8, num3, num4, str7, columnName, serverSortName, listM17255u, boolValueOf2, bool2, str14, list8, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                    if (objM18418c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z22 = z19;
                    str15 = str13;
                    str16 = str14;
                    i16 = i15;
                    z23 = z20;
                    vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                    str17 = str12;
                    ref$ObjectRef6 = ref$ObjectRef5;
                    results = (Results) objM18418c;
                    list3 = results.f19136d;
                    if (list3 != null) {
                        InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j2 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                        str18 = str15;
                        ref$ObjectRef7 = ref$ObjectRef6;
                        list4 = list3;
                        str19 = str17;
                        str20 = str16;
                        results2 = results;
                        linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                        z25 = z22;
                        z26 = z23;
                        linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                        interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                        if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z27 = z26;
                        i17 = i16;
                        list5 = list4;
                        ref$ObjectRef8 = ref$ObjectRef7;
                        str21 = str20;
                        str22 = str18;
                        str23 = str19;
                        z28 = z25;
                        lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                        if (z28) {
                            z29 = z21;
                        } else {
                            z29 = false;
                        }
                        vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                        if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        results3 = results2;
                        results = results3;
                    }
                    list6 = results.f19136d;
                    if (list6 != 0) {
                        size = list6.size();
                    } else {
                        size = 0;
                    }
                    Integer num9 = new Integer(size);
                    Integer num10 = new Integer(results.f19133a);
                    collection = results.f19136d;
                    if (collection != null) {
                        arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                        it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    return new Triple(num9, num10, arrayList);
                case 1:
                    i13 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20666l;
                    boolean z31 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I;
                    boolean z32 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H;
                    i12 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k;
                    ref$ObjectRef = (Ref$ObjectRef) vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i;
                    Ref$ObjectRef ref$ObjectRef9 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h;
                    String str25 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g;
                    str6 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f;
                    str5 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e;
                    vocabularyRepositoryImpl = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d;
                    C7499b.m14977z0(objM14360a2);
                    z13 = z31;
                    ref$ObjectRef2 = ref$ObjectRef9;
                    z12 = z32;
                    str4 = str25;
                    ref$ObjectRef.f38127a = ((Map) objM14360a2).get(str5);
                    if (ref$ObjectRef2.f38127a == 0) {
                        ref$ObjectRef2.f38127a = new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null);
                        InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i3 = vocabularyRepositoryImpl.f20622f.mo9685i();
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str5;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str4;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i12;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z12;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z13;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20666l = i13;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 2;
                        objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i3, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM14360a2 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        ref$ObjectRef4 = ref$ObjectRef2;
                        z16 = z13;
                        str7 = str6;
                        str10 = str5;
                        vocabularyRepositoryImpl3 = vocabularyRepositoryImpl;
                        boolean z33 = z12;
                        str11 = str4;
                        z17 = z33;
                        linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a2);
                        linkedHashMapM13467T0.put(str10, ref$ObjectRef4.f38127a);
                        interfaceC5182d = vocabularyRepositoryImpl3.f20622f;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str10;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str11;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef4;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i12;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z17;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20666l = i13;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 3;
                        if (interfaceC5182d.mo9694r(linkedHashMapM13467T0, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        z15 = z16;
                        z14 = z17;
                        i14 = i12;
                        VocabularyRepositoryImpl vocabularyRepositoryImpl8 = vocabularyRepositoryImpl3;
                        ref$ObjectRef3 = ref$ObjectRef4;
                        vocabularyRepositoryImpl2 = vocabularyRepositoryImpl8;
                        String str26 = str10;
                        str9 = str11;
                        str8 = str26;
                    } else {
                        z14 = z12;
                        z15 = z13;
                        str7 = str6;
                        str8 = str5;
                        vocabularyRepositoryImpl2 = vocabularyRepositoryImpl;
                        ref$ObjectRef3 = ref$ObjectRef2;
                        str9 = str4;
                        i14 = i12;
                    }
                    final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    ref$IntRef2.f38125a = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22127a;
                    List<Integer> listM17255u2 = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14251L2(new InterfaceC2041a<Integer>() { // from class: com.lingq.shared.repository.VocabularyRepositoryImpl$networkVocabularyCards$statuses$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Integer mo807E() {
                            Ref$IntRef ref$IntRef3 = ref$IntRef2;
                            int i19 = ref$IntRef3.f38125a;
                            ref$IntRef3.f38125a = i19 + 1;
                            Integer numValueOf = Integer.valueOf(i19);
                            if (numValueOf.intValue() <= ref$ObjectRef3.f38127a.f22128b) {
                                return numValueOf;
                            }
                            return null;
                        }
                    })));
                    InterfaceC9933a interfaceC9933a2 = vocabularyRepositoryImpl2.f20621e;
                    Integer num11 = new Integer(i14);
                    if (i13 == -1) {
                        i13 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22130d;
                    }
                    Integer num12 = new Integer(i13);
                    String columnName2 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22129c.getColumnName();
                    String serverSortName2 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22131e.getServerSortName();
                    if (z14) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z18);
                    if (z15) {
                        if (z15) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolValueOf = Boolean.valueOf(z24);
                    } else {
                        boolValueOf = null;
                    }
                    T t11 = ref$ObjectRef3.f38127a;
                    list = ((VocabularySearchQuery) t11).f22133g;
                    Integer num13 = ((VocabularySearchQuery) t11).f22135i.f38013b;
                    if (num13 != null) {
                        num = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                        if (num != null) {
                            list2 = list;
                            if (num.intValue() == -1) {
                                num2 = null;
                            }
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                            List<String> list9 = list2;
                            vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                            str12 = str8;
                            str13 = str7;
                            str14 = str9;
                            ref$ObjectRef5 = ref$ObjectRef3;
                            z19 = z15;
                            Boolean bool3 = boolValueOf;
                            i15 = i14;
                            z20 = z14;
                            z21 = true;
                            coroutineSingletons = coroutineSingletons2;
                            objM18418c = interfaceC9933a2.m18418c(str8, num11, num12, str7, columnName2, serverSortName2, listM17255u2, boolValueOf3, bool3, str14, list9, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                            if (objM18418c == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z22 = z19;
                            str15 = str13;
                            str16 = str14;
                            i16 = i15;
                            z23 = z20;
                            vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                            str17 = str12;
                            ref$ObjectRef6 = ref$ObjectRef5;
                            results = (Results) objM18418c;
                            list3 = results.f19136d;
                            if (list3 != null) {
                                InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j3 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j3, vocabularyRepositoryImpl$networkVocabularyCards$1);
                                if (objM14360a == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                                str18 = str15;
                                ref$ObjectRef7 = ref$ObjectRef6;
                                list4 = list3;
                                str19 = str17;
                                str20 = str16;
                                results2 = results;
                                linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                                z25 = z22;
                                z26 = z23;
                                linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                                interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                                if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                z27 = z26;
                                i17 = i16;
                                list5 = list4;
                                ref$ObjectRef8 = ref$ObjectRef7;
                                str21 = str20;
                                str22 = str18;
                                str23 = str19;
                                z28 = z25;
                                lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                                if (z28) {
                                    z29 = z21;
                                } else {
                                    z29 = false;
                                }
                                vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                                if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                results3 = results2;
                                results = results3;
                            }
                            list6 = results.f19136d;
                            if (list6 != 0) {
                                size = list6.size();
                            } else {
                                size = 0;
                            }
                            Integer num14 = new Integer(size);
                            Integer num15 = new Integer(results.f19133a);
                            collection = results.f19136d;
                            if (collection != null) {
                                arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                                it = collection.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                                }
                            } else {
                                arrayList = EmptyList.f38032a;
                            }
                            return new Triple(num14, num15, arrayList);
                        }
                        list2 = list;
                        num2 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                        List<String> list10 = list2;
                        vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                        str12 = str8;
                        str13 = str7;
                        str14 = str9;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        z19 = z15;
                        Boolean bool4 = boolValueOf;
                        i15 = i14;
                        z20 = z14;
                        z21 = true;
                        coroutineSingletons = coroutineSingletons2;
                        objM18418c = interfaceC9933a2.m18418c(str8, num11, num12, str7, columnName2, serverSortName2, listM17255u2, boolValueOf3, bool4, str14, list10, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM18418c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z22 = z19;
                        str15 = str13;
                        str16 = str14;
                        i16 = i15;
                        z23 = z20;
                        vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                        str17 = str12;
                        ref$ObjectRef6 = ref$ObjectRef5;
                        results = (Results) objM18418c;
                        list3 = results.f19136d;
                        if (list3 != null) {
                            InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j4 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j4, vocabularyRepositoryImpl$networkVocabularyCards$1);
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                            str18 = str15;
                            ref$ObjectRef7 = ref$ObjectRef6;
                            list4 = list3;
                            str19 = str17;
                            str20 = str16;
                            results2 = results;
                            linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                            z25 = z22;
                            z26 = z23;
                            linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                            interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                            if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z27 = z26;
                            i17 = i16;
                            list5 = list4;
                            ref$ObjectRef8 = ref$ObjectRef7;
                            str21 = str20;
                            str22 = str18;
                            str23 = str19;
                            z28 = z25;
                            lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                            if (z28) {
                                z29 = z21;
                            } else {
                                z29 = false;
                            }
                            vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                            if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            results3 = results2;
                            results = results3;
                        }
                        list6 = results.f19136d;
                        if (list6 != 0) {
                            size = list6.size();
                        } else {
                            size = 0;
                        }
                        Integer num16 = new Integer(size);
                        Integer num17 = new Integer(results.f19133a);
                        collection = results.f19136d;
                        if (collection != null) {
                            arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                            it = collection.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        return new Triple(num16, num17, arrayList);
                    }
                    num = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                    if (num != null) {
                        list2 = list;
                        if (num.intValue() == -1) {
                            num2 = null;
                        }
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                        List<String> list11 = list2;
                        vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                        str12 = str8;
                        str13 = str7;
                        str14 = str9;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        z19 = z15;
                        Boolean bool5 = boolValueOf;
                        i15 = i14;
                        z20 = z14;
                        z21 = true;
                        coroutineSingletons = coroutineSingletons2;
                        objM18418c = interfaceC9933a2.m18418c(str8, num11, num12, str7, columnName2, serverSortName2, listM17255u2, boolValueOf3, bool5, str14, list11, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM18418c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z22 = z19;
                        str15 = str13;
                        str16 = str14;
                        i16 = i15;
                        z23 = z20;
                        vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                        str17 = str12;
                        ref$ObjectRef6 = ref$ObjectRef5;
                        results = (Results) objM18418c;
                        list3 = results.f19136d;
                        if (list3 != null) {
                            InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j5 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j5, vocabularyRepositoryImpl$networkVocabularyCards$1);
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                            str18 = str15;
                            ref$ObjectRef7 = ref$ObjectRef6;
                            list4 = list3;
                            str19 = str17;
                            str20 = str16;
                            results2 = results;
                            linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                            z25 = z22;
                            z26 = z23;
                            linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                            interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                            if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z27 = z26;
                            i17 = i16;
                            list5 = list4;
                            ref$ObjectRef8 = ref$ObjectRef7;
                            str21 = str20;
                            str22 = str18;
                            str23 = str19;
                            z28 = z25;
                            lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                            if (z28) {
                                z29 = z21;
                            } else {
                                z29 = false;
                            }
                            vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                            if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            results3 = results2;
                            results = results3;
                        }
                        list6 = results.f19136d;
                        if (list6 != 0) {
                            size = list6.size();
                        } else {
                            size = 0;
                        }
                        Integer num18 = new Integer(size);
                        Integer num19 = new Integer(results.f19133a);
                        collection = results.f19136d;
                        if (collection != null) {
                            arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                            it = collection.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        return new Triple(num18, num19, arrayList);
                    }
                    list2 = list;
                    num2 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                    List<String> list12 = list2;
                    vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                    str12 = str8;
                    str13 = str7;
                    str14 = str9;
                    ref$ObjectRef5 = ref$ObjectRef3;
                    z19 = z15;
                    Boolean bool6 = boolValueOf;
                    i15 = i14;
                    z20 = z14;
                    z21 = true;
                    coroutineSingletons = coroutineSingletons2;
                    objM18418c = interfaceC9933a2.m18418c(str8, num11, num12, str7, columnName2, serverSortName2, listM17255u2, boolValueOf3, bool6, str14, list12, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                    if (objM18418c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z22 = z19;
                    str15 = str13;
                    str16 = str14;
                    i16 = i15;
                    z23 = z20;
                    vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                    str17 = str12;
                    ref$ObjectRef6 = ref$ObjectRef5;
                    results = (Results) objM18418c;
                    list3 = results.f19136d;
                    if (list3 != null) {
                        InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j6 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j6, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                        str18 = str15;
                        ref$ObjectRef7 = ref$ObjectRef6;
                        list4 = list3;
                        str19 = str17;
                        str20 = str16;
                        results2 = results;
                        linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                        z25 = z22;
                        z26 = z23;
                        linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                        interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                        if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z27 = z26;
                        i17 = i16;
                        list5 = list4;
                        ref$ObjectRef8 = ref$ObjectRef7;
                        str21 = str20;
                        str22 = str18;
                        str23 = str19;
                        z28 = z25;
                        lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                        if (z28) {
                            z29 = z21;
                        } else {
                            z29 = false;
                        }
                        vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                        if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        results3 = results2;
                        results = results3;
                    }
                    list6 = results.f19136d;
                    if (list6 != 0) {
                        size = list6.size();
                    } else {
                        size = 0;
                    }
                    Integer num110 = new Integer(size);
                    Integer num111 = new Integer(results.f19133a);
                    collection = results.f19136d;
                    if (collection != null) {
                        arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                        it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    return new Triple(num110, num111, arrayList);
                case 2:
                    i13 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20666l;
                    z16 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I;
                    z17 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H;
                    i12 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k;
                    ref$ObjectRef4 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h;
                    str11 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g;
                    str7 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f;
                    str10 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e;
                    vocabularyRepositoryImpl3 = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d;
                    C7499b.m14977z0(objM14360a2);
                    linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a2);
                    linkedHashMapM13467T0.put(str10, ref$ObjectRef4.f38127a);
                    interfaceC5182d = vocabularyRepositoryImpl3.f20622f;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl3;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str10;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str11;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef4;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i12;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z17;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z16;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20666l = i13;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 3;
                    if (interfaceC5182d.mo9694r(linkedHashMapM13467T0, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    z15 = z16;
                    z14 = z17;
                    i14 = i12;
                    VocabularyRepositoryImpl vocabularyRepositoryImpl9 = vocabularyRepositoryImpl3;
                    ref$ObjectRef3 = ref$ObjectRef4;
                    vocabularyRepositoryImpl2 = vocabularyRepositoryImpl9;
                    String str27 = str10;
                    str9 = str11;
                    str8 = str27;
                    final Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                    ref$IntRef3.f38125a = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22127a;
                    List<Integer> listM17255u3 = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14251L2(new InterfaceC2041a<Integer>() { // from class: com.lingq.shared.repository.VocabularyRepositoryImpl$networkVocabularyCards$statuses$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Integer mo807E() {
                            Ref$IntRef ref$IntRef4 = ref$IntRef3;
                            int i19 = ref$IntRef4.f38125a;
                            ref$IntRef4.f38125a = i19 + 1;
                            Integer numValueOf = Integer.valueOf(i19);
                            if (numValueOf.intValue() <= ref$ObjectRef3.f38127a.f22128b) {
                                return numValueOf;
                            }
                            return null;
                        }
                    })));
                    InterfaceC9933a interfaceC9933a3 = vocabularyRepositoryImpl2.f20621e;
                    Integer num112 = new Integer(i14);
                    if (i13 == -1) {
                        i13 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22130d;
                    }
                    Integer num113 = new Integer(i13);
                    String columnName3 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22129c.getColumnName();
                    String serverSortName3 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22131e.getServerSortName();
                    if (z14) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z18);
                    if (z15) {
                        if (z15) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolValueOf = Boolean.valueOf(z24);
                    } else {
                        boolValueOf = null;
                    }
                    T t12 = ref$ObjectRef3.f38127a;
                    list = ((VocabularySearchQuery) t12).f22133g;
                    Integer num114 = ((VocabularySearchQuery) t12).f22135i.f38013b;
                    if (num114 != null) {
                        num = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                        if (num != null) {
                            list2 = list;
                            if (num.intValue() == -1) {
                                num2 = null;
                            }
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                            List<String> list13 = list2;
                            vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                            str12 = str8;
                            str13 = str7;
                            str14 = str9;
                            ref$ObjectRef5 = ref$ObjectRef3;
                            z19 = z15;
                            Boolean bool7 = boolValueOf;
                            i15 = i14;
                            z20 = z14;
                            z21 = true;
                            coroutineSingletons = coroutineSingletons2;
                            objM18418c = interfaceC9933a3.m18418c(str8, num112, num113, str7, columnName3, serverSortName3, listM17255u3, boolValueOf4, bool7, str14, list13, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                            if (objM18418c == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z22 = z19;
                            str15 = str13;
                            str16 = str14;
                            i16 = i15;
                            z23 = z20;
                            vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                            str17 = str12;
                            ref$ObjectRef6 = ref$ObjectRef5;
                            results = (Results) objM18418c;
                            list3 = results.f19136d;
                            if (list3 != null) {
                                InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j7 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j7, vocabularyRepositoryImpl$networkVocabularyCards$1);
                                if (objM14360a == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                                str18 = str15;
                                ref$ObjectRef7 = ref$ObjectRef6;
                                list4 = list3;
                                str19 = str17;
                                str20 = str16;
                                results2 = results;
                                linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                                z25 = z22;
                                z26 = z23;
                                linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                                interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                                if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                z27 = z26;
                                i17 = i16;
                                list5 = list4;
                                ref$ObjectRef8 = ref$ObjectRef7;
                                str21 = str20;
                                str22 = str18;
                                str23 = str19;
                                z28 = z25;
                                lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                                if (z28) {
                                    z29 = z21;
                                } else {
                                    z29 = false;
                                }
                                vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                                if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                results3 = results2;
                                results = results3;
                            }
                            list6 = results.f19136d;
                            if (list6 != 0) {
                                size = list6.size();
                            } else {
                                size = 0;
                            }
                            Integer num115 = new Integer(size);
                            Integer num116 = new Integer(results.f19133a);
                            collection = results.f19136d;
                            if (collection != null) {
                                arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                                it = collection.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                                }
                            } else {
                                arrayList = EmptyList.f38032a;
                            }
                            return new Triple(num115, num116, arrayList);
                        }
                        list2 = list;
                        num2 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                        List<String> list14 = list2;
                        vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                        str12 = str8;
                        str13 = str7;
                        str14 = str9;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        z19 = z15;
                        Boolean bool8 = boolValueOf;
                        i15 = i14;
                        z20 = z14;
                        z21 = true;
                        coroutineSingletons = coroutineSingletons2;
                        objM18418c = interfaceC9933a3.m18418c(str8, num112, num113, str7, columnName3, serverSortName3, listM17255u3, boolValueOf4, bool8, str14, list14, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM18418c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z22 = z19;
                        str15 = str13;
                        str16 = str14;
                        i16 = i15;
                        z23 = z20;
                        vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                        str17 = str12;
                        ref$ObjectRef6 = ref$ObjectRef5;
                        results = (Results) objM18418c;
                        list3 = results.f19136d;
                        if (list3 != null) {
                            InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j8 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j8, vocabularyRepositoryImpl$networkVocabularyCards$1);
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                            str18 = str15;
                            ref$ObjectRef7 = ref$ObjectRef6;
                            list4 = list3;
                            str19 = str17;
                            str20 = str16;
                            results2 = results;
                            linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                            z25 = z22;
                            z26 = z23;
                            linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                            interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                            if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z27 = z26;
                            i17 = i16;
                            list5 = list4;
                            ref$ObjectRef8 = ref$ObjectRef7;
                            str21 = str20;
                            str22 = str18;
                            str23 = str19;
                            z28 = z25;
                            lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                            if (z28) {
                                z29 = z21;
                            } else {
                                z29 = false;
                            }
                            vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                            if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            results3 = results2;
                            results = results3;
                        }
                        list6 = results.f19136d;
                        if (list6 != 0) {
                            size = list6.size();
                        } else {
                            size = 0;
                        }
                        Integer num117 = new Integer(size);
                        Integer num118 = new Integer(results.f19133a);
                        collection = results.f19136d;
                        if (collection != null) {
                            arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                            it = collection.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        return new Triple(num117, num118, arrayList);
                    }
                    num = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                    if (num != null) {
                        list2 = list;
                        if (num.intValue() == -1) {
                            num2 = null;
                        }
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                        List<String> list15 = list2;
                        vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                        str12 = str8;
                        str13 = str7;
                        str14 = str9;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        z19 = z15;
                        Boolean bool9 = boolValueOf;
                        i15 = i14;
                        z20 = z14;
                        z21 = true;
                        coroutineSingletons = coroutineSingletons2;
                        objM18418c = interfaceC9933a3.m18418c(str8, num112, num113, str7, columnName3, serverSortName3, listM17255u3, boolValueOf4, bool9, str14, list15, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM18418c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z22 = z19;
                        str15 = str13;
                        str16 = str14;
                        i16 = i15;
                        z23 = z20;
                        vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                        str17 = str12;
                        ref$ObjectRef6 = ref$ObjectRef5;
                        results = (Results) objM18418c;
                        list3 = results.f19136d;
                        if (list3 != null) {
                            InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j9 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j9, vocabularyRepositoryImpl$networkVocabularyCards$1);
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                            str18 = str15;
                            ref$ObjectRef7 = ref$ObjectRef6;
                            list4 = list3;
                            str19 = str17;
                            str20 = str16;
                            results2 = results;
                            linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                            z25 = z22;
                            z26 = z23;
                            linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                            interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                            if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z27 = z26;
                            i17 = i16;
                            list5 = list4;
                            ref$ObjectRef8 = ref$ObjectRef7;
                            str21 = str20;
                            str22 = str18;
                            str23 = str19;
                            z28 = z25;
                            lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                            if (z28) {
                                z29 = z21;
                            } else {
                                z29 = false;
                            }
                            vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                            if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            results3 = results2;
                            results = results3;
                        }
                        list6 = results.f19136d;
                        if (list6 != 0) {
                            size = list6.size();
                        } else {
                            size = 0;
                        }
                        Integer num119 = new Integer(size);
                        Integer num1110 = new Integer(results.f19133a);
                        collection = results.f19136d;
                        if (collection != null) {
                            arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                            it = collection.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        return new Triple(num119, num1110, arrayList);
                    }
                    list2 = list;
                    num2 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                    List<String> list16 = list2;
                    vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                    str12 = str8;
                    str13 = str7;
                    str14 = str9;
                    ref$ObjectRef5 = ref$ObjectRef3;
                    z19 = z15;
                    Boolean bool10 = boolValueOf;
                    i15 = i14;
                    z20 = z14;
                    z21 = true;
                    coroutineSingletons = coroutineSingletons2;
                    objM18418c = interfaceC9933a3.m18418c(str8, num112, num113, str7, columnName3, serverSortName3, listM17255u3, boolValueOf4, bool10, str14, list16, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                    if (objM18418c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z22 = z19;
                    str15 = str13;
                    str16 = str14;
                    i16 = i15;
                    z23 = z20;
                    vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                    str17 = str12;
                    ref$ObjectRef6 = ref$ObjectRef5;
                    results = (Results) objM18418c;
                    list3 = results.f19136d;
                    if (list3 != null) {
                        InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j10 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j10, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                        str18 = str15;
                        ref$ObjectRef7 = ref$ObjectRef6;
                        list4 = list3;
                        str19 = str17;
                        str20 = str16;
                        results2 = results;
                        linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                        z25 = z22;
                        z26 = z23;
                        linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                        interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                        if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z27 = z26;
                        i17 = i16;
                        list5 = list4;
                        ref$ObjectRef8 = ref$ObjectRef7;
                        str21 = str20;
                        str22 = str18;
                        str23 = str19;
                        z28 = z25;
                        lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                        if (z28) {
                            z29 = z21;
                        } else {
                            z29 = false;
                        }
                        vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                        if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        results3 = results2;
                        results = results3;
                    }
                    list6 = results.f19136d;
                    if (list6 != 0) {
                        size = list6.size();
                    } else {
                        size = 0;
                    }
                    Integer num1111 = new Integer(size);
                    Integer num1112 = new Integer(results.f19133a);
                    collection = results.f19136d;
                    if (collection != null) {
                        arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                        it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    return new Triple(num1111, num1112, arrayList);
                case 3:
                    i13 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20666l;
                    z16 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I;
                    z17 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H;
                    i12 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k;
                    ref$ObjectRef4 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h;
                    str11 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g;
                    str7 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f;
                    str10 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e;
                    vocabularyRepositoryImpl3 = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d;
                    C7499b.m14977z0(objM14360a2);
                    z15 = z16;
                    z14 = z17;
                    i14 = i12;
                    VocabularyRepositoryImpl vocabularyRepositoryImpl10 = vocabularyRepositoryImpl3;
                    ref$ObjectRef3 = ref$ObjectRef4;
                    vocabularyRepositoryImpl2 = vocabularyRepositoryImpl10;
                    String str28 = str10;
                    str9 = str11;
                    str8 = str28;
                    final Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                    ref$IntRef4.f38125a = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22127a;
                    List<Integer> listM17255u4 = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14251L2(new InterfaceC2041a<Integer>() { // from class: com.lingq.shared.repository.VocabularyRepositoryImpl$networkVocabularyCards$statuses$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Integer mo807E() {
                            Ref$IntRef ref$IntRef5 = ref$IntRef4;
                            int i19 = ref$IntRef5.f38125a;
                            ref$IntRef5.f38125a = i19 + 1;
                            Integer numValueOf = Integer.valueOf(i19);
                            if (numValueOf.intValue() <= ref$ObjectRef3.f38127a.f22128b) {
                                return numValueOf;
                            }
                            return null;
                        }
                    })));
                    InterfaceC9933a interfaceC9933a4 = vocabularyRepositoryImpl2.f20621e;
                    Integer num1113 = new Integer(i14);
                    if (i13 == -1) {
                        i13 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22130d;
                    }
                    Integer num1114 = new Integer(i13);
                    String columnName4 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22129c.getColumnName();
                    String serverSortName4 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22131e.getServerSortName();
                    if (z14) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z18);
                    if (z15) {
                        if (z15) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolValueOf = Boolean.valueOf(z24);
                    } else {
                        boolValueOf = null;
                    }
                    T t13 = ref$ObjectRef3.f38127a;
                    list = ((VocabularySearchQuery) t13).f22133g;
                    Integer num1115 = ((VocabularySearchQuery) t13).f22135i.f38013b;
                    if (num1115 != null) {
                        num = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                        if (num != null) {
                            list2 = list;
                            if (num.intValue() == -1) {
                                num2 = null;
                            }
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                            List<String> list17 = list2;
                            vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                            str12 = str8;
                            str13 = str7;
                            str14 = str9;
                            ref$ObjectRef5 = ref$ObjectRef3;
                            z19 = z15;
                            Boolean bool11 = boolValueOf;
                            i15 = i14;
                            z20 = z14;
                            z21 = true;
                            coroutineSingletons = coroutineSingletons2;
                            objM18418c = interfaceC9933a4.m18418c(str8, num1113, num1114, str7, columnName4, serverSortName4, listM17255u4, boolValueOf5, bool11, str14, list17, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                            if (objM18418c == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z22 = z19;
                            str15 = str13;
                            str16 = str14;
                            i16 = i15;
                            z23 = z20;
                            vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                            str17 = str12;
                            ref$ObjectRef6 = ref$ObjectRef5;
                            results = (Results) objM18418c;
                            list3 = results.f19136d;
                            if (list3 != null) {
                                InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j11 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j11, vocabularyRepositoryImpl$networkVocabularyCards$1);
                                if (objM14360a == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                                str18 = str15;
                                ref$ObjectRef7 = ref$ObjectRef6;
                                list4 = list3;
                                str19 = str17;
                                str20 = str16;
                                results2 = results;
                                linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                                z25 = z22;
                                z26 = z23;
                                linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                                interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                                if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                z27 = z26;
                                i17 = i16;
                                list5 = list4;
                                ref$ObjectRef8 = ref$ObjectRef7;
                                str21 = str20;
                                str22 = str18;
                                str23 = str19;
                                z28 = z25;
                                lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                                if (z28) {
                                    z29 = z21;
                                } else {
                                    z29 = false;
                                }
                                vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                                vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                                if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                results3 = results2;
                                results = results3;
                            }
                            list6 = results.f19136d;
                            if (list6 != 0) {
                                size = list6.size();
                            } else {
                                size = 0;
                            }
                            Integer num1116 = new Integer(size);
                            Integer num1117 = new Integer(results.f19133a);
                            collection = results.f19136d;
                            if (collection != null) {
                                arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                                it = collection.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                                }
                            } else {
                                arrayList = EmptyList.f38032a;
                            }
                            return new Triple(num1116, num1117, arrayList);
                        }
                        list2 = list;
                        num2 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                        List<String> list18 = list2;
                        vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                        str12 = str8;
                        str13 = str7;
                        str14 = str9;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        z19 = z15;
                        Boolean bool12 = boolValueOf;
                        i15 = i14;
                        z20 = z14;
                        z21 = true;
                        coroutineSingletons = coroutineSingletons2;
                        objM18418c = interfaceC9933a4.m18418c(str8, num1113, num1114, str7, columnName4, serverSortName4, listM17255u4, boolValueOf5, bool12, str14, list18, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM18418c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z22 = z19;
                        str15 = str13;
                        str16 = str14;
                        i16 = i15;
                        z23 = z20;
                        vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                        str17 = str12;
                        ref$ObjectRef6 = ref$ObjectRef5;
                        results = (Results) objM18418c;
                        list3 = results.f19136d;
                        if (list3 != null) {
                            InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j12 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j12, vocabularyRepositoryImpl$networkVocabularyCards$1);
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                            str18 = str15;
                            ref$ObjectRef7 = ref$ObjectRef6;
                            list4 = list3;
                            str19 = str17;
                            str20 = str16;
                            results2 = results;
                            linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                            z25 = z22;
                            z26 = z23;
                            linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                            interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                            if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z27 = z26;
                            i17 = i16;
                            list5 = list4;
                            ref$ObjectRef8 = ref$ObjectRef7;
                            str21 = str20;
                            str22 = str18;
                            str23 = str19;
                            z28 = z25;
                            lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                            if (z28) {
                                z29 = z21;
                            } else {
                                z29 = false;
                            }
                            vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                            if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            results3 = results2;
                            results = results3;
                        }
                        list6 = results.f19136d;
                        if (list6 != 0) {
                            size = list6.size();
                        } else {
                            size = 0;
                        }
                        Integer num1118 = new Integer(size);
                        Integer num1119 = new Integer(results.f19133a);
                        collection = results.f19136d;
                        if (collection != null) {
                            arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                            it = collection.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        return new Triple(num1118, num1119, arrayList);
                    }
                    num = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                    if (num != null) {
                        list2 = list;
                        if (num.intValue() == -1) {
                            num2 = null;
                        }
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                        List<String> list19 = list2;
                        vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                        str12 = str8;
                        str13 = str7;
                        str14 = str9;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        z19 = z15;
                        Boolean bool13 = boolValueOf;
                        i15 = i14;
                        z20 = z14;
                        z21 = true;
                        coroutineSingletons = coroutineSingletons2;
                        objM18418c = interfaceC9933a4.m18418c(str8, num1113, num1114, str7, columnName4, serverSortName4, listM17255u4, boolValueOf5, bool13, str14, list19, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM18418c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z22 = z19;
                        str15 = str13;
                        str16 = str14;
                        i16 = i15;
                        z23 = z20;
                        vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                        str17 = str12;
                        ref$ObjectRef6 = ref$ObjectRef5;
                        results = (Results) objM18418c;
                        list3 = results.f19136d;
                        if (list3 != null) {
                            InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j13 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j13, vocabularyRepositoryImpl$networkVocabularyCards$1);
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                            str18 = str15;
                            ref$ObjectRef7 = ref$ObjectRef6;
                            list4 = list3;
                            str19 = str17;
                            str20 = str16;
                            results2 = results;
                            linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                            z25 = z22;
                            z26 = z23;
                            linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                            interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                            if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z27 = z26;
                            i17 = i16;
                            list5 = list4;
                            ref$ObjectRef8 = ref$ObjectRef7;
                            str21 = str20;
                            str22 = str18;
                            str23 = str19;
                            z28 = z25;
                            lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                            if (z28) {
                                z29 = z21;
                            } else {
                                z29 = false;
                            }
                            vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                            vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                            if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            results3 = results2;
                            results = results3;
                        }
                        list6 = results.f19136d;
                        if (list6 != 0) {
                            size = list6.size();
                        } else {
                            size = 0;
                        }
                        Integer num11110 = new Integer(size);
                        Integer num11111 = new Integer(results.f19133a);
                        collection = results.f19136d;
                        if (collection != null) {
                            arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                            it = collection.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        return new Triple(num11110, num11111, arrayList);
                    }
                    list2 = list;
                    num2 = ((VocabularySearchQuery) ref$ObjectRef3.f38127a).f22136j.f38013b;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl2;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str8;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str7;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str9;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef3;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i14;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z14;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z15;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 4;
                    List<String> list110 = list2;
                    vocabularyRepositoryImpl4 = vocabularyRepositoryImpl2;
                    str12 = str8;
                    str13 = str7;
                    str14 = str9;
                    ref$ObjectRef5 = ref$ObjectRef3;
                    z19 = z15;
                    Boolean bool14 = boolValueOf;
                    i15 = i14;
                    z20 = z14;
                    z21 = true;
                    coroutineSingletons = coroutineSingletons2;
                    objM18418c = interfaceC9933a4.m18418c(str8, num1113, num1114, str7, columnName4, serverSortName4, listM17255u4, boolValueOf5, bool14, str14, list110, num6, num2, vocabularyRepositoryImpl$networkVocabularyCards$1);
                    if (objM18418c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z22 = z19;
                    str15 = str13;
                    str16 = str14;
                    i16 = i15;
                    z23 = z20;
                    vocabularyRepositoryImpl5 = vocabularyRepositoryImpl4;
                    str17 = str12;
                    ref$ObjectRef6 = ref$ObjectRef5;
                    results = (Results) objM18418c;
                    list3 = results.f19136d;
                    if (list3 != null) {
                        InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j14 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j14, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                        str18 = str15;
                        ref$ObjectRef7 = ref$ObjectRef6;
                        list4 = list3;
                        str19 = str17;
                        str20 = str16;
                        results2 = results;
                        linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                        z25 = z22;
                        z26 = z23;
                        linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                        interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                        if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z27 = z26;
                        i17 = i16;
                        list5 = list4;
                        ref$ObjectRef8 = ref$ObjectRef7;
                        str21 = str20;
                        str22 = str18;
                        str23 = str19;
                        z28 = z25;
                        lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                        if (z28) {
                            z29 = z21;
                        } else {
                            z29 = false;
                        }
                        vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                        if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        results3 = results2;
                        results = results3;
                    }
                    list6 = results.f19136d;
                    if (list6 != 0) {
                        size = list6.size();
                    } else {
                        size = 0;
                    }
                    Integer num11112 = new Integer(size);
                    Integer num11113 = new Integer(results.f19133a);
                    collection = results.f19136d;
                    if (collection != null) {
                        arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                        it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    return new Triple(num11112, num11113, arrayList);
                case 4:
                    z22 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I;
                    z23 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H;
                    i16 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k;
                    ref$ObjectRef6 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h;
                    str16 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g;
                    str15 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f;
                    str17 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e;
                    vocabularyRepositoryImpl5 = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d;
                    C7499b.m14977z0(objM14360a2);
                    objM18418c = objM14360a2;
                    z21 = true;
                    coroutineSingletons = coroutineSingletons2;
                    results = (Results) objM18418c;
                    list3 = results.f19136d;
                    if (list3 != null) {
                        InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j15 = vocabularyRepositoryImpl5.f20622f.mo9686j();
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl5;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str17;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str15;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list3;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z23;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z22;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 5;
                        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j15, vocabularyRepositoryImpl$networkVocabularyCards$1);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        vocabularyRepositoryImpl6 = vocabularyRepositoryImpl5;
                        str18 = str15;
                        ref$ObjectRef7 = ref$ObjectRef6;
                        list4 = list3;
                        str19 = str17;
                        str20 = str16;
                        results2 = results;
                        linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                        z25 = z22;
                        z26 = z23;
                        linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                        interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                        if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z27 = z26;
                        i17 = i16;
                        list5 = list4;
                        ref$ObjectRef8 = ref$ObjectRef7;
                        str21 = str20;
                        str22 = str18;
                        str23 = str19;
                        z28 = z25;
                        lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                        if (z28) {
                            z29 = z21;
                        } else {
                            z29 = false;
                        }
                        vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                        vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                        if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        results3 = results2;
                        results = results3;
                    }
                    list6 = results.f19136d;
                    if (list6 != 0) {
                        size = list6.size();
                    } else {
                        size = 0;
                    }
                    Integer num11114 = new Integer(size);
                    Integer num11115 = new Integer(results.f19133a);
                    collection = results.f19136d;
                    if (collection != null) {
                        arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                        it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    return new Triple(num11114, num11115, arrayList);
                case 5:
                    z22 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I;
                    z23 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H;
                    i16 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k;
                    list4 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j;
                    results2 = (Results) vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i;
                    ref$ObjectRef7 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h;
                    str20 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g;
                    str18 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f;
                    str19 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e;
                    vocabularyRepositoryImpl6 = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d;
                    C7499b.m14977z0(objM14360a2);
                    objM14360a = objM14360a2;
                    z21 = true;
                    coroutineSingletons = coroutineSingletons2;
                    linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a);
                    z25 = z22;
                    z26 = z23;
                    linkedHashMapM13467T1.put(str19, new Integer((int) Math.ceil(((double) results2.f19133a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f38127a).f22130d))));
                    interfaceC5182d2 = vocabularyRepositoryImpl6.f20622f;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = vocabularyRepositoryImpl6;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = str19;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = str18;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = str20;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = ref$ObjectRef7;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = results2;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = list4;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k = i16;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H = z26;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I = z25;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 6;
                    if (interfaceC5182d2.mo9684h(linkedHashMapM13467T1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z27 = z26;
                    i17 = i16;
                    list5 = list4;
                    ref$ObjectRef8 = ref$ObjectRef7;
                    str21 = str20;
                    str22 = str18;
                    str23 = str19;
                    z28 = z25;
                    lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                    if (z28) {
                        z29 = z21;
                    } else {
                        z29 = false;
                    }
                    vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                    if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    results3 = results2;
                    results = results3;
                    list6 = results.f19136d;
                    if (list6 != 0) {
                        size = list6.size();
                    } else {
                        size = 0;
                    }
                    Integer num11116 = new Integer(size);
                    Integer num11117 = new Integer(results.f19133a);
                    collection = results.f19136d;
                    if (collection != null) {
                        arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                        it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    return new Triple(num11116, num11117, arrayList);
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    z28 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20654I;
                    boolean z34 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20653H;
                    int i19 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20665k;
                    List list20 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j;
                    results2 = (Results) vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i;
                    Ref$ObjectRef ref$ObjectRef10 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h;
                    String str29 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g;
                    String str30 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f;
                    String str31 = vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e;
                    vocabularyRepositoryImpl6 = (VocabularyRepositoryImpl) vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d;
                    C7499b.m14977z0(objM14360a2);
                    z27 = z34;
                    i17 = i19;
                    list5 = list20;
                    ref$ObjectRef8 = ref$ObjectRef10;
                    str21 = str29;
                    str22 = str30;
                    str23 = str31;
                    z21 = true;
                    coroutineSingletons = coroutineSingletons2;
                    lingQDatabase = vocabularyRepositoryImpl6.f20617a;
                    if (z28) {
                        z29 = z21;
                    } else {
                        z29 = false;
                    }
                    vocabularyRepositoryImpl$networkVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(str23, list5, z27, vocabularyRepositoryImpl6, str22, ref$ObjectRef8, i17, z29, str21, null);
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d = results2;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20659e = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20660f = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20661g = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20662h = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20663i = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20664j = null;
                    vocabularyRepositoryImpl$networkVocabularyCards$1.f20657L = 7;
                    if (RoomDatabaseKt.m4573a(lingQDatabase, vocabularyRepositoryImpl$networkVocabularyCards$2$1$1, vocabularyRepositoryImpl$networkVocabularyCards$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    results3 = results2;
                    results = results3;
                    list6 = results.f19136d;
                    if (list6 != 0) {
                        size = list6.size();
                    } else {
                        size = 0;
                    }
                    Integer num11118 = new Integer(size);
                    Integer num11119 = new Integer(results.f19133a);
                    collection = results.f19136d;
                    if (collection != null) {
                        arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                        it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    return new Triple(num11118, num11119, arrayList);
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    results3 = (Results) vocabularyRepositoryImpl$networkVocabularyCards$1.f20658d;
                    C7499b.m14977z0(objM14360a2);
                    results = results3;
                    list6 = results.f19136d;
                    if (list6 != 0) {
                        size = list6.size();
                    } else {
                        size = 0;
                    }
                    Integer num111110 = new Integer(size);
                    Integer num111111 = new Integer(results.f19133a);
                    collection = results.f19136d;
                    if (collection != null) {
                        arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                        it = collection.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ResultVocabularyCard) it.next()).f19050a);
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    return new Triple(num111110, num111111, arrayList);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception unused) {
            return new Triple(new Integer(0), new Integer(0), EmptyList.f38032a);
        }
    }
}
