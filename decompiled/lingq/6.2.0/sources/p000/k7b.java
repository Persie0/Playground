package p000;

import com.lingq.core.database.entity.WordEntity;
import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k7b implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f46833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o7b f46834c;

    public /* synthetic */ k7b(String str, o7b o7bVar, int i) {
        this.f46832a = i;
        this.f46833b = str;
        this.f46834c = o7bVar;
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
        int i = this.f46832a;
        Object p7bVar = null;
        o7b o7bVar = this.f46834c;
        String str = this.f46833b;
        switch (i) {
            case 0:
                qn3 qn3Var = o7bVar.f53959M;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `termWithLanguage`, `term`, `id`, `status`, `importance`, `meanings`, `tags` FROM (SELECT * FROM WordEntity WHERE termWithLanguage = ?)");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    if (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(0);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(1);
                        int i2 = (int) ik8VarMo2873e0.getLong(2);
                        String strMo2875L3 = ik8VarMo2873e0.mo2875L(3);
                        int i3 = (int) ik8VarMo2873e0.getLong(4);
                        List listM20059N = qn3Var.m20059N(ik8VarMo2873e0.mo2875L(5));
                        List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(6) ? null : ik8VarMo2873e0.mo2875L(6));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        p7bVar = new p7b(strMo2875L2, strMo2875L, i2, i3, strMo2875L3, listM20058M, listM20059N);
                    }
                    ik8VarMo2873e0.close();
                    return p7bVar;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `termWithLanguage`, `term`, `id`, `status`, `importance`, `isPhrase`, `meanings`, `tags`, `gTags`, `romaji`, `hiragana`, `pinyin`, `hant`, `hans`, `jyutping` FROM (SELECT * FROM WordEntity WHERE termWithLanguage = ?)");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    if (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L4 = ik8VarMo2873e1.mo2875L(0);
                        String strMo2875L5 = ik8VarMo2873e1.mo2875L(1);
                        int i4 = (int) ik8VarMo2873e1.getLong(2);
                        String strMo2875L6 = ik8VarMo2873e1.mo2875L(3);
                        int i5 = (int) ik8VarMo2873e1.getLong(4);
                        boolean z = ((int) ik8VarMo2873e1.getLong(5)) != 0;
                        String strMo2875L7 = ik8VarMo2873e1.mo2875L(6);
                        qn3 qn3Var2 = o7bVar.f53959M;
                        List listM20059N2 = qn3Var2.m20059N(strMo2875L7);
                        List listM20058M2 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(7) ? null : ik8VarMo2873e1.mo2875L(7));
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M3 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(8) ? null : ik8VarMo2873e1.mo2875L(8));
                        if (listM20058M3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        p7bVar = new LessonWord(strMo2875L5, z, listM20058M2, listM20058M3, strMo2875L4, listM20059N2, i5, i4, strMo2875L6, qn3Var2.m20058M(ik8VarMo2873e1.isNull(9) ? null : ik8VarMo2873e1.mo2875L(9)), qn3Var2.m20058M(ik8VarMo2873e1.isNull(10) ? null : ik8VarMo2873e1.mo2875L(10)), qn3Var2.m20058M(ik8VarMo2873e1.isNull(11) ? null : ik8VarMo2873e1.mo2875L(11)), qn3Var2.m20058M(ik8VarMo2873e1.isNull(12) ? null : ik8VarMo2873e1.mo2875L(12)), qn3Var2.m20058M(ik8VarMo2873e1.isNull(13) ? null : ik8VarMo2873e1.mo2875L(13)), qn3Var2.m20058M(ik8VarMo2873e1.isNull(14) ? null : ik8VarMo2873e1.mo2875L(14)));
                    }
                    ik8VarMo2873e1.close();
                    return p7bVar;
                } catch (Throwable th2) {
                    ik8VarMo2873e1.close();
                    throw th2;
                }
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT * FROM WordEntity WHERE termWithLanguage = ?");
                try {
                    ik8VarMo2873e2.mo2874C(1, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e2, "termWithLanguage");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e2, "term");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e2, "id");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e2, "status");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e2, "importance");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isPhrase");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e2, "meanings");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e2, "tags");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e2, "gTags");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e2, "romaji");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hiragana");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e2, "pinyin");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hant");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hans");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e2, "jyutping");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e2, "cardId");
                    if (ik8VarMo2873e2.mo2876a0()) {
                        String strMo2875L8 = ik8VarMo2873e2.mo2875L(iM14108v);
                        String strMo2875L9 = ik8VarMo2873e2.mo2875L(iM14108v2);
                        int i6 = (int) ik8VarMo2873e2.getLong(iM14108v3);
                        String strMo2875L10 = ik8VarMo2873e2.isNull(iM14108v4) ? null : ik8VarMo2873e2.mo2875L(iM14108v4);
                        int i7 = (int) ik8VarMo2873e2.getLong(iM14108v5);
                        boolean z2 = ((int) ik8VarMo2873e2.getLong(iM14108v6)) != 0;
                        String strMo2875L11 = ik8VarMo2873e2.mo2875L(iM14108v7);
                        qn3 qn3Var3 = o7bVar.f53959M;
                        List listM20059N3 = qn3Var3.m20059N(strMo2875L11);
                        List listM20058M4 = qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v8) ? null : ik8VarMo2873e2.mo2875L(iM14108v8));
                        if (listM20058M4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M5 = qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v9) ? null : ik8VarMo2873e2.mo2875L(iM14108v9));
                        if (listM20058M5 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        p7bVar = new WordEntity(i6, i7, (int) ik8VarMo2873e2.getLong(iM14108v16), strMo2875L8, strMo2875L9, strMo2875L10, listM20059N3, listM20058M4, listM20058M5, qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v10) ? null : ik8VarMo2873e2.mo2875L(iM14108v10)), qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v11) ? null : ik8VarMo2873e2.mo2875L(iM14108v11)), qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v12) ? null : ik8VarMo2873e2.mo2875L(iM14108v12)), qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v13) ? null : ik8VarMo2873e2.mo2875L(iM14108v13)), qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v14) ? null : ik8VarMo2873e2.mo2875L(iM14108v14)), qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v15) ? null : ik8VarMo2873e2.mo2875L(iM14108v15)), z2);
                    }
                    ik8VarMo2873e2.close();
                    return p7bVar;
                } catch (Throwable th3) {
                    ik8VarMo2873e2.close();
                    throw th3;
                }
            default:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("SELECT `termWithLanguage`, `term`, `id`, `status`, `importance`, `isPhrase`, `meanings`, `tags`, `gTags`, `romaji`, `hiragana`, `pinyin`, `hant`, `hans`, `jyutping` FROM (SELECT * FROM WordEntity WHERE termWithLanguage = ?)");
                try {
                    ik8VarMo2873e3.mo2874C(1, str);
                    if (ik8VarMo2873e3.mo2876a0()) {
                        String strMo2875L12 = ik8VarMo2873e3.mo2875L(0);
                        String strMo2875L13 = ik8VarMo2873e3.mo2875L(1);
                        int i8 = (int) ik8VarMo2873e3.getLong(2);
                        String strMo2875L14 = ik8VarMo2873e3.mo2875L(3);
                        int i9 = (int) ik8VarMo2873e3.getLong(4);
                        boolean z3 = ((int) ik8VarMo2873e3.getLong(5)) != 0;
                        String strMo2875L15 = ik8VarMo2873e3.mo2875L(6);
                        qn3 qn3Var4 = o7bVar.f53959M;
                        List listM20059N4 = qn3Var4.m20059N(strMo2875L15);
                        List listM20058M6 = qn3Var4.m20058M(ik8VarMo2873e3.isNull(7) ? null : ik8VarMo2873e3.mo2875L(7));
                        if (listM20058M6 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M7 = qn3Var4.m20058M(ik8VarMo2873e3.isNull(8) ? null : ik8VarMo2873e3.mo2875L(8));
                        if (listM20058M7 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        p7bVar = new LessonWord(strMo2875L13, z3, listM20058M6, listM20058M7, strMo2875L12, listM20059N4, i9, i8, strMo2875L14, qn3Var4.m20058M(ik8VarMo2873e3.isNull(9) ? null : ik8VarMo2873e3.mo2875L(9)), qn3Var4.m20058M(ik8VarMo2873e3.isNull(10) ? null : ik8VarMo2873e3.mo2875L(10)), qn3Var4.m20058M(ik8VarMo2873e3.isNull(11) ? null : ik8VarMo2873e3.mo2875L(11)), qn3Var4.m20058M(ik8VarMo2873e3.isNull(12) ? null : ik8VarMo2873e3.mo2875L(12)), qn3Var4.m20058M(ik8VarMo2873e3.isNull(13) ? null : ik8VarMo2873e3.mo2875L(13)), qn3Var4.m20058M(ik8VarMo2873e3.isNull(14) ? null : ik8VarMo2873e3.mo2875L(14)));
                    }
                    ik8VarMo2873e3.close();
                    return p7bVar;
                } catch (Throwable th4) {
                    ik8VarMo2873e3.close();
                    throw th4;
                }
        }
    }
}
