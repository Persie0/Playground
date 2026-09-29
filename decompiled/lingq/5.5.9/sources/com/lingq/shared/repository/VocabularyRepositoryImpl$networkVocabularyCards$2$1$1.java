package com.lingq.shared.repository;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import bi.AbstractC1413d0;
import bi.AbstractC1495o1;
import bi.AbstractC1520r5;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultVocabularyCard;
import com.lingq.shared.uimodel.CardExtendedStatus;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.vocabulary.VocabularySearch;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import com.lingq.shared.uimodel.vocabulary.VocabularySort;
import dm.C5207g;
import dm.C5212l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C7076b;
import mo.C7661i;
import ni.C7793a;
import org.joda.time.DateTime;
import p003a2.C0009a;
import p096ei.C5408a;
import p260m8.C7499b;
import p288o4.C7915a;
import p367rh.C8791e;
import p367rh.C8799m;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.VocabularyRepositoryImpl$networkVocabularyCards$2$1$1", m19206f = "VocabularyRepository.kt", m19207l = {273, 289, 292, 295, 299}, m19208m = "invokeSuspend")
final class VocabularyRepositoryImpl$networkVocabularyCards$2$1$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ String f20667H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Ref$ObjectRef<VocabularySearchQuery> f20668I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f20669J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ boolean f20670K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ String f20671L;

    /* JADX INFO: renamed from: e */
    public List f20672e;

    /* JADX INFO: renamed from: f */
    public List f20673f;

    /* JADX INFO: renamed from: g */
    public List f20674g;

    /* JADX INFO: renamed from: h */
    public int f20675h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f20676i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List<ResultVocabularyCard> f20677j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f20678k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ VocabularyRepositoryImpl f20679l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(String str, List<ResultVocabularyCard> list, boolean z10, VocabularyRepositoryImpl vocabularyRepositoryImpl, String str2, Ref$ObjectRef<VocabularySearchQuery> ref$ObjectRef, int i10, boolean z11, String str3, InterfaceC9968c<? super VocabularyRepositoryImpl$networkVocabularyCards$2$1$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f20676i = str;
        this.f20677j = list;
        this.f20678k = z10;
        this.f20679l = vocabularyRepositoryImpl;
        this.f20667H = str2;
        this.f20668I = ref$ObjectRef;
        this.f20669J = i10;
        this.f20670K = z11;
        this.f20671L = str3;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyRepositoryImpl$networkVocabularyCards$2$1$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyRepositoryImpl$networkVocabularyCards$2$1$1(this.f20676i, this.f20677j, this.f20678k, this.f20679l, this.f20667H, this.f20668I, this.f20669J, this.f20670K, this.f20671L, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x03c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:134:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:137:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x03e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:142:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:144:0x03fd A[RETURN] */
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        VocabularyRepositoryImpl vocabularyRepositoryImpl;
        CoroutineSingletons coroutineSingletons;
        List list;
        int i10;
        String str;
        String strM768o;
        String strM611g;
        String str2;
        boolean zM11106a;
        String str3;
        Object objMo5173r0;
        List<C8791e> list2;
        List<C8799m> list3;
        List<C8799m> list4;
        List<C8791e> list5;
        AbstractC1520r5 abstractC1520r5;
        Ref$ObjectRef<VocabularySearchQuery> ref$ObjectRef;
        List<C8791e> list6;
        List<C8799m> list7;
        List<C8799m> list8;
        List<C8791e> list9;
        AbstractC1413d0 abstractC1413d0;
        List<C8799m> list10;
        AbstractC1495o1 abstractC1495o1;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f20675h;
        VocabularyRepositoryImpl vocabularyRepositoryImpl2 = this.f20679l;
        Ref$ObjectRef<VocabularySearchQuery> ref$ObjectRef2 = this.f20668I;
        if (i11 != 0) {
            if (i11 == 1) {
                List<C8799m> list11 = this.f20674g;
                List<C8791e> list12 = this.f20673f;
                List list13 = this.f20672e;
                C7499b.m14977z0(obj);
                list = list13;
                list2 = list12;
                list3 = list11;
                coroutineSingletons = coroutineSingletons2;
                objMo5173r0 = obj;
            } else if (i11 == 2) {
                List<C8799m> list14 = this.f20674g;
                List<C8791e> list15 = this.f20673f;
                List list16 = this.f20672e;
                C7499b.m14977z0(obj);
                list = list16;
                vocabularyRepositoryImpl = vocabularyRepositoryImpl2;
                ref$ObjectRef2 = ref$ObjectRef2;
                list6 = list15;
                list7 = list14;
                coroutineSingletons = coroutineSingletons2;
                List<C8791e> list17 = list6;
                list4 = list7;
                list5 = list17;
                abstractC1520r5 = vocabularyRepositoryImpl.f20618b;
                this.f20672e = list5;
                this.f20673f = list4;
                this.f20674g = null;
                this.f20675h = 3;
                if (abstractC1520r5.mo599i0(list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
                list9 = list5;
                list8 = list4;
                list10 = list8;
                if (ref$ObjectRef.f38127a.f22135i.f38013b != null) {
                    abstractC1413d0 = vocabularyRepositoryImpl.f20619c;
                    this.f20672e = list8;
                    this.f20673f = null;
                    this.f20675h = 4;
                    if (abstractC1413d0.mo5021q0(list9, this) == coroutineSingletons) {
                        list10 = list8;
                        return coroutineSingletons;
                    }
                }
                list10 = list8;
                if (ref$ObjectRef.f38127a.f22136j.f38013b != null) {
                    abstractC1495o1 = vocabularyRepositoryImpl.f20620d;
                    this.f20672e = null;
                    this.f20673f = null;
                    this.f20675h = 5;
                    if (abstractC1495o1.mo5135H0(list10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i11 == 3) {
                List<C8799m> list18 = this.f20673f;
                List<C8791e> list19 = this.f20672e;
                C7499b.m14977z0(obj);
                list8 = list18;
                vocabularyRepositoryImpl = vocabularyRepositoryImpl2;
                coroutineSingletons = coroutineSingletons2;
                ref$ObjectRef = ref$ObjectRef2;
                list9 = list19;
                list10 = list8;
                if (ref$ObjectRef.f38127a.f22135i.f38013b != null) {
                    abstractC1413d0 = vocabularyRepositoryImpl.f20619c;
                    this.f20672e = list8;
                    this.f20673f = null;
                    this.f20675h = 4;
                    if (abstractC1413d0.mo5021q0(list9, this) == coroutineSingletons) {
                        list10 = list8;
                        return coroutineSingletons;
                    }
                }
                list10 = list8;
                if (ref$ObjectRef.f38127a.f22136j.f38013b != null) {
                    abstractC1495o1 = vocabularyRepositoryImpl.f20620d;
                    this.f20672e = null;
                    this.f20673f = null;
                    this.f20675h = 5;
                    if (abstractC1495o1.mo5135H0(list10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i11 == 4) {
                List<C8799m> list20 = this.f20672e;
                C7499b.m14977z0(obj);
                list10 = list20;
                vocabularyRepositoryImpl = vocabularyRepositoryImpl2;
                coroutineSingletons = coroutineSingletons2;
                ref$ObjectRef = ref$ObjectRef2;
                list10 = list8;
                if (ref$ObjectRef.f38127a.f22136j.f38013b != null) {
                    abstractC1495o1 = vocabularyRepositoryImpl.f20620d;
                    this.f20672e = null;
                    this.f20673f = null;
                    this.f20675h = 5;
                    if (abstractC1495o1.mo5135H0(list10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str4 = this.f20676i;
        Locale localeForLanguageTag = Locale.forLanguageTag(str4);
        for (ResultVocabularyCard resultVocabularyCard : this.f20677j) {
            String str5 = resultVocabularyCard.f19050a;
            C5207g.m11110e(localeForLanguageTag, "locale");
            String strM15498b = C7793a.m15498b(str4, C7793a.m15502f(str5, localeForLanguageTag));
            String str6 = resultVocabularyCard.f19050a;
            arrayList.add(C5212l.m11175r(resultVocabularyCard, strM15498b, C5408a.m11573f(str6)));
            Integer num = ref$ObjectRef2.f38127a.f22135i.f38013b;
            if (num != null) {
                Integer num2 = num;
                arrayList2.add(new C8791e(C7793a.m15498b(str4, C7793a.m15502f(str6, localeForLanguageTag)), num2 != null ? num2.intValue() : 0));
            }
            Integer num3 = ref$ObjectRef2.f38127a.f22136j.f38013b;
            if (num3 != null) {
                Integer num4 = num3;
                arrayList3.add(new C8799m(C7793a.m15498b(str4, C7793a.m15502f(str6, localeForLanguageTag)), num4 != null ? num4.intValue() : 0));
            }
        }
        boolean z10 = this.f20678k;
        if (z10) {
            AbstractC1520r5 abstractC1520r6 = vocabularyRepositoryImpl2.f20618b;
            String string = C7076b.m14277B3(this.f20667H).toString();
            VocabularySearchQuery vocabularySearchQuery = ref$ObjectRef2.f38127a;
            int i12 = vocabularySearchQuery.f22127a;
            int i13 = vocabularySearchQuery.f22128b;
            String roomColumnName = vocabularySearchQuery.f22131e.getRoomColumnName();
            String columnName = ref$ObjectRef2.f38127a.f22129c.getColumnName();
            VocabularySearchQuery vocabularySearchQuery2 = ref$ObjectRef2.f38127a;
            Integer num5 = vocabularySearchQuery2.f22135i.f38013b;
            Integer num6 = vocabularySearchQuery2.f22136j.f38013b;
            List<String> list21 = vocabularySearchQuery2.f22133g;
            int i14 = vocabularySearchQuery2.f22130d;
            int i15 = this.f20669J - 1;
            this.f20672e = arrayList;
            this.f20673f = arrayList2;
            this.f20674g = arrayList3;
            this.f20675h = 1;
            abstractC1520r6.getClass();
            String strM15254T2 = C7661i.m15254T2(string, "'", "''");
            String string2 = this.f20671L;
            if (string2 == null) {
                string2 = new DateTime().toString();
                C5207g.m11110e(string2, "now().toString()");
            }
            ArrayList arrayList4 = new ArrayList();
            String str7 = num5 != null ? ",CourseAndCardsJoin" : "";
            String str8 = num6 != null ? ",LessonsAndCardsJoin" : "";
            CardStatus cardStatus = CardStatus.Known;
            String str9 = str7;
            String str10 = str8;
            if (i12 == cardStatus.getValue()) {
                i10 = i15;
                strM768o = C0009a.m20h("AND (Card.status == ", CardStatus.Learned.getValue(), " AND Card.extendedStatus == ", CardExtendedStatus.Known.getValue(), ")");
                str = roomColumnName;
            } else {
                i10 = i15;
                int value = cardStatus.getValue();
                str = roomColumnName;
                strM768o = i13 == value ? C0166e.m768o(C0009a.m25n("AND (Card.status BETWEEN ", i12, " AND ", i13, " OR Card.extendedStatus == "), CardExtendedStatus.Known.getValue(), ")") : C0166e.m768o(C0009a.m25n("AND (Card.status BETWEEN ", i12, " AND ", i13, " AND (Card.extendedStatus = "), CardExtendedStatus.NotKnown.getValue(), " OR Card.extendedStatus is null))");
            }
            if (!(strM15254T2.length() > 0)) {
                strM611g = "";
            } else if (C5207g.m11106a(columnName, VocabularySearch.MeaningContaining.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.meaningTerms LIKE '%", strM15254T2, "%'");
            } else if (C5207g.m11106a(columnName, VocabularySearch.StartsWith.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.term LIKE '", strM15254T2, "%'");
            } else if (C5207g.m11106a(columnName, VocabularySearch.EndsWith.getColumnName())) {
                strM611g = C0141b.m611g("AND Card.term LIKE '%", strM15254T2, "'");
            } else {
                strM611g = C5207g.m11106a(columnName, VocabularySearch.PhraseContaining.getColumnName()) ? C0141b.m611g("AND Card.fragment LIKE '%", strM15254T2, "%'") : C0141b.m611g("AND Card.term LIKE '%", strM15254T2, "%'");
            }
            String str11 = this.f20670K ? "AND Card.isPhrase = 1" : "";
            if (z10) {
                arrayList4.add(string2);
                str2 = "AND DATETIME(Card.srsDueDate) <= DATETIME(?)";
            } else {
                str2 = "";
            }
            String str12 = num5 != null ? "AND Card.termWithLanguage = CourseAndCardsJoin.termWithLanguage AND CourseAndCardsJoin.pk = " + num5 : "";
            String str13 = num6 != null ? "AND Card.termWithLanguage = LessonsAndCardsJoin.termWithLanguage AND LessonsAndCardsJoin.contentId = " + num6 : "";
            if (list21 == 0 || list21.isEmpty()) {
                zM11106a = true;
                str3 = "";
            } else {
                str3 = "";
                int i16 = 0;
                for (Object obj2 : list21) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    str3 = ((Object) str3) + (i16 == 0 ? "AND (" : "") + " Card.tags LIKE '%" + ((String) obj2) + "%' " + ((i16 == C9000b.m17249o(list21) || list21.size() <= 1) ? ")" : " OR ");
                    i16 = i17;
                }
                zM11106a = true;
            }
            String str14 = str;
            if (!C5207g.m11106a(str14, VocabularySort.Importance.getRoomColumnName())) {
                zM11106a = C5207g.m11106a(str14, VocabularySort.CreationDate.getRoomColumnName());
            }
            String strM611g2 = zM11106a ? C0141b.m611g("ORDER BY ", str14, " DESC") : C5207g.m11106a(str14, VocabularySort.Status.getRoomColumnName()) ? "ORDER BY Card.status ASC,Card.importance DESC, Card.term" : C0141b.m611g("ORDER BY Card.", str14, " ASC");
            int i18 = i10 * i14;
            StringBuilder sbM855o = C0204c.m855o("\n        SELECT Card.id FROM Card\n        ", str9, "\n        ", str10, "\n        WHERE Card.termWithLanguage LIKE '");
            C0166e.m777x(sbM855o, str4, "' || '\\_%' ESCAPE '\\'\n        ", strM768o, "\n        ");
            C0166e.m777x(sbM855o, strM611g, "\n        ", str11, "\n        ");
            C0166e.m777x(sbM855o, str2, "\n    ", str12, "\n    ");
            C0166e.m777x(sbM855o, str13, "\n    ", str3, "\n        ");
            sbM855o.append(strM611g2);
            sbM855o.append("\n        LIMIT ");
            sbM855o.append(i14);
            sbM855o.append(" OFFSET ");
            objMo5173r0 = abstractC1520r6.mo5173r0(new C7915a(C0166e.m768o(sbM855o, i18, "\n    "), arrayList4.toArray()), this);
            coroutineSingletons = coroutineSingletons2;
            if (objMo5173r0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = arrayList;
            list2 = arrayList2;
            list3 = arrayList3;
        } else {
            vocabularyRepositoryImpl = vocabularyRepositoryImpl2;
            ref$ObjectRef2 = ref$ObjectRef2;
            coroutineSingletons = coroutineSingletons2;
            list = arrayList;
            list5 = arrayList2;
            list4 = arrayList3;
        }
        abstractC1520r5 = vocabularyRepositoryImpl.f20618b;
        this.f20672e = list5;
        this.f20673f = list4;
        this.f20674g = null;
        this.f20675h = 3;
        if (abstractC1520r5.mo599i0(list, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        ref$ObjectRef = ref$ObjectRef2;
        list9 = list5;
        list8 = list4;
        list10 = list8;
        if (ref$ObjectRef.f38127a.f22135i.f38013b != null) {
            abstractC1413d0 = vocabularyRepositoryImpl.f20619c;
            this.f20672e = list8;
            this.f20673f = null;
            this.f20675h = 4;
            if (abstractC1413d0.mo5021q0(list9, this) == coroutineSingletons) {
                list10 = list8;
                return coroutineSingletons;
            }
        }
        list10 = list8;
        if (ref$ObjectRef.f38127a.f22136j.f38013b != null) {
            abstractC1495o1 = vocabularyRepositoryImpl.f20620d;
            this.f20672e = null;
            this.f20673f = null;
            this.f20675h = 5;
            if (abstractC1495o1.mo5135H0(list10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
        vocabularyRepositoryImpl = vocabularyRepositoryImpl2;
        AbstractC1520r5 abstractC1520r7 = vocabularyRepositoryImpl.f20618b;
        this.f20672e = list;
        this.f20673f = list2;
        this.f20674g = list3;
        this.f20675h = 2;
        list7 = list3;
        list6 = list2;
        if (abstractC1520r7.mo5166k0((List) objMo5173r0, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        List<C8791e> list110 = list6;
        list4 = list7;
        list5 = list110;
        abstractC1520r5 = vocabularyRepositoryImpl.f20618b;
        this.f20672e = list5;
        this.f20673f = list4;
        this.f20674g = null;
        this.f20675h = 3;
        if (abstractC1520r5.mo599i0(list, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        ref$ObjectRef = ref$ObjectRef2;
        list9 = list5;
        list8 = list4;
        list10 = list8;
        if (ref$ObjectRef.f38127a.f22135i.f38013b != null) {
            abstractC1413d0 = vocabularyRepositoryImpl.f20619c;
            this.f20672e = list8;
            this.f20673f = null;
            this.f20675h = 4;
            if (abstractC1413d0.mo5021q0(list9, this) == coroutineSingletons) {
                list10 = list8;
                return coroutineSingletons;
            }
        }
        list10 = list8;
        if (ref$ObjectRef.f38127a.f22136j.f38013b != null) {
            abstractC1495o1 = vocabularyRepositoryImpl.f20620d;
            this.f20672e = null;
            this.f20673f = null;
            this.f20675h = 5;
            if (abstractC1495o1.mo5135H0(list10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
