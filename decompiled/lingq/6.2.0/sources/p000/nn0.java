package p000;

import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nn0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f52984b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ un0 f52985c;

    public /* synthetic */ nn0(String str, un0 un0Var, int i) {
        this.f52983a = i;
        this.f52984b = str;
        this.f52985c = un0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    private final Object m17502d(Object obj) throws Exception {
        String str = this.f52984b;
        un0 un0Var = this.f52985c;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM CardEntity WHERE termWithLanguage = ?");
        try {
            ik8VarMo2873e0.mo2874C(1, str);
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
            Object lessonCard = null;
            if (ik8VarMo2873e0.mo2876a0()) {
                String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v2);
                int i = (int) ik8VarMo2873e0.getLong(iM14108v3);
                String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v5) ? null : ik8VarMo2873e0.mo2875L(iM14108v5);
                int i2 = (int) ik8VarMo2873e0.getLong(iM14108v6);
                Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v7) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v7));
                String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                String strMo2875L8 = ik8VarMo2873e0.isNull(iM14108v11) ? null : ik8VarMo2873e0.mo2875L(iM14108v11);
                int i3 = (int) ik8VarMo2873e0.getLong(iM14108v12);
                String strMo2875L9 = ik8VarMo2873e0.mo2875L(iM14108v13);
                qn3 qn3Var = un0Var.f64104N;
                List listM20059N = qn3Var.m20059N(strMo2875L9);
                String strMo2875L10 = ik8VarMo2873e0.isNull(iM14108v14) ? null : ik8VarMo2873e0.mo2875L(iM14108v14);
                List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v15) ? null : ik8VarMo2873e0.mo2875L(iM14108v15));
                if (listM20058M == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v16) ? null : ik8VarMo2873e0.mo2875L(iM14108v16));
                if (listM20058M2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v17) ? null : ik8VarMo2873e0.mo2875L(iM14108v17));
                lessonCard = new LessonCard(i3, i, i2, numValueOf, strMo2875L, strMo2875L2, strMo2875L4, strMo2875L3, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L10, ik8VarMo2873e0.isNull(iM14108v18) ? null : ik8VarMo2873e0.mo2875L(iM14108v18), ik8VarMo2873e0.isNull(iM14108v19) ? null : ik8VarMo2873e0.mo2875L(iM14108v19), ik8VarMo2873e0.isNull(iM14108v20) ? null : ik8VarMo2873e0.mo2875L(iM14108v20), ik8VarMo2873e0.isNull(iM14108v21) ? null : ik8VarMo2873e0.mo2875L(iM14108v21), ik8VarMo2873e0.isNull(iM14108v22) ? null : ik8VarMo2873e0.mo2875L(iM14108v22), ik8VarMo2873e0.isNull(iM14108v23) ? null : ik8VarMo2873e0.mo2875L(iM14108v23), ik8VarMo2873e0.isNull(iM14108v24) ? null : ik8VarMo2873e0.mo2875L(iM14108v24), ik8VarMo2873e0.isNull(iM14108v25) ? null : ik8VarMo2873e0.mo2875L(iM14108v25), ik8VarMo2873e0.isNull(iM14108v26) ? null : ik8VarMo2873e0.mo2875L(iM14108v26), ik8VarMo2873e0.isNull(iM14108v28) ? null : ik8VarMo2873e0.mo2875L(iM14108v28), listM20058M, listM20058M2, listM20059N, listM20058M3, ((int) ik8VarMo2873e0.getLong(iM14108v27)) != 0);
            }
            ik8VarMo2873e0.close();
            return lessonCard;
        } catch (Throwable th) {
            ik8VarMo2873e0.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f52983a;
        Object cardEntity = null;
        un0 un0Var = this.f52985c;
        String str = this.f52984b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM CardEntity WHERE termWithLanguage = ?");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
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
                    if (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v2);
                        int i2 = (int) ik8VarMo2873e0.getLong(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                        String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v5) ? null : ik8VarMo2873e0.mo2875L(iM14108v5);
                        int i3 = (int) ik8VarMo2873e0.getLong(iM14108v6);
                        Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v7) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v7));
                        String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                        String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                        String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                        String strMo2875L8 = ik8VarMo2873e0.isNull(iM14108v11) ? null : ik8VarMo2873e0.mo2875L(iM14108v11);
                        int i4 = (int) ik8VarMo2873e0.getLong(iM14108v12);
                        String strMo2875L9 = ik8VarMo2873e0.mo2875L(iM14108v13);
                        qn3 qn3Var = un0Var.f64104N;
                        List listM20059N = qn3Var.m20059N(strMo2875L9);
                        String strMo2875L10 = ik8VarMo2873e0.mo2875L(iM14108v14);
                        List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v15) ? null : ik8VarMo2873e0.mo2875L(iM14108v15));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v16) ? null : ik8VarMo2873e0.mo2875L(iM14108v16));
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v17) ? null : ik8VarMo2873e0.mo2875L(iM14108v17));
                        if (listM20058M3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        cardEntity = new CardEntity(i2, i3, i4, numValueOf, strMo2875L, strMo2875L2, strMo2875L3, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L10, ik8VarMo2873e0.isNull(iM14108v18) ? null : ik8VarMo2873e0.mo2875L(iM14108v18), ik8VarMo2873e0.isNull(iM14108v19) ? null : ik8VarMo2873e0.mo2875L(iM14108v19), ik8VarMo2873e0.isNull(iM14108v20) ? null : ik8VarMo2873e0.mo2875L(iM14108v20), ik8VarMo2873e0.isNull(iM14108v21) ? null : ik8VarMo2873e0.mo2875L(iM14108v21), ik8VarMo2873e0.isNull(iM14108v22) ? null : ik8VarMo2873e0.mo2875L(iM14108v22), ik8VarMo2873e0.isNull(iM14108v23) ? null : ik8VarMo2873e0.mo2875L(iM14108v23), ik8VarMo2873e0.isNull(iM14108v24) ? null : ik8VarMo2873e0.mo2875L(iM14108v24), ik8VarMo2873e0.isNull(iM14108v25) ? null : ik8VarMo2873e0.mo2875L(iM14108v25), ik8VarMo2873e0.isNull(iM14108v26) ? null : ik8VarMo2873e0.mo2875L(iM14108v26), ik8VarMo2873e0.isNull(iM14108v28) ? null : ik8VarMo2873e0.mo2875L(iM14108v28), listM20059N, listM20058M, listM20058M2, listM20058M3, ((int) ik8VarMo2873e0.getLong(iM14108v27)) != 0);
                    }
                    ik8VarMo2873e0.close();
                    return cardEntity;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `termWithLanguage`, `id`, `status`, `extendedStatus`, `srsDueDate`, `notes`, `meanings`, `meaningTerms`, `tags`, `gTags` FROM (SELECT * FROM CardEntity WHERE termWithLanguage = ?)");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    if (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L11 = ik8VarMo2873e1.mo2875L(0);
                        int i5 = (int) ik8VarMo2873e1.getLong(1);
                        int i6 = (int) ik8VarMo2873e1.getLong(2);
                        Integer numValueOf2 = ik8VarMo2873e1.isNull(3) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(3));
                        String strMo2875L12 = ik8VarMo2873e1.isNull(4) ? null : ik8VarMo2873e1.mo2875L(4);
                        String strMo2875L13 = ik8VarMo2873e1.isNull(5) ? null : ik8VarMo2873e1.mo2875L(5);
                        String strMo2875L14 = ik8VarMo2873e1.mo2875L(6);
                        qn3 qn3Var2 = un0Var.f64104N;
                        List listM20059N2 = qn3Var2.m20059N(strMo2875L14);
                        String strMo2875L15 = ik8VarMo2873e1.isNull(7) ? null : ik8VarMo2873e1.mo2875L(7);
                        List listM20058M4 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(8) ? null : ik8VarMo2873e1.mo2875L(8));
                        if (listM20058M4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M5 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(9) ? null : ik8VarMo2873e1.mo2875L(9));
                        if (listM20058M5 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        cardEntity = new wn0(i5, strMo2875L11, i6, numValueOf2, listM20058M4, listM20058M5, strMo2875L13, listM20059N2, strMo2875L15, strMo2875L12);
                    }
                    ik8VarMo2873e1.close();
                    return cardEntity;
                } catch (Throwable th2) {
                    ik8VarMo2873e1.close();
                    throw th2;
                }
            case 2:
                return m17502d(obj);
            default:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT * FROM CardEntity WHERE termWithLanguage = ?");
                try {
                    ik8VarMo2873e2.mo2874C(1, str);
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e2, "term");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e2, "termWithLanguage");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e2, "id");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e2, "url");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e2, "fragment");
                    int iM14108v34 = AbstractC3122is.m14108v(ik8VarMo2873e2, "status");
                    int iM14108v35 = AbstractC3122is.m14108v(ik8VarMo2873e2, "extendedStatus");
                    int iM14108v36 = AbstractC3122is.m14108v(ik8VarMo2873e2, "lastReviewedCorrect");
                    int iM14108v37 = AbstractC3122is.m14108v(ik8VarMo2873e2, "srsDueDate");
                    int iM14108v38 = AbstractC3122is.m14108v(ik8VarMo2873e2, "notes");
                    int iM14108v39 = AbstractC3122is.m14108v(ik8VarMo2873e2, "audio");
                    int iM14108v40 = AbstractC3122is.m14108v(ik8VarMo2873e2, "importance");
                    int iM14108v41 = AbstractC3122is.m14108v(ik8VarMo2873e2, "meanings");
                    int iM14108v42 = AbstractC3122is.m14108v(ik8VarMo2873e2, "meaningTerms");
                    int iM14108v43 = AbstractC3122is.m14108v(ik8VarMo2873e2, "tags");
                    int iM14108v44 = AbstractC3122is.m14108v(ik8VarMo2873e2, "gTags");
                    int iM14108v45 = AbstractC3122is.m14108v(ik8VarMo2873e2, "words");
                    int iM14108v46 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hiragana");
                    int iM14108v47 = AbstractC3122is.m14108v(ik8VarMo2873e2, "romaji");
                    int iM14108v48 = AbstractC3122is.m14108v(ik8VarMo2873e2, "pinyin");
                    int iM14108v49 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hant");
                    int iM14108v50 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hans");
                    int iM14108v51 = AbstractC3122is.m14108v(ik8VarMo2873e2, "jyutping");
                    int iM14108v52 = AbstractC3122is.m14108v(ik8VarMo2873e2, "chunk");
                    int iM14108v53 = AbstractC3122is.m14108v(ik8VarMo2873e2, "furigana");
                    int iM14108v54 = AbstractC3122is.m14108v(ik8VarMo2873e2, "latin");
                    int iM14108v55 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isPhrase");
                    int iM14108v56 = AbstractC3122is.m14108v(ik8VarMo2873e2, "creationDate");
                    if (ik8VarMo2873e2.mo2876a0()) {
                        String strMo2875L16 = ik8VarMo2873e2.mo2875L(iM14108v29);
                        String strMo2875L17 = ik8VarMo2873e2.mo2875L(iM14108v30);
                        int i7 = (int) ik8VarMo2873e2.getLong(iM14108v31);
                        String strMo2875L18 = ik8VarMo2873e2.isNull(iM14108v32) ? null : ik8VarMo2873e2.mo2875L(iM14108v32);
                        String strMo2875L19 = ik8VarMo2873e2.isNull(iM14108v33) ? null : ik8VarMo2873e2.mo2875L(iM14108v33);
                        int i8 = (int) ik8VarMo2873e2.getLong(iM14108v34);
                        Integer numValueOf3 = ik8VarMo2873e2.isNull(iM14108v35) ? null : Integer.valueOf((int) ik8VarMo2873e2.getLong(iM14108v35));
                        String strMo2875L20 = ik8VarMo2873e2.isNull(iM14108v36) ? null : ik8VarMo2873e2.mo2875L(iM14108v36);
                        String strMo2875L21 = ik8VarMo2873e2.isNull(iM14108v37) ? null : ik8VarMo2873e2.mo2875L(iM14108v37);
                        String strMo2875L22 = ik8VarMo2873e2.isNull(iM14108v38) ? null : ik8VarMo2873e2.mo2875L(iM14108v38);
                        String strMo2875L23 = ik8VarMo2873e2.isNull(iM14108v39) ? null : ik8VarMo2873e2.mo2875L(iM14108v39);
                        int i9 = (int) ik8VarMo2873e2.getLong(iM14108v40);
                        String strMo2875L24 = ik8VarMo2873e2.mo2875L(iM14108v41);
                        qn3 qn3Var3 = un0Var.f64104N;
                        List listM20059N3 = qn3Var3.m20059N(strMo2875L24);
                        String strMo2875L25 = ik8VarMo2873e2.isNull(iM14108v42) ? null : ik8VarMo2873e2.mo2875L(iM14108v42);
                        List listM20058M6 = qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v43) ? null : ik8VarMo2873e2.mo2875L(iM14108v43));
                        if (listM20058M6 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M7 = qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v44) ? null : ik8VarMo2873e2.mo2875L(iM14108v44));
                        if (listM20058M7 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M8 = qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v45) ? null : ik8VarMo2873e2.mo2875L(iM14108v45));
                        cardEntity = new LessonCard(i9, i7, i8, numValueOf3, strMo2875L16, strMo2875L17, strMo2875L19, strMo2875L18, strMo2875L20, strMo2875L21, strMo2875L22, strMo2875L23, strMo2875L25, ik8VarMo2873e2.isNull(iM14108v46) ? null : ik8VarMo2873e2.mo2875L(iM14108v46), ik8VarMo2873e2.isNull(iM14108v47) ? null : ik8VarMo2873e2.mo2875L(iM14108v47), ik8VarMo2873e2.isNull(iM14108v48) ? null : ik8VarMo2873e2.mo2875L(iM14108v48), ik8VarMo2873e2.isNull(iM14108v49) ? null : ik8VarMo2873e2.mo2875L(iM14108v49), ik8VarMo2873e2.isNull(iM14108v50) ? null : ik8VarMo2873e2.mo2875L(iM14108v50), ik8VarMo2873e2.isNull(iM14108v51) ? null : ik8VarMo2873e2.mo2875L(iM14108v51), ik8VarMo2873e2.isNull(iM14108v52) ? null : ik8VarMo2873e2.mo2875L(iM14108v52), ik8VarMo2873e2.isNull(iM14108v53) ? null : ik8VarMo2873e2.mo2875L(iM14108v53), ik8VarMo2873e2.isNull(iM14108v54) ? null : ik8VarMo2873e2.mo2875L(iM14108v54), ik8VarMo2873e2.isNull(iM14108v56) ? null : ik8VarMo2873e2.mo2875L(iM14108v56), listM20058M6, listM20058M7, listM20059N3, listM20058M8, ((int) ik8VarMo2873e2.getLong(iM14108v55)) != 0);
                    }
                    ik8VarMo2873e2.close();
                    return cardEntity;
                } catch (Throwable th3) {
                    ik8VarMo2873e2.close();
                    throw th3;
                }
        }
    }
}
