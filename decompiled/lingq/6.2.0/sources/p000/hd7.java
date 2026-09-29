package p000;

import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.model.token.TokenCwt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hd7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f42223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f42224c;

    public /* synthetic */ hd7(int i, String str, int i2) {
        this.f42222a = i2;
        this.f42224c = i;
        this.f42223b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f42222a;
        Object bd7Var = null;
        xfa xfaVar = xfa.f68157a;
        String str = this.f42223b;
        int i2 = this.f42224c;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM PlaylistAndLessonsJoin WHERE `order` = ? AND nameWithLanguage = ? LIMIT 1");
                try {
                    ik8VarMo2873e0.mo2878j(1, i2);
                    ik8VarMo2873e0.mo2874C(2, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "nameWithLanguage");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "language");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "contentId");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "order");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isCourse");
                    if (ik8VarMo2873e0.mo2876a0()) {
                        bd7Var = new bd7((int) ik8VarMo2873e0.getLong(iM14108v3), ik8VarMo2873e0.isNull(iM14108v4) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v4)), ik8VarMo2873e0.mo2875L(iM14108v), ik8VarMo2873e0.mo2875L(iM14108v2), ((int) ik8VarMo2873e0.getLong(iM14108v5)) != 0);
                    }
                    return bd7Var;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (\n    SELECT PlaylistEntity.* FROM LessonsWithPlaylistJoin, PlaylistEntity \n    WHERE PlaylistEntity.pk =  LessonsWithPlaylistJoin.playlistId\n    AND PlaylistEntity.language = ? AND LessonsWithPlaylistJoin.contentId = ?)");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    ik8VarMo2873e1.mo2878j(2, i2);
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e1, "nameWithLanguage");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e1, "language");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e1, "name");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e1, "pk");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isDefault");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isFeatured");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        arrayList.add(new Playlist((int) ik8VarMo2873e1.getLong(iM14108v9), ik8VarMo2873e1.mo2875L(iM14108v6), ik8VarMo2873e1.mo2875L(iM14108v7), ik8VarMo2873e1.mo2875L(iM14108v8), ((int) ik8VarMo2873e1.getLong(iM14108v10)) != 0, ((int) ik8VarMo2873e1.getLong(iM14108v11)) != 0));
                    }
                    ik8VarMo2873e1.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e1.close();
                    throw th;
                }
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    ik8VarMo2873e2.mo2874C(1, str);
                    ik8VarMo2873e2.mo2878j(2, i2);
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e2, "work_spec_id");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e2, "generation");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e2, "system_id");
                    if (ik8VarMo2873e2.mo2876a0()) {
                        bd7Var = new rp9(ik8VarMo2873e2.mo2875L(iM14108v12), (int) ik8VarMo2873e2.getLong(iM14108v13), (int) ik8VarMo2873e2.getLong(iM14108v14));
                        break;
                    }
                    return bd7Var;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 3:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("SELECT `word`, `sentence`, `languageSrc`, `languageDst`, `translation`, `sentenceIndex`, `sentenceTokenIndex` FROM (SELECT * FROM TokenCwtEntity WHERE lessonId = ? AND languageDst = ?)");
                try {
                    ik8VarMo2873e3.mo2878j(1, i2);
                    ik8VarMo2873e3.mo2874C(2, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e3.mo2876a0()) {
                        arrayList2.add(new TokenCwt((int) ik8VarMo2873e3.getLong(5), (int) ik8VarMo2873e3.getLong(6), ik8VarMo2873e3.mo2875L(0), ik8VarMo2873e3.mo2875L(1), ik8VarMo2873e3.mo2875L(2), ik8VarMo2873e3.mo2875L(3), ik8VarMo2873e3.mo2875L(4)));
                    }
                    ik8VarMo2873e3.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    ik8VarMo2873e3.close();
                    throw th2;
                }
            case 4:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e4 = bk8Var5.mo2873e0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    ik8VarMo2873e4.mo2874C(1, str);
                    ik8VarMo2873e4.mo2878j(2, i2);
                    ik8VarMo2873e4.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e4.close();
                }
            default:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ik8 ik8VarMo2873e5 = bk8Var6.mo2873e0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    ik8VarMo2873e5.mo2878j(1, i2);
                    ik8VarMo2873e5.mo2874C(2, str);
                    ik8VarMo2873e5.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e5.close();
                }
        }
    }

    public /* synthetic */ hd7(String str, int i, int i2) {
        this.f42222a = i2;
        this.f42223b = str;
        this.f42224c = i;
    }
}
