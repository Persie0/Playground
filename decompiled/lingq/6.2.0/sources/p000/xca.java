package p000;

import android.webkit.WebView;
import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.lingq.core.domain.model.vocabulary.VocabularySearch;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.domain.model.vocabulary.VocabularySort;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xca implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68069a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f68070b;

    public /* synthetic */ xca(String str, int i) {
        this.f68069a = i;
        this.f68070b = str;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01d5  */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        p8b p8bVar;
        WorkInfo$State workInfo$StateM3626h;
        int i = this.f68069a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f68070b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("\n        SELECT DISTINCT COUNT(*) FROM TtsVoiceEntity\n        INNER JOIN LanguageAndTtsVoicesJoin ON code = ?\n        WHERE TtsVoiceEntity.name = LanguageAndTtsVoicesJoin.name");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    int i2 = ik8VarMo2873e0.mo2876a0() ? (int) ik8VarMo2873e0.getLong(0) : 0;
                    ik8VarMo2873e0.close();
                    return Integer.valueOf(i2);
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("DELETE FROM CardsAndLOTDJoin WHERE lotd = ?");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT Count(*) FROM CardEntity WHERE termWithLanguage LIKE ? || '\\_%' ESCAPE '\\'");
                try {
                    ik8VarMo2873e2.mo2874C(1, str);
                    int i3 = ik8VarMo2873e2.mo2876a0() ? (int) ik8VarMo2873e2.getLong(0) : 0;
                    ik8VarMo2873e2.close();
                    return Integer.valueOf(i3);
                } catch (Throwable th2) {
                    ik8VarMo2873e2.close();
                    throw th2;
                }
            case 3:
                VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) obj;
                vocabularySearchQuery.getClass();
                m1b m1bVar = VocabularySort.Companion;
                VocabularySort[] vocabularySortArr = (VocabularySort[]) VocabularySort.class.getEnumConstants();
                if (vocabularySortArr == null) {
                    vocabularySort = VocabularySort.AtoZ;
                    if (vocabularySort == null) {
                        C3386nv.m17635v("null cannot be cast to non-null type com.lingq.core.domain.model.vocabulary.VocabularySort");
                        return null;
                    }
                    vocabularySearchQuery.f19863e = vocabularySort;
                    return xfaVar;
                }
                for (VocabularySort vocabularySort : vocabularySortArr) {
                    if (fa4.m11650l(vocabularySort.getRoomColumnName(), str)) {
                        vocabularySearchQuery.f19863e = vocabularySort;
                        return xfaVar;
                    }
                }
                uk9.m22775i("Array contains no element matching the predicate.");
                return null;
            case 4:
                VocabularySearchQuery vocabularySearchQuery2 = (VocabularySearchQuery) obj;
                vocabularySearchQuery2.getClass();
                f1b f1bVar = VocabularySearch.Companion;
                VocabularySearch[] vocabularySearchArr = (VocabularySearch[]) VocabularySearch.class.getEnumConstants();
                if (vocabularySearchArr == null) {
                    vocabularySearch = VocabularySearch.Contains;
                    if (vocabularySearch == null) {
                        C3386nv.m17635v("null cannot be cast to non-null type com.lingq.core.domain.model.vocabulary.VocabularySearch");
                        return null;
                    }
                    vocabularySearchQuery2.f19861c = vocabularySearch;
                    return xfaVar;
                }
                for (VocabularySearch vocabularySearch : vocabularySearchArr) {
                    if (fa4.m11650l(vocabularySearch.getColumnName(), str)) {
                        vocabularySearchQuery2.f19861c = vocabularySearch;
                        return xfaVar;
                    }
                }
                uk9.m22775i("Array contains no element matching the predicate.");
                return null;
            case 5:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("SELECT Count(*) FROM WordEntity WHERE termWithLanguage = ?");
                try {
                    ik8VarMo2873e3.mo2874C(1, str);
                    int i4 = ik8VarMo2873e3.mo2876a0() ? (int) ik8VarMo2873e3.getLong(0) : 0;
                    ik8VarMo2873e3.close();
                    return Integer.valueOf(i4);
                } catch (Throwable th3) {
                    ik8VarMo2873e3.close();
                    throw th3;
                }
            case 6:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e4 = bk8Var5.mo2873e0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    ik8VarMo2873e4.mo2874C(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e4.mo2876a0()) {
                        arrayList.add(ik8VarMo2873e4.mo2875L(0));
                    }
                    ik8VarMo2873e4.close();
                    return arrayList;
                } catch (Throwable th4) {
                    ik8VarMo2873e4.close();
                    throw th4;
                }
            case 7:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ik8 ik8VarMo2873e5 = bk8Var6.mo2873e0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    ik8VarMo2873e5.mo2874C(1, str);
                    ik8VarMo2873e5.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e5.close();
                }
            case 8:
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                ik8 ik8VarMo2873e6 = bk8Var7.mo2873e0("SELECT * FROM workspec WHERE id=?");
                try {
                    ik8VarMo2873e6.mo2874C(1, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e6, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e6, "state");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e6, "worker_class_name");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e6, "input_merger_class_name");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e6, "input");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e6, "output");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e6, "initial_delay");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e6, "interval_duration");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e6, "flex_duration");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e6, "run_attempt_count");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e6, "backoff_policy");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e6, "backoff_delay_duration");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e6, "last_enqueue_time");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e6, "minimum_retention_duration");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e6, "schedule_requested_at");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e6, "run_in_foreground");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e6, "out_of_quota_policy");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e6, "period_count");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e6, "generation");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e6, "next_schedule_time_override");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e6, "next_schedule_time_override_generation");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e6, "stop_reason");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e6, "trace_tag");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e6, "backoff_on_system_interruptions");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e6, "required_network_type");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e6, "required_network_request");
                    int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e6, "requires_charging");
                    int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e6, "requires_device_idle");
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e6, "requires_battery_not_low");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e6, "requires_storage_not_low");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e6, "trigger_content_update_delay");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e6, "trigger_max_content_delay");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e6, "content_uri_triggers");
                    if (ik8VarMo2873e6.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e6.mo2875L(iM14108v);
                        WorkInfo$State workInfo$StateM3626h2 = bcd.m3626h((int) ik8VarMo2873e6.getLong(iM14108v2));
                        String strMo2875L2 = ik8VarMo2873e6.mo2875L(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e6.mo2875L(iM14108v4);
                        byte[] blob = ik8VarMo2873e6.getBlob(iM14108v5);
                        sz1 sz1Var = sz1.f61645b;
                        sz1 sz1VarM14366a = jad.m14366a(blob);
                        sz1 sz1VarM14366a2 = jad.m14366a(ik8VarMo2873e6.getBlob(iM14108v6));
                        long j = ik8VarMo2873e6.getLong(iM14108v7);
                        long j2 = ik8VarMo2873e6.getLong(iM14108v8);
                        long j3 = ik8VarMo2873e6.getLong(iM14108v9);
                        int i5 = (int) ik8VarMo2873e6.getLong(iM14108v10);
                        BackoffPolicy backoffPolicyM3623e = bcd.m3623e((int) ik8VarMo2873e6.getLong(iM14108v11));
                        long j4 = ik8VarMo2873e6.getLong(iM14108v12);
                        long j5 = ik8VarMo2873e6.getLong(iM14108v13);
                        long j6 = ik8VarMo2873e6.getLong(iM14108v14);
                        long j7 = ik8VarMo2873e6.getLong(iM14108v15);
                        boolean z = ((int) ik8VarMo2873e6.getLong(iM14108v16)) != 0;
                        OutOfQuotaPolicy outOfQuotaPolicyM3625g = bcd.m3625g((int) ik8VarMo2873e6.getLong(iM14108v17));
                        int i6 = (int) ik8VarMo2873e6.getLong(iM14108v18);
                        int i7 = (int) ik8VarMo2873e6.getLong(iM14108v19);
                        long j8 = ik8VarMo2873e6.getLong(iM14108v20);
                        int i8 = (int) ik8VarMo2873e6.getLong(iM14108v21);
                        int i9 = (int) ik8VarMo2873e6.getLong(iM14108v22);
                        String strMo2875L4 = ik8VarMo2873e6.isNull(iM14108v23) ? null : ik8VarMo2873e6.mo2875L(iM14108v23);
                        Integer numValueOf = ik8VarMo2873e6.isNull(iM14108v24) ? null : Integer.valueOf((int) ik8VarMo2873e6.getLong(iM14108v24));
                        p8bVar = new p8b(strMo2875L, workInfo$StateM3626h2, strMo2875L2, strMo2875L3, sz1VarM14366a, sz1VarM14366a2, j, j2, j3, new ak1(bcd.m3631m(ik8VarMo2873e6.getBlob(iM14108v26)), bcd.m3624f((int) ik8VarMo2873e6.getLong(iM14108v25)), ((int) ik8VarMo2873e6.getLong(iM14108v27)) != 0, ((int) ik8VarMo2873e6.getLong(iM14108v28)) != 0, ((int) ik8VarMo2873e6.getLong(iM14108v29)) != 0, ((int) ik8VarMo2873e6.getLong(iM14108v30)) != 0, ik8VarMo2873e6.getLong(iM14108v31), ik8VarMo2873e6.getLong(iM14108v32), bcd.m3621c(ik8VarMo2873e6.getBlob(iM14108v33))), i5, backoffPolicyM3623e, j4, j5, j6, j7, z, outOfQuotaPolicyM3625g, i6, i7, j8, i8, i9, strMo2875L4, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        p8bVar = null;
                    }
                    return p8bVar;
                } finally {
                    ik8VarMo2873e6.close();
                }
            case 9:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ik8 ik8VarMo2873e7 = bk8Var8.mo2873e0("SELECT state FROM workspec WHERE id=?");
                try {
                    ik8VarMo2873e7.mo2874C(1, str);
                    if (ik8VarMo2873e7.mo2876a0()) {
                        Integer numValueOf2 = ik8VarMo2873e7.isNull(0) ? null : Integer.valueOf((int) ik8VarMo2873e7.getLong(0));
                        if (numValueOf2 != null) {
                            workInfo$StateM3626h = bcd.m3626h(numValueOf2.intValue());
                        } else {
                            workInfo$StateM3626h = null;
                        }
                        break;
                    } else {
                        workInfo$StateM3626h = null;
                    }
                    return workInfo$StateM3626h;
                } finally {
                    ik8VarMo2873e7.close();
                }
            case 10:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                ik8 ik8VarMo2873e8 = bk8Var9.mo2873e0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    ik8VarMo2873e8.mo2874C(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e8.mo2876a0()) {
                        arrayList2.add(ik8VarMo2873e8.mo2875L(0));
                    }
                    ik8VarMo2873e8.close();
                    return arrayList2;
                } catch (Throwable th5) {
                    ik8VarMo2873e8.close();
                    throw th5;
                }
            case 11:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ik8 ik8VarMo2873e9 = bk8Var10.mo2873e0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    ik8VarMo2873e9.mo2874C(1, str);
                    ik8VarMo2873e9.mo2876a0();
                    return Integer.valueOf(AbstractC3489q9.m19787q(bk8Var10));
                } finally {
                    ik8VarMo2873e9.close();
                }
            case 12:
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                ik8 ik8VarMo2873e10 = bk8Var11.mo2873e0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    ik8VarMo2873e10.mo2874C(1, str);
                    ik8VarMo2873e10.mo2876a0();
                    return Integer.valueOf(AbstractC3489q9.m19787q(bk8Var11));
                } finally {
                    ik8VarMo2873e10.close();
                }
            case 13:
                bk8 bk8Var12 = (bk8) obj;
                bk8Var12.getClass();
                ik8 ik8VarMo2873e11 = bk8Var12.mo2873e0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    ik8VarMo2873e11.mo2874C(1, str);
                    ik8VarMo2873e11.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e11.close();
                }
            case 14:
                bk8 bk8Var13 = (bk8) obj;
                bk8Var13.getClass();
                ik8 ik8VarMo2873e12 = bk8Var13.mo2873e0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    ik8VarMo2873e12.mo2874C(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e12.mo2876a0()) {
                        byte[] blob2 = ik8VarMo2873e12.getBlob(0);
                        sz1 sz1Var2 = sz1.f61645b;
                        arrayList3.add(jad.m14366a(blob2));
                    }
                    ik8VarMo2873e12.close();
                    return arrayList3;
                } catch (Throwable th6) {
                    ik8VarMo2873e12.close();
                    throw th6;
                }
            case 15:
                bk8 bk8Var14 = (bk8) obj;
                bk8Var14.getClass();
                ik8 ik8VarMo2873e13 = bk8Var14.mo2873e0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    ik8VarMo2873e13.mo2874C(1, str);
                    ik8VarMo2873e13.mo2876a0();
                    return Integer.valueOf(AbstractC3489q9.m19787q(bk8Var14));
                } finally {
                    ik8VarMo2873e13.close();
                }
            case 16:
                bk8 bk8Var15 = (bk8) obj;
                bk8Var15.getClass();
                ik8 ik8VarMo2873e14 = bk8Var15.mo2873e0("DELETE FROM workspec WHERE id=?");
                try {
                    ik8VarMo2873e14.mo2874C(1, str);
                    ik8VarMo2873e14.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e14.close();
                }
            case 17:
                bk8 bk8Var16 = (bk8) obj;
                bk8Var16.getClass();
                ik8 ik8VarMo2873e15 = bk8Var16.mo2873e0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    ik8VarMo2873e15.mo2874C(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e15.mo2876a0()) {
                        String strMo2875L5 = ik8VarMo2873e15.mo2875L(0);
                        WorkInfo$State workInfo$StateM3626h3 = bcd.m3626h((int) ik8VarMo2873e15.getLong(1));
                        strMo2875L5.getClass();
                        workInfo$StateM3626h3.getClass();
                        n8b n8bVar = new n8b();
                        n8bVar.f52497a = strMo2875L5;
                        n8bVar.f52498b = workInfo$StateM3626h3;
                        arrayList4.add(n8bVar);
                    }
                    ik8VarMo2873e15.close();
                    return arrayList4;
                } catch (Throwable th7) {
                    ik8VarMo2873e15.close();
                    throw th7;
                }
            case 18:
                bk8 bk8Var17 = (bk8) obj;
                bk8Var17.getClass();
                ik8 ik8VarMo2873e16 = bk8Var17.mo2873e0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    ik8VarMo2873e16.mo2874C(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (ik8VarMo2873e16.mo2876a0()) {
                        arrayList5.add(ik8VarMo2873e16.mo2875L(0));
                    }
                    ik8VarMo2873e16.close();
                    return arrayList5;
                } catch (Throwable th8) {
                    ik8VarMo2873e16.close();
                    throw th8;
                }
            case 19:
                bk8 bk8Var18 = (bk8) obj;
                bk8Var18.getClass();
                ik8 ik8VarMo2873e17 = bk8Var18.mo2873e0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    ik8VarMo2873e17.mo2874C(1, str);
                    ik8VarMo2873e17.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e17.close();
                }
            default:
                WebView webView = (WebView) obj;
                webView.getClass();
                webView.loadUrl(str);
                return xfaVar;
        }
    }
}
