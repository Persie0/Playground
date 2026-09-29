package com.lingq.core.data.repository;

import androidx.room.AbstractC0747e;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.AbstractC1323k;
import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.ExportType;
import com.lingq.core.domain.model.status.CardExtendedStatus;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.vocabulary.VocabularySearch;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.requests.RequestClozeTest;
import com.lingq.core.network.api.result.ResultSkritterExport;
import com.lingq.core.network.api.result.ResultSkritterExportError;
import com.lingq.core.network.api.result.ResultSkritterVocab;
import com.lingq.core.network.api.result.ResultVocabularyCard;
import com.lingq.core.network.api.result.Results;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.AbstractC3204c;
import kotlinx.coroutines.flow.AbstractC3224d;
import org.joda.time.DateTime;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.br8;
import p000.c83;
import p000.cl9;
import p000.co0;
import p000.d32;
import p000.df4;
import p000.ei8;
import p000.fa4;
import p000.gd7;
import p000.gm5;
import p000.h0a;
import p000.hn1;
import p000.hy3;
import p000.hyc;
import p000.i88;
import p000.io1;
import p000.m88;
import p000.opc;
import p000.p33;
import p000.q99;
import p000.qk9;
import p000.qm5;
import p000.r3a;
import p000.r99;
import p000.rm5;
import p000.rxa;
import p000.sm5;
import p000.t99;
import p000.u0b;
import p000.um5;
import p000.ux5;
import p000.v91;
import p000.vi3;
import p000.vk9;
import p000.vma;
import p000.vz1;
import p000.wq1;
import p000.ws6;
import p000.x24;
import p000.x99;
import p000.xm5;
import p000.y38;
import p000.y7d;
import p000.zuc;

/* JADX INFO: renamed from: com.lingq.core.data.repository.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1308x implements u0b {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f16568a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1323k f16569b;

    /* JADX INFO: renamed from: c */
    public final io1 f16570c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1320h f16571d;

    /* JADX INFO: renamed from: e */
    public final co0 f16572e;

    /* JADX INFO: renamed from: f */
    public final vma f16573f;

    /* JADX INFO: renamed from: g */
    public final df4 f16574g;

    public C1308x(LingQDatabase lingQDatabase, AbstractC1323k abstractC1323k, io1 io1Var, AbstractC1320h abstractC1320h, co0 co0Var, vma vmaVar, df4 df4Var) {
        lingQDatabase.getClass();
        abstractC1323k.getClass();
        io1Var.getClass();
        abstractC1320h.getClass();
        co0Var.getClass();
        vmaVar.getClass();
        df4Var.getClass();
        this.f16568a = lingQDatabase;
        this.f16569b = abstractC1323k;
        this.f16570c = io1Var;
        this.f16571d = abstractC1320h;
        this.f16572e = co0Var;
        this.f16573f = vmaVar;
        this.f16574g = df4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m7409c(String str, ExportType exportType, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyRepositoryImpl$exportAllCards$1 vocabularyRepositoryImpl$exportAllCards$1;
        if (continuationImpl instanceof VocabularyRepositoryImpl$exportAllCards$1) {
            vocabularyRepositoryImpl$exportAllCards$1 = (VocabularyRepositoryImpl$exportAllCards$1) continuationImpl;
            int i = vocabularyRepositoryImpl$exportAllCards$1.f16338c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$exportAllCards$1.f16338c = i - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$exportAllCards$1 = new VocabularyRepositoryImpl$exportAllCards$1(this, continuationImpl);
            }
        } else {
            vocabularyRepositoryImpl$exportAllCards$1 = new VocabularyRepositoryImpl$exportAllCards$1(this, continuationImpl);
        }
        Object objM4910f = vocabularyRepositoryImpl$exportAllCards$1.f16336a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vocabularyRepositoryImpl$exportAllCards$1.f16338c;
        boolean z = false;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM4910f);
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.f47716a = CardStatus.New.getValue();
                List<Integer> listM15421q0 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new br8(ref$IntRef, 15)));
                co0 co0Var = this.f16572e;
                String lowerCase = exportType.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                vocabularyRepositoryImpl$exportAllCards$1.f16338c = 1;
                objM4910f = co0Var.m4910f(str, listM15421q0, lowerCase, vocabularyRepositoryImpl$exportAllCards$1);
                if (objM4910f == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM4910f);
            }
            String str2 = (String) ((i88) objM4910f).f43690b;
            if (str2 != null && (!vk9.m23391n0(str2))) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: d */
    public final Serializable m7410d(String str, ArrayList arrayList, ExportType exportType, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyRepositoryImpl$exportCards$1 vocabularyRepositoryImpl$exportCards$1;
        if (continuationImpl instanceof VocabularyRepositoryImpl$exportCards$1) {
            vocabularyRepositoryImpl$exportCards$1 = (VocabularyRepositoryImpl$exportCards$1) continuationImpl;
            int i = vocabularyRepositoryImpl$exportCards$1.f16341c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$exportCards$1.f16341c = i - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$exportCards$1 = new VocabularyRepositoryImpl$exportCards$1(this, continuationImpl);
            }
        } else {
            vocabularyRepositoryImpl$exportCards$1 = new VocabularyRepositoryImpl$exportCards$1(this, continuationImpl);
        }
        Object objM4909e = vocabularyRepositoryImpl$exportCards$1.f16339a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vocabularyRepositoryImpl$exportCards$1.f16341c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM4909e);
                co0 co0Var = this.f16572e;
                String lowerCase = exportType.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                vocabularyRepositoryImpl$exportCards$1.f16341c = 1;
                objM4909e = co0Var.m4909e(str, arrayList, lowerCase, vocabularyRepositoryImpl$exportCards$1);
                if (objM4909e == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM4909e);
            }
            return ((m88) objM4909e).m16681a();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m7411e(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyRepositoryImpl$exportCardsToSkritter$1 vocabularyRepositoryImpl$exportCardsToSkritter$1;
        Object failure;
        qm5 qm5Var;
        int i;
        if (continuationImpl instanceof VocabularyRepositoryImpl$exportCardsToSkritter$1) {
            vocabularyRepositoryImpl$exportCardsToSkritter$1 = (VocabularyRepositoryImpl$exportCardsToSkritter$1) continuationImpl;
            int i2 = vocabularyRepositoryImpl$exportCardsToSkritter$1.f16344c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$exportCardsToSkritter$1.f16344c = i2 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$exportCardsToSkritter$1 = new VocabularyRepositoryImpl$exportCardsToSkritter$1(this, continuationImpl);
            }
        } else {
            vocabularyRepositoryImpl$exportCardsToSkritter$1 = new VocabularyRepositoryImpl$exportCardsToSkritter$1(this, continuationImpl);
        }
        Object objM4907c = vocabularyRepositoryImpl$exportCardsToSkritter$1.f16342a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = vocabularyRepositoryImpl$exportCardsToSkritter$1.f16344c;
        Object obj = null;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM4907c);
            vocabularyRepositoryImpl$exportCardsToSkritter$1.f16344c = 1;
            objM4907c = this.f16572e.m4907c(str, list, "skritter", vocabularyRepositoryImpl$exportCardsToSkritter$1);
            if (objM4907c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM4907c);
        }
        NetworkResponse networkResponse = (NetworkResponse) objM4907c;
        if (networkResponse instanceof NetworkResponse.Success) {
            NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
            List listM8392a = ((ResultSkritterExport) success.getData()).m8392a();
            if ((listM8392a instanceof Collection) && listM8392a.isEmpty()) {
                i = 0;
            } else {
                Iterator it = listM8392a.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (fa4.m11650l(((ResultSkritterVocab) it.next()).m8394a(), "added") && (i = i + 1) < 0) {
                        vz1.m23626d0();
                        throw null;
                    }
                }
            }
            int size = ((ResultSkritterExport) success.getData()).m8392a().size() - i;
            if (((ResultSkritterExport) success.getData()).m8392a().isEmpty()) {
                sm5.Companion.getClass();
                h0a.f41641a.mo11433g("Skritter export returned no vocabulary entries", new Object[0]);
            }
            return new xm5(new x99(i, size));
        }
        if (!(networkResponse instanceof NetworkResponse.Error)) {
            gm5.m12750e();
            return null;
        }
        NetworkResponse.Error error = (NetworkResponse.Error) networkResponse;
        String body = error.getBody();
        if (body != null) {
            try {
                df4 df4Var = this.f16574g;
                df4Var.getClass();
                failure = ((ResultSkritterExportError) df4Var.m10321a(body, ResultSkritterExportError.Companion.serializer())).m8393a();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            obj = (String) (failure instanceof Result.Failure ? null : failure);
        }
        if (fa4.m11650l(obj, "skritter_not_connected")) {
            qm5Var = t99.f62024a;
        } else {
            qm5Var = fa4.m11650l(obj, "skritter_auth_expired") ? q99.f57482a : r99.f58948a;
        }
        rm5 rm5Var = sm5.Companion;
        String str2 = "Skritter export failed: code=" + error.getCode() + ", error=" + y38.m24933a(qm5Var.getClass()).m25414c();
        rm5Var.getClass();
        h0a.f41641a.mo11431b(str2, new Object[0]);
        return new um5(qm5Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Serializable m7412f(final List list, CardStatus cardStatus, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyRepositoryImpl$fetchCardsForReview$1 vocabularyRepositoryImpl$fetchCardsForReview$1;
        if (continuationImpl instanceof VocabularyRepositoryImpl$fetchCardsForReview$1) {
            vocabularyRepositoryImpl$fetchCardsForReview$1 = (VocabularyRepositoryImpl$fetchCardsForReview$1) continuationImpl;
            int i = vocabularyRepositoryImpl$fetchCardsForReview$1.f16347c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$fetchCardsForReview$1.f16347c = i - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$fetchCardsForReview$1 = new VocabularyRepositoryImpl$fetchCardsForReview$1(this, continuationImpl);
            }
        } else {
            vocabularyRepositoryImpl$fetchCardsForReview$1 = new VocabularyRepositoryImpl$fetchCardsForReview$1(this, continuationImpl);
        }
        Object objM2861d = vocabularyRepositoryImpl$fetchCardsForReview$1.f16345a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vocabularyRepositoryImpl$fetchCardsForReview$1.f16347c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            final int value = CardStatus.New.getValue();
            final int value2 = cardStatus.getValue();
            vocabularyRepositoryImpl$fetchCardsForReview$1.f16347c = 1;
            final rxa rxaVar = (rxa) this.f16569b;
            rxaVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM CardEntity WHERE termWithLanguage IN (");
            final int size = list.size();
            d32.m10005B(size, sb);
            sb.append(") AND status BETWEEN ");
            sb.append("?");
            sb.append(" AND ");
            sb.append("?");
            final String string = sb.toString();
            objM2861d = AbstractC0758a.m2861d(new vi3() { // from class: nxa
                @Override // p000.vi3
                public final Object invoke(Object obj) throws Exception {
                    List list2 = list;
                    int i3 = size;
                    int i4 = value;
                    int i5 = value2;
                    rxa rxaVar2 = rxaVar;
                    bk8 bk8Var = (bk8) obj;
                    bk8Var.getClass();
                    ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(string);
                    try {
                        Iterator it = list2.iterator();
                        int i6 = 1;
                        while (it.hasNext()) {
                            ik8VarMo2873e0.mo2874C(i6, (String) it.next());
                            i6++;
                        }
                        ik8VarMo2873e0.mo2878j(i3 + 1, i4);
                        ik8VarMo2873e0.mo2878j(i3 + 2, i5);
                        int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "term");
                        int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "termWithLanguage");
                        int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                        int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "url");
                        int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "fragment");
                        int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "status");
                        int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "extendedStatus");
                        int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lastReviewedCorrect");
                        int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "srsDueDate");
                        int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "notes");
                        int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audio");
                        int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e0, "importance");
                        int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e0, "meanings");
                        int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e0, "meaningTerms");
                        int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tags");
                        int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e0, "gTags");
                        int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e0, "words");
                        int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hiragana");
                        int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e0, "romaji");
                        int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e0, "pinyin");
                        int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hant");
                        int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hans");
                        int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e0, "jyutping");
                        int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e0, "chunk");
                        int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e0, "furigana");
                        int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e0, "latin");
                        int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isPhrase");
                        int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e0, "creationDate");
                        ArrayList arrayList = new ArrayList();
                        while (ik8VarMo2873e0.mo2876a0()) {
                            String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                            String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v2);
                            int i7 = iM14108v;
                            ArrayList arrayList2 = arrayList;
                            int i8 = (int) ik8VarMo2873e0.getLong(iM14108v3);
                            String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                            String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v5) ? null : ik8VarMo2873e0.mo2875L(iM14108v5);
                            int i9 = (int) ik8VarMo2873e0.getLong(iM14108v6);
                            Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v7) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v7));
                            String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                            String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                            String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                            String strMo2875L8 = ik8VarMo2873e0.isNull(iM14108v11) ? null : ik8VarMo2873e0.mo2875L(iM14108v11);
                            int i10 = (int) ik8VarMo2873e0.getLong(iM14108v12);
                            String strMo2875L9 = ik8VarMo2873e0.mo2875L(iM14108v13);
                            qn3 qn3Var = rxaVar2.f60014L;
                            List listM20059N = qn3Var.m20059N(strMo2875L9);
                            int i11 = iM14108v14;
                            String strMo2875L10 = ik8VarMo2873e0.mo2875L(i11);
                            iM14108v14 = i11;
                            int i12 = iM14108v15;
                            List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(i12) ? null : ik8VarMo2873e0.mo2875L(i12));
                            if (listM20058M == null) {
                                throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                            }
                            int i13 = iM14108v2;
                            int i14 = iM14108v16;
                            List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(i14) ? null : ik8VarMo2873e0.mo2875L(i14));
                            if (listM20058M2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                            }
                            iM14108v17 = iM14108v17;
                            List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v17) ? null : ik8VarMo2873e0.mo2875L(iM14108v17));
                            if (listM20058M3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                            }
                            int i15 = iM14108v18;
                            String strMo2875L11 = ik8VarMo2873e0.isNull(i15) ? null : ik8VarMo2873e0.mo2875L(i15);
                            int i16 = iM14108v19;
                            String strMo2875L12 = ik8VarMo2873e0.isNull(i16) ? null : ik8VarMo2873e0.mo2875L(i16);
                            int i17 = iM14108v20;
                            String strMo2875L13 = ik8VarMo2873e0.isNull(i17) ? null : ik8VarMo2873e0.mo2875L(i17);
                            iM14108v18 = i15;
                            int i18 = iM14108v21;
                            String strMo2875L14 = ik8VarMo2873e0.isNull(i18) ? null : ik8VarMo2873e0.mo2875L(i18);
                            iM14108v21 = i18;
                            int i19 = iM14108v22;
                            String strMo2875L15 = ik8VarMo2873e0.isNull(i19) ? null : ik8VarMo2873e0.mo2875L(i19);
                            iM14108v22 = i19;
                            int i20 = iM14108v23;
                            String strMo2875L16 = ik8VarMo2873e0.isNull(i20) ? null : ik8VarMo2873e0.mo2875L(i20);
                            iM14108v23 = i20;
                            int i21 = iM14108v24;
                            String strMo2875L17 = ik8VarMo2873e0.isNull(i21) ? null : ik8VarMo2873e0.mo2875L(i21);
                            iM14108v24 = i21;
                            int i22 = iM14108v25;
                            String strMo2875L18 = ik8VarMo2873e0.isNull(i22) ? null : ik8VarMo2873e0.mo2875L(i22);
                            iM14108v25 = i22;
                            int i23 = iM14108v26;
                            String strMo2875L19 = ik8VarMo2873e0.isNull(i23) ? null : ik8VarMo2873e0.mo2875L(i23);
                            iM14108v26 = i23;
                            iM14108v19 = i16;
                            iM14108v20 = i17;
                            int i24 = iM14108v27;
                            int i25 = iM14108v28;
                            iM14108v27 = i24;
                            arrayList2.add(new CardEntity(i8, i9, i10, numValueOf, strMo2875L, strMo2875L2, strMo2875L3, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, strMo2875L18, strMo2875L19, ik8VarMo2873e0.isNull(i25) ? null : ik8VarMo2873e0.mo2875L(i25), listM20059N, listM20058M, listM20058M2, listM20058M3, ((int) ik8VarMo2873e0.getLong(i24)) != 0));
                            iM14108v28 = i25;
                            iM14108v2 = i13;
                            iM14108v15 = i12;
                            iM14108v16 = i14;
                            arrayList = arrayList2;
                            iM14108v = i7;
                        }
                        ArrayList arrayList3 = arrayList;
                        ik8VarMo2873e0.close();
                        return arrayList3;
                    } catch (Throwable th) {
                        ik8VarMo2873e0.close();
                        throw th;
                    }
                }
            }, rxaVar.f60013K, vocabularyRepositoryImpl$fetchCardsForReview$1, true, true);
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM2861d);
        }
        Iterable iterable = (Iterable) objM2861d;
        ArrayList arrayList = new ArrayList(v91.m23189q0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Serializable m7413g(final String str, final List list, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyRepositoryImpl$fetchCardsForReviewWithDate$1 vocabularyRepositoryImpl$fetchCardsForReviewWithDate$1;
        if (continuationImpl instanceof VocabularyRepositoryImpl$fetchCardsForReviewWithDate$1) {
            vocabularyRepositoryImpl$fetchCardsForReviewWithDate$1 = (VocabularyRepositoryImpl$fetchCardsForReviewWithDate$1) continuationImpl;
            int i = vocabularyRepositoryImpl$fetchCardsForReviewWithDate$1.f16350c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$fetchCardsForReviewWithDate$1.f16350c = i - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$fetchCardsForReviewWithDate$1 = new VocabularyRepositoryImpl$fetchCardsForReviewWithDate$1(this, continuationImpl);
            }
        } else {
            vocabularyRepositoryImpl$fetchCardsForReviewWithDate$1 = new VocabularyRepositoryImpl$fetchCardsForReviewWithDate$1(this, continuationImpl);
        }
        Object objM2861d = vocabularyRepositoryImpl$fetchCardsForReviewWithDate$1.f16348a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vocabularyRepositoryImpl$fetchCardsForReviewWithDate$1.f16350c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            final int value = CardStatus.New.getValue();
            final int value2 = CardStatus.Learned.getValue();
            vocabularyRepositoryImpl$fetchCardsForReviewWithDate$1.f16350c = 1;
            final rxa rxaVar = (rxa) this.f16569b;
            rxaVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM CardEntity WHERE termWithLanguage IN (");
            final int size = list.size();
            d32.m10005B(size, sb);
            sb.append(") AND status BETWEEN ");
            sb.append("?");
            sb.append(" AND ");
            final String strM17739n = AbstractC3393o1.m17739n(sb, "?", " AND srsDueDate < ", "?");
            objM2861d = AbstractC0758a.m2861d(new vi3() { // from class: oxa
                @Override // p000.vi3
                public final Object invoke(Object obj) throws Exception {
                    List list2 = list;
                    int i3 = size;
                    int i4 = value;
                    int i5 = value2;
                    String str2 = str;
                    rxa rxaVar2 = rxaVar;
                    bk8 bk8Var = (bk8) obj;
                    bk8Var.getClass();
                    ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(strM17739n);
                    try {
                        Iterator it = list2.iterator();
                        int i6 = 1;
                        while (it.hasNext()) {
                            ik8VarMo2873e0.mo2874C(i6, (String) it.next());
                            i6++;
                        }
                        ik8VarMo2873e0.mo2878j(i3 + 1, i4);
                        ik8VarMo2873e0.mo2878j(i3 + 2, i5);
                        ik8VarMo2873e0.mo2874C(i3 + 3, str2);
                        int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "term");
                        int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "termWithLanguage");
                        int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                        int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "url");
                        int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "fragment");
                        int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "status");
                        int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "extendedStatus");
                        int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lastReviewedCorrect");
                        int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "srsDueDate");
                        int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "notes");
                        int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audio");
                        int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e0, "importance");
                        int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e0, "meanings");
                        int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e0, "meaningTerms");
                        int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tags");
                        int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e0, "gTags");
                        int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e0, "words");
                        int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hiragana");
                        int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e0, "romaji");
                        int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e0, "pinyin");
                        int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hant");
                        int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hans");
                        int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e0, "jyutping");
                        int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e0, "chunk");
                        int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e0, "furigana");
                        int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e0, "latin");
                        int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isPhrase");
                        int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e0, "creationDate");
                        ArrayList arrayList = new ArrayList();
                        while (ik8VarMo2873e0.mo2876a0()) {
                            String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                            String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v2);
                            int i7 = iM14108v;
                            ArrayList arrayList2 = arrayList;
                            int i8 = (int) ik8VarMo2873e0.getLong(iM14108v3);
                            String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                            String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v5) ? null : ik8VarMo2873e0.mo2875L(iM14108v5);
                            int i9 = (int) ik8VarMo2873e0.getLong(iM14108v6);
                            Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v7) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v7));
                            String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                            String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                            String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                            String strMo2875L8 = ik8VarMo2873e0.isNull(iM14108v11) ? null : ik8VarMo2873e0.mo2875L(iM14108v11);
                            int i10 = (int) ik8VarMo2873e0.getLong(iM14108v12);
                            String strMo2875L9 = ik8VarMo2873e0.mo2875L(iM14108v13);
                            qn3 qn3Var = rxaVar2.f60014L;
                            List listM20059N = qn3Var.m20059N(strMo2875L9);
                            int i11 = iM14108v14;
                            String strMo2875L10 = ik8VarMo2873e0.mo2875L(i11);
                            iM14108v14 = i11;
                            int i12 = iM14108v15;
                            List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(i12) ? null : ik8VarMo2873e0.mo2875L(i12));
                            if (listM20058M == null) {
                                throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                            }
                            int i13 = iM14108v2;
                            int i14 = iM14108v16;
                            List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(i14) ? null : ik8VarMo2873e0.mo2875L(i14));
                            if (listM20058M2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                            }
                            iM14108v17 = iM14108v17;
                            List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v17) ? null : ik8VarMo2873e0.mo2875L(iM14108v17));
                            if (listM20058M3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                            }
                            int i15 = iM14108v18;
                            String strMo2875L11 = ik8VarMo2873e0.isNull(i15) ? null : ik8VarMo2873e0.mo2875L(i15);
                            int i16 = iM14108v19;
                            String strMo2875L12 = ik8VarMo2873e0.isNull(i16) ? null : ik8VarMo2873e0.mo2875L(i16);
                            int i17 = iM14108v20;
                            String strMo2875L13 = ik8VarMo2873e0.isNull(i17) ? null : ik8VarMo2873e0.mo2875L(i17);
                            iM14108v18 = i15;
                            int i18 = iM14108v21;
                            String strMo2875L14 = ik8VarMo2873e0.isNull(i18) ? null : ik8VarMo2873e0.mo2875L(i18);
                            iM14108v21 = i18;
                            int i19 = iM14108v22;
                            String strMo2875L15 = ik8VarMo2873e0.isNull(i19) ? null : ik8VarMo2873e0.mo2875L(i19);
                            iM14108v22 = i19;
                            int i20 = iM14108v23;
                            String strMo2875L16 = ik8VarMo2873e0.isNull(i20) ? null : ik8VarMo2873e0.mo2875L(i20);
                            iM14108v23 = i20;
                            int i21 = iM14108v24;
                            String strMo2875L17 = ik8VarMo2873e0.isNull(i21) ? null : ik8VarMo2873e0.mo2875L(i21);
                            iM14108v24 = i21;
                            int i22 = iM14108v25;
                            String strMo2875L18 = ik8VarMo2873e0.isNull(i22) ? null : ik8VarMo2873e0.mo2875L(i22);
                            iM14108v25 = i22;
                            int i23 = iM14108v26;
                            String strMo2875L19 = ik8VarMo2873e0.isNull(i23) ? null : ik8VarMo2873e0.mo2875L(i23);
                            iM14108v26 = i23;
                            iM14108v19 = i16;
                            iM14108v20 = i17;
                            int i24 = iM14108v27;
                            int i25 = iM14108v28;
                            iM14108v27 = i24;
                            arrayList2.add(new CardEntity(i8, i9, i10, numValueOf, strMo2875L, strMo2875L2, strMo2875L3, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, strMo2875L18, strMo2875L19, ik8VarMo2873e0.isNull(i25) ? null : ik8VarMo2873e0.mo2875L(i25), listM20059N, listM20058M, listM20058M2, listM20058M3, ((int) ik8VarMo2873e0.getLong(i24)) != 0));
                            iM14108v28 = i25;
                            iM14108v2 = i13;
                            iM14108v15 = i12;
                            iM14108v16 = i14;
                            arrayList = arrayList2;
                            iM14108v = i7;
                        }
                        ArrayList arrayList3 = arrayList;
                        ik8VarMo2873e0.close();
                        return arrayList3;
                    } catch (Throwable th) {
                        ik8VarMo2873e0.close();
                        throw th;
                    }
                }
            }, rxaVar.f60013K, vocabularyRepositoryImpl$fetchCardsForReviewWithDate$1, true, true);
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM2861d);
        }
        Iterable iterable = (Iterable) objM2861d;
        ArrayList arrayList = new ArrayList(v91.m23189q0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m7414h(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyRepositoryImpl$fetchClozeTest$1 vocabularyRepositoryImpl$fetchClozeTest$1;
        if (continuationImpl instanceof VocabularyRepositoryImpl$fetchClozeTest$1) {
            vocabularyRepositoryImpl$fetchClozeTest$1 = (VocabularyRepositoryImpl$fetchClozeTest$1) continuationImpl;
            int i2 = vocabularyRepositoryImpl$fetchClozeTest$1.f16353c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$fetchClozeTest$1.f16353c = i2 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$fetchClozeTest$1 = new VocabularyRepositoryImpl$fetchClozeTest$1(this, continuationImpl);
            }
        } else {
            vocabularyRepositoryImpl$fetchClozeTest$1 = new VocabularyRepositoryImpl$fetchClozeTest$1(this, continuationImpl);
        }
        Object objM4908d = vocabularyRepositoryImpl$fetchClozeTest$1.f16351a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = vocabularyRepositoryImpl$fetchClozeTest$1.f16353c;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM4908d);
                co0 co0Var = this.f16572e;
                Integer num = new Integer(i);
                vocabularyRepositoryImpl$fetchClozeTest$1.f16353c = 1;
                objM4908d = co0Var.m4908d(str, num, vocabularyRepositoryImpl$fetchClozeTest$1);
                if (objM4908d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM4908d);
            }
            return new xm5(opc.m18203a((RequestClozeTest) objM4908d));
        } catch (Exception unused) {
            return new um5(x24.f67675d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x0124  */
    /* JADX WARN: Code duplicated, block: B:39:0x0138  */
    /* JADX WARN: Code duplicated, block: B:40:0x013f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0144  */
    /* JADX WARN: Code duplicated, block: B:43:0x0149  */
    /* JADX WARN: Code duplicated, block: B:46:0x0157  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:49:0x0180  */
    /* JADX WARN: Code duplicated, block: B:50:0x0193  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0202  */
    /* JADX WARN: Code duplicated, block: B:68:0x0205  */
    /* JADX WARN: Code duplicated, block: B:69:0x0208  */
    /* JADX WARN: Code duplicated, block: B:71:0x020b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0211  */
    /* JADX WARN: Code duplicated, block: B:74:0x0214  */
    /* JADX WARN: Code duplicated, block: B:75:0x0223  */
    /* JADX WARN: Code duplicated, block: B:77:0x0226  */
    /* JADX WARN: Code duplicated, block: B:78:0x0235  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x0254  */
    /* JADX WARN: Code duplicated, block: B:89:0x025c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0260  */
    /* JADX WARN: Code duplicated, block: B:93:0x0269  */
    /* JADX WARN: Code duplicated, block: B:99:0x027d  */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0214, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0226, please report this as an issue */
    /* JADX INFO: renamed from: i */
    public final Object m7415i(String str, String str2, boolean z, boolean z2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyRepositoryImpl$fetchVocabularyPageSize$1 vocabularyRepositoryImpl$fetchVocabularyPageSize$1;
        String str4;
        String strM14766a;
        boolean z3;
        String str5;
        boolean z4;
        VocabularySearchQuery vocabularySearchQuery;
        String str6;
        VocabularySearchQuery vocabularySearchQuery2;
        String str7;
        String str8;
        LinkedHashMap linkedHashMapM15372Y;
        boolean z5;
        VocabularySearchQuery vocabularySearchQuery3;
        String str9;
        boolean z6;
        String str10;
        String string;
        int i;
        int i2;
        String columnName;
        Integer num;
        Integer num2;
        List list;
        ArrayList arrayList;
        String str11;
        String str12;
        String str13;
        CardStatus cardStatus;
        String str14;
        List list2;
        boolean z7;
        String strM24123s;
        String strM24118n;
        String str15;
        String str16;
        String str17;
        String str18;
        List list3;
        Iterator it;
        int i3;
        String str19;
        Object next;
        int i4;
        String str20;
        String str21;
        if (continuationImpl instanceof VocabularyRepositoryImpl$fetchVocabularyPageSize$1) {
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1 = (VocabularyRepositoryImpl$fetchVocabularyPageSize$1) continuationImpl;
            int i5 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16362i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16362i = i5 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1 = new VocabularyRepositoryImpl$fetchVocabularyPageSize$1(this, continuationImpl);
            }
        } else {
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1 = new VocabularyRepositoryImpl$fetchVocabularyPageSize$1(this, continuationImpl);
        }
        Object objM15541t = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16360g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16362i;
        vma vmaVar = this.f16573f;
        if (i6 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1371d) vmaVar).f18580q;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16354a = str;
            str4 = str2;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16355b = str4;
            strM14766a = str3;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16356c = strM14766a;
            z3 = z;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16358e = z3;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16359f = z2;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16362i = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, vocabularyRepositoryImpl$fetchVocabularyPageSize$1);
            if (objM15541t != coroutineSingletons) {
                str5 = str;
                z4 = z2;
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            z4 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16359f;
            boolean z8 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16358e;
            strM14766a = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16356c;
            String str22 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16355b;
            str5 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16354a;
            AbstractC3193b.m15359b(objM15541t);
            z3 = z8;
            str4 = str22;
        } else {
            if (i6 == 2) {
                z4 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16359f;
                boolean z9 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16358e;
                vocabularySearchQuery2 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16357d;
                strM14766a = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16356c;
                String str23 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16355b;
                str5 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16354a;
                AbstractC3193b.m15359b(objM15541t);
                str6 = str23;
                z3 = z9;
                str7 = strM14766a;
                str8 = str6;
                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
                linkedHashMapM15372Y.put(str5, vocabularySearchQuery2);
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16354a = str5;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16355b = str8;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16356c = str7;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16357d = vocabularySearchQuery2;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16358e = z3;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16359f = z4;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16362i = 3;
                if (((C1371d) vmaVar).m7974n(linkedHashMapM15372Y, vocabularyRepositoryImpl$fetchVocabularyPageSize$1) != coroutineSingletons) {
                    z5 = z4;
                    vocabularySearchQuery3 = vocabularySearchQuery2;
                    str9 = str8;
                    z6 = z3;
                    str10 = str5;
                }
                return coroutineSingletons;
            }
            if (i6 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z5 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16359f;
            z6 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16358e;
            vocabularySearchQuery3 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16357d;
            str7 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16356c;
            str9 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16355b;
            str10 = vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16354a;
            AbstractC3193b.m15359b(objM15541t);
        }
        str5 = str10;
        z3 = z6;
        vocabularySearchQuery = vocabularySearchQuery3;
        strM14766a = str7;
        str4 = str9;
        z4 = z5;
        string = vk9.m23376L0(str4).toString();
        i = vocabularySearchQuery.f19859a;
        i2 = vocabularySearchQuery.f19860b;
        columnName = vocabularySearchQuery.f19861c.getColumnName();
        num = (Integer) vocabularySearchQuery.f19867i.f47624b;
        num2 = (Integer) vocabularySearchQuery.f19868j.f47624b;
        list = vocabularySearchQuery.f19865g;
        AbstractC1323k abstractC1323k = this.f16569b;
        abstractC1323k.getClass();
        str5.getClass();
        string.getClass();
        columnName.getClass();
        if (strM14766a == null) {
            strM14766a = hy3.f43148E.m14766a(new DateTime());
        }
        arrayList = new ArrayList();
        str11 = "";
        if (num != null) {
            str12 = ",CourseAndCardsJoin";
        } else {
            str12 = "";
        }
        if (num2 != null) {
            str13 = ",LessonsAndCardsJoin";
        } else {
            str13 = "";
        }
        cardStatus = CardStatus.Known;
        str14 = ")";
        if (i == cardStatus.getValue()) {
            list2 = list;
            strM24123s = ux5.m22987j(CardStatus.Learned.getValue(), CardExtendedStatus.Known.getValue(), "AND (CardEntity.status == ", " AND CardEntity.extendedStatus == ", ")");
            z7 = z4;
        } else {
            list2 = list;
            z7 = z4;
            if (i2 == cardStatus.getValue()) {
                strM24123s = wq1.m24123s(ux5.m22994q(i, i2, "AND (CardEntity.status BETWEEN ", " AND ", " OR CardEntity.extendedStatus == "), CardExtendedStatus.Known.getValue(), ")");
            } else {
                strM24123s = wq1.m24123s(ux5.m22994q(i, i2, "AND (CardEntity.status BETWEEN ", " AND ", " AND (CardEntity.extendedStatus = "), CardExtendedStatus.NotKnown.getValue(), " OR CardEntity.extendedStatus is null))");
            }
        }
        if (string.length() > 0) {
            strM24118n = "";
        } else if (columnName.equals(VocabularySearch.MeaningContaining.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.meaningTerms LIKE '%", string, "%'");
        } else if (columnName.equals(VocabularySearch.StartsWith.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '", string, "%'");
        } else if (columnName.equals(VocabularySearch.EndsWith.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '%", string, "'");
        } else if (columnName.equals(VocabularySearch.PhraseContaining.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.fragment LIKE '%", string, "%'");
        } else {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '%", string, "%'");
        }
        if (z7) {
            str15 = "AND CardEntity.isPhrase = 1";
        } else {
            str15 = "";
        }
        if (z3) {
            arrayList.add(strM14766a);
            str16 = "AND DATETIME(CardEntity.srsDueDate) <= DATETIME(?)";
        } else {
            str16 = "";
        }
        if (num != null) {
            str17 = "AND CardEntity.termWithLanguage = CourseAndCardsJoin.termWithLanguage AND CourseAndCardsJoin.pk = " + num;
        } else {
            str17 = "";
        }
        if (num2 != null) {
            str18 = "AND CardEntity.termWithLanguage = LessonsAndCardsJoin.termWithLanguage AND LessonsAndCardsJoin.contentId = " + num2;
        } else {
            str18 = "";
        }
        list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            it = list2.iterator();
            i3 = 0;
            str19 = "";
            while (it.hasNext()) {
                next = it.next();
                i4 = i3 + 1;
                if (i3 >= 0) {
                    vz1.m23628e0();
                    throw 0;
                }
                String str24 = (String) next;
                if (i3 == 0) {
                    str20 = "AND (";
                } else {
                    str20 = "";
                }
                Iterator it2 = it;
                if (i3 != vz1.m23602H(list2) || list2.size() <= 1) {
                    str21 = str14;
                } else {
                    str21 = " OR ";
                }
                str19 = ((Object) str19) + str20 + " CardEntity.tags LIKE '%" + str24 + "%' " + str21;
                str14 = str14;
                it = it2;
                i3 = i4;
            }
            str11 = str19;
        }
        StringBuilder sbM23000w = ux5.m23000w("\n        SELECT COUNT(*) as total_cards FROM CardEntity\n        ", str12, "\n        ", str13, "\n        WHERE CardEntity.termWithLanguage LIKE '");
        AbstractC3393o1.m17725C(sbM23000w, str5, "' || '\\_%' ESCAPE '\\'\n        ", strM24123s, "\n        ");
        AbstractC3393o1.m17725C(sbM23000w, strM24118n, "\n        ", str15, "\n        ");
        AbstractC3393o1.m17725C(sbM23000w, str16, "\n    ", str17, "\n    ");
        p33 p33Var = new p33(20, wq1.m24125u(sbM23000w, str18, "\n    ", str11, "\n    "), arrayList.toArray());
        TreeMap treeMap = ei8.f37291h;
        p33 p33VarM11161a = hyc.m13591a(p33Var).m11161a();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((rxa) abstractC1323k).f60013K, true, new String[]{"CardEntity"}, new gd7(p33VarM11161a.mo2959x(), p33VarM11161a, 1)));
        vocabularySearchQuery = (VocabularySearchQuery) ((Map) objM15541t).get(str5);
        if (vocabularySearchQuery == null) {
            VocabularySearchQuery vocabularySearchQuery4 = new VocabularySearchQuery();
            c83 c83Var2 = ((C1371d) vmaVar).f18580q;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16354a = str5;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16355b = str4;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16356c = strM14766a;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16357d = vocabularySearchQuery4;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16358e = z3;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16359f = z4;
            vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16362i = 2;
            Object objM15541t2 = AbstractC3224d.m15541t(c83Var2, vocabularyRepositoryImpl$fetchVocabularyPageSize$1);
            if (objM15541t2 != coroutineSingletons) {
                str6 = str4;
                vocabularySearchQuery2 = vocabularySearchQuery4;
                objM15541t = objM15541t2;
                str7 = strM14766a;
                str8 = str6;
                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
                linkedHashMapM15372Y.put(str5, vocabularySearchQuery2);
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16354a = str5;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16355b = str8;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16356c = str7;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16357d = vocabularySearchQuery2;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16358e = z3;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16359f = z4;
                vocabularyRepositoryImpl$fetchVocabularyPageSize$1.f16362i = 3;
                if (((C1371d) vmaVar).m7974n(linkedHashMapM15372Y, vocabularyRepositoryImpl$fetchVocabularyPageSize$1) != coroutineSingletons) {
                    z5 = z4;
                    vocabularySearchQuery3 = vocabularySearchQuery2;
                    str9 = str8;
                    z6 = z3;
                    str10 = str5;
                    str5 = str10;
                    z3 = z6;
                    vocabularySearchQuery = vocabularySearchQuery3;
                    strM14766a = str7;
                    str4 = str9;
                    z4 = z5;
                }
            }
            return coroutineSingletons;
        }
        string = vk9.m23376L0(str4).toString();
        i = vocabularySearchQuery.f19859a;
        i2 = vocabularySearchQuery.f19860b;
        columnName = vocabularySearchQuery.f19861c.getColumnName();
        num = (Integer) vocabularySearchQuery.f19867i.f47624b;
        num2 = (Integer) vocabularySearchQuery.f19868j.f47624b;
        list = vocabularySearchQuery.f19865g;
        AbstractC1323k abstractC1323k2 = this.f16569b;
        abstractC1323k2.getClass();
        str5.getClass();
        string.getClass();
        columnName.getClass();
        if (strM14766a == null) {
            strM14766a = hy3.f43148E.m14766a(new DateTime());
        }
        arrayList = new ArrayList();
        str11 = "";
        if (num != null) {
            str12 = ",CourseAndCardsJoin";
        } else {
            str12 = "";
        }
        if (num2 != null) {
            str13 = ",LessonsAndCardsJoin";
        } else {
            str13 = "";
        }
        cardStatus = CardStatus.Known;
        str14 = ")";
        if (i == cardStatus.getValue()) {
            list2 = list;
            strM24123s = ux5.m22987j(CardStatus.Learned.getValue(), CardExtendedStatus.Known.getValue(), "AND (CardEntity.status == ", " AND CardEntity.extendedStatus == ", ")");
            z7 = z4;
        } else {
            list2 = list;
            z7 = z4;
            if (i2 == cardStatus.getValue()) {
                strM24123s = wq1.m24123s(ux5.m22994q(i, i2, "AND (CardEntity.status BETWEEN ", " AND ", " OR CardEntity.extendedStatus == "), CardExtendedStatus.Known.getValue(), ")");
            } else {
                strM24123s = wq1.m24123s(ux5.m22994q(i, i2, "AND (CardEntity.status BETWEEN ", " AND ", " AND (CardEntity.extendedStatus = "), CardExtendedStatus.NotKnown.getValue(), " OR CardEntity.extendedStatus is null))");
            }
        }
        if (string.length() > 0) {
            strM24118n = "";
        } else if (columnName.equals(VocabularySearch.MeaningContaining.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.meaningTerms LIKE '%", string, "%'");
        } else if (columnName.equals(VocabularySearch.StartsWith.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '", string, "%'");
        } else if (columnName.equals(VocabularySearch.EndsWith.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '%", string, "'");
        } else if (columnName.equals(VocabularySearch.PhraseContaining.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.fragment LIKE '%", string, "%'");
        } else {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '%", string, "%'");
        }
        if (z7) {
            str15 = "AND CardEntity.isPhrase = 1";
        } else {
            str15 = "";
        }
        if (z3) {
            arrayList.add(strM14766a);
            str16 = "AND DATETIME(CardEntity.srsDueDate) <= DATETIME(?)";
        } else {
            str16 = "";
        }
        if (num != null) {
            str17 = "AND CardEntity.termWithLanguage = CourseAndCardsJoin.termWithLanguage AND CourseAndCardsJoin.pk = " + num;
        } else {
            str17 = "";
        }
        if (num2 != null) {
            str18 = "AND CardEntity.termWithLanguage = LessonsAndCardsJoin.termWithLanguage AND LessonsAndCardsJoin.contentId = " + num2;
        } else {
            str18 = "";
        }
        list3 = list2;
        if (list3 != null) {
            it = list2.iterator();
            i3 = 0;
            str19 = "";
            while (it.hasNext()) {
                next = it.next();
                i4 = i3 + 1;
                if (i3 >= 0) {
                    vz1.m23628e0();
                    throw 0;
                }
                String str25 = (String) next;
                if (i3 == 0) {
                    str20 = "AND (";
                } else {
                    str20 = "";
                }
                Iterator it3 = it;
                if (i3 != vz1.m23602H(list2)) {
                    str21 = str14;
                } else {
                    str21 = str14;
                }
                str19 = ((Object) str19) + str20 + " CardEntity.tags LIKE '%" + str25 + "%' " + str21;
                str14 = str14;
                it = it3;
                i3 = i4;
            }
            str11 = str19;
        }
        StringBuilder sbM23000w2 = ux5.m23000w("\n        SELECT COUNT(*) as total_cards FROM CardEntity\n        ", str12, "\n        ", str13, "\n        WHERE CardEntity.termWithLanguage LIKE '");
        AbstractC3393o1.m17725C(sbM23000w2, str5, "' || '\\_%' ESCAPE '\\'\n        ", strM24123s, "\n        ");
        AbstractC3393o1.m17725C(sbM23000w2, strM24118n, "\n        ", str15, "\n        ");
        AbstractC3393o1.m17725C(sbM23000w2, str16, "\n    ", str17, "\n    ");
        p33 p33Var2 = new p33(20, wq1.m24125u(sbM23000w2, str18, "\n    ", str11, "\n    "), arrayList.toArray());
        TreeMap treeMap2 = ei8.f37291h;
        p33 p33VarM11161a2 = hyc.m13591a(p33Var2).m11161a();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((rxa) abstractC1323k2).f60013K, true, new String[]{"CardEntity"}, new gd7(p33VarM11161a2.mo2959x(), p33VarM11161a2, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0204  */
    /* JADX WARN: Code duplicated, block: B:110:0x021a A[LOOP:0: B:108:0x0214->B:110:0x021a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1 A[Catch: Exception -> 0x007b, TRY_ENTER, TryCatch #9 {Exception -> 0x007b, blocks: (B:29:0x0076, B:52:0x00de, B:48:0x00c1), top: B:118:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0164 A[Catch: Exception -> 0x01a2, TryCatch #11 {Exception -> 0x01a2, blocks: (B:68:0x015a, B:70:0x0164, B:71:0x0173, B:73:0x0179, B:76:0x01a7), top: B:132:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0179 A[Catch: Exception -> 0x01a2, LOOP:1: B:71:0x0173->B:73:0x0179, LOOP_END, TryCatch #11 {Exception -> 0x01a2, blocks: (B:68:0x015a, B:70:0x0164, B:71:0x0173, B:73:0x0179, B:76:0x01a7), top: B:132:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [co0] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.String, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
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
    /* JADX INFO: renamed from: j */
    public final Serializable m7416j(String str, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyRepositoryImpl$loadCardsForAnswers$1 vocabularyRepositoryImpl$loadCardsForAnswers$1;
        VocabularyRepositoryImpl$loadCardsForAnswers$1 vocabularyRepositoryImpl$loadCardsForAnswers$2;
        int i;
        ?? r4;
        ?? r14;
        ?? r5;
        Object objM2861d;
        ArrayList arrayList;
        Iterator it;
        String str2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        LinkedHashMap linkedHashMapM15372Y;
        String str3;
        AbstractC1323k abstractC1323k;
        VocabularyRepositoryImpl$loadCardsForAnswers$1 vocabularyRepositoryImpl$loadCardsForAnswers$3;
        Object objM4906b;
        Locale localeForLanguageTag;
        List list;
        ArrayList arrayList2;
        Object objMo4096w0;
        if (continuationImpl instanceof VocabularyRepositoryImpl$loadCardsForAnswers$1) {
            vocabularyRepositoryImpl$loadCardsForAnswers$1 = (VocabularyRepositoryImpl$loadCardsForAnswers$1) continuationImpl;
            int i2 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = i2 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$loadCardsForAnswers$1 = new VocabularyRepositoryImpl$loadCardsForAnswers$1(this, continuationImpl);
            }
        } else {
            vocabularyRepositoryImpl$loadCardsForAnswers$1 = new VocabularyRepositoryImpl$loadCardsForAnswers$1(this, continuationImpl);
        }
        Object objM15541t = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16366d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r6 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f;
        AbstractC1323k abstractC1323k2 = this.f16569b;
        vma vmaVar = this.f16573f;
        Object obj = null;
        try {
            try {
                switch (r6) {
                    case 0:
                        AbstractC3193b.m15359b(objM15541t);
                        try {
                            ref$ObjectRef = new Ref$ObjectRef();
                            try {
                                c83 c83Var = ((C1371d) vmaVar).f18580q;
                                str2 = str;
                                try {
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a = str2;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b = ref$ObjectRef;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c = ref$ObjectRef;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = 1;
                                    objM15541t = AbstractC3224d.m15541t(c83Var, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                    if (objM15541t != coroutineSingletons) {
                                        ref$ObjectRef2 = ref$ObjectRef;
                                        ref$ObjectRef.f47718a = ((Map) objM15541t).get(str2);
                                        if (ref$ObjectRef2.f47718a == null) {
                                            ref$ObjectRef2.f47718a = new VocabularySearchQuery();
                                            c83 c83Var2 = ((C1371d) vmaVar).f18580q;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a = str2;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b = ref$ObjectRef2;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c = null;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = 2;
                                            objM15541t = AbstractC3224d.m15541t(c83Var2, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                            if (objM15541t == coroutineSingletons) {
                                                ref$ObjectRef3 = ref$ObjectRef2;
                                                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
                                                linkedHashMapM15372Y.put(str2, ref$ObjectRef3.f47718a);
                                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a = str2;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b = ref$ObjectRef3;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c = null;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = 3;
                                                if (((C1371d) vmaVar).m7974n(linkedHashMapM15372Y, vocabularyRepositoryImpl$loadCardsForAnswers$1) != coroutineSingletons) {
                                                    str3 = str2;
                                                    ref$ObjectRef2 = ref$ObjectRef3;
                                                    r6 = str3;
                                                }
                                            }
                                        } else {
                                            r6 = str2;
                                        }
                                        List listM15421q0 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new br8(ref$ObjectRef2, 14)));
                                        ?? r0 = this.f16572e;
                                        try {
                                            Integer num = new Integer(1);
                                            try {
                                                Integer num2 = new Integer(200);
                                                String serverSortName = ((VocabularySearchQuery) ref$ObjectRef2.f47718a).f19863e.getServerSortName();
                                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a = r6;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b = null;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c = null;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = 4;
                                                abstractC1323k = abstractC1323k2;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$3 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                                                coroutineSingletons = coroutineSingletons;
                                                i = 10;
                                                try {
                                                    objM4906b = r0.m4906b(r6, num, num2, null, null, serverSortName, listM15421q0, null, null, null, null, null, null, vocabularyRepositoryImpl$loadCardsForAnswers$3);
                                                    vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$3;
                                                    r6 = r6;
                                                    if (objM4906b == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    try {
                                                        localeForLanguageTag = Locale.forLanguageTag(r6);
                                                        list = ((Results) objM4906b).f21739d;
                                                        if (list != null) {
                                                            List<ResultVocabularyCard> list2 = list;
                                                            arrayList2 = new ArrayList(v91.m23189q0(list2, i));
                                                            for (ResultVocabularyCard resultVocabularyCard : list2) {
                                                                String strM8398c = resultVocabularyCard.m8398c();
                                                                localeForLanguageTag.getClass();
                                                                arrayList2.add(zuc.m25805m(resultVocabularyCard, vz1.m23629f(r6, vz1.m23610P(strM8398c, localeForLanguageTag)), y7d.m24985d(resultVocabularyCard.m8398c()), resultVocabularyCard.m8396a()));
                                                            }
                                                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r6;
                                                            obj = null;
                                                            obj = null;
                                                            obj = null;
                                                            try {
                                                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = null;
                                                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = null;
                                                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 5;
                                                                abstractC1323k2 = abstractC1323k;
                                                                try {
                                                                    objMo4096w0 = abstractC1323k2.mo4096w0(arrayList2, vocabularyRepositoryImpl$loadCardsForAnswers$2);
                                                                    r6 = r6;
                                                                    if (objMo4096w0 == coroutineSingletons) {
                                                                        return coroutineSingletons;
                                                                    }
                                                                    r5 = r6;
                                                                    r14 = obj;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    e.printStackTrace();
                                                                    r5 = r6;
                                                                    r14 = obj;
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                abstractC1323k2 = abstractC1323k;
                                                                e.printStackTrace();
                                                                r5 = r6;
                                                                r14 = obj;
                                                            }
                                                        } else {
                                                            abstractC1323k2 = abstractC1323k;
                                                            r14 = 0;
                                                            r5 = r6;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        abstractC1323k2 = abstractC1323k;
                                                        obj = null;
                                                        e.printStackTrace();
                                                        r5 = r6;
                                                        r14 = obj;
                                                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                                                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                                                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                                                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                                                        rxa rxaVar = (rxa) abstractC1323k2;
                                                        objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar), rxaVar.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                                                        if (objM2861d == coroutineSingletons) {
                                                            return coroutineSingletons;
                                                        }
                                                        objM15541t = objM2861d;
                                                        Iterable iterable = (Iterable) objM15541t;
                                                        arrayList = new ArrayList(v91.m23189q0(iterable, i));
                                                        it = iterable.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                                                        }
                                                        return arrayList;
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$3;
                                                    abstractC1323k2 = abstractC1323k;
                                                    obj = null;
                                                    e.printStackTrace();
                                                    r5 = r6;
                                                    r14 = obj;
                                                    vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                                                    vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                                                    vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                                                    vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                                                    rxa rxaVar2 = (rxa) abstractC1323k2;
                                                    objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar2), rxaVar2.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                                                    if (objM2861d == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    objM15541t = objM2861d;
                                                    Iterable iterable2 = (Iterable) objM15541t;
                                                    arrayList = new ArrayList(v91.m23189q0(iterable2, i));
                                                    it = iterable2.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                                                    }
                                                    return arrayList;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                abstractC1323k2 = abstractC1323k2;
                                                coroutineSingletons = coroutineSingletons;
                                                obj = null;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                                                i = 10;
                                                e.printStackTrace();
                                                r5 = r6;
                                                r14 = obj;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                                                rxa rxaVar3 = (rxa) abstractC1323k2;
                                                objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar3), rxaVar3.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                                                if (objM2861d == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                objM15541t = objM2861d;
                                                Iterable iterable3 = (Iterable) objM15541t;
                                                arrayList = new ArrayList(v91.m23189q0(iterable3, i));
                                                it = iterable3.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                                                }
                                                return arrayList;
                                            }
                                            break;
                                        } catch (Exception e6) {
                                            e = e6;
                                            abstractC1323k2 = abstractC1323k2;
                                            r4 = r6;
                                            r6 = r4;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                                            i = 10;
                                            e.printStackTrace();
                                            r5 = r6;
                                            r14 = obj;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                                            rxa rxaVar4 = (rxa) abstractC1323k2;
                                            objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar4), rxaVar4.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                                            if (objM2861d == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            objM15541t = objM2861d;
                                            Iterable iterable4 = (Iterable) objM15541t;
                                            arrayList = new ArrayList(v91.m23189q0(iterable4, i));
                                            it = iterable4.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                                            }
                                            return arrayList;
                                        }
                                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                                        rxa rxaVar5 = (rxa) abstractC1323k2;
                                        objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar5), rxaVar5.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                                        if (objM2861d == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        objM15541t = objM2861d;
                                        Iterable iterable5 = (Iterable) objM15541t;
                                        arrayList = new ArrayList(v91.m23189q0(iterable5, i));
                                        it = iterable5.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                                        }
                                        return arrayList;
                                    }
                                    return coroutineSingletons;
                                } catch (Exception e7) {
                                    e = e7;
                                    coroutineSingletons = coroutineSingletons;
                                    obj = null;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                                    i = 10;
                                    r6 = str2;
                                    e.printStackTrace();
                                    r5 = r6;
                                    r14 = obj;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                                    rxa rxaVar6 = (rxa) abstractC1323k2;
                                    objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar6), rxaVar6.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                                    if (objM2861d == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    objM15541t = objM2861d;
                                    Iterable iterable6 = (Iterable) objM15541t;
                                    arrayList = new ArrayList(v91.m23189q0(iterable6, i));
                                    it = iterable6.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                                    }
                                    return arrayList;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                str2 = str;
                                coroutineSingletons = coroutineSingletons;
                                obj = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                                i = 10;
                                r6 = str2;
                                e.printStackTrace();
                                r5 = r6;
                                r14 = obj;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                                rxa rxaVar7 = (rxa) abstractC1323k2;
                                objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar7), rxaVar7.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                                if (objM2861d == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                objM15541t = objM2861d;
                                Iterable iterable7 = (Iterable) objM15541t;
                                arrayList = new ArrayList(v91.m23189q0(iterable7, i));
                                it = iterable7.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                                }
                                return arrayList;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            str2 = str;
                        }
                        break;
                    case 1:
                        ref$ObjectRef = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c;
                        Ref$ObjectRef ref$ObjectRef4 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b;
                        String str4 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a;
                        try {
                            AbstractC3193b.m15359b(objM15541t);
                            ref$ObjectRef2 = ref$ObjectRef4;
                            str2 = str4;
                            ref$ObjectRef.f47718a = ((Map) objM15541t).get(str2);
                            if (ref$ObjectRef2.f47718a == null) {
                                ref$ObjectRef2.f47718a = new VocabularySearchQuery();
                                c83 c83Var3 = ((C1371d) vmaVar).f18580q;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a = str2;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b = ref$ObjectRef2;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = 2;
                                objM15541t = AbstractC3224d.m15541t(c83Var3, vocabularyRepositoryImpl$loadCardsForAnswers$1);
                                if (objM15541t == coroutineSingletons) {
                                    ref$ObjectRef3 = ref$ObjectRef2;
                                    linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
                                    linkedHashMapM15372Y.put(str2, ref$ObjectRef3.f47718a);
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a = str2;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b = ref$ObjectRef3;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c = null;
                                    vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = 3;
                                    if (((C1371d) vmaVar).m7974n(linkedHashMapM15372Y, vocabularyRepositoryImpl$loadCardsForAnswers$1) != coroutineSingletons) {
                                        str3 = str2;
                                        ref$ObjectRef2 = ref$ObjectRef3;
                                        r6 = str3;
                                    }
                                }
                                return coroutineSingletons;
                            }
                            r6 = str2;
                            List listM15421q1 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new br8(ref$ObjectRef2, 14)));
                            ?? r1 = this.f16572e;
                            Integer num3 = new Integer(1);
                            Integer num4 = new Integer(200);
                            String serverSortName2 = ((VocabularySearchQuery) ref$ObjectRef2.f47718a).f19863e.getServerSortName();
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a = r6;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = 4;
                            abstractC1323k = abstractC1323k2;
                            vocabularyRepositoryImpl$loadCardsForAnswers$3 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                            coroutineSingletons = coroutineSingletons;
                            i = 10;
                            objM4906b = r1.m4906b(r6, num3, num4, null, null, serverSortName2, listM15421q1, null, null, null, null, null, null, vocabularyRepositoryImpl$loadCardsForAnswers$3);
                            vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$3;
                            r6 = r6;
                            if (objM4906b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            localeForLanguageTag = Locale.forLanguageTag(r6);
                            list = ((Results) objM4906b).f21739d;
                            if (list != null) {
                                List<ResultVocabularyCard> list3 = list;
                                arrayList2 = new ArrayList(v91.m23189q0(list3, i));
                                while (r0.hasNext()) {
                                    String strM8398c2 = resultVocabularyCard.m8398c();
                                    localeForLanguageTag.getClass();
                                    arrayList2.add(zuc.m25805m(resultVocabularyCard, vz1.m23629f(r6, vz1.m23610P(strM8398c2, localeForLanguageTag)), y7d.m24985d(resultVocabularyCard.m8398c()), resultVocabularyCard.m8396a()));
                                }
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r6;
                                obj = null;
                                obj = null;
                                obj = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 5;
                                abstractC1323k2 = abstractC1323k;
                                objMo4096w0 = abstractC1323k2.mo4096w0(arrayList2, vocabularyRepositoryImpl$loadCardsForAnswers$2);
                                r6 = r6;
                                if (objMo4096w0 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                r5 = r6;
                                r14 = obj;
                            } else {
                                abstractC1323k2 = abstractC1323k;
                                r14 = 0;
                                r5 = r6;
                            }
                            break;
                        } catch (Exception e10) {
                            e = e10;
                            coroutineSingletons = coroutineSingletons;
                            r6 = str4;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                            i = 10;
                            e.printStackTrace();
                            r5 = r6;
                            r14 = obj;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                            rxa rxaVar8 = (rxa) abstractC1323k2;
                            objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar8), rxaVar8.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                            if (objM2861d == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            objM15541t = objM2861d;
                            Iterable iterable8 = (Iterable) objM15541t;
                            arrayList = new ArrayList(v91.m23189q0(iterable8, i));
                            it = iterable8.iterator();
                            while (it.hasNext()) {
                                arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                            }
                            return arrayList;
                        }
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                        rxa rxaVar9 = (rxa) abstractC1323k2;
                        objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar9), rxaVar9.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                        if (objM2861d == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        objM15541t = objM2861d;
                        Iterable iterable9 = (Iterable) objM15541t;
                        arrayList = new ArrayList(v91.m23189q0(iterable9, i));
                        it = iterable9.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                        }
                        return arrayList;
                    case 2:
                        ref$ObjectRef3 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b;
                        str2 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a;
                        AbstractC3193b.m15359b(objM15541t);
                        linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
                        linkedHashMapM15372Y.put(str2, ref$ObjectRef3.f47718a);
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a = str2;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b = ref$ObjectRef3;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = 3;
                        if (((C1371d) vmaVar).m7974n(linkedHashMapM15372Y, vocabularyRepositoryImpl$loadCardsForAnswers$1) != coroutineSingletons) {
                            str3 = str2;
                            ref$ObjectRef2 = ref$ObjectRef3;
                            r6 = str3;
                            List listM15421q2 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new br8(ref$ObjectRef2, 14)));
                            ?? r2 = this.f16572e;
                            Integer num5 = new Integer(1);
                            Integer num6 = new Integer(200);
                            String serverSortName3 = ((VocabularySearchQuery) ref$ObjectRef2.f47718a).f19863e.getServerSortName();
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a = r6;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = 4;
                            abstractC1323k = abstractC1323k2;
                            vocabularyRepositoryImpl$loadCardsForAnswers$3 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                            coroutineSingletons = coroutineSingletons;
                            i = 10;
                            objM4906b = r2.m4906b(r6, num5, num6, null, null, serverSortName3, listM15421q2, null, null, null, null, null, null, vocabularyRepositoryImpl$loadCardsForAnswers$3);
                            vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$3;
                            r6 = r6;
                            if (objM4906b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            localeForLanguageTag = Locale.forLanguageTag(r6);
                            list = ((Results) objM4906b).f21739d;
                            if (list != null) {
                                List<ResultVocabularyCard> list4 = list;
                                arrayList2 = new ArrayList(v91.m23189q0(list4, i));
                                while (r0.hasNext()) {
                                    String strM8398c3 = resultVocabularyCard.m8398c();
                                    localeForLanguageTag.getClass();
                                    arrayList2.add(zuc.m25805m(resultVocabularyCard, vz1.m23629f(r6, vz1.m23610P(strM8398c3, localeForLanguageTag)), y7d.m24985d(resultVocabularyCard.m8398c()), resultVocabularyCard.m8396a()));
                                }
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r6;
                                obj = null;
                                obj = null;
                                obj = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 5;
                                abstractC1323k2 = abstractC1323k;
                                objMo4096w0 = abstractC1323k2.mo4096w0(arrayList2, vocabularyRepositoryImpl$loadCardsForAnswers$2);
                                r6 = r6;
                                if (objMo4096w0 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                r5 = r6;
                                r14 = obj;
                                break;
                            } else {
                                abstractC1323k2 = abstractC1323k;
                                r14 = 0;
                                r5 = r6;
                            }
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                            rxa rxaVar10 = (rxa) abstractC1323k2;
                            objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar10), rxaVar10.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                            if (objM2861d == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            objM15541t = objM2861d;
                            Iterable iterable10 = (Iterable) objM15541t;
                            arrayList = new ArrayList(v91.m23189q0(iterable10, i));
                            it = iterable10.iterator();
                            while (it.hasNext()) {
                                arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                            }
                            return arrayList;
                        }
                        return coroutineSingletons;
                    case 3:
                        ref$ObjectRef3 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b;
                        str3 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a;
                        try {
                            AbstractC3193b.m15359b(objM15541t);
                            ref$ObjectRef2 = ref$ObjectRef3;
                            r6 = str3;
                            List listM15421q3 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new br8(ref$ObjectRef2, 14)));
                            ?? r3 = this.f16572e;
                            Integer num7 = new Integer(1);
                            Integer num8 = new Integer(200);
                            String serverSortName4 = ((VocabularySearchQuery) ref$ObjectRef2.f47718a).f19863e.getServerSortName();
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a = r6;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16364b = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16365c = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$1.f16368f = 4;
                            abstractC1323k = abstractC1323k2;
                            vocabularyRepositoryImpl$loadCardsForAnswers$3 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                            coroutineSingletons = coroutineSingletons;
                            i = 10;
                            objM4906b = r3.m4906b(r6, num7, num8, null, null, serverSortName4, listM15421q3, null, null, null, null, null, null, vocabularyRepositoryImpl$loadCardsForAnswers$3);
                            vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$3;
                            r6 = r6;
                            if (objM4906b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            localeForLanguageTag = Locale.forLanguageTag(r6);
                            list = ((Results) objM4906b).f21739d;
                            if (list != null) {
                                List<ResultVocabularyCard> list5 = list;
                                arrayList2 = new ArrayList(v91.m23189q0(list5, i));
                                while (r0.hasNext()) {
                                    String strM8398c4 = resultVocabularyCard.m8398c();
                                    localeForLanguageTag.getClass();
                                    arrayList2.add(zuc.m25805m(resultVocabularyCard, vz1.m23629f(r6, vz1.m23610P(strM8398c4, localeForLanguageTag)), y7d.m24985d(resultVocabularyCard.m8398c()), resultVocabularyCard.m8396a()));
                                }
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r6;
                                obj = null;
                                obj = null;
                                obj = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = null;
                                vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 5;
                                abstractC1323k2 = abstractC1323k;
                                objMo4096w0 = abstractC1323k2.mo4096w0(arrayList2, vocabularyRepositoryImpl$loadCardsForAnswers$2);
                                r6 = r6;
                                if (objMo4096w0 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                r5 = r6;
                                r14 = obj;
                            } else {
                                abstractC1323k2 = abstractC1323k;
                                r14 = 0;
                                r5 = r6;
                            }
                            break;
                        } catch (Exception e11) {
                            e = e11;
                            r4 = str3;
                            r6 = r4;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                            i = 10;
                            e.printStackTrace();
                            r5 = r6;
                            r14 = obj;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                            rxa rxaVar11 = (rxa) abstractC1323k2;
                            objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar11), rxaVar11.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                            if (objM2861d == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            objM15541t = objM2861d;
                            Iterable iterable11 = (Iterable) objM15541t;
                            arrayList = new ArrayList(v91.m23189q0(iterable11, i));
                            it = iterable11.iterator();
                            while (it.hasNext()) {
                                arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                            }
                            return arrayList;
                        }
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                        rxa rxaVar12 = (rxa) abstractC1323k2;
                        objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar12), rxaVar12.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                        if (objM2861d == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        objM15541t = objM2861d;
                        Iterable iterable12 = (Iterable) objM15541t;
                        arrayList = new ArrayList(v91.m23189q0(iterable12, i));
                        it = iterable12.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                        }
                        return arrayList;
                    case 4:
                        String str5 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a;
                        AbstractC3193b.m15359b(objM15541t);
                        objM4906b = objM15541t;
                        coroutineSingletons = coroutineSingletons;
                        abstractC1323k = abstractC1323k2;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                        i = 10;
                        r6 = str5;
                        localeForLanguageTag = Locale.forLanguageTag(r6);
                        list = ((Results) objM4906b).f21739d;
                        if (list != null) {
                            List<ResultVocabularyCard> list6 = list;
                            arrayList2 = new ArrayList(v91.m23189q0(list6, i));
                            while (r0.hasNext()) {
                                String strM8398c5 = resultVocabularyCard.m8398c();
                                localeForLanguageTag.getClass();
                                arrayList2.add(zuc.m25805m(resultVocabularyCard, vz1.m23629f(r6, vz1.m23610P(strM8398c5, localeForLanguageTag)), y7d.m24985d(resultVocabularyCard.m8398c()), resultVocabularyCard.m8396a()));
                            }
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r6;
                            obj = null;
                            obj = null;
                            obj = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = null;
                            vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 5;
                            abstractC1323k2 = abstractC1323k;
                            objMo4096w0 = abstractC1323k2.mo4096w0(arrayList2, vocabularyRepositoryImpl$loadCardsForAnswers$2);
                            r6 = r6;
                            if (objMo4096w0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            r5 = r6;
                            r14 = obj;
                            break;
                        } else {
                            abstractC1323k2 = abstractC1323k;
                            r14 = 0;
                            r5 = r6;
                        }
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                        rxa rxaVar13 = (rxa) abstractC1323k2;
                        objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar13), rxaVar13.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                        if (objM2861d == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        objM15541t = objM2861d;
                        Iterable iterable13 = (Iterable) objM15541t;
                        arrayList = new ArrayList(v91.m23189q0(iterable13, i));
                        it = iterable13.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                        }
                        return arrayList;
                    case 5:
                        String str6 = vocabularyRepositoryImpl$loadCardsForAnswers$1.f16363a;
                        AbstractC3193b.m15359b(objM15541t);
                        objMo4096w0 = objM15541t;
                        coroutineSingletons = coroutineSingletons;
                        obj = null;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2 = vocabularyRepositoryImpl$loadCardsForAnswers$1;
                        i = 10;
                        r6 = str6;
                        r5 = r6;
                        r14 = obj;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16363a = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16364b = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16365c = r14;
                        vocabularyRepositoryImpl$loadCardsForAnswers$2.f16368f = 6;
                        rxa rxaVar14 = (rxa) abstractC1323k2;
                        objM2861d = AbstractC0758a.m2861d(new r3a(11, r5, rxaVar14), rxaVar14.f60013K, vocabularyRepositoryImpl$loadCardsForAnswers$2, true, true);
                        if (objM2861d == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        objM15541t = objM2861d;
                        Iterable iterable14 = (Iterable) objM15541t;
                        arrayList = new ArrayList(v91.m23189q0(iterable14, i));
                        it = iterable14.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                        }
                        return arrayList;
                    case 6:
                        AbstractC3193b.m15359b(objM15541t);
                        i = 10;
                        Iterable iterable15 = (Iterable) objM15541t;
                        arrayList = new ArrayList(v91.m23189q0(iterable15, i));
                        it = iterable15.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC3423or.m18275q0((CardEntity) it.next()));
                        }
                        return arrayList;
                    default:
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            coroutineSingletons = coroutineSingletons;
            r6 = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0322  */
    /* JADX WARN: Code duplicated, block: B:31:0x010b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0143  */
    /* JADX WARN: Code duplicated, block: B:43:0x016a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0182  */
    /* JADX WARN: Code duplicated, block: B:47:0x018b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0191  */
    /* JADX WARN: Code duplicated, block: B:50:0x0198  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x01be  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0214  */
    /* JADX WARN: Code duplicated, block: B:68:0x0222  */
    /* JADX WARN: Code duplicated, block: B:69:0x0229  */
    /* JADX WARN: Code duplicated, block: B:71:0x0235  */
    /* JADX WARN: Code duplicated, block: B:72:0x023c  */
    /* JADX WARN: Code duplicated, block: B:74:0x024a  */
    /* JADX WARN: Code duplicated, block: B:75:0x024f  */
    /* JADX WARN: Code duplicated, block: B:77:0x025b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0262  */
    /* JADX WARN: Code duplicated, block: B:79:0x0267  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x026b  */
    /* JADX WARN: Code duplicated, block: B:82:0x026e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0280 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0282  */
    /* JADX WARN: Code duplicated, block: B:93:0x0292  */
    /* JADX WARN: Code duplicated, block: B:95:0x0296  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b8  */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0296, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:98:0x02a9, please report this as an issue */
    /* JADX INFO: renamed from: k */
    public final Object m7417k(String str, int i, String str2, boolean z, boolean z2, String str3, int i2, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyRepositoryImpl$observableVocabulary$1 vocabularyRepositoryImpl$observableVocabulary$1;
        String str4;
        int i3;
        boolean z3;
        String str5;
        int i4;
        String str6;
        boolean z4;
        VocabularySearchQuery vocabularySearchQuery;
        boolean z5;
        String str7;
        boolean z6;
        int i5;
        VocabularySearchQuery vocabularySearchQuery2;
        LinkedHashMap linkedHashMapM15372Y;
        int i6;
        boolean z7;
        boolean z8;
        int i7;
        VocabularySearchQuery vocabularySearchQuery3;
        String str8;
        String str9;
        String str10;
        int i8;
        int i9;
        String columnName;
        Integer num;
        Integer num2;
        String strM4839V;
        String strM14766a;
        String str11;
        String str12;
        String str13;
        CardStatus cardStatus;
        String str14;
        String str15;
        String strM24123s;
        String strM24118n;
        String str16;
        String strM24118n2;
        String str17;
        String str18;
        List list;
        String str19;
        if (continuationImpl instanceof VocabularyRepositoryImpl$observableVocabulary$1) {
            vocabularyRepositoryImpl$observableVocabulary$1 = (VocabularyRepositoryImpl$observableVocabulary$1) continuationImpl;
            int i10 = vocabularyRepositoryImpl$observableVocabulary$1.f16379k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$observableVocabulary$1.f16379k = i10 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$observableVocabulary$1 = new VocabularyRepositoryImpl$observableVocabulary$1(this, continuationImpl);
            }
        } else {
            vocabularyRepositoryImpl$observableVocabulary$1 = new VocabularyRepositoryImpl$observableVocabulary$1(this, continuationImpl);
        }
        Object objM15541t = vocabularyRepositoryImpl$observableVocabulary$1.f16377i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = vocabularyRepositoryImpl$observableVocabulary$1.f16379k;
        Throwable th = null;
        vma vmaVar = this.f16573f;
        if (i11 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1371d) vmaVar).f18580q;
            vocabularyRepositoryImpl$observableVocabulary$1.f16369a = str;
            str4 = str2;
            vocabularyRepositoryImpl$observableVocabulary$1.f16370b = str4;
            vocabularyRepositoryImpl$observableVocabulary$1.f16371c = str3;
            i3 = i;
            vocabularyRepositoryImpl$observableVocabulary$1.f16373e = i3;
            vocabularyRepositoryImpl$observableVocabulary$1.f16375g = z;
            z3 = z2;
            vocabularyRepositoryImpl$observableVocabulary$1.f16376h = z3;
            vocabularyRepositoryImpl$observableVocabulary$1.f16374f = i2;
            vocabularyRepositoryImpl$observableVocabulary$1.f16379k = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, vocabularyRepositoryImpl$observableVocabulary$1);
            if (objM15541t != coroutineSingletons) {
                str5 = str;
                i4 = i2;
                str6 = str3;
                z4 = z;
            }
            return coroutineSingletons;
        }
        if (i11 == 1) {
            i4 = vocabularyRepositoryImpl$observableVocabulary$1.f16374f;
            boolean z9 = vocabularyRepositoryImpl$observableVocabulary$1.f16376h;
            z4 = vocabularyRepositoryImpl$observableVocabulary$1.f16375g;
            i3 = vocabularyRepositoryImpl$observableVocabulary$1.f16373e;
            str6 = vocabularyRepositoryImpl$observableVocabulary$1.f16371c;
            String str20 = vocabularyRepositoryImpl$observableVocabulary$1.f16370b;
            str5 = vocabularyRepositoryImpl$observableVocabulary$1.f16369a;
            AbstractC3193b.m15359b(objM15541t);
            z3 = z9;
            str4 = str20;
        } else {
            if (i11 == 2) {
                i4 = vocabularyRepositoryImpl$observableVocabulary$1.f16374f;
                z5 = vocabularyRepositoryImpl$observableVocabulary$1.f16376h;
                z6 = vocabularyRepositoryImpl$observableVocabulary$1.f16375g;
                i5 = vocabularyRepositoryImpl$observableVocabulary$1.f16373e;
                vocabularySearchQuery2 = vocabularyRepositoryImpl$observableVocabulary$1.f16372d;
                str6 = vocabularyRepositoryImpl$observableVocabulary$1.f16371c;
                str7 = vocabularyRepositoryImpl$observableVocabulary$1.f16370b;
                str5 = vocabularyRepositoryImpl$observableVocabulary$1.f16369a;
                AbstractC3193b.m15359b(objM15541t);
                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
                linkedHashMapM15372Y.put(str5, vocabularySearchQuery2);
                vocabularyRepositoryImpl$observableVocabulary$1.f16369a = str5;
                vocabularyRepositoryImpl$observableVocabulary$1.f16370b = str7;
                vocabularyRepositoryImpl$observableVocabulary$1.f16371c = str6;
                vocabularyRepositoryImpl$observableVocabulary$1.f16372d = vocabularySearchQuery2;
                vocabularyRepositoryImpl$observableVocabulary$1.f16373e = i5;
                vocabularyRepositoryImpl$observableVocabulary$1.f16375g = z6;
                vocabularyRepositoryImpl$observableVocabulary$1.f16376h = z5;
                vocabularyRepositoryImpl$observableVocabulary$1.f16374f = i4;
                vocabularyRepositoryImpl$observableVocabulary$1.f16379k = 3;
                if (((C1371d) vmaVar).m7974n(linkedHashMapM15372Y, vocabularyRepositoryImpl$observableVocabulary$1) != coroutineSingletons) {
                    i6 = i4;
                    z7 = z5;
                    z8 = z6;
                    i7 = i5;
                    vocabularySearchQuery3 = vocabularySearchQuery2;
                    str8 = str6;
                    str9 = str7;
                    str10 = str5;
                }
                return coroutineSingletons;
            }
            if (i11 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i6 = vocabularyRepositoryImpl$observableVocabulary$1.f16374f;
            z7 = vocabularyRepositoryImpl$observableVocabulary$1.f16376h;
            z8 = vocabularyRepositoryImpl$observableVocabulary$1.f16375g;
            i7 = vocabularyRepositoryImpl$observableVocabulary$1.f16373e;
            vocabularySearchQuery3 = vocabularyRepositoryImpl$observableVocabulary$1.f16372d;
            str8 = vocabularyRepositoryImpl$observableVocabulary$1.f16371c;
            str9 = vocabularyRepositoryImpl$observableVocabulary$1.f16370b;
            str10 = vocabularyRepositoryImpl$observableVocabulary$1.f16369a;
            AbstractC3193b.m15359b(objM15541t);
            th = null;
        }
        str5 = str10;
        z3 = z7;
        i3 = i7;
        vocabularySearchQuery = vocabularySearchQuery3;
        str6 = str8;
        str4 = str9;
        i4 = i6;
        z4 = z8;
        String string = vk9.m23376L0(str4).toString();
        i8 = vocabularySearchQuery.f19859a;
        i9 = vocabularySearchQuery.f19860b;
        columnName = vocabularySearchQuery.f19861c.getColumnName();
        num = (Integer) vocabularySearchQuery.f19867i.f47624b;
        num2 = (Integer) vocabularySearchQuery.f19868j.f47624b;
        List list2 = vocabularySearchQuery.f19865g;
        int i12 = 1;
        if (i4 == -1) {
            i4 = vocabularySearchQuery.f19862d;
        }
        int i13 = i3 - 1;
        AbstractC1323k abstractC1323k = this.f16569b;
        abstractC1323k.getClass();
        str5.getClass();
        string.getClass();
        columnName.getClass();
        strM4839V = cl9.m4839V(string, "'", "''");
        if (str6 != null || vk9.m23391n0(str6)) {
            strM14766a = hy3.f43148E.m14766a(new DateTime());
        } else {
            strM14766a = str6;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i13 * i4;
        int i15 = i4 + i14;
        if (num != null) {
            str11 = ",CourseAndCardsJoin";
        } else {
            str11 = "";
        }
        if (num2 != null) {
            str12 = ",LessonsAndCardsJoin";
        } else {
            str12 = "";
        }
        if (str6 != null || vk9.m23391n0(str6)) {
            str13 = "";
        } else {
            str13 = ",CardsAndLOTDJoin";
        }
        cardStatus = CardStatus.Known;
        if (i8 == cardStatus.getValue()) {
            str14 = str13;
            strM24123s = ux5.m22987j(CardStatus.Learned.getValue(), CardExtendedStatus.Known.getValue(), "AND (CardEntity.status == ", " AND CardEntity.extendedStatus == ", ")");
            str15 = str5;
        } else {
            str14 = str13;
            str15 = str5;
            if (i9 == cardStatus.getValue()) {
                strM24123s = wq1.m24123s(ux5.m22994q(i8, i9, "AND (CardEntity.status BETWEEN ", " AND ", " OR CardEntity.extendedStatus == "), CardExtendedStatus.Known.getValue(), ")");
            } else {
                strM24123s = wq1.m24123s(ux5.m22994q(i8, i9, "AND (CardEntity.status BETWEEN ", " AND ", " AND (CardEntity.extendedStatus = "), CardExtendedStatus.NotKnown.getValue(), " OR CardEntity.extendedStatus is null))");
            }
        }
        if (strM4839V.length() > 0) {
            strM24118n = "";
        } else if (columnName.equals(VocabularySearch.MeaningContaining.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.meaningTerms LIKE '%", strM4839V, "%'");
        } else if (columnName.equals(VocabularySearch.StartsWith.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '", strM4839V, "%'");
        } else if (columnName.equals(VocabularySearch.EndsWith.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '%", strM4839V, "'");
        } else if (columnName.equals(VocabularySearch.PhraseContaining.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.fragment LIKE '%", strM4839V, "%'");
        } else {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '%", strM4839V, "%'");
        }
        if (z3) {
            str16 = "AND CardEntity.isPhrase = 1";
        } else {
            str16 = "";
        }
        if (!z4 && (str6 == null || vk9.m23391n0(str6))) {
            arrayList.add(strM14766a);
            strM24118n2 = "AND DATETIME(CardEntity.srsDueDate) <= DATETIME(?)";
        } else if (str6 != null || vk9.m23391n0(str6)) {
            strM24118n2 = "";
        } else {
            strM24118n2 = wq1.m24118n("AND CardEntity.termWithLanguage = CardsAndLOTDJoin.termWithLanguage AND CardsAndLOTDJoin.lotd = \"", str6, "\"");
        }
        if (num != null) {
            str17 = "AND CardEntity.termWithLanguage = CourseAndCardsJoin.termWithLanguage AND CourseAndCardsJoin.pk = " + num;
        } else {
            str17 = "";
        }
        if (num2 != null) {
            str18 = "AND CardEntity.termWithLanguage = LessonsAndCardsJoin.termWithLanguage AND LessonsAndCardsJoin.contentId = " + num2;
        } else {
            str18 = "";
        }
        list = list2;
        if (list != null || list.isEmpty()) {
            str19 = "";
        } else {
            int i16 = 0;
            str19 = "";
            for (Object obj : list2) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    vz1.m23628e0();
                    throw th;
                }
                String str21 = (String) obj;
                str19 = ((Object) str19) + (i16 == 0 ? "AND (" : "") + " CardEntity.tags LIKE '%" + str21 + "%' " + ((i16 == vz1.m23602H(list2) || list2.size() <= i12) ? ")" : " OR ");
                i16 = i17;
                i12 = 1;
            }
        }
        StringBuilder sbM23000w = ux5.m23000w("\n        SELECT CardEntity.* FROM CardEntity\n        INNER JOIN VocabularyOrderEntity ON CardEntity.termWithLanguage = VocabularyOrderEntity.termWithLanguage\n        ", str11, "\n        ", str12, "\n        ");
        AbstractC3393o1.m17725C(sbM23000w, str14, "\n        WHERE CardEntity.termWithLanguage LIKE '", str15, "' || '\\_%' ESCAPE '\\'\n        AND VocabularyOrderEntity.sortPosition >= ");
        hn1.m13360j(i14, i15, "\n        AND VocabularyOrderEntity.sortPosition < ", "\n        ", sbM23000w);
        AbstractC3393o1.m17725C(sbM23000w, strM24123s, "\n        ", strM24118n, "\n        ");
        AbstractC3393o1.m17725C(sbM23000w, str16, "\n        ", strM24118n2, "\n    ");
        AbstractC3393o1.m17725C(sbM23000w, str17, "\n    ", str18, "\n    ");
        p33 p33Var = new p33(20, AbstractC3393o1.m17738m(sbM23000w, str19, "\n        ORDER BY VocabularyOrderEntity.sortPosition ASC\n    "), arrayList.toArray());
        rxa rxaVar = (rxa) abstractC1323k;
        TreeMap treeMap = ei8.f37291h;
        p33 p33VarM11161a = hyc.m13591a(p33Var).m11161a();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(rxaVar.f60013K, true, new String[]{"CardEntity", "VocabularyOrderEntity"}, new ws6(p33VarM11161a.mo2959x(), p33VarM11161a, rxaVar, 21)));
        vocabularySearchQuery = (VocabularySearchQuery) ((Map) objM15541t).get(str5);
        if (vocabularySearchQuery == null) {
            VocabularySearchQuery vocabularySearchQuery4 = new VocabularySearchQuery();
            c83 c83Var2 = ((C1371d) vmaVar).f18580q;
            vocabularyRepositoryImpl$observableVocabulary$1.f16369a = str5;
            vocabularyRepositoryImpl$observableVocabulary$1.f16370b = str4;
            vocabularyRepositoryImpl$observableVocabulary$1.f16371c = str6;
            vocabularyRepositoryImpl$observableVocabulary$1.f16372d = vocabularySearchQuery4;
            vocabularyRepositoryImpl$observableVocabulary$1.f16373e = i3;
            vocabularyRepositoryImpl$observableVocabulary$1.f16375g = z4;
            vocabularyRepositoryImpl$observableVocabulary$1.f16376h = z3;
            vocabularyRepositoryImpl$observableVocabulary$1.f16374f = i4;
            vocabularyRepositoryImpl$observableVocabulary$1.f16379k = 2;
            Object objM15541t2 = AbstractC3224d.m15541t(c83Var2, vocabularyRepositoryImpl$observableVocabulary$1);
            if (objM15541t2 != coroutineSingletons) {
                z5 = z3;
                str7 = str4;
                z6 = z4;
                i5 = i3;
                vocabularySearchQuery2 = vocabularySearchQuery4;
                objM15541t = objM15541t2;
                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
                linkedHashMapM15372Y.put(str5, vocabularySearchQuery2);
                vocabularyRepositoryImpl$observableVocabulary$1.f16369a = str5;
                vocabularyRepositoryImpl$observableVocabulary$1.f16370b = str7;
                vocabularyRepositoryImpl$observableVocabulary$1.f16371c = str6;
                vocabularyRepositoryImpl$observableVocabulary$1.f16372d = vocabularySearchQuery2;
                vocabularyRepositoryImpl$observableVocabulary$1.f16373e = i5;
                vocabularyRepositoryImpl$observableVocabulary$1.f16375g = z6;
                vocabularyRepositoryImpl$observableVocabulary$1.f16376h = z5;
                vocabularyRepositoryImpl$observableVocabulary$1.f16374f = i4;
                vocabularyRepositoryImpl$observableVocabulary$1.f16379k = 3;
                if (((C1371d) vmaVar).m7974n(linkedHashMapM15372Y, vocabularyRepositoryImpl$observableVocabulary$1) != coroutineSingletons) {
                    i6 = i4;
                    z7 = z5;
                    z8 = z6;
                    i7 = i5;
                    vocabularySearchQuery3 = vocabularySearchQuery2;
                    str8 = str6;
                    str9 = str7;
                    str10 = str5;
                    str5 = str10;
                    z3 = z7;
                    i3 = i7;
                    vocabularySearchQuery = vocabularySearchQuery3;
                    str6 = str8;
                    str4 = str9;
                    i4 = i6;
                    z4 = z8;
                }
            }
            return coroutineSingletons;
        }
        th = null;
        String string2 = vk9.m23376L0(str4).toString();
        i8 = vocabularySearchQuery.f19859a;
        i9 = vocabularySearchQuery.f19860b;
        columnName = vocabularySearchQuery.f19861c.getColumnName();
        num = (Integer) vocabularySearchQuery.f19867i.f47624b;
        num2 = (Integer) vocabularySearchQuery.f19868j.f47624b;
        List list3 = vocabularySearchQuery.f19865g;
        int i18 = 1;
        if (i4 == -1) {
            i4 = vocabularySearchQuery.f19862d;
        }
        int i19 = i3 - 1;
        AbstractC1323k abstractC1323k2 = this.f16569b;
        abstractC1323k2.getClass();
        str5.getClass();
        string2.getClass();
        columnName.getClass();
        strM4839V = cl9.m4839V(string2, "'", "''");
        if (str6 != null) {
            strM14766a = hy3.f43148E.m14766a(new DateTime());
        } else {
            strM14766a = hy3.f43148E.m14766a(new DateTime());
        }
        ArrayList arrayList2 = new ArrayList();
        int i110 = i19 * i4;
        int i111 = i4 + i110;
        if (num != null) {
            str11 = ",CourseAndCardsJoin";
        } else {
            str11 = "";
        }
        if (num2 != null) {
            str12 = ",LessonsAndCardsJoin";
        } else {
            str12 = "";
        }
        if (str6 != null) {
            str13 = "";
        } else {
            str13 = "";
        }
        cardStatus = CardStatus.Known;
        if (i8 == cardStatus.getValue()) {
            str14 = str13;
            strM24123s = ux5.m22987j(CardStatus.Learned.getValue(), CardExtendedStatus.Known.getValue(), "AND (CardEntity.status == ", " AND CardEntity.extendedStatus == ", ")");
            str15 = str5;
        } else {
            str14 = str13;
            str15 = str5;
            if (i9 == cardStatus.getValue()) {
                strM24123s = wq1.m24123s(ux5.m22994q(i8, i9, "AND (CardEntity.status BETWEEN ", " AND ", " OR CardEntity.extendedStatus == "), CardExtendedStatus.Known.getValue(), ")");
            } else {
                strM24123s = wq1.m24123s(ux5.m22994q(i8, i9, "AND (CardEntity.status BETWEEN ", " AND ", " AND (CardEntity.extendedStatus = "), CardExtendedStatus.NotKnown.getValue(), " OR CardEntity.extendedStatus is null))");
            }
        }
        if (strM4839V.length() > 0) {
            strM24118n = "";
        } else if (columnName.equals(VocabularySearch.MeaningContaining.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.meaningTerms LIKE '%", strM4839V, "%'");
        } else if (columnName.equals(VocabularySearch.StartsWith.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '", strM4839V, "%'");
        } else if (columnName.equals(VocabularySearch.EndsWith.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '%", strM4839V, "'");
        } else if (columnName.equals(VocabularySearch.PhraseContaining.getColumnName())) {
            strM24118n = wq1.m24118n("AND CardEntity.fragment LIKE '%", strM4839V, "%'");
        } else {
            strM24118n = wq1.m24118n("AND CardEntity.term LIKE '%", strM4839V, "%'");
        }
        if (z3) {
            str16 = "AND CardEntity.isPhrase = 1";
        } else {
            str16 = "";
        }
        if (!z4) {
            if (str6 != null) {
                strM24118n2 = "";
            } else {
                strM24118n2 = "";
            }
        } else if (str6 != null) {
            strM24118n2 = "";
        } else {
            strM24118n2 = "";
        }
        if (num != null) {
            str17 = "AND CardEntity.termWithLanguage = CourseAndCardsJoin.termWithLanguage AND CourseAndCardsJoin.pk = " + num;
        } else {
            str17 = "";
        }
        if (num2 != null) {
            str18 = "AND CardEntity.termWithLanguage = LessonsAndCardsJoin.termWithLanguage AND LessonsAndCardsJoin.contentId = " + num2;
        } else {
            str18 = "";
        }
        list = list3;
        if (list != null) {
            str19 = "";
        } else {
            str19 = "";
        }
        StringBuilder sbM23000w2 = ux5.m23000w("\n        SELECT CardEntity.* FROM CardEntity\n        INNER JOIN VocabularyOrderEntity ON CardEntity.termWithLanguage = VocabularyOrderEntity.termWithLanguage\n        ", str11, "\n        ", str12, "\n        ");
        AbstractC3393o1.m17725C(sbM23000w2, str14, "\n        WHERE CardEntity.termWithLanguage LIKE '", str15, "' || '\\_%' ESCAPE '\\'\n        AND VocabularyOrderEntity.sortPosition >= ");
        hn1.m13360j(i110, i111, "\n        AND VocabularyOrderEntity.sortPosition < ", "\n        ", sbM23000w2);
        AbstractC3393o1.m17725C(sbM23000w2, strM24123s, "\n        ", strM24118n, "\n        ");
        AbstractC3393o1.m17725C(sbM23000w2, str16, "\n        ", strM24118n2, "\n    ");
        AbstractC3393o1.m17725C(sbM23000w2, str17, "\n    ", str18, "\n    ");
        p33 p33Var2 = new p33(20, AbstractC3393o1.m17738m(sbM23000w2, str19, "\n        ORDER BY VocabularyOrderEntity.sortPosition ASC\n    "), arrayList2.toArray());
        rxa rxaVar2 = (rxa) abstractC1323k2;
        TreeMap treeMap2 = ei8.f37291h;
        p33 p33VarM11161a2 = hyc.m13591a(p33Var2).m11161a();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(rxaVar2.f60013K, true, new String[]{"CardEntity", "VocabularyOrderEntity"}, new ws6(p33VarM11161a2.mo2959x(), p33VarM11161a2, rxaVar2, 21)));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x030e A[Catch: Exception -> 0x040c, TryCatch #1 {Exception -> 0x040c, blocks: (B:106:0x0345, B:100:0x0306, B:102:0x030e, B:96:0x02ed), top: B:143:0x02ed }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0339  */
    /* JADX WARN: Code duplicated, block: B:105:0x033b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0398  */
    /* JADX WARN: Code duplicated, block: B:111:0x039a  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a6 A[Catch: Exception -> 0x03ad, TryCatch #0 {Exception -> 0x03ad, blocks: (B:113:0x03a6, B:116:0x03b2, B:108:0x034d), top: B:141:0x034d }] */
    /* JADX WARN: Code duplicated, block: B:115:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:121:0x0409  */
    /* JADX WARN: Code duplicated, block: B:124:0x040f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0415 A[Catch: Exception -> 0x0458, TryCatch #3 {Exception -> 0x0458, blocks: (B:125:0x0411, B:127:0x0415, B:129:0x041b, B:131:0x042b, B:132:0x043c, B:134:0x0442, B:136:0x0452, B:118:0x03da), top: B:147:0x03da }] */
    /* JADX WARN: Code duplicated, block: B:128:0x041a  */
    /* JADX WARN: Code duplicated, block: B:131:0x042b A[Catch: Exception -> 0x0458, TryCatch #3 {Exception -> 0x0458, blocks: (B:125:0x0411, B:127:0x0415, B:129:0x041b, B:131:0x042b, B:132:0x043c, B:134:0x0442, B:136:0x0452, B:118:0x03da), top: B:147:0x03da }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0442 A[Catch: Exception -> 0x0458, LOOP:0: B:132:0x043c->B:134:0x0442, LOOP_END, TryCatch #3 {Exception -> 0x0458, blocks: (B:125:0x0411, B:127:0x0415, B:129:0x041b, B:131:0x042b, B:132:0x043c, B:134:0x0442, B:136:0x0452, B:118:0x03da), top: B:147:0x03da }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0450  */
    /* JADX WARN: Code duplicated, block: B:42:0x016c A[Catch: Exception -> 0x0042, TryCatch #4 {Exception -> 0x0042, blocks: (B:13:0x003b, B:17:0x0062, B:21:0x008f, B:24:0x00b8, B:27:0x00da, B:52:0x01d9, B:30:0x00f1, B:46:0x01a1, B:33:0x010f, B:40:0x015e, B:42:0x016c, B:36:0x0120), top: B:149:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0194  */
    /* JADX WARN: Code duplicated, block: B:45:0x0196  */
    /* JADX WARN: Code duplicated, block: B:48:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x0202 A[Catch: Exception -> 0x020b, TryCatch #2 {Exception -> 0x020b, blocks: (B:54:0x01f6, B:56:0x0202, B:60:0x0211, B:62:0x022e, B:69:0x023e, B:71:0x0244, B:74:0x024b, B:80:0x025c, B:86:0x0282, B:87:0x028c, B:93:0x02a7, B:94:0x02b1, B:90:0x029c, B:83:0x0277), top: B:145:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x020f  */
    /* JADX WARN: Code duplicated, block: B:62:0x022e A[Catch: Exception -> 0x020b, TryCatch #2 {Exception -> 0x020b, blocks: (B:54:0x01f6, B:56:0x0202, B:60:0x0211, B:62:0x022e, B:69:0x023e, B:71:0x0244, B:74:0x024b, B:80:0x025c, B:86:0x0282, B:87:0x028c, B:93:0x02a7, B:94:0x02b1, B:90:0x029c, B:83:0x0277), top: B:145:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0237  */
    /* JADX WARN: Code duplicated, block: B:67:0x023a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x023c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0244 A[Catch: Exception -> 0x020b, TryCatch #2 {Exception -> 0x020b, blocks: (B:54:0x01f6, B:56:0x0202, B:60:0x0211, B:62:0x022e, B:69:0x023e, B:71:0x0244, B:74:0x024b, B:80:0x025c, B:86:0x0282, B:87:0x028c, B:93:0x02a7, B:94:0x02b1, B:90:0x029c, B:83:0x0277), top: B:145:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0247  */
    /* JADX WARN: Code duplicated, block: B:74:0x024b A[Catch: Exception -> 0x020b, TryCatch #2 {Exception -> 0x020b, blocks: (B:54:0x01f6, B:56:0x0202, B:60:0x0211, B:62:0x022e, B:69:0x023e, B:71:0x0244, B:74:0x024b, B:80:0x025c, B:86:0x0282, B:87:0x028c, B:93:0x02a7, B:94:0x02b1, B:90:0x029c, B:83:0x0277), top: B:145:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0258  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0274  */
    /* JADX WARN: Code duplicated, block: B:83:0x0277 A[Catch: Exception -> 0x020b, TryCatch #2 {Exception -> 0x020b, blocks: (B:54:0x01f6, B:56:0x0202, B:60:0x0211, B:62:0x022e, B:69:0x023e, B:71:0x0244, B:74:0x024b, B:80:0x025c, B:86:0x0282, B:87:0x028c, B:93:0x02a7, B:94:0x02b1, B:90:0x029c, B:83:0x0277), top: B:145:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0280  */
    /* JADX WARN: Code duplicated, block: B:89:0x0298  */
    /* JADX WARN: Code duplicated, block: B:90:0x029c A[Catch: Exception -> 0x020b, TryCatch #2 {Exception -> 0x020b, blocks: (B:54:0x01f6, B:56:0x0202, B:60:0x0211, B:62:0x022e, B:69:0x023e, B:71:0x0244, B:74:0x024b, B:80:0x025c, B:86:0x0282, B:87:0x028c, B:93:0x02a7, B:94:0x02b1, B:90:0x029c, B:83:0x0277), top: B:145:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String, java.util.List, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX INFO: renamed from: l */
    public final Serializable m7418l(String str, int i, String str2, boolean z, boolean z2, String str3, int i2, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$1;
        EmptyList emptyList;
        Ref$ObjectRef ref$ObjectRef;
        String str4;
        boolean z3;
        boolean z4;
        String str5;
        int i3;
        Object obj;
        String str6;
        int i4;
        Ref$ObjectRef ref$ObjectRef2;
        String str7;
        boolean z5;
        Ref$ObjectRef ref$ObjectRef3;
        String str8;
        int i5;
        boolean z6;
        Object objM15541t;
        Object obj2;
        LinkedHashMap linkedHashMapM15372Y;
        String str9;
        List<Integer> listM15421q0;
        int i6;
        boolean z7;
        Boolean bool;
        String str10;
        Integer num;
        List<Integer> list;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        boolean z8;
        String str11;
        vma vmaVar;
        int i7;
        int i8;
        String str12;
        EmptyList emptyList2;
        Ref$ObjectRef ref$ObjectRef4;
        String str13;
        Ref$ObjectRef ref$ObjectRef5;
        Object objM4906b;
        VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$2;
        Object obj3;
        String str14;
        String str15;
        Ref$ObjectRef ref$ObjectRef6;
        int i9;
        String str16;
        boolean z9;
        boolean z10;
        int i10;
        Results results;
        List list2;
        Object objM15541t2;
        Ref$ObjectRef ref$ObjectRef7;
        String str17;
        String str18;
        Results results2;
        boolean z11;
        int i11;
        String str19;
        boolean z12;
        int i12;
        int i13;
        LinkedHashMap linkedHashMapM15372Y2;
        EmptyList emptyList3;
        List list3;
        Object obj4;
        int i14;
        String str20;
        List list4;
        int i15;
        Ref$ObjectRef ref$ObjectRef8;
        Results results3;
        int i16;
        LingQDatabase lingQDatabase;
        VocabularyRepositoryImpl$syncVocabularyCards$2$1$1 vocabularyRepositoryImpl$syncVocabularyCards$2$1$1;
        Results results4;
        Results results5;
        List list5;
        int size;
        List list6;
        ArrayList arrayList;
        Iterator it;
        if (continuationImpl instanceof VocabularyRepositoryImpl$syncVocabularyCards$1) {
            vocabularyRepositoryImpl$syncVocabularyCards$1 = (VocabularyRepositoryImpl$syncVocabularyCards$1) continuationImpl;
            int i17 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = i17 - Integer.MIN_VALUE;
            } else {
                vocabularyRepositoryImpl$syncVocabularyCards$1 = new VocabularyRepositoryImpl$syncVocabularyCards$1(this, continuationImpl);
            }
        } else {
            vocabularyRepositoryImpl$syncVocabularyCards$1 = new VocabularyRepositoryImpl$syncVocabularyCards$1(this, continuationImpl);
        }
        Object obj5 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16380H;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i18 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J;
        EmptyList emptyList4 = EmptyList.f47638a;
        vma vmaVar2 = this.f16573f;
        try {
            switch (i18) {
                case 0:
                    AbstractC3193b.m15359b(obj5);
                    ref$ObjectRef = new Ref$ObjectRef();
                    c83 c83Var = ((C1371d) vmaVar2).f18580q;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str;
                    str4 = str2;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str4;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str3;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = ref$ObjectRef;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i;
                    z3 = z;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z3;
                    z4 = z2;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z4;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i2;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 1;
                    Object objM15541t3 = AbstractC3224d.m15541t(c83Var, vocabularyRepositoryImpl$syncVocabularyCards$1);
                    if (objM15541t3 != coroutineSingletons) {
                        str5 = str;
                        i3 = i2;
                        obj = objM15541t3;
                        str6 = str3;
                        i4 = i;
                        ref$ObjectRef2 = ref$ObjectRef;
                        ref$ObjectRef.f47718a = ((Map) obj).get(str5);
                        if (ref$ObjectRef2.f47718a == null) {
                            ref$ObjectRef2.f47718a = new VocabularySearchQuery();
                            c83 c83Var2 = ((C1371d) vmaVar2).f18580q;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str6;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef2;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z3;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i3;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 2;
                            objM15541t = AbstractC3224d.m15541t(c83Var2, vocabularyRepositoryImpl$syncVocabularyCards$1);
                            if (objM15541t == coroutineSingletons) {
                                Ref$ObjectRef ref$ObjectRef9 = ref$ObjectRef2;
                                str8 = str6;
                                obj2 = objM15541t;
                                ref$ObjectRef3 = ref$ObjectRef9;
                                boolean z13 = z3;
                                str7 = str4;
                                z5 = z13;
                                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) obj2);
                                linkedHashMapM15372Y.put(str5, ref$ObjectRef3.f47718a);
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z4;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i3;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 3;
                                if (((C1371d) vmaVar2).m7974n(linkedHashMapM15372Y, vocabularyRepositoryImpl$syncVocabularyCards$1) != coroutineSingletons) {
                                    i5 = i3;
                                    z6 = z4;
                                    str9 = str5;
                                    str5 = str9;
                                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                                    ref$IntRef.f47716a = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19859a;
                                    listM15421q0 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new qk9(12, ref$IntRef, ref$ObjectRef3)));
                                    try {
                                        co0 co0Var = this.f16572e;
                                        Integer num6 = new Integer(i4);
                                        if (i5 == -1) {
                                            i6 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19862d;
                                        } else {
                                            i6 = i5;
                                        }
                                        Integer num7 = new Integer(i6);
                                        String columnName = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19861c.getColumnName();
                                        String serverSortName = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19863e.getServerSortName();
                                        if (str8 == null && !vk9.m23391n0(str8) && z5) {
                                            z7 = false;
                                        } else if (z5) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        Boolean boolValueOf = Boolean.valueOf(z7);
                                        if (z6) {
                                            bool = Boolean.TRUE;
                                        } else {
                                            bool = null;
                                        }
                                        if (str8 != null || vk9.m23391n0(str8)) {
                                            str10 = null;
                                        } else {
                                            str10 = str8;
                                        }
                                        Object obj6 = ref$ObjectRef3.f47718a;
                                        List<String> list7 = ((VocabularySearchQuery) obj6).f19865g;
                                        num = (Integer) ((VocabularySearchQuery) obj6).f19867i.f47624b;
                                        try {
                                            if (num != null) {
                                                list = listM15421q0;
                                            } else {
                                                list = listM15421q0;
                                                if (num.intValue() == -1) {
                                                    num2 = null;
                                                }
                                                num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                                                if (num3 == null) {
                                                    num4 = num2;
                                                } else {
                                                    num4 = num2;
                                                    if (num3.intValue() == -1) {
                                                        num5 = null;
                                                    }
                                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                                    z8 = z5;
                                                    str11 = str8;
                                                    vmaVar = vmaVar2;
                                                    i7 = i5;
                                                    VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$3 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                                    i8 = i4;
                                                    str12 = str7;
                                                    emptyList2 = emptyList4;
                                                    ref$ObjectRef4 = null;
                                                    Integer num8 = num5;
                                                    str13 = str5;
                                                    Boolean bool2 = bool;
                                                    ref$ObjectRef5 = ref$ObjectRef3;
                                                    objM4906b = co0Var.m4906b(str13, num6, num7, str12, columnName, serverSortName, list, boolValueOf, bool2, str10, list7, num4, num8, vocabularyRepositoryImpl$syncVocabularyCards$3);
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$3;
                                                    if (objM4906b == coroutineSingletons) {
                                                        obj3 = objM4906b;
                                                        str14 = str13;
                                                        str15 = str12;
                                                        ref$ObjectRef6 = ref$ObjectRef5;
                                                        i9 = i8;
                                                        str16 = str11;
                                                        z9 = z8;
                                                        z10 = z6;
                                                        i10 = i7;
                                                        results = (Results) obj3;
                                                        list2 = results.f21739d;
                                                        if (list2 != null) {
                                                            c83 c83Var3 = ((C1371d) vmaVar).f18561A;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                                            objM15541t2 = AbstractC3224d.m15541t(c83Var3, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                                            if (objM15541t2 != coroutineSingletons) {
                                                                ref$ObjectRef7 = ref$ObjectRef6;
                                                                str17 = str16;
                                                                str18 = str14;
                                                                results2 = results;
                                                                z11 = z10;
                                                                i11 = i9;
                                                                str19 = str15;
                                                                z12 = z9;
                                                                i12 = i10;
                                                                i13 = 0;
                                                                linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                                                emptyList3 = emptyList2;
                                                                try {
                                                                    list3 = list2;
                                                                    linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                                                    obj4 = null;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                                                    coroutineSingletons = coroutineSingletons;
                                                                    if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                                        String str21 = str19;
                                                                        i14 = i11;
                                                                        str20 = str21;
                                                                        list4 = list3;
                                                                        i15 = i12;
                                                                        ref$ObjectRef8 = ref$ObjectRef7;
                                                                        results3 = results2;
                                                                        if (i15 == -1) {
                                                                            i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                                        } else {
                                                                            i16 = i15;
                                                                        }
                                                                        int i19 = (i14 - 1) * i16;
                                                                        ?? r17 = obj4;
                                                                        String str22 = str18;
                                                                        int i20 = i16;
                                                                        int i21 = i19 + i20;
                                                                        List list8 = list4;
                                                                        lingQDatabase = this.f16568a;
                                                                        int i22 = i15;
                                                                        emptyList = emptyList3;
                                                                        CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                                                                        int i23 = i13;
                                                                        boolean z14 = z12;
                                                                        results4 = results3;
                                                                        try {
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str22, list8, z14, this, str20, ref$ObjectRef8, i14, z11, str17, i20, i19, i21, null);
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r17;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r17;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r17;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r17;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r17;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r17;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z14;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i22;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i23;
                                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                                            coroutineSingletons = coroutineSingletons2;
                                                                            if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                                                results5 = results4;
                                                                                results = results5;
                                                                            }
                                                                        } catch (Exception unused) {
                                                                            return new Triple(new Integer(0), new Integer(0), emptyList);
                                                                        }
                                                                    }
                                                                } catch (Exception unused2) {
                                                                    emptyList = emptyList3;
                                                                    return new Triple(new Integer(0), new Integer(0), emptyList);
                                                                }
                                                            }
                                                        } else {
                                                            emptyList = emptyList2;
                                                        }
                                                        list5 = results.f21739d;
                                                        if (list5 != null) {
                                                            size = list5.size();
                                                        } else {
                                                            size = 0;
                                                        }
                                                        Integer num9 = new Integer(size);
                                                        Integer num10 = new Integer(results.f21736a);
                                                        list6 = results.f21739d;
                                                        if (list6 != null) {
                                                            List list9 = list6;
                                                            arrayList = new ArrayList(v91.m23189q0(list9, 10));
                                                            it = list9.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                                            }
                                                        } else {
                                                            arrayList = emptyList;
                                                        }
                                                        return new Triple(num9, num10, arrayList);
                                                    }
                                                }
                                                num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                                z8 = z5;
                                                str11 = str8;
                                                vmaVar = vmaVar2;
                                                i7 = i5;
                                                VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$4 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                                i8 = i4;
                                                str12 = str7;
                                                emptyList2 = emptyList4;
                                                ref$ObjectRef4 = null;
                                                Integer num11 = num5;
                                                str13 = str5;
                                                Boolean bool3 = bool;
                                                ref$ObjectRef5 = ref$ObjectRef3;
                                                objM4906b = co0Var.m4906b(str13, num6, num7, str12, columnName, serverSortName, list, boolValueOf, bool3, str10, list7, num4, num11, vocabularyRepositoryImpl$syncVocabularyCards$4);
                                                vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$4;
                                                if (objM4906b == coroutineSingletons) {
                                                    obj3 = objM4906b;
                                                    str14 = str13;
                                                    str15 = str12;
                                                    ref$ObjectRef6 = ref$ObjectRef5;
                                                    i9 = i8;
                                                    str16 = str11;
                                                    z9 = z8;
                                                    z10 = z6;
                                                    i10 = i7;
                                                    results = (Results) obj3;
                                                    list2 = results.f21739d;
                                                    if (list2 != null) {
                                                        c83 c83Var4 = ((C1371d) vmaVar).f18561A;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                                        objM15541t2 = AbstractC3224d.m15541t(c83Var4, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                                        if (objM15541t2 != coroutineSingletons) {
                                                            ref$ObjectRef7 = ref$ObjectRef6;
                                                            str17 = str16;
                                                            str18 = str14;
                                                            results2 = results;
                                                            z11 = z10;
                                                            i11 = i9;
                                                            str19 = str15;
                                                            z12 = z9;
                                                            i12 = i10;
                                                            i13 = 0;
                                                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                                            emptyList3 = emptyList2;
                                                            list3 = list2;
                                                            linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                                            obj4 = null;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                                            coroutineSingletons = coroutineSingletons;
                                                            if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                                String str23 = str19;
                                                                i14 = i11;
                                                                str20 = str23;
                                                                list4 = list3;
                                                                i15 = i12;
                                                                ref$ObjectRef8 = ref$ObjectRef7;
                                                                results3 = results2;
                                                                if (i15 == -1) {
                                                                    i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                                } else {
                                                                    i16 = i15;
                                                                }
                                                                int i110 = (i14 - 1) * i16;
                                                                ?? r18 = obj4;
                                                                String str24 = str18;
                                                                int i24 = i16;
                                                                int i25 = i110 + i24;
                                                                List list10 = list4;
                                                                lingQDatabase = this.f16568a;
                                                                int i26 = i15;
                                                                emptyList = emptyList3;
                                                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                                                int i27 = i13;
                                                                boolean z15 = z12;
                                                                results4 = results3;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str24, list10, z15, this, str20, ref$ObjectRef8, i14, z11, str17, i24, i110, i25, null);
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r18;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r18;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r18;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r18;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r18;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r18;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z15;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i26;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i27;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                                coroutineSingletons = coroutineSingletons3;
                                                                if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                                    results5 = results4;
                                                                    results = results5;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        emptyList = emptyList2;
                                                    }
                                                    list5 = results.f21739d;
                                                    if (list5 != null) {
                                                        size = list5.size();
                                                    } else {
                                                        size = 0;
                                                    }
                                                    Integer num12 = new Integer(size);
                                                    Integer num13 = new Integer(results.f21736a);
                                                    list6 = results.f21739d;
                                                    if (list6 != null) {
                                                        List list11 = list6;
                                                        arrayList = new ArrayList(v91.m23189q0(list11, 10));
                                                        it = list11.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                                        }
                                                    } else {
                                                        arrayList = emptyList;
                                                    }
                                                    return new Triple(num12, num13, arrayList);
                                                }
                                            }
                                            if (num3 == null) {
                                                num4 = num2;
                                            } else {
                                                num4 = num2;
                                                if (num3.intValue() == -1) {
                                                    num5 = null;
                                                }
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                                z8 = z5;
                                                str11 = str8;
                                                vmaVar = vmaVar2;
                                                i7 = i5;
                                                VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$5 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                                i8 = i4;
                                                str12 = str7;
                                                emptyList2 = emptyList4;
                                                ref$ObjectRef4 = null;
                                                Integer num14 = num5;
                                                str13 = str5;
                                                Boolean bool4 = bool;
                                                ref$ObjectRef5 = ref$ObjectRef3;
                                                objM4906b = co0Var.m4906b(str13, num6, num7, str12, columnName, serverSortName, list, boolValueOf, bool4, str10, list7, num4, num14, vocabularyRepositoryImpl$syncVocabularyCards$5);
                                                vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$5;
                                                if (objM4906b == coroutineSingletons) {
                                                    obj3 = objM4906b;
                                                    str14 = str13;
                                                    str15 = str12;
                                                    ref$ObjectRef6 = ref$ObjectRef5;
                                                    i9 = i8;
                                                    str16 = str11;
                                                    z9 = z8;
                                                    z10 = z6;
                                                    i10 = i7;
                                                    results = (Results) obj3;
                                                    list2 = results.f21739d;
                                                    if (list2 != null) {
                                                        c83 c83Var5 = ((C1371d) vmaVar).f18561A;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                                        objM15541t2 = AbstractC3224d.m15541t(c83Var5, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                                        if (objM15541t2 != coroutineSingletons) {
                                                            ref$ObjectRef7 = ref$ObjectRef6;
                                                            str17 = str16;
                                                            str18 = str14;
                                                            results2 = results;
                                                            z11 = z10;
                                                            i11 = i9;
                                                            str19 = str15;
                                                            z12 = z9;
                                                            i12 = i10;
                                                            i13 = 0;
                                                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                                            emptyList3 = emptyList2;
                                                            list3 = list2;
                                                            linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                                            obj4 = null;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                                            coroutineSingletons = coroutineSingletons;
                                                            if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                                String str25 = str19;
                                                                i14 = i11;
                                                                str20 = str25;
                                                                list4 = list3;
                                                                i15 = i12;
                                                                ref$ObjectRef8 = ref$ObjectRef7;
                                                                results3 = results2;
                                                                if (i15 == -1) {
                                                                    i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                                } else {
                                                                    i16 = i15;
                                                                }
                                                                int i111 = (i14 - 1) * i16;
                                                                ?? r19 = obj4;
                                                                String str26 = str18;
                                                                int i28 = i16;
                                                                int i29 = i111 + i28;
                                                                List list12 = list4;
                                                                lingQDatabase = this.f16568a;
                                                                int i210 = i15;
                                                                emptyList = emptyList3;
                                                                CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                                                                int i211 = i13;
                                                                boolean z16 = z12;
                                                                results4 = results3;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str26, list12, z16, this, str20, ref$ObjectRef8, i14, z11, str17, i28, i111, i29, null);
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r19;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r19;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r19;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r19;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r19;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r19;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z16;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i210;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i211;
                                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                                coroutineSingletons = coroutineSingletons4;
                                                                if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                                    results5 = results4;
                                                                    results = results5;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        emptyList = emptyList2;
                                                    }
                                                    list5 = results.f21739d;
                                                    if (list5 != null) {
                                                        size = list5.size();
                                                    } else {
                                                        size = 0;
                                                    }
                                                    Integer num15 = new Integer(size);
                                                    Integer num16 = new Integer(results.f21736a);
                                                    list6 = results.f21739d;
                                                    if (list6 != null) {
                                                        List list13 = list6;
                                                        arrayList = new ArrayList(v91.m23189q0(list13, 10));
                                                        it = list13.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                                        }
                                                    } else {
                                                        arrayList = emptyList;
                                                    }
                                                    return new Triple(num15, num16, arrayList);
                                                }
                                            }
                                            objM4906b = co0Var.m4906b(str13, num6, num7, str12, columnName, serverSortName, list, boolValueOf, bool4, str10, list7, num4, num14, vocabularyRepositoryImpl$syncVocabularyCards$5);
                                            vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$5;
                                            if (objM4906b == coroutineSingletons) {
                                                obj3 = objM4906b;
                                                str14 = str13;
                                                str15 = str12;
                                                ref$ObjectRef6 = ref$ObjectRef5;
                                                i9 = i8;
                                                str16 = str11;
                                                z9 = z8;
                                                z10 = z6;
                                                i10 = i7;
                                                results = (Results) obj3;
                                                list2 = results.f21739d;
                                                if (list2 != null) {
                                                    c83 c83Var6 = ((C1371d) vmaVar).f18561A;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                                    objM15541t2 = AbstractC3224d.m15541t(c83Var6, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                                    if (objM15541t2 != coroutineSingletons) {
                                                        ref$ObjectRef7 = ref$ObjectRef6;
                                                        str17 = str16;
                                                        str18 = str14;
                                                        results2 = results;
                                                        z11 = z10;
                                                        i11 = i9;
                                                        str19 = str15;
                                                        z12 = z9;
                                                        i12 = i10;
                                                        i13 = 0;
                                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                                        emptyList3 = emptyList2;
                                                        list3 = list2;
                                                        linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                                        obj4 = null;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                                        coroutineSingletons = coroutineSingletons;
                                                        if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                            String str27 = str19;
                                                            i14 = i11;
                                                            str20 = str27;
                                                            list4 = list3;
                                                            i15 = i12;
                                                            ref$ObjectRef8 = ref$ObjectRef7;
                                                            results3 = results2;
                                                            if (i15 == -1) {
                                                                i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                            } else {
                                                                i16 = i15;
                                                            }
                                                            int i112 = (i14 - 1) * i16;
                                                            ?? r110 = obj4;
                                                            String str28 = str18;
                                                            int i212 = i16;
                                                            int i213 = i112 + i212;
                                                            List list14 = list4;
                                                            lingQDatabase = this.f16568a;
                                                            int i214 = i15;
                                                            emptyList = emptyList3;
                                                            CoroutineSingletons coroutineSingletons5 = coroutineSingletons;
                                                            int i215 = i13;
                                                            boolean z17 = z12;
                                                            results4 = results3;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str28, list14, z17, this, str20, ref$ObjectRef8, i14, z11, str17, i212, i112, i213, null);
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r110;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r110;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r110;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r110;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r110;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r110;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z17;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i214;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i215;
                                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                            coroutineSingletons = coroutineSingletons5;
                                                            if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                                results5 = results4;
                                                                results = results5;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    emptyList = emptyList2;
                                                }
                                                list5 = results.f21739d;
                                                if (list5 != null) {
                                                    size = list5.size();
                                                } else {
                                                    size = 0;
                                                }
                                                Integer num17 = new Integer(size);
                                                Integer num18 = new Integer(results.f21736a);
                                                list6 = results.f21739d;
                                                if (list6 != null) {
                                                    List list15 = list6;
                                                    arrayList = new ArrayList(v91.m23189q0(list15, 10));
                                                    it = list15.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                                    }
                                                } else {
                                                    arrayList = emptyList;
                                                }
                                                return new Triple(num17, num18, arrayList);
                                            }
                                        } catch (Exception unused3) {
                                            emptyList = emptyList2;
                                            return new Triple(new Integer(0), new Integer(0), emptyList);
                                        }
                                        num2 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19867i.f47624b;
                                        num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                                        num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                        z8 = z5;
                                        str11 = str8;
                                        vmaVar = vmaVar2;
                                        i7 = i5;
                                        VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$6 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                        i8 = i4;
                                        str12 = str7;
                                        emptyList2 = emptyList4;
                                        ref$ObjectRef4 = null;
                                        Integer num19 = num5;
                                        str13 = str5;
                                        Boolean bool5 = bool;
                                        ref$ObjectRef5 = ref$ObjectRef3;
                                    } catch (Exception unused4) {
                                        emptyList = emptyList4;
                                        return new Triple(new Integer(0), new Integer(0), emptyList);
                                    }
                                }
                            }
                        } else {
                            boolean z18 = z3;
                            str7 = str4;
                            z5 = z18;
                            ref$ObjectRef3 = ref$ObjectRef2;
                            str8 = str6;
                            i5 = i3;
                            z6 = z4;
                            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                            ref$IntRef2.f47716a = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19859a;
                            listM15421q0 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new qk9(12, ref$IntRef2, ref$ObjectRef3)));
                            co0 co0Var2 = this.f16572e;
                            Integer num20 = new Integer(i4);
                            if (i5 == -1) {
                                i6 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19862d;
                            } else {
                                i6 = i5;
                            }
                            Integer num21 = new Integer(i6);
                            String columnName2 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19861c.getColumnName();
                            String serverSortName2 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19863e.getServerSortName();
                            if (str8 == null) {
                                if (z5) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                            } else if (z5) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            Boolean boolValueOf2 = Boolean.valueOf(z7);
                            if (z6) {
                                bool = Boolean.TRUE;
                            } else {
                                bool = null;
                            }
                            if (str8 != null) {
                                str10 = null;
                            } else {
                                str10 = null;
                            }
                            Object obj7 = ref$ObjectRef3.f47718a;
                            List<String> list16 = ((VocabularySearchQuery) obj7).f19865g;
                            num = (Integer) ((VocabularySearchQuery) obj7).f19867i.f47624b;
                            if (num != null) {
                                list = listM15421q0;
                            } else {
                                list = listM15421q0;
                                if (num.intValue() == -1) {
                                    num2 = null;
                                }
                                num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                                if (num3 == null) {
                                    num4 = num2;
                                } else {
                                    num4 = num2;
                                    if (num3.intValue() == -1) {
                                        num5 = null;
                                    }
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                    z8 = z5;
                                    str11 = str8;
                                    vmaVar = vmaVar2;
                                    i7 = i5;
                                    VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$7 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                    i8 = i4;
                                    str12 = str7;
                                    emptyList2 = emptyList4;
                                    ref$ObjectRef4 = null;
                                    Integer num110 = num5;
                                    str13 = str5;
                                    Boolean bool6 = bool;
                                    ref$ObjectRef5 = ref$ObjectRef3;
                                    objM4906b = co0Var2.m4906b(str13, num20, num21, str12, columnName2, serverSortName2, list, boolValueOf2, bool6, str10, list16, num4, num110, vocabularyRepositoryImpl$syncVocabularyCards$7);
                                    vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$7;
                                    if (objM4906b == coroutineSingletons) {
                                        obj3 = objM4906b;
                                        str14 = str13;
                                        str15 = str12;
                                        ref$ObjectRef6 = ref$ObjectRef5;
                                        i9 = i8;
                                        str16 = str11;
                                        z9 = z8;
                                        z10 = z6;
                                        i10 = i7;
                                        results = (Results) obj3;
                                        list2 = results.f21739d;
                                        if (list2 != null) {
                                            c83 c83Var7 = ((C1371d) vmaVar).f18561A;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                            objM15541t2 = AbstractC3224d.m15541t(c83Var7, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                            if (objM15541t2 != coroutineSingletons) {
                                                ref$ObjectRef7 = ref$ObjectRef6;
                                                str17 = str16;
                                                str18 = str14;
                                                results2 = results;
                                                z11 = z10;
                                                i11 = i9;
                                                str19 = str15;
                                                z12 = z9;
                                                i12 = i10;
                                                i13 = 0;
                                                linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                                emptyList3 = emptyList2;
                                                list3 = list2;
                                                linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                                obj4 = null;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                                coroutineSingletons = coroutineSingletons;
                                                if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                    String str29 = str19;
                                                    i14 = i11;
                                                    str20 = str29;
                                                    list4 = list3;
                                                    i15 = i12;
                                                    ref$ObjectRef8 = ref$ObjectRef7;
                                                    results3 = results2;
                                                    if (i15 == -1) {
                                                        i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                    } else {
                                                        i16 = i15;
                                                    }
                                                    int i113 = (i14 - 1) * i16;
                                                    ?? r111 = obj4;
                                                    String str210 = str18;
                                                    int i216 = i16;
                                                    int i217 = i113 + i216;
                                                    List list17 = list4;
                                                    lingQDatabase = this.f16568a;
                                                    int i218 = i15;
                                                    emptyList = emptyList3;
                                                    CoroutineSingletons coroutineSingletons6 = coroutineSingletons;
                                                    int i219 = i13;
                                                    boolean z19 = z12;
                                                    results4 = results3;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str210, list17, z19, this, str20, ref$ObjectRef8, i14, z11, str17, i216, i113, i217, null);
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r111;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r111;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r111;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r111;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r111;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r111;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z19;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i218;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i219;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                    coroutineSingletons = coroutineSingletons6;
                                                    if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                        results5 = results4;
                                                        results = results5;
                                                    }
                                                }
                                            }
                                        } else {
                                            emptyList = emptyList2;
                                        }
                                        list5 = results.f21739d;
                                        if (list5 != null) {
                                            size = list5.size();
                                        } else {
                                            size = 0;
                                        }
                                        Integer num111 = new Integer(size);
                                        Integer num112 = new Integer(results.f21736a);
                                        list6 = results.f21739d;
                                        if (list6 != null) {
                                            List list18 = list6;
                                            arrayList = new ArrayList(v91.m23189q0(list18, 10));
                                            it = list18.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                            }
                                        } else {
                                            arrayList = emptyList;
                                        }
                                        return new Triple(num111, num112, arrayList);
                                    }
                                }
                                num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                z8 = z5;
                                str11 = str8;
                                vmaVar = vmaVar2;
                                i7 = i5;
                                VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$8 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                i8 = i4;
                                str12 = str7;
                                emptyList2 = emptyList4;
                                ref$ObjectRef4 = null;
                                Integer num113 = num5;
                                str13 = str5;
                                Boolean bool7 = bool;
                                ref$ObjectRef5 = ref$ObjectRef3;
                                objM4906b = co0Var2.m4906b(str13, num20, num21, str12, columnName2, serverSortName2, list, boolValueOf2, bool7, str10, list16, num4, num113, vocabularyRepositoryImpl$syncVocabularyCards$8);
                                vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$8;
                                if (objM4906b == coroutineSingletons) {
                                    obj3 = objM4906b;
                                    str14 = str13;
                                    str15 = str12;
                                    ref$ObjectRef6 = ref$ObjectRef5;
                                    i9 = i8;
                                    str16 = str11;
                                    z9 = z8;
                                    z10 = z6;
                                    i10 = i7;
                                    results = (Results) obj3;
                                    list2 = results.f21739d;
                                    if (list2 != null) {
                                        c83 c83Var8 = ((C1371d) vmaVar).f18561A;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                        objM15541t2 = AbstractC3224d.m15541t(c83Var8, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                        if (objM15541t2 != coroutineSingletons) {
                                            ref$ObjectRef7 = ref$ObjectRef6;
                                            str17 = str16;
                                            str18 = str14;
                                            results2 = results;
                                            z11 = z10;
                                            i11 = i9;
                                            str19 = str15;
                                            z12 = z9;
                                            i12 = i10;
                                            i13 = 0;
                                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                            emptyList3 = emptyList2;
                                            list3 = list2;
                                            linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                            obj4 = null;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                            coroutineSingletons = coroutineSingletons;
                                            if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                String str211 = str19;
                                                i14 = i11;
                                                str20 = str211;
                                                list4 = list3;
                                                i15 = i12;
                                                ref$ObjectRef8 = ref$ObjectRef7;
                                                results3 = results2;
                                                if (i15 == -1) {
                                                    i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                } else {
                                                    i16 = i15;
                                                }
                                                int i114 = (i14 - 1) * i16;
                                                ?? r112 = obj4;
                                                String str212 = str18;
                                                int i2110 = i16;
                                                int i2111 = i114 + i2110;
                                                List list19 = list4;
                                                lingQDatabase = this.f16568a;
                                                int i2112 = i15;
                                                emptyList = emptyList3;
                                                CoroutineSingletons coroutineSingletons7 = coroutineSingletons;
                                                int i2113 = i13;
                                                boolean z110 = z12;
                                                results4 = results3;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str212, list19, z110, this, str20, ref$ObjectRef8, i14, z11, str17, i2110, i114, i2111, null);
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r112;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r112;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r112;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r112;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r112;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r112;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z110;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i2112;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i2113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                coroutineSingletons = coroutineSingletons7;
                                                if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                    results5 = results4;
                                                    results = results5;
                                                }
                                            }
                                        }
                                    } else {
                                        emptyList = emptyList2;
                                    }
                                    list5 = results.f21739d;
                                    if (list5 != null) {
                                        size = list5.size();
                                    } else {
                                        size = 0;
                                    }
                                    Integer num114 = new Integer(size);
                                    Integer num115 = new Integer(results.f21736a);
                                    list6 = results.f21739d;
                                    if (list6 != null) {
                                        List list110 = list6;
                                        arrayList = new ArrayList(v91.m23189q0(list110, 10));
                                        it = list110.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                        }
                                    } else {
                                        arrayList = emptyList;
                                    }
                                    return new Triple(num114, num115, arrayList);
                                }
                            }
                            num2 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19867i.f47624b;
                            num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                            if (num3 == null) {
                                num4 = num2;
                            } else {
                                num4 = num2;
                                if (num3.intValue() == -1) {
                                    num5 = null;
                                }
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                z8 = z5;
                                str11 = str8;
                                vmaVar = vmaVar2;
                                i7 = i5;
                                VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$9 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                i8 = i4;
                                str12 = str7;
                                emptyList2 = emptyList4;
                                ref$ObjectRef4 = null;
                                Integer num116 = num5;
                                str13 = str5;
                                Boolean bool8 = bool;
                                ref$ObjectRef5 = ref$ObjectRef3;
                                objM4906b = co0Var2.m4906b(str13, num20, num21, str12, columnName2, serverSortName2, list, boolValueOf2, bool8, str10, list16, num4, num116, vocabularyRepositoryImpl$syncVocabularyCards$9);
                                vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$9;
                                if (objM4906b == coroutineSingletons) {
                                    obj3 = objM4906b;
                                    str14 = str13;
                                    str15 = str12;
                                    ref$ObjectRef6 = ref$ObjectRef5;
                                    i9 = i8;
                                    str16 = str11;
                                    z9 = z8;
                                    z10 = z6;
                                    i10 = i7;
                                    results = (Results) obj3;
                                    list2 = results.f21739d;
                                    if (list2 != null) {
                                        c83 c83Var9 = ((C1371d) vmaVar).f18561A;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                        objM15541t2 = AbstractC3224d.m15541t(c83Var9, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                        if (objM15541t2 != coroutineSingletons) {
                                            ref$ObjectRef7 = ref$ObjectRef6;
                                            str17 = str16;
                                            str18 = str14;
                                            results2 = results;
                                            z11 = z10;
                                            i11 = i9;
                                            str19 = str15;
                                            z12 = z9;
                                            i12 = i10;
                                            i13 = 0;
                                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                            emptyList3 = emptyList2;
                                            list3 = list2;
                                            linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                            obj4 = null;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                            coroutineSingletons = coroutineSingletons;
                                            if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                String str213 = str19;
                                                i14 = i11;
                                                str20 = str213;
                                                list4 = list3;
                                                i15 = i12;
                                                ref$ObjectRef8 = ref$ObjectRef7;
                                                results3 = results2;
                                                if (i15 == -1) {
                                                    i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                } else {
                                                    i16 = i15;
                                                }
                                                int i115 = (i14 - 1) * i16;
                                                ?? r113 = obj4;
                                                String str214 = str18;
                                                int i2114 = i16;
                                                int i2115 = i115 + i2114;
                                                List list111 = list4;
                                                lingQDatabase = this.f16568a;
                                                int i2116 = i15;
                                                emptyList = emptyList3;
                                                CoroutineSingletons coroutineSingletons8 = coroutineSingletons;
                                                int i2117 = i13;
                                                boolean z111 = z12;
                                                results4 = results3;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str214, list111, z111, this, str20, ref$ObjectRef8, i14, z11, str17, i2114, i115, i2115, null);
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z111;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i2116;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i2117;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                coroutineSingletons = coroutineSingletons8;
                                                if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                    results5 = results4;
                                                    results = results5;
                                                }
                                            }
                                        }
                                    } else {
                                        emptyList = emptyList2;
                                    }
                                    list5 = results.f21739d;
                                    if (list5 != null) {
                                        size = list5.size();
                                    } else {
                                        size = 0;
                                    }
                                    Integer num117 = new Integer(size);
                                    Integer num118 = new Integer(results.f21736a);
                                    list6 = results.f21739d;
                                    if (list6 != null) {
                                        List list112 = list6;
                                        arrayList = new ArrayList(v91.m23189q0(list112, 10));
                                        it = list112.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                        }
                                    } else {
                                        arrayList = emptyList;
                                    }
                                    return new Triple(num117, num118, arrayList);
                                }
                            }
                            num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                            z8 = z5;
                            str11 = str8;
                            vmaVar = vmaVar2;
                            i7 = i5;
                            VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$10 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                            i8 = i4;
                            str12 = str7;
                            emptyList2 = emptyList4;
                            ref$ObjectRef4 = null;
                            Integer num119 = num5;
                            str13 = str5;
                            Boolean bool9 = bool;
                            ref$ObjectRef5 = ref$ObjectRef3;
                            objM4906b = co0Var2.m4906b(str13, num20, num21, str12, columnName2, serverSortName2, list, boolValueOf2, bool9, str10, list16, num4, num119, vocabularyRepositoryImpl$syncVocabularyCards$10);
                            vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$10;
                            if (objM4906b == coroutineSingletons) {
                                obj3 = objM4906b;
                                str14 = str13;
                                str15 = str12;
                                ref$ObjectRef6 = ref$ObjectRef5;
                                i9 = i8;
                                str16 = str11;
                                z9 = z8;
                                z10 = z6;
                                i10 = i7;
                                results = (Results) obj3;
                                list2 = results.f21739d;
                                if (list2 != null) {
                                    c83 c83Var10 = ((C1371d) vmaVar).f18561A;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                    objM15541t2 = AbstractC3224d.m15541t(c83Var10, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                    if (objM15541t2 != coroutineSingletons) {
                                        ref$ObjectRef7 = ref$ObjectRef6;
                                        str17 = str16;
                                        str18 = str14;
                                        results2 = results;
                                        z11 = z10;
                                        i11 = i9;
                                        str19 = str15;
                                        z12 = z9;
                                        i12 = i10;
                                        i13 = 0;
                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                        emptyList3 = emptyList2;
                                        list3 = list2;
                                        linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                        obj4 = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                        coroutineSingletons = coroutineSingletons;
                                        if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                            String str215 = str19;
                                            i14 = i11;
                                            str20 = str215;
                                            list4 = list3;
                                            i15 = i12;
                                            ref$ObjectRef8 = ref$ObjectRef7;
                                            results3 = results2;
                                            if (i15 == -1) {
                                                i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                            } else {
                                                i16 = i15;
                                            }
                                            int i116 = (i14 - 1) * i16;
                                            ?? r114 = obj4;
                                            String str216 = str18;
                                            int i2118 = i16;
                                            int i2119 = i116 + i2118;
                                            List list113 = list4;
                                            lingQDatabase = this.f16568a;
                                            int i21110 = i15;
                                            emptyList = emptyList3;
                                            CoroutineSingletons coroutineSingletons9 = coroutineSingletons;
                                            int i21111 = i13;
                                            boolean z112 = z12;
                                            results4 = results3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str216, list113, z112, this, str20, ref$ObjectRef8, i14, z11, str17, i2118, i116, i2119, null);
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z112;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i21110;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i21111;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                            coroutineSingletons = coroutineSingletons9;
                                            if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                results5 = results4;
                                                results = results5;
                                            }
                                        }
                                    }
                                } else {
                                    emptyList = emptyList2;
                                }
                                list5 = results.f21739d;
                                if (list5 != null) {
                                    size = list5.size();
                                } else {
                                    size = 0;
                                }
                                Integer num1110 = new Integer(size);
                                Integer num1111 = new Integer(results.f21736a);
                                list6 = results.f21739d;
                                if (list6 != null) {
                                    List list114 = list6;
                                    arrayList = new ArrayList(v91.m23189q0(list114, 10));
                                    it = list114.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                    }
                                } else {
                                    arrayList = emptyList;
                                }
                                return new Triple(num1110, num1111, arrayList);
                            }
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    obj = obj5;
                    int i30 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i;
                    boolean z20 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l;
                    boolean z21 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k;
                    i4 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h;
                    ref$ObjectRef = vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e;
                    ref$ObjectRef2 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d;
                    String str30 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c;
                    String str31 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b;
                    str5 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a;
                    AbstractC3193b.m15359b(obj);
                    i3 = i30;
                    str6 = str30;
                    z3 = z21;
                    str4 = str31;
                    z4 = z20;
                    ref$ObjectRef.f47718a = ((Map) obj).get(str5);
                    if (ref$ObjectRef2.f47718a == null) {
                        ref$ObjectRef2.f47718a = new VocabularySearchQuery();
                        c83 c83Var11 = ((C1371d) vmaVar2).f18580q;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str4;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str6;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef2;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z3;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z4;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i3;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 2;
                        objM15541t = AbstractC3224d.m15541t(c83Var11, vocabularyRepositoryImpl$syncVocabularyCards$1);
                        if (objM15541t == coroutineSingletons) {
                            Ref$ObjectRef ref$ObjectRef10 = ref$ObjectRef2;
                            str8 = str6;
                            obj2 = objM15541t;
                            ref$ObjectRef3 = ref$ObjectRef10;
                            boolean z113 = z3;
                            str7 = str4;
                            z5 = z113;
                            linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) obj2);
                            linkedHashMapM15372Y.put(str5, ref$ObjectRef3.f47718a);
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i3;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 3;
                            if (((C1371d) vmaVar2).m7974n(linkedHashMapM15372Y, vocabularyRepositoryImpl$syncVocabularyCards$1) != coroutineSingletons) {
                                i5 = i3;
                                z6 = z4;
                                str9 = str5;
                                str5 = str9;
                                Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                                ref$IntRef3.f47716a = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19859a;
                                listM15421q0 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new qk9(12, ref$IntRef3, ref$ObjectRef3)));
                                co0 co0Var3 = this.f16572e;
                                Integer num22 = new Integer(i4);
                                if (i5 == -1) {
                                    i6 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19862d;
                                } else {
                                    i6 = i5;
                                }
                                Integer num23 = new Integer(i6);
                                String columnName3 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19861c.getColumnName();
                                String serverSortName3 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19863e.getServerSortName();
                                if (str8 == null) {
                                    if (z5) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                } else if (z5) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                Boolean boolValueOf3 = Boolean.valueOf(z7);
                                if (z6) {
                                    bool = Boolean.TRUE;
                                } else {
                                    bool = null;
                                }
                                if (str8 != null) {
                                    str10 = null;
                                } else {
                                    str10 = null;
                                }
                                Object obj8 = ref$ObjectRef3.f47718a;
                                List<String> list115 = ((VocabularySearchQuery) obj8).f19865g;
                                num = (Integer) ((VocabularySearchQuery) obj8).f19867i.f47624b;
                                if (num != null) {
                                    list = listM15421q0;
                                } else {
                                    list = listM15421q0;
                                    if (num.intValue() == -1) {
                                        num2 = null;
                                    }
                                    num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                                    if (num3 == null) {
                                        num4 = num2;
                                    } else {
                                        num4 = num2;
                                        if (num3.intValue() == -1) {
                                            num5 = null;
                                        }
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                        z8 = z5;
                                        str11 = str8;
                                        vmaVar = vmaVar2;
                                        i7 = i5;
                                        VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$11 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                        i8 = i4;
                                        str12 = str7;
                                        emptyList2 = emptyList4;
                                        ref$ObjectRef4 = null;
                                        Integer num1112 = num5;
                                        str13 = str5;
                                        Boolean bool10 = bool;
                                        ref$ObjectRef5 = ref$ObjectRef3;
                                        objM4906b = co0Var3.m4906b(str13, num22, num23, str12, columnName3, serverSortName3, list, boolValueOf3, bool10, str10, list115, num4, num1112, vocabularyRepositoryImpl$syncVocabularyCards$11);
                                        vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$11;
                                        if (objM4906b == coroutineSingletons) {
                                            obj3 = objM4906b;
                                            str14 = str13;
                                            str15 = str12;
                                            ref$ObjectRef6 = ref$ObjectRef5;
                                            i9 = i8;
                                            str16 = str11;
                                            z9 = z8;
                                            z10 = z6;
                                            i10 = i7;
                                            results = (Results) obj3;
                                            list2 = results.f21739d;
                                            if (list2 != null) {
                                                c83 c83Var12 = ((C1371d) vmaVar).f18561A;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                                objM15541t2 = AbstractC3224d.m15541t(c83Var12, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                                if (objM15541t2 != coroutineSingletons) {
                                                    ref$ObjectRef7 = ref$ObjectRef6;
                                                    str17 = str16;
                                                    str18 = str14;
                                                    results2 = results;
                                                    z11 = z10;
                                                    i11 = i9;
                                                    str19 = str15;
                                                    z12 = z9;
                                                    i12 = i10;
                                                    i13 = 0;
                                                    linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                                    emptyList3 = emptyList2;
                                                    list3 = list2;
                                                    linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                                    obj4 = null;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                                    coroutineSingletons = coroutineSingletons;
                                                    if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                        String str217 = str19;
                                                        i14 = i11;
                                                        str20 = str217;
                                                        list4 = list3;
                                                        i15 = i12;
                                                        ref$ObjectRef8 = ref$ObjectRef7;
                                                        results3 = results2;
                                                        if (i15 == -1) {
                                                            i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                        } else {
                                                            i16 = i15;
                                                        }
                                                        int i117 = (i14 - 1) * i16;
                                                        ?? r115 = obj4;
                                                        String str218 = str18;
                                                        int i21112 = i16;
                                                        int i21113 = i117 + i21112;
                                                        List list116 = list4;
                                                        lingQDatabase = this.f16568a;
                                                        int i21114 = i15;
                                                        emptyList = emptyList3;
                                                        CoroutineSingletons coroutineSingletons10 = coroutineSingletons;
                                                        int i21115 = i13;
                                                        boolean z114 = z12;
                                                        results4 = results3;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str218, list116, z114, this, str20, ref$ObjectRef8, i14, z11, str17, i21112, i117, i21113, null);
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r115;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r115;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r115;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r115;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r115;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r115;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z114;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i21114;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i21115;
                                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                        coroutineSingletons = coroutineSingletons10;
                                                        if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                            results5 = results4;
                                                            results = results5;
                                                        }
                                                    }
                                                }
                                            } else {
                                                emptyList = emptyList2;
                                            }
                                            list5 = results.f21739d;
                                            if (list5 != null) {
                                                size = list5.size();
                                            } else {
                                                size = 0;
                                            }
                                            Integer num1113 = new Integer(size);
                                            Integer num1114 = new Integer(results.f21736a);
                                            list6 = results.f21739d;
                                            if (list6 != null) {
                                                List list117 = list6;
                                                arrayList = new ArrayList(v91.m23189q0(list117, 10));
                                                it = list117.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                                }
                                            } else {
                                                arrayList = emptyList;
                                            }
                                            return new Triple(num1113, num1114, arrayList);
                                        }
                                    }
                                    num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                    z8 = z5;
                                    str11 = str8;
                                    vmaVar = vmaVar2;
                                    i7 = i5;
                                    VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$12 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                    i8 = i4;
                                    str12 = str7;
                                    emptyList2 = emptyList4;
                                    ref$ObjectRef4 = null;
                                    Integer num1115 = num5;
                                    str13 = str5;
                                    Boolean bool11 = bool;
                                    ref$ObjectRef5 = ref$ObjectRef3;
                                    objM4906b = co0Var3.m4906b(str13, num22, num23, str12, columnName3, serverSortName3, list, boolValueOf3, bool11, str10, list115, num4, num1115, vocabularyRepositoryImpl$syncVocabularyCards$12);
                                    vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$12;
                                    if (objM4906b == coroutineSingletons) {
                                        obj3 = objM4906b;
                                        str14 = str13;
                                        str15 = str12;
                                        ref$ObjectRef6 = ref$ObjectRef5;
                                        i9 = i8;
                                        str16 = str11;
                                        z9 = z8;
                                        z10 = z6;
                                        i10 = i7;
                                        results = (Results) obj3;
                                        list2 = results.f21739d;
                                        if (list2 != null) {
                                            c83 c83Var13 = ((C1371d) vmaVar).f18561A;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                            objM15541t2 = AbstractC3224d.m15541t(c83Var13, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                            if (objM15541t2 != coroutineSingletons) {
                                                ref$ObjectRef7 = ref$ObjectRef6;
                                                str17 = str16;
                                                str18 = str14;
                                                results2 = results;
                                                z11 = z10;
                                                i11 = i9;
                                                str19 = str15;
                                                z12 = z9;
                                                i12 = i10;
                                                i13 = 0;
                                                linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                                emptyList3 = emptyList2;
                                                list3 = list2;
                                                linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                                obj4 = null;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                                coroutineSingletons = coroutineSingletons;
                                                if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                    String str219 = str19;
                                                    i14 = i11;
                                                    str20 = str219;
                                                    list4 = list3;
                                                    i15 = i12;
                                                    ref$ObjectRef8 = ref$ObjectRef7;
                                                    results3 = results2;
                                                    if (i15 == -1) {
                                                        i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                    } else {
                                                        i16 = i15;
                                                    }
                                                    int i118 = (i14 - 1) * i16;
                                                    ?? r116 = obj4;
                                                    String str2110 = str18;
                                                    int i21116 = i16;
                                                    int i21117 = i118 + i21116;
                                                    List list118 = list4;
                                                    lingQDatabase = this.f16568a;
                                                    int i21118 = i15;
                                                    emptyList = emptyList3;
                                                    CoroutineSingletons coroutineSingletons11 = coroutineSingletons;
                                                    int i21119 = i13;
                                                    boolean z115 = z12;
                                                    results4 = results3;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str2110, list118, z115, this, str20, ref$ObjectRef8, i14, z11, str17, i21116, i118, i21117, null);
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r116;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r116;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r116;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r116;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r116;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r116;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z115;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i21118;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i21119;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                    coroutineSingletons = coroutineSingletons11;
                                                    if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                        results5 = results4;
                                                        results = results5;
                                                    }
                                                }
                                            }
                                        } else {
                                            emptyList = emptyList2;
                                        }
                                        list5 = results.f21739d;
                                        if (list5 != null) {
                                            size = list5.size();
                                        } else {
                                            size = 0;
                                        }
                                        Integer num1116 = new Integer(size);
                                        Integer num1117 = new Integer(results.f21736a);
                                        list6 = results.f21739d;
                                        if (list6 != null) {
                                            List list119 = list6;
                                            arrayList = new ArrayList(v91.m23189q0(list119, 10));
                                            it = list119.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                            }
                                        } else {
                                            arrayList = emptyList;
                                        }
                                        return new Triple(num1116, num1117, arrayList);
                                    }
                                }
                                num2 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19867i.f47624b;
                                num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                                if (num3 == null) {
                                    num4 = num2;
                                } else {
                                    num4 = num2;
                                    if (num3.intValue() == -1) {
                                        num5 = null;
                                    }
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                    z8 = z5;
                                    str11 = str8;
                                    vmaVar = vmaVar2;
                                    i7 = i5;
                                    VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$13 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                    i8 = i4;
                                    str12 = str7;
                                    emptyList2 = emptyList4;
                                    ref$ObjectRef4 = null;
                                    Integer num1118 = num5;
                                    str13 = str5;
                                    Boolean bool12 = bool;
                                    ref$ObjectRef5 = ref$ObjectRef3;
                                    objM4906b = co0Var3.m4906b(str13, num22, num23, str12, columnName3, serverSortName3, list, boolValueOf3, bool12, str10, list115, num4, num1118, vocabularyRepositoryImpl$syncVocabularyCards$13);
                                    vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$13;
                                    if (objM4906b == coroutineSingletons) {
                                        obj3 = objM4906b;
                                        str14 = str13;
                                        str15 = str12;
                                        ref$ObjectRef6 = ref$ObjectRef5;
                                        i9 = i8;
                                        str16 = str11;
                                        z9 = z8;
                                        z10 = z6;
                                        i10 = i7;
                                        results = (Results) obj3;
                                        list2 = results.f21739d;
                                        if (list2 != null) {
                                            c83 c83Var14 = ((C1371d) vmaVar).f18561A;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                            objM15541t2 = AbstractC3224d.m15541t(c83Var14, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                            if (objM15541t2 != coroutineSingletons) {
                                                ref$ObjectRef7 = ref$ObjectRef6;
                                                str17 = str16;
                                                str18 = str14;
                                                results2 = results;
                                                z11 = z10;
                                                i11 = i9;
                                                str19 = str15;
                                                z12 = z9;
                                                i12 = i10;
                                                i13 = 0;
                                                linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                                emptyList3 = emptyList2;
                                                list3 = list2;
                                                linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                                obj4 = null;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                                coroutineSingletons = coroutineSingletons;
                                                if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                    String str2111 = str19;
                                                    i14 = i11;
                                                    str20 = str2111;
                                                    list4 = list3;
                                                    i15 = i12;
                                                    ref$ObjectRef8 = ref$ObjectRef7;
                                                    results3 = results2;
                                                    if (i15 == -1) {
                                                        i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                    } else {
                                                        i16 = i15;
                                                    }
                                                    int i119 = (i14 - 1) * i16;
                                                    ?? r117 = obj4;
                                                    String str2112 = str18;
                                                    int i211110 = i16;
                                                    int i211111 = i119 + i211110;
                                                    List list1110 = list4;
                                                    lingQDatabase = this.f16568a;
                                                    int i211112 = i15;
                                                    emptyList = emptyList3;
                                                    CoroutineSingletons coroutineSingletons12 = coroutineSingletons;
                                                    int i211113 = i13;
                                                    boolean z116 = z12;
                                                    results4 = results3;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str2112, list1110, z116, this, str20, ref$ObjectRef8, i14, z11, str17, i211110, i119, i211111, null);
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r117;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r117;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r117;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r117;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r117;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r117;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z116;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i211112;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i211113;
                                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                    coroutineSingletons = coroutineSingletons12;
                                                    if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                        results5 = results4;
                                                        results = results5;
                                                    }
                                                }
                                            }
                                        } else {
                                            emptyList = emptyList2;
                                        }
                                        list5 = results.f21739d;
                                        if (list5 != null) {
                                            size = list5.size();
                                        } else {
                                            size = 0;
                                        }
                                        Integer num1119 = new Integer(size);
                                        Integer num11110 = new Integer(results.f21736a);
                                        list6 = results.f21739d;
                                        if (list6 != null) {
                                            List list1111 = list6;
                                            arrayList = new ArrayList(v91.m23189q0(list1111, 10));
                                            it = list1111.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                            }
                                        } else {
                                            arrayList = emptyList;
                                        }
                                        return new Triple(num1119, num11110, arrayList);
                                    }
                                }
                                num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                z8 = z5;
                                str11 = str8;
                                vmaVar = vmaVar2;
                                i7 = i5;
                                VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$14 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                i8 = i4;
                                str12 = str7;
                                emptyList2 = emptyList4;
                                ref$ObjectRef4 = null;
                                Integer num11111 = num5;
                                str13 = str5;
                                Boolean bool13 = bool;
                                ref$ObjectRef5 = ref$ObjectRef3;
                                objM4906b = co0Var3.m4906b(str13, num22, num23, str12, columnName3, serverSortName3, list, boolValueOf3, bool13, str10, list115, num4, num11111, vocabularyRepositoryImpl$syncVocabularyCards$14);
                                vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$14;
                                if (objM4906b == coroutineSingletons) {
                                    obj3 = objM4906b;
                                    str14 = str13;
                                    str15 = str12;
                                    ref$ObjectRef6 = ref$ObjectRef5;
                                    i9 = i8;
                                    str16 = str11;
                                    z9 = z8;
                                    z10 = z6;
                                    i10 = i7;
                                    results = (Results) obj3;
                                    list2 = results.f21739d;
                                    if (list2 != null) {
                                        c83 c83Var15 = ((C1371d) vmaVar).f18561A;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                        objM15541t2 = AbstractC3224d.m15541t(c83Var15, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                        if (objM15541t2 != coroutineSingletons) {
                                            ref$ObjectRef7 = ref$ObjectRef6;
                                            str17 = str16;
                                            str18 = str14;
                                            results2 = results;
                                            z11 = z10;
                                            i11 = i9;
                                            str19 = str15;
                                            z12 = z9;
                                            i12 = i10;
                                            i13 = 0;
                                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                            emptyList3 = emptyList2;
                                            list3 = list2;
                                            linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                            obj4 = null;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                            coroutineSingletons = coroutineSingletons;
                                            if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                String str2113 = str19;
                                                i14 = i11;
                                                str20 = str2113;
                                                list4 = list3;
                                                i15 = i12;
                                                ref$ObjectRef8 = ref$ObjectRef7;
                                                results3 = results2;
                                                if (i15 == -1) {
                                                    i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                } else {
                                                    i16 = i15;
                                                }
                                                int i1110 = (i14 - 1) * i16;
                                                ?? r118 = obj4;
                                                String str2114 = str18;
                                                int i211114 = i16;
                                                int i211115 = i1110 + i211114;
                                                List list1112 = list4;
                                                lingQDatabase = this.f16568a;
                                                int i211116 = i15;
                                                emptyList = emptyList3;
                                                CoroutineSingletons coroutineSingletons13 = coroutineSingletons;
                                                int i211117 = i13;
                                                boolean z117 = z12;
                                                results4 = results3;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str2114, list1112, z117, this, str20, ref$ObjectRef8, i14, z11, str17, i211114, i1110, i211115, null);
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r118;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r118;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r118;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r118;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r118;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r118;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z117;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i211116;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i211117;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                coroutineSingletons = coroutineSingletons13;
                                                if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                    results5 = results4;
                                                    results = results5;
                                                }
                                            }
                                        }
                                    } else {
                                        emptyList = emptyList2;
                                    }
                                    list5 = results.f21739d;
                                    if (list5 != null) {
                                        size = list5.size();
                                    } else {
                                        size = 0;
                                    }
                                    Integer num11112 = new Integer(size);
                                    Integer num11113 = new Integer(results.f21736a);
                                    list6 = results.f21739d;
                                    if (list6 != null) {
                                        List list1113 = list6;
                                        arrayList = new ArrayList(v91.m23189q0(list1113, 10));
                                        it = list1113.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                        }
                                    } else {
                                        arrayList = emptyList;
                                    }
                                    return new Triple(num11112, num11113, arrayList);
                                }
                            }
                        }
                    } else {
                        boolean z118 = z3;
                        str7 = str4;
                        z5 = z118;
                        ref$ObjectRef3 = ref$ObjectRef2;
                        str8 = str6;
                        i5 = i3;
                        z6 = z4;
                        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                        ref$IntRef4.f47716a = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19859a;
                        listM15421q0 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new qk9(12, ref$IntRef4, ref$ObjectRef3)));
                        co0 co0Var4 = this.f16572e;
                        Integer num24 = new Integer(i4);
                        if (i5 == -1) {
                            i6 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19862d;
                        } else {
                            i6 = i5;
                        }
                        Integer num25 = new Integer(i6);
                        String columnName4 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19861c.getColumnName();
                        String serverSortName4 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19863e.getServerSortName();
                        if (str8 == null) {
                            if (z5) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                        } else if (z5) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        Boolean boolValueOf4 = Boolean.valueOf(z7);
                        if (z6) {
                            bool = Boolean.TRUE;
                        } else {
                            bool = null;
                        }
                        if (str8 != null) {
                            str10 = null;
                        } else {
                            str10 = null;
                        }
                        Object obj9 = ref$ObjectRef3.f47718a;
                        List<String> list1114 = ((VocabularySearchQuery) obj9).f19865g;
                        num = (Integer) ((VocabularySearchQuery) obj9).f19867i.f47624b;
                        if (num != null) {
                            list = listM15421q0;
                        } else {
                            list = listM15421q0;
                            if (num.intValue() == -1) {
                                num2 = null;
                            }
                            num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                            if (num3 == null) {
                                num4 = num2;
                            } else {
                                num4 = num2;
                                if (num3.intValue() == -1) {
                                    num5 = null;
                                }
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                z8 = z5;
                                str11 = str8;
                                vmaVar = vmaVar2;
                                i7 = i5;
                                VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$15 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                i8 = i4;
                                str12 = str7;
                                emptyList2 = emptyList4;
                                ref$ObjectRef4 = null;
                                Integer num11114 = num5;
                                str13 = str5;
                                Boolean bool14 = bool;
                                ref$ObjectRef5 = ref$ObjectRef3;
                                objM4906b = co0Var4.m4906b(str13, num24, num25, str12, columnName4, serverSortName4, list, boolValueOf4, bool14, str10, list1114, num4, num11114, vocabularyRepositoryImpl$syncVocabularyCards$15);
                                vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$15;
                                if (objM4906b == coroutineSingletons) {
                                    obj3 = objM4906b;
                                    str14 = str13;
                                    str15 = str12;
                                    ref$ObjectRef6 = ref$ObjectRef5;
                                    i9 = i8;
                                    str16 = str11;
                                    z9 = z8;
                                    z10 = z6;
                                    i10 = i7;
                                    results = (Results) obj3;
                                    list2 = results.f21739d;
                                    if (list2 != null) {
                                        c83 c83Var16 = ((C1371d) vmaVar).f18561A;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                        objM15541t2 = AbstractC3224d.m15541t(c83Var16, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                        if (objM15541t2 != coroutineSingletons) {
                                            ref$ObjectRef7 = ref$ObjectRef6;
                                            str17 = str16;
                                            str18 = str14;
                                            results2 = results;
                                            z11 = z10;
                                            i11 = i9;
                                            str19 = str15;
                                            z12 = z9;
                                            i12 = i10;
                                            i13 = 0;
                                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                            emptyList3 = emptyList2;
                                            list3 = list2;
                                            linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                            obj4 = null;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                            coroutineSingletons = coroutineSingletons;
                                            if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                String str2115 = str19;
                                                i14 = i11;
                                                str20 = str2115;
                                                list4 = list3;
                                                i15 = i12;
                                                ref$ObjectRef8 = ref$ObjectRef7;
                                                results3 = results2;
                                                if (i15 == -1) {
                                                    i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                } else {
                                                    i16 = i15;
                                                }
                                                int i1111 = (i14 - 1) * i16;
                                                ?? r119 = obj4;
                                                String str2116 = str18;
                                                int i211118 = i16;
                                                int i211119 = i1111 + i211118;
                                                List list1115 = list4;
                                                lingQDatabase = this.f16568a;
                                                int i2111110 = i15;
                                                emptyList = emptyList3;
                                                CoroutineSingletons coroutineSingletons14 = coroutineSingletons;
                                                int i2111111 = i13;
                                                boolean z119 = z12;
                                                results4 = results3;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str2116, list1115, z119, this, str20, ref$ObjectRef8, i14, z11, str17, i211118, i1111, i211119, null);
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r119;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r119;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r119;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r119;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r119;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r119;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z119;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i2111110;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i2111111;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                coroutineSingletons = coroutineSingletons14;
                                                if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                    results5 = results4;
                                                    results = results5;
                                                }
                                            }
                                        }
                                    } else {
                                        emptyList = emptyList2;
                                    }
                                    list5 = results.f21739d;
                                    if (list5 != null) {
                                        size = list5.size();
                                    } else {
                                        size = 0;
                                    }
                                    Integer num11115 = new Integer(size);
                                    Integer num11116 = new Integer(results.f21736a);
                                    list6 = results.f21739d;
                                    if (list6 != null) {
                                        List list1116 = list6;
                                        arrayList = new ArrayList(v91.m23189q0(list1116, 10));
                                        it = list1116.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                        }
                                    } else {
                                        arrayList = emptyList;
                                    }
                                    return new Triple(num11115, num11116, arrayList);
                                }
                            }
                            num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                            z8 = z5;
                            str11 = str8;
                            vmaVar = vmaVar2;
                            i7 = i5;
                            VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$16 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                            i8 = i4;
                            str12 = str7;
                            emptyList2 = emptyList4;
                            ref$ObjectRef4 = null;
                            Integer num11117 = num5;
                            str13 = str5;
                            Boolean bool15 = bool;
                            ref$ObjectRef5 = ref$ObjectRef3;
                            objM4906b = co0Var4.m4906b(str13, num24, num25, str12, columnName4, serverSortName4, list, boolValueOf4, bool15, str10, list1114, num4, num11117, vocabularyRepositoryImpl$syncVocabularyCards$16);
                            vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$16;
                            if (objM4906b == coroutineSingletons) {
                                obj3 = objM4906b;
                                str14 = str13;
                                str15 = str12;
                                ref$ObjectRef6 = ref$ObjectRef5;
                                i9 = i8;
                                str16 = str11;
                                z9 = z8;
                                z10 = z6;
                                i10 = i7;
                                results = (Results) obj3;
                                list2 = results.f21739d;
                                if (list2 != null) {
                                    c83 c83Var17 = ((C1371d) vmaVar).f18561A;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                    objM15541t2 = AbstractC3224d.m15541t(c83Var17, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                    if (objM15541t2 != coroutineSingletons) {
                                        ref$ObjectRef7 = ref$ObjectRef6;
                                        str17 = str16;
                                        str18 = str14;
                                        results2 = results;
                                        z11 = z10;
                                        i11 = i9;
                                        str19 = str15;
                                        z12 = z9;
                                        i12 = i10;
                                        i13 = 0;
                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                        emptyList3 = emptyList2;
                                        list3 = list2;
                                        linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                        obj4 = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                        coroutineSingletons = coroutineSingletons;
                                        if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                            String str2117 = str19;
                                            i14 = i11;
                                            str20 = str2117;
                                            list4 = list3;
                                            i15 = i12;
                                            ref$ObjectRef8 = ref$ObjectRef7;
                                            results3 = results2;
                                            if (i15 == -1) {
                                                i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                            } else {
                                                i16 = i15;
                                            }
                                            int i1112 = (i14 - 1) * i16;
                                            ?? r1110 = obj4;
                                            String str2118 = str18;
                                            int i2111112 = i16;
                                            int i2111113 = i1112 + i2111112;
                                            List list1117 = list4;
                                            lingQDatabase = this.f16568a;
                                            int i2111114 = i15;
                                            emptyList = emptyList3;
                                            CoroutineSingletons coroutineSingletons15 = coroutineSingletons;
                                            int i2111115 = i13;
                                            boolean z1110 = z12;
                                            results4 = results3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str2118, list1117, z1110, this, str20, ref$ObjectRef8, i14, z11, str17, i2111112, i1112, i2111113, null);
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r1110;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r1110;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r1110;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r1110;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r1110;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r1110;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z1110;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i2111114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i2111115;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                            coroutineSingletons = coroutineSingletons15;
                                            if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                results5 = results4;
                                                results = results5;
                                            }
                                        }
                                    }
                                } else {
                                    emptyList = emptyList2;
                                }
                                list5 = results.f21739d;
                                if (list5 != null) {
                                    size = list5.size();
                                } else {
                                    size = 0;
                                }
                                Integer num11118 = new Integer(size);
                                Integer num11119 = new Integer(results.f21736a);
                                list6 = results.f21739d;
                                if (list6 != null) {
                                    List list1118 = list6;
                                    arrayList = new ArrayList(v91.m23189q0(list1118, 10));
                                    it = list1118.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                    }
                                } else {
                                    arrayList = emptyList;
                                }
                                return new Triple(num11118, num11119, arrayList);
                            }
                        }
                        num2 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19867i.f47624b;
                        num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                        if (num3 == null) {
                            num4 = num2;
                        } else {
                            num4 = num2;
                            if (num3.intValue() == -1) {
                                num5 = null;
                            }
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                            z8 = z5;
                            str11 = str8;
                            vmaVar = vmaVar2;
                            i7 = i5;
                            VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$17 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                            i8 = i4;
                            str12 = str7;
                            emptyList2 = emptyList4;
                            ref$ObjectRef4 = null;
                            Integer num111110 = num5;
                            str13 = str5;
                            Boolean bool16 = bool;
                            ref$ObjectRef5 = ref$ObjectRef3;
                            objM4906b = co0Var4.m4906b(str13, num24, num25, str12, columnName4, serverSortName4, list, boolValueOf4, bool16, str10, list1114, num4, num111110, vocabularyRepositoryImpl$syncVocabularyCards$17);
                            vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$17;
                            if (objM4906b == coroutineSingletons) {
                                obj3 = objM4906b;
                                str14 = str13;
                                str15 = str12;
                                ref$ObjectRef6 = ref$ObjectRef5;
                                i9 = i8;
                                str16 = str11;
                                z9 = z8;
                                z10 = z6;
                                i10 = i7;
                                results = (Results) obj3;
                                list2 = results.f21739d;
                                if (list2 != null) {
                                    c83 c83Var18 = ((C1371d) vmaVar).f18561A;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                    objM15541t2 = AbstractC3224d.m15541t(c83Var18, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                    if (objM15541t2 != coroutineSingletons) {
                                        ref$ObjectRef7 = ref$ObjectRef6;
                                        str17 = str16;
                                        str18 = str14;
                                        results2 = results;
                                        z11 = z10;
                                        i11 = i9;
                                        str19 = str15;
                                        z12 = z9;
                                        i12 = i10;
                                        i13 = 0;
                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                        emptyList3 = emptyList2;
                                        list3 = list2;
                                        linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                        obj4 = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                        coroutineSingletons = coroutineSingletons;
                                        if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                            String str2119 = str19;
                                            i14 = i11;
                                            str20 = str2119;
                                            list4 = list3;
                                            i15 = i12;
                                            ref$ObjectRef8 = ref$ObjectRef7;
                                            results3 = results2;
                                            if (i15 == -1) {
                                                i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                            } else {
                                                i16 = i15;
                                            }
                                            int i1113 = (i14 - 1) * i16;
                                            ?? r1111 = obj4;
                                            String str21110 = str18;
                                            int i2111116 = i16;
                                            int i2111117 = i1113 + i2111116;
                                            List list1119 = list4;
                                            lingQDatabase = this.f16568a;
                                            int i2111118 = i15;
                                            emptyList = emptyList3;
                                            CoroutineSingletons coroutineSingletons16 = coroutineSingletons;
                                            int i2111119 = i13;
                                            boolean z1111 = z12;
                                            results4 = results3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str21110, list1119, z1111, this, str20, ref$ObjectRef8, i14, z11, str17, i2111116, i1113, i2111117, null);
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r1111;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r1111;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r1111;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r1111;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r1111;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r1111;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z1111;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i2111118;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i2111119;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                            coroutineSingletons = coroutineSingletons16;
                                            if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                results5 = results4;
                                                results = results5;
                                            }
                                        }
                                    }
                                } else {
                                    emptyList = emptyList2;
                                }
                                list5 = results.f21739d;
                                if (list5 != null) {
                                    size = list5.size();
                                } else {
                                    size = 0;
                                }
                                Integer num111111 = new Integer(size);
                                Integer num111112 = new Integer(results.f21736a);
                                list6 = results.f21739d;
                                if (list6 != null) {
                                    List list11110 = list6;
                                    arrayList = new ArrayList(v91.m23189q0(list11110, 10));
                                    it = list11110.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                    }
                                } else {
                                    arrayList = emptyList;
                                }
                                return new Triple(num111111, num111112, arrayList);
                            }
                        }
                        num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                        z8 = z5;
                        str11 = str8;
                        vmaVar = vmaVar2;
                        i7 = i5;
                        VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$18 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                        i8 = i4;
                        str12 = str7;
                        emptyList2 = emptyList4;
                        ref$ObjectRef4 = null;
                        Integer num111113 = num5;
                        str13 = str5;
                        Boolean bool17 = bool;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        objM4906b = co0Var4.m4906b(str13, num24, num25, str12, columnName4, serverSortName4, list, boolValueOf4, bool17, str10, list1114, num4, num111113, vocabularyRepositoryImpl$syncVocabularyCards$18);
                        vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$18;
                        if (objM4906b == coroutineSingletons) {
                            obj3 = objM4906b;
                            str14 = str13;
                            str15 = str12;
                            ref$ObjectRef6 = ref$ObjectRef5;
                            i9 = i8;
                            str16 = str11;
                            z9 = z8;
                            z10 = z6;
                            i10 = i7;
                            results = (Results) obj3;
                            list2 = results.f21739d;
                            if (list2 != null) {
                                c83 c83Var19 = ((C1371d) vmaVar).f18561A;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                objM15541t2 = AbstractC3224d.m15541t(c83Var19, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                if (objM15541t2 != coroutineSingletons) {
                                    ref$ObjectRef7 = ref$ObjectRef6;
                                    str17 = str16;
                                    str18 = str14;
                                    results2 = results;
                                    z11 = z10;
                                    i11 = i9;
                                    str19 = str15;
                                    z12 = z9;
                                    i12 = i10;
                                    i13 = 0;
                                    linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                    emptyList3 = emptyList2;
                                    list3 = list2;
                                    linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                    obj4 = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                    coroutineSingletons = coroutineSingletons;
                                    if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                        String str21111 = str19;
                                        i14 = i11;
                                        str20 = str21111;
                                        list4 = list3;
                                        i15 = i12;
                                        ref$ObjectRef8 = ref$ObjectRef7;
                                        results3 = results2;
                                        if (i15 == -1) {
                                            i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                        } else {
                                            i16 = i15;
                                        }
                                        int i1114 = (i14 - 1) * i16;
                                        ?? r1112 = obj4;
                                        String str21112 = str18;
                                        int i21111110 = i16;
                                        int i21111111 = i1114 + i21111110;
                                        List list11111 = list4;
                                        lingQDatabase = this.f16568a;
                                        int i21111112 = i15;
                                        emptyList = emptyList3;
                                        CoroutineSingletons coroutineSingletons17 = coroutineSingletons;
                                        int i21111113 = i13;
                                        boolean z1112 = z12;
                                        results4 = results3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str21112, list11111, z1112, this, str20, ref$ObjectRef8, i14, z11, str17, i21111110, i1114, i21111111, null);
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r1112;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r1112;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r1112;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r1112;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r1112;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r1112;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z1112;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i21111112;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i21111113;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                        coroutineSingletons = coroutineSingletons17;
                                        if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                            results5 = results4;
                                            results = results5;
                                        }
                                    }
                                }
                            } else {
                                emptyList = emptyList2;
                            }
                            list5 = results.f21739d;
                            if (list5 != null) {
                                size = list5.size();
                            } else {
                                size = 0;
                            }
                            Integer num111114 = new Integer(size);
                            Integer num111115 = new Integer(results.f21736a);
                            list6 = results.f21739d;
                            if (list6 != null) {
                                List list11112 = list6;
                                arrayList = new ArrayList(v91.m23189q0(list11112, 10));
                                it = list11112.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                }
                            } else {
                                arrayList = emptyList;
                            }
                            return new Triple(num111114, num111115, arrayList);
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    int i31 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i;
                    boolean z22 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l;
                    z5 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k;
                    i4 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h;
                    ref$ObjectRef3 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d;
                    str8 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c;
                    str7 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b;
                    String str32 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a;
                    AbstractC3193b.m15359b(obj5);
                    str5 = str32;
                    z4 = z22;
                    i3 = i31;
                    obj2 = obj5;
                    linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) obj2);
                    linkedHashMapM15372Y.put(str5, ref$ObjectRef3.f47718a);
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z4;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i3;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 3;
                    if (((C1371d) vmaVar2).m7974n(linkedHashMapM15372Y, vocabularyRepositoryImpl$syncVocabularyCards$1) != coroutineSingletons) {
                        i5 = i3;
                        z6 = z4;
                        str9 = str5;
                        str5 = str9;
                        Ref$IntRef ref$IntRef5 = new Ref$IntRef();
                        ref$IntRef5.f47716a = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19859a;
                        listM15421q0 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new qk9(12, ref$IntRef5, ref$ObjectRef3)));
                        co0 co0Var5 = this.f16572e;
                        Integer num26 = new Integer(i4);
                        if (i5 == -1) {
                            i6 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19862d;
                        } else {
                            i6 = i5;
                        }
                        Integer num27 = new Integer(i6);
                        String columnName5 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19861c.getColumnName();
                        String serverSortName5 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19863e.getServerSortName();
                        if (str8 == null) {
                            if (z5) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                        } else if (z5) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        Boolean boolValueOf5 = Boolean.valueOf(z7);
                        if (z6) {
                            bool = Boolean.TRUE;
                        } else {
                            bool = null;
                        }
                        if (str8 != null) {
                            str10 = null;
                        } else {
                            str10 = null;
                        }
                        Object obj10 = ref$ObjectRef3.f47718a;
                        List<String> list11113 = ((VocabularySearchQuery) obj10).f19865g;
                        num = (Integer) ((VocabularySearchQuery) obj10).f19867i.f47624b;
                        if (num != null) {
                            list = listM15421q0;
                        } else {
                            list = listM15421q0;
                            if (num.intValue() == -1) {
                                num2 = null;
                            }
                            num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                            if (num3 == null) {
                                num4 = num2;
                            } else {
                                num4 = num2;
                                if (num3.intValue() == -1) {
                                    num5 = null;
                                }
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                                vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                                z8 = z5;
                                str11 = str8;
                                vmaVar = vmaVar2;
                                i7 = i5;
                                VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$19 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                                i8 = i4;
                                str12 = str7;
                                emptyList2 = emptyList4;
                                ref$ObjectRef4 = null;
                                Integer num111116 = num5;
                                str13 = str5;
                                Boolean bool18 = bool;
                                ref$ObjectRef5 = ref$ObjectRef3;
                                objM4906b = co0Var5.m4906b(str13, num26, num27, str12, columnName5, serverSortName5, list, boolValueOf5, bool18, str10, list11113, num4, num111116, vocabularyRepositoryImpl$syncVocabularyCards$19);
                                vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$19;
                                if (objM4906b == coroutineSingletons) {
                                    obj3 = objM4906b;
                                    str14 = str13;
                                    str15 = str12;
                                    ref$ObjectRef6 = ref$ObjectRef5;
                                    i9 = i8;
                                    str16 = str11;
                                    z9 = z8;
                                    z10 = z6;
                                    i10 = i7;
                                    results = (Results) obj3;
                                    list2 = results.f21739d;
                                    if (list2 != null) {
                                        c83 c83Var110 = ((C1371d) vmaVar).f18561A;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                        objM15541t2 = AbstractC3224d.m15541t(c83Var110, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                        if (objM15541t2 != coroutineSingletons) {
                                            ref$ObjectRef7 = ref$ObjectRef6;
                                            str17 = str16;
                                            str18 = str14;
                                            results2 = results;
                                            z11 = z10;
                                            i11 = i9;
                                            str19 = str15;
                                            z12 = z9;
                                            i12 = i10;
                                            i13 = 0;
                                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                            emptyList3 = emptyList2;
                                            list3 = list2;
                                            linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                            obj4 = null;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                            coroutineSingletons = coroutineSingletons;
                                            if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                                String str21113 = str19;
                                                i14 = i11;
                                                str20 = str21113;
                                                list4 = list3;
                                                i15 = i12;
                                                ref$ObjectRef8 = ref$ObjectRef7;
                                                results3 = results2;
                                                if (i15 == -1) {
                                                    i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                                } else {
                                                    i16 = i15;
                                                }
                                                int i1115 = (i14 - 1) * i16;
                                                ?? r1113 = obj4;
                                                String str21114 = str18;
                                                int i21111114 = i16;
                                                int i21111115 = i1115 + i21111114;
                                                List list11114 = list4;
                                                lingQDatabase = this.f16568a;
                                                int i21111116 = i15;
                                                emptyList = emptyList3;
                                                CoroutineSingletons coroutineSingletons18 = coroutineSingletons;
                                                int i21111117 = i13;
                                                boolean z1113 = z12;
                                                results4 = results3;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str21114, list11114, z1113, this, str20, ref$ObjectRef8, i14, z11, str17, i21111114, i1115, i21111115, null);
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r1113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r1113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r1113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r1113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r1113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r1113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z1113;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i21111116;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i21111117;
                                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                                coroutineSingletons = coroutineSingletons18;
                                                if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                    results5 = results4;
                                                    results = results5;
                                                }
                                            }
                                        }
                                    } else {
                                        emptyList = emptyList2;
                                    }
                                    list5 = results.f21739d;
                                    if (list5 != null) {
                                        size = list5.size();
                                    } else {
                                        size = 0;
                                    }
                                    Integer num111117 = new Integer(size);
                                    Integer num111118 = new Integer(results.f21736a);
                                    list6 = results.f21739d;
                                    if (list6 != null) {
                                        List list11115 = list6;
                                        arrayList = new ArrayList(v91.m23189q0(list11115, 10));
                                        it = list11115.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                        }
                                    } else {
                                        arrayList = emptyList;
                                    }
                                    return new Triple(num111117, num111118, arrayList);
                                }
                            }
                            num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                            z8 = z5;
                            str11 = str8;
                            vmaVar = vmaVar2;
                            i7 = i5;
                            VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$110 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                            i8 = i4;
                            str12 = str7;
                            emptyList2 = emptyList4;
                            ref$ObjectRef4 = null;
                            Integer num111119 = num5;
                            str13 = str5;
                            Boolean bool19 = bool;
                            ref$ObjectRef5 = ref$ObjectRef3;
                            objM4906b = co0Var5.m4906b(str13, num26, num27, str12, columnName5, serverSortName5, list, boolValueOf5, bool19, str10, list11113, num4, num111119, vocabularyRepositoryImpl$syncVocabularyCards$110);
                            vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$110;
                            if (objM4906b == coroutineSingletons) {
                                obj3 = objM4906b;
                                str14 = str13;
                                str15 = str12;
                                ref$ObjectRef6 = ref$ObjectRef5;
                                i9 = i8;
                                str16 = str11;
                                z9 = z8;
                                z10 = z6;
                                i10 = i7;
                                results = (Results) obj3;
                                list2 = results.f21739d;
                                if (list2 != null) {
                                    c83 c83Var111 = ((C1371d) vmaVar).f18561A;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                    objM15541t2 = AbstractC3224d.m15541t(c83Var111, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                    if (objM15541t2 != coroutineSingletons) {
                                        ref$ObjectRef7 = ref$ObjectRef6;
                                        str17 = str16;
                                        str18 = str14;
                                        results2 = results;
                                        z11 = z10;
                                        i11 = i9;
                                        str19 = str15;
                                        z12 = z9;
                                        i12 = i10;
                                        i13 = 0;
                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                        emptyList3 = emptyList2;
                                        list3 = list2;
                                        linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                        obj4 = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                        coroutineSingletons = coroutineSingletons;
                                        if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                            String str21115 = str19;
                                            i14 = i11;
                                            str20 = str21115;
                                            list4 = list3;
                                            i15 = i12;
                                            ref$ObjectRef8 = ref$ObjectRef7;
                                            results3 = results2;
                                            if (i15 == -1) {
                                                i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                            } else {
                                                i16 = i15;
                                            }
                                            int i1116 = (i14 - 1) * i16;
                                            ?? r1114 = obj4;
                                            String str21116 = str18;
                                            int i21111118 = i16;
                                            int i21111119 = i1116 + i21111118;
                                            List list11116 = list4;
                                            lingQDatabase = this.f16568a;
                                            int i211111110 = i15;
                                            emptyList = emptyList3;
                                            CoroutineSingletons coroutineSingletons19 = coroutineSingletons;
                                            int i211111111 = i13;
                                            boolean z1114 = z12;
                                            results4 = results3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str21116, list11116, z1114, this, str20, ref$ObjectRef8, i14, z11, str17, i21111118, i1116, i21111119, null);
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r1114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r1114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r1114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r1114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r1114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r1114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z1114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i211111110;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i211111111;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                            coroutineSingletons = coroutineSingletons19;
                                            if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                results5 = results4;
                                                results = results5;
                                            }
                                        }
                                    }
                                } else {
                                    emptyList = emptyList2;
                                }
                                list5 = results.f21739d;
                                if (list5 != null) {
                                    size = list5.size();
                                } else {
                                    size = 0;
                                }
                                Integer num1111110 = new Integer(size);
                                Integer num1111111 = new Integer(results.f21736a);
                                list6 = results.f21739d;
                                if (list6 != null) {
                                    List list11117 = list6;
                                    arrayList = new ArrayList(v91.m23189q0(list11117, 10));
                                    it = list11117.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                    }
                                } else {
                                    arrayList = emptyList;
                                }
                                return new Triple(num1111110, num1111111, arrayList);
                            }
                        }
                        num2 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19867i.f47624b;
                        num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                        if (num3 == null) {
                            num4 = num2;
                        } else {
                            num4 = num2;
                            if (num3.intValue() == -1) {
                                num5 = null;
                            }
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                            z8 = z5;
                            str11 = str8;
                            vmaVar = vmaVar2;
                            i7 = i5;
                            VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$111 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                            i8 = i4;
                            str12 = str7;
                            emptyList2 = emptyList4;
                            ref$ObjectRef4 = null;
                            Integer num1111112 = num5;
                            str13 = str5;
                            Boolean bool110 = bool;
                            ref$ObjectRef5 = ref$ObjectRef3;
                            objM4906b = co0Var5.m4906b(str13, num26, num27, str12, columnName5, serverSortName5, list, boolValueOf5, bool110, str10, list11113, num4, num1111112, vocabularyRepositoryImpl$syncVocabularyCards$111);
                            vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$111;
                            if (objM4906b == coroutineSingletons) {
                                obj3 = objM4906b;
                                str14 = str13;
                                str15 = str12;
                                ref$ObjectRef6 = ref$ObjectRef5;
                                i9 = i8;
                                str16 = str11;
                                z9 = z8;
                                z10 = z6;
                                i10 = i7;
                                results = (Results) obj3;
                                list2 = results.f21739d;
                                if (list2 != null) {
                                    c83 c83Var112 = ((C1371d) vmaVar).f18561A;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                    objM15541t2 = AbstractC3224d.m15541t(c83Var112, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                    if (objM15541t2 != coroutineSingletons) {
                                        ref$ObjectRef7 = ref$ObjectRef6;
                                        str17 = str16;
                                        str18 = str14;
                                        results2 = results;
                                        z11 = z10;
                                        i11 = i9;
                                        str19 = str15;
                                        z12 = z9;
                                        i12 = i10;
                                        i13 = 0;
                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                        emptyList3 = emptyList2;
                                        list3 = list2;
                                        linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                        obj4 = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                        coroutineSingletons = coroutineSingletons;
                                        if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                            String str21117 = str19;
                                            i14 = i11;
                                            str20 = str21117;
                                            list4 = list3;
                                            i15 = i12;
                                            ref$ObjectRef8 = ref$ObjectRef7;
                                            results3 = results2;
                                            if (i15 == -1) {
                                                i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                            } else {
                                                i16 = i15;
                                            }
                                            int i1117 = (i14 - 1) * i16;
                                            ?? r1115 = obj4;
                                            String str21118 = str18;
                                            int i211111112 = i16;
                                            int i211111113 = i1117 + i211111112;
                                            List list11118 = list4;
                                            lingQDatabase = this.f16568a;
                                            int i211111114 = i15;
                                            emptyList = emptyList3;
                                            CoroutineSingletons coroutineSingletons110 = coroutineSingletons;
                                            int i211111115 = i13;
                                            boolean z1115 = z12;
                                            results4 = results3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str21118, list11118, z1115, this, str20, ref$ObjectRef8, i14, z11, str17, i211111112, i1117, i211111113, null);
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r1115;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r1115;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r1115;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r1115;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r1115;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r1115;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z1115;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i211111114;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i211111115;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                            coroutineSingletons = coroutineSingletons110;
                                            if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                results5 = results4;
                                                results = results5;
                                            }
                                        }
                                    }
                                } else {
                                    emptyList = emptyList2;
                                }
                                list5 = results.f21739d;
                                if (list5 != null) {
                                    size = list5.size();
                                } else {
                                    size = 0;
                                }
                                Integer num1111113 = new Integer(size);
                                Integer num1111114 = new Integer(results.f21736a);
                                list6 = results.f21739d;
                                if (list6 != null) {
                                    List list11119 = list6;
                                    arrayList = new ArrayList(v91.m23189q0(list11119, 10));
                                    it = list11119.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                    }
                                } else {
                                    arrayList = emptyList;
                                }
                                return new Triple(num1111113, num1111114, arrayList);
                            }
                        }
                        num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                        z8 = z5;
                        str11 = str8;
                        vmaVar = vmaVar2;
                        i7 = i5;
                        VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$112 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                        i8 = i4;
                        str12 = str7;
                        emptyList2 = emptyList4;
                        ref$ObjectRef4 = null;
                        Integer num1111115 = num5;
                        str13 = str5;
                        Boolean bool111 = bool;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        objM4906b = co0Var5.m4906b(str13, num26, num27, str12, columnName5, serverSortName5, list, boolValueOf5, bool111, str10, list11113, num4, num1111115, vocabularyRepositoryImpl$syncVocabularyCards$112);
                        vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$112;
                        if (objM4906b == coroutineSingletons) {
                            obj3 = objM4906b;
                            str14 = str13;
                            str15 = str12;
                            ref$ObjectRef6 = ref$ObjectRef5;
                            i9 = i8;
                            str16 = str11;
                            z9 = z8;
                            z10 = z6;
                            i10 = i7;
                            results = (Results) obj3;
                            list2 = results.f21739d;
                            if (list2 != null) {
                                c83 c83Var113 = ((C1371d) vmaVar).f18561A;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                objM15541t2 = AbstractC3224d.m15541t(c83Var113, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                if (objM15541t2 != coroutineSingletons) {
                                    ref$ObjectRef7 = ref$ObjectRef6;
                                    str17 = str16;
                                    str18 = str14;
                                    results2 = results;
                                    z11 = z10;
                                    i11 = i9;
                                    str19 = str15;
                                    z12 = z9;
                                    i12 = i10;
                                    i13 = 0;
                                    linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                    emptyList3 = emptyList2;
                                    list3 = list2;
                                    linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                    obj4 = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                    coroutineSingletons = coroutineSingletons;
                                    if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                        String str21119 = str19;
                                        i14 = i11;
                                        str20 = str21119;
                                        list4 = list3;
                                        i15 = i12;
                                        ref$ObjectRef8 = ref$ObjectRef7;
                                        results3 = results2;
                                        if (i15 == -1) {
                                            i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                        } else {
                                            i16 = i15;
                                        }
                                        int i1118 = (i14 - 1) * i16;
                                        ?? r1116 = obj4;
                                        String str211110 = str18;
                                        int i211111116 = i16;
                                        int i211111117 = i1118 + i211111116;
                                        List list111110 = list4;
                                        lingQDatabase = this.f16568a;
                                        int i211111118 = i15;
                                        emptyList = emptyList3;
                                        CoroutineSingletons coroutineSingletons111 = coroutineSingletons;
                                        int i211111119 = i13;
                                        boolean z1116 = z12;
                                        results4 = results3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str211110, list111110, z1116, this, str20, ref$ObjectRef8, i14, z11, str17, i211111116, i1118, i211111117, null);
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r1116;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r1116;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r1116;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r1116;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r1116;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r1116;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z1116;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i211111118;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i211111119;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                        coroutineSingletons = coroutineSingletons111;
                                        if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                            results5 = results4;
                                            results = results5;
                                        }
                                    }
                                }
                            } else {
                                emptyList = emptyList2;
                            }
                            list5 = results.f21739d;
                            if (list5 != null) {
                                size = list5.size();
                            } else {
                                size = 0;
                            }
                            Integer num1111116 = new Integer(size);
                            Integer num1111117 = new Integer(results.f21736a);
                            list6 = results.f21739d;
                            if (list6 != null) {
                                List list111111 = list6;
                                arrayList = new ArrayList(v91.m23189q0(list111111, 10));
                                it = list111111.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                }
                            } else {
                                arrayList = emptyList;
                            }
                            return new Triple(num1111116, num1111117, arrayList);
                        }
                    }
                    return coroutineSingletons;
                case 3:
                    i5 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i;
                    z6 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l;
                    z5 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k;
                    i4 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h;
                    ref$ObjectRef3 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d;
                    str8 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c;
                    str7 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b;
                    str9 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a;
                    AbstractC3193b.m15359b(obj5);
                    str5 = str9;
                    Ref$IntRef ref$IntRef6 = new Ref$IntRef();
                    ref$IntRef6.f47716a = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19859a;
                    listM15421q0 = AbstractC3204c.m15421q0(AbstractC3204c.m15417m0(new qk9(12, ref$IntRef6, ref$ObjectRef3)));
                    co0 co0Var6 = this.f16572e;
                    Integer num28 = new Integer(i4);
                    if (i5 == -1) {
                        i6 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19862d;
                    } else {
                        i6 = i5;
                    }
                    Integer num29 = new Integer(i6);
                    String columnName6 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19861c.getColumnName();
                    String serverSortName6 = ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19863e.getServerSortName();
                    if (str8 == null) {
                        if (z5) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } else if (z5) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    Boolean boolValueOf6 = Boolean.valueOf(z7);
                    if (z6) {
                        bool = Boolean.TRUE;
                    } else {
                        bool = null;
                    }
                    if (str8 != null) {
                        str10 = null;
                    } else {
                        str10 = null;
                    }
                    Object obj11 = ref$ObjectRef3.f47718a;
                    List<String> list111112 = ((VocabularySearchQuery) obj11).f19865g;
                    num = (Integer) ((VocabularySearchQuery) obj11).f19867i.f47624b;
                    if (num != null) {
                        list = listM15421q0;
                        if (num.intValue() == -1) {
                            num2 = null;
                        }
                        num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                        if (num3 == null) {
                            num4 = num2;
                            if (num3.intValue() == -1) {
                                num5 = null;
                            }
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                            vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                            z8 = z5;
                            str11 = str8;
                            vmaVar = vmaVar2;
                            i7 = i5;
                            VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$113 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                            i8 = i4;
                            str12 = str7;
                            emptyList2 = emptyList4;
                            ref$ObjectRef4 = null;
                            Integer num1111118 = num5;
                            str13 = str5;
                            Boolean bool112 = bool;
                            ref$ObjectRef5 = ref$ObjectRef3;
                            objM4906b = co0Var6.m4906b(str13, num28, num29, str12, columnName6, serverSortName6, list, boolValueOf6, bool112, str10, list111112, num4, num1111118, vocabularyRepositoryImpl$syncVocabularyCards$113);
                            vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$113;
                            if (objM4906b == coroutineSingletons) {
                                obj3 = objM4906b;
                                str14 = str13;
                                str15 = str12;
                                ref$ObjectRef6 = ref$ObjectRef5;
                                i9 = i8;
                                str16 = str11;
                                z9 = z8;
                                z10 = z6;
                                i10 = i7;
                                results = (Results) obj3;
                                list2 = results.f21739d;
                                if (list2 != null) {
                                    c83 c83Var114 = ((C1371d) vmaVar).f18561A;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                    objM15541t2 = AbstractC3224d.m15541t(c83Var114, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                    if (objM15541t2 != coroutineSingletons) {
                                        ref$ObjectRef7 = ref$ObjectRef6;
                                        str17 = str16;
                                        str18 = str14;
                                        results2 = results;
                                        z11 = z10;
                                        i11 = i9;
                                        str19 = str15;
                                        z12 = z9;
                                        i12 = i10;
                                        i13 = 0;
                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                        emptyList3 = emptyList2;
                                        list3 = list2;
                                        linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                        obj4 = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                        coroutineSingletons = coroutineSingletons;
                                        if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                            String str211111 = str19;
                                            i14 = i11;
                                            str20 = str211111;
                                            list4 = list3;
                                            i15 = i12;
                                            ref$ObjectRef8 = ref$ObjectRef7;
                                            results3 = results2;
                                            if (i15 == -1) {
                                                i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                            } else {
                                                i16 = i15;
                                            }
                                            int i1119 = (i14 - 1) * i16;
                                            ?? r1117 = obj4;
                                            String str211112 = str18;
                                            int i2111111110 = i16;
                                            int i2111111111 = i1119 + i2111111110;
                                            List list111113 = list4;
                                            lingQDatabase = this.f16568a;
                                            int i2111111112 = i15;
                                            emptyList = emptyList3;
                                            CoroutineSingletons coroutineSingletons112 = coroutineSingletons;
                                            int i2111111113 = i13;
                                            boolean z1117 = z12;
                                            results4 = results3;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str211112, list111113, z1117, this, str20, ref$ObjectRef8, i14, z11, str17, i2111111110, i1119, i2111111111, null);
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r1117;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r1117;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r1117;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r1117;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r1117;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r1117;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z1117;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i2111111112;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i2111111113;
                                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                            coroutineSingletons = coroutineSingletons112;
                                            if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                                results5 = results4;
                                                results = results5;
                                            }
                                        }
                                    }
                                } else {
                                    emptyList = emptyList2;
                                }
                                list5 = results.f21739d;
                                if (list5 != null) {
                                    size = list5.size();
                                } else {
                                    size = 0;
                                }
                                Integer num1111119 = new Integer(size);
                                Integer num11111110 = new Integer(results.f21736a);
                                list6 = results.f21739d;
                                if (list6 != null) {
                                    List list111114 = list6;
                                    arrayList = new ArrayList(v91.m23189q0(list111114, 10));
                                    it = list111114.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                    }
                                } else {
                                    arrayList = emptyList;
                                }
                                return new Triple(num1111119, num11111110, arrayList);
                            }
                            return coroutineSingletons;
                        }
                        num4 = num2;
                        num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                        z8 = z5;
                        str11 = str8;
                        vmaVar = vmaVar2;
                        i7 = i5;
                        VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$114 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                        i8 = i4;
                        str12 = str7;
                        emptyList2 = emptyList4;
                        ref$ObjectRef4 = null;
                        Integer num11111111 = num5;
                        str13 = str5;
                        Boolean bool113 = bool;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        objM4906b = co0Var6.m4906b(str13, num28, num29, str12, columnName6, serverSortName6, list, boolValueOf6, bool113, str10, list111112, num4, num11111111, vocabularyRepositoryImpl$syncVocabularyCards$114);
                        vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$114;
                        if (objM4906b == coroutineSingletons) {
                            obj3 = objM4906b;
                            str14 = str13;
                            str15 = str12;
                            ref$ObjectRef6 = ref$ObjectRef5;
                            i9 = i8;
                            str16 = str11;
                            z9 = z8;
                            z10 = z6;
                            i10 = i7;
                            results = (Results) obj3;
                            list2 = results.f21739d;
                            if (list2 != null) {
                                c83 c83Var115 = ((C1371d) vmaVar).f18561A;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                objM15541t2 = AbstractC3224d.m15541t(c83Var115, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                if (objM15541t2 != coroutineSingletons) {
                                    ref$ObjectRef7 = ref$ObjectRef6;
                                    str17 = str16;
                                    str18 = str14;
                                    results2 = results;
                                    z11 = z10;
                                    i11 = i9;
                                    str19 = str15;
                                    z12 = z9;
                                    i12 = i10;
                                    i13 = 0;
                                    linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                    emptyList3 = emptyList2;
                                    list3 = list2;
                                    linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                    obj4 = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                    coroutineSingletons = coroutineSingletons;
                                    if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                        String str211113 = str19;
                                        i14 = i11;
                                        str20 = str211113;
                                        list4 = list3;
                                        i15 = i12;
                                        ref$ObjectRef8 = ref$ObjectRef7;
                                        results3 = results2;
                                        if (i15 == -1) {
                                            i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                        } else {
                                            i16 = i15;
                                        }
                                        int i11110 = (i14 - 1) * i16;
                                        ?? r1118 = obj4;
                                        String str211114 = str18;
                                        int i2111111114 = i16;
                                        int i2111111115 = i11110 + i2111111114;
                                        List list111115 = list4;
                                        lingQDatabase = this.f16568a;
                                        int i2111111116 = i15;
                                        emptyList = emptyList3;
                                        CoroutineSingletons coroutineSingletons113 = coroutineSingletons;
                                        int i2111111117 = i13;
                                        boolean z1118 = z12;
                                        results4 = results3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str211114, list111115, z1118, this, str20, ref$ObjectRef8, i14, z11, str17, i2111111114, i11110, i2111111115, null);
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r1118;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r1118;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r1118;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r1118;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r1118;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r1118;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z1118;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i2111111116;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i2111111117;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                        coroutineSingletons = coroutineSingletons113;
                                        if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                            results5 = results4;
                                            results = results5;
                                        }
                                    }
                                }
                            } else {
                                emptyList = emptyList2;
                            }
                            list5 = results.f21739d;
                            if (list5 != null) {
                                size = list5.size();
                            } else {
                                size = 0;
                            }
                            Integer num11111112 = new Integer(size);
                            Integer num11111113 = new Integer(results.f21736a);
                            list6 = results.f21739d;
                            if (list6 != null) {
                                List list111116 = list6;
                                arrayList = new ArrayList(v91.m23189q0(list111116, 10));
                                it = list111116.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                }
                            } else {
                                arrayList = emptyList;
                            }
                            return new Triple(num11111112, num11111113, arrayList);
                        }
                        return coroutineSingletons;
                    }
                    list = listM15421q0;
                    num2 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19867i.f47624b;
                    num3 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                    if (num3 == null) {
                        num4 = num2;
                        if (num3.intValue() == -1) {
                            num5 = null;
                        }
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                        vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                        z8 = z5;
                        str11 = str8;
                        vmaVar = vmaVar2;
                        i7 = i5;
                        VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$115 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                        i8 = i4;
                        str12 = str7;
                        emptyList2 = emptyList4;
                        ref$ObjectRef4 = null;
                        Integer num11111114 = num5;
                        str13 = str5;
                        Boolean bool114 = bool;
                        ref$ObjectRef5 = ref$ObjectRef3;
                        objM4906b = co0Var6.m4906b(str13, num28, num29, str12, columnName6, serverSortName6, list, boolValueOf6, bool114, str10, list111112, num4, num11111114, vocabularyRepositoryImpl$syncVocabularyCards$115);
                        vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$115;
                        if (objM4906b == coroutineSingletons) {
                            obj3 = objM4906b;
                            str14 = str13;
                            str15 = str12;
                            ref$ObjectRef6 = ref$ObjectRef5;
                            i9 = i8;
                            str16 = str11;
                            z9 = z8;
                            z10 = z6;
                            i10 = i7;
                            results = (Results) obj3;
                            list2 = results.f21739d;
                            if (list2 != null) {
                                c83 c83Var116 = ((C1371d) vmaVar).f18561A;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                                objM15541t2 = AbstractC3224d.m15541t(c83Var116, vocabularyRepositoryImpl$syncVocabularyCards$2);
                                if (objM15541t2 != coroutineSingletons) {
                                    ref$ObjectRef7 = ref$ObjectRef6;
                                    str17 = str16;
                                    str18 = str14;
                                    results2 = results;
                                    z11 = z10;
                                    i11 = i9;
                                    str19 = str15;
                                    z12 = z9;
                                    i12 = i10;
                                    i13 = 0;
                                    linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                    emptyList3 = emptyList2;
                                    list3 = list2;
                                    linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                    obj4 = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                    coroutineSingletons = coroutineSingletons;
                                    if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                        String str211115 = str19;
                                        i14 = i11;
                                        str20 = str211115;
                                        list4 = list3;
                                        i15 = i12;
                                        ref$ObjectRef8 = ref$ObjectRef7;
                                        results3 = results2;
                                        if (i15 == -1) {
                                            i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                        } else {
                                            i16 = i15;
                                        }
                                        int i11111 = (i14 - 1) * i16;
                                        ?? r1119 = obj4;
                                        String str211116 = str18;
                                        int i2111111118 = i16;
                                        int i2111111119 = i11111 + i2111111118;
                                        List list111117 = list4;
                                        lingQDatabase = this.f16568a;
                                        int i21111111110 = i15;
                                        emptyList = emptyList3;
                                        CoroutineSingletons coroutineSingletons114 = coroutineSingletons;
                                        int i21111111111 = i13;
                                        boolean z1119 = z12;
                                        results4 = results3;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str211116, list111117, z1119, this, str20, ref$ObjectRef8, i14, z11, str17, i2111111118, i11111, i2111111119, null);
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r1119;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r1119;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r1119;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r1119;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r1119;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r1119;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z1119;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i21111111110;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i21111111111;
                                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                        coroutineSingletons = coroutineSingletons114;
                                        if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                            results5 = results4;
                                            results = results5;
                                        }
                                    }
                                }
                            } else {
                                emptyList = emptyList2;
                            }
                            list5 = results.f21739d;
                            if (list5 != null) {
                                size = list5.size();
                            } else {
                                size = 0;
                            }
                            Integer num11111115 = new Integer(size);
                            Integer num11111116 = new Integer(results.f21736a);
                            list6 = results.f21739d;
                            if (list6 != null) {
                                List list111118 = list6;
                                arrayList = new ArrayList(v91.m23189q0(list111118, 10));
                                it = list111118.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                }
                            } else {
                                arrayList = emptyList;
                            }
                            return new Triple(num11111115, num11111116, arrayList);
                        }
                        return coroutineSingletons;
                    }
                    num4 = num2;
                    num5 = (Integer) ((VocabularySearchQuery) ref$ObjectRef3.f47718a).f19868j.f47624b;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a = str5;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b = str7;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c = str8;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d = ref$ObjectRef3;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16387e = null;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h = i4;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k = z5;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l = z6;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i = i5;
                    vocabularyRepositoryImpl$syncVocabularyCards$1.f16382J = 4;
                    z8 = z5;
                    str11 = str8;
                    vmaVar = vmaVar2;
                    i7 = i5;
                    VocabularyRepositoryImpl$syncVocabularyCards$1 vocabularyRepositoryImpl$syncVocabularyCards$116 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                    i8 = i4;
                    str12 = str7;
                    emptyList2 = emptyList4;
                    ref$ObjectRef4 = null;
                    Integer num11111117 = num5;
                    str13 = str5;
                    Boolean bool115 = bool;
                    ref$ObjectRef5 = ref$ObjectRef3;
                    objM4906b = co0Var6.m4906b(str13, num28, num29, str12, columnName6, serverSortName6, list, boolValueOf6, bool115, str10, list111112, num4, num11111117, vocabularyRepositoryImpl$syncVocabularyCards$116);
                    vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$116;
                    if (objM4906b == coroutineSingletons) {
                        obj3 = objM4906b;
                        str14 = str13;
                        str15 = str12;
                        ref$ObjectRef6 = ref$ObjectRef5;
                        i9 = i8;
                        str16 = str11;
                        z9 = z8;
                        z10 = z6;
                        i10 = i7;
                        results = (Results) obj3;
                        list2 = results.f21739d;
                        if (list2 != null) {
                            c83 c83Var117 = ((C1371d) vmaVar).f18561A;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                            objM15541t2 = AbstractC3224d.m15541t(c83Var117, vocabularyRepositoryImpl$syncVocabularyCards$2);
                            if (objM15541t2 != coroutineSingletons) {
                                ref$ObjectRef7 = ref$ObjectRef6;
                                str17 = str16;
                                str18 = str14;
                                results2 = results;
                                z11 = z10;
                                i11 = i9;
                                str19 = str15;
                                z12 = z9;
                                i12 = i10;
                                i13 = 0;
                                linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                emptyList3 = emptyList2;
                                list3 = list2;
                                linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                                obj4 = null;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                                coroutineSingletons = coroutineSingletons;
                                if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                    String str211117 = str19;
                                    i14 = i11;
                                    str20 = str211117;
                                    list4 = list3;
                                    i15 = i12;
                                    ref$ObjectRef8 = ref$ObjectRef7;
                                    results3 = results2;
                                    if (i15 == -1) {
                                        i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                    } else {
                                        i16 = i15;
                                    }
                                    int i11112 = (i14 - 1) * i16;
                                    ?? r11110 = obj4;
                                    String str211118 = str18;
                                    int i21111111112 = i16;
                                    int i21111111113 = i11112 + i21111111112;
                                    List list111119 = list4;
                                    lingQDatabase = this.f16568a;
                                    int i21111111114 = i15;
                                    emptyList = emptyList3;
                                    CoroutineSingletons coroutineSingletons115 = coroutineSingletons;
                                    int i21111111115 = i13;
                                    boolean z11110 = z12;
                                    results4 = results3;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str211118, list111119, z11110, this, str20, ref$ObjectRef8, i14, z11, str17, i21111111112, i11112, i21111111113, null);
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r11110;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r11110;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r11110;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r11110;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r11110;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r11110;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z11110;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i21111111114;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i21111111115;
                                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                    coroutineSingletons = coroutineSingletons115;
                                    if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                        results5 = results4;
                                        results = results5;
                                    }
                                }
                            }
                        } else {
                            emptyList = emptyList2;
                        }
                        list5 = results.f21739d;
                        if (list5 != null) {
                            size = list5.size();
                        } else {
                            size = 0;
                        }
                        Integer num11111118 = new Integer(size);
                        Integer num11111119 = new Integer(results.f21736a);
                        list6 = results.f21739d;
                        if (list6 != null) {
                            List list1111110 = list6;
                            arrayList = new ArrayList(v91.m23189q0(list1111110, 10));
                            it = list1111110.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                            }
                        } else {
                            arrayList = emptyList;
                        }
                        return new Triple(num11111118, num11111119, arrayList);
                    }
                    return coroutineSingletons;
                case 4:
                    obj3 = obj5;
                    int i32 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i;
                    boolean z23 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l;
                    z9 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k;
                    i9 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h;
                    ref$ObjectRef6 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d;
                    str16 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c;
                    str15 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b;
                    str14 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a;
                    AbstractC3193b.m15359b(obj3);
                    vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                    emptyList2 = emptyList4;
                    vmaVar = vmaVar2;
                    z10 = z23;
                    i10 = i32;
                    ref$ObjectRef4 = null;
                    results = (Results) obj3;
                    list2 = results.f21739d;
                    if (list2 != null) {
                        c83 c83Var118 = ((C1371d) vmaVar).f18561A;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str14;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str15;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str16;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef6;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = ref$ObjectRef4;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list2;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i9;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z9;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z10;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i10;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = 0;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 5;
                        objM15541t2 = AbstractC3224d.m15541t(c83Var118, vocabularyRepositoryImpl$syncVocabularyCards$2);
                        if (objM15541t2 != coroutineSingletons) {
                            ref$ObjectRef7 = ref$ObjectRef6;
                            str17 = str16;
                            str18 = str14;
                            results2 = results;
                            z11 = z10;
                            i11 = i9;
                            str19 = str15;
                            z12 = z9;
                            i12 = i10;
                            i13 = 0;
                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                            emptyList3 = emptyList2;
                            list3 = list2;
                            linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                            obj4 = null;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                            vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                            coroutineSingletons = coroutineSingletons;
                            if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                                String str211119 = str19;
                                i14 = i11;
                                str20 = str211119;
                                list4 = list3;
                                i15 = i12;
                                ref$ObjectRef8 = ref$ObjectRef7;
                                results3 = results2;
                                if (i15 == -1) {
                                    i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                                } else {
                                    i16 = i15;
                                }
                                int i11113 = (i14 - 1) * i16;
                                ?? r11111 = obj4;
                                String str2111110 = str18;
                                int i21111111116 = i16;
                                int i21111111117 = i11113 + i21111111116;
                                List list1111111 = list4;
                                lingQDatabase = this.f16568a;
                                int i21111111118 = i15;
                                emptyList = emptyList3;
                                CoroutineSingletons coroutineSingletons116 = coroutineSingletons;
                                int i21111111119 = i13;
                                boolean z11111 = z12;
                                results4 = results3;
                                vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str2111110, list1111111, z11111, this, str20, ref$ObjectRef8, i14, z11, str17, i21111111116, i11113, i21111111117, null);
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r11111;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r11111;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r11111;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r11111;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r11111;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r11111;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z11111;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i21111111118;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i21111111119;
                                vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                                coroutineSingletons = coroutineSingletons116;
                                if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                                    results5 = results4;
                                    results = results5;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    emptyList = emptyList2;
                    list5 = results.f21739d;
                    if (list5 != null) {
                        size = list5.size();
                    } else {
                        size = 0;
                    }
                    Integer num111111110 = new Integer(size);
                    Integer num111111111 = new Integer(results.f21736a);
                    list6 = results.f21739d;
                    if (list6 != null) {
                        List list1111112 = list6;
                        arrayList = new ArrayList(v91.m23189q0(list1111112, 10));
                        it = list1111112.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                        }
                    } else {
                        arrayList = emptyList;
                    }
                    return new Triple(num111111110, num111111111, arrayList);
                case 5:
                    i13 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16392j;
                    i12 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i;
                    boolean z24 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l;
                    boolean z25 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k;
                    int i33 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h;
                    List list20 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16389g;
                    results2 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16388f;
                    Ref$ObjectRef ref$ObjectRef11 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d;
                    String str33 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c;
                    String str34 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b;
                    String str35 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a;
                    AbstractC3193b.m15359b(obj5);
                    vmaVar = vmaVar2;
                    z11 = z24;
                    str19 = str34;
                    ref$ObjectRef7 = ref$ObjectRef11;
                    list2 = list20;
                    z12 = z25;
                    str17 = str33;
                    vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                    emptyList2 = emptyList4;
                    i11 = i33;
                    str18 = str35;
                    objM15541t2 = obj5;
                    linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                    emptyList3 = emptyList2;
                    list3 = list2;
                    linkedHashMapM15372Y2.put(str18, new Integer((int) Math.ceil(((double) results2.f21736a) / ((double) ((VocabularySearchQuery) ref$ObjectRef7.f47718a).f19862d))));
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = str18;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = str19;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = str17;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = ref$ObjectRef7;
                    obj4 = null;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = null;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results2;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = list3;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i11;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z12;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i12;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i13;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 6;
                    coroutineSingletons = coroutineSingletons;
                    if (((C1371d) vmaVar).m7973m(linkedHashMapM15372Y2, vocabularyRepositoryImpl$syncVocabularyCards$2) == coroutineSingletons) {
                        String str2111111 = str19;
                        i14 = i11;
                        str20 = str2111111;
                        list4 = list3;
                        i15 = i12;
                        ref$ObjectRef8 = ref$ObjectRef7;
                        results3 = results2;
                        if (i15 == -1) {
                            i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                        } else {
                            i16 = i15;
                        }
                        int i11114 = (i14 - 1) * i16;
                        ?? r11112 = obj4;
                        String str2111112 = str18;
                        int i211111111110 = i16;
                        int i211111111111 = i11114 + i211111111110;
                        List list1111113 = list4;
                        lingQDatabase = this.f16568a;
                        int i211111111112 = i15;
                        emptyList = emptyList3;
                        CoroutineSingletons coroutineSingletons117 = coroutineSingletons;
                        int i211111111113 = i13;
                        boolean z11112 = z12;
                        results4 = results3;
                        vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str2111112, list1111113, z11112, this, str20, ref$ObjectRef8, i14, z11, str17, i211111111110, i11114, i211111111111, null);
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r11112;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r11112;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r11112;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r11112;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r11112;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r11112;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z11112;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i211111111112;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i211111111113;
                        vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                        coroutineSingletons = coroutineSingletons117;
                        if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                            results5 = results4;
                            results = results5;
                            list5 = results.f21739d;
                            if (list5 != null) {
                                size = list5.size();
                            } else {
                                size = 0;
                            }
                            Integer num111111112 = new Integer(size);
                            Integer num111111113 = new Integer(results.f21736a);
                            list6 = results.f21739d;
                            if (list6 != null) {
                                List list1111114 = list6;
                                arrayList = new ArrayList(v91.m23189q0(list1111114, 10));
                                it = list1111114.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                                }
                            } else {
                                arrayList = emptyList;
                            }
                            return new Triple(num111111112, num111111113, arrayList);
                        }
                    }
                    return coroutineSingletons;
                case 6:
                    i13 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16392j;
                    int i34 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16391i;
                    z11 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16394l;
                    z12 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16393k;
                    int i35 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16390h;
                    list4 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16389g;
                    Results results6 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16388f;
                    Ref$ObjectRef ref$ObjectRef12 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16386d;
                    str17 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16385c;
                    String str36 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16384b;
                    str18 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16383a;
                    AbstractC3193b.m15359b(obj5);
                    emptyList3 = emptyList4;
                    i15 = i34;
                    str20 = str36;
                    i14 = i35;
                    ref$ObjectRef8 = ref$ObjectRef12;
                    results3 = results6;
                    vocabularyRepositoryImpl$syncVocabularyCards$2 = vocabularyRepositoryImpl$syncVocabularyCards$1;
                    obj4 = null;
                    if (i15 == -1) {
                        i16 = ((VocabularySearchQuery) ref$ObjectRef8.f47718a).f19862d;
                    } else {
                        i16 = i15;
                    }
                    int i11115 = (i14 - 1) * i16;
                    ?? r11113 = obj4;
                    String str2111113 = str18;
                    int i211111111114 = i16;
                    int i211111111115 = i11115 + i211111111114;
                    List list1111115 = list4;
                    lingQDatabase = this.f16568a;
                    int i211111111116 = i15;
                    emptyList = emptyList3;
                    CoroutineSingletons coroutineSingletons118 = coroutineSingletons;
                    int i211111111117 = i13;
                    boolean z11113 = z12;
                    results4 = results3;
                    vocabularyRepositoryImpl$syncVocabularyCards$2$1$1 = new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(str2111113, list1111115, z11113, this, str20, ref$ObjectRef8, i14, z11, str17, i211111111114, i11115, i211111111115, null);
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16383a = r11113;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16384b = r11113;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16385c = r11113;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16386d = r11113;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16387e = r11113;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16388f = results4;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16389g = r11113;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16390h = i14;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16393k = z11113;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16394l = z11;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16391i = i211111111116;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16392j = i211111111117;
                    vocabularyRepositoryImpl$syncVocabularyCards$2.f16382J = 7;
                    coroutineSingletons = coroutineSingletons118;
                    if (AbstractC0747e.m2849b(lingQDatabase, vocabularyRepositoryImpl$syncVocabularyCards$2$1$1, vocabularyRepositoryImpl$syncVocabularyCards$2) != coroutineSingletons) {
                        results5 = results4;
                        results = results5;
                        list5 = results.f21739d;
                        if (list5 != null) {
                            size = list5.size();
                        } else {
                            size = 0;
                        }
                        Integer num111111114 = new Integer(size);
                        Integer num111111115 = new Integer(results.f21736a);
                        list6 = results.f21739d;
                        if (list6 != null) {
                            List list1111116 = list6;
                            arrayList = new ArrayList(v91.m23189q0(list1111116, 10));
                            it = list1111116.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                            }
                        } else {
                            arrayList = emptyList;
                        }
                        return new Triple(num111111114, num111111115, arrayList);
                    }
                    return coroutineSingletons;
                case 7:
                    List list21 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16389g;
                    results5 = vocabularyRepositoryImpl$syncVocabularyCards$1.f16388f;
                    AbstractC3193b.m15359b(obj5);
                    emptyList = emptyList4;
                    results = results5;
                    list5 = results.f21739d;
                    if (list5 != null) {
                        size = list5.size();
                    } else {
                        size = 0;
                    }
                    Integer num111111116 = new Integer(size);
                    Integer num111111117 = new Integer(results.f21736a);
                    list6 = results.f21739d;
                    if (list6 != null) {
                        List list1111117 = list6;
                        arrayList = new ArrayList(v91.m23189q0(list1111117, 10));
                        it = list1111117.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ResultVocabularyCard) it.next()).m8398c());
                        }
                    } else {
                        arrayList = emptyList;
                    }
                    return new Triple(num111111116, num111111117, arrayList);
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception unused5) {
            emptyList = emptyList4;
        }
    }
}
